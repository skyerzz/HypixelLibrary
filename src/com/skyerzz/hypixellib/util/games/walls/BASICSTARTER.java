package com.skyerzz.hypixellib.util.games.walls;

import com.skyerzz.hypixellib.util.RANKTYPE;
import com.skyerzz.hypixellib.util.items.all.Item;
import com.skyerzz.hypixellib.util.items.all.ItemStack;
import com.skyerzz.hypixellib.util.items.all.Material;

import java.util.ArrayList;

/**
 * Created by sky on 12-9-2016.
 */
public enum BASICSTARTER {
    //todo check each where maxlevel==0;
    //todo check prizes. EDIT: PRIZES DONT MAKE SENSE (//checked = confirmed price and maxlevel;)
    //Sage level 2: 3400, level3: 3900
    //Guitarist level 2: 750, level3: 1350
    //Cats eye level 1: 1350
    //escapist level 1: 350
    DWARVEN_SKILLS("Dwarven Skills", 0),
    GRAVE_DIGGER("Grave Digger", 0),
    HUNTER("HUNTER", 3),
    STONE_GUARDIAN("Stone Guardian", 0),
    MASTER_TROLL("Master Troll", 0),
    SAGE("Sage", 3),
    CHEF("Chef", 0),
    FARMER("Farmer", 0),
    REDSTONE_EXPERT("Redstone Expert", 0),
    WATCH_YOUR_STEP("Watch Your Step!", 0),
    TRAP_ENGINEER("Trap Engineer", 0),
    ESCAPIST("Escapist", 1),//checked
    BLACKSMITH("Blacksmith", 1), //checked
    SNACK_LOVER("Snack Lover", 0),
    GUITARIST("Guitarist", 0),
    READY_FOR_ANYTHING("Ready For Anything", 0),
    BACON("Bacon", 0),
    FISHERMAN("Fisherman", 0),
    BOMBERMAN("Bomberman", 0),
    CHEMIST("Chemist", 0),
    SMART_BOY("Smart Boy", 3),
    CANADIAN("Canadian", 0),
    NECROMANCER("Necromancer", 0),
    LAZY_MAN("Lazy Man", 0),
    ARTISAN("Artisan", 0),
    CATS_EYE("Cat's Eye", 1), //checked
    FIREPROOF("FireProof", 0);

    private String displayName;
    private int maxLevel;
    private ArrayList<ItemStack>[] kitItems;

    BASICSTARTER(String displayName, int maxLevel){
        this.displayName = displayName;
        this.maxLevel = maxLevel;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static java.util.ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(BASICSTARTER item: BASICSTARTER.values()){
            list.add(item.name());
        }
        return list;
    }

    public String getDisplayName() {
        return displayName;
    }

    public int getCost(int level){
        if(this.getMaxLevel() > level || level < 0){
            return -1;
        }
        //todo implement
        switch(this){

        }
        return -1;
    }

    public int getMaxLevel() {
        return maxLevel;
    }

    private ArrayList<ItemStack> getKitItems(int level){
        if(this.getMaxLevel() > level || level < 0){
            return null;
        }
        ArrayList<ItemStack> kitItems = new ArrayList<>();
        switch(this){
            case DWARVEN_SKILLS:
                kitItems.add(new ItemStack(new Item(Material.WOOD_PICKAXE)));
                break;

        }
        return kitItems;
    }
}
