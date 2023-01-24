// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.libvirt;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.libvirt.PoolArgs;
import com.pulumi.libvirt.Utilities;
import com.pulumi.libvirt.inputs.PoolState;
import com.pulumi.libvirt.outputs.PoolXml;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a storage pool in libvirt. Currently only directory-based storage pool are supported. For more information on
 * storage pools in libvirt, see [the official documentation](https://libvirt.org/formatstorage.html).
 * 
 * **WARNING:** This is experimental API and may change in the future.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.libvirt.Pool;
 * import com.pulumi.libvirt.PoolArgs;
 * import com.pulumi.libvirt.Volume;
 * import com.pulumi.libvirt.VolumeArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var cluster = new Pool(&#34;cluster&#34;, PoolArgs.builder()        
 *             .type(&#34;dir&#34;)
 *             .path(&#34;/home/user/cluster_storage&#34;)
 *             .build());
 * 
 *         var opensuseLeap = new Volume(&#34;opensuseLeap&#34;, VolumeArgs.builder()        
 *             .pool(cluster.name())
 *             .source(&#34;http://download.opensuse.org/repositories/Cloud:/Images:/Leap_42.1/images/openSUSE-Leap-42.1-OpenStack.x86_64.qcow2&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 */
@ResourceType(type="libvirt:index/pool:Pool")
public class Pool extends com.pulumi.resources.CustomResource {
    @Export(name="allocation", type=Integer.class, parameters={})
    private Output<Integer> allocation;

    public Output<Integer> allocation() {
        return this.allocation;
    }
    @Export(name="available", type=Integer.class, parameters={})
    private Output<Integer> available;

    public Output<Integer> available() {
        return this.available;
    }
    @Export(name="capacity", type=Integer.class, parameters={})
    private Output<Integer> capacity;

    public Output<Integer> capacity() {
        return this.capacity;
    }
    /**
     * A unique name for the resource, required by libvirt.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A unique name for the resource, required by libvirt.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The directory where the pool will keep all its volumes. This is only relevant to (and required by)
     * the &#34;dir&#34; type pools.
     * 
     */
    @Export(name="path", type=String.class, parameters={})
    private Output</* @Nullable */ String> path;

    /**
     * @return The directory where the pool will keep all its volumes. This is only relevant to (and required by)
     * the &#34;dir&#34; type pools.
     * 
     */
    public Output<Optional<String>> path() {
        return Codegen.optional(this.path);
    }
    /**
     * The type of the pool. Currently, only &#34;dir&#34; supported.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the pool. Currently, only &#34;dir&#34; supported.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    @Export(name="xml", type=PoolXml.class, parameters={})
    private Output</* @Nullable */ PoolXml> xml;

    public Output<Optional<PoolXml>> xml() {
        return Codegen.optional(this.xml);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Pool(String name) {
        this(name, PoolArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Pool(String name, PoolArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Pool(String name, PoolArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("libvirt:index/pool:Pool", name, args == null ? PoolArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Pool(String name, Output<String> id, @Nullable PoolState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("libvirt:index/pool:Pool", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
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
    public static Pool get(String name, Output<String> id, @Nullable PoolState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Pool(name, id, state, options);
    }
}
