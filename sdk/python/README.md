[![Actions Status](https://github.com/pulumi/pulumi-libvirt/workflows/master/badge.svg)](https://github.com/pulumi/pulumi-libvirt/actions)
[![Slack](http://www.pulumi.com/images/docs/badges/slack.svg)](https://slack.pulumi.com)
[![NPM version](https://badge.fury.io/js/%40pulumi%2Flibvirt.svg)](https://www.npmjs.com/package/@pulumi/libvirt)
[![Python version](https://badge.fury.io/py/pulumi-libvirt.svg)](https://pypi.org/project/pulumi-libvirt)
[![NuGet version](https://badge.fury.io/nu/pulumi.libvirt.svg)](https://badge.fury.io/nu/pulumi.libvirt)
[![PkgGoDev](https://pkg.go.dev/badge/github.com/pulumi/pulumi-libvirt/sdk/go)](https://pkg.go.dev/github.com/pulumi/pulumi-libvirt/sdk/go)
[![License](https://img.shields.io/npm/l/%40pulumi%2Fpulumi.svg)](https://github.com/pulumi/pulumi-libvirt/blob/master/LICENSE)

# libvirt Resource Provider

The libvirt Resource Provider lets you manage libvirt resources.

## Installing

This package is available in many languages in the standard packaging formats.

### Node.js (Java/TypeScript)

To use from JavaScript or TypeScript in Node.js, install using either `npm`:

    $ npm install @pulumi/libvirt

or `yarn`:

    $ yarn add @pulumi/libvirt

### Python

To use from Python, install using `pip`:

    $ pip install pulumi_libvirt

### Go

To use from Go, use `go get` to grab the latest version of the library

    $ go get github.com/pulumi/pulumi-libvirt/sdk

### .NET

To use from .NET, install using `dotnet add package`:

    $ dotnet add package Pulumi.Libvirt

## Configuration

The following configuration points are available:

- `libvirt:uri` - (Required) The [connection URI](https://libvirt.org/uri.html) used to connect to the libvirt host.
  It can also be sourced from the `LIBVIRT_DEFAULT_URI` environment variable.

## Reference

For further information, please visit [the libvirt provider docs](https://www.pulumi.com/docs/intro/cloud-providers/libvirt)
or for detailed reference documentation, please visit [the API docs](https://www.pulumi.com/docs/reference/pkg/libvirt).