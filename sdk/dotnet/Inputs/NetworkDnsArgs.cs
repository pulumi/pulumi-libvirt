// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Libvirt.Inputs
{

    public sealed class NetworkDnsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// when false, disable the DHCP server
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("forwarders")]
        private InputList<Inputs.NetworkDnsForwarderArgs>? _forwarders;

        /// <summary>
        /// Either `address`, `domain`, or both must be set
        /// </summary>
        public InputList<Inputs.NetworkDnsForwarderArgs> Forwarders
        {
            get => _forwarders ?? (_forwarders = new InputList<Inputs.NetworkDnsForwarderArgs>());
            set => _forwarders = value;
        }

        [Input("hosts")]
        private InputList<Inputs.NetworkDnsHostArgs>? _hosts;

        /// <summary>
        /// a DNS host entry block. You can have one or more of these
        /// blocks in your DNS definition. You must specify both `ip` and `hostname`.
        /// </summary>
        public InputList<Inputs.NetworkDnsHostArgs> Hosts
        {
            get => _hosts ?? (_hosts = new InputList<Inputs.NetworkDnsHostArgs>());
            set => _hosts = value;
        }

        /// <summary>
        /// true/false: true means 'do not forward unresolved requests for this domain to the part DNS server
        /// </summary>
        [Input("localOnly")]
        public Input<bool>? LocalOnly { get; set; }

        [Input("srvs")]
        private InputList<Inputs.NetworkDnsSrvArgs>? _srvs;

        /// <summary>
        /// a DNS SRV entry block. You can have one or more of these blocks
        /// in your DNS definition. You must specify `service` and `protocol`.
        /// </summary>
        public InputList<Inputs.NetworkDnsSrvArgs> Srvs
        {
            get => _srvs ?? (_srvs = new InputList<Inputs.NetworkDnsSrvArgs>());
            set => _srvs = value;
        }

        public NetworkDnsArgs()
        {
        }
        public static new NetworkDnsArgs Empty => new NetworkDnsArgs();
    }
}
