// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.libvirt.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.libvirt.outputs.NetworkDnsmasqOptionsOption;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class NetworkDnsmasqOptions {
    /**
     * @return a Dnsmasq option entry block. You can have one or more of these
     * blocks in your definition. You must specify `option_name` while `option_value` is
     * optional to support value-less options.
     * 
     * An example of setting Dnsmasq options (using Dnsmasq option templates) follows:
     * 
     */
    private @Nullable List<NetworkDnsmasqOptionsOption> options;

    private NetworkDnsmasqOptions() {}
    /**
     * @return a Dnsmasq option entry block. You can have one or more of these
     * blocks in your definition. You must specify `option_name` while `option_value` is
     * optional to support value-less options.
     * 
     * An example of setting Dnsmasq options (using Dnsmasq option templates) follows:
     * 
     */
    public List<NetworkDnsmasqOptionsOption> options() {
        return this.options == null ? List.of() : this.options;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkDnsmasqOptions defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<NetworkDnsmasqOptionsOption> options;
        public Builder() {}
        public Builder(NetworkDnsmasqOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.options = defaults.options;
        }

        @CustomType.Setter
        public Builder options(@Nullable List<NetworkDnsmasqOptionsOption> options) {

            this.options = options;
            return this;
        }
        public Builder options(NetworkDnsmasqOptionsOption... options) {
            return options(List.of(options));
        }
        public NetworkDnsmasqOptions build() {
            final var _resultValue = new NetworkDnsmasqOptions();
            _resultValue.options = options;
            return _resultValue;
        }
    }
}
