// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.libvirt.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetNetworkDnsmasqOptionsTemplatePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNetworkDnsmasqOptionsTemplatePlainArgs Empty = new GetNetworkDnsmasqOptionsTemplatePlainArgs();

    @Import(name="optionName", required=true)
    private String optionName;

    public String optionName() {
        return this.optionName;
    }

    @Import(name="optionValue", required=true)
    private String optionValue;

    public String optionValue() {
        return this.optionValue;
    }

    private GetNetworkDnsmasqOptionsTemplatePlainArgs() {}

    private GetNetworkDnsmasqOptionsTemplatePlainArgs(GetNetworkDnsmasqOptionsTemplatePlainArgs $) {
        this.optionName = $.optionName;
        this.optionValue = $.optionValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNetworkDnsmasqOptionsTemplatePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNetworkDnsmasqOptionsTemplatePlainArgs $;

        public Builder() {
            $ = new GetNetworkDnsmasqOptionsTemplatePlainArgs();
        }

        public Builder(GetNetworkDnsmasqOptionsTemplatePlainArgs defaults) {
            $ = new GetNetworkDnsmasqOptionsTemplatePlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder optionName(String optionName) {
            $.optionName = optionName;
            return this;
        }

        public Builder optionValue(String optionValue) {
            $.optionValue = optionValue;
            return this;
        }

        public GetNetworkDnsmasqOptionsTemplatePlainArgs build() {
            $.optionName = Objects.requireNonNull($.optionName, "expected parameter 'optionName' to be non-null");
            $.optionValue = Objects.requireNonNull($.optionValue, "expected parameter 'optionValue' to be non-null");
            return $;
        }
    }

}
