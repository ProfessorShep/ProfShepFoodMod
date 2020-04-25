package com.shearshep22.morefood;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.shearshep22.morefood.init.ItemInit;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("ymorefood")
public class YumMoreFood
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "ymorefood";
    public static YumMoreFood instance;

    public YumMoreFood() {
    	final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::setup);
        modEventBus.addListener(this::doClientStuff);
        instance=this;
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
    	
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
    	
    }
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
    	
    }
    public static class YMoreFoodTab extends ItemGroup{
    	public static final YMoreFoodTab instance = new YMoreFoodTab(ItemGroup.GROUPS.length, "ymoretab");
    	private YMoreFoodTab(int index, String label) {
    		super(index, label);
    	}
    	@Override
    	public ItemStack createIcon() {
    		return new ItemStack(ItemInit.tomato);
    	}
    }
}
