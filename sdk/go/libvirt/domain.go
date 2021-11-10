// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package libvirt

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a VM domain resource within libvirt. For more information see
// [the official documentation](https://libvirt.org/formatdomain.html).
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-libvirt/sdk/go/libvirt"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := libvirt.NewDomain(ctx, "_default", nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
type Domain struct {
	pulumi.CustomResourceState

	// The architecture for the VM (probably x8664 or i686),
	// you normally won't need to set this unless you are building a special VM
	Arch pulumi.StringOutput `pulumi:"arch"`
	// Set to `true` to start the domain on host boot up.
	// If not specified `false` is assumed.
	Autostart pulumi.BoolPtrOutput `pulumi:"autostart"`
	// A list of devices (dev) which defines boot order. Example
	// below.
	BootDevices DomainBootDeviceArrayOutput `pulumi:"bootDevices"`
	// The `CloudInitDisk` disk that has to be used by
	// the domain. This is going to be attached as a CDROM ISO. Changing the
	// cloud-init won't cause the domain to be recreated, however the change will
	// have effect on the next reboot.
	Cloudinit pulumi.StringPtrOutput `pulumi:"cloudinit"`
	// Arguments to the kernel
	Cmdlines pulumi.MapArrayOutput    `pulumi:"cmdlines"`
	Consoles DomainConsoleArrayOutput `pulumi:"consoles"`
	// The
	// [Ignition](https://www.terraform.io/docs/providers/libvirt/r/coreos_ignition.html) resource
	// that is to be used by the CoreOS domain.
	CoreosIgnition pulumi.StringPtrOutput `pulumi:"coreosIgnition"`
	// Configures CPU mode. See below for more
	// details.
	Cpu DomainCpuPtrOutput `pulumi:"cpu"`
	// The description for domain.
	// Changing this forces a new resource to be created.
	// This data is not used by libvirt in any way, it can contain any information the user wants.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// An array of one or more disks to attach to the domain. The
	// `disk` object structure is documented below.
	Disks DomainDiskArrayOutput `pulumi:"disks"`
	// The path of the emulator to use
	Emulator pulumi.StringOutput `pulumi:"emulator"`
	// An array of one or more host filesystems to attach to
	// the domain. The `filesystem` object structure is documented
	// below.
	Filesystems DomainFilesystemArrayOutput `pulumi:"filesystems"`
	// The UEFI rom images for exercising UEFI secure boot in a qemu
	// environment. Users should usually specify one of the standard _Open Virtual Machine
	// Firmware_ (_OVMF_) images available for their distributions. The file will be opened
	// read-only.
	Firmware pulumi.StringPtrOutput `pulumi:"firmware"`
	// The name of the firmware config path where ignition file is stored: default is `opt/com.coreos/config`. If you are using [Flatcar Linux](https://docs.flatcar-linux.org/os/booting-with-libvirt/#creating-the-domain-xml), the value is `opt/org.flatcar-linux/config`.
	FwCfgName pulumi.StringPtrOutput  `pulumi:"fwCfgName"`
	Graphics  DomainGraphicsPtrOutput `pulumi:"graphics"`
	// The path of the initrd to boot.
	Initrd pulumi.StringPtrOutput `pulumi:"initrd"`
	// The path of the kernel to boot
	Kernel pulumi.StringPtrOutput `pulumi:"kernel"`
	// The machine type,
	// you normally won't need to set this unless you are running on a platform that
	// defaults to the wrong machine type for your template
	Machine pulumi.StringOutput `pulumi:"machine"`
	// The amount of memory in MiB. If not specified the domain
	// will be created with 512 MiB of memory be used.
	Memory   pulumi.IntPtrOutput    `pulumi:"memory"`
	Metadata pulumi.StringPtrOutput `pulumi:"metadata"`
	// A unique name for the resource, required by libvirt.
	// Changing this forces a new resource to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// An array of one or more network interfaces to
	// attach to the domain. The `networkInterface` object structure is documented
	// below.
	NetworkInterfaces DomainNetworkInterfaceArrayOutput `pulumi:"networkInterfaces"`
	// this block allows specifying the following attributes related to the _nvram_:
	Nvram DomainNvramPtrOutput `pulumi:"nvram"`
	// By default is disabled, set to true for enabling it. More info [qemu-agent](https://wiki.libvirt.org/page/Qemu_guest_agent).
	QemuAgent pulumi.BoolPtrOutput `pulumi:"qemuAgent"`
	// Use `false` to turn off the instance. If not specified,
	// true is assumed and the instance, if stopped, will be started at next apply.
	Running pulumi.BoolPtrOutput `pulumi:"running"`
	// The amount of virtual CPUs. If not specified, a single CPU
	// will be created.
	Vcpu  pulumi.IntPtrOutput  `pulumi:"vcpu"`
	Video DomainVideoPtrOutput `pulumi:"video"`
	Xml   DomainXmlPtrOutput   `pulumi:"xml"`
}

// NewDomain registers a new resource with the given unique name, arguments, and options.
func NewDomain(ctx *pulumi.Context,
	name string, args *DomainArgs, opts ...pulumi.ResourceOption) (*Domain, error) {
	if args == nil {
		args = &DomainArgs{}
	}

	var resource Domain
	err := ctx.RegisterResource("libvirt:index/domain:Domain", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDomain gets an existing Domain resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDomain(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DomainState, opts ...pulumi.ResourceOption) (*Domain, error) {
	var resource Domain
	err := ctx.ReadResource("libvirt:index/domain:Domain", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Domain resources.
type domainState struct {
	// The architecture for the VM (probably x8664 or i686),
	// you normally won't need to set this unless you are building a special VM
	Arch *string `pulumi:"arch"`
	// Set to `true` to start the domain on host boot up.
	// If not specified `false` is assumed.
	Autostart *bool `pulumi:"autostart"`
	// A list of devices (dev) which defines boot order. Example
	// below.
	BootDevices []DomainBootDevice `pulumi:"bootDevices"`
	// The `CloudInitDisk` disk that has to be used by
	// the domain. This is going to be attached as a CDROM ISO. Changing the
	// cloud-init won't cause the domain to be recreated, however the change will
	// have effect on the next reboot.
	Cloudinit *string `pulumi:"cloudinit"`
	// Arguments to the kernel
	Cmdlines []map[string]interface{} `pulumi:"cmdlines"`
	Consoles []DomainConsole          `pulumi:"consoles"`
	// The
	// [Ignition](https://www.terraform.io/docs/providers/libvirt/r/coreos_ignition.html) resource
	// that is to be used by the CoreOS domain.
	CoreosIgnition *string `pulumi:"coreosIgnition"`
	// Configures CPU mode. See below for more
	// details.
	Cpu *DomainCpu `pulumi:"cpu"`
	// The description for domain.
	// Changing this forces a new resource to be created.
	// This data is not used by libvirt in any way, it can contain any information the user wants.
	Description *string `pulumi:"description"`
	// An array of one or more disks to attach to the domain. The
	// `disk` object structure is documented below.
	Disks []DomainDisk `pulumi:"disks"`
	// The path of the emulator to use
	Emulator *string `pulumi:"emulator"`
	// An array of one or more host filesystems to attach to
	// the domain. The `filesystem` object structure is documented
	// below.
	Filesystems []DomainFilesystem `pulumi:"filesystems"`
	// The UEFI rom images for exercising UEFI secure boot in a qemu
	// environment. Users should usually specify one of the standard _Open Virtual Machine
	// Firmware_ (_OVMF_) images available for their distributions. The file will be opened
	// read-only.
	Firmware *string `pulumi:"firmware"`
	// The name of the firmware config path where ignition file is stored: default is `opt/com.coreos/config`. If you are using [Flatcar Linux](https://docs.flatcar-linux.org/os/booting-with-libvirt/#creating-the-domain-xml), the value is `opt/org.flatcar-linux/config`.
	FwCfgName *string         `pulumi:"fwCfgName"`
	Graphics  *DomainGraphics `pulumi:"graphics"`
	// The path of the initrd to boot.
	Initrd *string `pulumi:"initrd"`
	// The path of the kernel to boot
	Kernel *string `pulumi:"kernel"`
	// The machine type,
	// you normally won't need to set this unless you are running on a platform that
	// defaults to the wrong machine type for your template
	Machine *string `pulumi:"machine"`
	// The amount of memory in MiB. If not specified the domain
	// will be created with 512 MiB of memory be used.
	Memory   *int    `pulumi:"memory"`
	Metadata *string `pulumi:"metadata"`
	// A unique name for the resource, required by libvirt.
	// Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// An array of one or more network interfaces to
	// attach to the domain. The `networkInterface` object structure is documented
	// below.
	NetworkInterfaces []DomainNetworkInterface `pulumi:"networkInterfaces"`
	// this block allows specifying the following attributes related to the _nvram_:
	Nvram *DomainNvram `pulumi:"nvram"`
	// By default is disabled, set to true for enabling it. More info [qemu-agent](https://wiki.libvirt.org/page/Qemu_guest_agent).
	QemuAgent *bool `pulumi:"qemuAgent"`
	// Use `false` to turn off the instance. If not specified,
	// true is assumed and the instance, if stopped, will be started at next apply.
	Running *bool `pulumi:"running"`
	// The amount of virtual CPUs. If not specified, a single CPU
	// will be created.
	Vcpu  *int         `pulumi:"vcpu"`
	Video *DomainVideo `pulumi:"video"`
	Xml   *DomainXml   `pulumi:"xml"`
}

type DomainState struct {
	// The architecture for the VM (probably x8664 or i686),
	// you normally won't need to set this unless you are building a special VM
	Arch pulumi.StringPtrInput
	// Set to `true` to start the domain on host boot up.
	// If not specified `false` is assumed.
	Autostart pulumi.BoolPtrInput
	// A list of devices (dev) which defines boot order. Example
	// below.
	BootDevices DomainBootDeviceArrayInput
	// The `CloudInitDisk` disk that has to be used by
	// the domain. This is going to be attached as a CDROM ISO. Changing the
	// cloud-init won't cause the domain to be recreated, however the change will
	// have effect on the next reboot.
	Cloudinit pulumi.StringPtrInput
	// Arguments to the kernel
	Cmdlines pulumi.MapArrayInput
	Consoles DomainConsoleArrayInput
	// The
	// [Ignition](https://www.terraform.io/docs/providers/libvirt/r/coreos_ignition.html) resource
	// that is to be used by the CoreOS domain.
	CoreosIgnition pulumi.StringPtrInput
	// Configures CPU mode. See below for more
	// details.
	Cpu DomainCpuPtrInput
	// The description for domain.
	// Changing this forces a new resource to be created.
	// This data is not used by libvirt in any way, it can contain any information the user wants.
	Description pulumi.StringPtrInput
	// An array of one or more disks to attach to the domain. The
	// `disk` object structure is documented below.
	Disks DomainDiskArrayInput
	// The path of the emulator to use
	Emulator pulumi.StringPtrInput
	// An array of one or more host filesystems to attach to
	// the domain. The `filesystem` object structure is documented
	// below.
	Filesystems DomainFilesystemArrayInput
	// The UEFI rom images for exercising UEFI secure boot in a qemu
	// environment. Users should usually specify one of the standard _Open Virtual Machine
	// Firmware_ (_OVMF_) images available for their distributions. The file will be opened
	// read-only.
	Firmware pulumi.StringPtrInput
	// The name of the firmware config path where ignition file is stored: default is `opt/com.coreos/config`. If you are using [Flatcar Linux](https://docs.flatcar-linux.org/os/booting-with-libvirt/#creating-the-domain-xml), the value is `opt/org.flatcar-linux/config`.
	FwCfgName pulumi.StringPtrInput
	Graphics  DomainGraphicsPtrInput
	// The path of the initrd to boot.
	Initrd pulumi.StringPtrInput
	// The path of the kernel to boot
	Kernel pulumi.StringPtrInput
	// The machine type,
	// you normally won't need to set this unless you are running on a platform that
	// defaults to the wrong machine type for your template
	Machine pulumi.StringPtrInput
	// The amount of memory in MiB. If not specified the domain
	// will be created with 512 MiB of memory be used.
	Memory   pulumi.IntPtrInput
	Metadata pulumi.StringPtrInput
	// A unique name for the resource, required by libvirt.
	// Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// An array of one or more network interfaces to
	// attach to the domain. The `networkInterface` object structure is documented
	// below.
	NetworkInterfaces DomainNetworkInterfaceArrayInput
	// this block allows specifying the following attributes related to the _nvram_:
	Nvram DomainNvramPtrInput
	// By default is disabled, set to true for enabling it. More info [qemu-agent](https://wiki.libvirt.org/page/Qemu_guest_agent).
	QemuAgent pulumi.BoolPtrInput
	// Use `false` to turn off the instance. If not specified,
	// true is assumed and the instance, if stopped, will be started at next apply.
	Running pulumi.BoolPtrInput
	// The amount of virtual CPUs. If not specified, a single CPU
	// will be created.
	Vcpu  pulumi.IntPtrInput
	Video DomainVideoPtrInput
	Xml   DomainXmlPtrInput
}

func (DomainState) ElementType() reflect.Type {
	return reflect.TypeOf((*domainState)(nil)).Elem()
}

type domainArgs struct {
	// The architecture for the VM (probably x8664 or i686),
	// you normally won't need to set this unless you are building a special VM
	Arch *string `pulumi:"arch"`
	// Set to `true` to start the domain on host boot up.
	// If not specified `false` is assumed.
	Autostart *bool `pulumi:"autostart"`
	// A list of devices (dev) which defines boot order. Example
	// below.
	BootDevices []DomainBootDevice `pulumi:"bootDevices"`
	// The `CloudInitDisk` disk that has to be used by
	// the domain. This is going to be attached as a CDROM ISO. Changing the
	// cloud-init won't cause the domain to be recreated, however the change will
	// have effect on the next reboot.
	Cloudinit *string `pulumi:"cloudinit"`
	// Arguments to the kernel
	Cmdlines []map[string]interface{} `pulumi:"cmdlines"`
	Consoles []DomainConsole          `pulumi:"consoles"`
	// The
	// [Ignition](https://www.terraform.io/docs/providers/libvirt/r/coreos_ignition.html) resource
	// that is to be used by the CoreOS domain.
	CoreosIgnition *string `pulumi:"coreosIgnition"`
	// Configures CPU mode. See below for more
	// details.
	Cpu *DomainCpu `pulumi:"cpu"`
	// The description for domain.
	// Changing this forces a new resource to be created.
	// This data is not used by libvirt in any way, it can contain any information the user wants.
	Description *string `pulumi:"description"`
	// An array of one or more disks to attach to the domain. The
	// `disk` object structure is documented below.
	Disks []DomainDisk `pulumi:"disks"`
	// The path of the emulator to use
	Emulator *string `pulumi:"emulator"`
	// An array of one or more host filesystems to attach to
	// the domain. The `filesystem` object structure is documented
	// below.
	Filesystems []DomainFilesystem `pulumi:"filesystems"`
	// The UEFI rom images for exercising UEFI secure boot in a qemu
	// environment. Users should usually specify one of the standard _Open Virtual Machine
	// Firmware_ (_OVMF_) images available for their distributions. The file will be opened
	// read-only.
	Firmware *string `pulumi:"firmware"`
	// The name of the firmware config path where ignition file is stored: default is `opt/com.coreos/config`. If you are using [Flatcar Linux](https://docs.flatcar-linux.org/os/booting-with-libvirt/#creating-the-domain-xml), the value is `opt/org.flatcar-linux/config`.
	FwCfgName *string         `pulumi:"fwCfgName"`
	Graphics  *DomainGraphics `pulumi:"graphics"`
	// The path of the initrd to boot.
	Initrd *string `pulumi:"initrd"`
	// The path of the kernel to boot
	Kernel *string `pulumi:"kernel"`
	// The machine type,
	// you normally won't need to set this unless you are running on a platform that
	// defaults to the wrong machine type for your template
	Machine *string `pulumi:"machine"`
	// The amount of memory in MiB. If not specified the domain
	// will be created with 512 MiB of memory be used.
	Memory   *int    `pulumi:"memory"`
	Metadata *string `pulumi:"metadata"`
	// A unique name for the resource, required by libvirt.
	// Changing this forces a new resource to be created.
	Name *string `pulumi:"name"`
	// An array of one or more network interfaces to
	// attach to the domain. The `networkInterface` object structure is documented
	// below.
	NetworkInterfaces []DomainNetworkInterface `pulumi:"networkInterfaces"`
	// this block allows specifying the following attributes related to the _nvram_:
	Nvram *DomainNvram `pulumi:"nvram"`
	// By default is disabled, set to true for enabling it. More info [qemu-agent](https://wiki.libvirt.org/page/Qemu_guest_agent).
	QemuAgent *bool `pulumi:"qemuAgent"`
	// Use `false` to turn off the instance. If not specified,
	// true is assumed and the instance, if stopped, will be started at next apply.
	Running *bool `pulumi:"running"`
	// The amount of virtual CPUs. If not specified, a single CPU
	// will be created.
	Vcpu  *int         `pulumi:"vcpu"`
	Video *DomainVideo `pulumi:"video"`
	Xml   *DomainXml   `pulumi:"xml"`
}

// The set of arguments for constructing a Domain resource.
type DomainArgs struct {
	// The architecture for the VM (probably x8664 or i686),
	// you normally won't need to set this unless you are building a special VM
	Arch pulumi.StringPtrInput
	// Set to `true` to start the domain on host boot up.
	// If not specified `false` is assumed.
	Autostart pulumi.BoolPtrInput
	// A list of devices (dev) which defines boot order. Example
	// below.
	BootDevices DomainBootDeviceArrayInput
	// The `CloudInitDisk` disk that has to be used by
	// the domain. This is going to be attached as a CDROM ISO. Changing the
	// cloud-init won't cause the domain to be recreated, however the change will
	// have effect on the next reboot.
	Cloudinit pulumi.StringPtrInput
	// Arguments to the kernel
	Cmdlines pulumi.MapArrayInput
	Consoles DomainConsoleArrayInput
	// The
	// [Ignition](https://www.terraform.io/docs/providers/libvirt/r/coreos_ignition.html) resource
	// that is to be used by the CoreOS domain.
	CoreosIgnition pulumi.StringPtrInput
	// Configures CPU mode. See below for more
	// details.
	Cpu DomainCpuPtrInput
	// The description for domain.
	// Changing this forces a new resource to be created.
	// This data is not used by libvirt in any way, it can contain any information the user wants.
	Description pulumi.StringPtrInput
	// An array of one or more disks to attach to the domain. The
	// `disk` object structure is documented below.
	Disks DomainDiskArrayInput
	// The path of the emulator to use
	Emulator pulumi.StringPtrInput
	// An array of one or more host filesystems to attach to
	// the domain. The `filesystem` object structure is documented
	// below.
	Filesystems DomainFilesystemArrayInput
	// The UEFI rom images for exercising UEFI secure boot in a qemu
	// environment. Users should usually specify one of the standard _Open Virtual Machine
	// Firmware_ (_OVMF_) images available for their distributions. The file will be opened
	// read-only.
	Firmware pulumi.StringPtrInput
	// The name of the firmware config path where ignition file is stored: default is `opt/com.coreos/config`. If you are using [Flatcar Linux](https://docs.flatcar-linux.org/os/booting-with-libvirt/#creating-the-domain-xml), the value is `opt/org.flatcar-linux/config`.
	FwCfgName pulumi.StringPtrInput
	Graphics  DomainGraphicsPtrInput
	// The path of the initrd to boot.
	Initrd pulumi.StringPtrInput
	// The path of the kernel to boot
	Kernel pulumi.StringPtrInput
	// The machine type,
	// you normally won't need to set this unless you are running on a platform that
	// defaults to the wrong machine type for your template
	Machine pulumi.StringPtrInput
	// The amount of memory in MiB. If not specified the domain
	// will be created with 512 MiB of memory be used.
	Memory   pulumi.IntPtrInput
	Metadata pulumi.StringPtrInput
	// A unique name for the resource, required by libvirt.
	// Changing this forces a new resource to be created.
	Name pulumi.StringPtrInput
	// An array of one or more network interfaces to
	// attach to the domain. The `networkInterface` object structure is documented
	// below.
	NetworkInterfaces DomainNetworkInterfaceArrayInput
	// this block allows specifying the following attributes related to the _nvram_:
	Nvram DomainNvramPtrInput
	// By default is disabled, set to true for enabling it. More info [qemu-agent](https://wiki.libvirt.org/page/Qemu_guest_agent).
	QemuAgent pulumi.BoolPtrInput
	// Use `false` to turn off the instance. If not specified,
	// true is assumed and the instance, if stopped, will be started at next apply.
	Running pulumi.BoolPtrInput
	// The amount of virtual CPUs. If not specified, a single CPU
	// will be created.
	Vcpu  pulumi.IntPtrInput
	Video DomainVideoPtrInput
	Xml   DomainXmlPtrInput
}

func (DomainArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*domainArgs)(nil)).Elem()
}

type DomainInput interface {
	pulumi.Input

	ToDomainOutput() DomainOutput
	ToDomainOutputWithContext(ctx context.Context) DomainOutput
}

func (*Domain) ElementType() reflect.Type {
	return reflect.TypeOf((*Domain)(nil))
}

func (i *Domain) ToDomainOutput() DomainOutput {
	return i.ToDomainOutputWithContext(context.Background())
}

func (i *Domain) ToDomainOutputWithContext(ctx context.Context) DomainOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DomainOutput)
}

func (i *Domain) ToDomainPtrOutput() DomainPtrOutput {
	return i.ToDomainPtrOutputWithContext(context.Background())
}

func (i *Domain) ToDomainPtrOutputWithContext(ctx context.Context) DomainPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DomainPtrOutput)
}

type DomainPtrInput interface {
	pulumi.Input

	ToDomainPtrOutput() DomainPtrOutput
	ToDomainPtrOutputWithContext(ctx context.Context) DomainPtrOutput
}

type domainPtrType DomainArgs

func (*domainPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**Domain)(nil))
}

func (i *domainPtrType) ToDomainPtrOutput() DomainPtrOutput {
	return i.ToDomainPtrOutputWithContext(context.Background())
}

func (i *domainPtrType) ToDomainPtrOutputWithContext(ctx context.Context) DomainPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DomainPtrOutput)
}

// DomainArrayInput is an input type that accepts DomainArray and DomainArrayOutput values.
// You can construct a concrete instance of `DomainArrayInput` via:
//
//          DomainArray{ DomainArgs{...} }
type DomainArrayInput interface {
	pulumi.Input

	ToDomainArrayOutput() DomainArrayOutput
	ToDomainArrayOutputWithContext(context.Context) DomainArrayOutput
}

type DomainArray []DomainInput

func (DomainArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Domain)(nil)).Elem()
}

func (i DomainArray) ToDomainArrayOutput() DomainArrayOutput {
	return i.ToDomainArrayOutputWithContext(context.Background())
}

func (i DomainArray) ToDomainArrayOutputWithContext(ctx context.Context) DomainArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DomainArrayOutput)
}

// DomainMapInput is an input type that accepts DomainMap and DomainMapOutput values.
// You can construct a concrete instance of `DomainMapInput` via:
//
//          DomainMap{ "key": DomainArgs{...} }
type DomainMapInput interface {
	pulumi.Input

	ToDomainMapOutput() DomainMapOutput
	ToDomainMapOutputWithContext(context.Context) DomainMapOutput
}

type DomainMap map[string]DomainInput

func (DomainMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Domain)(nil)).Elem()
}

func (i DomainMap) ToDomainMapOutput() DomainMapOutput {
	return i.ToDomainMapOutputWithContext(context.Background())
}

func (i DomainMap) ToDomainMapOutputWithContext(ctx context.Context) DomainMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DomainMapOutput)
}

type DomainOutput struct{ *pulumi.OutputState }

func (DomainOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*Domain)(nil))
}

func (o DomainOutput) ToDomainOutput() DomainOutput {
	return o
}

func (o DomainOutput) ToDomainOutputWithContext(ctx context.Context) DomainOutput {
	return o
}

func (o DomainOutput) ToDomainPtrOutput() DomainPtrOutput {
	return o.ToDomainPtrOutputWithContext(context.Background())
}

func (o DomainOutput) ToDomainPtrOutputWithContext(ctx context.Context) DomainPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v Domain) *Domain {
		return &v
	}).(DomainPtrOutput)
}

type DomainPtrOutput struct{ *pulumi.OutputState }

func (DomainPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Domain)(nil))
}

func (o DomainPtrOutput) ToDomainPtrOutput() DomainPtrOutput {
	return o
}

func (o DomainPtrOutput) ToDomainPtrOutputWithContext(ctx context.Context) DomainPtrOutput {
	return o
}

func (o DomainPtrOutput) Elem() DomainOutput {
	return o.ApplyT(func(v *Domain) Domain {
		if v != nil {
			return *v
		}
		var ret Domain
		return ret
	}).(DomainOutput)
}

type DomainArrayOutput struct{ *pulumi.OutputState }

func (DomainArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]Domain)(nil))
}

func (o DomainArrayOutput) ToDomainArrayOutput() DomainArrayOutput {
	return o
}

func (o DomainArrayOutput) ToDomainArrayOutputWithContext(ctx context.Context) DomainArrayOutput {
	return o
}

func (o DomainArrayOutput) Index(i pulumi.IntInput) DomainOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) Domain {
		return vs[0].([]Domain)[vs[1].(int)]
	}).(DomainOutput)
}

type DomainMapOutput struct{ *pulumi.OutputState }

func (DomainMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]Domain)(nil))
}

func (o DomainMapOutput) ToDomainMapOutput() DomainMapOutput {
	return o
}

func (o DomainMapOutput) ToDomainMapOutputWithContext(ctx context.Context) DomainMapOutput {
	return o
}

func (o DomainMapOutput) MapIndex(k pulumi.StringInput) DomainOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) Domain {
		return vs[0].(map[string]Domain)[vs[1].(string)]
	}).(DomainOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DomainInput)(nil)).Elem(), &Domain{})
	pulumi.RegisterInputType(reflect.TypeOf((*DomainPtrInput)(nil)).Elem(), &Domain{})
	pulumi.RegisterInputType(reflect.TypeOf((*DomainArrayInput)(nil)).Elem(), DomainArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DomainMapInput)(nil)).Elem(), DomainMap{})
	pulumi.RegisterOutputType(DomainOutput{})
	pulumi.RegisterOutputType(DomainPtrOutput{})
	pulumi.RegisterOutputType(DomainArrayOutput{})
	pulumi.RegisterOutputType(DomainMapOutput{})
}
