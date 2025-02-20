// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
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
 *     name: "cluster",
 *     type: "dir",
 *     target: {
 *         path: "/home/user/cluster_storage",
 *     },
 * });
 * const opensuseLeap = new libvirt.Volume("opensuse_leap", {
 *     name: "opensuse_leap",
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
    public readonly available!: pulumi.Output<number>;
    public readonly capacity!: pulumi.Output<number>;
    /**
     * A unique name for the resource, required by libvirt.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * **Deprecated** (Optional) use `path` in the `target` block.
     *
     * @deprecated use target.path instead
     */
    public readonly path!: pulumi.Output<string | undefined>;
    public readonly source!: pulumi.Output<outputs.PoolSource | undefined>;
    public readonly target!: pulumi.Output<outputs.PoolTarget>;
    /**
     * The type of the pool. Currently, "dir" and "logical" are supported.
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
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as PoolState | undefined;
            resourceInputs["allocation"] = state ? state.allocation : undefined;
            resourceInputs["available"] = state ? state.available : undefined;
            resourceInputs["capacity"] = state ? state.capacity : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["path"] = state ? state.path : undefined;
            resourceInputs["source"] = state ? state.source : undefined;
            resourceInputs["target"] = state ? state.target : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["xml"] = state ? state.xml : undefined;
        } else {
            const args = argsOrState as PoolArgs | undefined;
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            resourceInputs["allocation"] = args ? args.allocation : undefined;
            resourceInputs["available"] = args ? args.available : undefined;
            resourceInputs["capacity"] = args ? args.capacity : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["path"] = args ? args.path : undefined;
            resourceInputs["source"] = args ? args.source : undefined;
            resourceInputs["target"] = args ? args.target : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["xml"] = args ? args.xml : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Pool.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Pool resources.
 */
export interface PoolState {
    allocation?: pulumi.Input<number>;
    available?: pulumi.Input<number>;
    capacity?: pulumi.Input<number>;
    /**
     * A unique name for the resource, required by libvirt.
     */
    name?: pulumi.Input<string>;
    /**
     * **Deprecated** (Optional) use `path` in the `target` block.
     *
     * @deprecated use target.path instead
     */
    path?: pulumi.Input<string>;
    source?: pulumi.Input<inputs.PoolSource>;
    target?: pulumi.Input<inputs.PoolTarget>;
    /**
     * The type of the pool. Currently, "dir" and "logical" are supported.
     */
    type?: pulumi.Input<string>;
    xml?: pulumi.Input<inputs.PoolXml>;
}

/**
 * The set of arguments for constructing a Pool resource.
 */
export interface PoolArgs {
    allocation?: pulumi.Input<number>;
    available?: pulumi.Input<number>;
    capacity?: pulumi.Input<number>;
    /**
     * A unique name for the resource, required by libvirt.
     */
    name?: pulumi.Input<string>;
    /**
     * **Deprecated** (Optional) use `path` in the `target` block.
     *
     * @deprecated use target.path instead
     */
    path?: pulumi.Input<string>;
    source?: pulumi.Input<inputs.PoolSource>;
    target?: pulumi.Input<inputs.PoolTarget>;
    /**
     * The type of the pool. Currently, "dir" and "logical" are supported.
     */
    type: pulumi.Input<string>;
    xml?: pulumi.Input<inputs.PoolXml>;
}
