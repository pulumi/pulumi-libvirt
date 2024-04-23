// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.libvirt.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DomainConsoleArgs extends com.pulumi.resources.ResourceArgs {

    public static final DomainConsoleArgs Empty = new DomainConsoleArgs();

    /**
     * IP address to listen on. Defaults to 127.0.0.1.
     * 
     */
    @Import(name="sourceHost")
    private @Nullable Output<String> sourceHost;

    /**
     * @return IP address to listen on. Defaults to 127.0.0.1.
     * 
     */
    public Optional<Output<String>> sourceHost() {
        return Optional.ofNullable(this.sourceHost);
    }

    /**
     * Source path
     * 
     * Additional attributes when type is &#34;tcp&#34;:
     * 
     */
    @Import(name="sourcePath")
    private @Nullable Output<String> sourcePath;

    /**
     * @return Source path
     * 
     * Additional attributes when type is &#34;tcp&#34;:
     * 
     */
    public Optional<Output<String>> sourcePath() {
        return Optional.ofNullable(this.sourcePath);
    }

    /**
     * Port number or a service name. Defaults to a
     * random port.
     * 
     * Note that you can repeat the `console` block to create more than one console.
     * This works the same way as with the `disk` blocks (see above).
     * 
     * See [libvirt Domain XML Console element](https://libvirt.org/formatdomain.html#elementsConsole)
     * for more information.
     * 
     */
    @Import(name="sourceService")
    private @Nullable Output<String> sourceService;

    /**
     * @return Port number or a service name. Defaults to a
     * random port.
     * 
     * Note that you can repeat the `console` block to create more than one console.
     * This works the same way as with the `disk` blocks (see above).
     * 
     * See [libvirt Domain XML Console element](https://libvirt.org/formatdomain.html#elementsConsole)
     * for more information.
     * 
     */
    public Optional<Output<String>> sourceService() {
        return Optional.ofNullable(this.sourceService);
    }

    /**
     * Target port
     * 
     */
    @Import(name="targetPort", required=true)
    private Output<String> targetPort;

    /**
     * @return Target port
     * 
     */
    public Output<String> targetPort() {
        return this.targetPort;
    }

    /**
     * for the first console and defaults to `serial`.
     * Subsequent `console` blocks must have a different type - usually `virtio`.
     * 
     * Additional attributes when type is &#34;pty&#34;:
     * 
     */
    @Import(name="targetType")
    private @Nullable Output<String> targetType;

    /**
     * @return for the first console and defaults to `serial`.
     * Subsequent `console` blocks must have a different type - usually `virtio`.
     * 
     * Additional attributes when type is &#34;pty&#34;:
     * 
     */
    public Optional<Output<String>> targetType() {
        return Optional.ofNullable(this.targetType);
    }

    /**
     * Console device type. Valid values are &#34;pty&#34; and &#34;tcp&#34;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Console device type. Valid values are &#34;pty&#34; and &#34;tcp&#34;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private DomainConsoleArgs() {}

    private DomainConsoleArgs(DomainConsoleArgs $) {
        this.sourceHost = $.sourceHost;
        this.sourcePath = $.sourcePath;
        this.sourceService = $.sourceService;
        this.targetPort = $.targetPort;
        this.targetType = $.targetType;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DomainConsoleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DomainConsoleArgs $;

        public Builder() {
            $ = new DomainConsoleArgs();
        }

        public Builder(DomainConsoleArgs defaults) {
            $ = new DomainConsoleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param sourceHost IP address to listen on. Defaults to 127.0.0.1.
         * 
         * @return builder
         * 
         */
        public Builder sourceHost(@Nullable Output<String> sourceHost) {
            $.sourceHost = sourceHost;
            return this;
        }

        /**
         * @param sourceHost IP address to listen on. Defaults to 127.0.0.1.
         * 
         * @return builder
         * 
         */
        public Builder sourceHost(String sourceHost) {
            return sourceHost(Output.of(sourceHost));
        }

        /**
         * @param sourcePath Source path
         * 
         * Additional attributes when type is &#34;tcp&#34;:
         * 
         * @return builder
         * 
         */
        public Builder sourcePath(@Nullable Output<String> sourcePath) {
            $.sourcePath = sourcePath;
            return this;
        }

        /**
         * @param sourcePath Source path
         * 
         * Additional attributes when type is &#34;tcp&#34;:
         * 
         * @return builder
         * 
         */
        public Builder sourcePath(String sourcePath) {
            return sourcePath(Output.of(sourcePath));
        }

        /**
         * @param sourceService Port number or a service name. Defaults to a
         * random port.
         * 
         * Note that you can repeat the `console` block to create more than one console.
         * This works the same way as with the `disk` blocks (see above).
         * 
         * See [libvirt Domain XML Console element](https://libvirt.org/formatdomain.html#elementsConsole)
         * for more information.
         * 
         * @return builder
         * 
         */
        public Builder sourceService(@Nullable Output<String> sourceService) {
            $.sourceService = sourceService;
            return this;
        }

        /**
         * @param sourceService Port number or a service name. Defaults to a
         * random port.
         * 
         * Note that you can repeat the `console` block to create more than one console.
         * This works the same way as with the `disk` blocks (see above).
         * 
         * See [libvirt Domain XML Console element](https://libvirt.org/formatdomain.html#elementsConsole)
         * for more information.
         * 
         * @return builder
         * 
         */
        public Builder sourceService(String sourceService) {
            return sourceService(Output.of(sourceService));
        }

        /**
         * @param targetPort Target port
         * 
         * @return builder
         * 
         */
        public Builder targetPort(Output<String> targetPort) {
            $.targetPort = targetPort;
            return this;
        }

        /**
         * @param targetPort Target port
         * 
         * @return builder
         * 
         */
        public Builder targetPort(String targetPort) {
            return targetPort(Output.of(targetPort));
        }

        /**
         * @param targetType for the first console and defaults to `serial`.
         * Subsequent `console` blocks must have a different type - usually `virtio`.
         * 
         * Additional attributes when type is &#34;pty&#34;:
         * 
         * @return builder
         * 
         */
        public Builder targetType(@Nullable Output<String> targetType) {
            $.targetType = targetType;
            return this;
        }

        /**
         * @param targetType for the first console and defaults to `serial`.
         * Subsequent `console` blocks must have a different type - usually `virtio`.
         * 
         * Additional attributes when type is &#34;pty&#34;:
         * 
         * @return builder
         * 
         */
        public Builder targetType(String targetType) {
            return targetType(Output.of(targetType));
        }

        /**
         * @param type Console device type. Valid values are &#34;pty&#34; and &#34;tcp&#34;.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Console device type. Valid values are &#34;pty&#34; and &#34;tcp&#34;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public DomainConsoleArgs build() {
            if ($.targetPort == null) {
                throw new MissingRequiredPropertyException("DomainConsoleArgs", "targetPort");
            }
            if ($.type == null) {
                throw new MissingRequiredPropertyException("DomainConsoleArgs", "type");
            }
            return $;
        }
    }

}
