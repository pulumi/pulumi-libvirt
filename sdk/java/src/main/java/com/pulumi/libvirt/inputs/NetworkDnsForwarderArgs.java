// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.libvirt.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkDnsForwarderArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkDnsForwarderArgs Empty = new NetworkDnsForwarderArgs();

    @Import(name="address")
    private @Nullable Output<String> address;

    public Optional<Output<String>> address() {
        return Optional.ofNullable(this.address);
    }

    /**
     * The domain used by the DNS server.
     * 
     */
    @Import(name="domain")
    private @Nullable Output<String> domain;

    /**
     * @return The domain used by the DNS server.
     * 
     */
    public Optional<Output<String>> domain() {
        return Optional.ofNullable(this.domain);
    }

    private NetworkDnsForwarderArgs() {}

    private NetworkDnsForwarderArgs(NetworkDnsForwarderArgs $) {
        this.address = $.address;
        this.domain = $.domain;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkDnsForwarderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkDnsForwarderArgs $;

        public Builder() {
            $ = new NetworkDnsForwarderArgs();
        }

        public Builder(NetworkDnsForwarderArgs defaults) {
            $ = new NetworkDnsForwarderArgs(Objects.requireNonNull(defaults));
        }

        public Builder address(@Nullable Output<String> address) {
            $.address = address;
            return this;
        }

        public Builder address(String address) {
            return address(Output.of(address));
        }

        /**
         * @param domain The domain used by the DNS server.
         * 
         * @return builder
         * 
         */
        public Builder domain(@Nullable Output<String> domain) {
            $.domain = domain;
            return this;
        }

        /**
         * @param domain The domain used by the DNS server.
         * 
         * @return builder
         * 
         */
        public Builder domain(String domain) {
            return domain(Output.of(domain));
        }

        public NetworkDnsForwarderArgs build() {
            return $;
        }
    }

}
