// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Retrieve information about the devices present on the current node
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as libvirt from "@pulumi/libvirt";
 *
 * const node = libvirt.getNodeDevices({
 *     capability: "pci",
 * });
 * ```
 */
export function getNodeDevices(args?: GetNodeDevicesArgs, opts?: pulumi.InvokeOptions): Promise<GetNodeDevicesResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("libvirt:index/getNodeDevices:getNodeDevices", {
        "capability": args.capability,
    }, opts);
}

/**
 * A collection of arguments for invoking getNodeDevices.
 */
export interface GetNodeDevicesArgs {
    /**
     * The type of device, used to filter the output by capability type.
     * Can be one of `system`, `pci`, `usbDevice`,  `usb`,  `net`,  `scsiHost`,
     * `scsiTarget`,  `scsi`,  `storage`, `fcHost`,  `vports`, `scsiGeneric`, `drm`,
     * `mdev`, `mdevTypes`, `ccw`, `css`, `apCard`, `apQueue`, `apMatrix`.
     * Defaults to all active devices.
     */
    capability?: string;
}

/**
 * A collection of values returned by getNodeDevices.
 */
export interface GetNodeDevicesResult {
    readonly capability?: string;
    /**
     * A list of devices that match the selected capability
     */
    readonly devices: string[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
/**
 * Retrieve information about the devices present on the current node
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as libvirt from "@pulumi/libvirt";
 *
 * const node = libvirt.getNodeDevices({
 *     capability: "pci",
 * });
 * ```
 */
export function getNodeDevicesOutput(args?: GetNodeDevicesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetNodeDevicesResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("libvirt:index/getNodeDevices:getNodeDevices", {
        "capability": args.capability,
    }, opts);
}

/**
 * A collection of arguments for invoking getNodeDevices.
 */
export interface GetNodeDevicesOutputArgs {
    /**
     * The type of device, used to filter the output by capability type.
     * Can be one of `system`, `pci`, `usbDevice`,  `usb`,  `net`,  `scsiHost`,
     * `scsiTarget`,  `scsi`,  `storage`, `fcHost`,  `vports`, `scsiGeneric`, `drm`,
     * `mdev`, `mdevTypes`, `ccw`, `css`, `apCard`, `apQueue`, `apMatrix`.
     * Defaults to all active devices.
     */
    capability?: pulumi.Input<string>;
}
