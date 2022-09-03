package mods.clayium.provider;


import mods.clayium.EnumUtil;
import mods.clayium.item.common.ClayiumMaterial;
import mods.clayium.item.common.ClayiumShape;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

import static mods.clayium.Clayium.Items.*;

public class ClayiumEnUsLanguageProvider extends LanguageProvider {
    public ClayiumEnUsLanguageProvider(DataGenerator gen, String modId) {
        super(gen, modId, "en_us");
    }

    @Override
    protected void addTranslations() {
        add("itemGroup.clayium", "Clayium"); //CreativeTab

        add(CLAY_SHOVEL.get(), "Clay Shovel");
        add(CLAY_PICKAXE.get(), "Clay Pickaxe");

        for(ClayiumShape resource: EnumUtil.RESOURCE_TYPES ){
            for(ClayiumMaterial Material : EnumUtil.PRIMARY_RESOURCES){
                add("item.clayium."+ Material.getName() + "_" +resource.getName(), Material.getODName() + " " + resource.getUSName());
            }
        }
        add(DENSE_CLAY.get(),"Dense Clay");
        add(TITANIUM_BLOCK.get(), "Block of Titanium");



    }
}