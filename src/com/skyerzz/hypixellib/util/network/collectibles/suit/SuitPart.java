package com.skyerzz.hypixellib.util.network.collectibles.suit;

import com.skyerzz.hypixellib.util.network.collectibles.mysteryvault.ObtainType;
import com.skyerzz.hypixellib.util.network.collectibles.mysteryvault.Rarity;

import java.util.ArrayList;

/**
 * Created by sky on 4-7-2017.
 */
public enum SuitPart {
    FROG_HELMET(SuitType.FROG, SuitPartType.HELMET, 80, Rarity.LEGENDARY),
    FROG_CHESTPLATE(SuitType.FROG, SuitPartType.CHESTPLATE, 32, Rarity.EPIC),
    FROG_LEGGINGS(SuitType.FROG, SuitPartType.LEGGINGS, 18, Rarity.RARE),
    FROG_BOOTS(SuitType.FROG, SuitPartType.BOOTS, 7, Rarity.COMMON),
    NINJA_HELMET(SuitType.NINJA, SuitPartType.HELMET, 80, Rarity.LEGENDARY),
    NINJA_CHESTPLATE(SuitType.NINJA, SuitPartType.CHESTPLATE, 35, Rarity.EPIC),
    NINJA_LEGGINGS(SuitType.NINJA, SuitPartType.LEGGINGS, 20, Rarity.RARE),
    NINJA_BOOTS(SuitType.NINJA, SuitPartType.BOOTS, 10, Rarity.COMMON),
    FLASH_HELMET(SuitType.SPEEDSTER, SuitPartType.HELMET, 80, Rarity.LEGENDARY),
    FLASH_CHESTPLATE(SuitType.SPEEDSTER, SuitPartType.CHESTPLATE, 25, Rarity.EPIC),
    FLASH_LEGGINGS(SuitType.SPEEDSTER, SuitPartType.LEGGINGS, 13, Rarity.RARE),
    FLASH_BOOTS(SuitType.SPEEDSTER, SuitPartType.BOOTS, 5, Rarity.COMMON),
    GHOST_HELMET(SuitType.GHOSTLY_SKELETON, SuitPartType.HELMET, 80, Rarity.LEGENDARY),
    GHOST_CHESTPLATE(SuitType.GHOSTLY_SKELETON, SuitPartType.CHESTPLATE, 25, Rarity.EPIC),
    GHOST_LEGGINGS(SuitType.GHOSTLY_SKELETON, SuitPartType.LEGGINGS, 13, Rarity.RARE),
    GHOST_BOOTS(SuitType.GHOSTLY_SKELETON, SuitPartType.BOOTS, 5, Rarity.COMMON),
    DISCO_HELMET(SuitType.DISCO, SuitPartType.HELMET, 70, Rarity.LEGENDARY),
    DISCO_CHESTPLATE(SuitType.DISCO, SuitPartType.CHESTPLATE, 30, Rarity.EPIC),
    DISCO_LEGGINGS(SuitType.DISCO, SuitPartType.LEGGINGS, 16, Rarity.RARE),
    DISCO_BOOTS(SuitType.DISCO, SuitPartType.BOOTS, 6, Rarity.COMMON),
    MERMAID_HELMET(SuitType.MERMAID, SuitPartType.HELMET, 70, Rarity.LEGENDARY),
    MERMAID_CHESTPLATE(SuitType.MERMAID, SuitPartType.CHESTPLATE, 30, Rarity.EPIC),
    MERMAID_LEGGINGS(SuitType.MERMAID, SuitPartType.LEGGINGS, 16, Rarity.RARE),
    MERMAID_BOOTS(SuitType.MERMAID, SuitPartType.BOOTS, 6, Rarity.COMMON),
    SPIDERMAN_HELMET(SuitType.SPOODERMAN, SuitPartType.HELMET, 75, Rarity.LEGENDARY),
    SPIDERMAN_CHESTPLATE(SuitType.SPOODERMAN, SuitPartType.CHESTPLATE, 33, Rarity.EPIC),
    SPIDERMAN_LEGGINGS(SuitType.SPOODERMAN, SuitPartType.LEGGINGS, 17, Rarity.RARE),
    SPIDERMAN_BOOTS(SuitType.SPOODERMAN, SuitPartType.BOOTS, 8, Rarity.COMMON),
    WARRIOR_HELMET(SuitType.WARRIOR, SuitPartType.HELMET, 75, Rarity.LEGENDARY),
    WARRIOR_CHESTPLATE(SuitType.WARRIOR, SuitPartType.CHESTPLATE, 30, Rarity.EPIC),
    WARRIOR_LEGGINGS(SuitType.WARRIOR, SuitPartType.LEGGINGS, 16, Rarity.RARE),
    WARRIOR_BOOTS(SuitType.WARRIOR, SuitPartType.BOOTS, 6, Rarity.COMMON),
    NECROMANCER_HELMET(SuitType.NECROMANCER, SuitPartType.HELMET, 80, Rarity.LEGENDARY),
    NECROMANCER_CHESTPLATE(SuitType.NECROMANCER, SuitPartType.CHESTPLATE, 35, Rarity.EPIC),
    NECROMANCER_LEGGINGS(SuitType.NECROMANCER, SuitPartType.LEGGINGS, 20, Rarity.RARE),
    NECROMANCER_BOOTS(SuitType.NECROMANCER, SuitPartType.BOOTS, 10, Rarity.COMMON),
    THOR_HELMET(SuitType.THOR, SuitPartType.HELMET, 70, Rarity.LEGENDARY),
    THOR_CHESTPLATE(SuitType.THOR, SuitPartType.CHESTPLATE, 25, Rarity.EPIC),
    THOR_LEGGINGS(SuitType.THOR, SuitPartType.LEGGINGS, 13, Rarity.RARE),
    THOR_BOOTS(SuitType.THOR, SuitPartType.BOOTS, 5, Rarity.COMMON),
    DEATH_ANGEL_HELMET(SuitType.DEATH_ANGEL, SuitPartType.HELMET, 75, Rarity.LEGENDARY),
    DEATH_ANGEL_CHESTPLATE(SuitType.DEATH_ANGEL, SuitPartType.CHESTPLATE, 30, Rarity.EPIC),
    DEATH_ANGEL_LEGGINGS(SuitType.DEATH_ANGEL, SuitPartType.LEGGINGS, 16, Rarity.RARE),
    DEATH_ANGEL_BOOTS(SuitType.DEATH_ANGEL, SuitPartType.BOOTS, 6, Rarity.COMMON),
    BAKER_HELMET(SuitType.BAKER, SuitPartType.HELMET, 70, Rarity.LEGENDARY),
    BAKER_CHESTPLATE(SuitType.BAKER, SuitPartType.CHESTPLATE, 25, Rarity.EPIC),
    BAKER_LEGGINGS(SuitType.BAKER, SuitPartType.LEGGINGS, 13, Rarity.RARE),
    BAKER_BOOTS(SuitType.BAKER, SuitPartType.BOOTS, 5, Rarity.COMMON),
    BUMBLEBEE_HELMET(SuitType.BUMBLEBEE, SuitPartType.HELMET, 70, Rarity.LEGENDARY),
    BUMBLEBEE_CHESTPLATE(SuitType.BUMBLEBEE, SuitPartType.CHESTPLATE, 25, Rarity.EPIC),
    BUMBLEBEE_LEGGINGS(SuitType.BUMBLEBEE, SuitPartType.LEGGINGS, 13, Rarity.RARE),
    BUMBLEBEE_BOOTS(SuitType.BUMBLEBEE, SuitPartType.BOOTS, 5, Rarity.COMMON),
    FIREMAN_HELMET(SuitType.FIREFIGHTER, SuitPartType.HELMET, 80, Rarity.LEGENDARY),
    FIREMAN_CHESTPLATE(SuitType.FIREFIGHTER, SuitPartType.CHESTPLATE, 34, Rarity.EPIC),
    FIREMAN_LEGGINGS(SuitType.FIREFIGHTER, SuitPartType.LEGGINGS, 19, Rarity.RARE),
    FIREMAN_BOOTS(SuitType.FIREFIGHTER, SuitPartType.BOOTS, 9, Rarity.COMMON),
    PLUMBER_HELMET(SuitType.PLUMBER, SuitPartType.HELMET, 73, Rarity.LEGENDARY),
    PLUMBER_CHESTPLATE(SuitType.PLUMBER, SuitPartType.CHESTPLATE, 32, Rarity.EPIC),
    PLUMBER_LEGGINGS(SuitType.PLUMBER, SuitPartType.LEGGINGS, 18, Rarity.RARE),
    PLUMBER_BOOTS(SuitType.PLUMBER, SuitPartType.BOOTS, 7, Rarity.COMMON),
    ARCTIC_HELMET(SuitType.ICE_WALKER, SuitPartType.HELMET, 70, Rarity.LEGENDARY),
    ARCTIC_CHESTPLATE(SuitType.ICE_WALKER, SuitPartType.CHESTPLATE, 25, Rarity.EPIC),
    ARCTIC_LEGGINGS(SuitType.ICE_WALKER, SuitPartType.LEGGINGS, 13, Rarity.RARE),
    ARCTIC_BOOTS(SuitType.ICE_WALKER, SuitPartType.BOOTS, 6, Rarity.COMMON), //todo check cost
    
    VAMPIRE_HELMET(SuitType.VAMPIRE, SuitPartType.HELMET, Rarity.LEGENDARY, ObtainType.HALLOWEEN_MYSTERY_BOX),
    VAMPIRE_CHESTPLATE(SuitType.VAMPIRE, SuitPartType.CHESTPLATE, Rarity.EPIC, ObtainType.HALLOWEEN_MYSTERY_BOX),
    VAMPIRE_LEGGINGS(SuitType.VAMPIRE, SuitPartType.LEGGINGS,  Rarity.EPIC, ObtainType.HALLOWEEN_MYSTERY_BOX),
    VAMPIRE_BOOTS(SuitType.VAMPIRE, SuitPartType.BOOTS, Rarity.RARE, ObtainType.HALLOWEEN_MYSTERY_BOX),
    DRAGON_BREATH_HELMET(SuitType.DRAGON_BREATH, SuitPartType.HELMET, Rarity.LEGENDARY, ObtainType.SUMMER_MYSTERY_BOX),
    DRAGON_BREATH_CHESTPLATE(SuitType.DRAGON_BREATH, SuitPartType.CHESTPLATE, Rarity.EPIC, ObtainType.SUMMER_MYSTERY_BOX),
    DRAGON_BREATH_LEGGINGS(SuitType.DRAGON_BREATH, SuitPartType.LEGGINGS,  Rarity.EPIC, ObtainType.SUMMER_MYSTERY_BOX),
    DRAGON_BREATH_BOOTS(SuitType.DRAGON_BREATH, SuitPartType.BOOTS, Rarity.RARE, ObtainType.SUMMER_MYSTERY_BOX),
    PIRATE_HELMET(SuitType.PIRATE, SuitPartType.HELMET, Rarity.LEGENDARY, ObtainType.SUMMER_MYSTERY_BOX),
    PIRATE_CHESTPLATE(SuitType.PIRATE, SuitPartType.CHESTPLATE, Rarity.EPIC, ObtainType.SUMMER_MYSTERY_BOX),
    PIRATE_LEGGINGS(SuitType.PIRATE, SuitPartType.LEGGINGS,  Rarity.EPIC, ObtainType.SUMMER_MYSTERY_BOX),
    PIRATE_BOOTS(SuitType.PIRATE, SuitPartType.BOOTS, Rarity.RARE, ObtainType.SUMMER_MYSTERY_BOX),
    TNT_HELMET(SuitType.TNT, SuitPartType.HELMET, Rarity.LEGENDARY, ObtainType.SUMMER_MYSTERY_BOX),
    TNT_CHESTPLATE(SuitType.TNT, SuitPartType.CHESTPLATE, Rarity.EPIC, ObtainType.SUMMER_MYSTERY_BOX),
    TNT_LEGGINGS(SuitType.TNT, SuitPartType.LEGGINGS,  Rarity.EPIC, ObtainType.SUMMER_MYSTERY_BOX),
    TNT_BOOTS(SuitType.TNT, SuitPartType.BOOTS, Rarity.RARE, ObtainType.SUMMER_MYSTERY_BOX),
    WOLF_HELMET(SuitType.WOLF_PRINCESS, SuitPartType.HELMET, Rarity.LEGENDARY, ObtainType.SUMMER_MYSTERY_BOX),
    WOLF_CHESTPLATE(SuitType.WOLF_PRINCESS, SuitPartType.CHESTPLATE, Rarity.EPIC, ObtainType.SUMMER_MYSTERY_BOX),
    WOLF_LEGGINGS(SuitType.WOLF_PRINCESS, SuitPartType.LEGGINGS,  Rarity.EPIC, ObtainType.SUMMER_MYSTERY_BOX),
    WOLF_BOOTS(SuitType.WOLF_PRINCESS, SuitPartType.BOOTS, Rarity.RARE, ObtainType.SUMMER_MYSTERY_BOX),
    SOLAR_HELMET(SuitType.SOLAR_POWER, SuitPartType.HELMET, Rarity.LEGENDARY, ObtainType.SUMMER_MYSTERY_BOX),
    SOLAR_CHESTPLATE(SuitType.SOLAR_POWER, SuitPartType.CHESTPLATE, Rarity.EPIC, ObtainType.SUMMER_MYSTERY_BOX),
    SOLAR_LEGGINGS(SuitType.SOLAR_POWER, SuitPartType.LEGGINGS,  Rarity.EPIC, ObtainType.SUMMER_MYSTERY_BOX),
    SOLAR_BOOTS(SuitType.SOLAR_POWER, SuitPartType.BOOTS, Rarity.RARE, ObtainType.SUMMER_MYSTERY_BOX),
    SOCCER_HELMET(SuitType.SOCCER, SuitPartType.HELMET, Rarity.LEGENDARY, ObtainType.SUMMER_MYSTERY_BOX),
    SOCCER_CHESTPLATE(SuitType.SOCCER, SuitPartType.CHESTPLATE, Rarity.EPIC, ObtainType.SUMMER_MYSTERY_BOX),
    SOCCER_LEGGINGS(SuitType.SOCCER, SuitPartType.LEGGINGS,  Rarity.EPIC, ObtainType.SUMMER_MYSTERY_BOX),
    SOCCER_BOOTS(SuitType.SOCCER, SuitPartType.BOOTS, Rarity.RARE, ObtainType.SUMMER_MYSTERY_BOX),
    SANTA_HELMET(SuitType.SANTA, SuitPartType.HELMET, Rarity.LEGENDARY, ObtainType.CHRISTMAS_MYSTERY_BOX),
    SANTA_CHESTPLATE(SuitType.SANTA, SuitPartType.CHESTPLATE, Rarity.EPIC, ObtainType.CHRISTMAS_MYSTERY_BOX),
    SANTA_LEGGINGS(SuitType.SANTA, SuitPartType.LEGGINGS,  Rarity.EPIC, ObtainType.CHRISTMAS_MYSTERY_BOX),
    SANTA_BOOTS(SuitType.SANTA, SuitPartType.BOOTS, Rarity.RARE, ObtainType.CHRISTMAS_MYSTERY_BOX),
    TOY_HELMET(SuitType.TOY_SOLDIER, SuitPartType.HELMET, Rarity.LEGENDARY, ObtainType.CHRISTMAS_MYSTERY_BOX),
    TOY_CHESTPLATE(SuitType.TOY_SOLDIER, SuitPartType.CHESTPLATE, Rarity.EPIC, ObtainType.CHRISTMAS_MYSTERY_BOX),
    TOY_LEGGINGS(SuitType.TOY_SOLDIER, SuitPartType.LEGGINGS,  Rarity.EPIC, ObtainType.CHRISTMAS_MYSTERY_BOX),
    TOY_BOOTS(SuitType.TOY_SOLDIER, SuitPartType.BOOTS, Rarity.RARE, ObtainType.CHRISTMAS_MYSTERY_BOX),
    GIFTER_HELMET(SuitType.SURPRISE_GIFT, SuitPartType.HELMET, Rarity.LEGENDARY, ObtainType.FIFTY_GIFTS_SENT),
    GIFTER_CHESTPLATE(SuitType.SURPRISE_GIFT, SuitPartType.CHESTPLATE, Rarity.LEGENDARY, ObtainType.FIFTY_GIFTS_SENT),
    GIFTER_LEGGINGS(SuitType.SURPRISE_GIFT, SuitPartType.LEGGINGS,  Rarity.LEGENDARY, ObtainType.FIFTY_GIFTS_SENT),
    GIFTER_BOOTS(SuitType.SURPRISE_GIFT, SuitPartType.BOOTS, Rarity.LEGENDARY, ObtainType.FIFTY_GIFTS_SENT),
    TREASURE_HELMET(SuitType.TREASURE_HUNTER, SuitPartType.HELMET, Rarity.LEGENDARY, ObtainType.REWARD_CARD),
    TREASURE_CHESTPLATE(SuitType.TREASURE_HUNTER, SuitPartType.CHESTPLATE, Rarity.EPIC, ObtainType.REWARD_CARD),
    TREASURE_LEGGINGS(SuitType.TREASURE_HUNTER, SuitPartType.LEGGINGS,  Rarity.EPIC, ObtainType.REWARD_CARD),
    TREASURE_BOOTS(SuitType.TREASURE_HUNTER, SuitPartType.BOOTS, Rarity.RARE, ObtainType.REWARD_CARD),
    COSTUME_HELMET(SuitType.COSTUME, SuitPartType.HELMET, Rarity.LEGENDARY, ObtainType.HALLOWEEN_MYSTERY_BOX),
    COSTUME_CHESTPLATE(SuitType.COSTUME, SuitPartType.CHESTPLATE, Rarity.EPIC, ObtainType.HALLOWEEN_MYSTERY_BOX),
    COSTUME_LEGGINGS(SuitType.COSTUME, SuitPartType.LEGGINGS,  Rarity.EPIC, ObtainType.HALLOWEEN_MYSTERY_BOX),
    COSTUME_BOOTS(SuitType.COSTUME, SuitPartType.BOOTS, Rarity.RARE, ObtainType.HALLOWEEN_MYSTERY_BOX),
    NEW_YEARS_HELMET(SuitType.NEW_YEAR, SuitPartType.HELMET, Rarity.LEGENDARY, ObtainType.CHRISTMAS_MYSTERY_BOX),
    NEW_YEARS_CHESTPLATE(SuitType.NEW_YEAR, SuitPartType.CHESTPLATE, Rarity.EPIC, ObtainType.CHRISTMAS_MYSTERY_BOX),
    NEW_YEARS_LEGGINGS(SuitType.NEW_YEAR, SuitPartType.LEGGINGS,  Rarity.EPIC, ObtainType.CHRISTMAS_MYSTERY_BOX),
    NEW_YEARS_BOOTS(SuitType.NEW_YEAR, SuitPartType.BOOTS, Rarity.RARE, ObtainType.CHRISTMAS_MYSTERY_BOX),
    GRINCH_HELMET(SuitType.GRINCH, SuitPartType.HELMET, Rarity.LEGENDARY, ObtainType.CHRISTMAS_MYSTERY_BOX),
    GRINCH_CHESTPLATE(SuitType.GRINCH, SuitPartType.CHESTPLATE, Rarity.EPIC, ObtainType.CHRISTMAS_MYSTERY_BOX),
    GRINCH_LEGGINGS(SuitType.GRINCH, SuitPartType.LEGGINGS,  Rarity.EPIC, ObtainType.CHRISTMAS_MYSTERY_BOX),
    GRINCH_BOOTS(SuitType.GRINCH, SuitPartType.BOOTS, Rarity.RARE, ObtainType.CHRISTMAS_MYSTERY_BOX);

    private SuitType suitType;
    private SuitPartType partType;
    private int mysteryDustCost;
    private Rarity rarity;
    private ObtainType obtainType;

    SuitPart(SuitType parent, SuitPartType type, int mysteryDustCost, Rarity rarity, ObtainType obtainType){
        this.suitType = parent;
        this.partType = type;
        this.mysteryDustCost = mysteryDustCost;
        this.rarity = rarity;
        this.obtainType = obtainType;
    }

    SuitPart(SuitType parent, SuitPartType type, int mysteryDustCost, Rarity rarity){
        this(parent, type, mysteryDustCost, rarity, ObtainType.DEFAULT_MYSTERY_BOX);
    }

    SuitPart(SuitType parent, SuitPartType type, Rarity rarity, ObtainType obtainType){
        this(parent, type, -1, rarity, obtainType);
    }


    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(SuitPart item: SuitPart.values()){
            list.add(item.name());
        }
        return list;
    }

    public static SuitPart getFromString(String suit){
        suit = suit.toUpperCase().trim().replace("SUIT_", "").replace("OUTFIT_", ""); //outfit = legacy
        if(mapping.contains(suit)){
            return SuitPart.valueOf(suit);
        }
        return null;
    }

    public SuitPartType getPartType(){ return partType;}

    public SuitType getSuitType(){ return suitType;}


}
