package com.skyerzz.hypixellib.util.games.walls;

import com.skyerzz.hypixellib.Logger;
import com.skyerzz.hypixellib.util.item.Item;
import com.skyerzz.hypixellib.util.item.ItemStack;

import java.util.ArrayList;

/**
 * Created by sky on 12-9-2016.
 */
public enum BasicStarter {
    DWARVEN_SKILLS("Dwarven Skills", 1),
    GRAVE_DIGGER("Grave Digger", 1),
    HUNTER("HUNTER", 3),
    STONE_GUARDIAN("Stone Guardian", 1),
    MASTER_TROLL("Master Troll", 3),
    SAGE("Sage", 3),
    CHEF("Chef", 3),
    FARMER("Farmer", 1),
    REDSTONE_EXPERT("Redstone Expert", 3),
    WATCH_YOUR_STEP("Watch Your Step!", 1),
    TRAP_ENGINEER("Trap Engineer", 1),
    ESCAPIST("Escapist", 1),
    BLACKSMITH("Blacksmith", 1),
    SNACK_LOVER("Snack Lover", 3),
    GUITARIST("Guitarist", 3),
    READY_FOR_ANYTHING("Ready For Anything", 2),
    BACON("Bacon", 3),
    FISHERMAN("Fisherman", 3),
    BOMBERMAN("Bomberman", 3),
    CHEMIST("Chemist", 3),
    SMART_BOY("Smart Boy", 3),
    CANADIAN("Canadian", 1),
    NECROMANCER("Necromancer", 1),
    LAZY_MAN("Lazy Man", 2),
    ARTISAN("Artisan", 1),
    CATS_EYE("Cat's Eye", 1), //checked
    FIREPROOF("FireProof", 1);

    private String displayName;
    private int maxLevel;

    BasicStarter(String displayName, int maxLevel){
        this.displayName = displayName;
        this.maxLevel = maxLevel;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static java.util.ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(BasicStarter item: BasicStarter.values()){
            list.add(item.name());
        }
        return list;
    }

    public String getDisplayName() {
        return displayName;
    }

    public int getCost(int level){
        if(this.getMaxLevel() > level || level <= 0){
            return -1;
        }
        switch(level){
            case 1:
                switch(this){
                    case LAZY_MAN:
                        return 8400;
                    case FIREPROOF:
                        return 5500;
                    case DWARVEN_SKILLS:
                    case SAGE:
                    case BLACKSMITH:
                    case READY_FOR_ANYTHING:
                    case FISHERMAN:
                    case BOMBERMAN:
                    case CHEMIST:
                    case SMART_BOY:
                        return 2900;
                    case ARTISAN:
                        return 1590;
                    case GRAVE_DIGGER:
                    case STONE_GUARDIAN:
                    case MASTER_TROLL:
                    case BACON:
                    case CANADIAN:
                    case CATS_EYE:
                        return 1350;
                    case CHEF:
                    case FARMER:
                    case REDSTONE_EXPERT:
                    case WATCH_YOUR_STEP:
                    case TRAP_ENGINEER:
                    case ESCAPIST:
                    case SNACK_LOVER:
                    case GUITARIST:
                    case NECROMANCER:
                        return 350;
                }
                return -1;
            case 2:
                switch(this){
                    case LAZY_MAN:
                        return 13500;
                    case CHEMIST:
                        return 4600;
                    case SAGE:
                    case READY_FOR_ANYTHING:
                    case FISHERMAN:
                    case BOMBERMAN:
                    case SMART_BOY:
                        return 3400;
                    case HUNTER:
                    case MASTER_TROLL:
                    case BACON:
                        return 1950;
                    case REDSTONE_EXPERT:
                        return 1350;
                    case CHEF:
                        return 850;
                    case SNACK_LOVER:
                    case GUITARIST:
                        return 750;
                }
                return -1;
            case 3:
                switch(this){
                    case CHEMIST:
                        return 6600;
                    case SAGE:
                    case FISHERMAN:
                    case BOMBERMAN:
                    case SMART_BOY:
                        return 3900;
                    case HUNTER:
                    case MASTER_TROLL:
                    case REDSTONE_EXPERT:
                    case BACON:
                        return 2550;
                    case CHEF:
                    case SNACK_LOVER:
                    case GUITARIST:
                        return 1350;
                }

        }
        return -1;
    }

    public int getMaxLevel() {
        return maxLevel;
    }

    public ArrayList<ItemStack> getKitItems(int level){
        if(this.getMaxLevel() > level || level <= 0){
            return null;
        }
        ArrayList<ItemStack> kit = new ArrayList<>();
        switch(level) {
            case 1:
                //<editor-fold desc="[Level 1 kits]">
                switch (this) {
                    case DWARVEN_SKILLS:
                        kit.add(Item.woodenPick);
                        return kit;
                    case GRAVE_DIGGER:
                        kit.add(Item.woodenShovel);
                        return kit;
                    case HUNTER:
                        kit.add(new ItemStack(Item.arrow, 7));
                        return kit;
                    case STONE_GUARDIAN:
                        kit.add(Item.woodenSword);
                        return kit;
                    case MASTER_TROLL:
                        kit.add(new ItemStack(Item.cobweb, 7));
                        return kit;
                    case SAGE:
                        kit.add(Item.enchantmentTable);
                        return kit;
                    case CHEF:
                        kit.add(new ItemStack(Item.cake, 1));
                        return kit;
                    case FARMER:
                        kit.add(Item.stoneHoe);
                        return kit;
                    case REDSTONE_EXPERT:
                        kit.add(new ItemStack(Item.redstone, 15));
                        return kit;
                    case WATCH_YOUR_STEP:
                        kit.add(new ItemStack(Item.woodenPressurePlate, 6));
                        return kit;
                    case TRAP_ENGINEER:
                        kit.add(new ItemStack(Item.tripwireHook, 6));
                        return kit;
                    case ESCAPIST:
                        kit.add(new ItemStack(Item.ladder, 16));
                        return kit;
                    case BLACKSMITH:
                        kit.add(Item.anvil);
                        return kit;
                    case SNACK_LOVER:
                        kit.add(new ItemStack(Item.apple, 3));
                        return kit;
                    case GUITARIST:
                        kit.add(new ItemStack(Item.string, 6));
                        return kit;
                    case READY_FOR_ANYTHING:
                        kit.add(new ItemStack(Item.bucket, 1));
                        return kit;
                    case BACON:
                        kit.add(new ItemStack(Item.pigEgg, 1));
                        return kit;
                    case FISHERMAN:
                        kit.add(Item.fishingRod);
                        return kit;
                    case BOMBERMAN:
                        kit.add(new ItemStack(Item.TNT, 4));
                        return kit;
                    case CHEMIST:
                        kit.add(new ItemStack(Item.instantDamageSplashPotion1, 2));
                        return kit;
                    case SMART_BOY:
                        kit.add(new ItemStack(Item.expBottle, 1));
                        return kit;
                    case CANADIAN:
                        kit.add(Item.woodenAxe);
                        return kit;
                    case NECROMANCER:
                        kit.add(new ItemStack(Item.bone, 3));
                        return kit;
                    case LAZY_MAN:
                        kit.add(new ItemStack(Item.iron, 2));
                        return kit;
                    case ARTISAN:
                        kit.add(new ItemStack(Item.craftingTable, 1));
                        return kit;
                    case CATS_EYE:
                        kit.add(new ItemStack(Item.nightVisionSplashPotion1_300, 1));
                        return kit;
                    case FIREPROOF:
                        kit.add(new ItemStack(Item.fireResistanceSplashPotion1_60, 1));
                        return kit;
                }
                //</editor-fold>
                Logger.logError("[Games.Walls.BasicStarter] Starter not found for level 1! " + this.toString());
                return null;
            case 2:
                //<editor-fold desc="[Level 2 kits]">
                switch(this){
                    case HUNTER:
                        kit.add(new ItemStack(Item.arrow, 11));
                        return kit;
                    case MASTER_TROLL:
                        kit.add(new ItemStack(Item.cobweb, 11));
                        return kit;
                    case SAGE:
                        kit.add(Item.enchantmentTable);
                        kit.add(new ItemStack(Item.book, 1));
                        return kit;
                    case CHEF:
                        kit.add(new ItemStack(Item.cake, 1));
                        kit.add(new ItemStack(Item.bread, 1));
                        return kit;
                    case REDSTONE_EXPERT:
                        kit.add(new ItemStack(Item.redstone, 15));
                        kit.add(new ItemStack(Item.repeater, 12));
                        return kit;
                    case SNACK_LOVER:
                        kit.add(new ItemStack(Item.apple, 4));
                        return kit;
                    case GUITARIST:
                        kit.add(new ItemStack(Item.string, 9));
                        kit.add(new ItemStack(Item.stick, 3));
                        return kit;
                    case READY_FOR_ANYTHING:
                        kit.add(new ItemStack(Item.bucket, 2));
                        return kit;
                    case BACON:
                        kit.add(new ItemStack(Item.pigEgg, 1));
                        kit.add(Item.saddle);
                        return kit;
                    case FISHERMAN:
                        kit.add(Item.fishingRodLure3);
                        return kit;
                    case BOMBERMAN:
                        kit.add(new ItemStack(Item.TNT, 6));
                        return kit;
                    case CHEMIST:
                        kit.add(new ItemStack(Item.instantDamageSplashPotion1, 3));
                        return kit;
                    case SMART_BOY:
                        kit.add(new ItemStack(Item.expBottle, 2));
                        return kit;
                    case LAZY_MAN:
                        kit.add(new ItemStack(Item.iron, 3));
                        return kit;
                }
                //</editor-fold>
                Logger.logError("[Games.Walls.BasicStarter] Starter not found for level 2! " + this.toString());
                return null;
            case 3:
                //<editor-fold desc="[Level 3 kits]">
                switch(this){
                    case HUNTER:
                        kit.add(new ItemStack(Item.arrow, 15));
                        return kit;
                    case MASTER_TROLL:
                        kit.add(new ItemStack(Item.cobweb, 15));
                        return kit;
                    case SAGE:
                        kit.add(Item.enchantmentTable);
                        kit.add(new ItemStack(Item.book, 3));
                        return kit;
                    case CHEF:
                        kit.add(new ItemStack(Item.cake, 1));
                        kit.add(new ItemStack(Item.bread, 2));
                        return kit;
                    case REDSTONE_EXPERT:
                        kit.add(new ItemStack(Item.redstone, 15));
                        kit.add(new ItemStack(Item.repeater, 12));
                        kit.add(new ItemStack(Item.stickyPiston, 10));
                        return kit;
                    case SNACK_LOVER:
                        kit.add(new ItemStack(Item.apple, 5));
                        return kit;
                    case GUITARIST:
                        kit.add(new ItemStack(Item.string, 12));
                        kit.add(new ItemStack(Item.stick, 6));
                        return kit;
                    case BACON:
                        kit.add(new ItemStack(Item.pigEgg, 1));
                        kit.add(Item.saddle);
                        kit.add(Item.carrotOnAStick);
                        return kit;
                    case FISHERMAN:
                        kit.add(Item.fishingRodLure3Lots4);
                        return kit;
                    case BOMBERMAN:
                        kit.add(new ItemStack(Item.TNT, 8));
                        return kit;
                    case CHEMIST:
                        kit.add(new ItemStack(Item.instantDamageSplashPotion1, 4));
                        return kit;
                    case SMART_BOY:
                        kit.add(new ItemStack(Item.expBottle, 3));
                        return kit;
                }
                //</editor-fold>
                Logger.logError("[Games.Walls.BasicStarter] Starter not found for level 3! " + this.toString());
                return null;
        }
        Logger.logError("[Games.Walls.BasicStarter] Level not found! " + this.toString() + " Level: " + level);
        return null;
    }
}
