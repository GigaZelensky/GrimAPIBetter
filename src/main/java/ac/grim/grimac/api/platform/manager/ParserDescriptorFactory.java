package ac.grim.grimac.api.platform.manager;

import ac.grim.grimac.api.platform.command.PlayerSelector;
import ac.grim.grimac.api.platform.sender.Sender;
import org.incendo.cloud.parser.ParserDescriptor;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Experimental
public interface ParserDescriptorFactory {
    ParserDescriptor<Sender, PlayerSelector> getSinglePlayer();
}
