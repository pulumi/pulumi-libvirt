// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";

export interface DomainBootDevice {
    devs?: pulumi.Input<pulumi.Input<string>[]>;
}

export interface DomainConsole {
    /**
     * IP address to listen on. Defaults to 127.0.0.1.
     */
    sourceHost?: pulumi.Input<string>;
    /**
     * Source path
     *
     * Additional attributes when type is "tcp":
     */
    sourcePath?: pulumi.Input<string>;
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
    sourceService?: pulumi.Input<string>;
    /**
     * Target port
     */
    targetPort: pulumi.Input<string>;
    /**
     * for the first console and defaults to `serial`.
     * Subsequent `console` blocks must have a different type - usually `virtio`.
     *
     * Additional attributes when type is "pty":
     */
    targetType?: pulumi.Input<string>;
    /**
     * Console device type. Valid values are "pty" and "tcp".
     */
    type: pulumi.Input<string>;
}

export interface DomainCpu {
    mode?: pulumi.Input<string>;
}

export interface DomainDisk {
    /**
     * The path to the host device to use as the block device for this disk. 
     *
     * While `volumeId`, `url`, `file` and `blockDevice` are optional, it is intended that you use one of them.
     */
    blockDevice?: pulumi.Input<string>;
    /**
     * The filename to use as the block device for this disk (read-only)
     */
    file?: pulumi.Input<string>;
    /**
     * Use a scsi controller for this disk.  The controller
     * model is set to `virtio-scsi`
     */
    scsi?: pulumi.Input<boolean>;
    /**
     * The http url to use as the block device for this disk (read-only)
     */
    url?: pulumi.Input<string>;
    /**
     * The volume id to use for this disk.
     */
    volumeId?: pulumi.Input<string>;
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
    wwn?: pulumi.Input<string>;
}

export interface DomainFilesystem {
    /**
     * specifies the security mode for accessing the source. By default
     * the `mapped` mode is chosen.
     */
    accessmode?: pulumi.Input<string>;
    /**
     * enables exporting filesystem as a readonly mount for guest, by
     * default read-only access is given.
     *
     * Example:
     */
    readonly?: pulumi.Input<boolean>;
    /**
     * the directory of the host to be shared with the guest.
     */
    source: pulumi.Input<string>;
    /**
     * an arbitrary string tag that is exported to the guest as a hint for
     * where to mount the source.
     */
    target: pulumi.Input<string>;
}

export interface DomainGraphics {
    /**
     * defaults to "yes"
     */
    autoport?: pulumi.Input<boolean>;
    /**
     * IP Address where the VNC listener should be started if
     * `listenType` is set to `address`. Defaults to 127.0.0.1
     */
    listenAddress?: pulumi.Input<string>;
    /**
     * "listen type", defaults to "none"
     */
    listenType?: pulumi.Input<string>;
    /**
     * the type of graphics emulation (default is "spice")
     */
    type?: pulumi.Input<string>;
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
    websocket?: pulumi.Input<number>;
}

export interface DomainNetworkInterface {
    /**
     * An IP address for this domain in this network.
     */
    addresses?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Provides a bridge from the VM directly to the LAN. This assumes
     * there is a bridge device on the host which has one or more of the hosts
     * physical NICs enslaved. The guest VM will have an associated _tun_ device
     * created and enslaved to the bridge. The IP range / network configuration is
     * whatever is used on the LAN. This provides the guest VM full incoming &
     * outgoing net access just like a physical machine.
     */
    bridge?: pulumi.Input<string>;
    /**
     * A hostname that will be assigned to this domain
     * resource in this network.
     */
    hostname?: pulumi.Input<string>;
    /**
     * The specific MAC address to use for this interface.
     */
    mac?: pulumi.Input<string>;
    /**
     * Packets whose destination is on the same host as where they
     * originate from are directly delivered to the target macvtap device. Both
     * origin and destination devices need to be in bridge mode for direct delivery.
     * If either one of them is in vepa mode, a VEPA capable bridge is required.
     */
    macvtap?: pulumi.Input<string>;
    networkId?: pulumi.Input<string>;
    networkName?: pulumi.Input<string>;
    /**
     * This feature attaches a virtual function of a SRIOV capable
     * NIC directly to a VM without losing the migration capability. All packets are
     * sent to the VF/IF of the configured network device. Depending on the
     * capabilities of the device additional prerequisites or limitations may apply;
     * for example, on Linux this requires kernel 2.6.38 or newer.
     *
     * Example of a `macvtap` interface:
     */
    passthrough?: pulumi.Input<string>;
    /**
     * All VMs' packets are sent to the external bridge. Packets whose
     * destination is a VM on the same host as where the packet originates from are
     * sent back to the host by the VEPA capable bridge (today's bridges are
     * typically not VEPA capable).
     */
    vepa?: pulumi.Input<string>;
    /**
     * When creating the domain resource, wait until the
     * network interface gets a DHCP lease from libvirt, so that the computed IP
     * addresses will be available when the domain is up and the plan applied.
     *
     * When connecting to a LAN, users can specify a target device with:
     */
    waitForLease?: pulumi.Input<boolean>;
}

export interface DomainNvram {
    file?: pulumi.Input<string>;
    /**
     * path to the file used to override variables from the master NVRAM
     * store.
     *
     * So you should typically use the firmware as this,
     */
    template?: pulumi.Input<string>;
}

export interface DomainTpm {
    /**
     * Path to TPM device on the host, ex: `/dev/tpm0`
     *
     * Additional attributes when `backendType` is "emulator":
     */
    backendDevicePath?: pulumi.Input<string>;
    /**
     * [Secret object](https://libvirt.org/formatsecret.html) for encrypting the TPM state
     */
    backendEncryptionSecret?: pulumi.Input<string>;
    /**
     * Keep the TPM state when a transient domain is powered off or undefined
     */
    backendPersistentState?: pulumi.Input<boolean>;
    /**
     * TPM backend, either `passthrough` or `emulator` (default: `emulator`)
     *
     * Additional attributes when `backendType` is "passthrough":
     */
    backendType?: pulumi.Input<string>;
    /**
     * TPM version
     */
    backendVersion?: pulumi.Input<string>;
    /**
     * TPM model provided to the guest
     */
    model?: pulumi.Input<string>;
}

export interface DomainVideo {
    /**
     * The type of hypervisor to use for the domain.  Defaults to `kvm`, other values can be found [here](https://libvirt.org/formatdomain.html#id1)
     */
    type?: pulumi.Input<string>;
}

export interface DomainXml {
    xslt?: pulumi.Input<string>;
}

export interface GetNodeDeviceInfoCapability {
    /**
     * If present, the MAC address of the device
     */
    address?: string;
    /**
     * Block device name
     */
    block?: string;
    /**
     * The bus within the host
     */
    bus?: string;
    /**
     * Holds key `type` that describes the type of network interface: `80203` for IEEE 802.3 or `80211` for IEEE 802.11
     */
    capability?: {[key: string]: string};
    /**
     * Device class
     */
    class?: string;
    description?: string;
    /**
     * Which device within the \
     */
    device?: string;
    /**
     * Device PCI domain
     */
    domain?: string;
    /**
     * Device drive type
     */
    driveType?: string;
    /**
     * Type of DRM device: `render` or `card`
     */
    drmType?: string;
    features?: string[];
    firmware?: {[key: string]: string};
    /**
     * Device PCI function
     */
    function?: string;
    hardware?: {[key: string]: string};
    /**
     * The SCSI host containing the device
     */
    host?: string;
    /**
     * The interface name tied to this device
     */
    interface?: string;
    /**
     * Structure that holds IOMMU Group `number` and the list of devices that are part of the group
     */
    iommuGroup?: inputs.GetNodeDeviceInfoCapabilityIommuGroup;
    /**
     * Optional to reflect the status of the link via `speed` and `state` keys
     */
    link?: {[key: string]: string};
    /**
     * Device logical block size
     */
    logicalBlockSize?: string;
    /**
     * The lun within the target
     */
    lun?: string;
    /**
     * Device model
     */
    model?: string;
    /**
     * Number of blocks on the device
     */
    numBlocks?: string;
    /**
     * Device number
     */
    number?: string;
    /**
     * If present, the product `id` and `name` from the device ROM
     */
    product?: {[key: string]: string};
    /**
     * Device protocol
     */
    protocol?: string;
    /**
     * The type of SCSI device
     */
    scsiType?: string;
    /**
     * Device serial number
     */
    serial?: string;
    /**
     * Device size in bytes
     */
    size?: string;
    /**
     * Device PCI slot
     */
    slot?: string;
    /**
     * Device subclass
     */
    subclass?: string;
    /**
     * The target within the bus
     */
    target?: string;
    /**
     * Device type: `pci`, `storage`, `usb`
     */
    type?: string;
    /**
     * This optionally provides the value from the 'unique_id' file found in the scsi_host's directory
     */
    uniqueId?: string;
    /**
     * If present, the vendor `id` and `name` from the device ROM
     */
    vendor?: {[key: string]: string};
}

export interface GetNodeDeviceInfoCapabilityArgs {
    /**
     * If present, the MAC address of the device
     */
    address?: pulumi.Input<string>;
    /**
     * Block device name
     */
    block?: pulumi.Input<string>;
    /**
     * The bus within the host
     */
    bus?: pulumi.Input<string>;
    /**
     * Holds key `type` that describes the type of network interface: `80203` for IEEE 802.3 or `80211` for IEEE 802.11
     */
    capability?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Device class
     */
    class?: pulumi.Input<string>;
    description?: pulumi.Input<string>;
    /**
     * Which device within the \
     */
    device?: pulumi.Input<string>;
    /**
     * Device PCI domain
     */
    domain?: pulumi.Input<string>;
    /**
     * Device drive type
     */
    driveType?: pulumi.Input<string>;
    /**
     * Type of DRM device: `render` or `card`
     */
    drmType?: pulumi.Input<string>;
    features?: pulumi.Input<pulumi.Input<string>[]>;
    firmware?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Device PCI function
     */
    function?: pulumi.Input<string>;
    hardware?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The SCSI host containing the device
     */
    host?: pulumi.Input<string>;
    /**
     * The interface name tied to this device
     */
    interface?: pulumi.Input<string>;
    /**
     * Structure that holds IOMMU Group `number` and the list of devices that are part of the group
     */
    iommuGroup?: pulumi.Input<inputs.GetNodeDeviceInfoCapabilityIommuGroupArgs>;
    /**
     * Optional to reflect the status of the link via `speed` and `state` keys
     */
    link?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Device logical block size
     */
    logicalBlockSize?: pulumi.Input<string>;
    /**
     * The lun within the target
     */
    lun?: pulumi.Input<string>;
    /**
     * Device model
     */
    model?: pulumi.Input<string>;
    /**
     * Number of blocks on the device
     */
    numBlocks?: pulumi.Input<string>;
    /**
     * Device number
     */
    number?: pulumi.Input<string>;
    /**
     * If present, the product `id` and `name` from the device ROM
     */
    product?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Device protocol
     */
    protocol?: pulumi.Input<string>;
    /**
     * The type of SCSI device
     */
    scsiType?: pulumi.Input<string>;
    /**
     * Device serial number
     */
    serial?: pulumi.Input<string>;
    /**
     * Device size in bytes
     */
    size?: pulumi.Input<string>;
    /**
     * Device PCI slot
     */
    slot?: pulumi.Input<string>;
    /**
     * Device subclass
     */
    subclass?: pulumi.Input<string>;
    /**
     * The target within the bus
     */
    target?: pulumi.Input<string>;
    /**
     * Device type: `pci`, `storage`, `usb`
     */
    type?: pulumi.Input<string>;
    /**
     * This optionally provides the value from the 'unique_id' file found in the scsi_host's directory
     */
    uniqueId?: pulumi.Input<string>;
    /**
     * If present, the vendor `id` and `name` from the device ROM
     */
    vendor?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

export interface GetNodeDeviceInfoCapabilityIommuGroup {
    addresses?: {[key: string]: string}[];
    /**
     * Device number
     */
    number?: string;
}

export interface GetNodeDeviceInfoCapabilityIommuGroupArgs {
    addresses?: pulumi.Input<pulumi.Input<{[key: string]: pulumi.Input<string>}>[]>;
    /**
     * Device number
     */
    number?: pulumi.Input<string>;
}

export interface NetworkDhcp {
    /**
     * when false, disable the DHCP server
     */
    enabled?: pulumi.Input<boolean>;
}

export interface NetworkDns {
    /**
     * when false, disable the DHCP server
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Either `address`, `domain`, or both must be set
     */
    forwarders?: pulumi.Input<pulumi.Input<inputs.NetworkDnsForwarder>[]>;
    /**
     * a DNS host entry block. You can have one or more of these
     * blocks in your DNS definition. You must specify both `ip` and `hostname`.
     *
     * An advanced example of round-robin DNS (using DNS host templates) follows:
     */
    hosts?: pulumi.Input<pulumi.Input<inputs.NetworkDnsHost>[]>;
    /**
     * true/false: true means 'do not forward unresolved requests for this domain to the part DNS server
     */
    localOnly?: pulumi.Input<boolean>;
    /**
     * a DNS SRV entry block. You can have one or more of these blocks
     * in your DNS definition. You must specify `service` and `protocol`.
     */
    srvs?: pulumi.Input<pulumi.Input<inputs.NetworkDnsSrv>[]>;
}

export interface NetworkDnsForwarder {
    address?: pulumi.Input<string>;
    /**
     * The domain used by the DNS server.
     */
    domain?: pulumi.Input<string>;
}

export interface NetworkDnsHost {
    hostname?: pulumi.Input<string>;
    ip?: pulumi.Input<string>;
}

export interface NetworkDnsSrv {
    /**
     * The domain used by the DNS server.
     */
    domain?: pulumi.Input<string>;
    port?: pulumi.Input<string>;
    priority?: pulumi.Input<string>;
    protocol?: pulumi.Input<string>;
    service?: pulumi.Input<string>;
    target?: pulumi.Input<string>;
    weight?: pulumi.Input<string>;
}

export interface NetworkDnsmasqOptions {
    /**
     * a Dnsmasq option entry block. You can have one or more of these
     * blocks in your definition. You must specify `optionName` while `optionValue` is
     * optional to support value-less options.
     *
     * An example of setting Dnsmasq options (using Dnsmasq option templates) follows:
     */
    options?: pulumi.Input<pulumi.Input<inputs.NetworkDnsmasqOptionsOption>[]>;
}

export interface NetworkDnsmasqOptionsOption {
    optionName?: pulumi.Input<string>;
    optionValue?: pulumi.Input<string>;
}

export interface NetworkRoute {
    cidr: pulumi.Input<string>;
    gateway: pulumi.Input<string>;
}

export interface NetworkXml {
    xslt?: pulumi.Input<string>;
}

export interface PoolSource {
    devices?: pulumi.Input<pulumi.Input<inputs.PoolSourceDevice>[]>;
    /**
     * A unique name for the resource, required by libvirt.
     */
    name?: pulumi.Input<string>;
}

export interface PoolSourceDevice {
    /**
     * **Deprecated** (Optional) use `path` in the `target` block.
     */
    path?: pulumi.Input<string>;
}

export interface PoolTarget {
    /**
     * **Deprecated** (Optional) use `path` in the `target` block.
     */
    path?: pulumi.Input<string>;
}

export interface PoolXml {
    xslt?: pulumi.Input<string>;
}

export interface VolumeXml {
    xslt?: pulumi.Input<string>;
}
