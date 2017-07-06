package com.skyerzz.hypixellib.util.network.collectibles;

import com.skyerzz.hypixellib.util.minecraft.MobType;
import com.skyerzz.hypixellib.util.network.collectibles.mysteryvault.ObtainType;
import com.skyerzz.hypixellib.util.network.collectibles.mysteryvault.Rarity;

import java.util.ArrayList;

/**
 * Created by Skyerzz-LAPOTOP on 17/03/2017.
 */
public enum Morph {
    PIG("Pog Morph", "squeal", 25, Rarity.RARE, MobType.PIG),
    COW("Cow Morph", "moo", 20, Rarity.RARE, MobType.COW),
    ENDERMAN("Enderman Morph", "teleport randomly", 60, Rarity.EPIC, MobType.ENDERMAN),
    CHICKEN("Chicken Morph", "lay eggs", 35, Rarity.EPIC, MobType.CHICKEN),
    SPIDER("Spider Morph", "shoot webs", 50, Rarity.EPIC, MobType.SPIDER),
    SHEEP("Sheep Morph", "Rainbow Sheep Mode", 50, Rarity.EPIC, MobType.SHEEP),
    SKELETON("Skeleton Morph", "shoot arrows", -1, Rarity.EPIC, MobType.SKELETON, ObtainType.HALLOWEEN_MYSTERY_BOX),
    GRINCH("Grinch", "throw coal", -1, Rarity.EPIC, MobType.HUMANENTITY, ObtainType.CHRISTMAS_MYSTERY_BOX),
    CREEPER("Creeper Morph",  "explode to knock nearby players away", 95, Rarity.LEGENDARY, MobType.CREEPER),
    BLAZE("Blaze Morph", "fireballs", 125, Rarity.LEGENDARY, MobType.BLAZE),
    ZOMBIE("Zombie Morph", "infect other players and turn them into a zombie", 105, Rarity.LEGENDARY, MobType.ZOMBIE),
    IRON_GOLEM("Iron Golem Morph",  "launch other players in the air", -1, Rarity.LEGENDARY, MobType.GOLEM, ObtainType.CRAFTED_MYSTERY_BOX_ONE),
    WITCH("Witch Morph", "throw special potions", -1, Rarity.LEGENDARY, MobType.WITCH, ObtainType.HALLOWEEN_MYSTERY_BOX),
    SNOW_MORPH("Snowman Morph", "throw snowballs", -1, Rarity.LEGENDARY, MobType.SNOWMAN, ObtainType.CHRISTMAS_MYSTERY_BOX),
    GUARDIAN("Guardian Morph", "shoot lasers", -1, Rarity.LEGENDARY, MobType.GUARDIAN, ObtainType.CRAFTED_MYSTERY_BOX_TWO);



    private String displayName, lore;
    private Rarity rarity;
    private int cost;
    private ObtainType type;
    private MobType mobType;

    Morph(String displayName, String lore, int cost, Rarity rarity, MobType type){
        this(displayName, lore, cost, rarity, type, ObtainType.DEFAULT_MYSTERY_BOX);
    }

    Morph(String displayName, String lore, int cost, Rarity rarity, MobType mobType, ObtainType type){
        this.displayName = displayName;
        this.rarity = rarity;
        this.lore = lore;
        this.cost = cost;
        this.type = type;
        this.mobType = mobType;
    }

    public String getDisplayName(){
        return displayName;
    }

    public Rarity getRarity(){
        return rarity;
    }

    public String getLore(){ return "Transform into a " + getDisplayName() + " for 5 minutes. While transformed, you can " + lore + " by right-clicking with the Slimeball item in your hotbar.";}


    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(Morph item: Morph.values()){
            list.add(item.name());
        }
        return list;
    }


    public static Morph getFromString(String morph){
        morph = morph.toUpperCase().replace("MORPH_", "");
        if(mapping.contains(morph)){
            return Morph.valueOf(morph);
        }
        return null;
    }
}
