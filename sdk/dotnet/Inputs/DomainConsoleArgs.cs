// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Libvirt.Inputs
{

    public sealed class DomainConsoleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// IP address to listen on. Defaults to 127.0.0.1.
        /// </summary>
        [Input("sourceHost")]
        public Input<string>? SourceHost { get; set; }

        /// <summary>
        /// Source path
        /// 
        /// Additional attributes when type is "tcp":
        /// </summary>
        [Input("sourcePath")]
        public Input<string>? SourcePath { get; set; }

        /// <summary>
        /// Port number or a service name. Defaults to a
        /// random port.
        /// 
        /// Note that you can repeat the `console` block to create more than one console.
        /// This works the same way as with the `disk` blocks (see above).
        /// 
        /// See [libvirt Domain XML Console element](https://libvirt.org/formatdomain.html#elementsConsole)
        /// for more information.
        /// </summary>
        [Input("sourceService")]
        public Input<string>? SourceService { get; set; }

        /// <summary>
        /// Target port
        /// </summary>
        [Input("targetPort", required: true)]
        public Input<string> TargetPort { get; set; } = null!;

        /// <summary>
        /// for the first console and defaults to `serial`.
        /// Subsequent `console` blocks must have a different type - usually `virtio`.
        /// 
        /// Additional attributes when type is "pty":
        /// </summary>
        [Input("targetType")]
        public Input<string>? TargetType { get; set; }

        /// <summary>
        /// the type of graphics emulation (default is "spice")
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public DomainConsoleArgs()
        {
        }
        public static new DomainConsoleArgs Empty => new DomainConsoleArgs();
    }
}
