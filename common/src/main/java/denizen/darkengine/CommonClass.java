package denizen.darkengine;

import denizen.darkengine.platform.Services;

// This class is part of the common project meaning it is shared between all supported loaders. Code written here can only
// import and access the vanilla codebase, libraries used by vanilla, and optionally third party libraries that provide
// common compatible binaries. This means common code can not directly use loader specific concepts such as NeoForge events
// however it will be compatible with all supported mod loaders.
public class CommonClass {

    // Invoked by the entry point of each loader specific project. The mod itself is
    // implemented entirely through the common LightmapRenderStateExtractorMixin, so
    // there is nothing to bootstrap here beyond announcing ourselves.
    public static void init() {

        Constants.LOG.info("{} initialized on {} in a {} environment. Bring torches!",
                Constants.MOD_NAME, Services.PLATFORM.getPlatformName(), Services.PLATFORM.getEnvironmentName());
    }
}
