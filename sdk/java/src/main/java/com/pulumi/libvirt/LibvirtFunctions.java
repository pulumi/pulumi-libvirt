// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.libvirt;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.deployment.InvokeOutputOptions;
import com.pulumi.libvirt.Utilities;
import com.pulumi.libvirt.inputs.GetNetworkDnsHostTemplateArgs;
import com.pulumi.libvirt.inputs.GetNetworkDnsHostTemplatePlainArgs;
import com.pulumi.libvirt.inputs.GetNetworkDnsSrvTemplateArgs;
import com.pulumi.libvirt.inputs.GetNetworkDnsSrvTemplatePlainArgs;
import com.pulumi.libvirt.inputs.GetNetworkDnsmasqOptionsTemplateArgs;
import com.pulumi.libvirt.inputs.GetNetworkDnsmasqOptionsTemplatePlainArgs;
import com.pulumi.libvirt.inputs.GetNodeDeviceInfoArgs;
import com.pulumi.libvirt.inputs.GetNodeDeviceInfoPlainArgs;
import com.pulumi.libvirt.inputs.GetNodeDevicesArgs;
import com.pulumi.libvirt.inputs.GetNodeDevicesPlainArgs;
import com.pulumi.libvirt.outputs.GetNetworkDnsHostTemplateResult;
import com.pulumi.libvirt.outputs.GetNetworkDnsSrvTemplateResult;
import com.pulumi.libvirt.outputs.GetNetworkDnsmasqOptionsTemplateResult;
import com.pulumi.libvirt.outputs.GetNodeDeviceInfoResult;
import com.pulumi.libvirt.outputs.GetNodeDevicesResult;
import com.pulumi.libvirt.outputs.GetNodeInfoResult;
import com.pulumi.resources.InvokeArgs;
import java.util.concurrent.CompletableFuture;

public final class LibvirtFunctions {
    public static Output<GetNetworkDnsHostTemplateResult> getNetworkDnsHostTemplate(GetNetworkDnsHostTemplateArgs args) {
        return getNetworkDnsHostTemplate(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetNetworkDnsHostTemplateResult> getNetworkDnsHostTemplatePlain(GetNetworkDnsHostTemplatePlainArgs args) {
        return getNetworkDnsHostTemplatePlain(args, InvokeOptions.Empty);
    }
    public static Output<GetNetworkDnsHostTemplateResult> getNetworkDnsHostTemplate(GetNetworkDnsHostTemplateArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("libvirt:index/getNetworkDnsHostTemplate:getNetworkDnsHostTemplate", TypeShape.of(GetNetworkDnsHostTemplateResult.class), args, Utilities.withVersion(options));
    }
    public static Output<GetNetworkDnsHostTemplateResult> getNetworkDnsHostTemplate(GetNetworkDnsHostTemplateArgs args, InvokeOutputOptions options) {
        return Deployment.getInstance().invoke("libvirt:index/getNetworkDnsHostTemplate:getNetworkDnsHostTemplate", TypeShape.of(GetNetworkDnsHostTemplateResult.class), args, Utilities.withVersion(options));
    }
    public static CompletableFuture<GetNetworkDnsHostTemplateResult> getNetworkDnsHostTemplatePlain(GetNetworkDnsHostTemplatePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("libvirt:index/getNetworkDnsHostTemplate:getNetworkDnsHostTemplate", TypeShape.of(GetNetworkDnsHostTemplateResult.class), args, Utilities.withVersion(options));
    }
    public static Output<GetNetworkDnsSrvTemplateResult> getNetworkDnsSrvTemplate(GetNetworkDnsSrvTemplateArgs args) {
        return getNetworkDnsSrvTemplate(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetNetworkDnsSrvTemplateResult> getNetworkDnsSrvTemplatePlain(GetNetworkDnsSrvTemplatePlainArgs args) {
        return getNetworkDnsSrvTemplatePlain(args, InvokeOptions.Empty);
    }
    public static Output<GetNetworkDnsSrvTemplateResult> getNetworkDnsSrvTemplate(GetNetworkDnsSrvTemplateArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("libvirt:index/getNetworkDnsSrvTemplate:getNetworkDnsSrvTemplate", TypeShape.of(GetNetworkDnsSrvTemplateResult.class), args, Utilities.withVersion(options));
    }
    public static Output<GetNetworkDnsSrvTemplateResult> getNetworkDnsSrvTemplate(GetNetworkDnsSrvTemplateArgs args, InvokeOutputOptions options) {
        return Deployment.getInstance().invoke("libvirt:index/getNetworkDnsSrvTemplate:getNetworkDnsSrvTemplate", TypeShape.of(GetNetworkDnsSrvTemplateResult.class), args, Utilities.withVersion(options));
    }
    public static CompletableFuture<GetNetworkDnsSrvTemplateResult> getNetworkDnsSrvTemplatePlain(GetNetworkDnsSrvTemplatePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("libvirt:index/getNetworkDnsSrvTemplate:getNetworkDnsSrvTemplate", TypeShape.of(GetNetworkDnsSrvTemplateResult.class), args, Utilities.withVersion(options));
    }
    public static Output<GetNetworkDnsmasqOptionsTemplateResult> getNetworkDnsmasqOptionsTemplate(GetNetworkDnsmasqOptionsTemplateArgs args) {
        return getNetworkDnsmasqOptionsTemplate(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetNetworkDnsmasqOptionsTemplateResult> getNetworkDnsmasqOptionsTemplatePlain(GetNetworkDnsmasqOptionsTemplatePlainArgs args) {
        return getNetworkDnsmasqOptionsTemplatePlain(args, InvokeOptions.Empty);
    }
    public static Output<GetNetworkDnsmasqOptionsTemplateResult> getNetworkDnsmasqOptionsTemplate(GetNetworkDnsmasqOptionsTemplateArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("libvirt:index/getNetworkDnsmasqOptionsTemplate:getNetworkDnsmasqOptionsTemplate", TypeShape.of(GetNetworkDnsmasqOptionsTemplateResult.class), args, Utilities.withVersion(options));
    }
    public static Output<GetNetworkDnsmasqOptionsTemplateResult> getNetworkDnsmasqOptionsTemplate(GetNetworkDnsmasqOptionsTemplateArgs args, InvokeOutputOptions options) {
        return Deployment.getInstance().invoke("libvirt:index/getNetworkDnsmasqOptionsTemplate:getNetworkDnsmasqOptionsTemplate", TypeShape.of(GetNetworkDnsmasqOptionsTemplateResult.class), args, Utilities.withVersion(options));
    }
    public static CompletableFuture<GetNetworkDnsmasqOptionsTemplateResult> getNetworkDnsmasqOptionsTemplatePlain(GetNetworkDnsmasqOptionsTemplatePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("libvirt:index/getNetworkDnsmasqOptionsTemplate:getNetworkDnsmasqOptionsTemplate", TypeShape.of(GetNetworkDnsmasqOptionsTemplateResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieve information about a specific device on the current node
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.libvirt.LibvirtFunctions;
     * import com.pulumi.libvirt.inputs.GetNodeDeviceInfoArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var device = LibvirtFunctions.getNodeDeviceInfo(GetNodeDeviceInfoArgs.builder()
     *             .name("pci_0000_00_00_0")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetNodeDeviceInfoResult> getNodeDeviceInfo(GetNodeDeviceInfoArgs args) {
        return getNodeDeviceInfo(args, InvokeOptions.Empty);
    }
    /**
     * Retrieve information about a specific device on the current node
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.libvirt.LibvirtFunctions;
     * import com.pulumi.libvirt.inputs.GetNodeDeviceInfoArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var device = LibvirtFunctions.getNodeDeviceInfo(GetNodeDeviceInfoArgs.builder()
     *             .name("pci_0000_00_00_0")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetNodeDeviceInfoResult> getNodeDeviceInfoPlain(GetNodeDeviceInfoPlainArgs args) {
        return getNodeDeviceInfoPlain(args, InvokeOptions.Empty);
    }
    /**
     * Retrieve information about a specific device on the current node
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.libvirt.LibvirtFunctions;
     * import com.pulumi.libvirt.inputs.GetNodeDeviceInfoArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var device = LibvirtFunctions.getNodeDeviceInfo(GetNodeDeviceInfoArgs.builder()
     *             .name("pci_0000_00_00_0")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetNodeDeviceInfoResult> getNodeDeviceInfo(GetNodeDeviceInfoArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("libvirt:index/getNodeDeviceInfo:getNodeDeviceInfo", TypeShape.of(GetNodeDeviceInfoResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieve information about a specific device on the current node
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.libvirt.LibvirtFunctions;
     * import com.pulumi.libvirt.inputs.GetNodeDeviceInfoArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var device = LibvirtFunctions.getNodeDeviceInfo(GetNodeDeviceInfoArgs.builder()
     *             .name("pci_0000_00_00_0")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetNodeDeviceInfoResult> getNodeDeviceInfo(GetNodeDeviceInfoArgs args, InvokeOutputOptions options) {
        return Deployment.getInstance().invoke("libvirt:index/getNodeDeviceInfo:getNodeDeviceInfo", TypeShape.of(GetNodeDeviceInfoResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieve information about a specific device on the current node
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.libvirt.LibvirtFunctions;
     * import com.pulumi.libvirt.inputs.GetNodeDeviceInfoArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var device = LibvirtFunctions.getNodeDeviceInfo(GetNodeDeviceInfoArgs.builder()
     *             .name("pci_0000_00_00_0")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetNodeDeviceInfoResult> getNodeDeviceInfoPlain(GetNodeDeviceInfoPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("libvirt:index/getNodeDeviceInfo:getNodeDeviceInfo", TypeShape.of(GetNodeDeviceInfoResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieve information about the devices present on the current node
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.libvirt.LibvirtFunctions;
     * import com.pulumi.libvirt.inputs.GetNodeDevicesArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var node = LibvirtFunctions.getNodeDevices(GetNodeDevicesArgs.builder()
     *             .capability("pci")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetNodeDevicesResult> getNodeDevices() {
        return getNodeDevices(GetNodeDevicesArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Retrieve information about the devices present on the current node
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.libvirt.LibvirtFunctions;
     * import com.pulumi.libvirt.inputs.GetNodeDevicesArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var node = LibvirtFunctions.getNodeDevices(GetNodeDevicesArgs.builder()
     *             .capability("pci")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetNodeDevicesResult> getNodeDevicesPlain() {
        return getNodeDevicesPlain(GetNodeDevicesPlainArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Retrieve information about the devices present on the current node
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.libvirt.LibvirtFunctions;
     * import com.pulumi.libvirt.inputs.GetNodeDevicesArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var node = LibvirtFunctions.getNodeDevices(GetNodeDevicesArgs.builder()
     *             .capability("pci")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetNodeDevicesResult> getNodeDevices(GetNodeDevicesArgs args) {
        return getNodeDevices(args, InvokeOptions.Empty);
    }
    /**
     * Retrieve information about the devices present on the current node
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.libvirt.LibvirtFunctions;
     * import com.pulumi.libvirt.inputs.GetNodeDevicesArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var node = LibvirtFunctions.getNodeDevices(GetNodeDevicesArgs.builder()
     *             .capability("pci")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetNodeDevicesResult> getNodeDevicesPlain(GetNodeDevicesPlainArgs args) {
        return getNodeDevicesPlain(args, InvokeOptions.Empty);
    }
    /**
     * Retrieve information about the devices present on the current node
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.libvirt.LibvirtFunctions;
     * import com.pulumi.libvirt.inputs.GetNodeDevicesArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var node = LibvirtFunctions.getNodeDevices(GetNodeDevicesArgs.builder()
     *             .capability("pci")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetNodeDevicesResult> getNodeDevices(GetNodeDevicesArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("libvirt:index/getNodeDevices:getNodeDevices", TypeShape.of(GetNodeDevicesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieve information about the devices present on the current node
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.libvirt.LibvirtFunctions;
     * import com.pulumi.libvirt.inputs.GetNodeDevicesArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var node = LibvirtFunctions.getNodeDevices(GetNodeDevicesArgs.builder()
     *             .capability("pci")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetNodeDevicesResult> getNodeDevices(GetNodeDevicesArgs args, InvokeOutputOptions options) {
        return Deployment.getInstance().invoke("libvirt:index/getNodeDevices:getNodeDevices", TypeShape.of(GetNodeDevicesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieve information about the devices present on the current node
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.libvirt.LibvirtFunctions;
     * import com.pulumi.libvirt.inputs.GetNodeDevicesArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var node = LibvirtFunctions.getNodeDevices(GetNodeDevicesArgs.builder()
     *             .capability("pci")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetNodeDevicesResult> getNodeDevicesPlain(GetNodeDevicesPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("libvirt:index/getNodeDevices:getNodeDevices", TypeShape.of(GetNodeDevicesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieve information about the current node
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.libvirt.LibvirtFunctions;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var node = LibvirtFunctions.getNodeInfo();
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetNodeInfoResult> getNodeInfo() {
        return getNodeInfo(InvokeArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Retrieve information about the current node
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.libvirt.LibvirtFunctions;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var node = LibvirtFunctions.getNodeInfo();
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetNodeInfoResult> getNodeInfoPlain() {
        return getNodeInfoPlain(InvokeArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Retrieve information about the current node
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.libvirt.LibvirtFunctions;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var node = LibvirtFunctions.getNodeInfo();
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetNodeInfoResult> getNodeInfo(InvokeArgs args) {
        return getNodeInfo(args, InvokeOptions.Empty);
    }
    /**
     * Retrieve information about the current node
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.libvirt.LibvirtFunctions;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var node = LibvirtFunctions.getNodeInfo();
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetNodeInfoResult> getNodeInfoPlain(InvokeArgs args) {
        return getNodeInfoPlain(args, InvokeOptions.Empty);
    }
    /**
     * Retrieve information about the current node
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.libvirt.LibvirtFunctions;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var node = LibvirtFunctions.getNodeInfo();
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetNodeInfoResult> getNodeInfo(InvokeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("libvirt:index/getNodeInfo:getNodeInfo", TypeShape.of(GetNodeInfoResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieve information about the current node
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.libvirt.LibvirtFunctions;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var node = LibvirtFunctions.getNodeInfo();
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetNodeInfoResult> getNodeInfo(InvokeArgs args, InvokeOutputOptions options) {
        return Deployment.getInstance().invoke("libvirt:index/getNodeInfo:getNodeInfo", TypeShape.of(GetNodeInfoResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieve information about the current node
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.libvirt.LibvirtFunctions;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var node = LibvirtFunctions.getNodeInfo();
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetNodeInfoResult> getNodeInfoPlain(InvokeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("libvirt:index/getNodeInfo:getNodeInfo", TypeShape.of(GetNodeInfoResult.class), args, Utilities.withVersion(options));
    }
}
