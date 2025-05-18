package ac.grim.grimac.api.platform.sender;

import net.kyori.adventure.text.Component;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;
import java.util.UUID;

/**
 * Factory class to make a thread-safe sender instance
 *
 * @param <T> the command sender type
 */
@ApiStatus.Experimental
public abstract class SenderFactory<T> {
    protected abstract UUID getUniqueId(T sender);

    protected abstract String getName(T sender);

    protected abstract void sendMessage(T sender, String message);

    protected abstract void sendMessage(T sender, Component message);

    protected abstract boolean hasPermission(T sender, String node);

    protected abstract boolean hasPermission(T sender, String node, boolean defaultIfUnset);

    protected abstract void performCommand(T sender, String command);

    protected abstract boolean isConsole(T sender);

    protected abstract boolean isPlayer(T sender);

    public final @NonNull Sender wrap(@NonNull T sender) {
        Objects.requireNonNull(sender, "sender");
        return new AbstractSender<>(this, sender);
    }

    @SuppressWarnings("unchecked")
    public final @NonNull T unwrap(@NonNull Sender sender) {
        Objects.requireNonNull(sender, "sender");
        return (T) sender.getNativeSender();
    }
}
