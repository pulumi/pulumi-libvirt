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
    public sealed class NetworkDnsSrv
    {
        /// <summary>
        /// The domain used by the DNS server.
        /// </summary>
        public readonly string? Domain;
        public readonly string? Port;
        public readonly string? Priority;
        public readonly string? Protocol;
        public readonly string? Service;
        public readonly string? Target;
        public readonly string? Weight;

        [OutputConstructor]
        private NetworkDnsSrv(
            string? domain,

            string? port,

            string? priority,

            string? protocol,

            string? service,

            string? target,

            string? weight)
        {
            Domain = domain;
            Port = port;
            Priority = priority;
            Protocol = protocol;
            Service = service;
            Target = target;
            Weight = weight;
        }
    }
}
