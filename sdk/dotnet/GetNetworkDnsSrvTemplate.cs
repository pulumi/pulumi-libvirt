// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Libvirt
{
    public static class GetNetworkDnsSrvTemplate
    {
        public static Task<GetNetworkDnsSrvTemplateResult> InvokeAsync(GetNetworkDnsSrvTemplateArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetNetworkDnsSrvTemplateResult>("libvirt:index/getNetworkDnsSrvTemplate:getNetworkDnsSrvTemplate", args ?? new GetNetworkDnsSrvTemplateArgs(), options.WithVersion());
    }


    public sealed class GetNetworkDnsSrvTemplateArgs : Pulumi.InvokeArgs
    {
        [Input("domain")]
        public string? Domain { get; set; }

        [Input("port")]
        public string? Port { get; set; }

        [Input("priority")]
        public string? Priority { get; set; }

        [Input("protocol", required: true)]
        public string Protocol { get; set; } = null!;

        [Input("service", required: true)]
        public string Service { get; set; } = null!;

        [Input("target")]
        public string? Target { get; set; }

        [Input("weight")]
        public string? Weight { get; set; }

        public GetNetworkDnsSrvTemplateArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetNetworkDnsSrvTemplateResult
    {
        public readonly string? Domain;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string? Port;
        public readonly string? Priority;
        public readonly string Protocol;
        public readonly ImmutableDictionary<string, object> Rendered;
        public readonly string Service;
        public readonly string? Target;
        public readonly string? Weight;

        [OutputConstructor]
        private GetNetworkDnsSrvTemplateResult(
            string? domain,

            string id,

            string? port,

            string? priority,

            string protocol,

            ImmutableDictionary<string, object> rendered,

            string service,

            string? target,

            string? weight)
        {
            Domain = domain;
            Id = id;
            Port = port;
            Priority = priority;
            Protocol = protocol;
            Rendered = rendered;
            Service = service;
            Target = target;
            Weight = weight;
        }
    }
}
