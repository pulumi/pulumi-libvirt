// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";

export interface DomainBootDevice {
    devs?: string[];
}

export interface DomainConsole {
    /**
     * IP address to listen on. Defaults to 127.0.0.1.
     */
    sourceHost?: string;
    /**
     * Source path
     *
     * Additional attributes when type is "tcp":
     */
    sourcePath?: string;
    /**
     * Port number or a service name. Defaults to a
     * random port.
     *
     * Note that you can repeat the `console` block to create more than one console.
     * This works the same way as with the `disk` blocks (see above).
     *
     * See [libvirt Domain XML Console element](https://libvirt.org/formatdomain.html#elementsConsole)
     * for more information.
     */
    sourceService?: string;
    /**
     * Target port
     */
    targetPort: string;
    /**
     * for the first console and defaults to `serial`.
     * Subsequent `console` blocks must have a different type - usually `virtio`.
     *
     * Additional attributes when type is "pty":
     */
    targetType?: string;
    /**
     * Console device type. Valid values are "pty" and "tcp".
     */
    type: string;
}

export interface DomainCpu {
    mode: string;
}

export interface DomainDisk {
    /**
     * The path to the host device to use as the block device for this disk. 
     *
     * While `volumeId`, `url`, `file` and `blockDevice` are optional, it is intended that you use one of them.
     */
    blockDevice?: string;
    /**
     * The filename to use as the block device for this disk (read-only)
     */
    file?: string;
    /**
     * Use a scsi controller for this disk.  The controller
     * model is set to `virtio-scsi`
     */
    scsi?: boolean;
    /**
     * The http url to use as the block device for this disk (read-only)
     */
    url?: string;
    /**
     * The volume id to use for this disk.
     */
    volumeId?: string;
    /**
     * Specify a WWN to use for the disk if the disk is using
     * a scsi controller, if not specified then a random wwn is generated for the disk
     *
     *
     * ```typescript
     * import * as pulumi from "@pulumi/pulumi";
     * import * as libvirt from "@pulumi/libvirt";
     *
     * const leap = new libvirt.Volume("leap", {
     *     name: "leap",
     *     source: "http://someurl/openSUSE_Leap-42.1.qcow2",
     * });
     * const mydisk = new libvirt.Volume("mydisk", {
     *     name: "mydisk",
     *     baseVolumeId: leap.id,
     * });
     * const domain1 = new libvirt.Domain("domain1", {
     *     name: "domain1",
     *     disks: [
     *         {
     *             volumeId: mydisk.id,
     *             scsi: true,
     *         },
     *         {
     *             url: "http://foo.com/install.iso",
     *         },
     *         {
     *             file: "/absolute/path/to/disk.iso",
     *         },
     *         {
     *             blockDevice: "/dev/mapper/36005076802810e55400000000000145f",
     *         },
     *     ],
     * });
     * ```
     *
     * Also note that the `disk` block is actually a list of maps, so it is possible to
     * declare several of them by using either the literal list and map syntax as in
     * the following examples:
     */
    wwn?: string;
}

export interface DomainFilesystem {
    /**
     * specifies the security mode for accessing the source. By default
     * the `mapped` mode is chosen.
     */
    accessmode?: string;
    /**
     * enables exporting filesystem as a readonly mount for guest, by
     * default read-only access is given.
     *
     * Example:
     */
    readonly?: boolean;
    /**
     * the directory of the host to be shared with the guest.
     */
    source: string;
    /**
     * an arbitrary string tag that is exported to the guest as a hint for
     * where to mount the source.
     */
    target: string;
}

export interface DomainGraphics {
    /**
     * defaults to "yes"
     */
    autoport?: boolean;
    /**
     * IP Address where the VNC listener should be started if
     * `listenType` is set to `address`. Defaults to 127.0.0.1
     */
    listenAddress?: string;
    /**
     * "listen type", defaults to "none"
     */
    listenType?: string;
    /**
     * the type of graphics emulation (default is "spice")
     */
    type?: string;
    /**
     * Port to listen on for VNC WebSocket functionality (-1 meaning auto-allocation)
     *
     * On occasion we have found it necessary to set a `type` of `vnc` and a
     * `listenType` of `address` with certain builds of QEMU.
     *
     * With `listenAddress` it is possible to specify a listener address for the virtual
     * machines VNC server. Usually this is an IP of the host system.
     *
     * The `graphics` block will look as follows:
     */
    websocket?: number;
}

export interface DomainNetworkInterface {
    addresses: string[];
    bridge?: string;
    hostname: string;
    mac: string;
    macvtap?: string;
    networkId: string;
    networkName: string;
    passthrough?: string;
    vepa?: string;
    waitForLease?: boolean;
}

export interface DomainNvram {
    file: string;
    template?: string;
}

export interface DomainTpm {
    /**
     * Path to TPM device on the host, ex: `/dev/tpm0`
     *
     * Additional attributes when `backendType` is "emulator":
     */
    backendDevicePath?: string;
    /**
     * [Secret object](https://libvirt.org/formatsecret.html) for encrypting the TPM state
     */
    backendEncryptionSecret?: string;
    /**
     * Keep the TPM state when a transient domain is powered off or undefined
     */
    backendPersistentState?: boolean;
    /**
     * TPM backend, either `passthrough` or `emulator` (default: `emulator`)
     *
     * Additional attributes when `backendType` is "passthrough":
     */
    backendType?: string;
    /**
     * TPM version
     */
    backendVersion?: string;
    /**
     * TPM model provided to the guest
     */
    model?: string;
}

export interface DomainVideo {
    /**
     * The type of hypervisor to use for the domain.  Defaults to `kvm`, other values can be found [here](https://libvirt.org/formatdomain.html#id1)
     */
    type?: string;
}

export interface DomainXml {
    xslt?: string;
}

export interface NetworkDhcp {
    enabled: boolean;
}

export interface NetworkDns {
    enabled?: boolean;
    /**
     * Either `address`, `domain`, or both must be set
     */
    forwarders?: outputs.NetworkDnsForwarder[];
    /**
     * a DNS host entry block. You can have one or more of these
     * blocks in your DNS definition. You must specify both `ip` and `hostname`.
     *
     * An advanced example of round-robin DNS (using DNS host templates) follows:
     */
    hosts?: outputs.NetworkDnsHost[];
    /**
     * true/false: true means 'do not forward unresolved requests for this domain to the part DNS server
     */
    localOnly?: boolean;
    /**
     * a DNS SRV entry block. You can have one or more of these blocks
     * in your DNS definition. You must specify `service` and `protocol`.
     */
    srvs?: outputs.NetworkDnsSrv[];
}

export interface NetworkDnsForwarder {
    address?: string;
    /**
     * The domain used by the DNS server.
     */
    domain?: string;
}

export interface NetworkDnsHost {
    hostname?: string;
    ip?: string;
}

export interface NetworkDnsSrv {
    /**
     * The domain used by the DNS server.
     */
    domain?: string;
    port?: string;
    priority?: string;
    protocol?: string;
    service?: string;
    target?: string;
    weight?: string;
}

export interface NetworkDnsmasqOptions {
    options?: outputs.NetworkDnsmasqOptionsOption[];
}

export interface NetworkDnsmasqOptionsOption {
    optionName?: string;
    optionValue?: string;
}

export interface NetworkRoute {
    cidr: string;
    gateway: string;
}

export interface NetworkXml {
    xslt?: string;
}

export interface PoolXml {
    xslt?: string;
}

export interface VolumeXml {
    xslt?: string;
}

