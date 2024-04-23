// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Manages a storage volume in libvirt. For more information see
 * [the official documentation](https://libvirt.org/formatstorage.html).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as libvirt from "@pulumi/libvirt";
 *
 * // Base OS image to use to create a cluster of different
 * // nodes
 * const opensuseLeap = new libvirt.Volume("opensuse_leap", {
 *     name: "opensuse_leap",
 *     source: "http://download.opensuse.org/repositories/Cloud:/Images:/Leap_42.1/images/openSUSE-Leap-42.1-OpenStack.x86_64.qcow2",
 * });
 * // volume to attach to the "master" domain as main disk
 * const master = new libvirt.Volume("master", {
 *     name: "master.qcow2",
 *     baseVolumeId: opensuseLeap.id,
 * });
 * // volumes to attach to the "workers" domains as main disk
 * const worker: libvirt.Volume[] = [];
 * for (const range = {value: 0}; range.value < workersCount; range.value++) {
 *     worker.push(new libvirt.Volume(`worker-${range.value}`, {
 *         name: `worker_${range.value}.qcow2`,
 *         baseVolumeId: opensuseLeap.id,
 *     }));
 * }
 * ```
 *
 * > **Tip:** when provisioning multiple domains using the same base image, create
 * a `libvirt.Volume` for the base image and then define the domain specific ones
 * as based on it. This way the image will not be modified and no extra disk space
 * is going to be used for the base image.
 */
export class Volume extends pulumi.CustomResource {
    /**
     * Get an existing Volume resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: VolumeState, opts?: pulumi.CustomResourceOptions): Volume {
        return new Volume(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'libvirt:index/volume:Volume';

    /**
     * Returns true if the given object is an instance of Volume.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Volume {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Volume.__pulumiType;
    }

    /**
     * The backing volume (CoW) to use for this volume.
     */
    public readonly baseVolumeId!: pulumi.Output<string | undefined>;
    /**
     * The name of the backing volume (CoW) to use
     * for this volume. Note well: when `baseVolumePool` is not specified the
     * volume is going to be searched inside of `pool`.
     */
    public readonly baseVolumeName!: pulumi.Output<string | undefined>;
    /**
     * The name of the storage pool containing the
     * volume defined by `baseVolumeName`.
     */
    public readonly baseVolumePool!: pulumi.Output<string | undefined>;
    public readonly format!: pulumi.Output<string>;
    /**
     * A unique name for the resource, required by libvirt.
     * Changing this forces a new resource to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The storage pool where the resource will be created.
     * If not given, the `default` storage pool will be used.
     */
    public readonly pool!: pulumi.Output<string | undefined>;
    /**
     * The size of the volume in bytes (if you don't like this,
     * help fix this issue.
     * If `source` is specified, `size` will be set to the source image file size.
     * `size` can be omitted if `source` is specified. `size` will then be set to the source image file size.
     * `size` can be omitted if `baseVolumeId` or `baseVolumeName` is specified. `size` will then be set to the base volume size.
     * If `size` is specified to be bigger than `baseVolumeId` or `baseVolumeName` size, you can use [cloudinit](https://cloudinit.readthedocs.io) if your OS supports it, with `libvirt.CloudInitDisk` and the [growpart](https://cloudinit.readthedocs.io/en/latest/topics/modules.html#growpart) module to resize the partition.
     */
    public readonly size!: pulumi.Output<number>;
    public readonly source!: pulumi.Output<string | undefined>;
    public readonly xml!: pulumi.Output<outputs.VolumeXml | undefined>;

    /**
     * Create a Volume resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: VolumeArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: VolumeArgs | VolumeState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as VolumeState | undefined;
            resourceInputs["baseVolumeId"] = state ? state.baseVolumeId : undefined;
            resourceInputs["baseVolumeName"] = state ? state.baseVolumeName : undefined;
            resourceInputs["baseVolumePool"] = state ? state.baseVolumePool : undefined;
            resourceInputs["format"] = state ? state.format : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["pool"] = state ? state.pool : undefined;
            resourceInputs["size"] = state ? state.size : undefined;
            resourceInputs["source"] = state ? state.source : undefined;
            resourceInputs["xml"] = state ? state.xml : undefined;
        } else {
            const args = argsOrState as VolumeArgs | undefined;
            resourceInputs["baseVolumeId"] = args ? args.baseVolumeId : undefined;
            resourceInputs["baseVolumeName"] = args ? args.baseVolumeName : undefined;
            resourceInputs["baseVolumePool"] = args ? args.baseVolumePool : undefined;
            resourceInputs["format"] = args ? args.format : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["pool"] = args ? args.pool : undefined;
            resourceInputs["size"] = args ? args.size : undefined;
            resourceInputs["source"] = args ? args.source : undefined;
            resourceInputs["xml"] = args ? args.xml : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Volume.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Volume resources.
 */
export interface VolumeState {
    /**
     * The backing volume (CoW) to use for this volume.
     */
    baseVolumeId?: pulumi.Input<string>;
    /**
     * The name of the backing volume (CoW) to use
     * for this volume. Note well: when `baseVolumePool` is not specified the
     * volume is going to be searched inside of `pool`.
     */
    baseVolumeName?: pulumi.Input<string>;
    /**
     * The name of the storage pool containing the
     * volume defined by `baseVolumeName`.
     */
    baseVolumePool?: pulumi.Input<string>;
    format?: pulumi.Input<string>;
    /**
     * A unique name for the resource, required by libvirt.
     * Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The storage pool where the resource will be created.
     * If not given, the `default` storage pool will be used.
     */
    pool?: pulumi.Input<string>;
    /**
     * The size of the volume in bytes (if you don't like this,
     * help fix this issue.
     * If `source` is specified, `size` will be set to the source image file size.
     * `size` can be omitted if `source` is specified. `size` will then be set to the source image file size.
     * `size` can be omitted if `baseVolumeId` or `baseVolumeName` is specified. `size` will then be set to the base volume size.
     * If `size` is specified to be bigger than `baseVolumeId` or `baseVolumeName` size, you can use [cloudinit](https://cloudinit.readthedocs.io) if your OS supports it, with `libvirt.CloudInitDisk` and the [growpart](https://cloudinit.readthedocs.io/en/latest/topics/modules.html#growpart) module to resize the partition.
     */
    size?: pulumi.Input<number>;
    source?: pulumi.Input<string>;
    xml?: pulumi.Input<inputs.VolumeXml>;
}

/**
 * The set of arguments for constructing a Volume resource.
 */
export interface VolumeArgs {
    /**
     * The backing volume (CoW) to use for this volume.
     */
    baseVolumeId?: pulumi.Input<string>;
    /**
     * The name of the backing volume (CoW) to use
     * for this volume. Note well: when `baseVolumePool` is not specified the
     * volume is going to be searched inside of `pool`.
     */
    baseVolumeName?: pulumi.Input<string>;
    /**
     * The name of the storage pool containing the
     * volume defined by `baseVolumeName`.
     */
    baseVolumePool?: pulumi.Input<string>;
    format?: pulumi.Input<string>;
    /**
     * A unique name for the resource, required by libvirt.
     * Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The storage pool where the resource will be created.
     * If not given, the `default` storage pool will be used.
     */
    pool?: pulumi.Input<string>;
    /**
     * The size of the volume in bytes (if you don't like this,
     * help fix this issue.
     * If `source` is specified, `size` will be set to the source image file size.
     * `size` can be omitted if `source` is specified. `size` will then be set to the source image file size.
     * `size` can be omitted if `baseVolumeId` or `baseVolumeName` is specified. `size` will then be set to the base volume size.
     * If `size` is specified to be bigger than `baseVolumeId` or `baseVolumeName` size, you can use [cloudinit](https://cloudinit.readthedocs.io) if your OS supports it, with `libvirt.CloudInitDisk` and the [growpart](https://cloudinit.readthedocs.io/en/latest/topics/modules.html#growpart) module to resize the partition.
     */
    size?: pulumi.Input<number>;
    source?: pulumi.Input<string>;
    xml?: pulumi.Input<inputs.VolumeXml>;
}
