"""A Python Pulumi program"""

import pulumi
import pulumi_libvirt as libvirt

domain = libvirt.Domain("demo-py-domain", machine="lxc")

pulumi.export("domain_name", domain.name)
