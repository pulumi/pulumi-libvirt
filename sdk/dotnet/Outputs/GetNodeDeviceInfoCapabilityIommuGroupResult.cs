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
    public sealed class GetNodeDeviceInfoCapabilityIommuGroupResult
    {
        public readonly ImmutableArray<ImmutableDictionary<string, string>> Addresses;
        /// <summary>
        /// Device number
        /// </summary>
        public readonly string Number;

        [OutputConstructor]
        private GetNodeDeviceInfoCapabilityIommuGroupResult(
            ImmutableArray<ImmutableDictionary<string, string>> addresses,

            string number)
        {
            Addresses = addresses;
            Number = number;
        }
    }
}
