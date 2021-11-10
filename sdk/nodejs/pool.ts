// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Manages a storage pool in libvirt. Currently only directory-based storage pool are supported. For more information on
 * storage pools in libvirt, see [the official documentation](https://libvirt.org/formatstorage.html).
 *
 * **WARNING:** This is experimental API and may change in the future.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as libvirt from "@pulumi/libvirt";
 *
 * // A pool for all cluster volumes
 * const cluster = new libvirt.Pool("cluster", {
 *     type: "dir",
 *     path: "/home/user/cluster_storage",
 * });
 * const opensuseLeap = new libvirt.Volume("opensuseLeap", {
 *     pool: cluster.name,
 *     source: "http://download.opensuse.org/repositories/Cloud:/Images:/Leap_42.1/images/openSUSE-Leap-42.1-OpenStack.x86_64.qcow2",
 * });
 * ```
 */
export class Pool extends pulumi.CustomResource {
    /**
     * Get an existing Pool resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PoolState, opts?: pulumi.CustomResourceOptions): Pool {
        return new Pool(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'libvirt:index/pool:Pool';

    /**
     * Returns true if the given object is an instance of Pool.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Pool {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Pool.__pulumiType;
    }

    public readonly allocation!: pulumi.Output<number>;
    public readonly available!: pulumi.Output<string>;
    public readonly capacity!: pulumi.Output<number>;
    /**
     * A unique name for the resource, required by libvirt.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The directory where the pool will keep all its volumes. This is only relevant to (and required by)
     * the "dir" type pools.
     */
    public readonly path!: pulumi.Output<string | undefined>;
    /**
     * The type of the pool. Currently, only "dir" supported.
     */
    public readonly type!: pulumi.Output<string>;
    public readonly xml!: pulumi.Output<outputs.PoolXml | undefined>;

    /**
     * Create a Pool resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: PoolArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: PoolArgs | PoolState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as PoolState | undefined;
            inputs["allocation"] = state ? state.allocation : undefined;
            inputs["available"] = state ? state.available : undefined;
            inputs["capacity"] = state ? state.capacity : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["path"] = state ? state.path : undefined;
            inputs["type"] = state ? state.type : undefined;
            inputs["xml"] = state ? state.xml : undefined;
        } else {
            const args = argsOrState as PoolArgs | undefined;
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            inputs["allocation"] = args ? args.allocation : undefined;
            inputs["available"] = args ? args.available : undefined;
            inputs["capacity"] = args ? args.capacity : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["path"] = args ? args.path : undefined;
            inputs["type"] = args ? args.type : undefined;
            inputs["xml"] = args ? args.xml : undefined;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(Pool.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Pool resources.
 */
export interface PoolState {
    allocation?: pulumi.Input<number>;
    available?: pulumi.Input<string>;
    capacity?: pulumi.Input<number>;
    /**
     * A unique name for the resource, required by libvirt.
     */
    name?: pulumi.Input<string>;
    /**
     * The directory where the pool will keep all its volumes. This is only relevant to (and required by)
     * the "dir" type pools.
     */
    path?: pulumi.Input<string>;
    /**
     * The type of the pool. Currently, only "dir" supported.
     */
    type?: pulumi.Input<string>;
    xml?: pulumi.Input<inputs.PoolXml>;
}

/**
 * The set of arguments for constructing a Pool resource.
 */
export interface PoolArgs {
    allocation?: pulumi.Input<number>;
    available?: pulumi.Input<string>;
    capacity?: pulumi.Input<number>;
    /**
     * A unique name for the resource, required by libvirt.
     */
    name?: pulumi.Input<string>;
    /**
     * The directory where the pool will keep all its volumes. This is only relevant to (and required by)
     * the "dir" type pools.
     */
    path?: pulumi.Input<string>;
    /**
     * The type of the pool. Currently, only "dir" supported.
     */
    type: pulumi.Input<string>;
    xml?: pulumi.Input<inputs.PoolXml>;
}
