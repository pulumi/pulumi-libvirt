// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.libvirt.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DomainNvram {
    /**
     * @return path to the file backing the NVRAM store for non-volatile variables. When provided,
     * this file must be writable and specific to this domain, as it will be updated when running the
     * domain. However, `libvirt` can  manage this automatically (and this is the recommended solution)
     * if a mapping for the firmware to a _variables file_ exists in `/etc/libvirt/qemu.conf:nvram`.
     * In that case, `libvirt` will copy that variables file into a file specific for this domain.
     * 
     */
    private String file;
    /**
     * @return path to the file used to override variables from the master NVRAM
     * store.
     * 
     */
    private @Nullable String template;

    private DomainNvram() {}
    /**
     * @return path to the file backing the NVRAM store for non-volatile variables. When provided,
     * this file must be writable and specific to this domain, as it will be updated when running the
     * domain. However, `libvirt` can  manage this automatically (and this is the recommended solution)
     * if a mapping for the firmware to a _variables file_ exists in `/etc/libvirt/qemu.conf:nvram`.
     * In that case, `libvirt` will copy that variables file into a file specific for this domain.
     * 
     */
    public String file() {
        return this.file;
    }
    /**
     * @return path to the file used to override variables from the master NVRAM
     * store.
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
            this.file = Objects.requireNonNull(file);
            return this;
        }
        @CustomType.Setter
        public Builder template(@Nullable String template) {
            this.template = template;
            return this;
        }
        public DomainNvram build() {
            final var o = new DomainNvram();
            o.file = file;
            o.template = template;
            return o;
        }
    }
}