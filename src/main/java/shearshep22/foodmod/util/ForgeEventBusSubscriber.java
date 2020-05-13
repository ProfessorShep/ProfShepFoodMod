package shearshep22.foodmod.util;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootPool;
import net.minecraft.world.storage.loot.TableLootEntry;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import shearshep22.foodmod.ShepFood;

@Mod.EventBusSubscriber(modid = ShepFood.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ForgeEventBusSubscriber {
    @SubscribeEvent
    public static void onLootLoad(LootTableLoadEvent event) {
        if (event.getName().equals(new ResourceLocation("minecraft","chests/village/village_plains_house"))) {
            event.getTable().addPool(LootPool.builder().addEntry(TableLootEntry.builder(new ResourceLocation(ShepFood.MOD_ID,"chests/village_plains_house"))).build());
        }
        if (event.getName().equals(new ResourceLocation("minecraft","chests/abandoned_mineshaft"))) {
            event.getTable().addPool(LootPool.builder().addEntry(TableLootEntry.builder(new ResourceLocation(ShepFood.MOD_ID,"chests/abandoned_mineshaft"))).build());
        }
        ShepFood.LOGGER.debug("Registered Professor Shep's Food Mod chest loot!");
    }
}
