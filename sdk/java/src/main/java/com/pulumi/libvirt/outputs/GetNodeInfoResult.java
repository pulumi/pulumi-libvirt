// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.libvirt.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetNodeInfoResult {
    /**
     * @return Number of CPU cores per each socket
     * 
     */
    private Integer cpuCoresPerSocket;
    /**
     * @return Number of CPU cores in total
     * 
     */
    private Integer cpuCoresTotal;
    /**
     * @return CPU Architecture, usually `x86_64`
     * 
     */
    private String cpuModel;
    /**
     * @return How many CPU sockets are present
     * 
     */
    private Integer cpuSockets;
    /**
     * @return How many CPU Threads are available per each CPU core
     * 
     */
    private Integer cpuThreadsPerCore;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The amount of memory installed, in KiB
     * 
     */
    private Integer memoryTotalKb;
    /**
     * @return How many NUMA nodes/cells are available.
     * 
     */
    private Integer numaNodes;

    private GetNodeInfoResult() {}
    /**
     * @return Number of CPU cores per each socket
     * 
     */
    public Integer cpuCoresPerSocket() {
        return this.cpuCoresPerSocket;
    }
    /**
     * @return Number of CPU cores in total
     * 
     */
    public Integer cpuCoresTotal() {
        return this.cpuCoresTotal;
    }
    /**
     * @return CPU Architecture, usually `x86_64`
     * 
     */
    public String cpuModel() {
        return this.cpuModel;
    }
    /**
     * @return How many CPU sockets are present
     * 
     */
    public Integer cpuSockets() {
        return this.cpuSockets;
    }
    /**
     * @return How many CPU Threads are available per each CPU core
     * 
     */
    public Integer cpuThreadsPerCore() {
        return this.cpuThreadsPerCore;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The amount of memory installed, in KiB
     * 
     */
    public Integer memoryTotalKb() {
        return this.memoryTotalKb;
    }
    /**
     * @return How many NUMA nodes/cells are available.
     * 
     */
    public Integer numaNodes() {
        return this.numaNodes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNodeInfoResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer cpuCoresPerSocket;
        private Integer cpuCoresTotal;
        private String cpuModel;
        private Integer cpuSockets;
        private Integer cpuThreadsPerCore;
        private String id;
        private Integer memoryTotalKb;
        private Integer numaNodes;
        public Builder() {}
        public Builder(GetNodeInfoResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpuCoresPerSocket = defaults.cpuCoresPerSocket;
    	      this.cpuCoresTotal = defaults.cpuCoresTotal;
    	      this.cpuModel = defaults.cpuModel;
    	      this.cpuSockets = defaults.cpuSockets;
    	      this.cpuThreadsPerCore = defaults.cpuThreadsPerCore;
    	      this.id = defaults.id;
    	      this.memoryTotalKb = defaults.memoryTotalKb;
    	      this.numaNodes = defaults.numaNodes;
        }

        @CustomType.Setter
        public Builder cpuCoresPerSocket(Integer cpuCoresPerSocket) {
            if (cpuCoresPerSocket == null) {
              throw new MissingRequiredPropertyException("GetNodeInfoResult", "cpuCoresPerSocket");
            }
            this.cpuCoresPerSocket = cpuCoresPerSocket;
            return this;
        }
        @CustomType.Setter
        public Builder cpuCoresTotal(Integer cpuCoresTotal) {
            if (cpuCoresTotal == null) {
              throw new MissingRequiredPropertyException("GetNodeInfoResult", "cpuCoresTotal");
            }
            this.cpuCoresTotal = cpuCoresTotal;
            return this;
        }
        @CustomType.Setter
        public Builder cpuModel(String cpuModel) {
            if (cpuModel == null) {
              throw new MissingRequiredPropertyException("GetNodeInfoResult", "cpuModel");
            }
            this.cpuModel = cpuModel;
            return this;
        }
        @CustomType.Setter
        public Builder cpuSockets(Integer cpuSockets) {
            if (cpuSockets == null) {
              throw new MissingRequiredPropertyException("GetNodeInfoResult", "cpuSockets");
            }
            this.cpuSockets = cpuSockets;
            return this;
        }
        @CustomType.Setter
        public Builder cpuThreadsPerCore(Integer cpuThreadsPerCore) {
            if (cpuThreadsPerCore == null) {
              throw new MissingRequiredPropertyException("GetNodeInfoResult", "cpuThreadsPerCore");
            }
            this.cpuThreadsPerCore = cpuThreadsPerCore;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetNodeInfoResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder memoryTotalKb(Integer memoryTotalKb) {
            if (memoryTotalKb == null) {
              throw new MissingRequiredPropertyException("GetNodeInfoResult", "memoryTotalKb");
            }
            this.memoryTotalKb = memoryTotalKb;
            return this;
        }
        @CustomType.Setter
        public Builder numaNodes(Integer numaNodes) {
            if (numaNodes == null) {
              throw new MissingRequiredPropertyException("GetNodeInfoResult", "numaNodes");
            }
            this.numaNodes = numaNodes;
            return this;
        }
        public GetNodeInfoResult build() {
            final var _resultValue = new GetNodeInfoResult();
            _resultValue.cpuCoresPerSocket = cpuCoresPerSocket;
            _resultValue.cpuCoresTotal = cpuCoresTotal;
            _resultValue.cpuModel = cpuModel;
            _resultValue.cpuSockets = cpuSockets;
            _resultValue.cpuThreadsPerCore = cpuThreadsPerCore;
            _resultValue.id = id;
            _resultValue.memoryTotalKb = memoryTotalKb;
            _resultValue.numaNodes = numaNodes;
            return _resultValue;
        }
    }
}
