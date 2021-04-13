// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

export function getNetworkDnsSrvTemplate(args: GetNetworkDnsSrvTemplateArgs, opts?: pulumi.InvokeOptions): Promise<GetNetworkDnsSrvTemplateResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("libvirt:index/getNetworkDnsSrvTemplate:getNetworkDnsSrvTemplate", {
        "domain": args.domain,
        "port": args.port,
        "priority": args.priority,
        "protocol": args.protocol,
        "service": args.service,
        "target": args.target,
        "weight": args.weight,
    }, opts);
}

/**
 * A collection of arguments for invoking getNetworkDnsSrvTemplate.
 */
export interface GetNetworkDnsSrvTemplateArgs {
    readonly domain?: string;
    readonly port?: string;
    readonly priority?: string;
    readonly protocol: string;
    readonly service: string;
    readonly target?: string;
    readonly weight?: string;
}

/**
 * A collection of values returned by getNetworkDnsSrvTemplate.
 */
export interface GetNetworkDnsSrvTemplateResult {
    readonly domain?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly port?: string;
    readonly priority?: string;
    readonly protocol: string;
    readonly rendered: {[key: string]: any};
    readonly service: string;
    readonly target?: string;
    readonly weight?: string;
}