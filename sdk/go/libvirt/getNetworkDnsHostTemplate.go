// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package libvirt

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-libvirt/sdk/go/libvirt/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

func GetNetworkDnsHostTemplate(ctx *pulumi.Context, args *GetNetworkDnsHostTemplateArgs, opts ...pulumi.InvokeOption) (*GetNetworkDnsHostTemplateResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetNetworkDnsHostTemplateResult
	err := ctx.Invoke("libvirt:index/getNetworkDnsHostTemplate:getNetworkDnsHostTemplate", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getNetworkDnsHostTemplate.
type GetNetworkDnsHostTemplateArgs struct {
	Hostname string `pulumi:"hostname"`
	Ip       string `pulumi:"ip"`
}

// A collection of values returned by getNetworkDnsHostTemplate.
type GetNetworkDnsHostTemplateResult struct {
	Hostname string `pulumi:"hostname"`
	// The provider-assigned unique ID for this managed resource.
	Id       string            `pulumi:"id"`
	Ip       string            `pulumi:"ip"`
	Rendered map[string]string `pulumi:"rendered"`
}

func GetNetworkDnsHostTemplateOutput(ctx *pulumi.Context, args GetNetworkDnsHostTemplateOutputArgs, opts ...pulumi.InvokeOption) GetNetworkDnsHostTemplateResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetNetworkDnsHostTemplateResult, error) {
			args := v.(GetNetworkDnsHostTemplateArgs)
			r, err := GetNetworkDnsHostTemplate(ctx, &args, opts...)
			var s GetNetworkDnsHostTemplateResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetNetworkDnsHostTemplateResultOutput)
}

// A collection of arguments for invoking getNetworkDnsHostTemplate.
type GetNetworkDnsHostTemplateOutputArgs struct {
	Hostname pulumi.StringInput `pulumi:"hostname"`
	Ip       pulumi.StringInput `pulumi:"ip"`
}

func (GetNetworkDnsHostTemplateOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetNetworkDnsHostTemplateArgs)(nil)).Elem()
}

// A collection of values returned by getNetworkDnsHostTemplate.
type GetNetworkDnsHostTemplateResultOutput struct{ *pulumi.OutputState }

func (GetNetworkDnsHostTemplateResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetNetworkDnsHostTemplateResult)(nil)).Elem()
}

func (o GetNetworkDnsHostTemplateResultOutput) ToGetNetworkDnsHostTemplateResultOutput() GetNetworkDnsHostTemplateResultOutput {
	return o
}

func (o GetNetworkDnsHostTemplateResultOutput) ToGetNetworkDnsHostTemplateResultOutputWithContext(ctx context.Context) GetNetworkDnsHostTemplateResultOutput {
	return o
}

func (o GetNetworkDnsHostTemplateResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetNetworkDnsHostTemplateResult] {
	return pulumix.Output[GetNetworkDnsHostTemplateResult]{
		OutputState: o.OutputState,
	}
}

func (o GetNetworkDnsHostTemplateResultOutput) Hostname() pulumi.StringOutput {
	return o.ApplyT(func(v GetNetworkDnsHostTemplateResult) string { return v.Hostname }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetNetworkDnsHostTemplateResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetNetworkDnsHostTemplateResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetNetworkDnsHostTemplateResultOutput) Ip() pulumi.StringOutput {
	return o.ApplyT(func(v GetNetworkDnsHostTemplateResult) string { return v.Ip }).(pulumi.StringOutput)
}

func (o GetNetworkDnsHostTemplateResultOutput) Rendered() pulumi.StringMapOutput {
	return o.ApplyT(func(v GetNetworkDnsHostTemplateResult) map[string]string { return v.Rendered }).(pulumi.StringMapOutput)
}

func init() {
	pulumi.RegisterOutputType(GetNetworkDnsHostTemplateResultOutput{})
}
