// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.libvirt;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.libvirt.inputs.PoolSourceArgs;
import com.pulumi.libvirt.inputs.PoolTargetArgs;
import com.pulumi.libvirt.inputs.PoolXmlArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PoolArgs extends com.pulumi.resources.ResourceArgs {

    public static final PoolArgs Empty = new PoolArgs();

    @Import(name="allocation")
    private @Nullable Output<Integer> allocation;

    public Optional<Output<Integer>> allocation() {
        return Optional.ofNullable(this.allocation);
    }

    @Import(name="available")
    private @Nullable Output<Integer> available;

    public Optional<Output<Integer>> available() {
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
     * **Deprecated** (Optional) use `path` in the `target` block.
     * 
     * @deprecated
     * use target.path instead
     * 
     */
    @Deprecated /* use target.path instead */
    @Import(name="path")
    private @Nullable Output<String> path;

    /**
     * @return **Deprecated** (Optional) use `path` in the `target` block.
     * 
     * @deprecated
     * use target.path instead
     * 
     */
    @Deprecated /* use target.path instead */
    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    @Import(name="source")
    private @Nullable Output<PoolSourceArgs> source;

    public Optional<Output<PoolSourceArgs>> source() {
        return Optional.ofNullable(this.source);
    }

    @Import(name="target")
    private @Nullable Output<PoolTargetArgs> target;

    public Optional<Output<PoolTargetArgs>> target() {
        return Optional.ofNullable(this.target);
    }

    /**
     * The type of the pool. Currently, &#34;dir&#34; and &#34;logical&#34; are supported.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The type of the pool. Currently, &#34;dir&#34; and &#34;logical&#34; are supported.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    @Import(name="xml")
    private @Nullable Output<PoolXmlArgs> xml;

    public Optional<Output<PoolXmlArgs>> xml() {
        return Optional.ofNullable(this.xml);
    }

    private PoolArgs() {}

    private PoolArgs(PoolArgs $) {
        this.allocation = $.allocation;
        this.available = $.available;
        this.capacity = $.capacity;
        this.name = $.name;
        this.path = $.path;
        this.source = $.source;
        this.target = $.target;
        this.type = $.type;
        this.xml = $.xml;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PoolArgs $;

        public Builder() {
            $ = new PoolArgs();
        }

        public Builder(PoolArgs defaults) {
            $ = new PoolArgs(Objects.requireNonNull(defaults));
        }

        public Builder allocation(@Nullable Output<Integer> allocation) {
            $.allocation = allocation;
            return this;
        }

        public Builder allocation(Integer allocation) {
            return allocation(Output.of(allocation));
        }

        public Builder available(@Nullable Output<Integer> available) {
            $.available = available;
            return this;
        }

        public Builder available(Integer available) {
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
         * @param path **Deprecated** (Optional) use `path` in the `target` block.
         * 
         * @return builder
         * 
         * @deprecated
         * use target.path instead
         * 
         */
        @Deprecated /* use target.path instead */
        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path **Deprecated** (Optional) use `path` in the `target` block.
         * 
         * @return builder
         * 
         * @deprecated
         * use target.path instead
         * 
         */
        @Deprecated /* use target.path instead */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        public Builder source(@Nullable Output<PoolSourceArgs> source) {
            $.source = source;
            return this;
        }

        public Builder source(PoolSourceArgs source) {
            return source(Output.of(source));
        }

        public Builder target(@Nullable Output<PoolTargetArgs> target) {
            $.target = target;
            return this;
        }

        public Builder target(PoolTargetArgs target) {
            return target(Output.of(target));
        }

        /**
         * @param type The type of the pool. Currently, &#34;dir&#34; and &#34;logical&#34; are supported.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the pool. Currently, &#34;dir&#34; and &#34;logical&#34; are supported.
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

        public PoolArgs build() {
            if ($.type == null) {
                throw new MissingRequiredPropertyException("PoolArgs", "type");
            }
            return $;
        }
    }

}
