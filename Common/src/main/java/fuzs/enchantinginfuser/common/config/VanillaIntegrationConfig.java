package fuzs.enchantinginfuser.common.config;

import java.util.HashMap;
import java.util.Map;

/**
 * Configuration for vanilla integration mode
 */
public class VanillaIntegrationConfig {
    
    // Feature flags
    public static final boolean ENABLE_VANILLA_TABLE_INTEGRATION = true;
    public static final boolean DISABLE_CUSTOM_BLOCK = true;
    public static final boolean REPLACE_VANILLA_SCREEN = true;
    public static final boolean PRESERVE_ENCHANTING_DATA = true;
    
    /**
     * Get configuration status
     */
    public static Map<String, Boolean> getConfigStatus() {
        Map<String, Boolean> config = new HashMap<>();
        config.put("vanilla_integration", ENABLE_VANILLA_TABLE_INTEGRATION);
        config.put("disable_custom_block", DISABLE_CUSTOM_BLOCK);
        config.put("replace_screen", REPLACE_VANILLA_SCREEN);
        config.put("preserve_data", PRESERVE_ENCHANTING_DATA);
        return config;
    }
    
    /**
     * Log configuration
     */
    public static void logConfiguration() {
        System.out.println("=== Enchanting Infuser Vanilla Integration Config ===");
        System.out.println("Vanilla Table Integration: " + ENABLE_VANILLA_TABLE_INTEGRATION);
        System.out.println("Disable Custom Block: " + DISABLE_CUSTOM_BLOCK);
        System.out.println("Replace Vanilla Screen: " + REPLACE_VANILLA_SCREEN);
        System.out.println("Preserve Enchanting Data: " + PRESERVE_ENCHANTING_DATA);
        System.out.println("=====================================================");
    }
}
