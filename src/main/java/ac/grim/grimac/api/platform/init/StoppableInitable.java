package ac.grim.grimac.api.platform.init;

import ac.grim.grimac.api.platform.init.Initable;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Experimental
public interface StoppableInitable extends Initable {
    void stop();
}
