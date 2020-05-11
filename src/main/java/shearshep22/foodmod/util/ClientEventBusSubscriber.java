package shearshep22.foodmod.util;

import shearshep22.foodmod.ShepFood;
import shearshep22.foodmod.init.BlockInit;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = ShepFood.MOD_ID, bus = Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        RenderTypeLookup.setRenderLayer(BlockInit.TOMATO_PLANT.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.ONION_PLANT.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.RICE_PLANT.get(), RenderType.getCutout());
    }
}