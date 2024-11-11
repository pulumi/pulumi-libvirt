// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Libvirt.Inputs
{

    public sealed class PoolSourceArgs : global::Pulumi.ResourceArgs
    {
        [Input("devices")]
        private InputList<Inputs.PoolSourceDeviceArgs>? _devices;
        public InputList<Inputs.PoolSourceDeviceArgs> Devices
        {
            get => _devices ?? (_devices = new InputList<Inputs.PoolSourceDeviceArgs>());
            set => _devices = value;
        }

        /// <summary>
        /// A unique name for the resource, required by libvirt.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public PoolSourceArgs()
        {
        }
        public static new PoolSourceArgs Empty => new PoolSourceArgs();
    }
}