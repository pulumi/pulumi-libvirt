// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.libvirt.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PoolTargetArgs extends com.pulumi.resources.ResourceArgs {

    public static final PoolTargetArgs Empty = new PoolTargetArgs();

    /**
     * **Deprecated** (Optional) use `path` in the `target` block.
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    /**
     * @return **Deprecated** (Optional) use `path` in the `target` block.
     * 
     */
    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    private PoolTargetArgs() {}

    private PoolTargetArgs(PoolTargetArgs $) {
        this.path = $.path;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PoolTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PoolTargetArgs $;

        public Builder() {
            $ = new PoolTargetArgs();
        }

        public Builder(PoolTargetArgs defaults) {
            $ = new PoolTargetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param path **Deprecated** (Optional) use `path` in the `target` block.
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path **Deprecated** (Optional) use `path` in the `target` block.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        public PoolTargetArgs build() {
            return $;
        }
    }

}
