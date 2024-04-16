// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Manages a VM domain resource within libvirt. For more information see
 * [the official documentation](https://libvirt.org/formatdomain.html).
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as libvirt from "@pulumi/libvirt";
 *
 * const _default = new libvirt.Domain("default", {name: "test"});
 * ```
 * <!--End PulumiCodeChooser -->
 */
export class Domain extends pulumi.CustomResource {
    /**
     * Get an existing Domain resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DomainState, opts?: pulumi.CustomResourceOptions): Domain {
        return new Domain(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'libvirt:index/domain:Domain';

    /**
     * Returns true if the given object is an instance of Domain.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Domain {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Domain.__pulumiType;
    }

    /**
     * The architecture for the VM (probably x8664 or i686),
     * you normally won't need to set this unless you are building a special VM
     */
    public readonly arch!: pulumi.Output<string>;
    /**
     * Set to `true` to start the domain on host boot up.
     * If not specified `false` is assumed.
     */
    public readonly autostart!: pulumi.Output<boolean>;
    /**
     * A list of devices (dev) which defines boot order. Example
     * below.
     */
    public readonly bootDevices!: pulumi.Output<outputs.DomainBootDevice[] | undefined>;
    /**
     * The `libvirt.CloudInitDisk` disk that has to be used by
     * the domain. This is going to be attached as a CDROM ISO. Changing the
     * cloud-init won't cause the domain to be recreated, however the change will
     * have effect on the next reboot.
     */
    public readonly cloudinit!: pulumi.Output<string | undefined>;
    /**
     * Arguments to the kernel
     *
     * <!--Start PulumiCodeChooser -->
     * ```typescript
     * import * as pulumi from "@pulumi/pulumi";
     * import * as libvirt from "@pulumi/libvirt";
     *
     * const domain_suse = new libvirt.Domain("domain-suse", {
     *     name: "suse",
     *     memory: 1024,
     *     vcpu: 1,
     *     kernel: kernel.id,
     *     cmdlines: [{
     *         arg1: "value1",
     *         arg2: "value2",
     *         _: "rw nosplash",
     *     }],
     * });
     * ```
     * <!--End PulumiCodeChooser -->
     *
     * Kernel params that don't have a keyword identifier can be specified using the
     * special `"_"` keyword. Multiple keyword-less params have to be specified using
     * the same `"_"` keyword, like in the example above.
     *
     * Also note that the `cmd` block is actually a list of maps, so it is possible to
     * declare several of them by using either the literal list and map syntax as in
     * the following examples:
     */
    public readonly cmdlines!: pulumi.Output<{[key: string]: any}[] | undefined>;
    public readonly consoles!: pulumi.Output<outputs.DomainConsole[] | undefined>;
    /**
     * The
     * [libvirt.Ignition](https://www.terraform.io/docs/providers/libvirt/r/coreos_ignition.html) resource
     * that is to be used by the CoreOS domain.
     */
    public readonly coreosIgnition!: pulumi.Output<string | undefined>;
    /**
     * Configures CPU mode. See below for more
     * details.
     */
    public readonly cpu!: pulumi.Output<outputs.DomainCpu>;
    /**
     * The description for domain.
     * Changing this forces a new resource to be created.
     * This data is not used by libvirt in any way, it can contain any information the user wants.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * An array of one or more disks to attach to the domain. The
     * `disk` object structure is documented below.
     */
    public readonly disks!: pulumi.Output<outputs.DomainDisk[] | undefined>;
    /**
     * The path of the emulator to use
     */
    public readonly emulator!: pulumi.Output<string>;
    /**
     * An array of one or more host filesystems to attach to
     * the domain. The `filesystem` object structure is documented
     * below.
     */
    public readonly filesystems!: pulumi.Output<outputs.DomainFilesystem[] | undefined>;
    /**
     * The UEFI rom images for exercising UEFI secure boot in a qemu
     * environment. Users should usually specify one of the standard _Open Virtual Machine
     * Firmware_ (_OVMF_) images available for their distributions. The file will be opened
     * read-only.
     */
    public readonly firmware!: pulumi.Output<string | undefined>;
    /**
     * The name of the firmware config path where ignition file is stored: default is `opt/com.coreos/config`. If you are using [Flatcar Linux](https://docs.flatcar-linux.org/os/booting-with-libvirt/#creating-the-domain-xml), the value is `opt/org.flatcar-linux/config`.
     */
    public readonly fwCfgName!: pulumi.Output<string | undefined>;
    public readonly graphics!: pulumi.Output<outputs.DomainGraphics | undefined>;
    /**
     * The path of the initrd to boot.
     *
     * You can use it in the same way as the kernel.
     */
    public readonly initrd!: pulumi.Output<string | undefined>;
    /**
     * The path of the kernel to boot
     *
     * If you are using a qcow2 volume, you can pass the id of the volume (eg. `${libvirt_volume.kernel.id}`)
     * as they are local to the hypervisor.
     *
     * Given that you can define a volume from a remote http file, this means, you can also have remote kernels.
     *
     * <!--Start PulumiCodeChooser -->
     * ```typescript
     * import * as pulumi from "@pulumi/pulumi";
     * import * as libvirt from "@pulumi/libvirt";
     *
     * const kernel = new libvirt.Volume("kernel", {
     *     source: "http://download.opensuse.org/tumbleweed/repo/oss/boot/x86_64/loader/linux",
     *     name: "kernel",
     *     pool: "default",
     *     format: "raw",
     * });
     * const domain_suse = new libvirt.Domain("domain-suse", {
     *     name: "suse",
     *     memory: 1024,
     *     vcpu: 1,
     *     kernel: kernel.id,
     * });
     * ```
     * <!--End PulumiCodeChooser -->
     */
    public readonly kernel!: pulumi.Output<string | undefined>;
    /**
     * The machine type,
     * you normally won't need to set this unless you are running on a platform that
     * defaults to the wrong machine type for your template
     */
    public readonly machine!: pulumi.Output<string>;
    /**
     * The amount of memory in MiB. If not specified the domain
     * will be created with 512 MiB of memory be used.
     */
    public readonly memory!: pulumi.Output<number | undefined>;
    public readonly metadata!: pulumi.Output<string | undefined>;
    /**
     * A unique name for the resource, required by libvirt.
     * Changing this forces a new resource to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * An array of one or more network interfaces to
     * attach to the domain. The `networkInterface` object structure is documented
     * below.
     */
    public readonly networkInterfaces!: pulumi.Output<outputs.DomainNetworkInterface[] | undefined>;
    /**
     * this block allows specifying the following attributes related to the _nvram_:
     */
    public readonly nvram!: pulumi.Output<outputs.DomainNvram | undefined>;
    /**
     * By default is disabled, set to true for enabling it. More info [qemu-agent](https://wiki.libvirt.org/page/Qemu_guest_agent).
     */
    public readonly qemuAgent!: pulumi.Output<boolean | undefined>;
    /**
     * Use `false` to turn off the instance. If not specified,
     * true is assumed and the instance, if stopped, will be started at next apply.
     */
    public readonly running!: pulumi.Output<boolean | undefined>;
    /**
     * TPM device to attach to the domain. The `tpm` object structure is documented below.
     */
    public readonly tpm!: pulumi.Output<outputs.DomainTpm | undefined>;
    /**
     * The type of hypervisor to use for the domain.  Defaults to `kvm`, other values can be found [here](https://libvirt.org/formatdomain.html#id1)
     */
    public readonly type!: pulumi.Output<string | undefined>;
    /**
     * The amount of virtual CPUs. If not specified, a single CPU
     * will be created.
     */
    public readonly vcpu!: pulumi.Output<number | undefined>;
    public readonly video!: pulumi.Output<outputs.DomainVideo | undefined>;
    public readonly xml!: pulumi.Output<outputs.DomainXml | undefined>;

    /**
     * Create a Domain resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: DomainArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DomainArgs | DomainState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DomainState | undefined;
            resourceInputs["arch"] = state ? state.arch : undefined;
            resourceInputs["autostart"] = state ? state.autostart : undefined;
            resourceInputs["bootDevices"] = state ? state.bootDevices : undefined;
            resourceInputs["cloudinit"] = state ? state.cloudinit : undefined;
            resourceInputs["cmdlines"] = state ? state.cmdlines : undefined;
            resourceInputs["consoles"] = state ? state.consoles : undefined;
            resourceInputs["coreosIgnition"] = state ? state.coreosIgnition : undefined;
            resourceInputs["cpu"] = state ? state.cpu : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["disks"] = state ? state.disks : undefined;
            resourceInputs["emulator"] = state ? state.emulator : undefined;
            resourceInputs["filesystems"] = state ? state.filesystems : undefined;
            resourceInputs["firmware"] = state ? state.firmware : undefined;
            resourceInputs["fwCfgName"] = state ? state.fwCfgName : undefined;
            resourceInputs["graphics"] = state ? state.graphics : undefined;
            resourceInputs["initrd"] = state ? state.initrd : undefined;
            resourceInputs["kernel"] = state ? state.kernel : undefined;
            resourceInputs["machine"] = state ? state.machine : undefined;
            resourceInputs["memory"] = state ? state.memory : undefined;
            resourceInputs["metadata"] = state ? state.metadata : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["networkInterfaces"] = state ? state.networkInterfaces : undefined;
            resourceInputs["nvram"] = state ? state.nvram : undefined;
            resourceInputs["qemuAgent"] = state ? state.qemuAgent : undefined;
            resourceInputs["running"] = state ? state.running : undefined;
            resourceInputs["tpm"] = state ? state.tpm : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["vcpu"] = state ? state.vcpu : undefined;
            resourceInputs["video"] = state ? state.video : undefined;
            resourceInputs["xml"] = state ? state.xml : undefined;
        } else {
            const args = argsOrState as DomainArgs | undefined;
            resourceInputs["arch"] = args ? args.arch : undefined;
            resourceInputs["autostart"] = args ? args.autostart : undefined;
            resourceInputs["bootDevices"] = args ? args.bootDevices : undefined;
            resourceInputs["cloudinit"] = args ? args.cloudinit : undefined;
            resourceInputs["cmdlines"] = args ? args.cmdlines : undefined;
            resourceInputs["consoles"] = args ? args.consoles : undefined;
            resourceInputs["coreosIgnition"] = args ? args.coreosIgnition : undefined;
            resourceInputs["cpu"] = args ? args.cpu : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["disks"] = args ? args.disks : undefined;
            resourceInputs["emulator"] = args ? args.emulator : undefined;
            resourceInputs["filesystems"] = args ? args.filesystems : undefined;
            resourceInputs["firmware"] = args ? args.firmware : undefined;
            resourceInputs["fwCfgName"] = args ? args.fwCfgName : undefined;
            resourceInputs["graphics"] = args ? args.graphics : undefined;
            resourceInputs["initrd"] = args ? args.initrd : undefined;
            resourceInputs["kernel"] = args ? args.kernel : undefined;
            resourceInputs["machine"] = args ? args.machine : undefined;
            resourceInputs["memory"] = args ? args.memory : undefined;
            resourceInputs["metadata"] = args ? args.metadata : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["networkInterfaces"] = args ? args.networkInterfaces : undefined;
            resourceInputs["nvram"] = args ? args.nvram : undefined;
            resourceInputs["qemuAgent"] = args ? args.qemuAgent : undefined;
            resourceInputs["running"] = args ? args.running : undefined;
            resourceInputs["tpm"] = args ? args.tpm : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["vcpu"] = args ? args.vcpu : undefined;
            resourceInputs["video"] = args ? args.video : undefined;
            resourceInputs["xml"] = args ? args.xml : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Domain.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Domain resources.
 */
export interface DomainState {
    /**
     * The architecture for the VM (probably x8664 or i686),
     * you normally won't need to set this unless you are building a special VM
     */
    arch?: pulumi.Input<string>;
    /**
     * Set to `true` to start the domain on host boot up.
     * If not specified `false` is assumed.
     */
    autostart?: pulumi.Input<boolean>;
    /**
     * A list of devices (dev) which defines boot order. Example
     * below.
     */
    bootDevices?: pulumi.Input<pulumi.Input<inputs.DomainBootDevice>[]>;
    /**
     * The `libvirt.CloudInitDisk` disk that has to be used by
     * the domain. This is going to be attached as a CDROM ISO. Changing the
     * cloud-init won't cause the domain to be recreated, however the change will
     * have effect on the next reboot.
     */
    cloudinit?: pulumi.Input<string>;
    /**
     * Arguments to the kernel
     *
     * <!--Start PulumiCodeChooser -->
     * ```typescript
     * import * as pulumi from "@pulumi/pulumi";
     * import * as libvirt from "@pulumi/libvirt";
     *
     * const domain_suse = new libvirt.Domain("domain-suse", {
     *     name: "suse",
     *     memory: 1024,
     *     vcpu: 1,
     *     kernel: kernel.id,
     *     cmdlines: [{
     *         arg1: "value1",
     *         arg2: "value2",
     *         _: "rw nosplash",
     *     }],
     * });
     * ```
     * <!--End PulumiCodeChooser -->
     *
     * Kernel params that don't have a keyword identifier can be specified using the
     * special `"_"` keyword. Multiple keyword-less params have to be specified using
     * the same `"_"` keyword, like in the example above.
     *
     * Also note that the `cmd` block is actually a list of maps, so it is possible to
     * declare several of them by using either the literal list and map syntax as in
     * the following examples:
     */
    cmdlines?: pulumi.Input<pulumi.Input<{[key: string]: any}>[]>;
    consoles?: pulumi.Input<pulumi.Input<inputs.DomainConsole>[]>;
    /**
     * The
     * [libvirt.Ignition](https://www.terraform.io/docs/providers/libvirt/r/coreos_ignition.html) resource
     * that is to be used by the CoreOS domain.
     */
    coreosIgnition?: pulumi.Input<string>;
    /**
     * Configures CPU mode. See below for more
     * details.
     */
    cpu?: pulumi.Input<inputs.DomainCpu>;
    /**
     * The description for domain.
     * Changing this forces a new resource to be created.
     * This data is not used by libvirt in any way, it can contain any information the user wants.
     */
    description?: pulumi.Input<string>;
    /**
     * An array of one or more disks to attach to the domain. The
     * `disk` object structure is documented below.
     */
    disks?: pulumi.Input<pulumi.Input<inputs.DomainDisk>[]>;
    /**
     * The path of the emulator to use
     */
    emulator?: pulumi.Input<string>;
    /**
     * An array of one or more host filesystems to attach to
     * the domain. The `filesystem` object structure is documented
     * below.
     */
    filesystems?: pulumi.Input<pulumi.Input<inputs.DomainFilesystem>[]>;
    /**
     * The UEFI rom images for exercising UEFI secure boot in a qemu
     * environment. Users should usually specify one of the standard _Open Virtual Machine
     * Firmware_ (_OVMF_) images available for their distributions. The file will be opened
     * read-only.
     */
    firmware?: pulumi.Input<string>;
    /**
     * The name of the firmware config path where ignition file is stored: default is `opt/com.coreos/config`. If you are using [Flatcar Linux](https://docs.flatcar-linux.org/os/booting-with-libvirt/#creating-the-domain-xml), the value is `opt/org.flatcar-linux/config`.
     */
    fwCfgName?: pulumi.Input<string>;
    graphics?: pulumi.Input<inputs.DomainGraphics>;
    /**
     * The path of the initrd to boot.
     *
     * You can use it in the same way as the kernel.
     */
    initrd?: pulumi.Input<string>;
    /**
     * The path of the kernel to boot
     *
     * If you are using a qcow2 volume, you can pass the id of the volume (eg. `${libvirt_volume.kernel.id}`)
     * as they are local to the hypervisor.
     *
     * Given that you can define a volume from a remote http file, this means, you can also have remote kernels.
     *
     * <!--Start PulumiCodeChooser -->
     * ```typescript
     * import * as pulumi from "@pulumi/pulumi";
     * import * as libvirt from "@pulumi/libvirt";
     *
     * const kernel = new libvirt.Volume("kernel", {
     *     source: "http://download.opensuse.org/tumbleweed/repo/oss/boot/x86_64/loader/linux",
     *     name: "kernel",
     *     pool: "default",
     *     format: "raw",
     * });
     * const domain_suse = new libvirt.Domain("domain-suse", {
     *     name: "suse",
     *     memory: 1024,
     *     vcpu: 1,
     *     kernel: kernel.id,
     * });
     * ```
     * <!--End PulumiCodeChooser -->
     */
    kernel?: pulumi.Input<string>;
    /**
     * The machine type,
     * you normally won't need to set this unless you are running on a platform that
     * defaults to the wrong machine type for your template
     */
    machine?: pulumi.Input<string>;
    /**
     * The amount of memory in MiB. If not specified the domain
     * will be created with 512 MiB of memory be used.
     */
    memory?: pulumi.Input<number>;
    metadata?: pulumi.Input<string>;
    /**
     * A unique name for the resource, required by libvirt.
     * Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * An array of one or more network interfaces to
     * attach to the domain. The `networkInterface` object structure is documented
     * below.
     */
    networkInterfaces?: pulumi.Input<pulumi.Input<inputs.DomainNetworkInterface>[]>;
    /**
     * this block allows specifying the following attributes related to the _nvram_:
     */
    nvram?: pulumi.Input<inputs.DomainNvram>;
    /**
     * By default is disabled, set to true for enabling it. More info [qemu-agent](https://wiki.libvirt.org/page/Qemu_guest_agent).
     */
    qemuAgent?: pulumi.Input<boolean>;
    /**
     * Use `false` to turn off the instance. If not specified,
     * true is assumed and the instance, if stopped, will be started at next apply.
     */
    running?: pulumi.Input<boolean>;
    /**
     * TPM device to attach to the domain. The `tpm` object structure is documented below.
     */
    tpm?: pulumi.Input<inputs.DomainTpm>;
    /**
     * The type of hypervisor to use for the domain.  Defaults to `kvm`, other values can be found [here](https://libvirt.org/formatdomain.html#id1)
     */
    type?: pulumi.Input<string>;
    /**
     * The amount of virtual CPUs. If not specified, a single CPU
     * will be created.
     */
    vcpu?: pulumi.Input<number>;
    video?: pulumi.Input<inputs.DomainVideo>;
    xml?: pulumi.Input<inputs.DomainXml>;
}

/**
 * The set of arguments for constructing a Domain resource.
 */
export interface DomainArgs {
    /**
     * The architecture for the VM (probably x8664 or i686),
     * you normally won't need to set this unless you are building a special VM
     */
    arch?: pulumi.Input<string>;
    /**
     * Set to `true` to start the domain on host boot up.
     * If not specified `false` is assumed.
     */
    autostart?: pulumi.Input<boolean>;
    /**
     * A list of devices (dev) which defines boot order. Example
     * below.
     */
    bootDevices?: pulumi.Input<pulumi.Input<inputs.DomainBootDevice>[]>;
    /**
     * The `libvirt.CloudInitDisk` disk that has to be used by
     * the domain. This is going to be attached as a CDROM ISO. Changing the
     * cloud-init won't cause the domain to be recreated, however the change will
     * have effect on the next reboot.
     */
    cloudinit?: pulumi.Input<string>;
    /**
     * Arguments to the kernel
     *
     * <!--Start PulumiCodeChooser -->
     * ```typescript
     * import * as pulumi from "@pulumi/pulumi";
     * import * as libvirt from "@pulumi/libvirt";
     *
     * const domain_suse = new libvirt.Domain("domain-suse", {
     *     name: "suse",
     *     memory: 1024,
     *     vcpu: 1,
     *     kernel: kernel.id,
     *     cmdlines: [{
     *         arg1: "value1",
     *         arg2: "value2",
     *         _: "rw nosplash",
     *     }],
     * });
     * ```
     * <!--End PulumiCodeChooser -->
     *
     * Kernel params that don't have a keyword identifier can be specified using the
     * special `"_"` keyword. Multiple keyword-less params have to be specified using
     * the same `"_"` keyword, like in the example above.
     *
     * Also note that the `cmd` block is actually a list of maps, so it is possible to
     * declare several of them by using either the literal list and map syntax as in
     * the following examples:
     */
    cmdlines?: pulumi.Input<pulumi.Input<{[key: string]: any}>[]>;
    consoles?: pulumi.Input<pulumi.Input<inputs.DomainConsole>[]>;
    /**
     * The
     * [libvirt.Ignition](https://www.terraform.io/docs/providers/libvirt/r/coreos_ignition.html) resource
     * that is to be used by the CoreOS domain.
     */
    coreosIgnition?: pulumi.Input<string>;
    /**
     * Configures CPU mode. See below for more
     * details.
     */
    cpu?: pulumi.Input<inputs.DomainCpu>;
    /**
     * The description for domain.
     * Changing this forces a new resource to be created.
     * This data is not used by libvirt in any way, it can contain any information the user wants.
     */
    description?: pulumi.Input<string>;
    /**
     * An array of one or more disks to attach to the domain. The
     * `disk` object structure is documented below.
     */
    disks?: pulumi.Input<pulumi.Input<inputs.DomainDisk>[]>;
    /**
     * The path of the emulator to use
     */
    emulator?: pulumi.Input<string>;
    /**
     * An array of one or more host filesystems to attach to
     * the domain. The `filesystem` object structure is documented
     * below.
     */
    filesystems?: pulumi.Input<pulumi.Input<inputs.DomainFilesystem>[]>;
    /**
     * The UEFI rom images for exercising UEFI secure boot in a qemu
     * environment. Users should usually specify one of the standard _Open Virtual Machine
     * Firmware_ (_OVMF_) images available for their distributions. The file will be opened
     * read-only.
     */
    firmware?: pulumi.Input<string>;
    /**
     * The name of the firmware config path where ignition file is stored: default is `opt/com.coreos/config`. If you are using [Flatcar Linux](https://docs.flatcar-linux.org/os/booting-with-libvirt/#creating-the-domain-xml), the value is `opt/org.flatcar-linux/config`.
     */
    fwCfgName?: pulumi.Input<string>;
    graphics?: pulumi.Input<inputs.DomainGraphics>;
    /**
     * The path of the initrd to boot.
     *
     * You can use it in the same way as the kernel.
     */
    initrd?: pulumi.Input<string>;
    /**
     * The path of the kernel to boot
     *
     * If you are using a qcow2 volume, you can pass the id of the volume (eg. `${libvirt_volume.kernel.id}`)
     * as they are local to the hypervisor.
     *
     * Given that you can define a volume from a remote http file, this means, you can also have remote kernels.
     *
     * <!--Start PulumiCodeChooser -->
     * ```typescript
     * import * as pulumi from "@pulumi/pulumi";
     * import * as libvirt from "@pulumi/libvirt";
     *
     * const kernel = new libvirt.Volume("kernel", {
     *     source: "http://download.opensuse.org/tumbleweed/repo/oss/boot/x86_64/loader/linux",
     *     name: "kernel",
     *     pool: "default",
     *     format: "raw",
     * });
     * const domain_suse = new libvirt.Domain("domain-suse", {
     *     name: "suse",
     *     memory: 1024,
     *     vcpu: 1,
     *     kernel: kernel.id,
     * });
     * ```
     * <!--End PulumiCodeChooser -->
     */
    kernel?: pulumi.Input<string>;
    /**
     * The machine type,
     * you normally won't need to set this unless you are running on a platform that
     * defaults to the wrong machine type for your template
     */
    machine?: pulumi.Input<string>;
    /**
     * The amount of memory in MiB. If not specified the domain
     * will be created with 512 MiB of memory be used.
     */
    memory?: pulumi.Input<number>;
    metadata?: pulumi.Input<string>;
    /**
     * A unique name for the resource, required by libvirt.
     * Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * An array of one or more network interfaces to
     * attach to the domain. The `networkInterface` object structure is documented
     * below.
     */
    networkInterfaces?: pulumi.Input<pulumi.Input<inputs.DomainNetworkInterface>[]>;
    /**
     * this block allows specifying the following attributes related to the _nvram_:
     */
    nvram?: pulumi.Input<inputs.DomainNvram>;
    /**
     * By default is disabled, set to true for enabling it. More info [qemu-agent](https://wiki.libvirt.org/page/Qemu_guest_agent).
     */
    qemuAgent?: pulumi.Input<boolean>;
    /**
     * Use `false` to turn off the instance. If not specified,
     * true is assumed and the instance, if stopped, will be started at next apply.
     */
    running?: pulumi.Input<boolean>;
    /**
     * TPM device to attach to the domain. The `tpm` object structure is documented below.
     */
    tpm?: pulumi.Input<inputs.DomainTpm>;
    /**
     * The type of hypervisor to use for the domain.  Defaults to `kvm`, other values can be found [here](https://libvirt.org/formatdomain.html#id1)
     */
    type?: pulumi.Input<string>;
    /**
     * The amount of virtual CPUs. If not specified, a single CPU
     * will be created.
     */
    vcpu?: pulumi.Input<number>;
    video?: pulumi.Input<inputs.DomainVideo>;
    xml?: pulumi.Input<inputs.DomainXml>;
}
