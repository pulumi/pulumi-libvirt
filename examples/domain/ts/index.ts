import * as libvirt from "@pulumi/libvirt";

const myDomain = new libvirt.Domain("test", {
    machine="lxc"
})

export const domainName = myDomain.name;
