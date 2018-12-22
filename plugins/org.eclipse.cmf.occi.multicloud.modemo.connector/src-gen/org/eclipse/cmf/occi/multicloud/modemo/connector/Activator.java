package org.eclipse.cmf.occi.multicloud.modemo.connector;

import java.net.URL;
import java.util.Properties;
import org.apache.log4j.PropertyConfigurator;
import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

public class Activator extends Plugin {

    /**
     * The plug-in ID.
     */
    public static final String PLUGIN_ID = "org.eclipse.cmf.occi.multicloud.modemo.connector";

    /**
     * The shared instance.
     */
    private static Activator plugin;
    
    /**
     * The constructor.
     */
    public Activator() {
    }

    /**
     * {@inheritDoc}
     *
     * @see org.eclipse.core.runtime.Plugin#start(org.osgi.framework.BundleContext)
     */
    public void start(BundleContext context) throws Exception {
        super.start(context);
        plugin = this;
        Properties log4jProperties = new Properties();
        URL url = this.getBundle().getResource("log4j.properties");
        log4jProperties.load(url.openStream());
        PropertyConfigurator.configure(log4jProperties);
    }

    /**
     * {@inheritDoc}
     *
     * @see org.eclipse.core.runtime.Plugin#stop(org.osgi.framework.BundleContext)
     */
    public void stop(BundleContext context) throws Exception {
        plugin = null;
        super.stop(context);
    }

    /**
     * Returns the shared instance.
     *
     * @return the shared instance
     */
    public static Activator getDefault() {
        return plugin;
    }

}
