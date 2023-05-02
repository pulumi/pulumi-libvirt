// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.libvirt.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetNetworkDnsHostTemplateResult {
    private String hostname;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String ip;
    private Map<String,String> rendered;

    private GetNetworkDnsHostTemplateResult() {}
    public String hostname() {
        return this.hostname;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String ip() {
        return this.ip;
    }
    public Map<String,String> rendered() {
        return this.rendered;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkDnsHostTemplateResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String hostname;
        private String id;
        private String ip;
        private Map<String,String> rendered;
        public Builder() {}
        public Builder(GetNetworkDnsHostTemplateResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostname = defaults.hostname;
    	      this.id = defaults.id;
    	      this.ip = defaults.ip;
    	      this.rendered = defaults.rendered;
        }

        @CustomType.Setter
        public Builder hostname(String hostname) {
            this.hostname = Objects.requireNonNull(hostname);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder ip(String ip) {
            this.ip = Objects.requireNonNull(ip);
            return this;
        }
        @CustomType.Setter
        public Builder rendered(Map<String,String> rendered) {
            this.rendered = Objects.requireNonNull(rendered);
            return this;
        }
        public GetNetworkDnsHostTemplateResult build() {
            final var o = new GetNetworkDnsHostTemplateResult();
            o.hostname = hostname;
            o.id = id;
            o.ip = ip;
            o.rendered = rendered;
            return o;
        }
    }
}