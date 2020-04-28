package com.shearshep22.morefood.init;

import com.shearshep22.morefood.YumMoreFood;
import com.shearshep22.morefood.YumMoreFood.YMoreFoodTab;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ObjectHolder;
public class ItemInitNew {
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS,
			YumMoreFood.MOD_ID);
	public static final RegistryObject<Item> TOMATO_SEEDS = ITEMS.register("tomato_seeds",
			() -> new BlockItem(BlockInitNew.TOMATO_PLANT.get(), new Item.Properties().group(YMoreFoodTab.instance)));

}