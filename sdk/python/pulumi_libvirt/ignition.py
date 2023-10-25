# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['IgnitionArgs', 'Ignition']

@pulumi.input_type
class IgnitionArgs:
    def __init__(__self__, *,
                 content: pulumi.Input[str],
                 name: Optional[pulumi.Input[str]] = None,
                 pool: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Ignition resource.
        :param pulumi.Input[str] name: A unique name for the resource, required by libvirt.
        :param pulumi.Input[str] pool: The pool where the resource will be created.
               If not given, the `default` pool will be used.
        """
        IgnitionArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            content=content,
            name=name,
            pool=pool,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             content: Optional[pulumi.Input[str]] = None,
             name: Optional[pulumi.Input[str]] = None,
             pool: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if content is None:
            raise TypeError("Missing 'content' argument")

        _setter("content", content)
        if name is not None:
            _setter("name", name)
        if pool is not None:
            _setter("pool", pool)

    @property
    @pulumi.getter
    def content(self) -> pulumi.Input[str]:
        return pulumi.get(self, "content")

    @content.setter
    def content(self, value: pulumi.Input[str]):
        pulumi.set(self, "content", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        A unique name for the resource, required by libvirt.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def pool(self) -> Optional[pulumi.Input[str]]:
        """
        The pool where the resource will be created.
        If not given, the `default` pool will be used.
        """
        return pulumi.get(self, "pool")

    @pool.setter
    def pool(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "pool", value)


@pulumi.input_type
class _IgnitionState:
    def __init__(__self__, *,
                 content: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 pool: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Ignition resources.
        :param pulumi.Input[str] name: A unique name for the resource, required by libvirt.
        :param pulumi.Input[str] pool: The pool where the resource will be created.
               If not given, the `default` pool will be used.
        """
        _IgnitionState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            content=content,
            name=name,
            pool=pool,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             content: Optional[pulumi.Input[str]] = None,
             name: Optional[pulumi.Input[str]] = None,
             pool: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):

        if content is not None:
            _setter("content", content)
        if name is not None:
            _setter("name", name)
        if pool is not None:
            _setter("pool", pool)

    @property
    @pulumi.getter
    def content(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "content")

    @content.setter
    def content(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "content", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        A unique name for the resource, required by libvirt.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def pool(self) -> Optional[pulumi.Input[str]]:
        """
        The pool where the resource will be created.
        If not given, the `default` pool will be used.
        """
        return pulumi.get(self, "pool")

    @pool.setter
    def pool(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "pool", value)


class Ignition(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 content: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 pool: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Create a Ignition resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] name: A unique name for the resource, required by libvirt.
        :param pulumi.Input[str] pool: The pool where the resource will be created.
               If not given, the `default` pool will be used.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: IgnitionArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a Ignition resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param IgnitionArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(IgnitionArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            IgnitionArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 content: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 pool: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = IgnitionArgs.__new__(IgnitionArgs)

            if content is None and not opts.urn:
                raise TypeError("Missing required property 'content'")
            __props__.__dict__["content"] = content
            __props__.__dict__["name"] = name
            __props__.__dict__["pool"] = pool
        super(Ignition, __self__).__init__(
            'libvirt:index/ignition:Ignition',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            content: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            pool: Optional[pulumi.Input[str]] = None) -> 'Ignition':
        """
        Get an existing Ignition resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] name: A unique name for the resource, required by libvirt.
        :param pulumi.Input[str] pool: The pool where the resource will be created.
               If not given, the `default` pool will be used.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _IgnitionState.__new__(_IgnitionState)

        __props__.__dict__["content"] = content
        __props__.__dict__["name"] = name
        __props__.__dict__["pool"] = pool
        return Ignition(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def content(self) -> pulumi.Output[str]:
        return pulumi.get(self, "content")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        A unique name for the resource, required by libvirt.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def pool(self) -> pulumi.Output[Optional[str]]:
        """
        The pool where the resource will be created.
        If not given, the `default` pool will be used.
        """
        return pulumi.get(self, "pool")

