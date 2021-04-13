"""A Python Pulumi program"""

import pulumi
import pulumi_libvirt as libvirt

pool = libvirt.Pool("demo-py-pool", type="dir", path="/tmp/foo")

pulumi.export("pool_name", pool.name)
