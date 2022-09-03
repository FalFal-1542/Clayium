package mods.clayium.item.common;

import java.util.*;
import java.util.function.Consumer;

public enum ClayiumShape {
    //Tier1
    bearing("bearing","Bearing"),
    blade("blade","Blade"),
    cuttinghead("cuttinghead","Cutting Head"),
    cylinder("cylinder","Cylinder"),
    disc("disc","Disc"),
    dust("dust","Dust"),
    gear("gear","Gear"),
    grindinghead("grindinghead","Grinder Head"),
    large_ball("large_ball","Large Ball"),
    large_plate("large_plate","Large Plate"),
    needle("needle","Needle"),
    pipe("pipe","Pipe"),
    plate("plate","Plate"),
    ring("ring","Ring"),
    shard("shard","Shard"),
    short_stick("short_stick","Short Stick"),
    small_disc("small_disc","Small Disc"),
    small_ring("small_ring","Small Ring"),
    spindle("spindle","Spindle"),
    stick("stick","Stick"),
    waterwheel("waterwheel","Waterwheel"),

    block("block","Block"),
    ball("ball","ball"),
    ingot("ingot","Ingot","インゴット"),

;
    ClayiumShape(String name, String USName) {
        this(name,USName,"");
    }
    ClayiumShape(String name, String USName, String JPName) {
        this.name = name;
        this.USName = USName;
        this.JPName = JPName;
    }

    public String getName() {return name;}
    public String getJPName(){return JPName;}
    public String getUSName(){return USName;}

    private final String name;
    private final String JPName;
    private final String USName;


    public static final List<ClayiumShape> clayPartShapes = Arrays.asList(
            plate, stick, short_stick, ring, small_ring, gear, blade, needle, disc, small_disc,
            cylinder, pipe, large_ball, large_plate, grindinghead, bearing, spindle, cuttinghead, waterwheel,dust,shard);

    public static final List<ClayiumShape> metalPartShapes = Arrays.asList(
            plate, large_plate, block, dust, ingot, shard
    );
}