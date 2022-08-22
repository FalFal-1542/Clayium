package mods.clayium.item;

import mods.clayium.Clayium;
import mods.clayium.ClayiumTier;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.*;

import java.util.Set;

public class ClayShovel extends ShovelItem {

    public ClayShovel() {
        super(ClayiumTier.CLAY, 1, -3.0F, new Properties().group(Clayium.CLAYIUM_TAB).rarity(Rarity.UNCOMMON));
    }
/*
    @Override
    public float getDestroySpeed(ItemStack stack, IBlockState state) {
        if (state.getMaterial() == Material.CLAY)
            return efficiencyOnClayBlocks;
        if (state.getBlock() == ClayiumBlocks.clayOre
                || state.getBlock() == ClayiumBlocks.denseClayOre
                || state.getBlock() == ClayiumBlocks.largeDenseClayOre)
            return efficiencyOnClayOre;
        return super.getDestroySpeed(stack, state);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World player, List<String> tooltip, ITooltipFlag advanced) {
        UtilLocale.localizeTooltip(tooltip, getUnlocalizedName());
    }

    protected float efficiencyOnClayBlocks = 32F;
    private float efficiencyOnClayOre = 12F;

 */
}
