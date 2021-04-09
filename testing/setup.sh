#!/usr/bin/env bash
set -x -ef -o pipefail

sudo apt-get update
sudo apt-get install -y lxc libvirt-daemon libvirt-dev libvirt-daemon-driver-lxc libvirt-daemon-system

sudo virsh -c lxc:// define testing/template.xml
sudo virsh -c lxc:// start testing
sudo virsh -c lxc:// list

