#!/usr/bin/env bash
set -x -ef -o pipefail

sudo apt-get update
sudo apt-get install -y lxc libvirt-daemon libvirt-dev libvirt-daemon-driver-lxc libvirt-daemon-system

id

groups $(id)

sudo usermod -a -G libvirt $(whoami)
sudo systemctl restart libvirtd.service

cat /etc/libvirt/libvirtd.conf

mkdir -p ~/.config/lxc
cat << EOF > ~/.config/lxc/default.conf
lxc.include = /etc/lxc/default.conf
lxc.idmap = u 0 165536 65536
lxc.idmap = g 0 165536 65536
EOF

sudo lxc-create -t download -n foo -- --dist ubuntu --release bionic --arch amd64 --no-validate

sudo virsh -c lxc:// list

