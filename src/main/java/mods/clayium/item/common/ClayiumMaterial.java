package mods.clayium.item.common;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public enum ClayiumMaterial {

    clay("clay", "Clay", 0,1,0),
    denseclay("denseclay","DenseClay",0,2,0),
;
    ClayiumMaterial(String name, String ODName, int Hex, int Tier, int layer) {
        this(name, ODName,Hex,Tier,0,1.0F);
    }

    ClayiumMaterial(String name, String ODName, int Hex,int Tier,int layer, float hardness) {
        this.name = name;
        this.ODName = ODName;
        this.Hex = Hex;
        this.hardness = hardness;
        this.Tier = Tier;
        this.layer = layer;
    }

    ClayiumMaterial(String name, String ODName, int Hex,int Tier,int layer, Consumer<ClayiumMaterial> cb) {
        this(name, ODName,Hex,Tier,layer);
        cb.accept(this);
    }

    ClayiumMaterial(String name, String ODName, int Hex ,int Tier,int layer, float hardness ,Consumer<ClayiumMaterial> cb) {
        this(name, ODName,Hex,Tier,layer, hardness);
        cb.accept(this);
    }


    public String getName() {
        return name;
    }
    public String getODName() {
        return ODName;
    }
    public float getHardness() {
        return hardness;
    }

    public int getColors() {
        return Hex;
    }
    public int getTier() {
        return Tier;
    }
    public int getLayer() {return layer;}

    public final String name;
    private final String ODName;
    private final float hardness;
    public final int Hex;
    private final int Tier;
    private final int layer;

    public static final List<ClayiumMaterial> Tier1 = Arrays.asList(
        clay
    );
    public static final List<ClayiumMaterial> Ingots = Arrays.asList(

    );
}
