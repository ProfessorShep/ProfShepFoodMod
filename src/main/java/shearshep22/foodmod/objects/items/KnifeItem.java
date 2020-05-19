package shearshep22.foodmod.objects.items;

import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.nbt.ListNBT;

import java.util.Random;

public class KnifeItem extends SwordItem {
    private Random itemRand = new Random();
    public KnifeItem(IItemTier p_i48460_1_, int p_i48460_2_, float p_i48460_3_, Properties p_i48460_4_) {
        super(p_i48460_1_, p_i48460_2_, p_i48460_3_, p_i48460_4_);
    }

    @Override
    public boolean hasContainerItem(ItemStack stack) {
        return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack) {
        ItemStack ret = new ItemStack(this);
        ret.setDamage(itemStack.getDamage());
        ret.attemptDamageItem(1, itemRand, null);


        return ret;
    }
}
