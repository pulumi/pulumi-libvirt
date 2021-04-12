#!/usr/bin/env bash
set -x -ef -o pipefail

sudo apt-get update
sudo apt-get install -y lxc libvirt-daemon libvirt-dev libvirt-daemon-driver-lxc libvirt-daemon-system pkg-config

sudo usermod -a -G libvirt $(whoami)

lxc-create -t download -n foo -- --dist ubuntu --release bionic --arch amd64 --no-validate

virsh -c lxc:// list