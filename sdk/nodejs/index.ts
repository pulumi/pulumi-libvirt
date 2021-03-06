// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

// Export members:
export * from "./cloudInitDisk";
export * from "./domain";
export * from "./getNetworkDnsHostTemplate";
export * from "./getNetworkDnsSrvTemplate";
export * from "./getNetworkDnsmasqOptionsTemplate";
export * from "./ignition";
export * from "./network";
export * from "./pool";
export * from "./provider";
export * from "./volume";

// Export sub-modules:
import * as config from "./config";
import * as types from "./types";

export {
    config,
    types,
};

// Import resources to register:
import { CloudInitDisk } from "./cloudInitDisk";
import { Domain } from "./domain";
import { Ignition } from "./ignition";
import { Network } from "./network";
import { Pool } from "./pool";
import { Volume } from "./volume";

const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "libvirt:index/cloudInitDisk:CloudInitDisk":
                return new CloudInitDisk(name, <any>undefined, { urn })
            case "libvirt:index/domain:Domain":
                return new Domain(name, <any>undefined, { urn })
            case "libvirt:index/ignition:Ignition":
                return new Ignition(name, <any>undefined, { urn })
            case "libvirt:index/network:Network":
                return new Network(name, <any>undefined, { urn })
            case "libvirt:index/pool:Pool":
                return new Pool(name, <any>undefined, { urn })
            case "libvirt:index/volume:Volume":
                return new Volume(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("libvirt", "index/cloudInitDisk", _module)
pulumi.runtime.registerResourceModule("libvirt", "index/domain", _module)
pulumi.runtime.registerResourceModule("libvirt", "index/ignition", _module)
pulumi.runtime.registerResourceModule("libvirt", "index/network", _module)
pulumi.runtime.registerResourceModule("libvirt", "index/pool", _module)
pulumi.runtime.registerResourceModule("libvirt", "index/volume", _module)

import { Provider } from "./provider";

pulumi.runtime.registerResourcePackage("libvirt", {
    version: utilities.getVersion(),
    constructProvider: (name: string, type: string, urn: string): pulumi.ProviderResource => {
        if (type !== "pulumi:providers:libvirt") {
            throw new Error(`unknown provider type ${type}`);
        }
        return new Provider(name, <any>undefined, { urn });
    },
});
