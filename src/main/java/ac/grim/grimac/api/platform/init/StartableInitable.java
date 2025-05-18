package ac.grim.grimac.api.platform.init;

import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Experimental
public interface StartableInitable extends Initable {
    void start();
}
