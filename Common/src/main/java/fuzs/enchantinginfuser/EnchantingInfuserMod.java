package fuzs.enchantinginfuser.common;

import fuzs.enchantinginfuser.common.config.VanillaIntegrationConfig;
import fuzs.enchantinginfuser.common.registry.VanillaIntegrationRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Main mod class for Enchanting Infuser with Vanilla Integration
 */
public class EnchantingInfuserMod {
    
    public static final String MOD_ID = "enchantinginfuser";
    public static final String MOD_NAME = "Enchanting Infuser";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);
    
    public static void init() {
        LOGGER.info("Initializing Enchanting Infuser - Vanilla Integration Mode");
        
        // Load configuration
        VanillaIntegrationConfig.logConfiguration();
        
        // Initialize registry
        VanillaIntegrationRegistry.disableEnchantingInfuserBlock();
        
        LOGGER.info("Enchanting Infuser loaded successfully!");
        LOGGER.info("Vanilla Enchanting Tables will now use the mod's enhanced UI");
    }
}
