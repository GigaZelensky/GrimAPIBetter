package ac.grim.grimac.api.platform.init;

import ac.grim.grimac.api.GrimAPIProvider;
import ac.grim.grimac.api.GrimUser;

// Intended for future events we inject all platforms at the end of a tick
public abstract class AbstractTickEndEvent implements StartableInitable {

    @Override
    public void start() {

    }

    protected boolean shouldInjectEndTick() {
        return GrimAPIProvider.getDirect().getConfigManager().getBooleanElse("Reach.enable-post-packet", false);
    }
}
