// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.libvirt.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VolumeXml {
    private @Nullable String xslt;

    private VolumeXml() {}
    public Optional<String> xslt() {
        return Optional.ofNullable(this.xslt);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeXml defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String xslt;
        public Builder() {}
        public Builder(VolumeXml defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.xslt = defaults.xslt;
        }

        @CustomType.Setter
        public Builder xslt(@Nullable String xslt) {
            this.xslt = xslt;
            return this;
        }
        public VolumeXml build() {
            final var o = new VolumeXml();
            o.xslt = xslt;
            return o;
        }
    }
}
