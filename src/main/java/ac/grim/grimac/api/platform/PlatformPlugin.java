package ac.grim.grimac.api.platform;

import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Experimental
public interface PlatformPlugin {
    boolean isEnabled();

    String getName();

    String getVersion();
}
