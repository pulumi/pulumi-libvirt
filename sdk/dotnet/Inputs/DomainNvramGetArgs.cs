// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Libvirt.Inputs
{

    public sealed class DomainNvramGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("file", required: true)]
        public Input<string> File { get; set; } = null!;

        /// <summary>
        /// path to the file used to override variables from the master NVRAM
        /// store.
        /// 
        /// So you should typically use the firmware as this,
        /// </summary>
        [Input("template")]
        public Input<string>? Template { get; set; }

        public DomainNvramGetArgs()
        {
        }
        public static new DomainNvramGetArgs Empty => new DomainNvramGetArgs();
    }
}
