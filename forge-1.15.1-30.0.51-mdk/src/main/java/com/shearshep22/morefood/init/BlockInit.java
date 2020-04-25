package com.shearshep22.morefood.init;

import com.shearshep22.morefood.YumMoreFood;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@ObjectHolder(YumMoreFood.MOD_ID)
@Mod.EventBusSubscriber(modid = YumMoreFood.MOD_ID, bus = Bus.MOD)
public class BlockInit {
	public static final Block unknown_block = null;
	
	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Block> event) {
		event.getRegistry().register(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(0.7f, 15.0f).sound(SoundType.METAL)).setRegistryName("unknown_block"));
	}
	
	@SubscribeEvent
	public static void registerBlockItems(final RegistryEvent.Register<Item> event) {
		event.getRegistry().register(new BlockItem(unknown_block, new Item.Properties()).setRegistryName("unknown_block"));
	}
	
}
