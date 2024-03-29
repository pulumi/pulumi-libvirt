// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.libvirt;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CloudInitDiskArgs extends com.pulumi.resources.ResourceArgs {

    public static final CloudInitDiskArgs Empty = new CloudInitDiskArgs();

    /**
     * cloud-init user data.
     * 
     */
    @Import(name="metaData")
    private @Nullable Output<String> metaData;

    /**
     * @return cloud-init user data.
     * 
     */
    public Optional<Output<String>> metaData() {
        return Optional.ofNullable(this.metaData);
    }

    /**
     * A unique name for the resource, required by libvirt.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A unique name for the resource, required by libvirt.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * cloud-init network-config data.
     * 
     */
    @Import(name="networkConfig")
    private @Nullable Output<String> networkConfig;

    /**
     * @return cloud-init network-config data.
     * 
     */
    public Optional<Output<String>> networkConfig() {
        return Optional.ofNullable(this.networkConfig);
    }

    /**
     * The pool where the resource will be created.
     * If not given, the `default` pool will be used.
     * For user_data, network_config and meta_data parameters have a look at upstream doc:
     * http://cloudinit.readthedocs.io/en/latest/topics/datasources/nocloud.html#datasource-nocloud
     * 
     */
    @Import(name="pool")
    private @Nullable Output<String> pool;

    /**
     * @return The pool where the resource will be created.
     * If not given, the `default` pool will be used.
     * For user_data, network_config and meta_data parameters have a look at upstream doc:
     * http://cloudinit.readthedocs.io/en/latest/topics/datasources/nocloud.html#datasource-nocloud
     * 
     */
    public Optional<Output<String>> pool() {
        return Optional.ofNullable(this.pool);
    }

    /**
     * cloud-init user data.
     * 
     */
    @Import(name="userData")
    private @Nullable Output<String> userData;

    /**
     * @return cloud-init user data.
     * 
     */
    public Optional<Output<String>> userData() {
        return Optional.ofNullable(this.userData);
    }

    private CloudInitDiskArgs() {}

    private CloudInitDiskArgs(CloudInitDiskArgs $) {
        this.metaData = $.metaData;
        this.name = $.name;
        this.networkConfig = $.networkConfig;
        this.pool = $.pool;
        this.userData = $.userData;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CloudInitDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudInitDiskArgs $;

        public Builder() {
            $ = new CloudInitDiskArgs();
        }

        public Builder(CloudInitDiskArgs defaults) {
            $ = new CloudInitDiskArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param metaData cloud-init user data.
         * 
         * @return builder
         * 
         */
        public Builder metaData(@Nullable Output<String> metaData) {
            $.metaData = metaData;
            return this;
        }

        /**
         * @param metaData cloud-init user data.
         * 
         * @return builder
         * 
         */
        public Builder metaData(String metaData) {
            return metaData(Output.of(metaData));
        }

        /**
         * @param name A unique name for the resource, required by libvirt.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A unique name for the resource, required by libvirt.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param networkConfig cloud-init network-config data.
         * 
         * @return builder
         * 
         */
        public Builder networkConfig(@Nullable Output<String> networkConfig) {
            $.networkConfig = networkConfig;
            return this;
        }

        /**
         * @param networkConfig cloud-init network-config data.
         * 
         * @return builder
         * 
         */
        public Builder networkConfig(String networkConfig) {
            return networkConfig(Output.of(networkConfig));
        }

        /**
         * @param pool The pool where the resource will be created.
         * If not given, the `default` pool will be used.
         * For user_data, network_config and meta_data parameters have a look at upstream doc:
         * http://cloudinit.readthedocs.io/en/latest/topics/datasources/nocloud.html#datasource-nocloud
         * 
         * @return builder
         * 
         */
        public Builder pool(@Nullable Output<String> pool) {
            $.pool = pool;
            return this;
        }

        /**
         * @param pool The pool where the resource will be created.
         * If not given, the `default` pool will be used.
         * For user_data, network_config and meta_data parameters have a look at upstream doc:
         * http://cloudinit.readthedocs.io/en/latest/topics/datasources/nocloud.html#datasource-nocloud
         * 
         * @return builder
         * 
         */
        public Builder pool(String pool) {
            return pool(Output.of(pool));
        }

        /**
         * @param userData cloud-init user data.
         * 
         * @return builder
         * 
         */
        public Builder userData(@Nullable Output<String> userData) {
            $.userData = userData;
            return this;
        }

        /**
         * @param userData cloud-init user data.
         * 
         * @return builder
         * 
         */
        public Builder userData(String userData) {
            return userData(Output.of(userData));
        }

        public CloudInitDiskArgs build() {
            return $;
        }
    }

}
