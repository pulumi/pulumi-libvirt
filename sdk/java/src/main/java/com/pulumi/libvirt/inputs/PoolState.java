// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.libvirt.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.libvirt.inputs.PoolXmlArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PoolState extends com.pulumi.resources.ResourceArgs {

    public static final PoolState Empty = new PoolState();

    @Import(name="allocation")
    private @Nullable Output<Integer> allocation;

    public Optional<Output<Integer>> allocation() {
        return Optional.ofNullable(this.allocation);
    }

    @Import(name="available")
    private @Nullable Output<String> available;

    public Optional<Output<String>> available() {
        return Optional.ofNullable(this.available);
    }

    @Import(name="capacity")
    private @Nullable Output<Integer> capacity;

    public Optional<Output<Integer>> capacity() {
        return Optional.ofNullable(this.capacity);
    }

    /**
     * A unique name for the resource, required by libvirt.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A unique name for the resource, required by libvirt.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The directory where the pool will keep all its volumes. This is only relevant to (and required by)
     * the &#34;dir&#34; type pools.
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    /**
     * @return The directory where the pool will keep all its volumes. This is only relevant to (and required by)
     * the &#34;dir&#34; type pools.
     * 
     */
    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * The type of the pool. Currently, only &#34;dir&#34; supported.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of the pool. Currently, only &#34;dir&#34; supported.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    @Import(name="xml")
    private @Nullable Output<PoolXmlArgs> xml;

    public Optional<Output<PoolXmlArgs>> xml() {
        return Optional.ofNullable(this.xml);
    }

    private PoolState() {}

    private PoolState(PoolState $) {
        this.allocation = $.allocation;
        this.available = $.available;
        this.capacity = $.capacity;
        this.name = $.name;
        this.path = $.path;
        this.type = $.type;
        this.xml = $.xml;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PoolState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PoolState $;

        public Builder() {
            $ = new PoolState();
        }

        public Builder(PoolState defaults) {
            $ = new PoolState(Objects.requireNonNull(defaults));
        }

        public Builder allocation(@Nullable Output<Integer> allocation) {
            $.allocation = allocation;
            return this;
        }

        public Builder allocation(Integer allocation) {
            return allocation(Output.of(allocation));
        }

        public Builder available(@Nullable Output<String> available) {
            $.available = available;
            return this;
        }

        public Builder available(String available) {
            return available(Output.of(available));
        }

        public Builder capacity(@Nullable Output<Integer> capacity) {
            $.capacity = capacity;
            return this;
        }

        public Builder capacity(Integer capacity) {
            return capacity(Output.of(capacity));
        }

        /**
         * @param name A unique name for the resource, required by libvirt.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A unique name for the resource, required by libvirt.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param path The directory where the pool will keep all its volumes. This is only relevant to (and required by)
         * the &#34;dir&#34; type pools.
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path The directory where the pool will keep all its volumes. This is only relevant to (and required by)
         * the &#34;dir&#34; type pools.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param type The type of the pool. Currently, only &#34;dir&#34; supported.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the pool. Currently, only &#34;dir&#34; supported.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public Builder xml(@Nullable Output<PoolXmlArgs> xml) {
            $.xml = xml;
            return this;
        }

        public Builder xml(PoolXmlArgs xml) {
            return xml(Output.of(xml));
        }

        public PoolState build() {
            return $;
        }
    }

}
