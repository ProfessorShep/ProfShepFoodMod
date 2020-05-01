package com.shearshep22.morefood.init;

import com.shearshep22.morefood.YumMoreFood;
import com.shearshep22.morefood.objects.blocks.TomatoPlant;
import com.shearshep22.morefood.objects.blocks.OnionPlant;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS,
			YumMoreFood.MOD_ID);
	public static final RegistryObject<Block> TOMATO_PLANT = BLOCKS.register("tomato_plant",
			() -> new TomatoPlant(Block.Properties.from(Blocks.WHEAT)));
	public static final RegistryObject<Block> ONION_PLANT = BLOCKS.register("onion_plant",
			() -> new OnionPlant(Block.Properties.from(Blocks.WHEAT)));
	public static final RegistryObject<Block> UNKNOWN_BLOCK = BLOCKS.register("unknown_block",
			() -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(0.7f, 15.0f).sound(SoundType.METAL)));
}
