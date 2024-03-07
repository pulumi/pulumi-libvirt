// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.libvirt.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DomainNvram {
    /**
     * @return The filename to use as the block device for this disk (read-only)
     * 
     */
    private String file;
    /**
     * @return path to the file used to override variables from the master NVRAM
     * store.
     * 
     * So you should typically use the firmware as this,
     * 
     */
    private @Nullable String template;

    private DomainNvram() {}
    /**
     * @return The filename to use as the block device for this disk (read-only)
     * 
     */
    public String file() {
        return this.file;
    }
    /**
     * @return path to the file used to override variables from the master NVRAM
     * store.
     * 
     * So you should typically use the firmware as this,
     * 
     */
    public Optional<String> template() {
        return Optional.ofNullable(this.template);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainNvram defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String file;
        private @Nullable String template;
        public Builder() {}
        public Builder(DomainNvram defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.file = defaults.file;
    	      this.template = defaults.template;
        }

        @CustomType.Setter
        public Builder file(String file) {
            if (file == null) {
              throw new MissingRequiredPropertyException("DomainNvram", "file");
            }
            this.file = file;
            return this;
        }
        @CustomType.Setter
        public Builder template(@Nullable String template) {

            this.template = template;
            return this;
        }
        public DomainNvram build() {
            final var _resultValue = new DomainNvram();
            _resultValue.file = file;
            _resultValue.template = template;
            return _resultValue;
        }
    }
}
