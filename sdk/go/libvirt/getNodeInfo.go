// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package libvirt

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-libvirt/sdk/go/libvirt/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Retrieve information about the current node
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-libvirt/sdk/go/libvirt"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := libvirt.GetNodeInfo(ctx, map[string]interface{}{}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetNodeInfo(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetNodeInfoResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetNodeInfoResult
	err := ctx.Invoke("libvirt:index/getNodeInfo:getNodeInfo", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getNodeInfo.
type GetNodeInfoResult struct {
	// Number of CPU cores per each socket
	CpuCoresPerSocket int `pulumi:"cpuCoresPerSocket"`
	// Number of CPU cores in total
	CpuCoresTotal int `pulumi:"cpuCoresTotal"`
	// CPU Architecture, usually `x8664`
	CpuModel string `pulumi:"cpuModel"`
	// How many CPU sockets are present
	CpuSockets int `pulumi:"cpuSockets"`
	// How many CPU Threads are available per each CPU core
	CpuThreadsPerCore int `pulumi:"cpuThreadsPerCore"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The amount of memory installed, in KiB
	MemoryTotalKb int `pulumi:"memoryTotalKb"`
	// How many NUMA nodes/cells are available.
	NumaNodes int `pulumi:"numaNodes"`
}

func GetNodeInfoOutput(ctx *pulumi.Context, opts ...pulumi.InvokeOption) GetNodeInfoResultOutput {
	return pulumi.ToOutput(0).ApplyT(func(int) (GetNodeInfoResultOutput, error) {
		options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
		return ctx.InvokeOutput("libvirt:index/getNodeInfo:getNodeInfo", nil, GetNodeInfoResultOutput{}, options).(GetNodeInfoResultOutput), nil
	}).(GetNodeInfoResultOutput)
}

// A collection of values returned by getNodeInfo.
type GetNodeInfoResultOutput struct{ *pulumi.OutputState }

func (GetNodeInfoResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetNodeInfoResult)(nil)).Elem()
}

func (o GetNodeInfoResultOutput) ToGetNodeInfoResultOutput() GetNodeInfoResultOutput {
	return o
}

func (o GetNodeInfoResultOutput) ToGetNodeInfoResultOutputWithContext(ctx context.Context) GetNodeInfoResultOutput {
	return o
}

// Number of CPU cores per each socket
func (o GetNodeInfoResultOutput) CpuCoresPerSocket() pulumi.IntOutput {
	return o.ApplyT(func(v GetNodeInfoResult) int { return v.CpuCoresPerSocket }).(pulumi.IntOutput)
}

// Number of CPU cores in total
func (o GetNodeInfoResultOutput) CpuCoresTotal() pulumi.IntOutput {
	return o.ApplyT(func(v GetNodeInfoResult) int { return v.CpuCoresTotal }).(pulumi.IntOutput)
}

// CPU Architecture, usually `x8664`
func (o GetNodeInfoResultOutput) CpuModel() pulumi.StringOutput {
	return o.ApplyT(func(v GetNodeInfoResult) string { return v.CpuModel }).(pulumi.StringOutput)
}

// How many CPU sockets are present
func (o GetNodeInfoResultOutput) CpuSockets() pulumi.IntOutput {
	return o.ApplyT(func(v GetNodeInfoResult) int { return v.CpuSockets }).(pulumi.IntOutput)
}

// How many CPU Threads are available per each CPU core
func (o GetNodeInfoResultOutput) CpuThreadsPerCore() pulumi.IntOutput {
	return o.ApplyT(func(v GetNodeInfoResult) int { return v.CpuThreadsPerCore }).(pulumi.IntOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetNodeInfoResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetNodeInfoResult) string { return v.Id }).(pulumi.StringOutput)
}

// The amount of memory installed, in KiB
func (o GetNodeInfoResultOutput) MemoryTotalKb() pulumi.IntOutput {
	return o.ApplyT(func(v GetNodeInfoResult) int { return v.MemoryTotalKb }).(pulumi.IntOutput)
}

// How many NUMA nodes/cells are available.
func (o GetNodeInfoResultOutput) NumaNodes() pulumi.IntOutput {
	return o.ApplyT(func(v GetNodeInfoResult) int { return v.NumaNodes }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(GetNodeInfoResultOutput{})
}
