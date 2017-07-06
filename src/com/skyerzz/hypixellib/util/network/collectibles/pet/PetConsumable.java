package com.skyerzz.hypixellib.util.network.collectibles.pet;

import java.util.ArrayList;

/**
 * Created by Skyerzz-LAPOTOP on 17/03/2017.
 */
public enum PetConsumable {
    APPLE("Apple", "A delicious fruit!", consumableType.FOOD),
    MELON("Melon", "contains seeds.", consumableType.FOOD),
    PUMPKIN_PIE("Pumpkin Pie", "Serving size: All of it.", consumableType.FOOD),
    CARROT_ITEM("Carrot", "Good for your eyesight!", consumableType.FOOD),
    BAKED_POTATO("Baked Potato", "Po-Tae-Toe Poe-Tah-Toe.", consumableType.FOOD),
    MUSHROOM_SOUP("Mushroom Soup", "This is NOT a Mooshroom Stew!", consumableType.FOOD),
    RED_ROSE("Flower", "Tastes as good as it smells!", consumableType.FOOD),
    HAY_BLOCK("Hay", "Haaaay there how's it goin'...", consumableType.FOOD),
    WHEAT("Wheat", "Not yet processed.", consumableType.FOOD),
    BREAD("Bread", "Freshly baked.", consumableType.FOOD),
    COOKIE("Cookie", "With chocolate chips!", consumableType.FOOD),
    CAKE("Cake", "This one is not a lie.", consumableType.FOOD),
    RAW_FISH("Raw Fish", "Caught by the local fisherman.", consumableType.FOOD),
    PORK("Raw Porkchop", "For those who like raw meat!", consumableType.FOOD),
    COOKED_BEEF("Angus Steak", "Well-prepared and seasoned.", consumableType.FOOD),
    BONE("Bone", "Dug out of the ground.", consumableType.FOOD),
    ROTTEN_FLESH("Rotten Flesh", "Eeewwww!", consumableType.FOOD),
    MAGMA_CREAM("Magma Cream", "WARNING: Intense heat!", consumableType.FOOD),

    WATER_BUCKET("Water", "Purified.", consumableType.DRINK),
    MILK_BUCKET("Milk", "Whole milk.", consumableType.DRINK),
    LAVA_BUCKET("Lava", "Very Hot!", consumableType.DRINK),

    STICK("Stick", "Wooden Stick", consumableType.TOY),
    SLIME_BALL("Ball", "Bounces and rolls!", consumableType.TOY),
    LEASH("Leash", "Let's go for a walk!", consumableType.TOY),
    FEATHER("Feather", "Tickle tickle!", consumableType.TOY),
    GOLD_RECORD("Frisbee", "FETCH!", consumableType.TOY),
    WOOD_SWORD("Sparring Sword", "En garde!", consumableType.TOY);

    private String displayName, lore;
    private consumableType type;

    PetConsumable(String displayName, String lore, consumableType type){
        this.displayName = displayName;
        this.lore = lore;
        this.type = type;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(PetConsumable item: PetConsumable.values()){
            list.add(item.name());
        }
        return list;
    }

    public String getDisplayName(){
        return displayName;
    }

    public String getLore(){
        return lore;
    }

    public consumableType getType(){
        return type;
    }




    public static PetConsumable getFromString(String consumable){
        consumable = consumable.toUpperCase().trim();
        if(mapping.contains(consumable)){
            return PetConsumable.valueOf(consumable);
        }
        return null;
    }

    public enum consumableType{
        FOOD("Hunger"),
        DRINK("Thirst"),
        TOY("Exercise");

        private String displayName;

        consumableType(String option){
            this.displayName = option;
        }

        public String getLore(){
            return "Increases a pet's " + displayName + " rating.";
        }
    }
}
