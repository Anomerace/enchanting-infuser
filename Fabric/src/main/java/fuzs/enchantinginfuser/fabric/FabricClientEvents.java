package fuzs.enchantinginfuser.fabric;

import fuzs.enchantinginfuser.EnchantingInfuserMod;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.BlockHitResult;

@Environment(EnvType.CLIENT)
public class FabricClientEvents {
    
    public static void registerClientEvents() {
        // Vanilla enchanting table right-click interceptor
        UseBlockCallback.EVENT.register((player, level, hand, hitResult) -> {
            if (level.isClientSide && player != null && hitResult.getBlockPos() != null) {
                var blockState = level.getBlockState(hitResult.getBlockPos());
                
                // Check if it's vanilla enchanting table
                if (blockState.getBlock() == Blocks.ENCHANTING_TABLE) {
                    // Open enchanting infuser screen instead
                    openEnchantingInfuserScreen(player, hitResult);
                    return InteractionResult.SUCCESS;
                }
            }
            return InteractionResult.PASS;
        });
    }
    
    private static void openEnchantingInfuserScreen(Player player, BlockHitResult hitResult) {
        // This will open the mod's enchanting UI
        // The actual screen opening depends on the mod's screen class
        EnchantingInfuserMod.LOGGER.info("Opening Enchanting Infuser UI for vanilla enchanting table");
    }
}
