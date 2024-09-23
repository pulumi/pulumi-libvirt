// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.libvirt.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


public final class GetNodeDeviceInfoCapabilityIommuGroup extends com.pulumi.resources.InvokeArgs {

    public static final GetNodeDeviceInfoCapabilityIommuGroup Empty = new GetNodeDeviceInfoCapabilityIommuGroup();

    @Import(name="addresses", required=true)
    private List<Map<String,String>> addresses;

    public List<Map<String,String>> addresses() {
        return this.addresses;
    }

    /**
     * Device number
     * 
     */
    @Import(name="number", required=true)
    private String number;

    /**
     * @return Device number
     * 
     */
    public String number() {
        return this.number;
    }

    private GetNodeDeviceInfoCapabilityIommuGroup() {}

    private GetNodeDeviceInfoCapabilityIommuGroup(GetNodeDeviceInfoCapabilityIommuGroup $) {
        this.addresses = $.addresses;
        this.number = $.number;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNodeDeviceInfoCapabilityIommuGroup defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNodeDeviceInfoCapabilityIommuGroup $;

        public Builder() {
            $ = new GetNodeDeviceInfoCapabilityIommuGroup();
        }

        public Builder(GetNodeDeviceInfoCapabilityIommuGroup defaults) {
            $ = new GetNodeDeviceInfoCapabilityIommuGroup(Objects.requireNonNull(defaults));
        }

        public Builder addresses(List<Map<String,String>> addresses) {
            $.addresses = addresses;
            return this;
        }

        public Builder addresses(Map<String,String>... addresses) {
            return addresses(List.of(addresses));
        }

        /**
         * @param number Device number
         * 
         * @return builder
         * 
         */
        public Builder number(String number) {
            $.number = number;
            return this;
        }

        public GetNodeDeviceInfoCapabilityIommuGroup build() {
            if ($.addresses == null) {
                throw new MissingRequiredPropertyException("GetNodeDeviceInfoCapabilityIommuGroup", "addresses");
            }
            if ($.number == null) {
                throw new MissingRequiredPropertyException("GetNodeDeviceInfoCapabilityIommuGroup", "number");
            }
            return $;
        }
    }

}
