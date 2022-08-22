package mods.clayium;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.tags.ItemTags;

public enum ClayiumTier implements IItemTier {

    CLAY(0, 400, 3.0F, 0.0F, 15,
            Ingredient.fromItems(Items.CLAY,Items.CLAY_BALL)),
    DENCE_CLAY(2,800,5.0F,2.0F,30,
            Ingredient.fromItems(Clayium.Items.DENSE_CLAY.get())),

    ;

    private final int MaxUses,Harvestlevel,Enchantability;
    private final float Efficiency,AttackDamage;
    private final Ingredient RepairMaterial;

    private ClayiumTier(int harvestlevel,int maxUses,float efficiency, float attackDamage, int enchantability, Ingredient repairMaterial){
        this.Harvestlevel = harvestlevel;
        this.MaxUses = maxUses;
        this.Efficiency =  efficiency;
        this.AttackDamage = attackDamage;
        this.Enchantability = enchantability;
        this.RepairMaterial = repairMaterial;
    }


    public int getMaxUses() {
        return this.MaxUses;
    }

    public float getEfficiency() {
        return this.Efficiency;
    }

    @Override
    public float getAttackDamage() {
        return this.AttackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return this.Harvestlevel;
    }

    @Override
    public int getEnchantability() {
        return this.Enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return this.RepairMaterial;
    }
}
