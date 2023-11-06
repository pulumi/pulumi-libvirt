# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['NetworkArgs', 'Network']

@pulumi.input_type
class NetworkArgs:
    def __init__(__self__, *,
                 addresses: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 autostart: Optional[pulumi.Input[bool]] = None,
                 bridge: Optional[pulumi.Input[str]] = None,
                 dhcp: Optional[pulumi.Input['NetworkDhcpArgs']] = None,
                 dns: Optional[pulumi.Input['NetworkDnsArgs']] = None,
                 dnsmasq_options: Optional[pulumi.Input['NetworkDnsmasqOptionsArgs']] = None,
                 domain: Optional[pulumi.Input[str]] = None,
                 mode: Optional[pulumi.Input[str]] = None,
                 mtu: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 routes: Optional[pulumi.Input[Sequence[pulumi.Input['NetworkRouteArgs']]]] = None,
                 xml: Optional[pulumi.Input['NetworkXmlArgs']] = None):
        """
        The set of arguments for constructing a Network resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] addresses: A list of (0 or 1) IPv4 and (0 or 1) IPv6 subnets in
               CIDR notation.  This defines the subnets associated to that network.
               This argument is also used to define the address on the real host.
               If `dhcp {  enabled = true }` addresses is also used to define the address range served by
               the DHCP server.
               No DHCP server will be started if `addresses` is omitted.
        :param pulumi.Input[bool] autostart: Set to `true` to start the network on host boot up.
               If not specified `false` is assumed.
        :param pulumi.Input[str] bridge: The bridge device defines the name of a bridge
               device which will be used to construct the virtual network (when not provided,
               it will be automatically obtained by libvirt in `none`, `nat`, `route` and `open` modes).
        :param pulumi.Input['NetworkDhcpArgs'] dhcp: DHCP configuration. 
               You need to use it in conjuction with the adresses variable.
        :param pulumi.Input['NetworkDnsArgs'] dns: configuration of DNS specific settings for the network
        :param pulumi.Input['NetworkDnsmasqOptionsArgs'] dnsmasq_options: configuration of Dnsmasq options for the network
               You need to provide a list of option name and value pairs.
        :param pulumi.Input[str] domain: The domain used by the DNS server.
        :param pulumi.Input[str] mode: One of:
        :param pulumi.Input[int] mtu: The MTU to set for the underlying network interfaces. When
               not supplied, libvirt will use the default for the interface, usually 1500.
               Libvirt version 5.1 and greater will advertise this value to nodes via DHCP.
        :param pulumi.Input[str] name: A unique name for the resource, required by libvirt.
               Changing this forces a new resource to be created.
        :param pulumi.Input[Sequence[pulumi.Input['NetworkRouteArgs']]] routes: a list of static routes. A `cidr` and a `gateway` must
               be provided. The `gateway` must be reachable via the bridge interface.
        """
        NetworkArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            addresses=addresses,
            autostart=autostart,
            bridge=bridge,
            dhcp=dhcp,
            dns=dns,
            dnsmasq_options=dnsmasq_options,
            domain=domain,
            mode=mode,
            mtu=mtu,
            name=name,
            routes=routes,
            xml=xml,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             addresses: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             autostart: Optional[pulumi.Input[bool]] = None,
             bridge: Optional[pulumi.Input[str]] = None,
             dhcp: Optional[pulumi.Input['NetworkDhcpArgs']] = None,
             dns: Optional[pulumi.Input['NetworkDnsArgs']] = None,
             dnsmasq_options: Optional[pulumi.Input['NetworkDnsmasqOptionsArgs']] = None,
             domain: Optional[pulumi.Input[str]] = None,
             mode: Optional[pulumi.Input[str]] = None,
             mtu: Optional[pulumi.Input[int]] = None,
             name: Optional[pulumi.Input[str]] = None,
             routes: Optional[pulumi.Input[Sequence[pulumi.Input['NetworkRouteArgs']]]] = None,
             xml: Optional[pulumi.Input['NetworkXmlArgs']] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if dnsmasq_options is None and 'dnsmasqOptions' in kwargs:
            dnsmasq_options = kwargs['dnsmasqOptions']

        if addresses is not None:
            _setter("addresses", addresses)
        if autostart is not None:
            _setter("autostart", autostart)
        if bridge is not None:
            _setter("bridge", bridge)
        if dhcp is not None:
            _setter("dhcp", dhcp)
        if dns is not None:
            _setter("dns", dns)
        if dnsmasq_options is not None:
            _setter("dnsmasq_options", dnsmasq_options)
        if domain is not None:
            _setter("domain", domain)
        if mode is not None:
            _setter("mode", mode)
        if mtu is not None:
            _setter("mtu", mtu)
        if name is not None:
            _setter("name", name)
        if routes is not None:
            _setter("routes", routes)
        if xml is not None:
            _setter("xml", xml)

    @property
    @pulumi.getter
    def addresses(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        A list of (0 or 1) IPv4 and (0 or 1) IPv6 subnets in
        CIDR notation.  This defines the subnets associated to that network.
        This argument is also used to define the address on the real host.
        If `dhcp {  enabled = true }` addresses is also used to define the address range served by
        the DHCP server.
        No DHCP server will be started if `addresses` is omitted.
        """
        return pulumi.get(self, "addresses")

    @addresses.setter
    def addresses(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "addresses", value)

    @property
    @pulumi.getter
    def autostart(self) -> Optional[pulumi.Input[bool]]:
        """
        Set to `true` to start the network on host boot up.
        If not specified `false` is assumed.
        """
        return pulumi.get(self, "autostart")

    @autostart.setter
    def autostart(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "autostart", value)

    @property
    @pulumi.getter
    def bridge(self) -> Optional[pulumi.Input[str]]:
        """
        The bridge device defines the name of a bridge
        device which will be used to construct the virtual network (when not provided,
        it will be automatically obtained by libvirt in `none`, `nat`, `route` and `open` modes).
        """
        return pulumi.get(self, "bridge")

    @bridge.setter
    def bridge(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "bridge", value)

    @property
    @pulumi.getter
    def dhcp(self) -> Optional[pulumi.Input['NetworkDhcpArgs']]:
        """
        DHCP configuration. 
        You need to use it in conjuction with the adresses variable.
        """
        return pulumi.get(self, "dhcp")

    @dhcp.setter
    def dhcp(self, value: Optional[pulumi.Input['NetworkDhcpArgs']]):
        pulumi.set(self, "dhcp", value)

    @property
    @pulumi.getter
    def dns(self) -> Optional[pulumi.Input['NetworkDnsArgs']]:
        """
        configuration of DNS specific settings for the network
        """
        return pulumi.get(self, "dns")

    @dns.setter
    def dns(self, value: Optional[pulumi.Input['NetworkDnsArgs']]):
        pulumi.set(self, "dns", value)

    @property
    @pulumi.getter(name="dnsmasqOptions")
    def dnsmasq_options(self) -> Optional[pulumi.Input['NetworkDnsmasqOptionsArgs']]:
        """
        configuration of Dnsmasq options for the network
        You need to provide a list of option name and value pairs.
        """
        return pulumi.get(self, "dnsmasq_options")

    @dnsmasq_options.setter
    def dnsmasq_options(self, value: Optional[pulumi.Input['NetworkDnsmasqOptionsArgs']]):
        pulumi.set(self, "dnsmasq_options", value)

    @property
    @pulumi.getter
    def domain(self) -> Optional[pulumi.Input[str]]:
        """
        The domain used by the DNS server.
        """
        return pulumi.get(self, "domain")

    @domain.setter
    def domain(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "domain", value)

    @property
    @pulumi.getter
    def mode(self) -> Optional[pulumi.Input[str]]:
        """
        One of:
        """
        return pulumi.get(self, "mode")

    @mode.setter
    def mode(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "mode", value)

    @property
    @pulumi.getter
    def mtu(self) -> Optional[pulumi.Input[int]]:
        """
        The MTU to set for the underlying network interfaces. When
        not supplied, libvirt will use the default for the interface, usually 1500.
        Libvirt version 5.1 and greater will advertise this value to nodes via DHCP.
        """
        return pulumi.get(self, "mtu")

    @mtu.setter
    def mtu(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "mtu", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        A unique name for the resource, required by libvirt.
        Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def routes(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['NetworkRouteArgs']]]]:
        """
        a list of static routes. A `cidr` and a `gateway` must
        be provided. The `gateway` must be reachable via the bridge interface.
        """
        return pulumi.get(self, "routes")

    @routes.setter
    def routes(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['NetworkRouteArgs']]]]):
        pulumi.set(self, "routes", value)

    @property
    @pulumi.getter
    def xml(self) -> Optional[pulumi.Input['NetworkXmlArgs']]:
        return pulumi.get(self, "xml")

    @xml.setter
    def xml(self, value: Optional[pulumi.Input['NetworkXmlArgs']]):
        pulumi.set(self, "xml", value)


@pulumi.input_type
class _NetworkState:
    def __init__(__self__, *,
                 addresses: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 autostart: Optional[pulumi.Input[bool]] = None,
                 bridge: Optional[pulumi.Input[str]] = None,
                 dhcp: Optional[pulumi.Input['NetworkDhcpArgs']] = None,
                 dns: Optional[pulumi.Input['NetworkDnsArgs']] = None,
                 dnsmasq_options: Optional[pulumi.Input['NetworkDnsmasqOptionsArgs']] = None,
                 domain: Optional[pulumi.Input[str]] = None,
                 mode: Optional[pulumi.Input[str]] = None,
                 mtu: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 routes: Optional[pulumi.Input[Sequence[pulumi.Input['NetworkRouteArgs']]]] = None,
                 xml: Optional[pulumi.Input['NetworkXmlArgs']] = None):
        """
        Input properties used for looking up and filtering Network resources.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] addresses: A list of (0 or 1) IPv4 and (0 or 1) IPv6 subnets in
               CIDR notation.  This defines the subnets associated to that network.
               This argument is also used to define the address on the real host.
               If `dhcp {  enabled = true }` addresses is also used to define the address range served by
               the DHCP server.
               No DHCP server will be started if `addresses` is omitted.
        :param pulumi.Input[bool] autostart: Set to `true` to start the network on host boot up.
               If not specified `false` is assumed.
        :param pulumi.Input[str] bridge: The bridge device defines the name of a bridge
               device which will be used to construct the virtual network (when not provided,
               it will be automatically obtained by libvirt in `none`, `nat`, `route` and `open` modes).
        :param pulumi.Input['NetworkDhcpArgs'] dhcp: DHCP configuration. 
               You need to use it in conjuction with the adresses variable.
        :param pulumi.Input['NetworkDnsArgs'] dns: configuration of DNS specific settings for the network
        :param pulumi.Input['NetworkDnsmasqOptionsArgs'] dnsmasq_options: configuration of Dnsmasq options for the network
               You need to provide a list of option name and value pairs.
        :param pulumi.Input[str] domain: The domain used by the DNS server.
        :param pulumi.Input[str] mode: One of:
        :param pulumi.Input[int] mtu: The MTU to set for the underlying network interfaces. When
               not supplied, libvirt will use the default for the interface, usually 1500.
               Libvirt version 5.1 and greater will advertise this value to nodes via DHCP.
        :param pulumi.Input[str] name: A unique name for the resource, required by libvirt.
               Changing this forces a new resource to be created.
        :param pulumi.Input[Sequence[pulumi.Input['NetworkRouteArgs']]] routes: a list of static routes. A `cidr` and a `gateway` must
               be provided. The `gateway` must be reachable via the bridge interface.
        """
        _NetworkState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            addresses=addresses,
            autostart=autostart,
            bridge=bridge,
            dhcp=dhcp,
            dns=dns,
            dnsmasq_options=dnsmasq_options,
            domain=domain,
            mode=mode,
            mtu=mtu,
            name=name,
            routes=routes,
            xml=xml,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             addresses: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             autostart: Optional[pulumi.Input[bool]] = None,
             bridge: Optional[pulumi.Input[str]] = None,
             dhcp: Optional[pulumi.Input['NetworkDhcpArgs']] = None,
             dns: Optional[pulumi.Input['NetworkDnsArgs']] = None,
             dnsmasq_options: Optional[pulumi.Input['NetworkDnsmasqOptionsArgs']] = None,
             domain: Optional[pulumi.Input[str]] = None,
             mode: Optional[pulumi.Input[str]] = None,
             mtu: Optional[pulumi.Input[int]] = None,
             name: Optional[pulumi.Input[str]] = None,
             routes: Optional[pulumi.Input[Sequence[pulumi.Input['NetworkRouteArgs']]]] = None,
             xml: Optional[pulumi.Input['NetworkXmlArgs']] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if dnsmasq_options is None and 'dnsmasqOptions' in kwargs:
            dnsmasq_options = kwargs['dnsmasqOptions']

        if addresses is not None:
            _setter("addresses", addresses)
        if autostart is not None:
            _setter("autostart", autostart)
        if bridge is not None:
            _setter("bridge", bridge)
        if dhcp is not None:
            _setter("dhcp", dhcp)
        if dns is not None:
            _setter("dns", dns)
        if dnsmasq_options is not None:
            _setter("dnsmasq_options", dnsmasq_options)
        if domain is not None:
            _setter("domain", domain)
        if mode is not None:
            _setter("mode", mode)
        if mtu is not None:
            _setter("mtu", mtu)
        if name is not None:
            _setter("name", name)
        if routes is not None:
            _setter("routes", routes)
        if xml is not None:
            _setter("xml", xml)

    @property
    @pulumi.getter
    def addresses(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        A list of (0 or 1) IPv4 and (0 or 1) IPv6 subnets in
        CIDR notation.  This defines the subnets associated to that network.
        This argument is also used to define the address on the real host.
        If `dhcp {  enabled = true }` addresses is also used to define the address range served by
        the DHCP server.
        No DHCP server will be started if `addresses` is omitted.
        """
        return pulumi.get(self, "addresses")

    @addresses.setter
    def addresses(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "addresses", value)

    @property
    @pulumi.getter
    def autostart(self) -> Optional[pulumi.Input[bool]]:
        """
        Set to `true` to start the network on host boot up.
        If not specified `false` is assumed.
        """
        return pulumi.get(self, "autostart")

    @autostart.setter
    def autostart(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "autostart", value)

    @property
    @pulumi.getter
    def bridge(self) -> Optional[pulumi.Input[str]]:
        """
        The bridge device defines the name of a bridge
        device which will be used to construct the virtual network (when not provided,
        it will be automatically obtained by libvirt in `none`, `nat`, `route` and `open` modes).
        """
        return pulumi.get(self, "bridge")

    @bridge.setter
    def bridge(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "bridge", value)

    @property
    @pulumi.getter
    def dhcp(self) -> Optional[pulumi.Input['NetworkDhcpArgs']]:
        """
        DHCP configuration. 
        You need to use it in conjuction with the adresses variable.
        """
        return pulumi.get(self, "dhcp")

    @dhcp.setter
    def dhcp(self, value: Optional[pulumi.Input['NetworkDhcpArgs']]):
        pulumi.set(self, "dhcp", value)

    @property
    @pulumi.getter
    def dns(self) -> Optional[pulumi.Input['NetworkDnsArgs']]:
        """
        configuration of DNS specific settings for the network
        """
        return pulumi.get(self, "dns")

    @dns.setter
    def dns(self, value: Optional[pulumi.Input['NetworkDnsArgs']]):
        pulumi.set(self, "dns", value)

    @property
    @pulumi.getter(name="dnsmasqOptions")
    def dnsmasq_options(self) -> Optional[pulumi.Input['NetworkDnsmasqOptionsArgs']]:
        """
        configuration of Dnsmasq options for the network
        You need to provide a list of option name and value pairs.
        """
        return pulumi.get(self, "dnsmasq_options")

    @dnsmasq_options.setter
    def dnsmasq_options(self, value: Optional[pulumi.Input['NetworkDnsmasqOptionsArgs']]):
        pulumi.set(self, "dnsmasq_options", value)

    @property
    @pulumi.getter
    def domain(self) -> Optional[pulumi.Input[str]]:
        """
        The domain used by the DNS server.
        """
        return pulumi.get(self, "domain")

    @domain.setter
    def domain(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "domain", value)

    @property
    @pulumi.getter
    def mode(self) -> Optional[pulumi.Input[str]]:
        """
        One of:
        """
        return pulumi.get(self, "mode")

    @mode.setter
    def mode(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "mode", value)

    @property
    @pulumi.getter
    def mtu(self) -> Optional[pulumi.Input[int]]:
        """
        The MTU to set for the underlying network interfaces. When
        not supplied, libvirt will use the default for the interface, usually 1500.
        Libvirt version 5.1 and greater will advertise this value to nodes via DHCP.
        """
        return pulumi.get(self, "mtu")

    @mtu.setter
    def mtu(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "mtu", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        A unique name for the resource, required by libvirt.
        Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def routes(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['NetworkRouteArgs']]]]:
        """
        a list of static routes. A `cidr` and a `gateway` must
        be provided. The `gateway` must be reachable via the bridge interface.
        """
        return pulumi.get(self, "routes")

    @routes.setter
    def routes(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['NetworkRouteArgs']]]]):
        pulumi.set(self, "routes", value)

    @property
    @pulumi.getter
    def xml(self) -> Optional[pulumi.Input['NetworkXmlArgs']]:
        return pulumi.get(self, "xml")

    @xml.setter
    def xml(self, value: Optional[pulumi.Input['NetworkXmlArgs']]):
        pulumi.set(self, "xml", value)


class Network(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 addresses: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 autostart: Optional[pulumi.Input[bool]] = None,
                 bridge: Optional[pulumi.Input[str]] = None,
                 dhcp: Optional[pulumi.Input[pulumi.InputType['NetworkDhcpArgs']]] = None,
                 dns: Optional[pulumi.Input[pulumi.InputType['NetworkDnsArgs']]] = None,
                 dnsmasq_options: Optional[pulumi.Input[pulumi.InputType['NetworkDnsmasqOptionsArgs']]] = None,
                 domain: Optional[pulumi.Input[str]] = None,
                 mode: Optional[pulumi.Input[str]] = None,
                 mtu: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 routes: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NetworkRouteArgs']]]]] = None,
                 xml: Optional[pulumi.Input[pulumi.InputType['NetworkXmlArgs']]] = None,
                 __props__=None):
        """
        Manages a VM network resource within libvirt. For more information see
        [the official documentation](https://libvirt.org/formatnetwork.html).

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] addresses: A list of (0 or 1) IPv4 and (0 or 1) IPv6 subnets in
               CIDR notation.  This defines the subnets associated to that network.
               This argument is also used to define the address on the real host.
               If `dhcp {  enabled = true }` addresses is also used to define the address range served by
               the DHCP server.
               No DHCP server will be started if `addresses` is omitted.
        :param pulumi.Input[bool] autostart: Set to `true` to start the network on host boot up.
               If not specified `false` is assumed.
        :param pulumi.Input[str] bridge: The bridge device defines the name of a bridge
               device which will be used to construct the virtual network (when not provided,
               it will be automatically obtained by libvirt in `none`, `nat`, `route` and `open` modes).
        :param pulumi.Input[pulumi.InputType['NetworkDhcpArgs']] dhcp: DHCP configuration. 
               You need to use it in conjuction with the adresses variable.
        :param pulumi.Input[pulumi.InputType['NetworkDnsArgs']] dns: configuration of DNS specific settings for the network
        :param pulumi.Input[pulumi.InputType['NetworkDnsmasqOptionsArgs']] dnsmasq_options: configuration of Dnsmasq options for the network
               You need to provide a list of option name and value pairs.
        :param pulumi.Input[str] domain: The domain used by the DNS server.
        :param pulumi.Input[str] mode: One of:
        :param pulumi.Input[int] mtu: The MTU to set for the underlying network interfaces. When
               not supplied, libvirt will use the default for the interface, usually 1500.
               Libvirt version 5.1 and greater will advertise this value to nodes via DHCP.
        :param pulumi.Input[str] name: A unique name for the resource, required by libvirt.
               Changing this forces a new resource to be created.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NetworkRouteArgs']]]] routes: a list of static routes. A `cidr` and a `gateway` must
               be provided. The `gateway` must be reachable via the bridge interface.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[NetworkArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a VM network resource within libvirt. For more information see
        [the official documentation](https://libvirt.org/formatnetwork.html).

        :param str resource_name: The name of the resource.
        :param NetworkArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(NetworkArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            NetworkArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 addresses: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 autostart: Optional[pulumi.Input[bool]] = None,
                 bridge: Optional[pulumi.Input[str]] = None,
                 dhcp: Optional[pulumi.Input[pulumi.InputType['NetworkDhcpArgs']]] = None,
                 dns: Optional[pulumi.Input[pulumi.InputType['NetworkDnsArgs']]] = None,
                 dnsmasq_options: Optional[pulumi.Input[pulumi.InputType['NetworkDnsmasqOptionsArgs']]] = None,
                 domain: Optional[pulumi.Input[str]] = None,
                 mode: Optional[pulumi.Input[str]] = None,
                 mtu: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 routes: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NetworkRouteArgs']]]]] = None,
                 xml: Optional[pulumi.Input[pulumi.InputType['NetworkXmlArgs']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = NetworkArgs.__new__(NetworkArgs)

            __props__.__dict__["addresses"] = addresses
            __props__.__dict__["autostart"] = autostart
            __props__.__dict__["bridge"] = bridge
            if dhcp is not None and not isinstance(dhcp, NetworkDhcpArgs):
                dhcp = dhcp or {}
                def _setter(key, value):
                    dhcp[key] = value
                NetworkDhcpArgs._configure(_setter, **dhcp)
            __props__.__dict__["dhcp"] = dhcp
            if dns is not None and not isinstance(dns, NetworkDnsArgs):
                dns = dns or {}
                def _setter(key, value):
                    dns[key] = value
                NetworkDnsArgs._configure(_setter, **dns)
            __props__.__dict__["dns"] = dns
            if dnsmasq_options is not None and not isinstance(dnsmasq_options, NetworkDnsmasqOptionsArgs):
                dnsmasq_options = dnsmasq_options or {}
                def _setter(key, value):
                    dnsmasq_options[key] = value
                NetworkDnsmasqOptionsArgs._configure(_setter, **dnsmasq_options)
            __props__.__dict__["dnsmasq_options"] = dnsmasq_options
            __props__.__dict__["domain"] = domain
            __props__.__dict__["mode"] = mode
            __props__.__dict__["mtu"] = mtu
            __props__.__dict__["name"] = name
            __props__.__dict__["routes"] = routes
            if xml is not None and not isinstance(xml, NetworkXmlArgs):
                xml = xml or {}
                def _setter(key, value):
                    xml[key] = value
                NetworkXmlArgs._configure(_setter, **xml)
            __props__.__dict__["xml"] = xml
        super(Network, __self__).__init__(
            'libvirt:index/network:Network',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            addresses: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            autostart: Optional[pulumi.Input[bool]] = None,
            bridge: Optional[pulumi.Input[str]] = None,
            dhcp: Optional[pulumi.Input[pulumi.InputType['NetworkDhcpArgs']]] = None,
            dns: Optional[pulumi.Input[pulumi.InputType['NetworkDnsArgs']]] = None,
            dnsmasq_options: Optional[pulumi.Input[pulumi.InputType['NetworkDnsmasqOptionsArgs']]] = None,
            domain: Optional[pulumi.Input[str]] = None,
            mode: Optional[pulumi.Input[str]] = None,
            mtu: Optional[pulumi.Input[int]] = None,
            name: Optional[pulumi.Input[str]] = None,
            routes: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NetworkRouteArgs']]]]] = None,
            xml: Optional[pulumi.Input[pulumi.InputType['NetworkXmlArgs']]] = None) -> 'Network':
        """
        Get an existing Network resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] addresses: A list of (0 or 1) IPv4 and (0 or 1) IPv6 subnets in
               CIDR notation.  This defines the subnets associated to that network.
               This argument is also used to define the address on the real host.
               If `dhcp {  enabled = true }` addresses is also used to define the address range served by
               the DHCP server.
               No DHCP server will be started if `addresses` is omitted.
        :param pulumi.Input[bool] autostart: Set to `true` to start the network on host boot up.
               If not specified `false` is assumed.
        :param pulumi.Input[str] bridge: The bridge device defines the name of a bridge
               device which will be used to construct the virtual network (when not provided,
               it will be automatically obtained by libvirt in `none`, `nat`, `route` and `open` modes).
        :param pulumi.Input[pulumi.InputType['NetworkDhcpArgs']] dhcp: DHCP configuration. 
               You need to use it in conjuction with the adresses variable.
        :param pulumi.Input[pulumi.InputType['NetworkDnsArgs']] dns: configuration of DNS specific settings for the network
        :param pulumi.Input[pulumi.InputType['NetworkDnsmasqOptionsArgs']] dnsmasq_options: configuration of Dnsmasq options for the network
               You need to provide a list of option name and value pairs.
        :param pulumi.Input[str] domain: The domain used by the DNS server.
        :param pulumi.Input[str] mode: One of:
        :param pulumi.Input[int] mtu: The MTU to set for the underlying network interfaces. When
               not supplied, libvirt will use the default for the interface, usually 1500.
               Libvirt version 5.1 and greater will advertise this value to nodes via DHCP.
        :param pulumi.Input[str] name: A unique name for the resource, required by libvirt.
               Changing this forces a new resource to be created.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NetworkRouteArgs']]]] routes: a list of static routes. A `cidr` and a `gateway` must
               be provided. The `gateway` must be reachable via the bridge interface.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _NetworkState.__new__(_NetworkState)

        __props__.__dict__["addresses"] = addresses
        __props__.__dict__["autostart"] = autostart
        __props__.__dict__["bridge"] = bridge
        __props__.__dict__["dhcp"] = dhcp
        __props__.__dict__["dns"] = dns
        __props__.__dict__["dnsmasq_options"] = dnsmasq_options
        __props__.__dict__["domain"] = domain
        __props__.__dict__["mode"] = mode
        __props__.__dict__["mtu"] = mtu
        __props__.__dict__["name"] = name
        __props__.__dict__["routes"] = routes
        __props__.__dict__["xml"] = xml
        return Network(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def addresses(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        A list of (0 or 1) IPv4 and (0 or 1) IPv6 subnets in
        CIDR notation.  This defines the subnets associated to that network.
        This argument is also used to define the address on the real host.
        If `dhcp {  enabled = true }` addresses is also used to define the address range served by
        the DHCP server.
        No DHCP server will be started if `addresses` is omitted.
        """
        return pulumi.get(self, "addresses")

    @property
    @pulumi.getter
    def autostart(self) -> pulumi.Output[bool]:
        """
        Set to `true` to start the network on host boot up.
        If not specified `false` is assumed.
        """
        return pulumi.get(self, "autostart")

    @property
    @pulumi.getter
    def bridge(self) -> pulumi.Output[str]:
        """
        The bridge device defines the name of a bridge
        device which will be used to construct the virtual network (when not provided,
        it will be automatically obtained by libvirt in `none`, `nat`, `route` and `open` modes).
        """
        return pulumi.get(self, "bridge")

    @property
    @pulumi.getter
    def dhcp(self) -> pulumi.Output['outputs.NetworkDhcp']:
        """
        DHCP configuration. 
        You need to use it in conjuction with the adresses variable.
        """
        return pulumi.get(self, "dhcp")

    @property
    @pulumi.getter
    def dns(self) -> pulumi.Output['outputs.NetworkDns']:
        """
        configuration of DNS specific settings for the network
        """
        return pulumi.get(self, "dns")

    @property
    @pulumi.getter(name="dnsmasqOptions")
    def dnsmasq_options(self) -> pulumi.Output[Optional['outputs.NetworkDnsmasqOptions']]:
        """
        configuration of Dnsmasq options for the network
        You need to provide a list of option name and value pairs.
        """
        return pulumi.get(self, "dnsmasq_options")

    @property
    @pulumi.getter
    def domain(self) -> pulumi.Output[Optional[str]]:
        """
        The domain used by the DNS server.
        """
        return pulumi.get(self, "domain")

    @property
    @pulumi.getter
    def mode(self) -> pulumi.Output[Optional[str]]:
        """
        One of:
        """
        return pulumi.get(self, "mode")

    @property
    @pulumi.getter
    def mtu(self) -> pulumi.Output[Optional[int]]:
        """
        The MTU to set for the underlying network interfaces. When
        not supplied, libvirt will use the default for the interface, usually 1500.
        Libvirt version 5.1 and greater will advertise this value to nodes via DHCP.
        """
        return pulumi.get(self, "mtu")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        A unique name for the resource, required by libvirt.
        Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def routes(self) -> pulumi.Output[Optional[Sequence['outputs.NetworkRoute']]]:
        """
        a list of static routes. A `cidr` and a `gateway` must
        be provided. The `gateway` must be reachable via the bridge interface.
        """
        return pulumi.get(self, "routes")

    @property
    @pulumi.getter
    def xml(self) -> pulumi.Output[Optional['outputs.NetworkXml']]:
        return pulumi.get(self, "xml")

