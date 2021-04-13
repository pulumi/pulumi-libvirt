// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package libvirt

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

type CloudInitDisk struct {
	pulumi.CustomResourceState

	// cloud-init user data.
	MetaData pulumi.StringPtrOutput `pulumi:"metaData"`
	// A unique name for the resource, required by libvirt.
	Name pulumi.StringOutput `pulumi:"name"`
	// cloud-init network-config data.
	NetworkConfig pulumi.StringPtrOutput `pulumi:"networkConfig"`
	// The pool where the resource will be created.
	// If not given, the `default` pool will be used.
	// For user_data, networkConfig and metaData parameters have a look at upstream doc:
	// http://cloudinit.readthedocs.io/en/latest/topics/datasources/nocloud.html#datasource-nocloud
	Pool pulumi.StringPtrOutput `pulumi:"pool"`
	// cloud-init user data.
	UserData pulumi.StringPtrOutput `pulumi:"userData"`
}

// NewCloudInitDisk registers a new resource with the given unique name, arguments, and options.
func NewCloudInitDisk(ctx *pulumi.Context,
	name string, args *CloudInitDiskArgs, opts ...pulumi.ResourceOption) (*CloudInitDisk, error) {
	if args == nil {
		args = &CloudInitDiskArgs{}
	}

	var resource CloudInitDisk
	err := ctx.RegisterResource("libvirt:index/cloudInitDisk:CloudInitDisk", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCloudInitDisk gets an existing CloudInitDisk resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCloudInitDisk(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CloudInitDiskState, opts ...pulumi.ResourceOption) (*CloudInitDisk, error) {
	var resource CloudInitDisk
	err := ctx.ReadResource("libvirt:index/cloudInitDisk:CloudInitDisk", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CloudInitDisk resources.
type cloudInitDiskState struct {
	// cloud-init user data.
	MetaData *string `pulumi:"metaData"`
	// A unique name for the resource, required by libvirt.
	Name *string `pulumi:"name"`
	// cloud-init network-config data.
	NetworkConfig *string `pulumi:"networkConfig"`
	// The pool where the resource will be created.
	// If not given, the `default` pool will be used.
	// For user_data, networkConfig and metaData parameters have a look at upstream doc:
	// http://cloudinit.readthedocs.io/en/latest/topics/datasources/nocloud.html#datasource-nocloud
	Pool *string `pulumi:"pool"`
	// cloud-init user data.
	UserData *string `pulumi:"userData"`
}

type CloudInitDiskState struct {
	// cloud-init user data.
	MetaData pulumi.StringPtrInput
	// A unique name for the resource, required by libvirt.
	Name pulumi.StringPtrInput
	// cloud-init network-config data.
	NetworkConfig pulumi.StringPtrInput
	// The pool where the resource will be created.
	// If not given, the `default` pool will be used.
	// For user_data, networkConfig and metaData parameters have a look at upstream doc:
	// http://cloudinit.readthedocs.io/en/latest/topics/datasources/nocloud.html#datasource-nocloud
	Pool pulumi.StringPtrInput
	// cloud-init user data.
	UserData pulumi.StringPtrInput
}

func (CloudInitDiskState) ElementType() reflect.Type {
	return reflect.TypeOf((*cloudInitDiskState)(nil)).Elem()
}

type cloudInitDiskArgs struct {
	// cloud-init user data.
	MetaData *string `pulumi:"metaData"`
	// A unique name for the resource, required by libvirt.
	Name *string `pulumi:"name"`
	// cloud-init network-config data.
	NetworkConfig *string `pulumi:"networkConfig"`
	// The pool where the resource will be created.
	// If not given, the `default` pool will be used.
	// For user_data, networkConfig and metaData parameters have a look at upstream doc:
	// http://cloudinit.readthedocs.io/en/latest/topics/datasources/nocloud.html#datasource-nocloud
	Pool *string `pulumi:"pool"`
	// cloud-init user data.
	UserData *string `pulumi:"userData"`
}

// The set of arguments for constructing a CloudInitDisk resource.
type CloudInitDiskArgs struct {
	// cloud-init user data.
	MetaData pulumi.StringPtrInput
	// A unique name for the resource, required by libvirt.
	Name pulumi.StringPtrInput
	// cloud-init network-config data.
	NetworkConfig pulumi.StringPtrInput
	// The pool where the resource will be created.
	// If not given, the `default` pool will be used.
	// For user_data, networkConfig and metaData parameters have a look at upstream doc:
	// http://cloudinit.readthedocs.io/en/latest/topics/datasources/nocloud.html#datasource-nocloud
	Pool pulumi.StringPtrInput
	// cloud-init user data.
	UserData pulumi.StringPtrInput
}

func (CloudInitDiskArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*cloudInitDiskArgs)(nil)).Elem()
}

type CloudInitDiskInput interface {
	pulumi.Input

	ToCloudInitDiskOutput() CloudInitDiskOutput
	ToCloudInitDiskOutputWithContext(ctx context.Context) CloudInitDiskOutput
}

func (*CloudInitDisk) ElementType() reflect.Type {
	return reflect.TypeOf((*CloudInitDisk)(nil))
}

func (i *CloudInitDisk) ToCloudInitDiskOutput() CloudInitDiskOutput {
	return i.ToCloudInitDiskOutputWithContext(context.Background())
}

func (i *CloudInitDisk) ToCloudInitDiskOutputWithContext(ctx context.Context) CloudInitDiskOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CloudInitDiskOutput)
}

func (i *CloudInitDisk) ToCloudInitDiskPtrOutput() CloudInitDiskPtrOutput {
	return i.ToCloudInitDiskPtrOutputWithContext(context.Background())
}

func (i *CloudInitDisk) ToCloudInitDiskPtrOutputWithContext(ctx context.Context) CloudInitDiskPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CloudInitDiskPtrOutput)
}

type CloudInitDiskPtrInput interface {
	pulumi.Input

	ToCloudInitDiskPtrOutput() CloudInitDiskPtrOutput
	ToCloudInitDiskPtrOutputWithContext(ctx context.Context) CloudInitDiskPtrOutput
}

type cloudInitDiskPtrType CloudInitDiskArgs

func (*cloudInitDiskPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**CloudInitDisk)(nil))
}

func (i *cloudInitDiskPtrType) ToCloudInitDiskPtrOutput() CloudInitDiskPtrOutput {
	return i.ToCloudInitDiskPtrOutputWithContext(context.Background())
}

func (i *cloudInitDiskPtrType) ToCloudInitDiskPtrOutputWithContext(ctx context.Context) CloudInitDiskPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CloudInitDiskPtrOutput)
}

// CloudInitDiskArrayInput is an input type that accepts CloudInitDiskArray and CloudInitDiskArrayOutput values.
// You can construct a concrete instance of `CloudInitDiskArrayInput` via:
//
//          CloudInitDiskArray{ CloudInitDiskArgs{...} }
type CloudInitDiskArrayInput interface {
	pulumi.Input

	ToCloudInitDiskArrayOutput() CloudInitDiskArrayOutput
	ToCloudInitDiskArrayOutputWithContext(context.Context) CloudInitDiskArrayOutput
}

type CloudInitDiskArray []CloudInitDiskInput

func (CloudInitDiskArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*CloudInitDisk)(nil))
}

func (i CloudInitDiskArray) ToCloudInitDiskArrayOutput() CloudInitDiskArrayOutput {
	return i.ToCloudInitDiskArrayOutputWithContext(context.Background())
}

func (i CloudInitDiskArray) ToCloudInitDiskArrayOutputWithContext(ctx context.Context) CloudInitDiskArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CloudInitDiskArrayOutput)
}

// CloudInitDiskMapInput is an input type that accepts CloudInitDiskMap and CloudInitDiskMapOutput values.
// You can construct a concrete instance of `CloudInitDiskMapInput` via:
//
//          CloudInitDiskMap{ "key": CloudInitDiskArgs{...} }
type CloudInitDiskMapInput interface {
	pulumi.Input

	ToCloudInitDiskMapOutput() CloudInitDiskMapOutput
	ToCloudInitDiskMapOutputWithContext(context.Context) CloudInitDiskMapOutput
}

type CloudInitDiskMap map[string]CloudInitDiskInput

func (CloudInitDiskMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*CloudInitDisk)(nil))
}

func (i CloudInitDiskMap) ToCloudInitDiskMapOutput() CloudInitDiskMapOutput {
	return i.ToCloudInitDiskMapOutputWithContext(context.Background())
}

func (i CloudInitDiskMap) ToCloudInitDiskMapOutputWithContext(ctx context.Context) CloudInitDiskMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CloudInitDiskMapOutput)
}

type CloudInitDiskOutput struct {
	*pulumi.OutputState
}

func (CloudInitDiskOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*CloudInitDisk)(nil))
}

func (o CloudInitDiskOutput) ToCloudInitDiskOutput() CloudInitDiskOutput {
	return o
}

func (o CloudInitDiskOutput) ToCloudInitDiskOutputWithContext(ctx context.Context) CloudInitDiskOutput {
	return o
}

func (o CloudInitDiskOutput) ToCloudInitDiskPtrOutput() CloudInitDiskPtrOutput {
	return o.ToCloudInitDiskPtrOutputWithContext(context.Background())
}

func (o CloudInitDiskOutput) ToCloudInitDiskPtrOutputWithContext(ctx context.Context) CloudInitDiskPtrOutput {
	return o.ApplyT(func(v CloudInitDisk) *CloudInitDisk {
		return &v
	}).(CloudInitDiskPtrOutput)
}

type CloudInitDiskPtrOutput struct {
	*pulumi.OutputState
}

func (CloudInitDiskPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CloudInitDisk)(nil))
}

func (o CloudInitDiskPtrOutput) ToCloudInitDiskPtrOutput() CloudInitDiskPtrOutput {
	return o
}

func (o CloudInitDiskPtrOutput) ToCloudInitDiskPtrOutputWithContext(ctx context.Context) CloudInitDiskPtrOutput {
	return o
}

type CloudInitDiskArrayOutput struct{ *pulumi.OutputState }

func (CloudInitDiskArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]CloudInitDisk)(nil))
}

func (o CloudInitDiskArrayOutput) ToCloudInitDiskArrayOutput() CloudInitDiskArrayOutput {
	return o
}

func (o CloudInitDiskArrayOutput) ToCloudInitDiskArrayOutputWithContext(ctx context.Context) CloudInitDiskArrayOutput {
	return o
}

func (o CloudInitDiskArrayOutput) Index(i pulumi.IntInput) CloudInitDiskOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) CloudInitDisk {
		return vs[0].([]CloudInitDisk)[vs[1].(int)]
	}).(CloudInitDiskOutput)
}

type CloudInitDiskMapOutput struct{ *pulumi.OutputState }

func (CloudInitDiskMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]CloudInitDisk)(nil))
}

func (o CloudInitDiskMapOutput) ToCloudInitDiskMapOutput() CloudInitDiskMapOutput {
	return o
}

func (o CloudInitDiskMapOutput) ToCloudInitDiskMapOutputWithContext(ctx context.Context) CloudInitDiskMapOutput {
	return o
}

func (o CloudInitDiskMapOutput) MapIndex(k pulumi.StringInput) CloudInitDiskOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) CloudInitDisk {
		return vs[0].(map[string]CloudInitDisk)[vs[1].(string)]
	}).(CloudInitDiskOutput)
}

func init() {
	pulumi.RegisterOutputType(CloudInitDiskOutput{})
	pulumi.RegisterOutputType(CloudInitDiskPtrOutput{})
	pulumi.RegisterOutputType(CloudInitDiskArrayOutput{})
	pulumi.RegisterOutputType(CloudInitDiskMapOutput{})
}