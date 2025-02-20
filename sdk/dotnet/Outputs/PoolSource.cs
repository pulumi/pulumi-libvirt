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
    public sealed class PoolSource
    {
        public readonly ImmutableArray<Outputs.PoolSourceDevice> Devices;
        /// <summary>
        /// A unique name for the resource, required by libvirt.
        /// </summary>
        public readonly string? Name;

        [OutputConstructor]
        private PoolSource(
            ImmutableArray<Outputs.PoolSourceDevice> devices,

            string? name)
        {
            Devices = devices;
            Name = name;
        }
    }
}
