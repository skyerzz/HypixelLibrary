package com.skyerzz.hypixellib.util.games.arena;

import com.skyerzz.hypixellib.util.items.all.Item;
import com.skyerzz.hypixellib.util.items.all.ItemStack;

import java.util.ArrayList;

/**
 * Created by sky on 27-2-2017.
 */
public enum SWORD {
    WOOD("Wood Sword", Item.woodenSword),
    STONE("Stone Sword", Item.stoneSword),
    IRON("Iron Sword - DEFAULT", Item.ironSword),
    GOLD("Gold Sword", Item.goldSword),
    DIAMOND("Diamond Sword", Item.diamondSword),
    ENCHANTED_WOOD("Enchanted Wood Sword", Item.woodSwordProt1),
    ENCHANTED_STONE("Enchanted Stone Sword", Item.stoneSwordProt1),
    ENCHANTED_IRON("Enchanted Iron Sword", Item.ironSwordProt1),
    ENCHANTED_GOLD("Enchanted Gold Sword", Item.goldSwordProt1),
    ENCHANTED_DIAMOND("Enchanted Diamond Sword", Item.diamondSwordProt1);

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
