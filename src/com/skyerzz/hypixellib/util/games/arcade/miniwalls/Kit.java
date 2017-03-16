package com.skyerzz.hypixellib.util.games.arcade.miniwalls;

import com.skyerzz.hypixellib.util.item.Item;
import com.skyerzz.hypixellib.util.item.ItemStack;
import com.skyerzz.hypixellib.util.item.Material;

import java.util.ArrayList;

/**
 * Created by sky on 8-9-2016.
 */
public enum Kit {
    SOLDIER(new ItemStack(new Item(Material.STONE_SWORD)),
            new ItemStack(new Item(Material.STONE_PICKAXE)),
            new ItemStack(new Item(Material.WOOD_AXE)),
            new ItemStack(new Item(Material.WOOL), 10)),
    ARCHER( new ItemStack(new Item(Material.WOOD_SWORD)),
            new ItemStack(new Item(Material.STONE_PICKAXE)),
            new ItemStack(new Item(Material.WOOD_AXE)),
            new ItemStack(new Item(Material.WOOL), 10)),
    BUILDER(new ItemStack(new Item(Material.WOOD_SWORD)),
            new ItemStack(new Item(Material.IRON_PICKAXE)),
            new ItemStack(new Item(Material.STONE_AXE)),
            new ItemStack(new Item(Material.WOOL), 20));

    private ArrayList<ItemStack> kitItems;

    Kit(ItemStack...stack){
        ArrayList<ItemStack> list = new ArrayList<>();
        for(ItemStack s: stack){
            list.add(s);
        }
        this.kitItems = list;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(Kit item: Kit.values()){
            list.add(item.name());
        }
        return list;
    }

    public ArrayList<ItemStack> getKitItems(){
        return this.kitItems;
    }

    public int getHeartsOnKill(){
        switch(this){
            case ARCHER:
            case SOLDIER:
                return 3;
            case BUILDER:
                return 4;
        }
        return -1;
    }

    public int getMaxArrowCount(){
        switch(this){
            case SOLDIER:
            case BUILDER:
                return 2;
            case ARCHER:
                return 4;
        }
        return -1;
    }

    public int getArrowRegenerationSeconds(){
        switch(this){
            case SOLDIER:
            case BUILDER:
                return 8;
            case ARCHER:
                return 4;
        }
        return -1;
    }
}
