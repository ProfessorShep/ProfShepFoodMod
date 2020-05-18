package shearshep22.foodmod.objects.itemtiers;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

import javax.swing.*;
import java.util.function.Supplier;

public enum itemTiers implements IItemTier
{
    KNIFE(2, 250, 1.0F, 1.0F, 14,() -> { return Ingredient.fromItems(Items.IRON_INGOT); });

    private int harvestLevel;
    private int maxUses;
    private float efficiency;
    private float attackDamage;
    private int enchantability;
    private LazyValue<Ingredient> repairMaterial;

    itemTiers(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> ingredient)
    {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = new LazyValue<>(ingredient);
    }

    @Override
    public int getMaxUses() { return this.maxUses; }

    @Override
    public float getEfficiency() { return this.efficiency; }

    @Override
    public float getAttackDamage() { return this.attackDamage; }

    @Override
    public int getHarvestLevel() { return this.harvestLevel; }

    @Override
    public int getEnchantability() { return this.enchantability; }

    @Override
    public Ingredient getRepairMaterial() { return this.repairMaterial.getValue(); }
}