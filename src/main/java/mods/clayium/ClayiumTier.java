package mods.clayium;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

import java.util.function.Supplier;

public enum ClayiumTier implements IItemTier {

    CLAY(1, 400, 1.5F, 0.0F, 15,
            () -> Ingredient.fromItems(Items.CLAY,Items.CLAY_BALL)),
    DENSE_CLAY(2,600,3.0F,1.0F,30,
            () -> Ingredient.fromItems(Clayium.Items.DENSE_CLAY.get())),

    ;

    private final int MaxUses,Harvestlevel,Enchantability;
    private final float Efficiency,AttackDamage;
    private final LazyValue<Ingredient> RepairMaterial;

    ClayiumTier(int harvestlevel,int maxUses,float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial){
        this.Harvestlevel = harvestlevel;
        this.MaxUses = maxUses;
        this.Efficiency =  efficiency;
        this.AttackDamage = attackDamage;
        this.Enchantability = enchantability;
        this.RepairMaterial = new LazyValue<>(repairMaterial);
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
        return this.RepairMaterial.getValue();
    }
}
