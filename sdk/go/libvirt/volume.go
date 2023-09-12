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

// Manages a storage volume in libvirt. For more information see
// [the official documentation](https://libvirt.org/formatstorage.html).
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-libvirt/sdk/go/libvirt"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			opensuseLeap, err := libvirt.NewVolume(ctx, "opensuseLeap", &libvirt.VolumeArgs{
//				Source: pulumi.String("http://download.opensuse.org/repositories/Cloud:/Images:/Leap_42.1/images/openSUSE-Leap-42.1-OpenStack.x86_64.qcow2"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = libvirt.NewVolume(ctx, "master", &libvirt.VolumeArgs{
//				BaseVolumeId: opensuseLeap.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			var worker []*libvirt.Volume
//			for index := 0; index < _var.Workers_count; index++ {
//				key0 := index
//				_ := index
//				__res, err := libvirt.NewVolume(ctx, fmt.Sprintf("worker-%v", key0), &libvirt.VolumeArgs{
//					BaseVolumeId: opensuseLeap.ID(),
//				})
//				if err != nil {
//					return err
//				}
//				worker = append(worker, __res)
//			}
//			return nil
//		})
//	}
//
// ```
//
// > **Tip:** when provisioning multiple domains using the same base image, create
// a `Volume` for the base image and then define the domain specific ones
// as based on it. This way the image will not be modified and no extra disk space
// is going to be used for the base image.
type Volume struct {
	pulumi.CustomResourceState

	// The backing volume (CoW) to use for this volume.
	BaseVolumeId pulumi.StringPtrOutput `pulumi:"baseVolumeId"`
	// The name of the backing volume (CoW) to use
	// for this volume. Note well: when `baseVolumePool` is not specified the
	// volume is going to be searched inside of `pool`.
	BaseVolumeName pulumi.StringPtrOutput `pulumi:"baseVolumeName"`
	// The name of the storage pool containing the
	// volume defined by `baseVolumeName`.
	BaseVolumePool pulumi.StringPtrOutput `pulumi:"baseVolumePool"`
	Format         pulumi.StringOutput    `pulumi:"format"`
	// A unique name for the resource, required by libvirt.
	// Changing this forces a new resource to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// The storage pool where the resource will be created.
	// If not given, the `default` storage pool will be used.
	Pool   pulumi.StringPtrOutput `pulumi:"pool"`
	Size   pulumi.IntOutput       `pulumi:"size"`
	Source pulumi.StringPtrOutput `pulumi:"source"`
	Xml    VolumeXmlPtrOutput     `pulumi:"xml"`
}

// NewVolume registers a new resource with the given unique name, arguments, and options.
func NewVolume(ctx *pulumi.Context,
	name string, args *VolumeArgs, opts ...pulumi.ResourceOption) (*Volume, error) {
	if args == nil {
		args = &VolumeArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Volume
	err := ctx.RegisterResource("libvirt:index/volume:Volume", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetVolume gets an existing Volume resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetVolume(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *VolumeState, opts ...pulumi.ResourceOption) (*Volume, error) {
	var resource Volume
	err := ctx.ReadResource("libvirt:index/volume:Volume", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Volume resources.
type volumeState struct {
	// The backing volume (CoW) to use for this volume.
	BaseVolumeId *string `pulumi:"baseVolumeId"`
	// The name of the backing volume (CoW) to use
	// for this volume. Note well: when `baseVolumePool` is not specified the
	// volume is going to be searched inside of `pool`.
	BaseVolumeName *string `pulumi:"baseVolumeName"`
	// The name of the storage pool containing the
	// volume defined by `baseVolumeName`.
	BaseVolumePool *string `pulumi:"baseVolumePool"`
	Format         *string `pulumi:"format"`
	// A unique name for the resource, required by libvirt.
	// Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// The storage pool where the resource will be created.
	// If not given, the `default` storage pool will be used.
	Pool   *string    `pulumi:"pool"`
	Size   *int       `pulumi:"size"`
	Source *string    `pulumi:"source"`
	Xml    *VolumeXml `pulumi:"xml"`
}

type VolumeState struct {
	// The backing volume (CoW) to use for this volume.
	BaseVolumeId pulumi.StringPtrInput
	// The name of the backing volume (CoW) to use
	// for this volume. Note well: when `baseVolumePool` is not specified the
	// volume is going to be searched inside of `pool`.
	BaseVolumeName pulumi.StringPtrInput
	// The name of the storage pool containing the
	// volume defined by `baseVolumeName`.
	BaseVolumePool pulumi.StringPtrInput
	Format         pulumi.StringPtrInput
	// A unique name for the resource, required by libvirt.
	// Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// The storage pool where the resource will be created.
	// If not given, the `default` storage pool will be used.
	Pool   pulumi.StringPtrInput
	Size   pulumi.IntPtrInput
	Source pulumi.StringPtrInput
	Xml    VolumeXmlPtrInput
}

func (VolumeState) ElementType() reflect.Type {
	return reflect.TypeOf((*volumeState)(nil)).Elem()
}

type volumeArgs struct {
	// The backing volume (CoW) to use for this volume.
	BaseVolumeId *string `pulumi:"baseVolumeId"`
	// The name of the backing volume (CoW) to use
	// for this volume. Note well: when `baseVolumePool` is not specified the
	// volume is going to be searched inside of `pool`.
	BaseVolumeName *string `pulumi:"baseVolumeName"`
	// The name of the storage pool containing the
	// volume defined by `baseVolumeName`.
	BaseVolumePool *string `pulumi:"baseVolumePool"`
	Format         *string `pulumi:"format"`
	// A unique name for the resource, required by libvirt.
	// Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// The storage pool where the resource will be created.
	// If not given, the `default` storage pool will be used.
	Pool   *string    `pulumi:"pool"`
	Size   *int       `pulumi:"size"`
	Source *string    `pulumi:"source"`
	Xml    *VolumeXml `pulumi:"xml"`
}

// The set of arguments for constructing a Volume resource.
type VolumeArgs struct {
	// The backing volume (CoW) to use for this volume.
	BaseVolumeId pulumi.StringPtrInput
	// The name of the backing volume (CoW) to use
	// for this volume. Note well: when `baseVolumePool` is not specified the
	// volume is going to be searched inside of `pool`.
	BaseVolumeName pulumi.StringPtrInput
	// The name of the storage pool containing the
	// volume defined by `baseVolumeName`.
	BaseVolumePool pulumi.StringPtrInput
	Format         pulumi.StringPtrInput
	// A unique name for the resource, required by libvirt.
	// Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// The storage pool where the resource will be created.
	// If not given, the `default` storage pool will be used.
	Pool   pulumi.StringPtrInput
	Size   pulumi.IntPtrInput
	Source pulumi.StringPtrInput
	Xml    VolumeXmlPtrInput
}

func (VolumeArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*volumeArgs)(nil)).Elem()
}

type VolumeInput interface {
	pulumi.Input

	ToVolumeOutput() VolumeOutput
	ToVolumeOutputWithContext(ctx context.Context) VolumeOutput
}

func (*Volume) ElementType() reflect.Type {
	return reflect.TypeOf((**Volume)(nil)).Elem()
}

func (i *Volume) ToVolumeOutput() VolumeOutput {
	return i.ToVolumeOutputWithContext(context.Background())
}

func (i *Volume) ToVolumeOutputWithContext(ctx context.Context) VolumeOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VolumeOutput)
}

func (i *Volume) ToOutput(ctx context.Context) pulumix.Output[*Volume] {
	return pulumix.Output[*Volume]{
		OutputState: i.ToVolumeOutputWithContext(ctx).OutputState,
	}
}

// VolumeArrayInput is an input type that accepts VolumeArray and VolumeArrayOutput values.
// You can construct a concrete instance of `VolumeArrayInput` via:
//
//	VolumeArray{ VolumeArgs{...} }
type VolumeArrayInput interface {
	pulumi.Input

	ToVolumeArrayOutput() VolumeArrayOutput
	ToVolumeArrayOutputWithContext(context.Context) VolumeArrayOutput
}

type VolumeArray []VolumeInput

func (VolumeArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Volume)(nil)).Elem()
}

func (i VolumeArray) ToVolumeArrayOutput() VolumeArrayOutput {
	return i.ToVolumeArrayOutputWithContext(context.Background())
}

func (i VolumeArray) ToVolumeArrayOutputWithContext(ctx context.Context) VolumeArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VolumeArrayOutput)
}

func (i VolumeArray) ToOutput(ctx context.Context) pulumix.Output[[]*Volume] {
	return pulumix.Output[[]*Volume]{
		OutputState: i.ToVolumeArrayOutputWithContext(ctx).OutputState,
	}
}

// VolumeMapInput is an input type that accepts VolumeMap and VolumeMapOutput values.
// You can construct a concrete instance of `VolumeMapInput` via:
//
//	VolumeMap{ "key": VolumeArgs{...} }
type VolumeMapInput interface {
	pulumi.Input

	ToVolumeMapOutput() VolumeMapOutput
	ToVolumeMapOutputWithContext(context.Context) VolumeMapOutput
}

type VolumeMap map[string]VolumeInput

func (VolumeMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Volume)(nil)).Elem()
}

func (i VolumeMap) ToVolumeMapOutput() VolumeMapOutput {
	return i.ToVolumeMapOutputWithContext(context.Background())
}

func (i VolumeMap) ToVolumeMapOutputWithContext(ctx context.Context) VolumeMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VolumeMapOutput)
}

func (i VolumeMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*Volume] {
	return pulumix.Output[map[string]*Volume]{
		OutputState: i.ToVolumeMapOutputWithContext(ctx).OutputState,
	}
}

type VolumeOutput struct{ *pulumi.OutputState }

func (VolumeOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Volume)(nil)).Elem()
}

func (o VolumeOutput) ToVolumeOutput() VolumeOutput {
	return o
}

func (o VolumeOutput) ToVolumeOutputWithContext(ctx context.Context) VolumeOutput {
	return o
}

func (o VolumeOutput) ToOutput(ctx context.Context) pulumix.Output[*Volume] {
	return pulumix.Output[*Volume]{
		OutputState: o.OutputState,
	}
}

// The backing volume (CoW) to use for this volume.
func (o VolumeOutput) BaseVolumeId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Volume) pulumi.StringPtrOutput { return v.BaseVolumeId }).(pulumi.StringPtrOutput)
}

// The name of the backing volume (CoW) to use
// for this volume. Note well: when `baseVolumePool` is not specified the
// volume is going to be searched inside of `pool`.
func (o VolumeOutput) BaseVolumeName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Volume) pulumi.StringPtrOutput { return v.BaseVolumeName }).(pulumi.StringPtrOutput)
}

// The name of the storage pool containing the
// volume defined by `baseVolumeName`.
func (o VolumeOutput) BaseVolumePool() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Volume) pulumi.StringPtrOutput { return v.BaseVolumePool }).(pulumi.StringPtrOutput)
}

func (o VolumeOutput) Format() pulumi.StringOutput {
	return o.ApplyT(func(v *Volume) pulumi.StringOutput { return v.Format }).(pulumi.StringOutput)
}

// A unique name for the resource, required by libvirt.
// Changing this forces a new resource to be created.
func (o VolumeOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Volume) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The storage pool where the resource will be created.
// If not given, the `default` storage pool will be used.
func (o VolumeOutput) Pool() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Volume) pulumi.StringPtrOutput { return v.Pool }).(pulumi.StringPtrOutput)
}

func (o VolumeOutput) Size() pulumi.IntOutput {
	return o.ApplyT(func(v *Volume) pulumi.IntOutput { return v.Size }).(pulumi.IntOutput)
}

func (o VolumeOutput) Source() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Volume) pulumi.StringPtrOutput { return v.Source }).(pulumi.StringPtrOutput)
}

func (o VolumeOutput) Xml() VolumeXmlPtrOutput {
	return o.ApplyT(func(v *Volume) VolumeXmlPtrOutput { return v.Xml }).(VolumeXmlPtrOutput)
}

type VolumeArrayOutput struct{ *pulumi.OutputState }

func (VolumeArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Volume)(nil)).Elem()
}

func (o VolumeArrayOutput) ToVolumeArrayOutput() VolumeArrayOutput {
	return o
}

func (o VolumeArrayOutput) ToVolumeArrayOutputWithContext(ctx context.Context) VolumeArrayOutput {
	return o
}

func (o VolumeArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*Volume] {
	return pulumix.Output[[]*Volume]{
		OutputState: o.OutputState,
	}
}

func (o VolumeArrayOutput) Index(i pulumi.IntInput) VolumeOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Volume {
		return vs[0].([]*Volume)[vs[1].(int)]
	}).(VolumeOutput)
}

type VolumeMapOutput struct{ *pulumi.OutputState }

func (VolumeMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Volume)(nil)).Elem()
}

func (o VolumeMapOutput) ToVolumeMapOutput() VolumeMapOutput {
	return o
}

func (o VolumeMapOutput) ToVolumeMapOutputWithContext(ctx context.Context) VolumeMapOutput {
	return o
}

func (o VolumeMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*Volume] {
	return pulumix.Output[map[string]*Volume]{
		OutputState: o.OutputState,
	}
}

func (o VolumeMapOutput) MapIndex(k pulumi.StringInput) VolumeOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Volume {
		return vs[0].(map[string]*Volume)[vs[1].(string)]
	}).(VolumeOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*VolumeInput)(nil)).Elem(), &Volume{})
	pulumi.RegisterInputType(reflect.TypeOf((*VolumeArrayInput)(nil)).Elem(), VolumeArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*VolumeMapInput)(nil)).Elem(), VolumeMap{})
	pulumi.RegisterOutputType(VolumeOutput{})
	pulumi.RegisterOutputType(VolumeArrayOutput{})
	pulumi.RegisterOutputType(VolumeMapOutput{})
}
