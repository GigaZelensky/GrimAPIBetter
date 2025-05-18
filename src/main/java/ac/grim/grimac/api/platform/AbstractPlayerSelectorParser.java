package ac.grim.grimac.api.platform;

import ac.grim.grimac.api.platform.command.PlayerSelector;
import org.incendo.cloud.context.CommandContext;
import org.incendo.cloud.parser.ParserDescriptor;
import org.jetbrains.annotations.ApiStatus;

import java.util.concurrent.CompletableFuture;

@ApiStatus.Experimental
public abstract class AbstractPlayerSelectorParser<C> {

    public abstract ParserDescriptor<C, PlayerSelector> descriptor();

    protected abstract ParserDescriptor<C, ?> getPlatformSpecificDescriptor();

    protected abstract CompletableFuture<PlayerSelector> adaptToCommonSelector(CommandContext<C> context, Object platformSpecificSelector);

    // Helper method to create the ParserDescriptor
    protected ParserDescriptor<C, PlayerSelector> createDescriptor() {
        return ParserDescriptor.of(
                getPlatformSpecificDescriptor().parser().mapSuccess(this::adaptToCommonSelector),
                PlayerSelector.class
        );
    }
}
