// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Libvirt.Inputs
{

    public sealed class NetworkRouteGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("cidr", required: true)]
        public Input<string> Cidr { get; set; } = null!;

        [Input("gateway", required: true)]
        public Input<string> Gateway { get; set; } = null!;

        public NetworkRouteGetArgs()
        {
        }
        public static new NetworkRouteGetArgs Empty => new NetworkRouteGetArgs();
    }
}
