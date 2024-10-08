// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.libvirt.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetNodeDeviceInfoDevnode {
    /**
     * @return Full path of the device
     * 
     */
    private String path;
    /**
     * @return Device type: `pci`, `storage`, `usb`
     * 
     */
    private String type;

    private GetNodeDeviceInfoDevnode() {}
    /**
     * @return Full path of the device
     * 
     */
    public String path() {
        return this.path;
    }
    /**
     * @return Device type: `pci`, `storage`, `usb`
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNodeDeviceInfoDevnode defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String path;
        private String type;
        public Builder() {}
        public Builder(GetNodeDeviceInfoDevnode defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.path = defaults.path;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder path(String path) {
            if (path == null) {
              throw new MissingRequiredPropertyException("GetNodeDeviceInfoDevnode", "path");
            }
            this.path = path;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetNodeDeviceInfoDevnode", "type");
            }
            this.type = type;
            return this;
        }
        public GetNodeDeviceInfoDevnode build() {
            final var _resultValue = new GetNodeDeviceInfoDevnode();
            _resultValue.path = path;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
