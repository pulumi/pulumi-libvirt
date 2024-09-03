// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.libvirt;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.libvirt.CloudInitDiskArgs;
import com.pulumi.libvirt.Utilities;
import com.pulumi.libvirt.inputs.CloudInitDiskState;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="libvirt:index/cloudInitDisk:CloudInitDisk")
public class CloudInitDisk extends com.pulumi.resources.CustomResource {
    /**
     * cloud-init user data.
     * 
     */
    @Export(name="metaData", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> metaData;

    /**
     * @return cloud-init user data.
     * 
     */
    public Output<Optional<String>> metaData() {
        return Codegen.optional(this.metaData);
    }
    /**
     * A unique name for the resource, required by libvirt.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return A unique name for the resource, required by libvirt.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * cloud-init network-config data.
     * 
     */
    @Export(name="networkConfig", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> networkConfig;

    /**
     * @return cloud-init network-config data.
     * 
     */
    public Output<Optional<String>> networkConfig() {
        return Codegen.optional(this.networkConfig);
    }
    /**
     * The pool where the resource will be created.
     * If not given, the `default` pool will be used.
     * For user_data, network_config and meta_data parameters have a look at upstream doc:
     * &lt;http://cloudinit.readthedocs.io/en/latest/topics/datasources/nocloud.html#datasource-nocloud&gt;
     * 
     */
    @Export(name="pool", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> pool;

    /**
     * @return The pool where the resource will be created.
     * If not given, the `default` pool will be used.
     * For user_data, network_config and meta_data parameters have a look at upstream doc:
     * &lt;http://cloudinit.readthedocs.io/en/latest/topics/datasources/nocloud.html#datasource-nocloud&gt;
     * 
     */
    public Output<Optional<String>> pool() {
        return Codegen.optional(this.pool);
    }
    /**
     * cloud-init user data.
     * 
     */
    @Export(name="userData", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> userData;

    /**
     * @return cloud-init user data.
     * 
     */
    public Output<Optional<String>> userData() {
        return Codegen.optional(this.userData);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CloudInitDisk(java.lang.String name) {
        this(name, CloudInitDiskArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CloudInitDisk(java.lang.String name, @Nullable CloudInitDiskArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CloudInitDisk(java.lang.String name, @Nullable CloudInitDiskArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("libvirt:index/cloudInitDisk:CloudInitDisk", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private CloudInitDisk(java.lang.String name, Output<java.lang.String> id, @Nullable CloudInitDiskState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("libvirt:index/cloudInitDisk:CloudInitDisk", name, state, makeResourceOptions(options, id), false);
    }

    private static CloudInitDiskArgs makeArgs(@Nullable CloudInitDiskArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? CloudInitDiskArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static CloudInitDisk get(java.lang.String name, Output<java.lang.String> id, @Nullable CloudInitDiskState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CloudInitDisk(name, id, state, options);
    }
}
