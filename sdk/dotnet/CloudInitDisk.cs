// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Libvirt
{
    [LibvirtResourceType("libvirt:index/cloudInitDisk:CloudInitDisk")]
    public partial class CloudInitDisk : global::Pulumi.CustomResource
    {
        /// <summary>
        /// cloud-init user data.
        /// </summary>
        [Output("metaData")]
        public Output<string?> MetaData { get; private set; } = null!;

        /// <summary>
        /// A unique name for the resource, required by libvirt.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// cloud-init network-config data.
        /// </summary>
        [Output("networkConfig")]
        public Output<string?> NetworkConfig { get; private set; } = null!;

        /// <summary>
        /// The pool where the resource will be created.
        /// If not given, the `default` pool will be used.
        /// For user_data, network_config and meta_data parameters have a look at upstream doc:
        /// http://cloudinit.readthedocs.io/en/latest/topics/datasources/nocloud.html#datasource-nocloud
        /// </summary>
        [Output("pool")]
        public Output<string?> Pool { get; private set; } = null!;

        /// <summary>
        /// cloud-init user data.
        /// </summary>
        [Output("userData")]
        public Output<string?> UserData { get; private set; } = null!;


        /// <summary>
        /// Create a CloudInitDisk resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public CloudInitDisk(string name, CloudInitDiskArgs? args = null, CustomResourceOptions? options = null)
            : base("libvirt:index/cloudInitDisk:CloudInitDisk", name, args ?? new CloudInitDiskArgs(), MakeResourceOptions(options, ""))
        {
        }

        private CloudInitDisk(string name, Input<string> id, CloudInitDiskState? state = null, CustomResourceOptions? options = null)
            : base("libvirt:index/cloudInitDisk:CloudInitDisk", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing CloudInitDisk resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static CloudInitDisk Get(string name, Input<string> id, CloudInitDiskState? state = null, CustomResourceOptions? options = null)
        {
            return new CloudInitDisk(name, id, state, options);
        }
    }

    public sealed class CloudInitDiskArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// cloud-init user data.
        /// </summary>
        [Input("metaData")]
        public Input<string>? MetaData { get; set; }

        /// <summary>
        /// A unique name for the resource, required by libvirt.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// cloud-init network-config data.
        /// </summary>
        [Input("networkConfig")]
        public Input<string>? NetworkConfig { get; set; }

        /// <summary>
        /// The pool where the resource will be created.
        /// If not given, the `default` pool will be used.
        /// For user_data, network_config and meta_data parameters have a look at upstream doc:
        /// http://cloudinit.readthedocs.io/en/latest/topics/datasources/nocloud.html#datasource-nocloud
        /// </summary>
        [Input("pool")]
        public Input<string>? Pool { get; set; }

        /// <summary>
        /// cloud-init user data.
        /// </summary>
        [Input("userData")]
        public Input<string>? UserData { get; set; }

        public CloudInitDiskArgs()
        {
        }
        public static new CloudInitDiskArgs Empty => new CloudInitDiskArgs();
    }

    public sealed class CloudInitDiskState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// cloud-init user data.
        /// </summary>
        [Input("metaData")]
        public Input<string>? MetaData { get; set; }

        /// <summary>
        /// A unique name for the resource, required by libvirt.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// cloud-init network-config data.
        /// </summary>
        [Input("networkConfig")]
        public Input<string>? NetworkConfig { get; set; }

        /// <summary>
        /// The pool where the resource will be created.
        /// If not given, the `default` pool will be used.
        /// For user_data, network_config and meta_data parameters have a look at upstream doc:
        /// http://cloudinit.readthedocs.io/en/latest/topics/datasources/nocloud.html#datasource-nocloud
        /// </summary>
        [Input("pool")]
        public Input<string>? Pool { get; set; }

        /// <summary>
        /// cloud-init user data.
        /// </summary>
        [Input("userData")]
        public Input<string>? UserData { get; set; }

        public CloudInitDiskState()
        {
        }
        public static new CloudInitDiskState Empty => new CloudInitDiskState();
    }
}
