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
    public sealed class DomainGraphics
    {
        /// <summary>
        /// defaults to "yes"
        /// </summary>
        public readonly bool? Autoport;
        /// <summary>
        /// IP Address where the VNC listener should be started if
        /// `listen_type` is set to `address`. Defaults to 127.0.0.1
        /// </summary>
        public readonly string? ListenAddress;
        /// <summary>
        /// "listen type", defaults to "none"
        /// </summary>
        public readonly string? ListenType;
        /// <summary>
        /// The type of hypervisor to use for the domain.  Defaults to `kvm`, other values can be found [here](https://libvirt.org/formatdomain.html#id1)
        /// </summary>
        public readonly string? Type;
        /// <summary>
        /// Port to listen on for VNC WebSocket functionality (-1 meaning auto-allocation)
        /// 
        /// On occasion we have found it necessary to set a `type` of `vnc` and a
        /// `listen_type` of `address` with certain builds of QEMU.
        /// 
        /// With `listen_address` it is possible to specify a listener address for the virtual
        /// machines VNC server. Usually this is an IP of the host system.
        /// 
        /// The `graphics` block will look as follows:
        /// 
        /// 
        /// The video card type can be changed from libvirt default `cirrus` to
        /// `vga` or others as described in [Video Card Elements](https://libvirt.org/formatdomain.html#elementsVideo)
        /// 
        /// 
        /// &gt; **Note well:** the `graphics` block is ignored for the architectures
        /// `s390x` and `ppc64`.
        /// </summary>
        public readonly int? Websocket;

        [OutputConstructor]
        private DomainGraphics(
            bool? autoport,

            string? listenAddress,

            string? listenType,

            string? type,

            int? websocket)
        {
            Autoport = autoport;
            ListenAddress = listenAddress;
            ListenType = listenType;
            Type = type;
            Websocket = websocket;
        }
    }
}
