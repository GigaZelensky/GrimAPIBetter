package ac.grim.grimac.api.packet.protocol.attribute;

import org.jetbrains.annotations.ApiStatus;

public final class Attributes {

    private Attributes() {}

    private static Attribute getAttributeByKey(String key) {
        // TODO: User will implement the fetching logic here.
        // For now, it returns null as a placeholder.
        // This method would typically look up the attribute in a registry or similar structure.
        return null;
    }

    public static final Attribute ARMOR = getAttributeByKey("armor");
    public static final Attribute ARMOR_TOUGHNESS = getAttributeByKey("armor_toughness");
    public static final Attribute ATTACK_DAMAGE = getAttributeByKey("attack_damage");
    public static final Attribute ATTACK_KNOCKBACK = getAttributeByKey("attack_knockback");
    public static final Attribute ATTACK_SPEED = getAttributeByKey("attack_speed");
    public static final Attribute FLYING_SPEED = getAttributeByKey("flying_speed");
    public static final Attribute FOLLOW_RANGE = getAttributeByKey("follow_range");
    public static final Attribute KNOCKBACK_RESISTANCE = getAttributeByKey("knockback_resistance");
    public static final Attribute LUCK = getAttributeByKey("luck");
    public static final Attribute MAX_HEALTH = getAttributeByKey("max_health");
    public static final Attribute MOVEMENT_SPEED = getAttributeByKey("movement_speed");
    public static final Attribute SPAWN_REINFORCEMENTS = getAttributeByKey("spawn_reinforcements");

    /**
     * Added with 1.20.2
     */
    public static final Attribute MAX_ABSORPTION = getAttributeByKey("max_absorption");

    /**
     * Added with 1.20.5
     */
    public static final Attribute BLOCK_BREAK_SPEED = getAttributeByKey("block_break_speed");
    /**
     * Added with 1.20.5
     */
    public static final Attribute BLOCK_INTERACTION_RANGE = getAttributeByKey("block_interaction_range");
    /**
     * Added with 1.20.5
     */
    public static final Attribute ENTITY_INTERACTION_RANGE = getAttributeByKey("entity_interaction_range");
    /**
     * Added with 1.20.5
     */
    public static final Attribute FALL_DAMAGE_MULTIPLIER = getAttributeByKey("fall_damage_multiplier");
    /**
     * Added with 1.20.5
     */
    public static final Attribute GRAVITY = getAttributeByKey("gravity");
    /**
     * Added with 1.20.5
     */
    public static final Attribute JUMP_STRENGTH = getAttributeByKey("jump_strength");
    /**
     * Added with 1.20.5
     */
    public static final Attribute SAFE_FALL_DISTANCE = getAttributeByKey("safe_fall_distance");
    /**
     * Added with 1.20.5
     */
    public static final Attribute SCALE = getAttributeByKey("scale");
    /**
     * Added with 1.20.5
     */
    public static final Attribute STEP_HEIGHT = getAttributeByKey("step_height");

    /**
     * Added with 1.21
     */
    public static final Attribute BURNING_TIME = getAttributeByKey("burning_time");
    /**
     * Added with 1.21
     */
    public static final Attribute EXPLOSION_KNOCKBACK_RESISTANCE = getAttributeByKey("explosion_knockback_resistance");
    /**
     * Added with 1.21
     */
    public static final Attribute MINING_EFFICIENCY = getAttributeByKey("mining_efficiency");
    /**
     * Added with 1.21
     */
    public static final Attribute MOVEMENT_EFFICIENCY = getAttributeByKey("movement_efficiency");
    /**
     * Added with 1.21
     */
    public static final Attribute OXYGEN_BONUS = getAttributeByKey("oxygen_bonus");
    /**
     * Added with 1.21
     */
    public static final Attribute SNEAKING_SPEED = getAttributeByKey("sneaking_speed");
    /**
     * Added with 1.21
     */
    public static final Attribute SUBMERGED_MINING_SPEED = getAttributeByKey("submerged_mining_speed");
    /**
     * Added with 1.21
     */
    public static final Attribute SWEEPING_DAMAGE_RATIO = getAttributeByKey("sweeping_damage_ratio");
    /**
     * Added with 1.21
     */
    public static final Attribute WATER_MOVEMENT_EFFICIENCY = getAttributeByKey("water_movement_efficiency");

    /**
     * Added with 1.21.2
     */
    public static final Attribute TEMPT_RANGE = getAttributeByKey("tempt_range");

    /**
     * This attribute has been renamed in 1.20.5 to {@link #JUMP_STRENGTH}
     */
    @ApiStatus.Obsolete
    public static final Attribute HORSE_JUMP_STRENGTH = getAttributeByKey("horse.jump_strength");

    /**
     * All attribute "type" prefixes (GENERIC, PLAYER, etc...) were removed with 1.21.2
     */
    @Deprecated
    public static final Attribute GENERIC_ARMOR = getAttributeByKey("armor");
    /**
     * All attribute "type" prefixes (GENERIC, PLAYER, etc...) were removed with 1.21.2
     */
    @Deprecated
    public static final Attribute GENERIC_ARMOR_TOUGHNESS = getAttributeByKey("armor_toughness");
    /**
     * All attribute "type" prefixes (GENERIC, PLAYER, etc...) were removed with 1.21.2
     */
    @Deprecated
    public static final Attribute GENERIC_ATTACK_DAMAGE = getAttributeByKey("attack_damage");
    /**
     * All attribute "type" prefixes (GENERIC, PLAYER, etc...) were removed with 1.21.2
     */
    @Deprecated
    public static final Attribute GENERIC_ATTACK_KNOCKBACK = getAttributeByKey("attack_knockback");
    /**
     * All attribute "type" prefixes (GENERIC, PLAYER, etc...) were removed with 1.21.2
     */
    @Deprecated
    public static final Attribute GENERIC_ATTACK_SPEED = getAttributeByKey("attack_speed");
    /**
     * All attribute "type" prefixes (GENERIC, PLAYER, etc...) were removed with 1.21.2
     */
    @Deprecated
    public static final Attribute GENERIC_FLYING_SPEED = getAttributeByKey("flying_speed");
    /**
     * All attribute "type" prefixes (GENERIC, PLAYER, etc...) were removed with 1.21.2
     */
    @Deprecated
    public static final Attribute GENERIC_FOLLOW_RANGE = getAttributeByKey("follow_range");
    /**
     * All attribute "type" prefixes (GENERIC, PLAYER, etc...) were removed with 1.21.2
     */
    @Deprecated
    public static final Attribute GENERIC_KNOCKBACK_RESISTANCE = getAttributeByKey("knockback_resistance");
    /**
     * All attribute "type" prefixes (GENERIC, PLAYER, etc...) were removed with 1.21.2
     */
    @Deprecated
    public static final Attribute GENERIC_LUCK = getAttributeByKey("luck");
    /**
     * All attribute "type" prefixes (GENERIC, PLAYER, etc...) were removed with 1.21.2
     */
    @Deprecated
    public static final Attribute GENERIC_MAX_HEALTH = getAttributeByKey("max_health");
    /**
     * All attribute "type" prefixes (GENERIC, PLAYER, etc...) were removed with 1.21.2
     */
    @Deprecated
    public static final Attribute GENERIC_MOVEMENT_SPEED = getAttributeByKey("movement_speed");
    /**
     * All attribute "type" prefixes (GENERIC, PLAYER, etc...) were removed with 1.21.2
     */
    @Deprecated
    public static final Attribute ZOMBIE_SPAWN_REINFORCEMENTS = getAttributeByKey("spawn_reinforcements");
    /**
     * All attribute "type" prefixes (GENERIC, PLAYER, etc...) were removed with 1.21.2
     */
    @Deprecated
    public static final Attribute GENERIC_MAX_ABSORPTION = getAttributeByKey("max_absorption");
    /**
     * All attribute "type" prefixes (GENERIC, PLAYER, etc...) were removed with 1.21.2
     */
    @Deprecated
    public static final Attribute PLAYER_BLOCK_BREAK_SPEED = getAttributeByKey("block_break_speed");
    /**
     * All attribute "type" prefixes (GENERIC, PLAYER, etc...) were removed with 1.21.2
     */
    @Deprecated
    public static final Attribute PLAYER_BLOCK_INTERACTION_RANGE = getAttributeByKey("block_interaction_range");
    /**
     * All attribute "type" prefixes (GENERIC, PLAYER, etc...) were removed with 1.21.2
     */
    @Deprecated
    public static final Attribute PLAYER_ENTITY_INTERACTION_RANGE = getAttributeByKey("entity_interaction_range");
    /**
     * All attribute "type" prefixes (GENERIC, PLAYER, etc...) were removed with 1.21.2
     */
    @Deprecated
    public static final Attribute GENERIC_FALL_DAMAGE_MULTIPLIER = getAttributeByKey("fall_damage_multiplier");
    /**
     * All attribute "type" prefixes (GENERIC, PLAYER, etc...) were removed with 1.21.2
     */
    @Deprecated
    public static final Attribute GENERIC_GRAVITY = getAttributeByKey("gravity");
    /**
     * All attribute "type" prefixes (GENERIC, PLAYER, etc...) were removed with 1.21.2
     */
    @Deprecated
    public static final Attribute GENERIC_JUMP_STRENGTH = getAttributeByKey("jump_strength");
    /**
     * All attribute "type" prefixes (GENERIC, PLAYER, etc...) were removed with 1.21.2
     */
    @Deprecated
    public static final Attribute GENERIC_SAFE_FALL_DISTANCE = getAttributeByKey("safe_fall_distance");
    /**
     * All attribute "type" prefixes (GENERIC, PLAYER, etc...) were removed with 1.21.2
     */
    @Deprecated
    public static final Attribute GENERIC_SCALE = getAttributeByKey("scale");
    /**
     * All attribute "type" prefixes (GENERIC, PLAYER, etc...) were removed with 1.21.2
     */
    @Deprecated
    public static final Attribute GENERIC_STEP_HEIGHT = getAttributeByKey("step_height");
    /**
     * All attribute "type" prefixes (GENERIC, PLAYER, etc...) were removed with 1.21.2
     */
    @Deprecated
    public static final Attribute GENERIC_BURNING_TIME = getAttributeByKey("burning_time");
    /**
     * All attribute "type" prefixes (GENERIC, PLAYER, etc...) were removed with 1.21.2
     */
    @Deprecated
    public static final Attribute GENERIC_EXPLOSION_KNOCKBACK_RESISTANCE = getAttributeByKey("explosion_knockback_resistance");
    /**
     * All attribute "type" prefixes (GENERIC, PLAYER, etc...) were removed with 1.21.2
     */
    @Deprecated
    public static final Attribute PLAYER_MINING_EFFICIENCY = getAttributeByKey("mining_efficiency");
    /**
     * All attribute "type" prefixes (GENERIC, PLAYER, etc...) were removed with 1.21.2
     */
    @Deprecated
    public static final Attribute GENERIC_MOVEMENT_EFFICIENCY = getAttributeByKey("movement_efficiency");
    /**
     * All attribute "type" prefixes (GENERIC, PLAYER, etc...) were removed with 1.21.2
     */
    @Deprecated
    public static final Attribute GENERIC_OXYGEN_BONUS = getAttributeByKey("oxygen_bonus");
    /**
     * All attribute "type" prefixes (GENERIC, PLAYER, etc...) were removed with 1.21.2
     */
    @Deprecated
    public static final Attribute PLAYER_SNEAKING_SPEED = getAttributeByKey("sneaking_speed");
    /**
     * All attribute "type" prefixes (GENERIC, PLAYER, etc...) were removed with 1.21.2
     */
    @Deprecated
    public static final Attribute PLAYER_SUBMERGED_MINING_SPEED = getAttributeByKey("submerged_mining_speed");
    /**
     * All attribute "type" prefixes (GENERIC, PLAYER, etc...) were removed with 1.21.2
     */
    @Deprecated
    public static final Attribute PLAYER_SWEEPING_DAMAGE_RATIO = getAttributeByKey("sweeping_damage_ratio");
    /**
     * All attribute "type" prefixes (GENERIC, PLAYER, etc...) were removed with 1.21.2
     */
    @Deprecated
    public static final Attribute GENERIC_WATER_MOVEMENT_EFFICIENCY = getAttributeByKey("water_movement_efficiency");
}
