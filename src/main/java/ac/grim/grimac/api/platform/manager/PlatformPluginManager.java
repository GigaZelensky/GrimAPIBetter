package ac.grim.grimac.api.platform.manager;

import ac.grim.grimac.api.platform.PlatformPlugin;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Experimental
public interface PlatformPluginManager {

    PlatformPlugin[] getPlugins();

    PlatformPlugin getPlugin(String pluginName);

    default boolean isPluginEnabled(String pluginName) {
        PlatformPlugin plugin = getPlugin(pluginName);
        return plugin != null && plugin.isEnabled();
    }
}
