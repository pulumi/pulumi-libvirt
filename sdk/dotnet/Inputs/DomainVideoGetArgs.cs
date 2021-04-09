// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Libvirt.Inputs
{

    public sealed class DomainVideoGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Console device type. Valid values are "pty" and "tcp".
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public DomainVideoGetArgs()
        {
        }
    }
}
