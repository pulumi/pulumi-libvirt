# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from . import _utilities

__all__ = [
    'GetNetworkDnsSrvTemplateResult',
    'AwaitableGetNetworkDnsSrvTemplateResult',
    'get_network_dns_srv_template',
    'get_network_dns_srv_template_output',
]

@pulumi.output_type
class GetNetworkDnsSrvTemplateResult:
    """
    A collection of values returned by getNetworkDnsSrvTemplate.
    """
    def __init__(__self__, domain=None, id=None, port=None, priority=None, protocol=None, rendered=None, service=None, target=None, weight=None):
        if domain and not isinstance(domain, str):
            raise TypeError("Expected argument 'domain' to be a str")
        pulumi.set(__self__, "domain", domain)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if port and not isinstance(port, str):
            raise TypeError("Expected argument 'port' to be a str")
        pulumi.set(__self__, "port", port)
        if priority and not isinstance(priority, str):
            raise TypeError("Expected argument 'priority' to be a str")
        pulumi.set(__self__, "priority", priority)
        if protocol and not isinstance(protocol, str):
            raise TypeError("Expected argument 'protocol' to be a str")
        pulumi.set(__self__, "protocol", protocol)
        if rendered and not isinstance(rendered, dict):
            raise TypeError("Expected argument 'rendered' to be a dict")
        pulumi.set(__self__, "rendered", rendered)
        if service and not isinstance(service, str):
            raise TypeError("Expected argument 'service' to be a str")
        pulumi.set(__self__, "service", service)
        if target and not isinstance(target, str):
            raise TypeError("Expected argument 'target' to be a str")
        pulumi.set(__self__, "target", target)
        if weight and not isinstance(weight, str):
            raise TypeError("Expected argument 'weight' to be a str")
        pulumi.set(__self__, "weight", weight)

    @property
    @pulumi.getter
    def domain(self) -> Optional[str]:
        return pulumi.get(self, "domain")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def port(self) -> Optional[str]:
        return pulumi.get(self, "port")

    @property
    @pulumi.getter
    def priority(self) -> Optional[str]:
        return pulumi.get(self, "priority")

    @property
    @pulumi.getter
    def protocol(self) -> str:
        return pulumi.get(self, "protocol")

    @property
    @pulumi.getter
    def rendered(self) -> Mapping[str, str]:
        return pulumi.get(self, "rendered")

    @property
    @pulumi.getter
    def service(self) -> str:
        return pulumi.get(self, "service")

    @property
    @pulumi.getter
    def target(self) -> Optional[str]:
        return pulumi.get(self, "target")

    @property
    @pulumi.getter
    def weight(self) -> Optional[str]:
        return pulumi.get(self, "weight")


class AwaitableGetNetworkDnsSrvTemplateResult(GetNetworkDnsSrvTemplateResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetNetworkDnsSrvTemplateResult(
            domain=self.domain,
            id=self.id,
            port=self.port,
            priority=self.priority,
            protocol=self.protocol,
            rendered=self.rendered,
            service=self.service,
            target=self.target,
            weight=self.weight)


def get_network_dns_srv_template(domain: Optional[str] = None,
                                 port: Optional[str] = None,
                                 priority: Optional[str] = None,
                                 protocol: Optional[str] = None,
                                 service: Optional[str] = None,
                                 target: Optional[str] = None,
                                 weight: Optional[str] = None,
                                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetNetworkDnsSrvTemplateResult:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    __args__['domain'] = domain
    __args__['port'] = port
    __args__['priority'] = priority
    __args__['protocol'] = protocol
    __args__['service'] = service
    __args__['target'] = target
    __args__['weight'] = weight
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('libvirt:index/getNetworkDnsSrvTemplate:getNetworkDnsSrvTemplate', __args__, opts=opts, typ=GetNetworkDnsSrvTemplateResult).value

    return AwaitableGetNetworkDnsSrvTemplateResult(
        domain=pulumi.get(__ret__, 'domain'),
        id=pulumi.get(__ret__, 'id'),
        port=pulumi.get(__ret__, 'port'),
        priority=pulumi.get(__ret__, 'priority'),
        protocol=pulumi.get(__ret__, 'protocol'),
        rendered=pulumi.get(__ret__, 'rendered'),
        service=pulumi.get(__ret__, 'service'),
        target=pulumi.get(__ret__, 'target'),
        weight=pulumi.get(__ret__, 'weight'))
def get_network_dns_srv_template_output(domain: Optional[pulumi.Input[Optional[str]]] = None,
                                        port: Optional[pulumi.Input[Optional[str]]] = None,
                                        priority: Optional[pulumi.Input[Optional[str]]] = None,
                                        protocol: Optional[pulumi.Input[str]] = None,
                                        service: Optional[pulumi.Input[str]] = None,
                                        target: Optional[pulumi.Input[Optional[str]]] = None,
                                        weight: Optional[pulumi.Input[Optional[str]]] = None,
                                        opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetNetworkDnsSrvTemplateResult]:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    __args__['domain'] = domain
    __args__['port'] = port
    __args__['priority'] = priority
    __args__['protocol'] = protocol
    __args__['service'] = service
    __args__['target'] = target
    __args__['weight'] = weight
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('libvirt:index/getNetworkDnsSrvTemplate:getNetworkDnsSrvTemplate', __args__, opts=opts, typ=GetNetworkDnsSrvTemplateResult)
    return __ret__.apply(lambda __response__: GetNetworkDnsSrvTemplateResult(
        domain=pulumi.get(__response__, 'domain'),
        id=pulumi.get(__response__, 'id'),
        port=pulumi.get(__response__, 'port'),
        priority=pulumi.get(__response__, 'priority'),
        protocol=pulumi.get(__response__, 'protocol'),
        rendered=pulumi.get(__response__, 'rendered'),
        service=pulumi.get(__response__, 'service'),
        target=pulumi.get(__response__, 'target'),
        weight=pulumi.get(__response__, 'weight')))
