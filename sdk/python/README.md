[![Actions Status](https://github.com/pulumi/pulumi-libvirt/workflows/master/badge.svg)](https://github.com/pulumi/pulumi-libvirt/actions)
[![Slack](http://www.pulumi.com/images/docs/badges/slack.svg)](https://slack.pulumi.com)
[![NPM version](https://badge.fury.io/js/%40pulumi%2Flibvirt.svg)](https://www.npmjs.com/package/@pulumi/libvirt)
[![Python version](https://badge.fury.io/py/pulumi-libvirt.svg)](https://pypi.org/project/pulumi-libvirt)
[![NuGet version](https://badge.fury.io/nu/pulumi.libvirt.svg)](https://badge.fury.io/nu/pulumi.libvirt)
[![PkgGoDev](https://pkg.go.dev/badge/github.com/pulumi/pulumi-libvirt/sdk/go)](https://pkg.go.dev/github.com/pulumi/pulumi-libvirt/sdk/go)
[![License](https://img.shields.io/npm/l/%40pulumi%2Fpulumi.svg)](https://github.com/pulumi/pulumi-libvirt/blob/master/LICENSE)

# libvirt Resource Provider

The libvirt Resource Provider lets you manage libvirt resources.


>[!NOTE] As of v0.5.4, this provider is DEPRECATED and will no longer be maintained by Pulumi.
> We recommend using the [Local Provider](https://www.pulumi.com/blog/any-terraform-provider/) version of this package,
> which can be generated from the Libvirt Terraform provider as follows:
> `pulumi package add terraform-provider registry.opentofu.org/dmacvicar/libvirt <version>`
> and follow the instructions.

## Migration

The currently equivalent upstream version to pulumi-libvirt@v0.5.4 is search.opentofu.org/provider/macvicar/libvirt v0.8.1.
We recommend that you migrate between these versions of each provider.
To perform the migration of existing Libvirt resources, we recommend running `pulumi import` in a fresh stack
which uses the local provider package.

## Reference

For further information, please visit [the libvirt provider docs](https://www.pulumi.com/docs/intro/cloud-providers/libvirt)
or for detailed reference documentation, please visit [the API docs](https://www.pulumi.com/docs/reference/pkg/libvirt).