package ac.grim.grimac.api.packet.types;

import ac.grim.grimac.api.packet.MCPacket;
import ac.grim.grimac.api.packet.manager.PacketTypeFactory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class PacketTypes {

    // TODO optimize by freeing PacketTypeFactory after initialization
    private static final PacketTypeFactory TYPE = MCPacket.getAPI().getPacketTypeManager();

    // --- Lists to store packet types by category ---
    private static final List<PacketType> allHandshakingC2SPackets = new ArrayList<>();
    private static final List<PacketType> allHandshakingS2CPackets = new ArrayList<>();
    private static final List<PacketType> allStatusC2SPackets = new ArrayList<>();
    private static final List<PacketType> allStatusS2CPackets = new ArrayList<>();
    private static final List<PacketType> allLoginC2SPackets = new ArrayList<>();
    private static final List<PacketType> allLoginS2CPackets = new ArrayList<>();
    private static final List<PacketType> allConfigC2SPackets = new ArrayList<>();
    private static final List<PacketType> allConfigS2CPackets = new ArrayList<>();
    private static final List<PacketType> allPlayC2SPackets = new ArrayList<>();
    private static final List<PacketType> allPlayS2CPackets = new ArrayList<>();

    // --- Global lists for all C2S and S2C packets ---
    private static final List<PacketType> allC2SPackets = new ArrayList<>();
    private static final List<PacketType> allS2CPackets = new ArrayList<>();

    public static Collection<PacketType> getC2S() {
        return allC2SPackets;
    }

    public static Collection<PacketType> getS2C() {
        return allS2CPackets;
    }

    public static class Handshaking {

        public static final class Client {
            /** id: 0x00 */
            public static final PacketType HANDSHAKE                  = HandshakingC2S("intention");
            /**
             * id: 0xFE
             * Not really part of the current protocol, but clients 1.7- will send to initiate a server list ping.
             * and 1.8+ servers will handle it correctly.
             */
            public static final PacketType LEGACY_SERVER_LIST_PING = HandshakingC2S("legacy_server_list_ping");

            public static Collection<PacketType> values() {
                return allHandshakingC2SPackets;
            }
        }

        public static final class Server {
            /**
             * id: 0xFE
             */
            public static final PacketType LEGACY_SERVER_LIST_RESPONSE = HandshakingS2C("legacy_server_list_response");

            public static Collection<PacketType> values() {
                return allHandshakingS2CPackets;
            }
        }
    }

    public static class Status {

        public static final class Client {
            /** id: 0x00 */
            public static final PacketType REQUEST                  = StatusC2S("status_request");
            /** id: 0x01 */
            public static final PacketType PING                     = StatusC2S("ping_request");

            public static Collection<PacketType> values() {
                return allStatusC2SPackets;
            }
        }

        public static final class Server {
            /** id: 0x00 */
            public static final PacketType RESPONSE                 = StatusS2C("status_response");
            /** id: 0x01 */
            public static final PacketType PONG                     = StatusS2C("pong_response");

            public static Collection<PacketType> values() {
                return allStatusS2CPackets;
            }
        }
    }

    public static final class Login {
        public static final class Client {
            /** id: 0x00 */
            public static final PacketType LOGIN_START                  = LoginC2S("hello");
            /** id: 0x01 */
            public static final PacketType ENCRYPTION_RESPONSE          = LoginC2S("key");
            /** id: 0x02 Added in 1.13 */
            public static final PacketType LOGIN_PLUGIN_RESPONSE        = LoginC2S("custom_query_answer");
            /** id: 0x03 Added in 1.20.2 */
            public static final PacketType LOGIN_SUCCESS_ACK            = LoginC2S("login_acknowledged");
            /** id: 0x04 Added in 1.20.5 */
            public static final PacketType COOKIE_RESPONSE              = LoginC2S("cookie_response"); // Vanilla: Unknown, Assuming name

            public static Collection<PacketType> values() {
                return allLoginC2SPackets;
            }
        }

        public static final class Server {
            /** id: 0x00 */
            public static final PacketType DISCONNECT                   = LoginS2C("login_disconnect");
            /** id: 0x01 */
            public static final PacketType ENCRYPTION_REQUEST           = LoginS2C("hello");
            /** id: 0x02 */
            public static final PacketType LOGIN_SUCCESS                = LoginS2C("login_finished");
            /** id: 0x03 Added in 1.8 */
            public static final PacketType SET_COMPRESSION              = LoginS2C("login_compression");
            /** id: 0x04 Added in 1.13 */
            public static final PacketType LOGIN_PLUGIN_REQUEST         = LoginS2C("custom_query");
            /** id: 0x05 Added in 1.20.5 */
            public static final PacketType COOKIE_REQUEST               = LoginS2C("cookie_request");

            public static Collection<PacketType> values() {
                return allLoginS2CPackets;
            }
        }
    }

    // Added in 1.20.2
    public static class Configuration {

        public static final class Client {
            /** Client Settings Packet **/
            public static final PacketType CLIENT_SETTINGS          = ConfigC2S("client_information");
            /** Plugin Message Packet **/
            public static final PacketType PLUGIN_MESSAGE           = ConfigC2S("custom_payload");
            /** Configuration End Ack Packet **/
            public static final PacketType CONFIGURATION_END_ACK    = ConfigC2S("finish_configuration");
            /** Keep Alive Packet **/
            public static final PacketType KEEP_ALIVE               = ConfigC2S("keep_alive");
            /** Pong Packet **/
            public static final PacketType PONG                     = ConfigC2S("pong");
            /** Resource Pack Status Packet **/
            public static final PacketType RESOURCE_PACK_STATUS     = ConfigC2S("resource_pack");

            /** Added in 1.20.5 **/
            public static final PacketType COOKIE_RESPONSE          = ConfigC2S("cookie_response");
            /** Select Known Packs Packet **/
            public static final PacketType SELECT_KNOWN_PACKS         = ConfigC2S("select_known_packs");

            public static Collection<PacketType> values() {
                return allConfigC2SPackets;
            }
        }

        public static final class Server {
            /** Plugin Message Packet **/
            public static final PacketType PLUGIN_MESSAGE           = ConfigS2C("custom_payload");
            /** Disconnect Packet **/
            public static final PacketType DISCONNECT               = ConfigS2C("disconnect");
            /** Configuration End Packet **/
            public static final PacketType CONFIGURATION_END        = ConfigS2C("finish_configuration");
            /** Keep Alive Packet **/
            public static final PacketType KEEP_ALIVE               = ConfigS2C("keep_alive");
            /** Ping Packet **/
            public static final PacketType PING                     = ConfigS2C("ping");
            /** Registry Data Packet **/
            public static final PacketType REGISTRY_DATA            = ConfigS2C("registry_data");
            /** Resource Pack Send Packet **/
            public static final PacketType RESOURCE_PACK_SEND     = ConfigS2C("resource_pack_push");
            /** Update Enabled Features Packet **/
            public static final PacketType UPDATE_ENABLED_FEATURES  = ConfigS2C("update_enabled_features");
            /** Update Tags Packet **/
            public static final PacketType UPDATE_TAGS              = ConfigS2C("update_tags");

            /** Added in 1.20.3 **/
            public static final PacketType RESOURCE_PACK_REMOVE     = ConfigS2C("resource_pack_pop");

            /** Added in 1.20.5 **/
            public static final PacketType COOKIE_REQUEST           = ConfigS2C("cookie_request");
            /** Reset Chat Packet **/
            public static final PacketType RESET_CHAT               = ConfigS2C("reset_chat");
            /** Store Cookie Packet **/
            public static final PacketType STORE_COOKIE             = ConfigS2C("store_cookie");
            /** Transfer Packet **/
            public static final PacketType TRANSFER                 = ConfigS2C("transfer");
            /** Select Known Packs Packet **/
            public static final PacketType SELECT_KNOWN_PACKS     = ConfigS2C("select_known_packs");

            /** added in 1.21 **/
            public static final PacketType CUSTOM_REPORT_DETAILS    = ConfigS2C("custom_report_details");
            /** Server Links **/
            public static final PacketType SERVER_LINKS             = ConfigS2C("server_links");

            public static Collection<PacketType> values() {
                return allConfigS2CPackets;
            }
        }
    }

    public static final class Play {
        /* ------------------------------------------------------------- */
        /*                   PLAY  →  CLIENT  (C → S)                    */
        /* ------------------------------------------------------------- */
        public static final class Client {
            public static final PacketType ADVANCEMENT_TAB              = PlayC2S("seen_advancements");
            public static final PacketType ANIMATION                    = PlayC2S("swing");
            public static final PacketType CHAT_MESSAGE                 = PlayC2S("chat");
            public static final PacketType CHAT_PREVIEW                 = PlayC2S("chat_preview");
            public static final PacketType CLICK_WINDOW                 = PlayC2S("container_click");
            public static final PacketType CLICK_WINDOW_BUTTON          = PlayC2S("container_button_click");
            public static final PacketType CLIENT_SETTINGS              = PlayC2S("client_settings");
            public static final PacketType CLIENT_STATUS                = PlayC2S("client_command");
            public static final PacketType CLOSE_WINDOW                 = PlayC2S("container_close");
            public static final PacketType CREATIVE_INVENTORY_ACTION    = PlayC2S("set_creative_mode_slot");
            public static final PacketType CRAFT_RECIPE_REQUEST         = PlayC2S("place_recipe");
            public static final PacketType EDIT_BOOK                    = PlayC2S("edit_book");
            public static final PacketType ENTITY_ACTION                = PlayC2S("player_command");
            public static final PacketType GENERATE_STRUCTURE           = PlayC2S("jigsaw_generate");
            public static final PacketType HELD_ITEM_CHANGE             = PlayC2S("set_carried_item");
            public static final PacketType INTERACT_ENTITY              = PlayC2S("interact");
            public static final PacketType KEEP_ALIVE                   = PlayC2S("client_keep_alive");
            public static final PacketType LOCK_DIFFICULTY              = PlayC2S("lock_difficulty");
            public static final PacketType NAME_ITEM                    = PlayC2S("rename_item");
            public static final PacketType PLAYER_ABILITIES             = PlayC2S("player_abilities");
            public static final PacketType PLAYER_BLOCK_PLACEMENT       = PlayC2S("use_item_on");
            public static final PacketType PLAYER_DIGGING               = PlayC2S("player_action");
            public static final PacketType PLAYER_FLYING                = PlayC2S("move_player_status_only");
            public static final PacketType PLAYER_POSITION              = PlayC2S("move_player_pos");
            public static final PacketType PLAYER_POSITION_AND_ROTATION = PlayC2S("move_player_pos_rot");
            public static final PacketType PLAYER_ROTATION              = PlayC2S("player_rotation");
            public static final PacketType PLUGIN_MESSAGE               = PlayC2S("plugin_message");
            public static final PacketType PONG                         = PlayC2S("pong");
            public static final PacketType QUERY_BLOCK_NBT              = PlayC2S("block_entity_tag_query");
            public static final PacketType QUERY_ENTITY_NBT             = PlayC2S("entity_tag_query");
            public static final PacketType RESOURCE_PACK_STATUS         = PlayC2S("resource_pack_status");
            public static final PacketType SELECT_TRADE                 = PlayC2S("select_trade");
            public static final PacketType SET_BEACON_EFFECT            = PlayC2S("set_beacon");
            public static final PacketType SET_DIFFICULTY               = PlayC2S("change_difficulty");
            public static final PacketType SET_DISPLAYED_RECIPE         = PlayC2S("recipe_book_seen_recipe");
            public static final PacketType SET_RECIPE_BOOK_STATE        = PlayC2S("recipe_book_change_settings");
            public static final PacketType SPECTATE                     = PlayC2S("teleport_to_entity");
            public static final PacketType STEER_BOAT                   = PlayC2S("paddle_boat");
            public static final PacketType TAB_COMPLETE                 = PlayC2S("command_suggestion");
            public static final PacketType TELEPORT_CONFIRM             = PlayC2S("accept_teleportation");
            public static final PacketType UPDATE_COMMAND_BLOCK         = PlayC2S("set_command_block");
            public static final PacketType UPDATE_COMMAND_BLOCK_MINECART= PlayC2S("set_command_minecart");
            public static final PacketType UPDATE_JIGSAW_BLOCK          = PlayC2S("set_jigsaw_block");
            public static final PacketType UPDATE_STRUCTURE_BLOCK       = PlayC2S("set_structure_block");
            public static final PacketType UPDATE_SIGN                  = PlayC2S("sign_update");
            public static final PacketType USE_ITEM                     = PlayC2S("use_item");
            public static final PacketType VEHICLE_MOVE                 = PlayC2S("move_vehicle");

            /* ───── Newer packets 1.19 → 1.21.x ───── */
            /** Added in 1.19 */
            public static final PacketType CHAT_COMMAND                 = PlayC2S("chat_command");

            /** Added in 1.19.1 */
            public static final PacketType CHAT_ACK                     = PlayC2S("chat_ack");

            /** Added in 1.19.3 */
            public static final PacketType CHAT_SESSION_UPDATE          = PlayC2S("chat_session_update");

            /** Added in 1.20.2 */
            public static final PacketType CHUNK_BATCH_ACK              = PlayC2S("chunk_batch_received");
            /** Added in 1.20.2 */
            public static final PacketType CONFIGURATION_ACK            = PlayC2S("configuration_acknowledged");
            /** Added in 1.20.2 */
            public static final PacketType DEBUG_PING                   = PlayC2S("ping_request");

            /** Added in 1.20.3 */
            public static final PacketType SLOT_STATE_CHANGE            = PlayC2S("container_slot_state_changed");

            /** Added in 1.20.5 */
            public static final PacketType CHAT_COMMAND_UNSIGNED        = PlayC2S("chat_command_unsigned");
            /** Added in 1.20.5 */
            public static final PacketType COOKIE_RESPONSE              = PlayC2S("cookie_response");
            /** Added in 1.20.5 */
            public static final PacketType DEBUG_SAMPLE_SUBSCRIPTION    = PlayC2S("debug_sample_subscription");

            /** Added in 1.21.2 */
            public static final PacketType CLIENT_TICK_END              = PlayC2S("client_tick_end");
            /** Added in 1.21.2, similar to {@link #STEER_VEHICLE} */
            public static final PacketType PLAYER_INPUT                 = PlayC2S("player_input");
            /** Added in 1.21.2 */
            public static final PacketType SELECT_BUNDLE_ITEM           = PlayC2S("bundle_item_selected");

            /** Added in 1.21.4 */
            public static final PacketType PICK_ITEM_FROM_BLOCK         = PlayC2S("pick_item_from_block");
            /** Added in 1.21.4 */
            public static final PacketType PICK_ITEM_FROM_ENTITY        = PlayC2S("pick_item_from_entity");
            /** Added in 1.21.4 */
            public static final PacketType PLAYER_LOADED                = PlayC2S("player_loaded");

            /** Added in 1.21.5 */
            public static final PacketType SET_TEST_BLOCK               = PlayC2S("set_test_block");
            /** Added in 1.21.5 */
            public static final PacketType TEST_INSTANCE_BLOCK_ACTION   = PlayC2S("test_instance_block_action");

            // ─────────────────────────────────────────────
            // Obsolete Fields (Ordered by Removal Version Ascending)
            // ─────────────────────────────────────────────
            /** Removed in 1.16.2 */
            public static final PacketType RECIPE_BOOK_DATA             = PlayC2S("recipe_book_data");

            /** Removed in 1.17. See {@link PONG} */
            public static final PacketType WINDOW_CONFIRMATION          = PlayC2S("window_confirmation");

            /** Removed in 1.21.2 */
            public static final PacketType STEER_VEHICLE                = PlayC2S("steer_vehicle");

            /** Removed in 1.21.4; unsure when added, possibly 1.20.4+ */
            public static final PacketType PICK_ITEM                    = PlayC2S("pick_item");

            public static Collection<PacketType> values() {
                return allPlayC2SPackets;
            }
        }

        /* ------------------------------------------------------------- */
        /*                   PLAY  →  CLIENT  (S → C)                    */
        /* ------------------------------------------------------------- */
        public static final class Server {
            public static final PacketType ACTION_BAR                    = PlayS2C("set_action_bar_text");
            public static final PacketType ATTACH_ENTITY                 = PlayS2C("set_entity_link");
            public static final PacketType BLOCK_ACTION                  = PlayS2C("block_event");
            public static final PacketType BLOCK_BREAK_ANIMATION         = PlayS2C("block_destruction");
            public static final PacketType BLOCK_CHANGE                  = PlayS2C("block_update");
            public static final PacketType BLOCK_ENTITY_DATA             = PlayS2C("block_entity_data");
            public static final PacketType BOSS_BAR                      = PlayS2C("boss_event");
            public static final PacketType CAMERA                        = PlayS2C("set_camera");
            public static final PacketType CHANGE_GAME_STATE             = PlayS2C("game_event");
            public static final PacketType CHAT_MESSAGE                  = PlayS2C("player_chat");
            public static final PacketType CHUNK_DATA                    = PlayS2C("level_chunk_with_light");
            public static final PacketType CLEAR_TITLES                  = PlayS2C("clear_titles");
            public static final PacketType CLOSE_WINDOW                  = PlayS2C("container_close");
            public static final PacketType COLLECT_ITEM                  = PlayS2C("take_item_entity");
            public static final PacketType CRAFT_RECIPE_RESPONSE         = PlayS2C("place_ghost_recipe");
            public static final PacketType DEATH_COMBAT_EVENT            = PlayS2C("player_combat_kill");
            public static final PacketType DECLARE_COMMANDS              = PlayS2C("commands");
            public static final PacketType DECLARE_RECIPES               = PlayS2C("update_recipes");
            public static final PacketType DESTROY_ENTITIES              = PlayS2C("remove_entities");
            public static final PacketType DISCONNECT                    = PlayS2C("disconnect");
            public static final PacketType DISPLAY_SCOREBOARD            = PlayS2C("set_display_objective");
            public static final PacketType EFFECT                        = PlayS2C("level_event");
            public static final PacketType END_COMBAT_EVENT              = PlayS2C("player_combat_end");
            public static final PacketType ENTER_COMBAT_EVENT            = PlayS2C("player_combat_enter");
            public static final PacketType ENTITY_ANIMATION              = PlayS2C("animate");
            public static final PacketType ENTITY_EFFECT                 = PlayS2C("update_mob_effect");
            public static final PacketType ENTITY_EQUIPMENT              = PlayS2C("set_equipment");
            public static final PacketType ENTITY_HEAD_LOOK              = PlayS2C("rotate_head");
            public static final PacketType ENTITY_METADATA               = PlayS2C("set_entity_data");
            public static final PacketType ENTITY_RELATIVE_MOVE          = PlayS2C("move_entity_pos");
            public static final PacketType ENTITY_RELATIVE_MOVE_AND_ROTATION = PlayS2C("move_entity_pos_rot");
            public static final PacketType ENTITY_ROTATION               = PlayS2C("move_entity_rot");
            public static final PacketType ENTITY_SOUND_EFFECT           = PlayS2C("sound_entity");
            public static final PacketType ENTITY_STATUS                 = PlayS2C("entity_event");
            public static final PacketType ENTITY_TELEPORT               = PlayS2C("teleport_entity");
            public static final PacketType ENTITY_VELOCITY               = PlayS2C("set_entity_motion");
            public static final PacketType EXPLOSION                     = PlayS2C("explode");
            public static final PacketType FACE_PLAYER                   = PlayS2C("player_look_at");
            public static final PacketType HELD_ITEM_CHANGE              = PlayS2C("set_held_slot");
            public static final PacketType INITIALIZE_WORLD_BORDER       = PlayS2C("initialize_border");
            public static final PacketType JOIN_GAME                     = PlayS2C("login");
            public static final PacketType KEEP_ALIVE                    = PlayS2C("keep_alive");
            public static final PacketType MAP_DATA                      = PlayS2C("map_item_data");
            public static final PacketType MERCHANT_OFFERS               = PlayS2C("merchant_offers");
            public static final PacketType MULTI_BLOCK_CHANGE            = PlayS2C("section_blocks_update");
            public static final PacketType NBT_QUERY_RESPONSE            = PlayS2C("tag_query");
            public static final PacketType OPEN_BOOK                     = PlayS2C("open_book");
            public static final PacketType OPEN_HORSE_WINDOW             = PlayS2C("horse_screen_open");
            public static final PacketType OPEN_SIGN_EDITOR              = PlayS2C("open_sign_editor");
            public static final PacketType OPEN_WINDOW                   = PlayS2C("open_screen");
            public static final PacketType PARTICLE                      = PlayS2C("level_particles");
            public static final PacketType PING                          = PlayS2C("ping");
            public static final PacketType PLAYER_ABILITIES              = PlayS2C("player_abilities");
            public static final PacketType PLAYER_LIST_HEADER_AND_FOOTER = PlayS2C("tab_list");
            public static final PacketType PLAYER_POSITION_AND_LOOK      = PlayS2C("player_position");
            public static final PacketType PLUGIN_MESSAGE                = PlayS2C("custom_payload");
            public static final PacketType REMOVE_ENTITY_EFFECT          = PlayS2C("remove_mob_effect");
            public static final PacketType RESOURCE_PACK_SEND            = PlayS2C("resource_pack_push");
            public static final PacketType RESPAWN                       = PlayS2C("respawn");
            public static final PacketType SCOREBOARD_OBJECTIVE          = PlayS2C("set_objective");
            public static final PacketType SELECT_ADVANCEMENTS_TAB       = PlayS2C("select_advancements_tab");
            public static final PacketType SERVER_DIFFICULTY             = PlayS2C("change_difficulty");
            public static final PacketType SET_COOLDOWN                  = PlayS2C("cooldown");
            public static final PacketType SET_EXPERIENCE                = PlayS2C("set_experience");
            public static final PacketType SET_PASSENGERS                = PlayS2C("set_passengers");
            public static final PacketType SET_SLOT                      = PlayS2C("container_set_slot");
            public static final PacketType SET_TITLE_SUBTITLE            = PlayS2C("SET_TITLE_SUBTITLE_CONFLICT");
            public static final PacketType SET_TITLE_TEXT                = PlayS2C("set_title_text");
            public static final PacketType SET_TITLE_TIMES               = PlayS2C("set_titles_animation");
            public static final PacketType SOUND_EFFECT                  = PlayS2C("sound");
            public static final PacketType SPAWN_ENTITY                  = PlayS2C("add_entity");
            public static final PacketType SPAWN_POSITION                = PlayS2C("set_default_spawn_position");
            public static final PacketType STATISTICS                    = PlayS2C("award_stats");
            public static final PacketType STOP_SOUND                    = PlayS2C("stop_sound");
            public static final PacketType TAB_COMPLETE                  = PlayS2C("command_suggestions");
            public static final PacketType TAGS                          = PlayS2C("update_tags");
            public static final PacketType TEAMS                         = PlayS2C("set_player_team");
            public static final PacketType TIME_UPDATE                   = PlayS2C("set_time");
            public static final PacketType UNLOAD_CHUNK                  = PlayS2C("forget_level_chunk");
            public static final PacketType UPDATE_ADVANCEMENTS           = PlayS2C("update_advancements");
            public static final PacketType UPDATE_ATTRIBUTES             = PlayS2C("update_attributes");
            public static final PacketType UPDATE_HEALTH                 = PlayS2C("set_health");
            public static final PacketType UPDATE_LIGHT                  = PlayS2C("light_update");
            public static final PacketType UPDATE_SCORE                  = PlayS2C("set_score");
            public static final PacketType UPDATE_SIMULATION_DISTANCE    = PlayS2C("set_simulation_distance");
            public static final PacketType UPDATE_VIEW_DISTANCE          = PlayS2C("set_chunk_cache_radius");
            public static final PacketType UPDATE_VIEW_POSITION          = PlayS2C("set_chunk_cache_center");
            public static final PacketType VEHICLE_MOVE                  = PlayS2C("move_vehicle");
            public static final PacketType WINDOW_ITEMS                  = PlayS2C("container_set_content");
            public static final PacketType WINDOW_PROPERTY               = PlayS2C("container_set_data");
            public static final PacketType WORLD_BORDER_CENTER           = PlayS2C("set_border_center");
            public static final PacketType WORLD_BORDER_LERP_SIZE        = PlayS2C("set_border_lerp_size");
            public static final PacketType WORLD_BORDER_SIZE             = PlayS2C("set_border_size");
            public static final PacketType WORLD_BORDER_WARNING_DELAY    = PlayS2C("set_border_warning_delay");
            public static final PacketType WORLD_BORDER_WARNING_REACH    = PlayS2C("set_border_warning_distance");

            /* ───── Newer packets 1.19 → 1.21.x ───── */
            /** Added in 1.19 */
            public static final PacketType ACKNOWLEDGE_BLOCK_CHANGES     = PlayS2C("block_changed_ack");
            /** Added in 1.19 */
            public static final PacketType SERVER_DATA                   = PlayS2C("server_data");
            /** Added in 1.19 */
            public static final PacketType SYSTEM_CHAT_MESSAGE           = PlayS2C("system_chat");

            /** Added in 1.19.1 */
            public static final PacketType CUSTOM_CHAT_COMPLETIONS       = PlayS2C("custom_chat_completions");
            /** Added in 1.19.1 */
            public static final PacketType DELETE_CHAT                   = PlayS2C("delete_chat");

            /** Added in 1.19.3 */
            public static final PacketType DISGUISED_CHAT                = PlayS2C("disguised_chat");
            /** Added in 1.19.3 */
            public static final PacketType PLAYER_INFO_REMOVE            = PlayS2C("player_info_remove");
            /** Added in 1.19.3 */
            public static final PacketType PLAYER_INFO_UPDATE            = PlayS2C("player_info_update");

            /** Added in 1.19.4 */
            public static final PacketType BUNDLE                        = PlayS2C("bundle");
            /** Added in 1.19.4 */
            public static final PacketType CHUNK_BIOMES                  = PlayS2C("chunks_biomes");
            /** Added in 1.19.4 */
            public static final PacketType DAMAGE_EVENT                  = PlayS2C("damage_event");
            /** Added in 1.19.4 */
            public static final PacketType HURT_ANIMATION                = PlayS2C("hurt_animation");

            /** Added in 1.20.2 */
            public static final PacketType CHUNK_BATCH_BEGIN             = PlayS2C("chunk_batch_start");
            /** Added in 1.20.2 */
            public static final PacketType CHUNK_BATCH_END               = PlayS2C("chunk_batch_finished");
            /** Added in 1.20.2 */
            public static final PacketType CONFIGURATION_START           = PlayS2C("start_configuration");
            /** Added in 1.20.2 */
            public static final PacketType DEBUG_PONG                    = PlayS2C("pong_response");

            /** Added in 1.20.3 */
            public static final PacketType RESET_SCORE                   = PlayS2C("reset_score");
            /** Added in 1.20.3 */
            public static final PacketType RESOURCE_PACK_REMOVE          = PlayS2C("resource_pack_pop");
            /** Added in 1.20.3 */
            public static final PacketType TICKING_STATE                 = PlayS2C("ticking_state");
            /** Added in 1.20.3 */
            public static final PacketType TICKING_STEP                  = PlayS2C("ticking_step");

            /** Added in 1.20.5 */
            public static final PacketType COOKIE_REQUEST                = PlayS2C("cookie_request");
            /** Added in 1.20.5 */
            public static final PacketType DEBUG_SAMPLE                  = PlayS2C("debug_sample");
            /** Added in 1.20.5 */
            public static final PacketType PROJECTILE_POWER              = PlayS2C("projectile_power");
            /** Added in 1.20.5 */
            public static final PacketType STORE_COOKIE                  = PlayS2C("store_cookie");
            /** Added in 1.20.5 */
            public static final PacketType TRANSFER                      = PlayS2C("transfer");

            /** Added in 1.21 */
            public static final PacketType CUSTOM_REPORT_DETAILS         = PlayS2C("custom_report_details");
            /** Added in 1.21 */
            public static final PacketType SERVER_LINKS                  = PlayS2C("server_links");

            /** Added in 1.21.2 */
            public static final PacketType ENTITY_POSITION_SYNC          = PlayS2C("entity_position_sync");
            /** Added in 1.21.2 */
            public static final PacketType MOVE_MINECART                 = PlayS2C("move_minecart_along_track");
            /** Added in 1.21.2 */
            public static final PacketType PLAYER_ROTATION               = PlayS2C("player_rotation");
            /** Added in 1.21.2 */
            public static final PacketType RECIPE_BOOK_ADD               = PlayS2C("recipe_book_add");
            /** Added in 1.21.2 */
            public static final PacketType RECIPE_BOOK_REMOVE            = PlayS2C("recipe_book_remove");
            /** Added in 1.21.2 */
            public static final PacketType RECIPE_BOOK_SETTINGS          = PlayS2C("recipe_book_settings");
            /** Added in 1.21.2 */
            public static final PacketType SET_CURSOR_ITEM               = PlayS2C("set_cursor_item");
            /** Added in 1.21.2 */
            public static final PacketType SET_PLAYER_INVENTORY          = PlayS2C("set_player_inventory");

            /** Added in 1.21.5 */
            public static final PacketType TEST_INSTANCE_BLOCK_STATUS    = PlayS2C("test_instance_block_status");

            // ─────────────────────────────────────────────
            // Obsolete Fields (Ordered by Removal Version Ascending, then Alphabetically)
            // ─────────────────────────────────────────────
            /** Removed in an older version; replaced by ACKNOWLEDGE_BLOCK_CHANGES. */
            public static final PacketType ACKNOWLEDGE_PLAYER_DIGGING    = PlayS2C("block_changed_ack");
            /** Removed in an older version. */
            public static final PacketType CHAT_PREVIEW_PACKET           = PlayS2C("chat_preview_packet");
            /** Removed in an older version; functionality changed/split. */
            public static final PacketType COMBAT_EVENT                  = PlayS2C("combat_event");
            /** Removed in an older version. */
            public static final PacketType DISPLAY_CHAT_PREVIEW          = PlayS2C("display_chat_preview");
            /** Removed in an older version; functionality split into specific move packets. */
            public static final PacketType ENTITY_MOVEMENT               = PlayS2C("entity_movement");
            /** Removed in an older version. */
            public static final PacketType MAP_CHUNK_BULK                = PlayS2C("map_chunk_bulk");
            /** Removed in an older version; replaced by SOUND_EFFECT. */
            public static final PacketType NAMED_SOUND_EFFECT            = PlayS2C("named_sound_effect");
            /** Removed in an older version. */
            public static final PacketType PLAYER_CHAT_HEADER            = PlayS2C("player_chat_header");
            /** Removed in an older version; replaced by PLAYER_INFO_REMOVE and PLAYER_INFO_UPDATE. */
            public static final PacketType PLAYER_INFO                   = PlayS2C("player_info");
            /** Removed in an older version. */
            public static final PacketType SCULK_VIBRATION_SIGNAL        = PlayS2C("sculk_vibration_signal");
            /** Removed in an older version; not a Play S2C packet in modern Minecraft. */
            public static final PacketType SET_COMPRESSION               = PlayS2C("set_compression");
            /** Removed in an older version; use SPAWN_ENTITY. */
            public static final PacketType SPAWN_LIVING_ENTITY           = PlayS2C("spawn_living_entity");
            /** Removed in an older version; use SPAWN_ENTITY. */
            public static final PacketType SPAWN_PAINTING                = PlayS2C("spawn_painting");
            /** Removed in an older version; use SPAWN_ENTITY. */
            public static final PacketType SPAWN_PLAYER                  = PlayS2C("spawn_player");
            /** Removed in an older version; use SPAWN_ENTITY. */
            public static final PacketType SPAWN_WEATHER_ENTITY          = PlayS2C("spawn_weather_entity");
            /** Removed in an older version; functionality split into SET_TITLE_TEXT, SET_SUBTITLE_TEXT, SET_TITLE_TIMES. */
            public static final PacketType TITLE                         = PlayS2C("title");
            /** Removed in an older version. */
            public static final PacketType UPDATE_ENABLED_FEATURES       = PlayS2C("update_enabled_features");
            /** Removed in an older version. */
            public static final PacketType UPDATE_ENTITY_NBT             = PlayS2C("update_entity_nbt");
            /** Removed in an older version; sign updates are part of BLOCK_ENTITY_DATA. */
            public static final PacketType UPDATE_SIGN                   = PlayS2C("update_sign");
            /** Removed in an older version. */
            public static final PacketType USE_BED                       = PlayS2C("use_bed");
            /** Removed in an older version; functionality split into specific world border packets. */
            public static final PacketType WORLD_BORDER                  = PlayS2C("world_border");

            /** Removed around 1.17; S2C functionality replaced by PING. */
            public static final PacketType WINDOW_CONFIRMATION           = PlayS2C("window_confirmation");

            /** Removed in 1.21.2; functionality split into RECIPE_BOOK_ADD, RECIPE_BOOK_REMOVE, and RECIPE_BOOK_SETTINGS. */
            public static final PacketType UNLOCK_RECIPES                = PlayS2C("unlock_recipes");
            public static final PacketType SPAWN_EXPERIENCE_ORB          = PlayS2C("spawn_experience_orb");

            public static Collection<PacketType> values() {
                return allPlayS2CPackets;
            }
        }
    }

    private static PacketType HandshakingC2S(String name) {
        PacketType packetType = TYPE.getHandshakingC2SPacketTypeByString(name);
        if (packetType != null) {
            allHandshakingC2SPackets.add(packetType);
            allC2SPackets.add(packetType);
        }
        return packetType;
    }

    private static PacketType HandshakingS2C(String name) {
        PacketType packetType = TYPE.getHandshakingS2CPacketTypeByString(name);
        if (packetType != null) {
            allHandshakingS2CPackets.add(packetType);
            allS2CPackets.add(packetType);
        }
        return packetType;
    }

    private static PacketType StatusC2S(String name) {
        PacketType packetType = TYPE.getStatusC2SPacketTypeByString(name);
        if (packetType != null) {
            allStatusC2SPackets.add(packetType);
            allC2SPackets.add(packetType);
        }
        return packetType;
    }

    private static PacketType StatusS2C(String name) {
        PacketType packetType = TYPE.getStatusS2CPacketTypeByString(name);
        if (packetType != null) {
            allStatusS2CPackets.add(packetType);
            allS2CPackets.add(packetType);
        }
        return packetType;
    }

    public static PacketType LoginC2S(String packetIdentifier) {
        PacketType packetType = TYPE.getLoginC2SPacketTypeByString(packetIdentifier);
        if (packetType != null) {
            allLoginC2SPackets.add(packetType);
            allC2SPackets.add(packetType);
        }
        return packetType;
    }

    public static PacketType LoginS2C(String packetIdentifier) {
        PacketType packetType = TYPE.getLoginS2CPacketTypeByString(packetIdentifier);
        if (packetType != null) {
            allLoginS2CPackets.add(packetType);
            allS2CPackets.add(packetType);
        }
        return packetType;
    }

    private static PacketType ConfigC2S(String name) {
        PacketType packetType = TYPE.getConfigurationC2SPacketTypeByString(name);
        if (packetType != null) {
            allConfigC2SPackets.add(packetType);
            allC2SPackets.add(packetType);
        }
        return packetType;
    }

    private static PacketType ConfigS2C(String name) {
        PacketType packetType = TYPE.getConfigurationS2CPacketTypeByString(name);
        if (packetType != null) {
            allConfigS2CPackets.add(packetType);
            allS2CPackets.add(packetType);
        }
        return packetType;
    }

    public static PacketType PlayC2S(String packetIdentifier) {
        PacketType packetType = TYPE.getPlayC2SPacketTypeByString(packetIdentifier);
        if (packetType != null) {
            allPlayC2SPackets.add(packetType);
            allC2SPackets.add(packetType);
        }
        return packetType;
    }

    public static PacketType PlayS2C(String packetIdentifier) {
        PacketType packetType = TYPE.getPlayS2CPacketTypeByString(packetIdentifier);
        if (packetType != null) {
            allPlayS2CPackets.add(packetType);
            allS2CPackets.add(packetType);
        }
        return packetType;
    }
}
