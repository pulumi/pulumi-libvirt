// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.libvirt;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.libvirt.Utilities;
import com.pulumi.libvirt.VolumeArgs;
import com.pulumi.libvirt.inputs.VolumeState;
import com.pulumi.libvirt.outputs.VolumeXml;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a storage volume in libvirt. For more information see
 * [the official documentation](https://libvirt.org/formatstorage.html).
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.libvirt.Volume;
 * import com.pulumi.libvirt.VolumeArgs;
 * import com.pulumi.codegen.internal.KeyedValue;
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
 *         // Base OS image to use to create a cluster of different
 *         // nodes
 *         var opensuseLeap = new Volume("opensuseLeap", VolumeArgs.builder()
 *             .name("opensuse_leap")
 *             .source("http://download.opensuse.org/repositories/Cloud:/Images:/Leap_42.1/images/openSUSE-Leap-42.1-OpenStack.x86_64.qcow2")
 *             .build());
 * 
 *         // volume to attach to the "master" domain as main disk
 *         var master = new Volume("master", VolumeArgs.builder()
 *             .name("master.qcow2")
 *             .baseVolumeId(opensuseLeap.id())
 *             .build());
 * 
 *         // volumes to attach to the "workers" domains as main disk
 *         for (var i = 0; i < workersCount; i++) {
 *             new Volume("worker-" + i, VolumeArgs.builder()
 *                 .name(String.format("worker_%s.qcow2", range.value()))
 *                 .baseVolumeId(opensuseLeap.id())
 *                 .build());
 * 
 *         
 * }
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * &gt; **Tip:** when provisioning multiple domains using the same base image, create
 * a `libvirt.Volume` for the base image and then define the domain specific ones
 * as based on it. This way the image will not be modified and no extra disk space
 * is going to be used for the base image.
 * 
 */
@ResourceType(type="libvirt:index/volume:Volume")
public class Volume extends com.pulumi.resources.CustomResource {
    /**
     * The backing volume (CoW) to use for this volume.
     * 
     */
    @Export(name="baseVolumeId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> baseVolumeId;

    /**
     * @return The backing volume (CoW) to use for this volume.
     * 
     */
    public Output<Optional<String>> baseVolumeId() {
        return Codegen.optional(this.baseVolumeId);
    }
    /**
     * The name of the backing volume (CoW) to use
     * for this volume. Note well: when `base_volume_pool` is not specified the
     * volume is going to be searched inside of `pool`.
     * 
     */
    @Export(name="baseVolumeName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> baseVolumeName;

    /**
     * @return The name of the backing volume (CoW) to use
     * for this volume. Note well: when `base_volume_pool` is not specified the
     * volume is going to be searched inside of `pool`.
     * 
     */
    public Output<Optional<String>> baseVolumeName() {
        return Codegen.optional(this.baseVolumeName);
    }
    /**
     * The name of the storage pool containing the
     * volume defined by `base_volume_name`.
     * 
     */
    @Export(name="baseVolumePool", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> baseVolumePool;

    /**
     * @return The name of the storage pool containing the
     * volume defined by `base_volume_name`.
     * 
     */
    public Output<Optional<String>> baseVolumePool() {
        return Codegen.optional(this.baseVolumePool);
    }
    @Export(name="format", refs={String.class}, tree="[0]")
    private Output<String> format;

    public Output<String> format() {
        return this.format;
    }
    /**
     * A unique name for the resource, required by libvirt.
     * Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return A unique name for the resource, required by libvirt.
     * Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The storage pool where the resource will be created.
     * If not given, the `default` storage pool will be used.
     * 
     */
    @Export(name="pool", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> pool;

    /**
     * @return The storage pool where the resource will be created.
     * If not given, the `default` storage pool will be used.
     * 
     */
    public Output<Optional<String>> pool() {
        return Codegen.optional(this.pool);
    }
    /**
     * The size of the volume in bytes (if you don&#39;t like this,
     * help fix this issue.
     * If `source` is specified, `size` will be set to the source image file size.
     * `size` can be omitted if `source` is specified. `size` will then be set to the source image file size.
     * `size` can be omitted if `base_volume_id` or `base_volume_name` is specified. `size` will then be set to the base volume size.
     * If `size` is specified to be bigger than `base_volume_id` or `base_volume_name` size, you can use [cloudinit](https://cloudinit.readthedocs.io) if your OS supports it, with `libvirt.CloudInitDisk` and the [growpart](https://cloudinit.readthedocs.io/en/latest/topics/modules.html#growpart) module to resize the partition.
     * 
     */
    @Export(name="size", refs={Integer.class}, tree="[0]")
    private Output<Integer> size;

    /**
     * @return The size of the volume in bytes (if you don&#39;t like this,
     * help fix this issue.
     * If `source` is specified, `size` will be set to the source image file size.
     * `size` can be omitted if `source` is specified. `size` will then be set to the source image file size.
     * `size` can be omitted if `base_volume_id` or `base_volume_name` is specified. `size` will then be set to the base volume size.
     * If `size` is specified to be bigger than `base_volume_id` or `base_volume_name` size, you can use [cloudinit](https://cloudinit.readthedocs.io) if your OS supports it, with `libvirt.CloudInitDisk` and the [growpart](https://cloudinit.readthedocs.io/en/latest/topics/modules.html#growpart) module to resize the partition.
     * 
     */
    public Output<Integer> size() {
        return this.size;
    }
    @Export(name="source", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> source;

    public Output<Optional<String>> source() {
        return Codegen.optional(this.source);
    }
    @Export(name="xml", refs={VolumeXml.class}, tree="[0]")
    private Output</* @Nullable */ VolumeXml> xml;

    public Output<Optional<VolumeXml>> xml() {
        return Codegen.optional(this.xml);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Volume(String name) {
        this(name, VolumeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Volume(String name, @Nullable VolumeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Volume(String name, @Nullable VolumeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("libvirt:index/volume:Volume", name, args == null ? VolumeArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Volume(String name, Output<String> id, @Nullable VolumeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("libvirt:index/volume:Volume", name, state, makeResourceOptions(options, id));
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
    public static Volume get(String name, Output<String> id, @Nullable VolumeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Volume(name, id, state, options);
    }
}
