module github.com/pulumi/pulumi-libvirt/provider

go 1.16

replace github.com/hashicorp/go-getter => github.com/hashicorp/go-getter v1.4.0

require (
	github.com/dmacvicar/terraform-provider-libvirt v0.6.12
	github.com/hashicorp/terraform-plugin-sdk v1.9.1
	github.com/pulumi/pulumi-terraform-bridge/v3 v3.11.0
	github.com/pulumi/pulumi/sdk/v3 v3.17.0
)
