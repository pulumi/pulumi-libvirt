// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.libvirt.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.libvirt.outputs.NetworkDnsForwarder;
import com.pulumi.libvirt.outputs.NetworkDnsHost;
import com.pulumi.libvirt.outputs.NetworkDnsSrv;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NetworkDns {
    /**
     * @return when false, disable the DHCP server
     * 
     */
    private final @Nullable Boolean enabled;
    /**
     * @return Either `address`, `domain`, or both must be set
     * 
     */
    private final @Nullable List<NetworkDnsForwarder> forwarders;
    /**
     * @return a DNS host entry block. You can have one or more of these
     * blocks in your DNS definition. You must specify both `ip` and `hostname`.
     * 
     */
    private final @Nullable List<NetworkDnsHost> hosts;
    /**
     * @return true/false: true means &#39;do not forward unresolved requests for this domain to the part DNS server
     * 
     */
    private final @Nullable Boolean localOnly;
    /**
     * @return a DNS SRV entry block. You can have one or more of these blocks
     * in your DNS definition. You must specify `service` and `protocol`.
     * 
     */
    private final @Nullable List<NetworkDnsSrv> srvs;

    @CustomType.Constructor
    private NetworkDns(
        @CustomType.Parameter("enabled") @Nullable Boolean enabled,
        @CustomType.Parameter("forwarders") @Nullable List<NetworkDnsForwarder> forwarders,
        @CustomType.Parameter("hosts") @Nullable List<NetworkDnsHost> hosts,
        @CustomType.Parameter("localOnly") @Nullable Boolean localOnly,
        @CustomType.Parameter("srvs") @Nullable List<NetworkDnsSrv> srvs) {
        this.enabled = enabled;
        this.forwarders = forwarders;
        this.hosts = hosts;
        this.localOnly = localOnly;
        this.srvs = srvs;
    }

    /**
     * @return when false, disable the DHCP server
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return Either `address`, `domain`, or both must be set
     * 
     */
    public List<NetworkDnsForwarder> forwarders() {
        return this.forwarders == null ? List.of() : this.forwarders;
    }
    /**
     * @return a DNS host entry block. You can have one or more of these
     * blocks in your DNS definition. You must specify both `ip` and `hostname`.
     * 
     */
    public List<NetworkDnsHost> hosts() {
        return this.hosts == null ? List.of() : this.hosts;
    }
    /**
     * @return true/false: true means &#39;do not forward unresolved requests for this domain to the part DNS server
     * 
     */
    public Optional<Boolean> localOnly() {
        return Optional.ofNullable(this.localOnly);
    }
    /**
     * @return a DNS SRV entry block. You can have one or more of these blocks
     * in your DNS definition. You must specify `service` and `protocol`.
     * 
     */
    public List<NetworkDnsSrv> srvs() {
        return this.srvs == null ? List.of() : this.srvs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkDns defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable List<NetworkDnsForwarder> forwarders;
        private @Nullable List<NetworkDnsHost> hosts;
        private @Nullable Boolean localOnly;
        private @Nullable List<NetworkDnsSrv> srvs;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkDns defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.forwarders = defaults.forwarders;
    	      this.hosts = defaults.hosts;
    	      this.localOnly = defaults.localOnly;
    	      this.srvs = defaults.srvs;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder forwarders(@Nullable List<NetworkDnsForwarder> forwarders) {
            this.forwarders = forwarders;
            return this;
        }
        public Builder forwarders(NetworkDnsForwarder... forwarders) {
            return forwarders(List.of(forwarders));
        }
        public Builder hosts(@Nullable List<NetworkDnsHost> hosts) {
            this.hosts = hosts;
            return this;
        }
        public Builder hosts(NetworkDnsHost... hosts) {
            return hosts(List.of(hosts));
        }
        public Builder localOnly(@Nullable Boolean localOnly) {
            this.localOnly = localOnly;
            return this;
        }
        public Builder srvs(@Nullable List<NetworkDnsSrv> srvs) {
            this.srvs = srvs;
            return this;
        }
        public Builder srvs(NetworkDnsSrv... srvs) {
            return srvs(List.of(srvs));
        }        public NetworkDns build() {
            return new NetworkDns(enabled, forwarders, hosts, localOnly, srvs);
        }
    }
}
