package com.skyerzz.hypixellib.util.games.skywars;

import com.skyerzz.hypixellib.util.CURRENCY;
import com.skyerzz.hypixellib.util.item.Item;
import com.skyerzz.hypixellib.util.item.ItemStack;
import com.skyerzz.hypixellib.util.item.Material;

import java.util.ArrayList;

/**
 * Created by Skyerzz-LAPOTOP on 21/12/2016.
 */
public enum RANKED_KIT {
    DEFAULT("Default"),
    ARMORER("Armorer"),
    ATHLETE("Athlete"),
    BLACKSMITH("Blacksmith"),
    BOWMAN("Bowman"),
    CHAMPION("Champion"),
    HEALER("Healer"),
    MAGICIAN("MAgician"),
    PYROMANCER("Pyromancer"),
    SCOUT("Scout");


    private String displayName;

    RANKED_KIT(String displayName){
        this.displayName = displayName;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(RANKED_KIT item: RANKED_KIT.values()){
            list.add(item.name());
        }
        return list;
    }

    public String getDisplayName(){
        return displayName;
    }

    public int getCost(int level){
        switch(level){
            case 1:
                return 15000;
            case 2:
                return 25000;
            case 3:
                return 50000;
            case 4:
                return 100000;
            case 5:
                return 250000;
        }
        return -1;
    }

    public CURRENCY getCurrencyType(){ return CURRENCY.COINS; }

    public int getMaxLevel(){ return 5; }

    public ArrayList<ItemStack> getKitItems(int level){
        if(level < 0 || level > 5){
            return null;
        }
        ArrayList<ItemStack> kit = new ArrayList<>();
        switch(this){
            //<editor-fold desc="[Armorer]">
            case ARMORER:
                switch(level){
                    case 1:
                        kit.add(Item.ironChestProt1);
                        kit.add(Item.ironBootsProt1);
                        kit.add(Item.ironPick);
                        kit.add(Item.ironAxe);
                        kit.add(Item.ironHelmet);
                        kit.add(Item.ironLeggings);
                        return kit;
                    case 2:
                        kit.add(Item.ironChestProt2);
                        kit.add(Item.ironBootsProt2);
                        kit.add(Item.ironPick);
                        kit.add(Item.ironAxe);
                        kit.add(Item.ironHelmet);
                        kit.add(Item.ironLeggings);
                        return kit;
                    case 3:
                        kit.add(Item.diamondChest);
                        kit.add(Item.ironBootsProt2);
                        kit.add(Item.ironPick);
                        kit.add(Item.ironAxe);
                        kit.add(Item.ironHelmet);
                        kit.add(Item.ironLeggings);
                        return kit;
                    case 4:
                        kit.add(Item.diamondChest);
                        kit.add(Item.diamondBoots);
                        kit.add(Item.ironPick);
                        kit.add(Item.ironAxe);
                        kit.add(Item.ironHelmet);
                        kit.add(Item.ironLeggings);
                        return kit;
                    case 5:
                        kit.add(Item.diamondChestProt1);
                        kit.add(Item.diamondBootsProt1);
                        kit.add(Item.ironPick);
                        kit.add(Item.ironAxe);
                        kit.add(Item.ironHelmet);
                        kit.add(Item.ironLeggings);
                        return kit;
                }
            //</editor-fold>

            //<editor-fold desc="[Athlete]">
            case ATHLETE:
                switch(level){
                    case 1:
                        kit.add(Item.waterBucket);
                        kit.add(Item.diamondSword);
                        kit.add(Item.fishingRod);
                        kit.add(Item.ironAxe);
                        kit.add(Item.ironPick);
                        kit.add(Item.ironHelmet);
                        kit.add(Item.ironChest);
                        kit.add(Item.ironLeggings);
                        kit.add(Item.ironBoots);
                        return kit;
                    case 2:
                        kit.add(new ItemStack(Item.strengthPotionCustom20PC_45, 1));
                        kit.add(Item.waterBucket);
                        kit.add(Item.diamondSword);
                        kit.add(Item.fishingRod);
                        kit.add(Item.ironAxe);
                        kit.add(Item.ironPick);
                        kit.add(Item.ironHelmet);
                        kit.add(Item.ironChest);
                        kit.add(Item.ironLeggings);
                        kit.add(Item.ironBoots);
                        return kit;
                    case 3:
                        kit.add(new ItemStack(Item.speedSplashPotion3_4, 1));
                        kit.add(new ItemStack(Item.strengthPotionCustom20PC_45, 1));
                        kit.add(Item.waterBucket);
                        kit.add(Item.diamondSword);
                        kit.add(Item.fishingRod);
                        kit.add(Item.ironAxe);
                        kit.add(Item.ironPick);
                        kit.add(Item.ironHelmet);
                        kit.add(Item.ironChest);
                        kit.add(Item.ironLeggings);
                        kit.add(Item.ironBoots);
                        return kit;
                    case 4:
                        kit.add(new ItemStack(Item.goldenApple, 1));
                        kit.add(new ItemStack(Item.speedSplashPotion3_4, 1));
                        kit.add(new ItemStack(Item.strengthPotionCustom20PC_60, 1));
                        kit.add(Item.waterBucket);
                        kit.add(Item.diamondSword);
                        kit.add(Item.fishingRod);
                        kit.add(Item.ironAxe);
                        kit.add(Item.ironPick);
                        kit.add(Item.ironHelmet);
                        kit.add(Item.ironChest);
                        kit.add(Item.ironLeggings);
                        kit.add(Item.ironBoots);
                        return kit;
                    case 5:
                        kit.add(new ItemStack(Item.goldenApple, 1));
                        kit.add(new ItemStack(Item.speedSplashPotion3_4, 2));
                        kit.add(new ItemStack(Item.strengthPotionCustom20PC_90, 1));
                        kit.add(Item.waterBucket);
                        kit.add(Item.diamondSword);
                        kit.add(Item.fishingRod);
                        kit.add(Item.ironAxe);
                        kit.add(Item.ironPick);
                        kit.add(Item.ironHelmet);
                        kit.add(Item.ironChest);
                        kit.add(Item.ironLeggings);
                        kit.add(Item.ironBoots);
                        return kit;
                }
            //</editor-fold>

            //<editor-fold desc="[Blacksmith]">
            case BLACKSMITH:
                switch(level){
                    case 1:
                        kit.add(new ItemStack(new Item("3 experience levels", Material.EXP_BOTTLE), 0));
                        kit.add(new ItemStack(new Item("Random level 1 enchantment", Material.ENCHANTED_BOOK), 1));
                        kit.add(new ItemStack(new Item("A random diamond armor, or diamond sword item", Material.DIAMOND), 0));
                        kit.add(Item.ironSword);
                        kit.add(Item.ironAxe);
                        kit.add(Item.ironPick);
                        kit.add(Item.ironHelmet);
                        kit.add(Item.ironChest);
                        kit.add(Item.ironLeggings);
                        kit.add(Item.ironBoots);
                        return kit;
                    case 2:
                        kit.add(new ItemStack(new Item("6 experience levels", Material.EXP_BOTTLE), 0));
                        kit.add(new ItemStack(new Item("Random level 1 enchantment", Material.ENCHANTED_BOOK), 2));
                        kit.add(new ItemStack(new Item("A random diamond armor, or diamond sword item", Material.DIAMOND), 0));
                        kit.add(Item.ironSword);
                        kit.add(Item.ironAxe);
                        kit.add(Item.ironPick);
                        kit.add(Item.ironHelmet);
                        kit.add(Item.ironChest);
                        kit.add(Item.ironLeggings);
                        kit.add(Item.ironBoots);
                        return kit;
                    case 3:
                        kit.add(new ItemStack(new Item("9 experience levels", Material.EXP_BOTTLE), 0));
                        kit.add(new ItemStack(new Item("Random level 1 or 2 enchantment", Material.ENCHANTED_BOOK), 3));
                        kit.add(new ItemStack(new Item("A random diamond armor, or diamond sword item", Material.DIAMOND), 0));
                        kit.add(Item.ironSword);
                        kit.add(Item.ironAxe);
                        kit.add(Item.ironPick);
                        kit.add(Item.ironHelmet);
                        kit.add(Item.ironChest);
                        kit.add(Item.ironLeggings);
                        kit.add(Item.ironBoots);
                        return kit;
                    case 4:
                        kit.add(new ItemStack(new Item("12 experience levels", Material.EXP_BOTTLE), 0));
                        kit.add(new ItemStack(new Item("Random level 1 or 2 enchantment", Material.ENCHANTED_BOOK), 4));
                        kit.add(new ItemStack(new Item("A random diamond armor, or diamond sword item", Material.DIAMOND), 0));
                        kit.add(Item.ironSword);
                        kit.add(Item.ironAxe);
                        kit.add(Item.ironPick);
                        kit.add(Item.ironHelmet);
                        kit.add(Item.ironChest);
                        kit.add(Item.ironLeggings);
                        kit.add(Item.ironBoots);
                        return kit;
                    case 5:
                        kit.add(new ItemStack(new Item("15 experience levels", Material.EXP_BOTTLE), 0));
                        kit.add(new ItemStack(new Item("Random level 1,2 or 3 enchantment", Material.ENCHANTED_BOOK), 3));
                        kit.add(new ItemStack(new Item("A random diamond armor, or diamond sword item", Material.DIAMOND), 0));
                        kit.add(Item.ironSword);
                        kit.add(Item.ironAxe);
                        kit.add(Item.ironPick);
                        kit.add(Item.ironHelmet);
                        kit.add(Item.ironChest);
                        kit.add(Item.ironLeggings);
                        kit.add(Item.ironBoots);
                        return kit;
                }
            //</editor-fold>

            //<editor-fold desc="[Bowman]" >
            case BOWMAN:
                kit.add(Item.ironSword);
                kit.add(Item.ironPick);
                kit.add(Item.ironAxe);
                kit.add(Item.ironChest);
                kit.add(Item.ironHelmet);
                kit.add(Item.ironLeggings);
                kit.add(Item.ironBoots);
                switch(level){
                    case 1:
                        kit.add(Item.bowPow1);
                        kit.add(new ItemStack(Item.arrow, 16));
                        return kit;
                    case 2:
                        kit.add(Item.bowPow1);
                        kit.add(new ItemStack(Item.arrow, 24));
                        return kit;
                    case 3:
                        kit.add(Item.bowPow2);
                        kit.add(new ItemStack(Item.arrow, 24));
                        return kit;
                    case 4:
                        kit.add(Item.bowPow2);
                        kit.add(new ItemStack(Item.arrow, 32));
                        return kit;
                    case 5:
                        kit.add(Item.bowPow3);
                        kit.add(new ItemStack(Item.arrow, 32));
                        return kit;
                }
            //</editor-fold>

            //<editor-fold desc="[Champion]">
            case CHAMPION:
                kit.add(Item.ironPick);
                kit.add(Item.ironAxe);
                kit.add(Item.ironChest);
                kit.add(Item.ironHelmet);
                kit.add(Item.ironLeggings);
                kit.add(Item.ironBoots);
                switch(level){
                    case 1:
                        kit.add(Item.diamondSword);
                        kit.add(new ItemStack(Item.enchantedBookSharp1, 1));
                        kit.add(Item.anvil);
                        return kit;
                    case 2:
                        kit.add(Item.diamondSwordSharp1);
                        kit.add(new ItemStack(Item.enchantedBookSharp1, 1));
                        kit.add(Item.anvil);
                        return kit;
                    case 3:
                        kit.add(Item.diamondSwordSharp1);
                        kit.add(new ItemStack(Item.enchantedBookSharp1, 2));
                        kit.add(Item.anvil);
                        return kit;
                    case 4:
                        kit.add(Item.diamondSwordSharp1);
                        kit.add(new ItemStack(Item.enchantedBookSharp1, 3));
                        kit.add(Item.anvil);
                        return kit;
                    case 5:
                        kit.add(Item.diamondSwordSharp2);
                        kit.add(new ItemStack(Item.enchantedBookSharp1, 3));
                        kit.add(Item.anvil);
                        return kit;
                }
            //</editor-fold>

            //<editor-fold desc="[Healer]">
            case HEALER:
                kit.add(Item.ironSword);
                kit.add(Item.ironPick);
                kit.add(Item.ironAxe);
                kit.add(Item.ironChest);
                kit.add(Item.ironHelmet);
                kit.add(Item.ironLeggings);
                kit.add(Item.ironBoots);
                switch(level){
                    case 1:
                        kit.add(new ItemStack(Item.regenPotion2_6, 1));
                        return kit;
                    case 2:
                        kit.add(new ItemStack(Item.regenPotion2_6, 1));
                        kit.add(new ItemStack(Item.instantHealthSplashPotion1, 1));
                        return kit;
                    case 3:
                        kit.add(new ItemStack(Item.regenPotion2_12, 1));
                        kit.add(new ItemStack(Item.instantHealthSplashPotion1, 1));
                        return kit;
                    case 4:
                        kit.add(new ItemStack(Item.regenPotion2_12, 1));
                        kit.add(new ItemStack(Item.instantHealthSplashPotion1, 2));
                        return kit;
                    case 5:
                        kit.add(new ItemStack(Item.regenPotion2_12, 2));
                        kit.add(new ItemStack(Item.instantHealthSplashPotion1, 2));
                        return kit;
                }
            //</editor-fold>

            //<editor-fold desc="[Magician]">
            case MAGICIAN:
                kit.add(Item.ironSword);
                kit.add(Item.ironPick);
                kit.add(Item.ironAxe);
                kit.add(Item.ironChest);
                kit.add(Item.ironHelmet);
                kit.add(Item.ironLeggings);
                kit.add(Item.ironBoots);
                kit.add(Item.anvil);
                kit.add(Item.enchantmentTable);
                switch(level){
                    case 1:
                        kit.add(new ItemStack(Item.expBottle, 12));
                        kit.add(new ItemStack(Item.bookCase, 2));
                        return kit;
                    case 2:
                        kit.add(new ItemStack(Item.expBottle, 16));
                        kit.add(new ItemStack(Item.bookCase, 3));
                        return kit;
                    case 3:
                        kit.add(new ItemStack(Item.expBottle, 24));
                        kit.add(new ItemStack(Item.bookCase, 4));
                        return kit;
                    case 4:
                        kit.add(new ItemStack(Item.expBottle, 32));
                        kit.add(new ItemStack(Item.bookCase, 5));
                        return kit;
                    case 5:
                        kit.add(new ItemStack(Item.expBottle, 48));
                        kit.add(new ItemStack(Item.bookCase, 6));
                        return kit;
                }
            //</editor-fold>

            //<editor-fold desc="[Pyromancer]">
            case PYROMANCER:
                kit.add(Item.ironPick);
                kit.add(Item.ironAxe);
                kit.add(Item.ironChest);
                kit.add(Item.ironHelmet);
                kit.add(Item.ironLeggings);
                kit.add(Item.ironBoots);
                switch(level){
                    case 1:
                        kit.add(Item.ironSwordFireAsp1);
                        kit.add(new ItemStack(Item.fireResistancePotion1_30, 1));
                        return kit;
                    case 2:
                        kit.add(Item.ironSwordFireAsp1);
                        kit.add(new ItemStack(Item.fireResistancePotion1_45, 1));
                        kit.add(Item.lavaBucket);
                        return kit;
                    case 3:
                        kit.add(Item.ironSwordFireAsp1);
                        kit.add(new ItemStack(Item.fireResistancePotion1_60, 1));
                        kit.add(Item.lavaBucket);
                        return kit;
                    case 4:
                        kit.add(Item.ironSwordFireAsp2);
                        kit.add(new ItemStack(Item.fireResistancePotion1_75, 1));
                        kit.add(Item.lavaBucket);
                        return kit;
                    case 5:
                        kit.add(Item.ironSwordFireAsp2);
                        kit.add(new ItemStack(Item.fireResistancePotion1_90, 1));
                        kit.add(Item.lavaBucket);
                        kit.add(Item.lavaBucket);
                        return kit;
                }
            //</editor-fold>

            //<editor-fold desc="[Scout]">
            case SCOUT:
                kit.add(Item.ironAxe);
                kit.add(Item.ironChest);
                kit.add(Item.ironHelmet);
                kit.add(Item.ironLeggings);
                kit.add(Item.ironBoots);
                switch(level){
                    case 1:
                        kit.add(Item.diamondPickEff1);
                        kit.add(new ItemStack(Item.speedSplashPotion2_40, 1));
                        kit.add(Item.diamondAxeEff1);
                        return kit;
                    case 2:
                        kit.add(Item.diamondPickEff1);
                        kit.add(new ItemStack(Item.speedSplashPotion2_40, 1));
                        kit.add(Item.diamondAxeEff1Sharp1);
                        return kit;
                    case 3:
                        kit.add(Item.diamondPickSharp1Fortune1);
                        kit.add(new ItemStack(Item.speedSplashPotion2_40, 2));
                        return kit;
                    case 4:
                        kit.add(Item.diamondPickSharp1Fortune2);
                        kit.add(new ItemStack(Item.speedSplashPotion2_40, 3));
                        return kit;
                    case 5:
                        kit.add(Item.diamondPickSharp2Fortune2);
                        kit.add(new ItemStack(Item.speedSplashPotion2_40, 3));
                        return kit;
                }
            //</editor-fold>
        }
        return kit;
    }
}
