// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.libvirt;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.libvirt.NetworkArgs;
import com.pulumi.libvirt.Utilities;
import com.pulumi.libvirt.inputs.NetworkState;
import com.pulumi.libvirt.outputs.NetworkDhcp;
import com.pulumi.libvirt.outputs.NetworkDns;
import com.pulumi.libvirt.outputs.NetworkDnsmasqOptions;
import com.pulumi.libvirt.outputs.NetworkRoute;
import com.pulumi.libvirt.outputs.NetworkXml;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a VM network resource within libvirt. For more information see
 * [the official documentation](https://libvirt.org/formatnetwork.html).
 * 
 */
@ResourceType(type="libvirt:index/network:Network")
public class Network extends com.pulumi.resources.CustomResource {
    /**
     * A list of (0 or 1) IPv4 and (0 or 1) IPv6 subnets in
     * CIDR notation.  This defines the subnets associated to that network.
     * This argument is also used to define the address on the real host.
     * If `dhcp {  enabled = true }` addresses is also used to define the address range served by
     * the DHCP server.
     * No DHCP server will be started if `addresses` is omitted.
     * 
     */
    @Export(name="addresses", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> addresses;

    /**
     * @return A list of (0 or 1) IPv4 and (0 or 1) IPv6 subnets in
     * CIDR notation.  This defines the subnets associated to that network.
     * This argument is also used to define the address on the real host.
     * If `dhcp {  enabled = true }` addresses is also used to define the address range served by
     * the DHCP server.
     * No DHCP server will be started if `addresses` is omitted.
     * 
     */
    public Output<Optional<List<String>>> addresses() {
        return Codegen.optional(this.addresses);
    }
    /**
     * Set to `true` to start the network on host boot up.
     * If not specified `false` is assumed.
     * 
     */
    @Export(name="autostart", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> autostart;

    /**
     * @return Set to `true` to start the network on host boot up.
     * If not specified `false` is assumed.
     * 
     */
    public Output<Boolean> autostart() {
        return this.autostart;
    }
    /**
     * The bridge device defines the name of a bridge
     * device which will be used to construct the virtual network (when not provided,
     * it will be automatically obtained by libvirt in `none`, `nat`, `route` and `open` modes).
     * 
     */
    @Export(name="bridge", refs={String.class}, tree="[0]")
    private Output<String> bridge;

    /**
     * @return The bridge device defines the name of a bridge
     * device which will be used to construct the virtual network (when not provided,
     * it will be automatically obtained by libvirt in `none`, `nat`, `route` and `open` modes).
     * 
     */
    public Output<String> bridge() {
        return this.bridge;
    }
    @Export(name="dhcp", refs={NetworkDhcp.class}, tree="[0]")
    private Output<NetworkDhcp> dhcp;

    public Output<NetworkDhcp> dhcp() {
        return this.dhcp;
    }
    /**
     * configuration of DNS specific settings for the network
     * 
     */
    @Export(name="dns", refs={NetworkDns.class}, tree="[0]")
    private Output<NetworkDns> dns;

    /**
     * @return configuration of DNS specific settings for the network
     * 
     */
    public Output<NetworkDns> dns() {
        return this.dns;
    }
    @Export(name="dnsmasqOptions", refs={NetworkDnsmasqOptions.class}, tree="[0]")
    private Output</* @Nullable */ NetworkDnsmasqOptions> dnsmasqOptions;

    public Output<Optional<NetworkDnsmasqOptions>> dnsmasqOptions() {
        return Codegen.optional(this.dnsmasqOptions);
    }
    /**
     * The domain used by the DNS server.
     * 
     */
    @Export(name="domain", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> domain;

    /**
     * @return The domain used by the DNS server.
     * 
     */
    public Output<Optional<String>> domain() {
        return Codegen.optional(this.domain);
    }
    /**
     * One of:
     * - &#34;none&#34;: the guests can talk to each other and the host OS, but cannot reach
     *   any other machines on the LAN.
     * - &#34;nat&#34;: it is the default network mode. This is a configuration that
     *   allows guest OS to get outbound connectivity regardless of whether the host
     *   uses ethernet, wireless, dialup, or VPN networking without requiring any
     *   specific admin configuration. In the absence of host networking, it at
     *   least allows guests to talk directly to each other.
     * - &#34;route&#34;: this is a variant on the default network which routes traffic from
     *   the virtual network to the LAN **without applying any NAT**. It requires that
     *   the IP address range be pre-configured in the routing tables of the router
     *   on the host network.
     * - &#34;open&#34;: similar to `route`, but no firewall rules are added.
     * - &#34;bridge&#34;: use a pre-existing host bridge. The guests will effectively be
     *   directly connected to the physical network (i.e. their IP addresses will
     *   all be on the subnet of the physical network, and there will be no
     *   restrictions on inbound or outbound connections). The `bridge` network
     *   attribute is mandatory in this case.
     * 
     */
    @Export(name="mode", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> mode;

    /**
     * @return One of:
     * - &#34;none&#34;: the guests can talk to each other and the host OS, but cannot reach
     *   any other machines on the LAN.
     * - &#34;nat&#34;: it is the default network mode. This is a configuration that
     *   allows guest OS to get outbound connectivity regardless of whether the host
     *   uses ethernet, wireless, dialup, or VPN networking without requiring any
     *   specific admin configuration. In the absence of host networking, it at
     *   least allows guests to talk directly to each other.
     * - &#34;route&#34;: this is a variant on the default network which routes traffic from
     *   the virtual network to the LAN **without applying any NAT**. It requires that
     *   the IP address range be pre-configured in the routing tables of the router
     *   on the host network.
     * - &#34;open&#34;: similar to `route`, but no firewall rules are added.
     * - &#34;bridge&#34;: use a pre-existing host bridge. The guests will effectively be
     *   directly connected to the physical network (i.e. their IP addresses will
     *   all be on the subnet of the physical network, and there will be no
     *   restrictions on inbound or outbound connections). The `bridge` network
     *   attribute is mandatory in this case.
     * 
     */
    public Output<Optional<String>> mode() {
        return Codegen.optional(this.mode);
    }
    /**
     * The MTU to set for the underlying network interfaces. When
     * not supplied, libvirt will use the default for the interface, usually 1500.
     * Libvirt version 5.1 and greater will advertise this value to nodes via DHCP.
     * 
     */
    @Export(name="mtu", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> mtu;

    /**
     * @return The MTU to set for the underlying network interfaces. When
     * not supplied, libvirt will use the default for the interface, usually 1500.
     * Libvirt version 5.1 and greater will advertise this value to nodes via DHCP.
     * 
     */
    public Output<Optional<Integer>> mtu() {
        return Codegen.optional(this.mtu);
    }
    /**
     * A unique name for the resource, required by libvirt.
     * Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return A unique name for the resource, required by libvirt.
     * Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * a list of static routes. A `cidr` and a `gateway` must
     * be provided. The `gateway` must be reachable via the bridge interface.
     * 
     */
    @Export(name="routes", refs={List.class,NetworkRoute.class}, tree="[0,1]")
    private Output</* @Nullable */ List<NetworkRoute>> routes;

    /**
     * @return a list of static routes. A `cidr` and a `gateway` must
     * be provided. The `gateway` must be reachable via the bridge interface.
     * 
     */
    public Output<Optional<List<NetworkRoute>>> routes() {
        return Codegen.optional(this.routes);
    }
    @Export(name="xml", refs={NetworkXml.class}, tree="[0]")
    private Output</* @Nullable */ NetworkXml> xml;

    public Output<Optional<NetworkXml>> xml() {
        return Codegen.optional(this.xml);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Network(java.lang.String name) {
        this(name, NetworkArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Network(java.lang.String name, @Nullable NetworkArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Network(java.lang.String name, @Nullable NetworkArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("libvirt:index/network:Network", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Network(java.lang.String name, Output<java.lang.String> id, @Nullable NetworkState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("libvirt:index/network:Network", name, state, makeResourceOptions(options, id), false);
    }

    private static NetworkArgs makeArgs(@Nullable NetworkArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? NetworkArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Network get(java.lang.String name, Output<java.lang.String> id, @Nullable NetworkState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Network(name, id, state, options);
    }
}
