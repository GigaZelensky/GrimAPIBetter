package ac.grim.grimac.api.packet.impl.pe.packet;

import ac.grim.grimac.api.packet.manager.PacketTypeFactory;
import com.github.retrooper.packetevents.protocol.packettype.PacketType;

import java.util.IdentityHashMap;
import java.util.Map;

public class PEPacketTypeFactory implements PacketTypeFactory {

    private final Map<String, ac.grim.grimac.api.packet.types.PacketType> handshakeC2SMap = new IdentityHashMap<>();
    private final Map<String, ac.grim.grimac.api.packet.types.PacketType> handshakeS2CMap = new IdentityHashMap<>();
    private final Map<String, ac.grim.grimac.api.packet.types.PacketType> statusC2SMap = new IdentityHashMap<>();
    private final Map<String, ac.grim.grimac.api.packet.types.PacketType> statusS2CMap = new IdentityHashMap<>();
    private final Map<String, ac.grim.grimac.api.packet.types.PacketType> loginC2SMap = new IdentityHashMap<>();
    private final Map<String, ac.grim.grimac.api.packet.types.PacketType> loginS2CMap = new IdentityHashMap<>();
    private final Map<String, ac.grim.grimac.api.packet.types.PacketType> configC2SMap = new IdentityHashMap<>();
    private final Map<String, ac.grim.grimac.api.packet.types.PacketType> configS2CMap = new IdentityHashMap<>();
    private final Map<String, ac.grim.grimac.api.packet.types.PacketType> playC2SMap = new IdentityHashMap<>();
    private final Map<String, ac.grim.grimac.api.packet.types.PacketType> playS2CMap = new IdentityHashMap<>();

    public PEPacketTypeFactory() {
        initHandshakeC2S();
        initHandshakeS2C();
        initStatusC2S();
        initStatusS2C();
        initConfigC2S();
        initConfigS2C();
        initPlayC2S();
        initPlayS2C();
        initLoginC2S();
        initLoginS2C();
    }

    private void initHandshakeC2S() {
        // Map "intention" to Handshaking.Client.HANDSHAKE
        handshakeC2SMap.put("intention", PacketType.Handshaking.Client.HANDSHAKE);
        handshakeC2SMap.put("legacy_server_list_ping", PacketType.Handshaking.Client.LEGACY_SERVER_LIST_PING);
    }

    private void initHandshakeS2C() {
        handshakeS2CMap.put("legacy_server_list_response", PacketType.Handshaking.Server.LEGACY_SERVER_LIST_RESPONSE);
    }

    private void initStatusC2S() {
        // Map "status_request" to Status.Client.REQUEST
        statusC2SMap.put("status_request", PacketType.Status.Client.REQUEST);
        // Map "ping_request" to Status.Client.PING
        statusC2SMap.put("ping_request", PacketType.Status.Client.PING);
    }

    private void initStatusS2C() {
        // Map "status_response" to Status.Server.RESPONSE
        statusS2CMap.put("status_response", PacketType.Status.Server.RESPONSE);
        // Map "pong_response" to Status.Server.PONG
        statusS2CMap.put("pong_response", PacketType.Status.Server.PONG);
    }

    private void initConfigC2S() {
        // Map "client_information" to Configuration.Client.CLIENT_SETTINGS
        configC2SMap.put("client_information", PacketType.Configuration.Client.CLIENT_SETTINGS);
        // Map "custom_payload" to Configuration.Client.PLUGIN_MESSAGE
        configC2SMap.put("custom_payload", PacketType.Configuration.Client.PLUGIN_MESSAGE);
        // Map "finish_configuration" to Configuration.Client.CONFIGURATION_END_ACK
        configC2SMap.put("finish_configuration", PacketType.Configuration.Client.CONFIGURATION_END_ACK);
        // Map "keep_alive" to Configuration.Client.KEEP_ALIVE
        configC2SMap.put("keep_alive", PacketType.Configuration.Client.KEEP_ALIVE);
        // Map "pong" to Configuration.Client.PONG
        configC2SMap.put("pong", PacketType.Configuration.Client.PONG);
        // Map "resource_pack" to Configuration.Client.RESOURCE_PACK_STATUS
        configC2SMap.put("resource_pack", PacketType.Configuration.Client.RESOURCE_PACK_STATUS);
        // Map "cookie_response" to Configuration.Client.COOKIE_RESPONSE
        configC2SMap.put("cookie_response", PacketType.Configuration.Client.COOKIE_RESPONSE);
        // Map "select_known_packs" to Configuration.Client.SELECT_KNOWN_PACKS
        configC2SMap.put("select_known_packs", PacketType.Configuration.Client.SELECT_KNOWN_PACKS);
    }

    private void initConfigS2C() {
        // Map "custom_payload" to Configuration.Server.PLUGIN_MESSAGE
        configS2CMap.put("custom_payload", PacketType.Configuration.Server.PLUGIN_MESSAGE);
        // Map "disconnect" to Configuration.Server.DISCONNECT
        configS2CMap.put("disconnect", PacketType.Configuration.Server.DISCONNECT);
        // Map "finish_configuration" to Configuration.Server.CONFIGURATION_END
        configS2CMap.put("finish_configuration", PacketType.Configuration.Server.CONFIGURATION_END);
        // Map "keep_alive" to Configuration.Server.KEEP_ALIVE
        configS2CMap.put("keep_alive", PacketType.Configuration.Server.KEEP_ALIVE);
        // Map "ping" to Configuration.Server.PING
        configS2CMap.put("ping", PacketType.Configuration.Server.PING);
        // Map "registry_data" to Configuration.Server.REGISTRY_DATA
        configS2CMap.put("registry_data", PacketType.Configuration.Server.REGISTRY_DATA);
        // Map "resource_pack_push" to Configuration.Server.RESOURCE_PACK_SEND
        configS2CMap.put("resource_pack_push", PacketType.Configuration.Server.RESOURCE_PACK_SEND);
        // Map "update_enabled_features" to Configuration.Server.UPDATE_ENABLED_FEATURES
        configS2CMap.put("update_enabled_features", PacketType.Configuration.Server.UPDATE_ENABLED_FEATURES);
        // Map "update_tags" to Configuration.Server.UPDATE_TAGS
        configS2CMap.put("update_tags", PacketType.Configuration.Server.UPDATE_TAGS);
        // Map "resource_pack_pop" to Configuration.Server.RESOURCE_PACK_REMOVE
        configS2CMap.put("resource_pack_pop", PacketType.Configuration.Server.RESOURCE_PACK_REMOVE);
        // Map "cookie_request" to Configuration.Server.COOKIE_REQUEST
        configS2CMap.put("cookie_request", PacketType.Configuration.Server.COOKIE_REQUEST);
        // Map "reset_chat" to Configuration.Server.RESET_CHAT
        configS2CMap.put("reset_chat", PacketType.Configuration.Server.RESET_CHAT);
        // Map "store_cookie" to Configuration.Server.STORE_COOKIE
        configS2CMap.put("store_cookie", PacketType.Configuration.Server.STORE_COOKIE);
        // Map "transfer" to Configuration.Server.TRANSFER
        configS2CMap.put("transfer", PacketType.Configuration.Server.TRANSFER);
        // Map "select_known_packs" to Configuration.Server.SELECT_KNOWN_PACKS
        configS2CMap.put("select_known_packs", PacketType.Configuration.Server.SELECT_KNOWN_PACKS);
        // Map "custom_report_details" to Configuration.Server.CUSTOM_REPORT_DETAILS
        configS2CMap.put("custom_report_details", PacketType.Configuration.Server.CUSTOM_REPORT_DETAILS);
        // Map "server_links" to Configuration.Server.SERVER_LINKS
        configS2CMap.put("server_links", PacketType.Configuration.Server.SERVER_LINKS);
    }

    private void initLoginC2S() {
        loginC2SMap.put("hello", PacketType.Login.Client.LOGIN_START);
        loginC2SMap.put("key", PacketType.Login.Client.ENCRYPTION_RESPONSE);
        loginC2SMap.put("custom_query_answer", PacketType.Login.Client.LOGIN_PLUGIN_RESPONSE);
        loginC2SMap.put("login_acknowledged", PacketType.Login.Client.LOGIN_SUCCESS_ACK);
        loginC2SMap.put("cookie_response", PacketType.Login.Client.COOKIE_RESPONSE);
    }

    private void initLoginS2C() {
        loginS2CMap.put("login_disconnect", PacketType.Login.Server.DISCONNECT);
        loginS2CMap.put("hello", PacketType.Login.Server.ENCRYPTION_REQUEST);
        loginS2CMap.put("login_finished", PacketType.Login.Server.LOGIN_SUCCESS);
        loginS2CMap.put("login_compression", PacketType.Login.Server.SET_COMPRESSION);
        loginS2CMap.put("custom_query", PacketType.Login.Server.LOGIN_PLUGIN_REQUEST);
        loginS2CMap.put("cookie_request", PacketType.Login.Server.COOKIE_REQUEST);

    }

    private void initPlayC2S() {
        // Play Client (C2S) Packets
        playC2SMap.put("seen_advancements", PacketType.Play.Client.ADVANCEMENT_TAB);
        playC2SMap.put("swing", PacketType.Play.Client.ANIMATION);
        playC2SMap.put("chat", PacketType.Play.Client.CHAT_MESSAGE);
        playC2SMap.put("chat_preview", PacketType.Play.Client.CHAT_PREVIEW);
        playC2SMap.put("container_click", PacketType.Play.Client.CLICK_WINDOW);
        playC2SMap.put("container_button_click", PacketType.Play.Client.CLICK_WINDOW_BUTTON);
        playC2SMap.put("client_settings", PacketType.Play.Client.CLIENT_SETTINGS);
        playC2SMap.put("client_command", PacketType.Play.Client.CLIENT_STATUS);
        playC2SMap.put("container_close", PacketType.Play.Client.CLOSE_WINDOW);
        playC2SMap.put("set_creative_mode_slot", PacketType.Play.Client.CREATIVE_INVENTORY_ACTION);
        playC2SMap.put("place_recipe", PacketType.Play.Client.CRAFT_RECIPE_REQUEST);
        playC2SMap.put("edit_book", PacketType.Play.Client.EDIT_BOOK);
        playC2SMap.put("player_command", PacketType.Play.Client.ENTITY_ACTION);
        playC2SMap.put("jigsaw_generate", PacketType.Play.Client.GENERATE_STRUCTURE);
        playC2SMap.put("set_carried_item", PacketType.Play.Client.HELD_ITEM_CHANGE);
        playC2SMap.put("interact", PacketType.Play.Client.INTERACT_ENTITY);
        playC2SMap.put("client_keep_alive", PacketType.Play.Client.KEEP_ALIVE);
        playC2SMap.put("lock_difficulty", PacketType.Play.Client.LOCK_DIFFICULTY);
        playC2SMap.put("rename_item", PacketType.Play.Client.NAME_ITEM);
        playC2SMap.put("player_abilities", PacketType.Play.Client.PLAYER_ABILITIES);
        playC2SMap.put("use_item_on", PacketType.Play.Client.PLAYER_BLOCK_PLACEMENT);
        playC2SMap.put("player_action", PacketType.Play.Client.PLAYER_DIGGING);
        playC2SMap.put("move_player_status_only", PacketType.Play.Client.PLAYER_FLYING);
        playC2SMap.put("move_player_pos", PacketType.Play.Client.PLAYER_POSITION);
        playC2SMap.put("move_player_pos_rot", PacketType.Play.Client.PLAYER_POSITION_AND_ROTATION);
        playC2SMap.put("player_rotation", PacketType.Play.Client.PLAYER_ROTATION);
        playC2SMap.put("plugin_message", PacketType.Play.Client.PLUGIN_MESSAGE);
        playC2SMap.put("pong", PacketType.Play.Client.PONG);
        playC2SMap.put("block_entity_tag_query", PacketType.Play.Client.QUERY_BLOCK_NBT);
        playC2SMap.put("entity_tag_query", PacketType.Play.Client.QUERY_ENTITY_NBT);
        playC2SMap.put("resource_pack_status", PacketType.Play.Client.RESOURCE_PACK_STATUS);
        playC2SMap.put("select_trade", PacketType.Play.Client.SELECT_TRADE);
        playC2SMap.put("set_beacon", PacketType.Play.Client.SET_BEACON_EFFECT);
        playC2SMap.put("change_difficulty", PacketType.Play.Client.SET_DIFFICULTY);
        playC2SMap.put("recipe_book_seen_recipe", PacketType.Play.Client.SET_DISPLAYED_RECIPE);
        playC2SMap.put("recipe_book_change_settings", PacketType.Play.Client.SET_RECIPE_BOOK_STATE);
        playC2SMap.put("teleport_to_entity", PacketType.Play.Client.SPECTATE);
        playC2SMap.put("paddle_boat", PacketType.Play.Client.STEER_BOAT);
        playC2SMap.put("command_suggestion", PacketType.Play.Client.TAB_COMPLETE);
        playC2SMap.put("accept_teleportation", PacketType.Play.Client.TELEPORT_CONFIRM);
        playC2SMap.put("set_command_block", PacketType.Play.Client.UPDATE_COMMAND_BLOCK);
        playC2SMap.put("set_command_minecart", PacketType.Play.Client.UPDATE_COMMAND_BLOCK_MINECART);
        playC2SMap.put("set_jigsaw_block", PacketType.Play.Client.UPDATE_JIGSAW_BLOCK);
        playC2SMap.put("set_structure_block", PacketType.Play.Client.UPDATE_STRUCTURE_BLOCK);
        playC2SMap.put("sign_update", PacketType.Play.Client.UPDATE_SIGN);
        playC2SMap.put("use_item", PacketType.Play.Client.USE_ITEM);
        playC2SMap.put("move_vehicle", PacketType.Play.Client.VEHICLE_MOVE);

        // 1.19+ packets
        playC2SMap.put("chat_command", PacketType.Play.Client.CHAT_COMMAND);
        playC2SMap.put("chat_ack", PacketType.Play.Client.CHAT_ACK);
        playC2SMap.put("chat_session_update", PacketType.Play.Client.CHAT_SESSION_UPDATE);

        // 1.20.2+ packets
        playC2SMap.put("chunk_batch_received", PacketType.Play.Client.CHUNK_BATCH_ACK);
        playC2SMap.put("configuration_acknowledged", PacketType.Play.Client.CONFIGURATION_ACK);
        playC2SMap.put("ping_request", PacketType.Play.Client.DEBUG_PING);

        // 1.20.3+ packets
        playC2SMap.put("container_slot_state_changed", PacketType.Play.Client.SLOT_STATE_CHANGE);

        // 1.20.5+ packets
        playC2SMap.put("chat_command_unsigned", PacketType.Play.Client.CHAT_COMMAND_UNSIGNED);
        playC2SMap.put("cookie_response", PacketType.Play.Client.COOKIE_RESPONSE);
        playC2SMap.put("debug_sample_subscription", PacketType.Play.Client.DEBUG_SAMPLE_SUBSCRIPTION);

        // 1.21.2+ packets
        playC2SMap.put("client_tick_end", PacketType.Play.Client.CLIENT_TICK_END);
        playC2SMap.put("player_input", PacketType.Play.Client.PLAYER_INPUT);
        playC2SMap.put("bundle_item_selected", PacketType.Play.Client.SELECT_BUNDLE_ITEM);

        // 1.21.4+ packets
        playC2SMap.put("pick_item_from_block", PacketType.Play.Client.PICK_ITEM_FROM_BLOCK);
        playC2SMap.put("pick_item_from_entity", PacketType.Play.Client.PICK_ITEM_FROM_ENTITY);
        playC2SMap.put("player_loaded", PacketType.Play.Client.PLAYER_LOADED);

        // 1.21.5+ packets
        playC2SMap.put("set_test_block", PacketType.Play.Client.SET_TEST_BLOCK);
        playC2SMap.put("test_instance_block_action", PacketType.Play.Client.TEST_INSTANCE_BLOCK_ACTION);

        // Obsolete packets (kept for backwards compatibility)
        playC2SMap.put("recipe_book_data", PacketType.Play.Client.RECIPE_BOOK_DATA);
        playC2SMap.put("window_confirmation", PacketType.Play.Client.WINDOW_CONFIRMATION);
        playC2SMap.put("steer_vehicle", PacketType.Play.Client.STEER_VEHICLE);
        playC2SMap.put("pick_item", PacketType.Play.Client.PICK_ITEM);
    }

    private void initPlayS2C() {
        // Play Server (S2C) Packets - Standard (Alphabetical by field name, no specific versioning in this block)
        playS2CMap.put("set_action_bar_text", PacketType.Play.Server.ACTION_BAR);
        playS2CMap.put("set_entity_link", PacketType.Play.Server.ATTACH_ENTITY);
        playS2CMap.put("block_event", PacketType.Play.Server.BLOCK_ACTION);
        playS2CMap.put("block_destruction", PacketType.Play.Server.BLOCK_BREAK_ANIMATION);
        playS2CMap.put("block_update", PacketType.Play.Server.BLOCK_CHANGE);
        playS2CMap.put("block_entity_data", PacketType.Play.Server.BLOCK_ENTITY_DATA);
        playS2CMap.put("boss_event", PacketType.Play.Server.BOSS_BAR);
        playS2CMap.put("set_camera", PacketType.Play.Server.CAMERA);
        playS2CMap.put("game_event", PacketType.Play.Server.CHANGE_GAME_STATE);
        playS2CMap.put("player_chat", PacketType.Play.Server.CHAT_MESSAGE);
        playS2CMap.put("level_chunk_with_light", PacketType.Play.Server.CHUNK_DATA);
        playS2CMap.put("clear_titles", PacketType.Play.Server.CLEAR_TITLES);
        playS2CMap.put("container_close", PacketType.Play.Server.CLOSE_WINDOW);
        playS2CMap.put("take_item_entity", PacketType.Play.Server.COLLECT_ITEM);
        playS2CMap.put("place_ghost_recipe", PacketType.Play.Server.CRAFT_RECIPE_RESPONSE);
        playS2CMap.put("player_combat_kill", PacketType.Play.Server.DEATH_COMBAT_EVENT);
        playS2CMap.put("commands", PacketType.Play.Server.DECLARE_COMMANDS);
        playS2CMap.put("update_recipes", PacketType.Play.Server.DECLARE_RECIPES);
        playS2CMap.put("remove_entities", PacketType.Play.Server.DESTROY_ENTITIES);
        playS2CMap.put("disconnect", PacketType.Play.Server.DISCONNECT);
        playS2CMap.put("set_display_objective", PacketType.Play.Server.DISPLAY_SCOREBOARD);
        playS2CMap.put("level_event", PacketType.Play.Server.EFFECT);
        playS2CMap.put("player_combat_end", PacketType.Play.Server.END_COMBAT_EVENT);
        playS2CMap.put("player_combat_enter", PacketType.Play.Server.ENTER_COMBAT_EVENT);
        playS2CMap.put("animate", PacketType.Play.Server.ENTITY_ANIMATION);
        playS2CMap.put("update_mob_effect", PacketType.Play.Server.ENTITY_EFFECT);
        playS2CMap.put("set_equipment", PacketType.Play.Server.ENTITY_EQUIPMENT);
        playS2CMap.put("rotate_head", PacketType.Play.Server.ENTITY_HEAD_LOOK);
        playS2CMap.put("set_entity_data", PacketType.Play.Server.ENTITY_METADATA);
        playS2CMap.put("move_entity_pos", PacketType.Play.Server.ENTITY_RELATIVE_MOVE);
        playS2CMap.put("move_entity_pos_rot", PacketType.Play.Server.ENTITY_RELATIVE_MOVE_AND_ROTATION);
        playS2CMap.put("move_entity_rot", PacketType.Play.Server.ENTITY_ROTATION);
        playS2CMap.put("sound_entity", PacketType.Play.Server.ENTITY_SOUND_EFFECT);
        playS2CMap.put("entity_event", PacketType.Play.Server.ENTITY_STATUS);
        playS2CMap.put("teleport_entity", PacketType.Play.Server.ENTITY_TELEPORT);
        playS2CMap.put("set_entity_motion", PacketType.Play.Server.ENTITY_VELOCITY);
        playS2CMap.put("explode", PacketType.Play.Server.EXPLOSION);
        playS2CMap.put("player_look_at", PacketType.Play.Server.FACE_PLAYER);
        playS2CMap.put("set_held_slot", PacketType.Play.Server.HELD_ITEM_CHANGE);
        playS2CMap.put("initialize_border", PacketType.Play.Server.INITIALIZE_WORLD_BORDER);
        playS2CMap.put("login", PacketType.Play.Server.JOIN_GAME);
        playS2CMap.put("keep_alive", PacketType.Play.Server.KEEP_ALIVE);
        playS2CMap.put("map_item_data", PacketType.Play.Server.MAP_DATA);
        playS2CMap.put("merchant_offers", PacketType.Play.Server.MERCHANT_OFFERS);
        playS2CMap.put("section_blocks_update", PacketType.Play.Server.MULTI_BLOCK_CHANGE);
        playS2CMap.put("tag_query", PacketType.Play.Server.NBT_QUERY_RESPONSE);
        playS2CMap.put("open_book", PacketType.Play.Server.OPEN_BOOK);
        playS2CMap.put("horse_screen_open", PacketType.Play.Server.OPEN_HORSE_WINDOW);
        playS2CMap.put("open_sign_editor", PacketType.Play.Server.OPEN_SIGN_EDITOR);
        playS2CMap.put("open_screen", PacketType.Play.Server.OPEN_WINDOW);
        playS2CMap.put("level_particles", PacketType.Play.Server.PARTICLE);
        playS2CMap.put("ping", PacketType.Play.Server.PING);
        playS2CMap.put("player_abilities", PacketType.Play.Server.PLAYER_ABILITIES);
        playS2CMap.put("tab_list", PacketType.Play.Server.PLAYER_LIST_HEADER_AND_FOOTER);
        playS2CMap.put("player_position", PacketType.Play.Server.PLAYER_POSITION_AND_LOOK);
        playS2CMap.put("custom_payload", PacketType.Play.Server.PLUGIN_MESSAGE);
        playS2CMap.put("remove_mob_effect", PacketType.Play.Server.REMOVE_ENTITY_EFFECT);
        playS2CMap.put("resource_pack_push", PacketType.Play.Server.RESOURCE_PACK_SEND);
        playS2CMap.put("respawn", PacketType.Play.Server.RESPAWN);
        playS2CMap.put("set_objective", PacketType.Play.Server.SCOREBOARD_OBJECTIVE);
        playS2CMap.put("select_advancements_tab", PacketType.Play.Server.SELECT_ADVANCEMENTS_TAB);
        playS2CMap.put("change_difficulty", PacketType.Play.Server.SERVER_DIFFICULTY);
        playS2CMap.put("cooldown", PacketType.Play.Server.SET_COOLDOWN);
        playS2CMap.put("set_experience", PacketType.Play.Server.SET_EXPERIENCE);
        playS2CMap.put("set_passengers", PacketType.Play.Server.SET_PASSENGERS);
        playS2CMap.put("container_set_slot", PacketType.Play.Server.SET_SLOT);
        playS2CMap.put("SET_TITLE_SUBTITLE_CONFLICT", PacketType.Play.Server.SET_TITLE_SUBTITLE);
        playS2CMap.put("set_title_text", PacketType.Play.Server.SET_TITLE_TEXT);
        playS2CMap.put("set_titles_animation", PacketType.Play.Server.SET_TITLE_TIMES);
        playS2CMap.put("sound", PacketType.Play.Server.SOUND_EFFECT);
        playS2CMap.put("add_entity", PacketType.Play.Server.SPAWN_ENTITY);
        playS2CMap.put("set_default_spawn_position", PacketType.Play.Server.SPAWN_POSITION);
        playS2CMap.put("award_stats", PacketType.Play.Server.STATISTICS);
        playS2CMap.put("stop_sound", PacketType.Play.Server.STOP_SOUND);
        playS2CMap.put("command_suggestions", PacketType.Play.Server.TAB_COMPLETE);
        playS2CMap.put("update_tags", PacketType.Play.Server.TAGS);
        playS2CMap.put("set_player_team", PacketType.Play.Server.TEAMS);
        playS2CMap.put("set_time", PacketType.Play.Server.TIME_UPDATE);
        playS2CMap.put("forget_level_chunk", PacketType.Play.Server.UNLOAD_CHUNK);
        playS2CMap.put("update_advancements", PacketType.Play.Server.UPDATE_ADVANCEMENTS);
        playS2CMap.put("update_attributes", PacketType.Play.Server.UPDATE_ATTRIBUTES);
        playS2CMap.put("set_health", PacketType.Play.Server.UPDATE_HEALTH);
        playS2CMap.put("light_update", PacketType.Play.Server.UPDATE_LIGHT);
        playS2CMap.put("set_score", PacketType.Play.Server.UPDATE_SCORE);
        playS2CMap.put("set_simulation_distance", PacketType.Play.Server.UPDATE_SIMULATION_DISTANCE);
        playS2CMap.put("set_chunk_cache_radius", PacketType.Play.Server.UPDATE_VIEW_DISTANCE);
        playS2CMap.put("set_chunk_cache_center", PacketType.Play.Server.UPDATE_VIEW_POSITION);
        playS2CMap.put("move_vehicle", PacketType.Play.Server.VEHICLE_MOVE);
        playS2CMap.put("container_set_content", PacketType.Play.Server.WINDOW_ITEMS);
        playS2CMap.put("container_set_data", PacketType.Play.Server.WINDOW_PROPERTY);
        playS2CMap.put("set_border_center", PacketType.Play.Server.WORLD_BORDER_CENTER);
        playS2CMap.put("set_border_lerp_size", PacketType.Play.Server.WORLD_BORDER_LERP_SIZE);
        playS2CMap.put("set_border_size", PacketType.Play.Server.WORLD_BORDER_SIZE);
        playS2CMap.put("set_border_warning_delay", PacketType.Play.Server.WORLD_BORDER_WARNING_DELAY);
        playS2CMap.put("set_border_warning_distance", PacketType.Play.Server.WORLD_BORDER_WARNING_REACH);

        // Play Server (S2C) Packets - Newer (1.19+)
        // Added in 1.19
        playS2CMap.put("block_changed_ack", PacketType.Play.Server.ACKNOWLEDGE_BLOCK_CHANGES);
        playS2CMap.put("server_data", PacketType.Play.Server.SERVER_DATA);
        playS2CMap.put("system_chat", PacketType.Play.Server.SYSTEM_CHAT_MESSAGE);
        // Added in 1.19.1
        playS2CMap.put("custom_chat_completions", PacketType.Play.Server.CUSTOM_CHAT_COMPLETIONS);
        playS2CMap.put("delete_chat", PacketType.Play.Server.DELETE_CHAT);
        // Added in 1.19.3
        playS2CMap.put("disguised_chat", PacketType.Play.Server.DISGUISED_CHAT);
        playS2CMap.put("player_info_remove", PacketType.Play.Server.PLAYER_INFO_REMOVE);
        playS2CMap.put("player_info_update", PacketType.Play.Server.PLAYER_INFO_UPDATE);
        // Added in 1.19.4
        playS2CMap.put("bundle", PacketType.Play.Server.BUNDLE);
        playS2CMap.put("chunks_biomes", PacketType.Play.Server.CHUNK_BIOMES);
        playS2CMap.put("damage_event", PacketType.Play.Server.DAMAGE_EVENT);
        playS2CMap.put("hurt_animation", PacketType.Play.Server.HURT_ANIMATION);
        // Added in 1.20.2
        playS2CMap.put("chunk_batch_start", PacketType.Play.Server.CHUNK_BATCH_BEGIN);
        playS2CMap.put("chunk_batch_finished", PacketType.Play.Server.CHUNK_BATCH_END);
        playS2CMap.put("start_configuration", PacketType.Play.Server.CONFIGURATION_START);
        playS2CMap.put("pong_response", PacketType.Play.Server.DEBUG_PONG);
        // Added in 1.20.3
        playS2CMap.put("reset_score", PacketType.Play.Server.RESET_SCORE);
        playS2CMap.put("resource_pack_pop", PacketType.Play.Server.RESOURCE_PACK_REMOVE);
        playS2CMap.put("ticking_state", PacketType.Play.Server.TICKING_STATE);
        playS2CMap.put("ticking_step", PacketType.Play.Server.TICKING_STEP);
        // Added in 1.20.5
        playS2CMap.put("cookie_request", PacketType.Play.Server.COOKIE_REQUEST);
        playS2CMap.put("debug_sample", PacketType.Play.Server.DEBUG_SAMPLE);
        playS2CMap.put("projectile_power", PacketType.Play.Server.PROJECTILE_POWER);
        playS2CMap.put("store_cookie", PacketType.Play.Server.STORE_COOKIE);
        playS2CMap.put("transfer", PacketType.Play.Server.TRANSFER);
        // Added in 1.21
        playS2CMap.put("custom_report_details", PacketType.Play.Server.CUSTOM_REPORT_DETAILS);
        playS2CMap.put("server_links", PacketType.Play.Server.SERVER_LINKS);
        // Added in 1.21.2
        playS2CMap.put("entity_position_sync", PacketType.Play.Server.ENTITY_POSITION_SYNC);
        playS2CMap.put("move_minecart_along_track", PacketType.Play.Server.MOVE_MINECART);
        playS2CMap.put("player_rotation", PacketType.Play.Server.PLAYER_ROTATION);
        playS2CMap.put("recipe_book_add", PacketType.Play.Server.RECIPE_BOOK_ADD);
        playS2CMap.put("recipe_book_remove", PacketType.Play.Server.RECIPE_BOOK_REMOVE);
        playS2CMap.put("recipe_book_settings", PacketType.Play.Server.RECIPE_BOOK_SETTINGS);
        playS2CMap.put("set_cursor_item", PacketType.Play.Server.SET_CURSOR_ITEM);
        playS2CMap.put("set_player_inventory", PacketType.Play.Server.SET_PLAYER_INVENTORY);
        // Added in 1.21.5
        playS2CMap.put("test_instance_block_status", PacketType.Play.Server.TEST_INSTANCE_BLOCK_STATUS);

        // Play Server (S2C) Packets - Obsolete
        playS2CMap.put("chat_preview_packet", PacketType.Play.Server.CHAT_PREVIEW_PACKET);
        playS2CMap.put("combat_event", PacketType.Play.Server.COMBAT_EVENT);
        playS2CMap.put("display_chat_preview", PacketType.Play.Server.DISPLAY_CHAT_PREVIEW);
        playS2CMap.put("entity_movement", PacketType.Play.Server.ENTITY_MOVEMENT);
        playS2CMap.put("map_chunk_bulk", PacketType.Play.Server.MAP_CHUNK_BULK);
        playS2CMap.put("named_sound_effect", PacketType.Play.Server.NAMED_SOUND_EFFECT);
        playS2CMap.put("player_chat_header", PacketType.Play.Server.PLAYER_CHAT_HEADER);
        playS2CMap.put("player_info", PacketType.Play.Server.PLAYER_INFO);
        playS2CMap.put("sculk_vibration_signal", PacketType.Play.Server.SCULK_VIBRATION_SIGNAL);
        playS2CMap.put("set_compression", PacketType.Play.Server.SET_COMPRESSION);
        playS2CMap.put("spawn_living_entity", PacketType.Play.Server.SPAWN_LIVING_ENTITY);
        playS2CMap.put("spawn_painting", PacketType.Play.Server.SPAWN_PAINTING);
        playS2CMap.put("spawn_player", PacketType.Play.Server.SPAWN_PLAYER);
        playS2CMap.put("spawn_weather_entity", PacketType.Play.Server.SPAWN_WEATHER_ENTITY);
        playS2CMap.put("title", PacketType.Play.Server.TITLE);
        playS2CMap.put("update_enabled_features", PacketType.Play.Server.UPDATE_ENABLED_FEATURES);
        playS2CMap.put("update_entity_nbt", PacketType.Play.Server.UPDATE_ENTITY_NBT);
        playS2CMap.put("update_sign", PacketType.Play.Server.UPDATE_SIGN);
        playS2CMap.put("use_bed", PacketType.Play.Server.USE_BED);
        playS2CMap.put("world_border", PacketType.Play.Server.WORLD_BORDER);
        playS2CMap.put("window_confirmation", PacketType.Play.Server.WINDOW_CONFIRMATION);
        playS2CMap.put("unlock_recipes", PacketType.Play.Server.UNLOCK_RECIPES);
        playS2CMap.put("spawn_experience_orb", PacketType.Play.Server.SPAWN_EXPERIENCE_ORB);
    }

    @Override
    public ac.grim.grimac.api.packet.types.PacketType getHandshakingC2SPacketTypeByString(String packetIdentifier) {
        return handshakeC2SMap.get(packetIdentifier);
    }

    @Override
    public ac.grim.grimac.api.packet.types.PacketType getHandshakingS2CPacketTypeByString(String packetIdentifier) {
        return handshakeS2CMap.get(packetIdentifier);
    }

    @Override
    public ac.grim.grimac.api.packet.types.PacketType getStatusC2SPacketTypeByString(String packetIdentifier) {
        return statusC2SMap.get(packetIdentifier);
    }

    @Override
    public ac.grim.grimac.api.packet.types.PacketType getStatusS2CPacketTypeByString(String packetIdentifier) {
        return statusS2CMap.get(packetIdentifier);
    }

    @Override
    public ac.grim.grimac.api.packet.types.PacketType getLoginC2SPacketTypeByString(String packetIdentifier) {
        return loginC2SMap.get(packetIdentifier);
    }

    @Override
    public ac.grim.grimac.api.packet.types.PacketType getLoginS2CPacketTypeByString(String packetIdentifier) {
        return loginS2CMap.get(packetIdentifier);
    }

    @Override
    public ac.grim.grimac.api.packet.types.PacketType getConfigurationC2SPacketTypeByString(String packetIdentifier) {
        return configC2SMap.get(packetIdentifier);
    }

    @Override
    public ac.grim.grimac.api.packet.types.PacketType getConfigurationS2CPacketTypeByString(String packetIdentifier) {
        return configS2CMap.get(packetIdentifier);
    }

    @Override
    public ac.grim.grimac.api.packet.types.PacketType getPlayC2SPacketTypeByString(String packetIdentifier) {
        return playC2SMap.get(packetIdentifier);
    }

    @Override
    public ac.grim.grimac.api.packet.types.PacketType getPlayS2CPacketTypeByString(String packetIdentifier) {
        return playS2CMap.get(packetIdentifier);
    }
}
