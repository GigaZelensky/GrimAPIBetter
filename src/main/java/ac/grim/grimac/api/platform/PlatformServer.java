package ac.grim.grimac.api.platform;

import ac.grim.grimac.api.platform.sender.Sender;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Experimental
public interface PlatformServer {

    String getPlatformImplementationString();

    void dispatchCommand(Sender sender, String command);

    Sender getConsoleSender();

    void registerOutgoingPluginChannel(String name);

    double getTPS();
}
