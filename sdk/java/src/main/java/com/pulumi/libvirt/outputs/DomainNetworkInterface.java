// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.libvirt.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DomainNetworkInterface {
    private @Nullable List<String> addresses;
    private @Nullable String bridge;
    private @Nullable String hostname;
    private @Nullable String mac;
    private @Nullable String macvtap;
    private @Nullable String networkId;
    private @Nullable String networkName;
    private @Nullable String passthrough;
    private @Nullable String vepa;
    private @Nullable Boolean waitForLease;

    private DomainNetworkInterface() {}
    public List<String> addresses() {
        return this.addresses == null ? List.of() : this.addresses;
    }
    public Optional<String> bridge() {
        return Optional.ofNullable(this.bridge);
    }
    public Optional<String> hostname() {
        return Optional.ofNullable(this.hostname);
    }
    public Optional<String> mac() {
        return Optional.ofNullable(this.mac);
    }
    public Optional<String> macvtap() {
        return Optional.ofNullable(this.macvtap);
    }
    public Optional<String> networkId() {
        return Optional.ofNullable(this.networkId);
    }
    public Optional<String> networkName() {
        return Optional.ofNullable(this.networkName);
    }
    public Optional<String> passthrough() {
        return Optional.ofNullable(this.passthrough);
    }
    public Optional<String> vepa() {
        return Optional.ofNullable(this.vepa);
    }
    public Optional<Boolean> waitForLease() {
        return Optional.ofNullable(this.waitForLease);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainNetworkInterface defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> addresses;
        private @Nullable String bridge;
        private @Nullable String hostname;
        private @Nullable String mac;
        private @Nullable String macvtap;
        private @Nullable String networkId;
        private @Nullable String networkName;
        private @Nullable String passthrough;
        private @Nullable String vepa;
        private @Nullable Boolean waitForLease;
        public Builder() {}
        public Builder(DomainNetworkInterface defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addresses = defaults.addresses;
    	      this.bridge = defaults.bridge;
    	      this.hostname = defaults.hostname;
    	      this.mac = defaults.mac;
    	      this.macvtap = defaults.macvtap;
    	      this.networkId = defaults.networkId;
    	      this.networkName = defaults.networkName;
    	      this.passthrough = defaults.passthrough;
    	      this.vepa = defaults.vepa;
    	      this.waitForLease = defaults.waitForLease;
        }

        @CustomType.Setter
        public Builder addresses(@Nullable List<String> addresses) {

            this.addresses = addresses;
            return this;
        }
        public Builder addresses(String... addresses) {
            return addresses(List.of(addresses));
        }
        @CustomType.Setter
        public Builder bridge(@Nullable String bridge) {

            this.bridge = bridge;
            return this;
        }
        @CustomType.Setter
        public Builder hostname(@Nullable String hostname) {

            this.hostname = hostname;
            return this;
        }
        @CustomType.Setter
        public Builder mac(@Nullable String mac) {

            this.mac = mac;
            return this;
        }
        @CustomType.Setter
        public Builder macvtap(@Nullable String macvtap) {

            this.macvtap = macvtap;
            return this;
        }
        @CustomType.Setter
        public Builder networkId(@Nullable String networkId) {

            this.networkId = networkId;
            return this;
        }
        @CustomType.Setter
        public Builder networkName(@Nullable String networkName) {

            this.networkName = networkName;
            return this;
        }
        @CustomType.Setter
        public Builder passthrough(@Nullable String passthrough) {

            this.passthrough = passthrough;
            return this;
        }
        @CustomType.Setter
        public Builder vepa(@Nullable String vepa) {

            this.vepa = vepa;
            return this;
        }
        @CustomType.Setter
        public Builder waitForLease(@Nullable Boolean waitForLease) {

            this.waitForLease = waitForLease;
            return this;
        }
        public DomainNetworkInterface build() {
            final var _resultValue = new DomainNetworkInterface();
            _resultValue.addresses = addresses;
            _resultValue.bridge = bridge;
            _resultValue.hostname = hostname;
            _resultValue.mac = mac;
            _resultValue.macvtap = macvtap;
            _resultValue.networkId = networkId;
            _resultValue.networkName = networkName;
            _resultValue.passthrough = passthrough;
            _resultValue.vepa = vepa;
            _resultValue.waitForLease = waitForLease;
            return _resultValue;
        }
    }
}
