#!/usr/bin/env bash
set -x -ef -o pipefail

sudo apt-get update

sudo mkdir -p /etc/systemd/system/libvirtd.socket.d/
cat << EOF > /tmp/override.conf
[Socket]
SocketGroup=docker
EOF

sudo mv /tmp/override.conf /etc/systemd/system/libvirtd.socket.d/

sudo apt-get install -y lxc libvirt-daemon libvirt-dev libvirt-daemon-driver-lxc libvirt-daemon-system

sudo systemctl restart libvirtd.service

ls -alh /var/run/libvirt/

mkdir -p ~/.config/lxc
cat << EOF > ~/.config/lxc/default.conf
lxc.include = /etc/lxc/default.conf
lxc.idmap = u 0 165536 65536
lxc.idmap = g 0 165536 65536
EOF

lxc-create -t download -n foo -- --dist ubuntu --release bionic --arch amd64

virsh -c lxc:// list
