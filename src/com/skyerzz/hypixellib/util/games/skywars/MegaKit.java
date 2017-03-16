package com.skyerzz.hypixellib.util.games.skywars;

import com.skyerzz.hypixellib.util.CURRENCY;
import com.skyerzz.hypixellib.util.item.Item;
import com.skyerzz.hypixellib.util.item.ItemStack;

import java.util.ArrayList;

/**
 * Created by sky on 25-12-2016.
 */
public enum MEGA_KIT {
    DEFAULT("Default"),
    ARMORER("Armorer"),
    ARMORSMITH("Armorsmith"),
    BASEBALL_PLAYER("Baseball Player"),
    CANNONEER("Cannoneer"),
    HEALER("Healer"),
    HUNTER("Hunter"),
    KNIGHT("Knight"),
    PALADIN("Paladin"),
    SCOUT("Scout"),
    SKELETOR("Skeletor"),
    WITCH("Witch"),
    HELLHOUND("Hellhound");


    private String displayName;

    MEGA_KIT(String displayName){
        this.displayName = displayName;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(MEGA_KIT item: MEGA_KIT.values()){
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

    public int getMaxLevel(){ return 5; }

    public CURRENCY getCurrencyType(){ return CURRENCY.COINS; }

    public ArrayList<ItemStack> getKitItems(int level) {
        if(level < 1 || level > getMaxLevel()){
            return null;
        }
        ArrayList<ItemStack> kit = new ArrayList<>();
        switch (this) {
            //<editor-fold desc="[ARMORER]">
            case ARMORER:
                switch(level){
                    case 1:
                        kit.add(Item.ironChestProt1);
                        kit.add(Item.ironBootsProt1);
                        return kit;
                    case 2:
                        kit.add(Item.ironChestProt2);
                        kit.add(Item.ironBootsProt2);
                        return kit;
                    case 3:
                        kit.add(Item.ironChestProt3);
                        kit.add(Item.ironBootsProt3);
                        return kit;
                    case 4:
                        kit.add(Item.ironChestProt4);
                        kit.add(Item.ironBootsProt4);
                        return kit;
                    case 5:
                        kit.add(Item.diamondChestProt2);
                        kit.add(Item.diamondBootsProt3);
                        return kit;
                }
            //</editor-fold>

            // <editor-fold desc="[ARMORSMITH]">
            case ARMORSMITH:
                switch(level){
                    case 1:
                        kit.add(Item.anvil);
                        kit.add(new ItemStack(Item.expBottle, 32));
                        kit.add(new ItemStack(Item.enchantedBookProt2, 1));
                        kit.add(new ItemStack(Item.enchantedBookProjProt2, 1));
                        kit.add(Item.ironHelmet);
                        return kit;
                    case 2:
                        kit.add(Item.anvil);
                        kit.add(new ItemStack(Item.expBottle, 32));
                        kit.add(new ItemStack(Item.enchantedBookProt3, 1));
                        kit.add(new ItemStack(Item.enchantedBookProjProt2, 1));
                        kit.add(Item.ironHelmet);
                        return kit;
                    case 3:
                        kit.add(Item.anvil);
                        kit.add(new ItemStack(Item.expBottle, 48));
                        kit.add(new ItemStack(Item.enchantedBookProt3, 1));
                        kit.add(new ItemStack(Item.enchantedBookProjProt3, 1));
                        kit.add(Item.ironHelmet);
                        return kit;
                    case 4:
                        kit.add(Item.anvil);
                        kit.add(new ItemStack(Item.expBottle, 64));
                        kit.add(new ItemStack(Item.enchantedBookProt3, 1));
                        kit.add(new ItemStack(Item.enchantedBookProjProt3, 1));
                        kit.add(Item.diamondHelmet);
                        return kit;
                    case 5:
                        kit.add(Item.anvil);
                        kit.add(new ItemStack(Item.expBottle, 48));
                        kit.add(new ItemStack(Item.enchantedBookProt4, 1));
                        kit.add(new ItemStack(Item.enchantedBookProjProt4, 1));
                        kit.add(Item.diamondHelmet);
                        return kit;
                }
            //</editor-fold>

            // <editor-fold desc="[BASEBALL PLAYER]">
            case BASEBALL_PLAYER:
                switch(level){
                    case 1:
                        kit.add(Item.ironHelmetProt1);
                        kit.add(Item.ironSwordKnockback1);
                        return kit;
                    case 2:
                        kit.add(Item.ironHelmetProt2);
                        kit.add(Item.ironSwordKnockback1);
                        return kit;
                    case 3:
                        kit.add(Item.ironHelmetProt3);
                        kit.add(Item.ironSwordKnockback1);
                        return kit;
                    case 4:
                        kit.add(Item.ironHelmetProt3);
                        kit.add(Item.ironSwordKnockback2);
                        return kit;
                    case 5:
                        kit.add(Item.diamondHelmetProt4);
                        kit.add(Item.ironSwordKnockback2);
                        return kit;

                }
            //</editor-fold>

            // <editor-fold desc="[CANNONEER]">
            case CANNONEER:
                switch(level){
                    case 1:
                        kit.add(new ItemStack(Item.TNT, 8));
                        kit.add(new ItemStack(Item.redstone, 32));
                        kit.add(Item.waterBucket);
                        kit.add(Item.ironLeggingsBProt1);
                        return kit;
                    case 2:
                        kit.add(new ItemStack(Item.TNT, 12));
                        kit.add(new ItemStack(Item.redstone, 32));
                        kit.add(Item.waterBucket);
                        kit.add(Item.ironLeggingsBProt2);
                        return kit;
                    case 3:
                        kit.add(new ItemStack(Item.TNT, 16));
                        kit.add(new ItemStack(Item.redstone, 32));
                        kit.add(Item.waterBucket);
                        kit.add(Item.ironLeggingsBProt3);
                        return kit;
                    case 4:
                        kit.add(new ItemStack(Item.TNT, 24));
                        kit.add(new ItemStack(Item.redstone, 32));
                        kit.add(Item.waterBucket);
                        kit.add(Item.diamondLeggingsBProt3);
                        return kit;
                    case 5:
                        kit.add(new ItemStack(Item.TNT, 32));
                        kit.add(new ItemStack(Item.redstone, 32));
                        kit.add(Item.waterBucket);
                        kit.add(Item.diamondLeggingsBProt4);
                        return kit;
                }
            //</editor-fold>

            // <editor-fold desc="[HEALER]">
            case HEALER:
                switch(level){ //todo confirm all this, find out level 3.
                    case 1:
                        kit.add(new ItemStack(Item.instantHealthSplashPotion2, 1));
                        kit.add(new ItemStack(Item.regenPotion2_12, 1));
                        return kit;
                    case 2:
                        kit.add(new ItemStack(Item.instantHealthSplashPotion2, 2));
                        kit.add(new ItemStack(Item.regenPotion2_12, 1));
                        return kit;
                    case 3:
                        return null;
                    case 4:
                        kit.add(new ItemStack(Item.instantHealthSplashPotion2, 3));
                        kit.add(new ItemStack(Item.regenPotion2_16, 1));
                        return kit;
                    case 5:
                        kit.add(new ItemStack(Item.instantHealthSplashPotion2, 3));
                        kit.add(new ItemStack(Item.regenPotion3_16, 1));
                        return kit;
                }
            //</editor-fold>

            // <editor-fold desc="[HUNTER]">
            case HUNTER:
                switch(level) {
                    case 1:
                        kit.add(Item.bowPow1);
                        kit.add(new ItemStack(Item.arrow, 8));
                        return kit;
                    case 2:
                        kit.add(Item.bowPow1);
                        kit.add(new ItemStack(Item.arrow, 12));
                        return kit;
                    case 3:
                        kit.add(Item.bowPow1);
                        kit.add(new ItemStack(Item.arrow, 16));
                        return kit;
                    case 4:
                        kit.add(Item.bowPow2);
                        kit.add(new ItemStack(Item.arrow, 16));
                        return kit;
                    case 5:
                        kit.add(Item.bowPow2);
                        kit.add(new ItemStack(Item.arrow, 24));
                        return kit;
                }
            //</editor-fold>

            // <editor-fold desc="[KNIGHT]">
            case KNIGHT:
                switch(level) {
                    case 1:
                        kit.add(Item.diamondSword);
                        return kit;
                    case 2:
                        kit.add(Item.diamondSwordSharp1);
                        kit.add(Item.goldHelmet);
                        return kit;
                    case 3:
                        kit.add(Item.diamondSwordSharp1);
                        kit.add(Item.goldHelmet);
                        kit.add(Item.goldLeggings);
                        return kit;
                    case 4:
                        kit.add(Item.diamondSwordSharp1);
                        kit.add(Item.goldHelmet);
                        kit.add(Item.goldLeggings);
                        kit.add(Item.goldBoots);
                        return kit;
                    case 5:
                        kit.add(Item.diamondSwordSharp1);
                        kit.add(Item.goldHelmet);
                        kit.add(Item.goldLeggings);
                        kit.add(Item.goldBoots);
                        kit.add(Item.goldChest);
                        return kit;
                }
            //</editor-fold>

            // <editor-fold desc="[PALADIN]">
            case PALADIN:
                switch(level) {
                    case 1:
                        kit.add(new ItemStack(Item.goldenAppleRegen3Slow2, 1));
                        kit.add(Item.leatherHelmet);
                        return kit;
                    case 2:
                        kit.add(new ItemStack(Item.goldenAppleRegen3Slow2, 1));
                        kit.add(Item.leatherHelmet);
                        kit.add(Item.leatherLeggings);
                        return kit;
                    case 3:
                        kit.add(new ItemStack(Item.goldenAppleRegen3Slow2, 1));
                        kit.add(Item.leatherHelmet);
                        kit.add(Item.leatherLeggings);
                        kit.add(Item.leatherBoots);
                        return kit;
                    case 4:
                        kit.add(new ItemStack(Item.goldenAppleRegen3Slow2, 1));
                        kit.add(Item.leatherHelmet);
                        kit.add(Item.leatherLeggings);
                        kit.add(Item.leatherBoots);
                        kit.add(Item.leatherChest);
                        return kit;
                    case 5:
                        kit.add(new ItemStack(Item.goldenAppleRegen3Slow2, 2));
                        kit.add(Item.leatherHelmet);
                        kit.add(Item.leatherLeggings);
                        kit.add(Item.leatherBoots);
                        kit.add(Item.leatherChest);
                        return kit;
                }
            //</editor-fold>

            // <editor-fold desc="[SCOUT]">
            case SCOUT:
                switch(level) { //todo find speed level and length
                    case 1:
                        kit.add(new ItemStack(Item.speedPotion2_8, 1));
                        kit.add(Item.ironSword);
                        return kit;
                    case 2:
                        kit.add(new ItemStack(Item.speedPotion2_8, 2));
                        kit.add(Item.ironSword);
                        return kit;
                    case 3:
                        kit.add(new ItemStack(Item.speedPotion2_8, 2));
                        kit.add(Item.diamondSword);
                        return kit;
                    case 4:
                        kit.add(new ItemStack(Item.speedPotion2_8, 3));
                        kit.add(Item.diamondSword);
                        return kit;
                    case 5:
                        kit.add(new ItemStack(Item.speedPotion2_8, 4));
                        kit.add(Item.diamondSword);
                        return kit;
                }
            //</editor-fold>

            // <editor-fold desc="[SKELETOR]">
            case SKELETOR:
                switch(level) {
                    case 1:
                        kit.add(new ItemStack(Item.skeletonEgg, 1));
                        kit.add(Item.chainBootsProt2);
                        return kit;
                    case 2:
                        kit.add(new ItemStack(Item.skeletonEgg, 1));
                        kit.add(Item.chainBootsProt2);
                        kit.add(Item.chainHelmetProt2);
                        return kit;
                    case 3:
                        kit.add(new ItemStack(Item.skeletonEgg, 2));
                        kit.add(Item.chainBootsProt2);
                        kit.add(Item.chainHelmetProt2);
                        return kit;
                    case 4:
                        kit.add(new ItemStack(Item.skeletonEgg, 2));
                        kit.add(Item.chainBootsProt2);
                        kit.add(Item.chainHelmetProt2);
                        kit.add(Item.chainChestUnbreaking1);
                        return kit;
                    case 5:
                        kit.add(new ItemStack(Item.skeletonEgg, 3));
                        kit.add(Item.chainBootsProt2);
                        kit.add(Item.chainHelmetProt2);
                        kit.add(Item.chainChestUnbreaking1);
                        return kit;
                }
            //</editor-fold>

            // <editor-fold desc="[WITCH]">
            case WITCH:
                switch(level) {
                    case 1:
                        kit.add(new ItemStack(Item.splashPotionSlow1_15Poison1_12, 1));
                        kit.add(new ItemStack(Item.blindnessSplashPotion1_10, 1));
                        return kit;
                    case 2:
                        kit.add(new ItemStack(Item.splashPotionSlow1_15Poison1_12, 1));
                        kit.add(new ItemStack(Item.blindnessSplashPotion1_10, 2));
                        return kit;
                    case 3:
                        kit.add(new ItemStack(Item.splashPotionSlow1_15Poison1_12, 2));
                        kit.add(new ItemStack(Item.blindnessSplashPotion1_10, 2));
                        kit.add(new ItemStack(Item.strengthPotion1_6, 1));
                        return kit;
                    case 4:
                        kit.add(new ItemStack(Item.splashPotionSlow1_15Poison1_12, 2));
                        kit.add(new ItemStack(Item.blindnessSplashPotion1_10, 3));
                        kit.add(new ItemStack(Item.strengthPotion1_6, 1));
                        return kit;
                    case 5:
                        kit.add(new ItemStack(Item.splashPotionSlow1_15Poison1_12, 3));
                        kit.add(new ItemStack(Item.blindnessSplashPotion1_10, 3));
                        kit.add(new ItemStack(Item.strengthPotion1_6, 2));
                        return kit;
                }
            //</editor-fold>

            // <editor-fold desc="[HELLHOUND]">
            case HELLHOUND:
                switch(level) {
                    case 1:
                        kit.add(new ItemStack(Item.wolfEgg, 1));
                        kit.add(Item.stoneAxe);
                        return kit;
                    case 2:
                        kit.add(new ItemStack(Item.wolfEgg, 1));
                        kit.add(Item.ironAxe);
                        kit.add(Item.chainHelmet);
                        return kit;
                    case 3:
                        kit.add(new ItemStack(Item.wolfEgg, 1));
                        kit.add(Item.ironAxe);
                        kit.add(Item.chainHelmetProt2);
                        return kit;
                    case 4:
                        kit.add(new ItemStack(Item.wolfEgg, 1));
                        kit.add(Item.diamondAxe);
                        kit.add(Item.chainHelmetProt2);
                        return kit;
                    case 5:
                        kit.add(new ItemStack(Item.wolfEgg, 1));
                        kit.add(Item.diamondAxe);
                        kit.add(Item.chainHelmetProt4);
                        return kit;
                }
            //</editor-fold>
        }
        return kit;
    }
}
