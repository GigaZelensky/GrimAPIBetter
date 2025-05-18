package ac.grim.grimac.api.plugin;

import org.jetbrains.annotations.ApiStatus;

import java.io.File;
import java.util.logging.Logger;

@ApiStatus.Experimental
public interface GrimPlugin {

    GrimPluginDescription getDescription();

    Logger getLogger();

    File getDataFolder();
}
