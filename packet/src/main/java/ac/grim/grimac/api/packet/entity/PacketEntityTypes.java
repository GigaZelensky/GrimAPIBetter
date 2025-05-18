package ac.grim.grimac.api.packet.entity;

import ac.grim.grimac.api.packet.MCPacket;

public class PacketEntityTypes {
    private static final PacketEntityManager TYPE = MCPacket.getAPI().getEntityManager();

    public static final PacketEntityType BOAT = TYPE.getEntityTypeFromString("boat");
    public static final PacketEntityType CHEST_BOAT = TYPE.getEntityTypeFromString("chest_boat");
    public static final PacketEntityType ITEM             = TYPE.getEntityTypeFromString("item");
    public static final PacketEntityType CAMEL            = TYPE.getEntityTypeFromString("camel");
    public static final PacketEntityType ABSTRACT_HORSE   = TYPE.getEntityTypeFromString("abstract_horse");
    public static final PacketEntityType SLIME            = TYPE.getEntityTypeFromString("slime");
    public static final PacketEntityType MAGMA_CUBE       = TYPE.getEntityTypeFromString("magma_cube");
    public static final PacketEntityType PHANTOM          = TYPE.getEntityTypeFromString("phantom");
    public static final PacketEntityType PIG              = TYPE.getEntityTypeFromString("pig");
    public static final PacketEntityType SHULKER          = TYPE.getEntityTypeFromString("shulker");
    public static final PacketEntityType STRIDER          = TYPE.getEntityTypeFromString("strider");
    public static final PacketEntityType CHICKEN          = TYPE.getEntityTypeFromString("chicken");
    public static final PacketEntityType FISHING_BOBBER   = TYPE.getEntityTypeFromString("fishing_bobber");
    public static final PacketEntityType ENDER_DRAGON     = TYPE.getEntityTypeFromString("ender_dragon");

    public static final PacketEntityType ABSTRACT_ARROW   = TYPE.getEntityTypeFromString("abstract_arrow");
    public static final PacketEntityType FIREWORK_ROCKET  = TYPE.getEntityTypeFromString("firework_rocket");
    public static final PacketEntityType BLOCK_DISPLAY    = TYPE.getEntityTypeFromString("block_display");
    public static final PacketEntityType TEXT_DISPLAY     = TYPE.getEntityTypeFromString("text_display");
    public static final PacketEntityType LIGHTNING_BOLT   = TYPE.getEntityTypeFromString("lightning_bolt");
    public static final PacketEntityType EXPERIENCE_BOTTLE= TYPE.getEntityTypeFromString("experience_bottle");
    public static final PacketEntityType EXPERIENCE_ORB   = TYPE.getEntityTypeFromString("experience_orb");

    public static final PacketEntityType ARMOR_STAND      = TYPE.getEntityTypeFromString("armor_stand");
    public static final PacketEntityType PAINTING         = TYPE.getEntityTypeFromString("painting");
    public static final PacketEntityType GUARDIAN         = TYPE.getEntityTypeFromString("guardian");
    public static final PacketEntityType ELDER_GUARDIAN   = TYPE.getEntityTypeFromString("elder_guardian");

    public static final PacketEntityType CHESTED_HORSE  = TYPE.getEntityTypeFromString("chested_horse");
    public static final PacketEntityType ZOMBIE_HORSE   = TYPE.getEntityTypeFromString("zombie_horse");
    public static final PacketEntityType SKELETON_HORSE = TYPE.getEntityTypeFromString("skeleton_horse");

    public static final PacketEntityType LIVINGENTITY        = TYPE.getEntityTypeFromString("livingentity");
    public static final PacketEntityType MINECART_ABSTRACT   = TYPE.getEntityTypeFromString("minecart_abstract");
    public static final PacketEntityType ABSTRACT_AGEABLE    = TYPE.getEntityTypeFromString("abstract_ageable");
    public static final PacketEntityType ABSTRACT_PARROT     = TYPE.getEntityTypeFromString("abstract_parrot");
    public static final PacketEntityType ABSTRACT_PIGLIN     = TYPE.getEntityTypeFromString("abstract_piglin");
    public static final PacketEntityType ABSTRACT_ANIMAL     = TYPE.getEntityTypeFromString("abstract_animal");

    public static final PacketEntityType FROG                = TYPE.getEntityTypeFromString("frog");
    public static final PacketEntityType ZOMBIE              = TYPE.getEntityTypeFromString("zombie");
    public static final PacketEntityType ZOGLIN              = TYPE.getEntityTypeFromString("zoglin");

    public static final PacketEntityType BAT                 = TYPE.getEntityTypeFromString("bat");
    public static final PacketEntityType PARROT              = TYPE.getEntityTypeFromString("parrot");

    public static final PacketEntityType TURTLE            = TYPE.getEntityTypeFromString("turtle");
    public static final PacketEntityType ZOMBIFIED_PIGLIN  = TYPE.getEntityTypeFromString("zombified_piglin");
    public static final PacketEntityType SKELETON          = TYPE.getEntityTypeFromString("skeleton");
    public static final PacketEntityType ENDERMITE         = TYPE.getEntityTypeFromString("endermite");
    public static final PacketEntityType SILVERFISH        = TYPE.getEntityTypeFromString("silverfish");

    public static final PacketEntityType EVOKER            = TYPE.getEntityTypeFromString("evoker");
    public static final PacketEntityType ILLUSIONER        = TYPE.getEntityTypeFromString("illusioner");
    public static final PacketEntityType PILLAGER          = TYPE.getEntityTypeFromString("pillager");
    public static final PacketEntityType RAVAGER           = TYPE.getEntityTypeFromString("ravager");
    public static final PacketEntityType VINDICATOR        = TYPE.getEntityTypeFromString("vindicator");
    public static final PacketEntityType WITCH             = TYPE.getEntityTypeFromString("witch");

    public static final PacketEntityType PLAYER            = TYPE.getEntityTypeFromString("player");

    public static final PacketEntityType HOGLIN            = TYPE.getEntityTypeFromString("hoglin");
    public static final PacketEntityType LLAMA             = TYPE.getEntityTypeFromString("llama");
    public static final PacketEntityType TRADER_LLAMA      = TYPE.getEntityTypeFromString("trader_llama");

    public static final PacketEntityType AXOLOTL           = TYPE.getEntityTypeFromString("axolotl");
    public static final PacketEntityType BEE               = TYPE.getEntityTypeFromString("bee");
    public static final PacketEntityType DOLPHIN           = TYPE.getEntityTypeFromString("dolphin");
    public static final PacketEntityType ALLAY             = TYPE.getEntityTypeFromString("allay");

    public static final PacketEntityType EVOKER_FANGS      = TYPE.getEntityTypeFromString("evoker_fangs");
    public static final PacketEntityType VEX               = TYPE.getEntityTypeFromString("vex");
    public static final PacketEntityType SQUID             = TYPE.getEntityTypeFromString("squid");

    public static final PacketEntityType SPIDER            = TYPE.getEntityTypeFromString("spider");
    public static final PacketEntityType CAVE_SPIDER       = TYPE.getEntityTypeFromString("cave_spider");

    public static final PacketEntityType WITHER_SKULL      = TYPE.getEntityTypeFromString("wither_skull");
    public static final PacketEntityType SHULKER_BULLET    = TYPE.getEntityTypeFromString("shulker_bullet");
    public static final PacketEntityType BLAZE             = TYPE.getEntityTypeFromString("blaze");

    public static final PacketEntityType CAT               = TYPE.getEntityTypeFromString("cat");
    public static final PacketEntityType CREEPER           = TYPE.getEntityTypeFromString("creeper");
    public static final PacketEntityType DONKEY            = TYPE.getEntityTypeFromString("donkey");

    public static final PacketEntityType END_CRYSTAL       = TYPE.getEntityTypeFromString("end_crystal");
    public static final PacketEntityType ENDERMAN          = TYPE.getEntityTypeFromString("enderman");
    public static final PacketEntityType WARDEN            = TYPE.getEntityTypeFromString("warden");

    public static final PacketEntityType FIREBALL          = TYPE.getEntityTypeFromString("fireball");
    public static final PacketEntityType FOX               = TYPE.getEntityTypeFromString("fox");
    public static final PacketEntityType GHAST             = TYPE.getEntityTypeFromString("ghast");
    public static final PacketEntityType GIANT             = TYPE.getEntityTypeFromString("giant");

    public static final PacketEntityType HORSE             = TYPE.getEntityTypeFromString("horse");
    public static final PacketEntityType IRON_GOLEM        = TYPE.getEntityTypeFromString("iron_golem");
    public static final PacketEntityType CREAKING          = TYPE.getEntityTypeFromString("creaking");

    public static final PacketEntityType TROPICAL_FISH     = TYPE.getEntityTypeFromString("tropical_fish");
    public static final PacketEntityType MULE              = TYPE.getEntityTypeFromString("mule");
    public static final PacketEntityType MOOSHROOM         = TYPE.getEntityTypeFromString("mooshroom");
    public static final PacketEntityType OCELOT            = TYPE.getEntityTypeFromString("ocelot");
    public static final PacketEntityType PANDA             = TYPE.getEntityTypeFromString("panda");
    public static final PacketEntityType POLAR_BEAR        = TYPE.getEntityTypeFromString("polar_bear");
    public static final PacketEntityType PUFFERFISH        = TYPE.getEntityTypeFromString("pufferfish");
    public static final PacketEntityType RABBIT            = TYPE.getEntityTypeFromString("rabbit");
    public static final PacketEntityType SALMON            = TYPE.getEntityTypeFromString("salmon");
    public static final PacketEntityType SHEEP             = TYPE.getEntityTypeFromString("sheep");
    public static final PacketEntityType GOAT              = TYPE.getEntityTypeFromString("goat");

    public static final PacketEntityType SMALL_FIREBALL    = TYPE.getEntityTypeFromString("small_fireball");
    public static final PacketEntityType SNOW_GOLEM        = TYPE.getEntityTypeFromString("snow_golem");
    public static final PacketEntityType STRAY             = TYPE.getEntityTypeFromString("stray");

    public static final PacketEntityType TADPOLE           = TYPE.getEntityTypeFromString("tadpole");
    public static final PacketEntityType SNIFFER           = TYPE.getEntityTypeFromString("sniffer");

    public static final PacketEntityType BREEZE            = TYPE.getEntityTypeFromString("breeze");
    public static final PacketEntityType BOGGED            = TYPE.getEntityTypeFromString("bogged");
    public static final PacketEntityType WIND_CHARGE       = TYPE.getEntityTypeFromString("wind_charge");

    public static final PacketEntityType FALLING_BLOCK     = TYPE.getEntityTypeFromString("falling_block");
    public static final PacketEntityType VILLAGER          = TYPE.getEntityTypeFromString("villager");

    public static final PacketEntityType COD              = TYPE.getEntityTypeFromString("cod");
    public static final PacketEntityType ARMADILLO        = TYPE.getEntityTypeFromString("armadillo");
    public static final PacketEntityType WITHER_SKELETON  = TYPE.getEntityTypeFromString("wither_skeleton");
    public static final PacketEntityType COW              = TYPE.getEntityTypeFromString("cow");
    public static final PacketEntityType WITHER           = TYPE.getEntityTypeFromString("wither");
    public static final PacketEntityType PIGLIN           = TYPE.getEntityTypeFromString("piglin");
    public static final PacketEntityType WOLF             = TYPE.getEntityTypeFromString("wolf");

    public static boolean isTypeInstanceOf(PacketEntityType type, PacketEntityType parent) {
        return TYPE.isTypeInstanceOf(type, parent);
    }
}
