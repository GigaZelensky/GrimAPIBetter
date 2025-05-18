package ac.grim.grimac.api.platform.permissions;

import org.jetbrains.annotations.ApiStatus;

/**
 * Represents the default value for a permission, used across platforms.
 * This enum provides a cross-platform abstraction for permission defaults,
 * mapping to platform-specific values (e.g., Bukkit's PermissionDefault, Fabric's boolean).
 */
@ApiStatus.Experimental
public enum PermissionDefaultValue {
    /**
     * Permission defaults to true (granted by default).
     * - Bukkit: Maps to PermissionDefault.TRUE
     * - Fabric: Maps to true
     */
    TRUE,

    /**
     * Permission defaults to false (denied by default).
     * - Bukkit: Maps to PermissionDefault.FALSE
     * - Fabric: Maps to false
     */
    FALSE,

    /**
     * Permission defaults to requiring operator (op) status.
     * - Bukkit: Maps to PermissionDefault.OP
     * - Fabric: Maps to requiring op-permission-level
     */
    OP,

    /**
     * Permission defaults to not requiring operator (op) status.
     * - Bukkit: Maps to PermissionDefault.NOT_OP
     * - Fabric: Maps to requiring &lt; op-permission-level
     */
    NOT_OP
}
