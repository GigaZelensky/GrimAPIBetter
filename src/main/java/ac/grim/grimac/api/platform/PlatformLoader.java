package ac.grim.grimac.api.platform;

import ac.grim.grimac.api.GrimAbstractAPI;
import ac.grim.grimac.api.packet.MCPacketAPI;
import ac.grim.grimac.api.plugin.GrimPlugin;
import ac.grim.grimac.api.platform.manager.*;
import ac.grim.grimac.api.platform.player.PlatformPlayerFactory;
import ac.grim.grimac.api.platform.scheduler.PlatformScheduler;
import ac.grim.grimac.api.platform.sender.Sender;
import ac.grim.grimac.api.platform.sender.SenderFactory;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.incendo.cloud.CommandManager;

@ApiStatus.Experimental
public interface PlatformLoader {
    PlatformScheduler getScheduler();

    PlatformPlayerFactory getPlatformPlayerFactory();

    ParserDescriptorFactory getParserDescriptorFactory();

    Object getPacketAPI();

    CommandManager<Sender> getCommandManager();

    ItemResetHandler getItemResetHandler();

    SenderFactory<?> getSenderFactory();

    GrimPlugin getPlugin();

    PlatformPluginManager getPluginManager();

    PlatformServer getPlatformServer();

    // Intended for use for platform specific service/API bringup
    // Method will be called when InitManager.load() is called
    void registerAPIService(GrimAbstractAPI api);

    // Used to replace text placeholders in messages
    // Currently only supports PlaceHolderAPI on Bukkit
    @NotNull
    MessagePlaceHolderManager getMessagePlaceHolderManager();

    PermissionRegistrationManager getPermissionManager();

    MCPacketAPI getMCPacketAPI();
}
