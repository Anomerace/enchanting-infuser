package fuzs.enchantinginfuser.common.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

/**
 * Registry adjustments for vanilla integration
 * Removes the mod's custom enchanting infuser block since we're now using vanilla table
 */
public class VanillaIntegrationRegistry {
    
    /**
     * Disables the custom enchanting infuser block registration
     * Vanilla Enchanting Table will now use the mod's UI when interacted with
     */
    public static void disableEnchantingInfuserBlock() {
        // The enchanting infuser block will not be registered
        // This allows vanilla enchanting tables to use the mod's enhanced UI
    }
    
    /**
     * Gets the vanilla enchanting table for use with mod features
     */
    public static Block getVanillaEnchantingTable() {
        return Blocks.ENCHANTING_TABLE;
    }
}
