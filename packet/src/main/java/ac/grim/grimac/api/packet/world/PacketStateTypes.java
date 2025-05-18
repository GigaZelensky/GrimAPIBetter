package ac.grim.grimac.api.packet.world;

import ac.grim.grimac.api.packet.MCPacket;
import ac.grim.grimac.api.packet.item.PacketStateType;
import ac.grim.grimac.api.packet.manager.PacketStateTypeManager;
import ac.grim.grimac.api.packet.protocol.PacketClientVersion;

public class PacketStateTypes {
    private static final PacketStateTypeManager TYPE = MCPacket.getAPI().getStateTypeManager();

    public static final PacketStateType SLIME_BLOCK     = TYPE.getStateTypeByString("slime_block");
    public static final PacketStateType HONEY_BLOCK     = TYPE.getStateTypeByString("honey_block");
    public static final PacketStateType BUBBLE_COLUMN   = TYPE.getStateTypeByString("bubble_column");
    public static final PacketStateType SCAFFOLDING     = TYPE.getStateTypeByString("scaffolding");
    public static final PacketStateType CHEST           = TYPE.getStateTypeByString("chest");
    public static final PacketStateType TRAPPED_CHEST   = TYPE.getStateTypeByString("trapped_chest");

    // Additional PacketStateType fields (from CollisionData, ConsumesBlockPlace, etc.)
    public static final PacketStateType ACTIVATOR_RAIL                = TYPE.getStateTypeByString("activator_rail");
    public static final PacketStateType AIR                           = TYPE.getStateTypeByString("air");
    public static final PacketStateType AMETHYST_CLUSTER              = TYPE.getStateTypeByString("amethyst_cluster");
    public static final PacketStateType ATTACHED_MELON_STEM           = TYPE.getStateTypeByString("attached_melon_stem");
    public static final PacketStateType ATTACHED_PUMPKIN_STEM         = TYPE.getStateTypeByString("attached_pumpkin_stem");
    public static final PacketStateType AZALEA                        = TYPE.getStateTypeByString("azalea");
    public static final PacketStateType BAMBOO                        = TYPE.getStateTypeByString("bamboo");
    public static final PacketStateType BAMBOO_SAPLING                = TYPE.getStateTypeByString("bamboo_sapling");
    public static final PacketStateType BEETROOTS                     = TYPE.getStateTypeByString("beetroots");
    public static final PacketStateType BELL                          = TYPE.getStateTypeByString("bell");
    public static final PacketStateType BIG_DRIPLEAF                  = TYPE.getStateTypeByString("big_dripleaf");
    public static final PacketStateType BREWING_STAND                 = TYPE.getStateTypeByString("brewing_stand");
    public static final PacketStateType CACTUS                        = TYPE.getStateTypeByString("cactus");
    public static final PacketStateType CAKE                          = TYPE.getStateTypeByString("cake");
    public static final PacketStateType CALIBRATED_SCULK_SENSOR       = TYPE.getStateTypeByString("calibrated_sculk_sensor");
    public static final PacketStateType CAMPFIRE                      = TYPE.getStateTypeByString("campfire");
    public static final PacketStateType CANDLE_CAKE                   = TYPE.getStateTypeByString("candle_cake");
    public static final PacketStateType CARROTS                       = TYPE.getStateTypeByString("carrots");
    public static final PacketStateType CAVE_AIR                      = TYPE.getStateTypeByString("cave_air");
    public static final PacketStateType CAVE_VINES                    = TYPE.getStateTypeByString("cave_vines");
    public static final PacketStateType CAVE_VINES_PLANT              = TYPE.getStateTypeByString("cave_vines_plant");
    public static final PacketStateType CHAIN                         = TYPE.getStateTypeByString("chain");
    public static final PacketStateType CHAIN_COMMAND_BLOCK           = TYPE.getStateTypeByString("chain_command_block");
    public static final PacketStateType CHORUS_PLANT                  = TYPE.getStateTypeByString("chorus_plant");
    public static final PacketStateType COCOA                         = TYPE.getStateTypeByString("cocoa");
    public static final PacketStateType COMMAND_BLOCK                 = TYPE.getStateTypeByString("command_block");
    public static final PacketStateType COMPARATOR                    = TYPE.getStateTypeByString("comparator");
    public static final PacketStateType COMPOSTER                     = TYPE.getStateTypeByString("composter");
    public static final PacketStateType CONDUIT                       = TYPE.getStateTypeByString("conduit");
    public static final PacketStateType CREEPER_HEAD                  = TYPE.getStateTypeByString("creeper_head");
    public static final PacketStateType CREEPER_WALL_HEAD             = TYPE.getStateTypeByString("creeper_wall_head");
    public static final PacketStateType CRIMSON_ROOTS                 = TYPE.getStateTypeByString("crimson_roots");
    public static final PacketStateType DAYLIGHT_DETECTOR             = TYPE.getStateTypeByString("daylight_detector");
    public static final PacketStateType DEAD_BRAIN_CORAL              = TYPE.getStateTypeByString("dead_brain_coral");
    public static final PacketStateType DEAD_BUBBLE_CORAL             = TYPE.getStateTypeByString("dead_bubble_coral");
    public static final PacketStateType DEAD_BUSH                     = TYPE.getStateTypeByString("dead_bush");
    public static final PacketStateType DEAD_FIRE_CORAL               = TYPE.getStateTypeByString("dead_fire_coral");
    public static final PacketStateType DEAD_HORN_CORAL               = TYPE.getStateTypeByString("dead_horn_coral");
    public static final PacketStateType DEAD_TUBE_CORAL               = TYPE.getStateTypeByString("dead_tube_coral");
    public static final PacketStateType DECORATED_POT                 = TYPE.getStateTypeByString("decorated_pot");
    public static final PacketStateType DETECTOR_RAIL                 = TYPE.getStateTypeByString("detector_rail");
    public static final PacketStateType DIRT_PATH                     = TYPE.getStateTypeByString("dirt_path");
    public static final PacketStateType DRAGON_EGG                    = TYPE.getStateTypeByString("dragon_egg");
    public static final PacketStateType DRAGON_HEAD                   = TYPE.getStateTypeByString("dragon_head");
    public static final PacketStateType DRAGON_WALL_HEAD              = TYPE.getStateTypeByString("dragon_wall_head");
    public static final PacketStateType ENCHANTING_TABLE              = TYPE.getStateTypeByString("enchanting_table");
    public static final PacketStateType ENDER_CHEST                   = TYPE.getStateTypeByString("ender_chest");
    public static final PacketStateType END_PORTAL                    = TYPE.getStateTypeByString("end_portal");
    public static final PacketStateType END_PORTAL_FRAME              = TYPE.getStateTypeByString("end_portal_frame");
    public static final PacketStateType END_ROD                       = TYPE.getStateTypeByString("end_rod");
    public static final PacketStateType FARMLAND                      = TYPE.getStateTypeByString("farmland");
    public static final PacketStateType FERN                          = TYPE.getStateTypeByString("fern");
    public static final PacketStateType FIRE                          = TYPE.getStateTypeByString("fire");
    public static final PacketStateType FLOWERING_AZALEA              = TYPE.getStateTypeByString("flowering_azalea");
    public static final PacketStateType GRINDSTONE                    = TYPE.getStateTypeByString("grindstone");
    public static final PacketStateType HANGING_ROOTS                 = TYPE.getStateTypeByString("hanging_roots");
    public static final PacketStateType HEAVY_CORE                    = TYPE.getStateTypeByString("heavy_core");
    public static final PacketStateType HEAVY_WEIGHTED_PRESSURE_PLATE = TYPE.getStateTypeByString("heavy_weighted_pressure_plate");
    public static final PacketStateType HOPPER                        = TYPE.getStateTypeByString("hopper");
    public static final PacketStateType JIGSAW                        = TYPE.getStateTypeByString("jigsaw");
    public static final PacketStateType JUKEBOX                       = TYPE.getStateTypeByString("jukebox");
    public static final PacketStateType KELP                          = TYPE.getStateTypeByString("kelp");
    public static final PacketStateType LADDER                        = TYPE.getStateTypeByString("ladder");
    public static final PacketStateType LANTERN                       = TYPE.getStateTypeByString("lantern");
    public static final PacketStateType LARGE_AMETHYST_BUD            = TYPE.getStateTypeByString("large_amethyst_bud");
    public static final PacketStateType LARGE_FERN                    = TYPE.getStateTypeByString("large_fern");
    public static final PacketStateType LAVA                          = TYPE.getStateTypeByString("lava");
    public static final PacketStateType LECTERN                       = TYPE.getStateTypeByString("lectern");
    public static final PacketStateType LEVER                         = TYPE.getStateTypeByString("lever");
    public static final PacketStateType LIGHT                         = TYPE.getStateTypeByString("light");
    public static final PacketStateType LIGHTNING_ROD                 = TYPE.getStateTypeByString("lightning_rod");
    public static final PacketStateType LIGHT_WEIGHTED_PRESSURE_PLATE = TYPE.getStateTypeByString("light_weighted_pressure_plate");
    public static final PacketStateType LILY_PAD                      = TYPE.getStateTypeByString("lily_pad");
    public static final PacketStateType MANGROVE_PROPAGULE            = TYPE.getStateTypeByString("mangrove_propagule");
    public static final PacketStateType MEDIUM_AMETHYST_BUD           = TYPE.getStateTypeByString("medium_amethyst_bud");
    public static final PacketStateType MELON_STEM                    = TYPE.getStateTypeByString("melon_stem");
    public static final PacketStateType MOSS_CARPET                   = TYPE.getStateTypeByString("moss_carpet");
    public static final PacketStateType MOVING_PISTON                 = TYPE.getStateTypeByString("moving_piston");
    public static final PacketStateType MUD                           = TYPE.getStateTypeByString("mud");
    public static final PacketStateType NETHER_PORTAL                 = TYPE.getStateTypeByString("nether_portal");
    public static final PacketStateType NETHER_SPROUTS                = TYPE.getStateTypeByString("nether_sprouts");
    public static final PacketStateType NETHER_WART                   = TYPE.getStateTypeByString("nether_wart");
    public static final PacketStateType PALE_MOSS_CARPET              = TYPE.getStateTypeByString("pale_moss_carpet");
    public static final PacketStateType PIGLIN_HEAD                   = TYPE.getStateTypeByString("piglin_head");
    public static final PacketStateType PIGLIN_WALL_HEAD              = TYPE.getStateTypeByString("piglin_wall_head");
    public static final PacketStateType PINK_PETALS                   = TYPE.getStateTypeByString("pink_petals");
    public static final PacketStateType PISTON                        = TYPE.getStateTypeByString("piston");
    public static final PacketStateType PISTON_HEAD                   = TYPE.getStateTypeByString("piston_head");
    public static final PacketStateType PITCHER_CROP                  = TYPE.getStateTypeByString("pitcher_crop");
    public static final PacketStateType PLAYER_HEAD                   = TYPE.getStateTypeByString("player_head");
    public static final PacketStateType PLAYER_WALL_HEAD              = TYPE.getStateTypeByString("player_wall_head");
    public static final PacketStateType POINTED_DRIPSTONE             = TYPE.getStateTypeByString("pointed_dripstone");
    public static final PacketStateType POTATOES                      = TYPE.getStateTypeByString("potatoes");
    public static final PacketStateType POWDER_SNOW                   = TYPE.getStateTypeByString("powder_snow");
    public static final PacketStateType POWERED_RAIL                  = TYPE.getStateTypeByString("powered_rail");
    public static final PacketStateType PUMPKIN_STEM                  = TYPE.getStateTypeByString("pumpkin_stem");
    public static final PacketStateType RAIL                          = TYPE.getStateTypeByString("rail");
    public static final PacketStateType REDSTONE_TORCH                = TYPE.getStateTypeByString("redstone_torch");
    public static final PacketStateType REDSTONE_WALL_TORCH           = TYPE.getStateTypeByString("redstone_wall_torch");
    public static final PacketStateType REPEATER                      = TYPE.getStateTypeByString("repeater");
    public static final PacketStateType REPEATING_COMMAND_BLOCK       = TYPE.getStateTypeByString("repeating_command_block");
    public static final PacketStateType RESPAWN_ANCHOR                = TYPE.getStateTypeByString("respawn_anchor");
    public static final PacketStateType SCULK_SENSOR                  = TYPE.getStateTypeByString("sculk_sensor");
    public static final PacketStateType SCULK_SHRIEKER                = TYPE.getStateTypeByString("sculk_shrieker");
    public static final PacketStateType SEAGRASS                      = TYPE.getStateTypeByString("seagrass");
    public static final PacketStateType SEA_PICKLE                    = TYPE.getStateTypeByString("sea_pickle");
    public static final PacketStateType SHORT_GRASS                   = TYPE.getStateTypeByString("short_grass");
    public static final PacketStateType SKELETON_SKULL                = TYPE.getStateTypeByString("skeleton_skull");
    public static final PacketStateType SKELETON_WALL_SKULL           = TYPE.getStateTypeByString("skeleton_wall_skull");
    public static final PacketStateType SMALL_AMETHYST_BUD            = TYPE.getStateTypeByString("small_amethyst_bud");
    public static final PacketStateType SMALL_DRIPLEAF                = TYPE.getStateTypeByString("small_dripleaf");
    public static final PacketStateType SNIFFER_EGG                   = TYPE.getStateTypeByString("sniffer_egg");
    public static final PacketStateType SNOW                          = TYPE.getStateTypeByString("snow");
    public static final PacketStateType SOUL_CAMPFIRE                 = TYPE.getStateTypeByString("soul_campfire");
    public static final PacketStateType SOUL_LANTERN                  = TYPE.getStateTypeByString("soul_lantern");
    public static final PacketStateType SOUL_SAND                     = TYPE.getStateTypeByString("soul_sand");
    public static final PacketStateType STICKY_PISTON                 = TYPE.getStateTypeByString("sticky_piston");
    public static final PacketStateType STONE                         = TYPE.getStateTypeByString("stone");
    public static final PacketStateType STONECUTTER                   = TYPE.getStateTypeByString("stonecutter");
    public static final PacketStateType STRUCTURE_BLOCK               = TYPE.getStateTypeByString("structure_block");
    public static final PacketStateType STRUCTURE_VOID                = TYPE.getStateTypeByString("structure_void");
    public static final PacketStateType SUGAR_CANE                    = TYPE.getStateTypeByString("sugar_cane");
    public static final PacketStateType SWEET_BERRY_BUSH              = TYPE.getStateTypeByString("sweet_berry_bush");
    public static final PacketStateType TALL_GRASS                    = TYPE.getStateTypeByString("tall_grass");
    public static final PacketStateType TALL_SEAGRASS                 = TYPE.getStateTypeByString("tall_seagrass");
    public static final PacketStateType TNT                           = TYPE.getStateTypeByString("tnt");
    public static final PacketStateType TORCH                         = TYPE.getStateTypeByString("torch");
    public static final PacketStateType TORCHFLOWER_CROP              = TYPE.getStateTypeByString("torchflower_crop");
    public static final PacketStateType TRIPWIRE                      = TYPE.getStateTypeByString("tripwire");
    public static final PacketStateType TRIPWIRE_HOOK                 = TYPE.getStateTypeByString("tripwire_hook");
    public static final PacketStateType TURTLE_EGG                    = TYPE.getStateTypeByString("turtle_egg");
    public static final PacketStateType TWISTING_VINES                = TYPE.getStateTypeByString("twisting_vines");
    public static final PacketStateType TWISTING_VINES_PLANT          = TYPE.getStateTypeByString("twisting_vines_plant");
    public static final PacketStateType VINE                          = TYPE.getStateTypeByString("vine");
    public static final PacketStateType VOID_AIR                      = TYPE.getStateTypeByString("void_air");
    public static final PacketStateType WALL_TORCH                    = TYPE.getStateTypeByString("wall_torch");
    public static final PacketStateType WARPED_ROOTS                  = TYPE.getStateTypeByString("warped_roots");
    public static final PacketStateType WATER                         = TYPE.getStateTypeByString("water");
    public static final PacketStateType WEEPING_VINES                 = TYPE.getStateTypeByString("weeping_vines");
    public static final PacketStateType WEEPING_VINES_PLANT           = TYPE.getStateTypeByString("weeping_vines_plant");
    public static final PacketStateType WHEAT                         = TYPE.getStateTypeByString("wheat");
    public static final PacketStateType WITHER_SKELETON_SKULL         = TYPE.getStateTypeByString("wither_skeleton_skull");
    public static final PacketStateType WITHER_SKELETON_WALL_SKULL    = TYPE.getStateTypeByString("wither_skeleton_wall_skull");
    public static final PacketStateType ZOMBIE_HEAD                   = TYPE.getStateTypeByString("zombie_head");
    public static final PacketStateType ZOMBIE_WALL_HEAD              = TYPE.getStateTypeByString("zombie_wall_head");

    public static final PacketStateType KELP_PLANT = TYPE.getStateTypeByString("kelp_plant");

    // Copper door variants.
    public static final PacketStateType COPPER_DOOR                  = TYPE.getStateTypeByString("copper_door");
    public static final PacketStateType EXPOSED_COPPER_DOOR          = TYPE.getStateTypeByString("exposed_copper_door");
    public static final PacketStateType WEATHERED_COPPER_DOOR        = TYPE.getStateTypeByString("weathered_copper_door");
    public static final PacketStateType OXIDIZED_COPPER_DOOR         = TYPE.getStateTypeByString("oxidized_copper_door");
    public static final PacketStateType WAXED_COPPER_DOOR            = TYPE.getStateTypeByString("waxed_copper_door");
    public static final PacketStateType WAXED_EXPOSED_COPPER_DOOR    = TYPE.getStateTypeByString("waxed_exposed_copper_door");
    public static final PacketStateType WAXED_WEATHERED_COPPER_DOOR  = TYPE.getStateTypeByString("waxed_weathered_copper_door");
    public static final PacketStateType WAXED_OXIDIZED_COPPER_DOOR   = TYPE.getStateTypeByString("waxed_oxidized_copper_door");

    // Trapdoor types
    public static final PacketStateType IRON_TRAPDOOR                = TYPE.getStateTypeByString("iron_trapdoor");
    public static final PacketStateType COPPER_TRAPDOOR              = TYPE.getStateTypeByString("copper_trapdoor");
    public static final PacketStateType EXPOSED_COPPER_TRAPDOOR      = TYPE.getStateTypeByString("exposed_copper_trapdoor");
    public static final PacketStateType WEATHERED_COPPER_TRAPDOOR    = TYPE.getStateTypeByString("weathered_copper_trapdoor");
    public static final PacketStateType OXIDIZED_COPPER_TRAPDOOR     = TYPE.getStateTypeByString("oxidized_copper_trapdoor");
    public static final PacketStateType WAXED_COPPER_TRAPDOOR        = TYPE.getStateTypeByString("waxed_copper_trapdoor");
    public static final PacketStateType WAXED_EXPOSED_COPPER_TRAPDOOR= TYPE.getStateTypeByString("waxed_exposed_copper_trapdoor");
    public static final PacketStateType WAXED_WEATHERED_COPPER_TRAPDOOR = TYPE.getStateTypeByString("waxed_weathered_copper_trapdoor");
    public static final PacketStateType WAXED_OXIDIZED_COPPER_TRAPDOOR  = TYPE.getStateTypeByString("waxed_oxidized_copper_trapdoor");

    // Client-side interactable blocks.
    public static final PacketStateType BARREL              = TYPE.getStateTypeByString("barrel");
    public static final PacketStateType BEACON              = TYPE.getStateTypeByString("beacon");
    public static final PacketStateType CARTOGRAPHY_TABLE   = TYPE.getStateTypeByString("cartography_table");
    public static final PacketStateType CRAFTING_TABLE      = TYPE.getStateTypeByString("crafting_table");
    public static final PacketStateType DISPENSER           = TYPE.getStateTypeByString("dispenser");
    public static final PacketStateType LOOM                = TYPE.getStateTypeByString("loom");
    public static final PacketStateType NOTE_BLOCK          = TYPE.getStateTypeByString("note_block");
    public static final PacketStateType SMITHING_TABLE      = TYPE.getStateTypeByString("smithing_table");
    public static final PacketStateType FURNACE             = TYPE.getStateTypeByString("furnace");
    public static final PacketStateType BLAST_FURNACE       = TYPE.getStateTypeByString("blast_furnace");

    public static final PacketStateType COBWEB = TYPE.getStateTypeByString("cobweb");
    public static final PacketStateType GLOW_LICHEN = TYPE.getStateTypeByString("glow_lichen");
    public static final PacketStateType REDSTONE_WIRE = TYPE.getStateTypeByString("redstone_wire");

    public static final PacketStateType IRON_DOOR = TYPE.getStateTypeByString("iron_door");
    public static final PacketStateType ICE = TYPE.getStateTypeByString("ice");
    public static final PacketStateType FROSTED_ICE = TYPE.getStateTypeByString("frosted_ice");

    public static final PacketStateType DIRT = TYPE.getStateTypeByString("dirt");
    public static final PacketStateType GRASS_BLOCK = TYPE.getStateTypeByString("grass_block");
    public static final PacketStateType PODZOL = TYPE.getStateTypeByString("podzol");
    public static final PacketStateType COARSE_DIRT = TYPE.getStateTypeByString("coarse_dirt");
    public static final PacketStateType MYCELIUM = TYPE.getStateTypeByString("mycelium");
    public static final PacketStateType ROOTED_DIRT = TYPE.getStateTypeByString("rooted_dirt");
    public static final PacketStateType MOSS_BLOCK = TYPE.getStateTypeByString("moss_block");
    public static final PacketStateType REDSTONE_BLOCK = TYPE.getStateTypeByString("redstone_block");
    public static final PacketStateType OBSERVER = TYPE.getStateTypeByString("observer");

    public static final PacketStateType GLOWSTONE = TYPE.getStateTypeByString("glowstone");
    public static final PacketStateType SEA_LANTERN = TYPE.getStateTypeByString("sea_lantern");
    public static final PacketStateType BARRIER = TYPE.getStateTypeByString("barrier");
    public static final PacketStateType FIRE_CORAL_WALL_FAN = TYPE.getStateTypeByString("fire_coral_wall_fan");
    public static final PacketStateType MAGMA_BLOCK = TYPE.getStateTypeByString("magma_block");
    public static final PacketStateType CLAY = TYPE.getStateTypeByString("clay");
    public static final PacketStateType SAND = TYPE.getStateTypeByString("sand");
    public static final PacketStateType RED_SAND = TYPE.getStateTypeByString("red_sand");
    public static final PacketStateType CRIMSON_NYLIUM = TYPE.getStateTypeByString("crimson_nylium");
    public static final PacketStateType WARPED_NYLIUM = TYPE.getStateTypeByString("warped_nylium");
    public static final PacketStateType SOUL_SOIL = TYPE.getStateTypeByString("soul_soil");
    public static final PacketStateType NETHERRACK = TYPE.getStateTypeByString("netherrack");
    public static final PacketStateType OAK_WALL_SIGN = TYPE.getStateTypeByString("oak_wall_sign");
    public static final PacketStateType BIG_DRIPLEAF_STEM = TYPE.getStateTypeByString("big_dripleaf_stem");
    public static final PacketStateType JUNGLE_LOG = TYPE.getStateTypeByString("jungle_log");
    public static final PacketStateType STRIPPED_JUNGLE_LOG = TYPE.getStateTypeByString("stripped_jungle_log");
    public static final PacketStateType JUNGLE_WOOD = TYPE.getStateTypeByString("jungle_wood");
    public static final PacketStateType END_STONE = TYPE.getStateTypeByString("end_stone");
    public static final PacketStateType BLACK_WALL_BANNER = TYPE.getStateTypeByString("black_wall_banner");

    // Banner blocks
    public static final PacketStateType WHITE_BANNER = TYPE.getStateTypeByString("white_banner");
    public static final PacketStateType ORANGE_BANNER = TYPE.getStateTypeByString("orange_banner");
    public static final PacketStateType MAGENTA_BANNER = TYPE.getStateTypeByString("magenta_banner");
    public static final PacketStateType LIGHT_BLUE_BANNER = TYPE.getStateTypeByString("light_blue_banner");
    public static final PacketStateType YELLOW_BANNER = TYPE.getStateTypeByString("yellow_banner");
    public static final PacketStateType LIME_BANNER = TYPE.getStateTypeByString("lime_banner");
    public static final PacketStateType PINK_BANNER = TYPE.getStateTypeByString("pink_banner");
    public static final PacketStateType GRAY_BANNER = TYPE.getStateTypeByString("gray_banner");
    public static final PacketStateType LIGHT_GRAY_BANNER = TYPE.getStateTypeByString("light_gray_banner");
    public static final PacketStateType CYAN_BANNER = TYPE.getStateTypeByString("cyan_banner");
    public static final PacketStateType PURPLE_BANNER = TYPE.getStateTypeByString("purple_banner");
    public static final PacketStateType BLUE_BANNER = TYPE.getStateTypeByString("blue_banner");
    public static final PacketStateType BROWN_BANNER = TYPE.getStateTypeByString("brown_banner");
    public static final PacketStateType GREEN_BANNER = TYPE.getStateTypeByString("green_banner");
    public static final PacketStateType RED_BANNER = TYPE.getStateTypeByString("red_banner");
    public static final PacketStateType BLACK_BANNER = TYPE.getStateTypeByString("black_banner");

    // Wall banners
    public static final PacketStateType WHITE_WALL_BANNER = TYPE.getStateTypeByString("white_wall_banner");
    public static final PacketStateType ORANGE_WALL_BANNER = TYPE.getStateTypeByString("orange_wall_banner");
    public static final PacketStateType MAGENTA_WALL_BANNER = TYPE.getStateTypeByString("magenta_wall_banner");
    public static final PacketStateType LIGHT_BLUE_WALL_BANNER = TYPE.getStateTypeByString("light_blue_wall_banner");
    public static final PacketStateType YELLOW_WALL_BANNER = TYPE.getStateTypeByString("yellow_wall_banner");
    public static final PacketStateType LIME_WALL_BANNER = TYPE.getStateTypeByString("lime_wall_banner");
    public static final PacketStateType PINK_WALL_BANNER = TYPE.getStateTypeByString("pink_wall_banner");
    public static final PacketStateType GRAY_WALL_BANNER = TYPE.getStateTypeByString("gray_wall_banner");
    public static final PacketStateType LIGHT_GRAY_WALL_BANNER = TYPE.getStateTypeByString("light_gray_wall_banner");
    public static final PacketStateType CYAN_WALL_BANNER = TYPE.getStateTypeByString("cyan_wall_banner");
    public static final PacketStateType PURPLE_WALL_BANNER = TYPE.getStateTypeByString("purple_wall_banner");
    public static final PacketStateType BLUE_WALL_BANNER = TYPE.getStateTypeByString("blue_wall_banner");
    public static final PacketStateType BROWN_WALL_BANNER = TYPE.getStateTypeByString("brown_wall_banner");
    public static final PacketStateType GREEN_WALL_BANNER = TYPE.getStateTypeByString("green_wall_banner");
    public static final PacketStateType RED_WALL_BANNER = TYPE.getStateTypeByString("red_wall_banner");

    // Additional block states referenced in HitboxData
    public static final PacketStateType SCULK_VEIN = TYPE.getStateTypeByString("sculk_vein");
    public static final PacketStateType RESIN_CLUMP = TYPE.getStateTypeByString("resin_clump");
    public static final PacketStateType SPORE_BLOSSOM = TYPE.getStateTypeByString("spore_blossom");
    public static final PacketStateType PALE_HANGING_MOSS = TYPE.getStateTypeByString("pale_hanging_moss");
    public static final PacketStateType FROGSPAWN = TYPE.getStateTypeByString("frogspawn");
    public static final PacketStateType BUSH = TYPE.getStateTypeByString("bush");
    public static final PacketStateType SHORT_DRY_GRASS = TYPE.getStateTypeByString("short_dry_grass");
    public static final PacketStateType TALL_DRY_GRASS = TYPE.getStateTypeByString("tall_dry_grass");
    public static final PacketStateType LEAF_LITTER = TYPE.getStateTypeByString("leaf_litter");

    // Missing block states for various mechanics:
    public static final PacketStateType TARGET = TYPE.getStateTypeByString("target");
    public static final PacketStateType PACKED_ICE = TYPE.getStateTypeByString("packed_ice");
    public static final PacketStateType BLUE_ICE = TYPE.getStateTypeByString("blue_ice");
    public static final PacketStateType CARVED_PUMPKIN = TYPE.getStateTypeByString("carved_pumpkin");
    public static final PacketStateType JACK_O_LANTERN = TYPE.getStateTypeByString("jack_o_lantern");
    public static final PacketStateType PUMPKIN = TYPE.getStateTypeByString("pumpkin");
    public static final PacketStateType MELON = TYPE.getStateTypeByString("melon");
    public static final PacketStateType NETHER_BRICK_FENCE = TYPE.getStateTypeByString("nether_brick_fence");
    public static final PacketStateType CHORUS_FLOWER = TYPE.getStateTypeByString("chorus_flower");
    public static final PacketStateType MANGROVE_LEAVES = TYPE.getStateTypeByString("mangrove_leaves");

    // Additional ones referenced in collision/placement:
    public static final PacketStateType WILDFLOWERS = TYPE.getStateTypeByString("wildflowers");
    public static final PacketStateType CACTUS_FLOWER = TYPE.getStateTypeByString("cactus_flower");
    public static final PacketStateType IRON_BARS = TYPE.getStateTypeByString("iron_bars");

    public static PacketStateType getById(PacketClientVersion clientVersion, int id) {
        return TYPE.getByID(clientVersion, id);
    }
}