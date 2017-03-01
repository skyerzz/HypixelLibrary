package com.skyerzz.hypixellib.util.games.arena;

import com.skyerzz.hypixellib.util.items.all.Item;
import com.skyerzz.hypixellib.util.items.all.ItemStack;

import java.util.ArrayList;

/**
 * Created by sky on 27-2-2017.
 */
public enum SWORD {
    WOOD_SWORD("Wood Sword", Item.woodenSword),
    STONE_SWORD("Stone Sword", Item.stoneSword),
    IRON_SWORD("Iron Sword - DEFAULT", Item.ironSword),
    GOLD_SWORD("Gold Sword", Item.goldSword),
    DIAMOND_SWORD("Diamond Sword", Item.diamondSword),
    ENCHANTED_WOOD_SWORD("Enchanted Wood Sword", Item.woodSwordProt1),
    ENCHANTED_STONE_SWORD("Enchanted Stone Sword", Item.stoneSwordProt1),
    ENCHANTED_IRON_SWORD("Enchanted Iron Sword", Item.ironSwordProt1),
    ENCHANTED_GOLD_SWORD("Enchanted Gold Sword", Item.goldSwordProt1),
    ENCHANTED_DIAMOND_SWORD("Enchanted Diamond Sword", Item.diamondSwordProt1);

    private String name;
    private ItemStack swordItem;

    SWORD(String name, ItemStack swordItem){
        this.name = name;
        this.swordItem = swordItem;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static java.util.ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(SWORD item: SWORD.values()){
            list.add(item.name());
        }
        return list;
    }

    private String getName(){
        return name;
    }

    private ItemStack getSword(){
        return swordItem;
    }
}
