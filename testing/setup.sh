#!/usr/bin/env bash
set -x -ef -o pipefail

sudo apt-get update
sudo apt-get install -y lxc libvirt-daemon libvirt-dev libvirt-daemon-driver-lxc libvirt-daemon-system pkg-config

id runner
groups

sudo usermod -aG libvirt $(whoami)

id runner
groups

sudo newgrp libvirt
groups

sudo bash -c 'cat << EOF > /etc/libvirt/libvirtd.conf
unix_sock_group = "libvirt"
unix_sock_ro_perms = "0777"
unix_sock_rw_perms = "0777"
unix_sock_admin_perms = "0777"
auth_unix_ro = "none"
auth_unix_rw = "none"
EOF'

sudo systemctl restart libvirtd.service

mkdir -p ~/.config/lxc
cat << EOF > ~/.config/lxc/default.conf
lxc.include = /etc/lxc/default.conf
lxc.idmap = u 0 165536 65536
lxc.idmap = g 0 165536 65536
EOF

lxc-create -t download -n foo -- --dist ubuntu --release bionic --arch amd64 --no-validate

virsh -c lxc:// list
