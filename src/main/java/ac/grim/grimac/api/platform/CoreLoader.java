package ac.grim.grimac.api.platform;

import java.util.*;

import ac.grim.grimac.api.platform.init.Initable;
import org.jetbrains.annotations.NotNull;

/**
 * Implemented by every concrete Core (GPL, proprietary, etc.).
 *
 *  ─ bootstrap(...) – allocate resources, register handlers
 *  ─ start()        – begin servicing
 *  ─ stop()         – graceful shutdown
 */
public interface CoreLoader {

    void bootstrap(@NotNull PlatformLoader platform,
                   @NotNull Initable... platformInitables);

    void start();

    void stop();

    class Manager {
        private static final List<CoreLoader> LOADED = new ArrayList<>();

        /** Discover every CoreLoader on the class-path and bootstrap them. */
        public static void loadAll(PlatformLoader platform,
                                   Initable... initables) {

            ServiceLoader.load(CoreLoader.class)
                    .forEach(loader -> {
                        LOADED.add(loader);
                        loader.bootstrap(platform, initables);
                    });
        }

        /** Start all previously bootstrapped cores (call after loadAll). */
        public static void startAll() {
            LOADED.forEach(CoreLoader::start);
        }

        /** Stop cores in reverse order (best for dependency chains). */
        public static void stopAll() {
            ListIterator<CoreLoader> it =
                    LOADED.listIterator(LOADED.size());
            while (it.hasPrevious()) {
                it.previous().stop();
            }
        }

        private Manager() {}
    }
}