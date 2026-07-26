package fuzs.enchantinginfuser.fabric;

import fuzs.enchantinginfuser.EnchantingInfuserMod;
import net.fabricmc.api.ModInitializer;

public class EnchantingInfuserFabric implements ModInitializer {
    
    @Override
    public void onInitialize() {
        EnchantingInfuserMod.LOGGER.info("Initializing Enchanting Infuser for Fabric");
        EnchantingInfuserMod.init();
    }
}
