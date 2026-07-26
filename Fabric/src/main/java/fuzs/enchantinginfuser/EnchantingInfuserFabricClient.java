package fuzs.enchantinginfuser.fabric;

import fuzs.enchantinginfuser.EnchantingInfuserMod;
import fuzs.enchantinginfuser.fabric.client.ClientSetup;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class EnchantingInfuserFabricClient implements ClientModInitializer {
    
    @Override
    public void onInitializeClient() {
        EnchantingInfuserMod.LOGGER.info("Initializing Enchanting Infuser Fabric Client");
        ClientSetup.registerClientSetup();
    }
}
