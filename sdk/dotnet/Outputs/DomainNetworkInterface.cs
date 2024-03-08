// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Libvirt.Outputs
{

    [OutputType]
    public sealed class DomainNetworkInterface
    {
        /// <summary>
        /// An IP address for this domain in this network.
        /// </summary>
        public readonly ImmutableArray<string> Addresses;
        /// <summary>
        /// Provides a bridge from the VM directly to the LAN. This assumes
        /// there is a bridge device on the host which has one or more of the hosts
        /// physical NICs enslaved. The guest VM will have an associated _tun_ device
        /// created and enslaved to the bridge. The IP range / network configuration is
        /// whatever is used on the LAN. This provides the guest VM full incoming &amp;
        /// outgoing net access just like a physical machine.
        /// </summary>
        public readonly string? Bridge;
        /// <summary>
        /// A hostname that will be assigned to this domain
        /// resource in this network.
        /// </summary>
        public readonly string? Hostname;
        /// <summary>
        /// The specific MAC address to use for this interface.
        /// </summary>
        public readonly string? Mac;
        /// <summary>
        /// Packets whose destination is on the same host as where they
        /// originate from are directly delivered to the target macvtap device. Both
        /// origin and destination devices need to be in bridge mode for direct delivery.
        /// If either one of them is in vepa mode, a VEPA capable bridge is required.
        /// </summary>
        public readonly string? Macvtap;
        public readonly string? NetworkId;
        public readonly string? NetworkName;
        /// <summary>
        /// This feature attaches a virtual function of a SRIOV capable
        /// NIC directly to a VM without losing the migration capability. All packets are
        /// sent to the VF/IF of the configured network device. Depending on the
        /// capabilities of the device additional prerequisites or limitations may apply;
        /// for example, on Linux this requires kernel 2.6.38 or newer.
        /// 
        /// Example of a `macvtap` interface:
        /// </summary>
        public readonly string? Passthrough;
        /// <summary>
        /// All VMs' packets are sent to the external bridge. Packets whose
        /// destination is a VM on the same host as where the packet originates from are
        /// sent back to the host by the VEPA capable bridge (today's bridges are
        /// typically not VEPA capable).
        /// </summary>
        public readonly string? Vepa;
        /// <summary>
        /// When creating the domain resource, wait until the
        /// network interface gets a DHCP lease from libvirt, so that the computed IP
        /// addresses will be available when the domain is up and the plan applied.
        /// 
        /// When connecting to a LAN, users can specify a target device with:
        /// </summary>
        public readonly bool? WaitForLease;

        [OutputConstructor]
        private DomainNetworkInterface(
            ImmutableArray<string> addresses,

            string? bridge,

            string? hostname,

            string? mac,

            string? macvtap,

            string? networkId,

            string? networkName,

            string? passthrough,

            string? vepa,

            bool? waitForLease)
        {
            Addresses = addresses;
            Bridge = bridge;
            Hostname = hostname;
            Mac = mac;
            Macvtap = macvtap;
            NetworkId = networkId;
            NetworkName = networkName;
            Passthrough = passthrough;
            Vepa = vepa;
            WaitForLease = waitForLease;
        }
    }
}
