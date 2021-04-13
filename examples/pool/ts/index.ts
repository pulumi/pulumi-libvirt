import * as libvirt from "@pulumi/libvirt";

const myPool = new libvirt.Pool("test", {
    type: "dir",
    path: "/tmp/foo"
})

export const poolName = myPool.name;
