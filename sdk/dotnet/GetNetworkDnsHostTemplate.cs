// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi.Utilities;

namespace Pulumi.Libvirt
{
    public static class GetNetworkDnsHostTemplate
    {
        public static Task<GetNetworkDnsHostTemplateResult> InvokeAsync(GetNetworkDnsHostTemplateArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetNetworkDnsHostTemplateResult>("libvirt:index/getNetworkDnsHostTemplate:getNetworkDnsHostTemplate", args ?? new GetNetworkDnsHostTemplateArgs(), options.WithVersion());

        public static Output<GetNetworkDnsHostTemplateResult> Invoke(GetNetworkDnsHostTemplateInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetNetworkDnsHostTemplateResult>("libvirt:index/getNetworkDnsHostTemplate:getNetworkDnsHostTemplate", args ?? new GetNetworkDnsHostTemplateInvokeArgs(), options.WithVersion());
    }


    public sealed class GetNetworkDnsHostTemplateArgs : Pulumi.InvokeArgs
    {
        [Input("hostname", required: true)]
        public string Hostname { get; set; } = null!;

        [Input("ip", required: true)]
        public string Ip { get; set; } = null!;

        public GetNetworkDnsHostTemplateArgs()
        {
        }
    }

    public sealed class GetNetworkDnsHostTemplateInvokeArgs : Pulumi.InvokeArgs
    {
        [Input("hostname", required: true)]
        public Input<string> Hostname { get; set; } = null!;

        [Input("ip", required: true)]
        public Input<string> Ip { get; set; } = null!;

        public GetNetworkDnsHostTemplateInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetNetworkDnsHostTemplateResult
    {
        public readonly string Hostname;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Ip;
        public readonly ImmutableDictionary<string, string> Rendered;

        [OutputConstructor]
        private GetNetworkDnsHostTemplateResult(
            string hostname,

            string id,

            string ip,

            ImmutableDictionary<string, string> rendered)
        {
            Hostname = hostname;
            Id = id;
            Ip = ip;
            Rendered = rendered;
        }
    }
}
