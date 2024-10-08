// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package libvirt

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-libvirt/sdk/go/libvirt/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type Combustion struct {
	pulumi.CustomResourceState

	Content pulumi.StringOutput    `pulumi:"content"`
	Name    pulumi.StringOutput    `pulumi:"name"`
	Pool    pulumi.StringPtrOutput `pulumi:"pool"`
}

// NewCombustion registers a new resource with the given unique name, arguments, and options.
func NewCombustion(ctx *pulumi.Context,
	name string, args *CombustionArgs, opts ...pulumi.ResourceOption) (*Combustion, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Content == nil {
		return nil, errors.New("invalid value for required argument 'Content'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Combustion
	err := ctx.RegisterResource("libvirt:index/combustion:Combustion", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCombustion gets an existing Combustion resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCombustion(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CombustionState, opts ...pulumi.ResourceOption) (*Combustion, error) {
	var resource Combustion
	err := ctx.ReadResource("libvirt:index/combustion:Combustion", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Combustion resources.
type combustionState struct {
	Content *string `pulumi:"content"`
	Name    *string `pulumi:"name"`
	Pool    *string `pulumi:"pool"`
}

type CombustionState struct {
	Content pulumi.StringPtrInput
	Name    pulumi.StringPtrInput
	Pool    pulumi.StringPtrInput
}

func (CombustionState) ElementType() reflect.Type {
	return reflect.TypeOf((*combustionState)(nil)).Elem()
}

type combustionArgs struct {
	Content string  `pulumi:"content"`
	Name    *string `pulumi:"name"`
	Pool    *string `pulumi:"pool"`
}

// The set of arguments for constructing a Combustion resource.
type CombustionArgs struct {
	Content pulumi.StringInput
	Name    pulumi.StringPtrInput
	Pool    pulumi.StringPtrInput
}

func (CombustionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*combustionArgs)(nil)).Elem()
}

type CombustionInput interface {
	pulumi.Input

	ToCombustionOutput() CombustionOutput
	ToCombustionOutputWithContext(ctx context.Context) CombustionOutput
}

func (*Combustion) ElementType() reflect.Type {
	return reflect.TypeOf((**Combustion)(nil)).Elem()
}

func (i *Combustion) ToCombustionOutput() CombustionOutput {
	return i.ToCombustionOutputWithContext(context.Background())
}

func (i *Combustion) ToCombustionOutputWithContext(ctx context.Context) CombustionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CombustionOutput)
}

// CombustionArrayInput is an input type that accepts CombustionArray and CombustionArrayOutput values.
// You can construct a concrete instance of `CombustionArrayInput` via:
//
//	CombustionArray{ CombustionArgs{...} }
type CombustionArrayInput interface {
	pulumi.Input

	ToCombustionArrayOutput() CombustionArrayOutput
	ToCombustionArrayOutputWithContext(context.Context) CombustionArrayOutput
}

type CombustionArray []CombustionInput

func (CombustionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Combustion)(nil)).Elem()
}

func (i CombustionArray) ToCombustionArrayOutput() CombustionArrayOutput {
	return i.ToCombustionArrayOutputWithContext(context.Background())
}

func (i CombustionArray) ToCombustionArrayOutputWithContext(ctx context.Context) CombustionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CombustionArrayOutput)
}

// CombustionMapInput is an input type that accepts CombustionMap and CombustionMapOutput values.
// You can construct a concrete instance of `CombustionMapInput` via:
//
//	CombustionMap{ "key": CombustionArgs{...} }
type CombustionMapInput interface {
	pulumi.Input

	ToCombustionMapOutput() CombustionMapOutput
	ToCombustionMapOutputWithContext(context.Context) CombustionMapOutput
}

type CombustionMap map[string]CombustionInput

func (CombustionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Combustion)(nil)).Elem()
}

func (i CombustionMap) ToCombustionMapOutput() CombustionMapOutput {
	return i.ToCombustionMapOutputWithContext(context.Background())
}

func (i CombustionMap) ToCombustionMapOutputWithContext(ctx context.Context) CombustionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CombustionMapOutput)
}

type CombustionOutput struct{ *pulumi.OutputState }

func (CombustionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Combustion)(nil)).Elem()
}

func (o CombustionOutput) ToCombustionOutput() CombustionOutput {
	return o
}

func (o CombustionOutput) ToCombustionOutputWithContext(ctx context.Context) CombustionOutput {
	return o
}

func (o CombustionOutput) Content() pulumi.StringOutput {
	return o.ApplyT(func(v *Combustion) pulumi.StringOutput { return v.Content }).(pulumi.StringOutput)
}

func (o CombustionOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Combustion) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

func (o CombustionOutput) Pool() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Combustion) pulumi.StringPtrOutput { return v.Pool }).(pulumi.StringPtrOutput)
}

type CombustionArrayOutput struct{ *pulumi.OutputState }

func (CombustionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Combustion)(nil)).Elem()
}

func (o CombustionArrayOutput) ToCombustionArrayOutput() CombustionArrayOutput {
	return o
}

func (o CombustionArrayOutput) ToCombustionArrayOutputWithContext(ctx context.Context) CombustionArrayOutput {
	return o
}

func (o CombustionArrayOutput) Index(i pulumi.IntInput) CombustionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Combustion {
		return vs[0].([]*Combustion)[vs[1].(int)]
	}).(CombustionOutput)
}

type CombustionMapOutput struct{ *pulumi.OutputState }

func (CombustionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Combustion)(nil)).Elem()
}

func (o CombustionMapOutput) ToCombustionMapOutput() CombustionMapOutput {
	return o
}

func (o CombustionMapOutput) ToCombustionMapOutputWithContext(ctx context.Context) CombustionMapOutput {
	return o
}

func (o CombustionMapOutput) MapIndex(k pulumi.StringInput) CombustionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Combustion {
		return vs[0].(map[string]*Combustion)[vs[1].(string)]
	}).(CombustionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CombustionInput)(nil)).Elem(), &Combustion{})
	pulumi.RegisterInputType(reflect.TypeOf((*CombustionArrayInput)(nil)).Elem(), CombustionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CombustionMapInput)(nil)).Elem(), CombustionMap{})
	pulumi.RegisterOutputType(CombustionOutput{})
	pulumi.RegisterOutputType(CombustionArrayOutput{})
	pulumi.RegisterOutputType(CombustionMapOutput{})
}
