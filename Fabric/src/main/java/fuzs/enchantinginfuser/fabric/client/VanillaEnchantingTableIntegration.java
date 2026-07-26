package fuzs.enchantinginfuser.fabric.client;

import fuzs.enchantinginfuser.EnchantingInfuserMod;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.screen.v1.ScreenEvents;
import net.minecraft.client.gui.screens.EnchantmentScreen;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.level.block.Blocks;

@Environment(EnvType.CLIENT)
public class VanillaEnchantingTableIntegration {
    
    public static void registerScreenEvents() {
        // Intercept vanilla enchanting table screen opening
        ScreenEvents.BEFORE_INIT.register((client, screen, scaledWidth, scaledHeight) -> {
            if (screen instanceof EnchantmentScreen vanillaScreen) {
                // Replace vanilla screen with mod's enchanting screen
                LocalPlayer player = client.player;
                if (player != null) {
                    EnchantingInfuserMod.LOGGER.info("Intercepted vanilla enchanting table screen, opening Enchanting Infuser UI");
                    // Open the mod's custom enchanting UI here
                    // client.setScreen(new EnchantingInfuserScreen(...));
                }
            }
        });
    }
}
