package com.shearshep22.morefood.init;

import com.shearshep22.morefood.YumMoreFood;
import com.shearshep22.morefood.YumMoreFood.YMoreFoodTab;

import net.minecraft.block.Blocks;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid=YumMoreFood.MOD_ID, bus = Bus.MOD)
@ObjectHolder(YumMoreFood.MOD_ID)
public class ItemInit {
	public static final Item tomato = null;
	public static final Item flour = null;
	public static final Item yeast = null;
	public static final Item chocolate = null;
	public static final Item dough = null;
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event) {
		event.getRegistry().register(new Item(new Item.Properties().group(YMoreFoodTab.instance)).setRegistryName("flour"));
		event.getRegistry().register(new Item(new Item.Properties().group(YMoreFoodTab.instance).food(new Food.Builder().hunger(2).saturation(2f).build())).setRegistryName("tomato"));
		event.getRegistry().register(new Item(new Item.Properties().group(YMoreFoodTab.instance)).setRegistryName("yeast"));
		event.getRegistry().register(new Item(new Item.Properties().group(YMoreFoodTab.instance).food(new Food.Builder().hunger(2).saturation(2f).build())).setRegistryName("chocolate"));
		event.getRegistry().register(new Item(new Item.Properties().group(YMoreFoodTab.instance)).setRegistryName("dough"));
	}
}
