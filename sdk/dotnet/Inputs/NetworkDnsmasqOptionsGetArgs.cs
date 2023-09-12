// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Libvirt.Inputs
{

    public sealed class NetworkDnsmasqOptionsGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("options")]
        private InputList<Inputs.NetworkDnsmasqOptionsOptionGetArgs>? _options;

        /// <summary>
        /// a Dnsmasq option entry block. You can have one or more of these
        /// blocks in your definition. You must specify both `option_name` and `option_value`.
        /// 
        /// An example of setting Dnsmasq options (using Dnsmasq option templates) follows:
        /// </summary>
        public InputList<Inputs.NetworkDnsmasqOptionsOptionGetArgs> Options
        {
            get => _options ?? (_options = new InputList<Inputs.NetworkDnsmasqOptionsOptionGetArgs>());
            set => _options = value;
        }

        public NetworkDnsmasqOptionsGetArgs()
        {
        }
        public static new NetworkDnsmasqOptionsGetArgs Empty => new NetworkDnsmasqOptionsGetArgs();
    }
}
