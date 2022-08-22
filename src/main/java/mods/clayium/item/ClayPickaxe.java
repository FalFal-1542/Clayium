package mods.clayium.item;

import mods.clayium.Clayium;
import mods.clayium.ClayiumTier;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.Rarity;

public class ClayPickaxe extends PickaxeItem {
    public ClayPickaxe() {
        super(ClayiumTier.DENCE_CLAY, 2, -2.0F, new Properties().group(Clayium.CLAYIUM_TAB).rarity(Rarity.COMMON));
    }
}
