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
    public sealed class NetworkDns
    {
        /// <summary>
        /// when false, disable the DHCP server
        /// </summary>
        public readonly bool? Enabled;
        /// <summary>
        /// Either `address`, `domain`, or both must be set
        /// </summary>
        public readonly ImmutableArray<Outputs.NetworkDnsForwarder> Forwarders;
        /// <summary>
        /// a DNS host entry block. You can have one or more of these
        /// blocks in your DNS definition. You must specify both `ip` and `hostname`.
        /// </summary>
        public readonly ImmutableArray<Outputs.NetworkDnsHost> Hosts;
        /// <summary>
        /// true/false: true means 'do not forward unresolved requests for this domain to the part DNS server
        /// </summary>
        public readonly bool? LocalOnly;
        /// <summary>
        /// a DNS SRV entry block. You can have one or more of these blocks
        /// in your DNS definition. You must specify `service` and `protocol`.
        /// </summary>
        public readonly ImmutableArray<Outputs.NetworkDnsSrv> Srvs;

        [OutputConstructor]
        private NetworkDns(
            bool? enabled,

            ImmutableArray<Outputs.NetworkDnsForwarder> forwarders,

            ImmutableArray<Outputs.NetworkDnsHost> hosts,

            bool? localOnly,

            ImmutableArray<Outputs.NetworkDnsSrv> srvs)
        {
            Enabled = enabled;
            Forwarders = forwarders;
            Hosts = hosts;
            LocalOnly = localOnly;
            Srvs = srvs;
        }
    }
}