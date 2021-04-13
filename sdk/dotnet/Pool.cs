// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Libvirt
{
    /// <summary>
    /// Manages a storage pool in libvirt. Currently only directory-based storage pool are supported. For more information on
    /// storage pools in libvirt, see [the official documentation](https://libvirt.org/formatstorage.html).
    /// 
    /// **WARNING:** This is experimental API and may change in the future.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Libvirt = Pulumi.Libvirt;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         // A pool for all cluster volumes
    ///         var cluster = new Libvirt.Pool("cluster", new Libvirt.PoolArgs
    ///         {
    ///             Type = "dir",
    ///             Path = "/home/user/cluster_storage",
    ///         });
    ///         var opensuseLeap = new Libvirt.Volume("opensuseLeap", new Libvirt.VolumeArgs
    ///         {
    ///             Pool = cluster.Name,
    ///             Source = "http://download.opensuse.org/repositories/Cloud:/Images:/Leap_42.1/images/openSUSE-Leap-42.1-OpenStack.x86_64.qcow2",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// </summary>
    [LibvirtResourceType("libvirt:index/pool:Pool")]
    public partial class Pool : Pulumi.CustomResource
    {
        [Output("allocation")]
        public Output<int> Allocation { get; private set; } = null!;

        [Output("available")]
        public Output<string> Available { get; private set; } = null!;

        [Output("capacity")]
        public Output<int> Capacity { get; private set; } = null!;

        /// <summary>
        /// A unique name for the resource, required by libvirt.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The directory where the pool will keep all its volumes. This is only relevant to (and required by)
        /// the "dir" type pools.
        /// </summary>
        [Output("path")]
        public Output<string?> Path { get; private set; } = null!;

        /// <summary>
        /// The type of the pool. Currently, only "dir" supported.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        [Output("xml")]
        public Output<Outputs.PoolXml?> Xml { get; private set; } = null!;


        /// <summary>
        /// Create a Pool resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Pool(string name, PoolArgs args, CustomResourceOptions? options = null)
            : base("libvirt:index/pool:Pool", name, args ?? new PoolArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Pool(string name, Input<string> id, PoolState? state = null, CustomResourceOptions? options = null)
            : base("libvirt:index/pool:Pool", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Pool resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Pool Get(string name, Input<string> id, PoolState? state = null, CustomResourceOptions? options = null)
        {
            return new Pool(name, id, state, options);
        }
    }

    public sealed class PoolArgs : Pulumi.ResourceArgs
    {
        [Input("allocation")]
        public Input<int>? Allocation { get; set; }

        [Input("available")]
        public Input<string>? Available { get; set; }

        [Input("capacity")]
        public Input<int>? Capacity { get; set; }

        /// <summary>
        /// A unique name for the resource, required by libvirt.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The directory where the pool will keep all its volumes. This is only relevant to (and required by)
        /// the "dir" type pools.
        /// </summary>
        [Input("path")]
        public Input<string>? Path { get; set; }

        /// <summary>
        /// The type of the pool. Currently, only "dir" supported.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        [Input("xml")]
        public Input<Inputs.PoolXmlArgs>? Xml { get; set; }

        public PoolArgs()
        {
        }
    }

    public sealed class PoolState : Pulumi.ResourceArgs
    {
        [Input("allocation")]
        public Input<int>? Allocation { get; set; }

        [Input("available")]
        public Input<string>? Available { get; set; }

        [Input("capacity")]
        public Input<int>? Capacity { get; set; }

        /// <summary>
        /// A unique name for the resource, required by libvirt.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The directory where the pool will keep all its volumes. This is only relevant to (and required by)
        /// the "dir" type pools.
        /// </summary>
        [Input("path")]
        public Input<string>? Path { get; set; }

        /// <summary>
        /// The type of the pool. Currently, only "dir" supported.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        [Input("xml")]
        public Input<Inputs.PoolXmlGetArgs>? Xml { get; set; }

        public PoolState()
        {
        }
    }
}