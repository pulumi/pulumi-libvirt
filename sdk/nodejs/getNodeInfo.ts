// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Retrieve information about the current node
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as libvirt from "@pulumi/libvirt";
 *
 * const node = libvirt.getNodeInfo({});
 * ```
 */
export function getNodeInfo(opts?: pulumi.InvokeOptions): Promise<GetNodeInfoResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("libvirt:index/getNodeInfo:getNodeInfo", {
    }, opts);
}

/**
 * A collection of values returned by getNodeInfo.
 */
export interface GetNodeInfoResult {
    /**
     * Number of CPU cores per each socket
     */
    readonly cpuCoresPerSocket: number;
    /**
     * Number of CPU cores in total
     */
    readonly cpuCoresTotal: number;
    /**
     * CPU Architecture, usually `x8664`
     */
    readonly cpuModel: string;
    /**
     * How many CPU sockets are present
     */
    readonly cpuSockets: number;
    /**
     * How many CPU Threads are available per each CPU core
     */
    readonly cpuThreadsPerCore: number;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The amount of memory installed, in KiB
     */
    readonly memoryTotalKb: number;
    /**
     * How many NUMA nodes/cells are available.
     */
    readonly numaNodes: number;
}
/**
 * Retrieve information about the current node
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as libvirt from "@pulumi/libvirt";
 *
 * const node = libvirt.getNodeInfo({});
 * ```
 */
export function getNodeInfoOutput(opts?: pulumi.InvokeOptions): pulumi.Output<GetNodeInfoResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("libvirt:index/getNodeInfo:getNodeInfo", {
    }, opts);
}