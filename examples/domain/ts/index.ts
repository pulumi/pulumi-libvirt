import * as libvirt from "@pulumi/libvirt";

const myDomain = new libvirt.Domain("test")

export const domainName = myDomain.name;