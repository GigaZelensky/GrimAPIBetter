package ac.grim.grimac.api.util;

import ac.grim.grimac.api.GrimAPIProvider;
import lombok.experimental.UtilityClass;
import net.kyori.adventure.text.Component;
import org.jetbrains.annotations.ApiStatus;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

@UtilityClass @ApiStatus.Experimental @ApiStatus.Internal
public class LogUtil {
    public void info(final String info) {
        getLogger().info(info);
    }

    public void warn(final String warn) {
        getLogger().warning(warn);
    }

    public void error(final String error) {
        getLogger().severe(error);
    }

    public void error(final String description, final Throwable throwable) {
        getLogger().severe(description);
        throwable.printStackTrace();
    }

    public Logger getLogger() {
        return GrimAPIProvider.getDirect().getPlatformLoader().getPlugin().getLogger();
    }

    public void console(final String info) {
        GrimAPIProvider.getDirect().getPlatformLoader().getPlatformServer().getConsoleSender().sendMessage(ChatUtil.translateAlternateColorCodes('&', info));
    }

    public void console(final Component info) {
        GrimAPIProvider.getDirect().getPlatformLoader().getPlatformServer().getConsoleSender().sendMessage(info);
    }

    public static void exception(String description, Throwable throwable) {
        getLogger().severe(description + ": " + getStackTrace(throwable));
    }

    private static String getStackTrace(Throwable throwable) {
        String message = throwable.getMessage();
        try (StringWriter sw = new StringWriter()) {
            try (PrintWriter pw = new PrintWriter(sw)) {
                throwable.printStackTrace(pw);
                message = sw.toString();
            }
        } catch (Exception ignored) {
            ignored.printStackTrace();
        }
        return message;
    }

}
