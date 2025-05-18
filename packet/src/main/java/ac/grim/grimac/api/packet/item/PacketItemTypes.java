package ac.grim.grimac.api.packet.item;

import ac.grim.grimac.api.packet.MCPacket;
import ac.grim.grimac.api.packet.manager.PacketItemTypeManager;
import org.jetbrains.annotations.ApiStatus;

import java.util.Collection;

public class PacketItemTypes {
    @ApiStatus.Experimental @ApiStatus.Internal
    private static final PacketItemTypeManager TYPE = MCPacket.getAPI().getItemManager().getItemTypeManager();

    public static final PacketItemType AIR = getPacketItemTypeFromString("air");
    public static final PacketItemType LIGHT = getPacketItemTypeFromString("light");
    public static final PacketItemType BUCKET = getPacketItemTypeFromString("bucket");
    public static final PacketItemType FLINT_AND_STEEL = getPacketItemTypeFromString("flint_and_steel");
    public static final PacketItemType FIRE_CHARGE = getPacketItemTypeFromString("fire_charge");
    public static final PacketItemType ELYTRA = getPacketItemTypeFromString("elytra");
    public static final PacketItemType CARROT_ON_A_STICK = getPacketItemTypeFromString("carrot_on_a_stick");
    public static final PacketItemType WARPED_FUNGUS_ON_A_STICK = getPacketItemTypeFromString("warped_fungus_on_a_stick");
    public static final PacketItemType POWDER_SNOW_BUCKET = getPacketItemTypeFromString("powder_snow_bucket");
    public static final PacketItemType LAVA_BUCKET = getPacketItemTypeFromString("lava_bucket");
    public static final PacketItemType AXOLOTL_BUCKET = getPacketItemTypeFromString("axolotl_bucket");
    public static final PacketItemType COD_BUCKET = getPacketItemTypeFromString("cod_bucket");
    public static final PacketItemType PUFFERFISH_BUCKET = getPacketItemTypeFromString("pufferfish_bucket");
    public static final PacketItemType SALMON_BUCKET = getPacketItemTypeFromString("salmon_bucket");
    public static final PacketItemType TROPICAL_FISH_BUCKET = getPacketItemTypeFromString("tropical_fish_bucket");
    public static final PacketItemType WATER_BUCKET = getPacketItemTypeFromString("water_bucket");
    public static final PacketItemType TADPOLE_BUCKET = getPacketItemTypeFromString("tadpole_bucket");
    public static final PacketItemType POTION = getPacketItemTypeFromString("potion");
    public static final PacketItemType MILK_BUCKET = getPacketItemTypeFromString("milk_bucket");
    public static final PacketItemType CROSSBOW = getPacketItemTypeFromString("crossbow");
    public static final PacketItemType BOW = getPacketItemTypeFromString("bow");
    public static final PacketItemType TRIDENT = getPacketItemTypeFromString("trident");
    public static final PacketItemType SHIELD = getPacketItemTypeFromString("shield");
    public static final PacketItemType JUNGLE_LEAVES = getPacketItemTypeFromString("jungle_leaves");
    public static final PacketItemType OAK_LEAVES = getPacketItemTypeFromString("oak_leaves");
    public static final PacketItemType SPRUCE_LEAVES = getPacketItemTypeFromString("spruce_leaves");
    public static final PacketItemType DARK_OAK_LEAVES = getPacketItemTypeFromString("dark_oak_leaves");
    public static final PacketItemType ACACIA_LEAVES = getPacketItemTypeFromString("acacia_leaves");
    public static final PacketItemType BIRCH_LEAVES = getPacketItemTypeFromString("birch_leaves");
    public static final PacketItemType AZALEA_LEAVES = getPacketItemTypeFromString("azalea_leaves");
    public static final PacketItemType OAK_SAPLING = getPacketItemTypeFromString("oak_sapling");
    public static final PacketItemType SPRUCE_SAPLING = getPacketItemTypeFromString("spruce_sapling");
    public static final PacketItemType BIRCH_SAPLING = getPacketItemTypeFromString("birch_sapling");
    public static final PacketItemType JUNGLE_SAPLING = getPacketItemTypeFromString("jungle_sapling");
    public static final PacketItemType ACACIA_SAPLING = getPacketItemTypeFromString("acacia_sapling");
    public static final PacketItemType DARK_OAK_SAPLING = getPacketItemTypeFromString("dark_oak_sapling");
    public static final PacketItemType BEETROOT_SEEDS = getPacketItemTypeFromString("beetroot_seeds");
    public static final PacketItemType DRIED_KELP = getPacketItemTypeFromString("dried_kelp");
    public static final PacketItemType SHORT_GRASS = getPacketItemTypeFromString("short_grass");
    public static final PacketItemType KELP = getPacketItemTypeFromString("kelp");
    public static final PacketItemType MELON_SEEDS = getPacketItemTypeFromString("melon_seeds");
    public static final PacketItemType PUMPKIN_SEEDS = getPacketItemTypeFromString("pumpkin_seeds");
    public static final PacketItemType SEAGRASS = getPacketItemTypeFromString("seagrass");
    public static final PacketItemType SWEET_BERRIES = getPacketItemTypeFromString("sweet_berries");
    public static final PacketItemType GLOW_BERRIES = getPacketItemTypeFromString("glow_berries");
    public static final PacketItemType WHEAT_SEEDS = getPacketItemTypeFromString("wheat_seeds");
    public static final PacketItemType MOSS_CARPET = getPacketItemTypeFromString("moss_carpet");
    public static final PacketItemType SMALL_DRIPLEAF = getPacketItemTypeFromString("small_dripleaf");
    public static final PacketItemType HANGING_ROOTS = getPacketItemTypeFromString("hanging_roots");
    public static final PacketItemType DRIED_KELP_BLOCK = getPacketItemTypeFromString("dried_kelp_block");
    public static final PacketItemType TALL_GRASS = getPacketItemTypeFromString("tall_grass");
    public static final PacketItemType AZALEA = getPacketItemTypeFromString("azalea");
    public static final PacketItemType CACTUS = getPacketItemTypeFromString("cactus");
    public static final PacketItemType SUGAR_CANE = getPacketItemTypeFromString("sugar_cane");
    public static final PacketItemType VINE = getPacketItemTypeFromString("vine");
    public static final PacketItemType NETHER_SPROUTS = getPacketItemTypeFromString("nether_sprouts");
    public static final PacketItemType WEEPING_VINES = getPacketItemTypeFromString("weeping_vines");
    public static final PacketItemType TWISTING_VINES = getPacketItemTypeFromString("twisting_vines");
    public static final PacketItemType MELON_SLICE = getPacketItemTypeFromString("melon_slice");
    public static final PacketItemType GLOW_LICHEN = getPacketItemTypeFromString("glow_lichen");
    public static final PacketItemType SEA_PICKLE = getPacketItemTypeFromString("sea_pickle");
    public static final PacketItemType LILY_PAD = getPacketItemTypeFromString("lily_pad");
    public static final PacketItemType PUMPKIN = getPacketItemTypeFromString("pumpkin");
    public static final PacketItemType CARVED_PUMPKIN = getPacketItemTypeFromString("carved_pumpkin");
    public static final PacketItemType MELON = getPacketItemTypeFromString("melon");
    public static final PacketItemType APPLE = getPacketItemTypeFromString("apple");
    public static final PacketItemType BEETROOT = getPacketItemTypeFromString("beetroot");
    public static final PacketItemType CARROT = getPacketItemTypeFromString("carrot");
    public static final PacketItemType COCOA_BEANS = getPacketItemTypeFromString("cocoa_beans");
    public static final PacketItemType POTATO = getPacketItemTypeFromString("potato");
    public static final PacketItemType WHEAT = getPacketItemTypeFromString("wheat");
    public static final PacketItemType BROWN_MUSHROOM = getPacketItemTypeFromString("brown_mushroom");
    public static final PacketItemType RED_MUSHROOM = getPacketItemTypeFromString("red_mushroom");
    public static final PacketItemType MUSHROOM_STEM = getPacketItemTypeFromString("mushroom_stem");
    public static final PacketItemType CRIMSON_FUNGUS = getPacketItemTypeFromString("crimson_fungus");
    public static final PacketItemType WARPED_FUNGUS = getPacketItemTypeFromString("warped_fungus");
    public static final PacketItemType NETHER_WART = getPacketItemTypeFromString("nether_wart");
    public static final PacketItemType CRIMSON_ROOTS = getPacketItemTypeFromString("crimson_roots");
    public static final PacketItemType WARPED_ROOTS = getPacketItemTypeFromString("warped_roots");
    public static final PacketItemType SHROOMLIGHT = getPacketItemTypeFromString("shroomlight");
    public static final PacketItemType DANDELION = getPacketItemTypeFromString("dandelion");
    public static final PacketItemType POPPY = getPacketItemTypeFromString("poppy");
    public static final PacketItemType BLUE_ORCHID = getPacketItemTypeFromString("blue_orchid");
    public static final PacketItemType ALLIUM = getPacketItemTypeFromString("allium");
    public static final PacketItemType AZURE_BLUET = getPacketItemTypeFromString("azure_bluet");
    public static final PacketItemType RED_TULIP = getPacketItemTypeFromString("red_tulip");
    public static final PacketItemType ORANGE_TULIP = getPacketItemTypeFromString("orange_tulip");
    public static final PacketItemType WHITE_TULIP = getPacketItemTypeFromString("white_tulip");
    public static final PacketItemType PINK_TULIP = getPacketItemTypeFromString("pink_tulip");
    public static final PacketItemType OXEYE_DAISY = getPacketItemTypeFromString("oxeye_daisy");
    public static final PacketItemType CORNFLOWER = getPacketItemTypeFromString("cornflower");
    public static final PacketItemType LILY_OF_THE_VALLEY = getPacketItemTypeFromString("lily_of_the_valley");
    public static final PacketItemType WITHER_ROSE = getPacketItemTypeFromString("wither_rose");
    public static final PacketItemType FERN = getPacketItemTypeFromString("fern");
    public static final PacketItemType SUNFLOWER = getPacketItemTypeFromString("sunflower");
    public static final PacketItemType LILAC = getPacketItemTypeFromString("lilac");
    public static final PacketItemType ROSE_BUSH = getPacketItemTypeFromString("rose_bush");
    public static final PacketItemType PEONY = getPacketItemTypeFromString("peony");
    public static final PacketItemType LARGE_FERN = getPacketItemTypeFromString("large_fern");
    public static final PacketItemType SPORE_BLOSSOM = getPacketItemTypeFromString("spore_blossom");
    public static final PacketItemType MOSS_BLOCK = getPacketItemTypeFromString("moss_block");
    public static final PacketItemType BIG_DRIPLEAF = getPacketItemTypeFromString("big_dripleaf");
    public static final PacketItemType HAY_BLOCK = getPacketItemTypeFromString("hay_block");
    public static final PacketItemType BROWN_MUSHROOM_BLOCK = getPacketItemTypeFromString("brown_mushroom_block");
    public static final PacketItemType RED_MUSHROOM_BLOCK = getPacketItemTypeFromString("red_mushroom_block");
    public static final PacketItemType NETHER_WART_BLOCK = getPacketItemTypeFromString("nether_wart_block");
    public static final PacketItemType WARPED_WART_BLOCK = getPacketItemTypeFromString("warped_wart_block");
    public static final PacketItemType FLOWERING_AZALEA = getPacketItemTypeFromString("flowering_azalea");
    public static final PacketItemType BREAD = getPacketItemTypeFromString("bread");
    public static final PacketItemType BAKED_POTATO = getPacketItemTypeFromString("baked_potato");
    public static final PacketItemType COOKIE = getPacketItemTypeFromString("cookie");
    public static final PacketItemType CAKE = getPacketItemTypeFromString("cake");
    public static final PacketItemType PUMPKIN_PIE = getPacketItemTypeFromString("pumpkin_pie");
    public static final PacketItemType END_ROD = getPacketItemTypeFromString("end_rod");
    public static final PacketItemType LADDER = getPacketItemTypeFromString("ladder");
    public static final PacketItemType FARMLAND = getPacketItemTypeFromString("farmland");
    public static final PacketItemType SMALL_AMETHYST_BUD = getPacketItemTypeFromString("small_amethyst_bud");
    public static final PacketItemType MEDIUM_AMETHYST_BUD = getPacketItemTypeFromString("medium_amethyst_bud");
    public static final PacketItemType LARGE_AMETHYST_BUD = getPacketItemTypeFromString("large_amethyst_bud");
    public static final PacketItemType AMETHYST_CLUSTER = getPacketItemTypeFromString("amethyst_cluster");
    public static final PacketItemType BAMBOO = getPacketItemTypeFromString("bamboo");
    public static final PacketItemType BELL = getPacketItemTypeFromString("bell");
    public static final PacketItemType CHAIN = getPacketItemTypeFromString("chain");
    public static final PacketItemType DIRT_PATH = getPacketItemTypeFromString("dirt_path");
    public static final PacketItemType HOPPER = getPacketItemTypeFromString("hopper");
    public static final PacketItemType LANTERN = getPacketItemTypeFromString("lantern");
    public static final PacketItemType SOUL_LANTERN = getPacketItemTypeFromString("soul_lantern");
    public static final PacketItemType POINTED_DRIPSTONE = getPacketItemTypeFromString("pointed_dripstone");
    public static final PacketItemType MANGROVE_PROPAGULE = getPacketItemTypeFromString("mangrove_propagule");
    public static final PacketItemType FROGSPAWN = getPacketItemTypeFromString("frogspawn");
    public static final PacketItemType COMMAND_BLOCK = getPacketItemTypeFromString("command_block");
    public static final PacketItemType CHAIN_COMMAND_BLOCK = getPacketItemTypeFromString("chain_command_block");
    public static final PacketItemType REPEATING_COMMAND_BLOCK = getPacketItemTypeFromString("repeating_command_block");
    public static final PacketItemType JIGSAW = getPacketItemTypeFromString("jigsaw");
    public static final PacketItemType STRUCTURE_BLOCK = getPacketItemTypeFromString("structure_block");
    public static final PacketItemType GRINDSTONE = getPacketItemTypeFromString("grindstone");
    public static final PacketItemType LECTERN = getPacketItemTypeFromString("lectern");
    public static final PacketItemType SCAFFOLDING = getPacketItemTypeFromString("scaffolding");
    public static final PacketItemType PALE_MOSS_CARPET = getPacketItemTypeFromString("pale_moss_carpet");
    public static final PacketItemType PINK_PETALS = getPacketItemTypeFromString("pink_petals");
    public static final PacketItemType TRIPWIRE_HOOK = getPacketItemTypeFromString("tripwire_hook");
    public static final PacketItemType PISTON = getPacketItemTypeFromString("piston");
    public static final PacketItemType STICKY_PISTON = getPacketItemTypeFromString("sticky_piston");
    public static final PacketItemType REDSTONE = getPacketItemTypeFromString("redstone");
    public static final PacketItemType REPEATER = getPacketItemTypeFromString("repeater");
    public static final PacketItemType COMPARATOR = getPacketItemTypeFromString("comparator");
    public static final PacketItemType SCULK_VEIN = getPacketItemTypeFromString("sculk_vein");
    // HELMETS
    public static final PacketItemType LEATHER_HELMET = getPacketItemTypeFromString("leather_helmet");
    public static final PacketItemType CHAINMAIL_HELMET = getPacketItemTypeFromString("chainmail_helmet");
    public static final PacketItemType IRON_HELMET = getPacketItemTypeFromString("iron_helmet");
    public static final PacketItemType DIAMOND_HELMET = getPacketItemTypeFromString("diamond_helmet");
    public static final PacketItemType GOLDEN_HELMET = getPacketItemTypeFromString("golden_helmet");
    public static final PacketItemType NETHERITE_HELMET = getPacketItemTypeFromString("netherite_helmet");

    // CHESTPLATES
    public static final PacketItemType LEATHER_CHESTPLATE = getPacketItemTypeFromString("leather_chestplate");
    public static final PacketItemType CHAINMAIL_CHESTPLATE = getPacketItemTypeFromString("chainmail_chestplate");
    public static final PacketItemType IRON_CHESTPLATE = getPacketItemTypeFromString("iron_chestplate");
    public static final PacketItemType DIAMOND_CHESTPLATE = getPacketItemTypeFromString("diamond_chestplate");
    public static final PacketItemType GOLDEN_CHESTPLATE = getPacketItemTypeFromString("golden_chestplate");
    public static final PacketItemType NETHERITE_CHESTPLATE = getPacketItemTypeFromString("netherite_chestplate");

    // LEGGINGS
    public static final PacketItemType LEATHER_LEGGINGS = getPacketItemTypeFromString("leather_leggings");
    public static final PacketItemType CHAINMAIL_LEGGINGS = getPacketItemTypeFromString("chainmail_leggings");
    public static final PacketItemType IRON_LEGGINGS = getPacketItemTypeFromString("iron_leggings");
    public static final PacketItemType DIAMOND_LEGGINGS = getPacketItemTypeFromString("diamond_leggings");
    public static final PacketItemType GOLDEN_LEGGINGS = getPacketItemTypeFromString("golden_leggings");
    public static final PacketItemType NETHERITE_LEGGINGS = getPacketItemTypeFromString("netherite_leggings");

    // BOOTS
    public static final PacketItemType LEATHER_BOOTS = getPacketItemTypeFromString("leather_boots");
    public static final PacketItemType CHAINMAIL_BOOTS = getPacketItemTypeFromString("chainmail_boots");
    public static final PacketItemType IRON_BOOTS = getPacketItemTypeFromString("iron_boots");
    public static final PacketItemType DIAMOND_BOOTS = getPacketItemTypeFromString("diamond_boots");
    public static final PacketItemType GOLDEN_BOOTS = getPacketItemTypeFromString("golden_boots");
    public static final PacketItemType NETHERITE_BOOTS = getPacketItemTypeFromString("netherite_boots");

    public static final PacketItemType SPLASH_POTION = getPacketItemTypeFromString("splash_potion");
    public static final PacketItemType GOLDEN_APPLE = getPacketItemTypeFromString("golden_apple");
    public static final PacketItemType ENCHANTED_GOLDEN_APPLE = getPacketItemTypeFromString("enchanted_golden_apple");
    public static final PacketItemType HONEY_BOTTLE = getPacketItemTypeFromString("honey_bottle");
    public static final PacketItemType SUSPICIOUS_STEW = getPacketItemTypeFromString("suspicious_stew");
    public static final PacketItemType CHORUS_FRUIT = getPacketItemTypeFromString("chorus_fruit");
    public static final PacketItemType SPYGLASS = getPacketItemTypeFromString("spyglass");
    public static final PacketItemType GOAT_HORN = getPacketItemTypeFromString("goat_horn");
    public static final PacketItemType BONE_MEAL = getPacketItemTypeFromString("bone_meal");
    public static final PacketItemType GLOWSTONE = getPacketItemTypeFromString("glowstone");
    public static final PacketItemType DEBUG_STICK = getPacketItemTypeFromString("debug_stick");
    public static final PacketItemType MACE = getPacketItemTypeFromString("mace");
    public static final PacketItemType SHEARS = getPacketItemTypeFromString("shears");
    public static final PacketItemType DEAD_BUSH = getPacketItemTypeFromString("dead_bush");
    public static final PacketItemType CHORUS_PLANT = getPacketItemTypeFromString("chorus_plant");
    public static final PacketItemType CHORUS_FLOWER = getPacketItemTypeFromString("chorus_flower");
    public static final PacketItemType TORCHFLOWER_SEEDS = getPacketItemTypeFromString("torchflower_seeds");
    public static final PacketItemType LIGHTNING_ROD = getPacketItemTypeFromString("lightning_rod");
    public static final PacketItemType SNOW = getPacketItemTypeFromString("snow");

    @ApiStatus.Experimental @ApiStatus.Internal
    static PacketItemType getPacketItemTypeFromString(String string) {
        return TYPE.getItemTypeByString(string);
    }

    public static Collection<PacketItemType> values() {
        return TYPE.values();
    }
}
