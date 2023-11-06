// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package libvirt

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-libvirt/sdk/go/libvirt/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func GetNetworkDnsSrvTemplate(ctx *pulumi.Context, args *GetNetworkDnsSrvTemplateArgs, opts ...pulumi.InvokeOption) (*GetNetworkDnsSrvTemplateResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetNetworkDnsSrvTemplateResult
	err := ctx.Invoke("libvirt:index/getNetworkDnsSrvTemplate:getNetworkDnsSrvTemplate", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getNetworkDnsSrvTemplate.
type GetNetworkDnsSrvTemplateArgs struct {
	Domain   *string `pulumi:"domain"`
	Port     *string `pulumi:"port"`
	Priority *string `pulumi:"priority"`
	Protocol string  `pulumi:"protocol"`
	Service  string  `pulumi:"service"`
	Target   *string `pulumi:"target"`
	Weight   *string `pulumi:"weight"`
}

// A collection of values returned by getNetworkDnsSrvTemplate.
type GetNetworkDnsSrvTemplateResult struct {
	Domain *string `pulumi:"domain"`
	// The provider-assigned unique ID for this managed resource.
	Id       string                 `pulumi:"id"`
	Port     *string                `pulumi:"port"`
	Priority *string                `pulumi:"priority"`
	Protocol string                 `pulumi:"protocol"`
	Rendered map[string]interface{} `pulumi:"rendered"`
	Service  string                 `pulumi:"service"`
	Target   *string                `pulumi:"target"`
	Weight   *string                `pulumi:"weight"`
}

func GetNetworkDnsSrvTemplateOutput(ctx *pulumi.Context, args GetNetworkDnsSrvTemplateOutputArgs, opts ...pulumi.InvokeOption) GetNetworkDnsSrvTemplateResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetNetworkDnsSrvTemplateResult, error) {
			args := v.(GetNetworkDnsSrvTemplateArgs)
			r, err := GetNetworkDnsSrvTemplate(ctx, &args, opts...)
			var s GetNetworkDnsSrvTemplateResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetNetworkDnsSrvTemplateResultOutput)
}

// A collection of arguments for invoking getNetworkDnsSrvTemplate.
type GetNetworkDnsSrvTemplateOutputArgs struct {
	Domain   pulumi.StringPtrInput `pulumi:"domain"`
	Port     pulumi.StringPtrInput `pulumi:"port"`
	Priority pulumi.StringPtrInput `pulumi:"priority"`
	Protocol pulumi.StringInput    `pulumi:"protocol"`
	Service  pulumi.StringInput    `pulumi:"service"`
	Target   pulumi.StringPtrInput `pulumi:"target"`
	Weight   pulumi.StringPtrInput `pulumi:"weight"`
}

func (GetNetworkDnsSrvTemplateOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetNetworkDnsSrvTemplateArgs)(nil)).Elem()
}

// A collection of values returned by getNetworkDnsSrvTemplate.
type GetNetworkDnsSrvTemplateResultOutput struct{ *pulumi.OutputState }

func (GetNetworkDnsSrvTemplateResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetNetworkDnsSrvTemplateResult)(nil)).Elem()
}

func (o GetNetworkDnsSrvTemplateResultOutput) ToGetNetworkDnsSrvTemplateResultOutput() GetNetworkDnsSrvTemplateResultOutput {
	return o
}

func (o GetNetworkDnsSrvTemplateResultOutput) ToGetNetworkDnsSrvTemplateResultOutputWithContext(ctx context.Context) GetNetworkDnsSrvTemplateResultOutput {
	return o
}

func (o GetNetworkDnsSrvTemplateResultOutput) Domain() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetNetworkDnsSrvTemplateResult) *string { return v.Domain }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetNetworkDnsSrvTemplateResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetNetworkDnsSrvTemplateResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetNetworkDnsSrvTemplateResultOutput) Port() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetNetworkDnsSrvTemplateResult) *string { return v.Port }).(pulumi.StringPtrOutput)
}

func (o GetNetworkDnsSrvTemplateResultOutput) Priority() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetNetworkDnsSrvTemplateResult) *string { return v.Priority }).(pulumi.StringPtrOutput)
}

func (o GetNetworkDnsSrvTemplateResultOutput) Protocol() pulumi.StringOutput {
	return o.ApplyT(func(v GetNetworkDnsSrvTemplateResult) string { return v.Protocol }).(pulumi.StringOutput)
}

func (o GetNetworkDnsSrvTemplateResultOutput) Rendered() pulumi.MapOutput {
	return o.ApplyT(func(v GetNetworkDnsSrvTemplateResult) map[string]interface{} { return v.Rendered }).(pulumi.MapOutput)
}

func (o GetNetworkDnsSrvTemplateResultOutput) Service() pulumi.StringOutput {
	return o.ApplyT(func(v GetNetworkDnsSrvTemplateResult) string { return v.Service }).(pulumi.StringOutput)
}

func (o GetNetworkDnsSrvTemplateResultOutput) Target() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetNetworkDnsSrvTemplateResult) *string { return v.Target }).(pulumi.StringPtrOutput)
}

func (o GetNetworkDnsSrvTemplateResultOutput) Weight() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetNetworkDnsSrvTemplateResult) *string { return v.Weight }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetNetworkDnsSrvTemplateResultOutput{})
}
