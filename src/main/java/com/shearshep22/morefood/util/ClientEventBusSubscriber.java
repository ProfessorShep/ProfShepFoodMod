package com.shearshep22.morefood.util;

import com.shearshep22.morefood.YumMoreFood;
import com.shearshep22.morefood.init.BlockInit;
import com.shearshep22.morefood.init.BlockInitNew;

import net.minecraft.client.gui.ScreenManager;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = YumMoreFood.MOD_ID, bus = Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        RenderTypeLookup.setRenderLayer(BlockInitNew.TOMATO_PLANT.get(), RenderType.getCutout());
    }
}