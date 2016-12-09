package com.skyerzz.hypixellib.util.games.blitz;

import com.skyerzz.hypixellib.Logger;
import com.skyerzz.hypixellib.util.CURRENCY;
import com.skyerzz.hypixellib.util.RANKTYPE;
import com.skyerzz.hypixellib.util.items.all.*;

import java.util.ArrayList;

/**
 * Created by sky on 19-11-2016.
 */
public enum BASIC_KIT {
    ARCHER("Archer"),
    SCOUT("Scout"),
    MEATMASTER("Meatmaster"),
    HUNTER("Hunter"),
    SPELEOLOGIST("Speleologist"),
    HYPE_TRAIN("Hype Train"),
    BAKER("Baker"),
    FISHERMAN("Fisherman"),
    KNIGHT("Knight"),
    ARMORER("Armorer");

    private String displayName;

    BASIC_KIT(String displayName){
        this.displayName = displayName;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(BASIC_KIT item: BASIC_KIT.values()){
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
                return 0;
            case 2:
                return 80;
            case 3:
                return 400;
            case 4:
                return 1000;
            case 5:
                return 3000;
            case 6:
                return 12000;
            case 7:
                return 50000;
            case 8:
                return 100000;
            case 9:
                return 250000;
            case 10:
                return 1000000;
            default: return -1;
        }
    }

    public CURRENCY getCurrencyType(){
        return CURRENCY.COINS;
    }

    public RANKTYPE getRankRequirement(){ return RANKTYPE.DEFAULT; }

    public ArrayList<ItemStack> getKitItems(int level){
        if(level < 1 || level > 10){
            return null;
        }
        ArrayList<ItemStack> kit = new ArrayList<>();
        ItemStack item;
        switch(this){
            case ARCHER:
                //<editor-fold desc="[Archer]">
                switch(level){
                    //<editor-fold desc="[1-5]">
                    case 1:
                        kit.add(Item.bowUnbreak1);
                        item = new ItemStack(new Item(Material.ARROW), 6);
                        kit.add(item);
                        return kit;

                    case 2:
                        item = new ItemStack(new Item(Material.BOW).addEnchantment(new Enchantment(EnchantmentType.UNBREAKING, 1)), 1);
                        kit.add(item);
                        item = new ItemStack(new Item(Material.ARROW), 9);
                        kit.add(item);
                        return kit;

                    case 3:
                        item = new ItemStack(new Item(Material.BOW).addEnchantment(new Enchantment(EnchantmentType.UNBREAKING, 1)), 1);
                        kit.add(item);
                        item = new ItemStack(new Item(Material.ARROW), 12);
                        kit.add(item);
                        item = new ItemStack(new Item(Material.LEATHER_BOOTS), 1);
                        kit.add(item);
                        return kit;

                    case 4:
                        item = new ItemStack(new Item(Material.BOW), 1);
                        kit.add(item);
                        item = new ItemStack(new Item(Material.ARROW), 16);
                        kit.add(item);
                        item = new ItemStack(new Item(Material.LEATHER_BOOTS), 1);
                        kit.add(item);
                        return kit;

                    case 5:
                        item = new ItemStack(new Item(Material.BOW), 1);
                        kit.add(item);
                        item = new ItemStack(new Item(Material.ARROW), 16);
                        kit.add(item);
                        item = new ItemStack(new Item(Material.LEATHER_BOOTS), 1);
                        kit.add(item);
                        item = new ItemStack(new Item(Material.GOLD_HELMET), 1);
                        kit.add(item);
                        return kit;
                    //</editor-fold>
                    //<editor-fold desc="[6-10]">
                    case 6:
                        item = new ItemStack(new Item(Material.BOW), 1);
                        kit.add(item);
                        item = new ItemStack(new Item(Material.ARROW), 16);
                        kit.add(item);
                        item = new ItemStack(new Item(Material.LEATHER_BOOTS), 1);
                        kit.add(item);
                        item = new ItemStack(new Item(Material.GOLD_HELMET), 1);
                        kit.add(item);
                        item = new ItemStack(new Item(Material.LEATHER_LEGGINGS), 1);
                        kit.add(item);
                        return kit;

                    case 7:
                        item = new ItemStack(new Item(Material.BOW), 1);
                        kit.add(item);
                        item = new ItemStack(new Item(Material.ARROW), 18);
                        kit.add(item);
                        item = new ItemStack(new Item(Material.LEATHER_BOOTS), 1);
                        kit.add(item);
                        item = new ItemStack(new Item(Material.DIAMOND_HELMET).addEnchantment(new Enchantment(EnchantmentType.PROTECTION, 1)), 1);
                        kit.add(item);
                        item = new ItemStack(new Item(Material.LEATHER_LEGGINGS), 1);
                        kit.add(item);
                        return kit;

                    case 8:
                        item = new ItemStack(new Item(Material.BOW).addEnchantment(new Enchantment(EnchantmentType.POWER, 1)), 1);
                        kit.add(item);
                        item = new ItemStack(new Item(Material.ARROW), 22);
                        kit.add(item);
                        item = new ItemStack(new Item(Material.LEATHER_BOOTS), 1);
                        kit.add(item);
                        item = new ItemStack(new Item(Material.DIAMOND_HELMET).addEnchantment(new Enchantment(EnchantmentType.PROTECTION, 1)), 1);
                        kit.add(item);
                        item = new ItemStack(new Item(Material.LEATHER_LEGGINGS), 1);
                        kit.add(item);
                        return kit;

                    case 9:
                        item = new ItemStack(new Item(Material.BOW).addEnchantment(new Enchantment(EnchantmentType.POWER, 1)), 1);
                        kit.add(item);
                        item = new ItemStack(new Item(Material.ARROW), 30);
                        kit.add(item);
                        item = new ItemStack(new Item(Material.LEATHER_BOOTS), 1);
                        kit.add(item);
                        item = new ItemStack(new Item(Material.DIAMOND_HELMET).addEnchantment(new Enchantment(EnchantmentType.PROTECTION, 1)), 1);
                        kit.add(item);
                        item = new ItemStack(new Item(Material.LEATHER_LEGGINGS), 1);
                        kit.add(item);
                        item = new ItemStack(new Item(Material.LEATHER_CHESTPLATE), 1);
                        kit.add(item);
                        return kit;

                    case 10:
                        item = new ItemStack(new Item(Material.BOW).addEnchantment(new Enchantment(EnchantmentType.POWER, 2)), 1);
                        kit.add(item);
                        item = new ItemStack(new Item(Material.ARROW), 36);
                        kit.add(item);
                        item = new ItemStack(new Item(Material.LEATHER_BOOTS), 1);
                        kit.add(item);
                        item = new ItemStack(new Item(Material.DIAMOND_HELMET).addEnchantment(new Enchantment(EnchantmentType.PROTECTION, 2)), 1);
                        kit.add(item);
                        item = new ItemStack(new Item(Material.LEATHER_LEGGINGS), 1);
                        kit.add(item);
                        item = new ItemStack(new Item(Material.LEATHER_CHESTPLATE), 1);
                        kit.add(item);
                        return kit;
                    //</editor-fold>
                }
                //</editor-fold>
            case SCOUT:
                //<editor-fold desc="[Scout]">

                switch(level){
                    //<editor-fold desc="[1-5]">
                    case 1:
                        kit.add(new ItemStack(Item.speedPotion2_15, 2));
                        return kit;
                    case 2:
                        kit.add(new ItemStack(Item.speedPotion2_15, 3));
                        return kit;
                    case 3:
                        kit.add(new ItemStack(Item.speedPotion2_15, 3));
                        kit.add(Item.leatherChest);
                        return kit;
                    case 4:
                        kit.add(new ItemStack(Item.speedPotion2_15, 4));
                        kit.add(Item.leatherChest);
                        return kit;
                    case 5:
                        kit.add(new ItemStack(Item.speedPotion2_15, 4));
                        kit.add(Item.leatherChest);
                        kit.add(new ItemStack(Item.slowSlpashPotion2_12, 1));
                        kit.add(new ItemStack(Item.invisSplashPotion2_10, 1));
                        return kit;
                    //</editor-fold>

                    //<editor-fold desc="[6-10]">
                    case 6:
                        kit.add(new ItemStack(Item.speedPotion2_15, 4));
                        kit.add(Item.leatherChest);
                        kit.add(new ItemStack(Item.slowSlpashPotion2_12, 1));
                        kit.add(new ItemStack(Item.invisSplashPotion2_10, 1));
                        kit.add(Item.leatherHelmetResp1);
                        return kit;
                    case 7:
                        kit.add(new ItemStack(Item.speedPotion2_20, 5));
                        kit.add(Item.leatherChest);
                        kit.add(new ItemStack(Item.slowSlpashPotion2_12, 2));
                        kit.add(new ItemStack(Item.invisSplashPotion2_10, 1));
                        kit.add(Item.leatherHelmetResp2);
                        return kit;
                    case 8:
                        kit.add(new ItemStack(Item.speedPotion2_20, 5));
                        kit.add(Item.leatherChest);
                        kit.add(new ItemStack(Item.slowSlpashPotion2_12, 2));
                        kit.add(new ItemStack(Item.invisSplashPotion2_10, 1));
                        kit.add(Item.leatherHelmetResp2);
                        kit.add(new ItemStack(Item.regenPotion3_6, 1));
                        return kit;
                    case 9:
                        kit.add(new ItemStack(Item.speedPotion2_25, 5));
                        kit.add(Item.leatherChest);
                        kit.add(new ItemStack(Item.slowSlpashPotion2_12, 3));
                        kit.add(new ItemStack(Item.invisSplashPotion2_10, 1));
                        kit.add(Item.leatherHelmetResp2);
                        kit.add(new ItemStack(Item.regenPotion3_6, 2));
                        return kit;
                    case 10:
                        kit.add(new ItemStack(Item.speedPotion2_27, 5));
                        kit.add(Item.leatherChest);
                        kit.add(new ItemStack(Item.slowSlpashPotion2_12, 5));
                        kit.add(new ItemStack(Item.invisSplashPotion2_10, 1));
                        kit.add(Item.leatherHelmetResp2);
                        kit.add(new ItemStack(Item.regenPotion3_6, 3));
                        kit.add(Item.leatherBoots);
                        return kit;
                    //</editor-fold>
                }
                //</editor-fold>
            case MEATMASTER:
                //<editor-fold desc="[Meatmaster]">
                switch(level){
                    //<editor-fold desc="[1-5]">
                    case 1:
                        kit.add(Item.woodenAxe);
                        kit.add(new ItemStack(Item.steak, 1));
                        kit.add(new ItemStack(Item.cowEgg, 1));
                        return kit;
                    case 2:
                        kit.add(Item.woodenAxe);
                        kit.add(new ItemStack(Item.steak, 1));
                        kit.add(new ItemStack(Item.cowEgg, 2));
                        return kit;
                    case 3:
                        kit.add(Item.woodSwordLoot1);
                        kit.add(new ItemStack(Item.steak, 2));
                        kit.add(new ItemStack(Item.cowEgg, 1));
                        return kit;
                    case 4:
                        kit.add(Item.woodSwordLoot1);
                        kit.add(new ItemStack(Item.steak, 2));
                        kit.add(new ItemStack(Item.cowEgg, 2));
                        return kit;
                    case 5:
                        kit.add(Item.woodSwordLoot1);
                        kit.add(new ItemStack(Item.steak, 2));
                        kit.add(new ItemStack(Item.cowEgg, 2));
                        kit.add(Item.ironHelmet);
                        return kit;
                    //</editor-fold>

                    //<editor-fold desc-"[6-10]">
                    case 6:
                        kit.add(Item.woodSwordLoot1);
                        kit.add(new ItemStack(Item.steak, 2));
                        kit.add(new ItemStack(Item.cowEgg, 3));
                        kit.add(Item.ironHelmet);
                        kit.add(Item.ironBoots);
                        return kit;
                    case 7:
                        kit.add(Item.woodSwordLoot2);
                        kit.add(new ItemStack(Item.steak, 2));
                        kit.add(new ItemStack(Item.cowEgg, 3));
                        kit.add(Item.diamondHelmet);
                        kit.add(Item.ironBoots);
                        return kit;
                    case 8:
                        kit.add(Item.stoneSwordLoot2);
                        kit.add(new ItemStack(Item.steak, 2));
                        kit.add(new ItemStack(Item.cowEgg, 4));
                        kit.add(Item.diamondHelmetProt1);
                        kit.add(Item.ironBoots);
                        return kit;
                    case 9:
                        kit.add(Item.stoneSwordLoot3);
                        kit.add(new ItemStack(Item.steak, 3));
                        kit.add(new ItemStack(Item.cowEgg, 5));
                        kit.add(Item.diamondHelmetProt2);
                        kit.add(Item.ironBootsProt1);
                        return kit;
                    case 10:
                        kit.add(Item.ironSwordLoot3);
                        kit.add(new ItemStack(Item.steak, 5));
                        kit.add(new ItemStack(Item.cowEgg, 6));
                        kit.add(Item.diamondHelmetProt3);
                        kit.add(Item.ironBootsProt1);
                        kit.add(new ItemStack(Item.pigEgg, 1));
                        return kit;
                    //</editor-fold>
                }
//</editor-fold>
            case HUNTER:
                //<editor-fold desc="[Hunter]">
                switch(level){
                    //<editor-fold desc="[1-5]">
                    case 1:
                        kit.add(Item.bowUnbreak1);
                        kit.add(new ItemStack(Item.arrow, 4));
                        return kit;
                    case 2:
                        kit.add(Item.bowUnbreak1);
                        kit.add(new ItemStack(Item.arrow, 8));
                        return kit;
                    case 3:
                        kit.add(Item.bowUnbreak1);
                        kit.add(new ItemStack(Item.arrow, 8));
                        kit.add(Item.woodenAxe);
                        return kit;
                    case 4:
                        kit.add(Item.bowUnbreak1);
                        kit.add(new ItemStack(Item.arrow, 8));
                        kit.add(Item.woodenAxe);
                        kit.add(Item.leatherLeggings);
                        return kit;
                    case 5:
                        kit.add(Item.bowUnbreak1);
                        kit.add(new ItemStack(Item.arrow, 8));
                        kit.add(Item.woodenAxe);
                        kit.add(Item.leatherLeggings);
                        kit.add(Item.leatherChest);
                        return kit;
                    //</editor-fold>

                    //<editor-fold desc-"[6-10]">
                    case 6:
                        kit.add(Item.bowUnbreak1);
                        kit.add(new ItemStack(Item.arrow, 16));
                        kit.add(Item.woodenSword);
                        kit.add(Item.leatherLeggings);
                        kit.add(Item.leatherChest);
                        return kit;
                    case 7:
                        kit.add(Item.bow);
                        kit.add(new ItemStack(Item.arrow, 16));
                        kit.add(Item.woodenSword);
                        kit.add(Item.leatherLeggings);
                        kit.add(Item.leatherChest);
                        kit.add(new ItemStack(Item.speedPotion2_8, 1));
                        return kit;
                    case 8:
                        kit.add(Item.bow);
                        kit.add(new ItemStack(Item.arrow, 16));
                        kit.add(Item.stoneSword);
                        kit.add(Item.goldLeggings);
                        kit.add(Item.leatherChest);
                        kit.add(new ItemStack(Item.speedPotion2_8, 2));
                        return kit;
                    case 9:
                        kit.add(Item.bowPow1);
                        kit.add(new ItemStack(Item.arrow, 20));
                        kit.add(Item.stoneSword);
                        kit.add(Item.chainLeggings);
                        kit.add(Item.leatherChest);
                        kit.add(new ItemStack(Item.speedPotion2_8, 3));
                        return kit;
                    case 10:
                        kit.add(Item.bowPow1);
                        kit.add(new ItemStack(Item.arrow, 24));
                        kit.add(Item.stoneSword);
                        kit.add(new ItemStack(Item.speedPotion2_10, 4));
                        kit.add(Item.chainChestPunch1);
                        kit.add(Item.chainLeggingsPunch1);
                        return kit;
                    //</editor-fold>
                }
//</editor-fold>
            case SPELEOLOGIST:
                //<editor-fold desc="[Speleologist]">
                switch(level){
                    //<editor-fold desc="[1-5]">
                    case 1:
                        kit.add(Item.woodenPick);
                        kit.add(new ItemStack(Item.mooshEgg, 1));
                        return kit;
                    case 2:
                        kit.add(Item.stonePick);
                        kit.add(new ItemStack(Item.mooshEgg, 1));
                        return kit;
                    case 3:
                        kit.add(Item.stonePick);
                        kit.add(new ItemStack(Item.mooshEgg, 1));
                        kit.add(new ItemStack(Item.bowl, 1));
                        return kit;
                    case 4:
                        kit.add(Item.ironPick);
                        kit.add(new ItemStack(Item.mooshEgg, 1));
                        kit.add(new ItemStack(Item.bowl, 1));
                        kit.add(Item.leatherHelmet);
                        return kit;
                    case 5:
                        kit.add(Item.ironPick);
                        kit.add(new ItemStack(Item.mooshEgg, 1));
                        kit.add(new ItemStack(Item.bowl, 1));
                        kit.add(Item.ironHelmet);
                        return kit;
                    //</editor-fold>

                    //<editor-fold desc-"[6-10]">
                    case 6:
                        kit.add(Item.ironPick);
                        kit.add(new ItemStack(Item.mooshEgg, 1));
                        kit.add(new ItemStack(Item.bowl, 1));
                        kit.add(Item.ironHelmet);
                        kit.add(Item.ironBoots);
                        return kit;
                    case 7:
                        kit.add(Item.ironPick);
                        kit.add(new ItemStack(Item.mooshEgg, 1));
                        kit.add(new ItemStack(Item.bowl, 1));
                        kit.add(Item.ironHelmet);
                        kit.add(Item.ironBoots);
                        kit.add(Item.leatherChest);
                        return kit;
                    case 8:
                        kit.add(Item.ironPick);
                        kit.add(new ItemStack(Item.mooshEgg, 1));
                        kit.add(new ItemStack(Item.bowl, 1));
                        kit.add(Item.diamondHelmet);
                        kit.add(Item.ironBoots);
                        kit.add(Item.leatherChest);
                        kit.add(Item.leatherLeggings);
                        return kit;
                    case 9:
                        kit.add(Item.ironPickSharp1);
                        kit.add(new ItemStack(Item.mooshEgg, 1));
                        kit.add(new ItemStack(Item.bowl, 1));
                        kit.add(Item.diamondHelmet);
                        kit.add(Item.ironBootsProjProt1);
                        kit.add(Item.leatherChest);
                        kit.add(Item.leatherLeggings);
                        return kit;
                    case 10:
                        kit.add(Item.diamondPickSharp1);
                        kit.add(new ItemStack(Item.mooshEgg, 1));
                        kit.add(new ItemStack(Item.bowl, 1));
                        kit.add(Item.diamondHelmetProt1);
                        kit.add(Item.ironBootsProjProt1);
                        kit.add(Item.leatherChest);
                        kit.add(Item.leatherLeggings);
                        return kit;
                    //</editor-fold>
                }
//</editor-fold>
            case HYPE_TRAIN:
                //<editor-fold desc="[Hype Train]">
                switch(level){
                    //<editor-fold desc="[1-5]">
                    case 1:
                        kit.add(new ItemStack(Item.minecart, 1));
                        kit.add(new ItemStack(Item.poweredRail, 1));
                        kit.add(new ItemStack(Item.rail, 14));
                        kit.add(new ItemStack(Item.redstoneTorch, 1));
                        return kit;
                    case 2:
                        kit.add(new ItemStack(Item.minecart, 1));
                        kit.add(new ItemStack(Item.poweredRail, 2));
                        kit.add(new ItemStack(Item.rail, 16));
                        kit.add(new ItemStack(Item.redstoneTorch, 2));
                        return kit;
                    case 3:
                        kit.add(new ItemStack(Item.minecart, 1));
                        kit.add(new ItemStack(Item.poweredRail, 2));
                        kit.add(new ItemStack(Item.rail, 18));
                        kit.add(new ItemStack(Item.redstoneTorch, 2));
                        kit.add(Item.stoneAxe);
                        return kit;
                    case 4:
                        kit.add(new ItemStack(Item.minecart, 1));
                        kit.add(new ItemStack(Item.poweredRail, 3));
                        kit.add(new ItemStack(Item.rail, 18));
                        kit.add(new ItemStack(Item.redstoneTorch, 3));
                        kit.add(Item.stoneAxe);
                        kit.add(Item.leatherHelmet);
                        return kit;
                    case 5:
                        kit.add(new ItemStack(Item.minecart, 1));
                        kit.add(new ItemStack(Item.poweredRail, 3));
                        kit.add(new ItemStack(Item.rail, 20));
                        kit.add(new ItemStack(Item.redstoneTorch, 3));
                        kit.add(Item.stoneAxe);
                        kit.add(Item.leatherHelmetProjProt1);
                        return kit;
                    //</editor-fold>

                    //<editor-fold desc="[6-10]">
                    case 6:
                        kit.add(new ItemStack(Item.minecart, 1));
                        kit.add(new ItemStack(Item.poweredRail, 3));
                        kit.add(new ItemStack(Item.rail, 22));
                        kit.add(new ItemStack(Item.redstoneTorch, 3));
                        kit.add(Item.stoneAxe);
                        kit.add(Item.leatherHelmetProjProt1);
                        kit.add(Item.leatherChestProjProt1);
                        return kit;

                    case 7:
                        kit.add(new ItemStack(Item.minecart, 1));
                        kit.add(new ItemStack(Item.poweredRail, 3));
                        kit.add(new ItemStack(Item.rail, 22));
                        kit.add(new ItemStack(Item.redstoneTorch, 3));
                        kit.add(Item.ironAxe);
                        kit.add(Item.leatherHelmetProjProt1);
                        kit.add(Item.leatherChestProjProt1);
                        kit.add(new ItemStack(Item.TNT, 1));
                        return kit;

                    case 8:
                        kit.add(new ItemStack(Item.minecart, 1));
                        kit.add(new ItemStack(Item.poweredRail, 4));
                        kit.add(new ItemStack(Item.rail, 26));
                        kit.add(new ItemStack(Item.redstoneTorch, 4));
                        kit.add(Item.ironAxe);
                        kit.add(Item.leatherHelmetProjProt1);
                        kit.add(Item.leatherChestProjProt1);
                        kit.add(new ItemStack(Item.TNT, 1));
                        kit.add(Item.leatherBootsProt1);
                        return kit;

                    case 9:
                        kit.add(new ItemStack(Item.minecart, 1));
                        kit.add(new ItemStack(Item.poweredRail, 5));
                        kit.add(new ItemStack(Item.rail, 30));
                        kit.add(new ItemStack(Item.redstoneTorch, 5));
                        kit.add(Item.ironAxe);
                        kit.add(Item.leatherHelmetProjProt1);
                        kit.add(Item.leatherChestProjProt1);
                        kit.add(new ItemStack(Item.TNT, 2));
                        kit.add(Item.leatherBootsProt1);
                        kit.add(Item.leatherLeggingsProt1);
                        kit.add(Item.fishingRod);
                        return kit;

                    case 10:
                        kit.add(new ItemStack(Item.minecart, 1));
                        kit.add(new ItemStack(Item.storageMinecart, 1));
                        kit.add(new ItemStack(Item.poweredRail, 8));
                        kit.add(new ItemStack(Item.rail, 40));
                        kit.add(new ItemStack(Item.redstoneTorch, 8));
                        kit.add(Item.ironSword);
                        kit.add(Item.leatherHelmetProjProt2);
                        kit.add(Item.leatherChestProjProt2);
                        kit.add(new ItemStack(Item.TNT, 3));
                        kit.add(Item.ironBoots);
                        kit.add(Item.leatherLeggingsProt1);
                        kit.add(Item.fishingRodSilk1Unbreaking2);
                        return kit;
                    //</editor-fold>
                }
//</editor-fold>
            case BAKER:
                //<editor-fold desc="[Baker]">
                switch(level){
                    //<editor-fold desc="[1-5]">
                    case 1:
                        kit.add(new ItemStack(Item.bread, 2));
                        return kit;
                    case 2:
                        kit.add(new ItemStack(Item.bread, 2));
                        kit.add(Item.leatherHelmet);
                        return kit;
                    case 3:
                        kit.add(Item.leatherHelmet);
                        kit.add(Item.woodenAxe);
                        kit.add(new ItemStack(Item.bread, 2));
                        kit.add(new ItemStack(Item.cake, 1));
                        return kit;
                    case 4:
                        kit.add(Item.leatherChest);
                        kit.add(Item.leatherHelmet);
                        kit.add(Item.woodenAxe);
                        kit.add(new ItemStack(Item.bread, 2));
                        kit.add(new ItemStack(Item.cake, 2));
                        return kit;
                    case 5:
                        kit.add(Item.leatherChest);
                        kit.add(Item.leatherHelmet);
                        kit.add(Item.woodenAxe);
                        kit.add(new ItemStack(Item.bread, 3));
                        kit.add(new ItemStack(Item.cake, 3));
                        return kit;
                    //</editor-fold>

                    //<editor-fold desc="[6-10]">
                    case 6:
                        kit.add(Item.leatherChest);
                        kit.add(Item.leatherHelmet);
                        kit.add(Item.stoneAxe);
                        kit.add(new ItemStack(Item.bread, 2));
                        kit.add(new ItemStack(Item.cake, 2));
                        kit.add(new ItemStack(Item.resistanceSplashPotion2_11, 1));
                        return kit;
                    case 7:
                        kit.add(Item.leatherChest);
                        kit.add(Item.leatherHelmet);
                        kit.add(Item.stoneAxe);
                        kit.add(new ItemStack(Item.bread, 3));
                        kit.add(new ItemStack(Item.cake, 3));
                        kit.add(new ItemStack(Item.resistanceSplashPotion2_11, 1));
                        kit.add(new ItemStack(Item.goldenApple, 1));
                        return kit;
                    case 8:
                        kit.add(Item.leatherChest);
                        kit.add(Item.leatherHelmet);
                        kit.add(Item.stoneSword);
                        kit.add(new ItemStack(Item.bread, 4));
                        kit.add(new ItemStack(Item.cake, 4));
                        kit.add(new ItemStack(Item.resistanceSplashPotion2_11, 2));
                        kit.add(new ItemStack(Item.goldenApple, 1));
                        return kit;
                    case 9:
                        kit.add(Item.leatherChest);
                        kit.add(Item.leatherHelmet);
                        kit.add(Item.stoneSword);
                        kit.add(new ItemStack(Item.bread, 4));
                        kit.add(new ItemStack(Item.cake, 45));
                        kit.add(new ItemStack(Item.resistanceSplashPotion2_11, 2));
                        kit.add(new ItemStack(Item.goldenApple, 2));
                        return kit;
                    case 10:
                        kit.add(Item.leatherChest);
                        kit.add(Item.leatherHelmet);
                        kit.add(Item.stoneSword);
                        kit.add(new ItemStack(Item.bread, 4));
                        kit.add(new ItemStack(Item.cake, 45));
                        kit.add(new ItemStack(Item.resistanceSplashPotion2_11, 3));
                        kit.add(new ItemStack(Item.goldenApple, 3));
                        return kit;
                    //</editor-fold>
                }
            //</editor-fold>
            case FISHERMAN:
                //<editor-fold desc="[Fisherman]">
                switch(level){
                    //<editor-fold desc="[1-5]">
                    case 1:
                        kit.add(Item.fishingRod);
                        kit.add(new ItemStack(Item.fish, 2));
                        return kit;
                    case 2:
                        kit.add(Item.fishingRodUnbreaking1);
                        kit.add(new ItemStack(Item.cookedFish, 2));
                        return kit;
                    case 3:
                        kit.add(Item.fishingRodUnbreaking1Sharp1);
                        kit.add(new ItemStack(Item.cookedFish, 3));
                        return kit;
                    case 4:
                        kit.add(Item.fishingRodUnbreaking1Sharp1);
                        kit.add(new ItemStack(Item.cookedFish, 4));
                        kit.add(Item.chainHelmet);
                        return kit;
                    case 5:
                        kit.add(Item.fishingRodUnbreaking1Sharp2);
                        kit.add(new ItemStack(Item.cookedFish, 4));
                        kit.add(Item.chainHelmet);
                        return kit;
                    //</editor-fold>

                    //<editor-fold desc="[6-10]">
                    case 6:
                        kit.add(Item.fishingRodUnbreaking1Sharp3);
                        kit.add(new ItemStack(Item.cookedFish, 4));
                        kit.add(Item.chainHelmet);
                        return kit;
                    case 7:
                        kit.add(Item.fishingRodUnbreaking1Sharp3);
                        kit.add(new ItemStack(Item.cookedFish, 4));
                        kit.add(Item.chainHelmet);
                        kit.add(Item.leatherChest);
                        return kit;
                    case 8:
                        kit.add(Item.fishingRodUnbreaking1Sharp4);
                        kit.add(new ItemStack(Item.cookedFish, 4));
                        kit.add(Item.chainHelmet);
                        kit.add(Item.leatherChest);
                        kit.add(Item.goldLeggings);
                        kit.add(Item.chainBoots);
                        return kit;
                    case 9:
                        kit.add(Item.fishingRodUnbreaking1Sharp4);
                        kit.add(new ItemStack(Item.cookedFish, 4));
                        kit.add(Item.chainHelmetResp1);
                        kit.add(Item.chainChest);
                        kit.add(Item.goldLeggings);
                        kit.add(Item.chainBoots);
                        return kit;
                    case 10:
                        kit.add(Item.fishingRodUnbreaking1Sharp5lots3);
                        kit.add(new ItemStack(Item.cookedFish, 4));
                        kit.add(Item.chainHelmetResp3);
                        kit.add(Item.chainChest);
                        kit.add(Item.chainLeggings);
                        kit.add(Item.chainBoots);
                        return kit;
                    //</editor-fold>
                }
//</editor-fold>
            case KNIGHT:
                //<editor-fold desc="[Scout]">
                switch(level){
                    //<editor-fold desc="[1-5]">
                    case 1:
                        kit.add(Item.woodenSword);
                        return kit;
                    case 2:
                        kit.add(Item.woodenSword);
                        kit.add(Item.leatherHelmet);
                        return kit;
                    case 3:
                        kit.add(Item.woodenSword);
                        kit.add(Item.goldHelmet);
                        return kit;
                    case 4: //todo why is this the same as 3
                        kit.add(Item.woodenSword);
                        kit.add(Item.goldHelmet);
                        return kit;
                    case 5:
                        kit.add(Item.woodenSword);
                        kit.add(Item.goldHelmet);
                        kit.add(Item.goldBoots);
                        return kit;
                    //</editor-fold>

                    //<editor-fold desc="[6-10]">
                    case 6:
                        kit.add(Item.woodenSword);
                        kit.add(Item.goldHelmet);
                        kit.add(Item.goldBoots);
                        kit.add(Item.leatherChest);
                        return kit;
                    case 7:
                        kit.add(Item.stoneSwordUnbreaking1);
                        kit.add(Item.goldHelmet);
                        kit.add(Item.goldBoots);
                        kit.add(Item.goldChest);
                        return kit;
                    case 8:
                        kit.add(Item.stoneSwordUnbreaking1);
                        kit.add(Item.goldHelmet);
                        kit.add(Item.goldBoots);
                        kit.add(Item.goldChest);
                        kit.add(Item.leatherLeggings);
                        return kit;
                    case 9:
                        kit.add(Item.stoneSword);
                        kit.add(Item.goldHelmetProt1);
                        kit.add(Item.goldBootsProt1);
                        kit.add(Item.goldChest);
                        kit.add(Item.goldLeggings);
                        kit.add(new ItemStack(Item.goldenCarrot, 1));
                        return kit;
                    case 10:
                        kit.add(Item.ironSwordUnbreaking1);
                        kit.add(Item.goldHelmetProt1);
                        kit.add(Item.goldBootsProt2);
                        kit.add(Item.goldChestProt1);
                        kit.add(Item.goldLeggings);
                        kit.add(new ItemStack(Item.goldenCarrot, 2));
                        return kit;
                    //</editor-fold>
                }
                //</editor-fold>
            case ARMORER:
                //<editor-fold desc="[Armorer]">
                switch(level){
                    //<editor-fold desc="[1-5]">
                    case 1:
                        kit.add(Item.leatherChest);
                        kit.add(new ItemStack(Item.cookie, 1));
                        return kit;
                    case 2:
                        kit.add(Item.leatherChest);
                        kit.add(new ItemStack(Item.cookie, 2));
                        kit.add(Item.leatherHelmet);
                        return kit;
                    case 3:
                        kit.add(Item.leatherChest);
                        kit.add(new ItemStack(Item.cookie, 3));
                        kit.add(Item.leatherHelmet);
                        kit.add(Item.leatherBoots);
                        return kit;
                    case 4:
                        kit.add(Item.leatherChest);
                        kit.add(new ItemStack(Item.cookie, 4));
                        kit.add(Item.leatherHelmet);
                        kit.add(Item.leatherBoots);
                        kit.add(Item.leatherLeggings);
                        return kit;
                    case 5:
                        kit.add(Item.leatherChestProt1BProt1);
                        kit.add(new ItemStack(Item.cookie, 5));
                        kit.add(Item.leatherHelmet);
                        kit.add(Item.leatherBoots);
                        kit.add(Item.leatherLeggingsProt1BProt1);
                        return kit;
                    //</editor-fold>

                    //<editor-fold desc="[6-10]">
                    case 6:
                        kit.add(Item.leatherChestProt2BProt1);
                        kit.add(new ItemStack(Item.cookie, 6));
                        kit.add(Item.leatherHelmetProt1ProjProt1);
                        kit.add(Item.leatherBootsProt1);
                        kit.add(Item.leatherLeggingsProt1fProt3);
                        return kit;
                    case 7:
                        kit.add(Item.leatherChestProt3BProt3);
                        kit.add(new ItemStack(Item.cookie, 7));
                        kit.add(Item.leatherHelmetProt2ProjProt2);
                        kit.add(Item.leatherBootsProt1ff2);
                        kit.add(Item.leatherLeggingsProt2fProt3);
                        return kit;
                    case 8:
                        kit.add(Item.leatherChestProt3BProt4);
                        kit.add(new ItemStack(Item.cookie, 8));
                        kit.add(Item.leatherHelmetProt2ProjProt3);
                        kit.add(Item.leatherBootsProt2ff3);
                        kit.add(Item.leatherLeggingsProt3fProt4);
                        return kit;
                    case 9:
                        kit.add(Item.leatherChestProt4BProt5);
                        kit.add(new ItemStack(Item.cookie, 8));
                        kit.add(Item.leatherHelmetProt2ProjProt4);
                        kit.add(Item.leatherBootsProt2ff5);
                        kit.add(Item.leatherLeggingsProt3fProt5);
                        return kit;
                    case 10:
                        kit.add(Item.leatherChestProt4BProt10);
                        kit.add(new ItemStack(Item.cookie, 8));
                        kit.add(Item.leatherHelmetProt3ProjProt5);
                        kit.add(Item.leatherBootsProt2ff6);
                        kit.add(Item.leatherLeggingsProt4fProt10);
                        return kit;
                    //</editor-fold>
                }
            //</editor-fold>
            default:
                return null;
        }

    }



}


