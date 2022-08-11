// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.libvirt.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PoolXmlArgs extends com.pulumi.resources.ResourceArgs {

    public static final PoolXmlArgs Empty = new PoolXmlArgs();

    @Import(name="xslt")
    private @Nullable Output<String> xslt;

    public Optional<Output<String>> xslt() {
        return Optional.ofNullable(this.xslt);
    }

    private PoolXmlArgs() {}

    private PoolXmlArgs(PoolXmlArgs $) {
        this.xslt = $.xslt;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PoolXmlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PoolXmlArgs $;

        public Builder() {
            $ = new PoolXmlArgs();
        }

        public Builder(PoolXmlArgs defaults) {
            $ = new PoolXmlArgs(Objects.requireNonNull(defaults));
        }

        public Builder xslt(@Nullable Output<String> xslt) {
            $.xslt = xslt;
            return this;
        }

        public Builder xslt(String xslt) {
            return xslt(Output.of(xslt));
        }

        public PoolXmlArgs build() {
            return $;
        }
    }

}
