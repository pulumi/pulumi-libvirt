// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.libvirt.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class NetworkRoute {
    private String cidr;
    private String gateway;

    private NetworkRoute() {}
    public String cidr() {
        return this.cidr;
    }
    public String gateway() {
        return this.gateway;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkRoute defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String cidr;
        private String gateway;
        public Builder() {}
        public Builder(NetworkRoute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidr = defaults.cidr;
    	      this.gateway = defaults.gateway;
        }

        @CustomType.Setter
        public Builder cidr(String cidr) {
            if (cidr == null) {
              throw new MissingRequiredPropertyException("NetworkRoute", "cidr");
            }
            this.cidr = cidr;
            return this;
        }
        @CustomType.Setter
        public Builder gateway(String gateway) {
            if (gateway == null) {
              throw new MissingRequiredPropertyException("NetworkRoute", "gateway");
            }
            this.gateway = gateway;
            return this;
        }
        public NetworkRoute build() {
            final var _resultValue = new NetworkRoute();
            _resultValue.cidr = cidr;
            _resultValue.gateway = gateway;
            return _resultValue;
        }
    }
}
