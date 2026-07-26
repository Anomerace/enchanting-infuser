package fuzs.enchantinginfuser.fabric.client;

import fuzs.enchantinginfuser.EnchantingInfuserMod;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.EnchantmentScreen;

@Environment(EnvType.CLIENT)
public class ClientSetup {
    
    public static void registerClientSetup() {
        // Register vanilla enchanting table integration
        VanillaBlockInterceptor.registerEvents();
        VanillaEnchantingTableIntegration.registerScreenEvents();
        
        EnchantingInfuserMod.LOGGER.info("Vanilla Enchanting Table Integration loaded");
        
        // Monitor screen changes
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if (client.screen instanceof EnchantmentScreen vanillaScreen) {
                EnchantingInfuserMod.LOGGER.debug("Vanilla enchanting screen detected");
                // Here we can replace with mod's UI if needed
                // For now, we let vanilla screen show but hook into its menu
            }
        });
    }
}
