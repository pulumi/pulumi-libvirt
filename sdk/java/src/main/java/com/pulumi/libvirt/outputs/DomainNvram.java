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
     * and `/etc/libvirt/qemu.conf` should contain:
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
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
     *     }
     * }
     * ```
     * 
     * In case you need (or want) to specify the path for the NVRAM store, the domain definition should
     * look like this:
     * 
     * Finally, if you want the initial values for the NVRAM to be overridden by custom initial values
     * coming from a template, the domain definition should look like this:
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
     * and `/etc/libvirt/qemu.conf` should contain:
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
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
     *     }
     * }
     * ```
     * 
     * In case you need (or want) to specify the path for the NVRAM store, the domain definition should
     * look like this:
     * 
     * Finally, if you want the initial values for the NVRAM to be overridden by custom initial values
     * coming from a template, the domain definition should look like this:
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
