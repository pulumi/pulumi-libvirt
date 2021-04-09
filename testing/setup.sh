#!/usr/bin/env bash
set -x -ef -o pipefail

sudo apt-get update
sudo apt-get install -y lxc libvirt-daemon libvirt-dev libvirt-daemon-driver-lxc 
virsh --connect lxc:///
