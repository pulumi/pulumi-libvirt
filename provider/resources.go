// Copyright 2016-2018, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package libvirt

import (
	"bytes"
	"fmt"
	"path/filepath"
	"regexp"
	"unicode"

	// embed is used to store bridge-metadata.json in the compiled binary
	_ "embed"

	"github.com/dmacvicar/terraform-provider-libvirt/libvirt"

	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	tfbridgetokens "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge/tokens"
	shim "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v2"
	"github.com/pulumi/pulumi/sdk/v3/go/common/tokens"

	"github.com/pulumi/pulumi-libvirt/provider/pkg/version"
)

// all of the token components used below.
const (
	// packages:
	mainPkg = "libvirt"
	// modules:
	mainMod = "index" // the y module
)

// makeMember manufactures a type token for the package and the given module and type.
func makeMember(mod string, mem string) tokens.ModuleMember {
	return tokens.ModuleMember(mainPkg + ":" + mod + ":" + mem)
}

// makeType manufactures a type token for the package and the given module and type.
func makeType(mod string, typ string) tokens.Type {
	return tokens.Type(makeMember(mod, typ))
}

// makeDataSource manufactures a standard resource token given a module and resource name.  It
// automatically uses the main package and names the file by simply lower casing the data source's
// first character.
func makeDataSource(mod string, res string) tokens.ModuleMember {
	fn := string(unicode.ToLower(rune(res[0]))) + res[1:]
	return makeMember(mod+"/"+fn, res)
}

// makeResource manufactures a standard resource token given a module and resource name.  It
// automatically uses the main package and names the file by simply lower casing the resource's
// first character.
func makeResource(mod string, res string) tokens.Type {
	fn := string(unicode.ToLower(rune(res[0]))) + res[1:]
	return makeType(mod+"/"+fn, res)
}

func Provider() tfbridge.ProviderInfo {
	p := shim.NewProvider(libvirt.Provider())

	prov := tfbridge.ProviderInfo{
		P:           p,
		Name:        "libvirt",
		Description: "A Pulumi package for creating and managing libvirt cloud resources.",
		Keywords:    []string{"pulumi", "libvirt"},
		License:     "Apache-2.0",
		Homepage:    "https://pulumi.io",
		Repository:  "https://github.com/pulumi/pulumi-libvirt",
		GitHubOrg:   "dmacvicar",
		DocRules:    &tfbridge.DocRuleInfo{EditRules: docRuleEdits},
		Config: map[string]*tfbridge.SchemaInfo{
			"uri": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"LIBVIRT_DEFAULT_URI"},
				},
			},
		},
		Resources: map[string]*tfbridge.ResourceInfo{
			"libvirt_cloudinit_disk": {
				Tok: makeResource(mainMod, "CloudInitDisk"),
				Docs: &tfbridge.DocInfo{
					Source: "cloudinit.html.markdown",
				},
			},
			"libvirt_domain": {Tok: makeResource(mainMod, "Domain")},
			"libvirt_ignition": {
				Tok: makeResource(mainMod, "Ignition"),
				Docs: &tfbridge.DocInfo{
					Source: "coreos_ignition.html.markdown",
				},
			},
			"libvirt_network": {Tok: makeResource(mainMod, "Network")},
			"libvirt_pool":    {Tok: makeResource(mainMod, "Pool")},
			"libvirt_volume":  {Tok: makeResource(mainMod, "Volume")},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			"libvirt_network_dns_host_template": {
				Tok: makeDataSource(mainMod, "getNetworkDnsHostTemplate"),
				Docs: &tfbridge.DocInfo{
					Markdown: []byte(" "),
				},
			},
			"libvirt_network_dns_srv_template": {
				Tok: makeDataSource(mainMod, "getNetworkDnsSrvTemplate"),
				Docs: &tfbridge.DocInfo{
					Markdown: []byte(" "),
				},
			},
			"libvirt_network_dnsmasq_options_template": {
				Tok: makeDataSource(mainMod, "getNetworkDnsmasqOptionsTemplate"),
				Docs: &tfbridge.DocInfo{
					Markdown: []byte(" "),
				},
			},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			Dependencies: map[string]string{
				"@pulumi/pulumi": "^3.0.0",
			},
			DevDependencies: map[string]string{
				"@types/node": "^10.0.0", // so we can access strongly typed node definitions.
				"@types/mime": "^2.0.0",
			},
			RespectSchemaVersion: true,
		},
		Python: (func() *tfbridge.PythonInfo {
			i := &tfbridge.PythonInfo{
				RespectSchemaVersion: true,

				Requires: map[string]string{
					"pulumi": ">=3.0.0,<4.0.0",
				},
			}
			i.PyProject.Enabled = true
			return i
		})(),

		Golang: &tfbridge.GolangInfo{
			ImportBasePath: filepath.Join(
				fmt.Sprintf("github.com/pulumi/pulumi-%[1]s/sdk/", mainPkg),
				tfbridge.GetModuleMajorVersion(version.Version),
				"go",
				mainPkg,
			),
			GenerateResourceContainerTypes: true,
			RespectSchemaVersion:           true,
		},
		CSharp: &tfbridge.CSharpInfo{
			RespectSchemaVersion: true,
			PackageReferences: map[string]string{
				"Pulumi": "3.*",
			},
		}, MetadataInfo: tfbridge.NewProviderMetadata(metadata),
	}
	prov.MustComputeTokens(tfbridgetokens.SingleModule("libvirt_", mainMod,
		tfbridgetokens.MakeStandard(mainPkg)))
	prov.MustApplyAutoAliases()

	prov.SetAutonaming(255, "-")

	return prov
}

//go:embed cmd/pulumi-resource-libvirt/bridge-metadata.json
var metadata []byte

var networkModesRegexp = regexp.MustCompile("- `[a-z]*`: ")

func docRuleEdits(defaults []tfbridge.DocsEdit) []tfbridge.DocsEdit {
	return append(defaults, tfbridge.DocsEdit{
		Path: "network.markdown",
		Edit: func(_ string, content []byte) ([]byte, error) {
			return networkModesRegexp.ReplaceAllFunc(content,
				func(src []byte) []byte {
					return bytes.ReplaceAll(src,
						[]byte("`"), []byte(`"`))
				}), nil
		},
	})
}
