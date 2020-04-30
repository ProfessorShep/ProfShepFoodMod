package com.shearshep22.morefood.init;

import com.shearshep22.morefood.YumMoreFood;
import com.shearshep22.morefood.objects.blocks.TomatoPlant;
import com.shearshep22.morefood.objects.blocks.OnionPlant;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInitNew {

	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS,
			YumMoreFood.MOD_ID);
	public static final RegistryObject<Block> TOMATO_PLANT = BLOCKS.register("tomato_plant",
			() -> new TomatoPlant(Block.Properties.from(Blocks.WHEAT)));
	public static final RegistryObject<Block> ONION_PLANT = BLOCKS.register("onion_plant",
			() -> new OnionPlant(Block.Properties.from(Blocks.WHEAT)));
}
