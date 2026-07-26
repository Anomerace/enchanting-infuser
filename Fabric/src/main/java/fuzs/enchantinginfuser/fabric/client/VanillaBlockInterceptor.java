package fuzs.enchantinginfuser.fabric.client;

import fuzs.enchantinginfuser.EnchantingInfuserMod;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.EnchantingMenu;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.BlockHitResult;

@Environment(EnvType.CLIENT)
public class VanillaBlockInterceptor {
    
    public static void registerEvents() {
        // Hook into vanilla enchanting table right-click
        UseBlockCallback.EVENT.register((player, level, hand, hitResult) -> {
            if (!level.isClientSide) return InteractionResult.PASS;
            
            var blockState = level.getBlockState(hitResult.getBlockPos());
            
            // Intercept vanilla enchanting table
            if (blockState.getBlock() == Blocks.ENCHANTING_TABLE) {
                handleVanillaEnchantingTableClick(player, hitResult);
                return InteractionResult.SUCCESS;
            }
            
            return InteractionResult.PASS;
        });
    }
    
    private static void handleVanillaEnchantingTableClick(Player player, BlockHitResult hitResult) {
        // The vanilla enchanting table menu will be opened by the server
        // We intercept the screen opening event to replace it with our custom UI
        Minecraft minecraft = Minecraft.getInstance();
        
        EnchantingInfuserMod.LOGGER.info("Player interacted with vanilla enchanting table at: " + hitResult.getBlockPos());
        
        // The screen replacement will happen in the ScreenEvents handler
        // which will detect EnchantmentScreen and swap it with our UI
    }
}
