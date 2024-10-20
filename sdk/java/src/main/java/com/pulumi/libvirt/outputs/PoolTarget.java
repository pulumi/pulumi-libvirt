// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.libvirt.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PoolTarget {
    /**
     * @return **Deprecated** (Optional) use `path` in the `target` block.
     * 
     */
    private @Nullable String path;

    private PoolTarget() {}
    /**
     * @return **Deprecated** (Optional) use `path` in the `target` block.
     * 
     */
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PoolTarget defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String path;
        public Builder() {}
        public Builder(PoolTarget defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.path = defaults.path;
        }

        @CustomType.Setter
        public Builder path(@Nullable String path) {

            this.path = path;
            return this;
        }
        public PoolTarget build() {
            final var _resultValue = new PoolTarget();
            _resultValue.path = path;
            return _resultValue;
        }
    }
}
