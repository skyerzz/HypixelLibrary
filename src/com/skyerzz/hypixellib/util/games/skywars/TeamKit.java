package com.skyerzz.hypixellib.util.games.skywars;

import com.skyerzz.hypixellib.util.CURRENCY;
import com.skyerzz.hypixellib.util.item.Item;
import com.skyerzz.hypixellib.util.item.ItemStack;
import com.skyerzz.hypixellib.util.item.Material;

import java.util.ArrayList;

/**
 * Created by Skyerzz-LAPOTOP on 21/12/2016.
 */
public enum TEAM_KIT {
    DEFAULT("Default", null),
    ARMORER("Armorer", RARITY.COMMON),
    ARMORSMITH("ArmorSmith", RARITY.COMMON),
    BASEBALL_PLAYER("Baseball Player", RARITY.RARE),
    CANNONEER("Cannoneer", RARITY.LEGENDARY),
    ECOLOGIST("Ecologist", RARITY.COMMON),
    ENDERMAN("Enderman", RARITY.LEGENDARY),
    ENCHANTER("Enchanter", RARITY.RARE),
    GUARDIAN("Guardian", RARITY.LEGENDARY),
    HEALER("Healer", RARITY.COMMON),
    HUNTER("Hunter", RARITY.RARE),
    KNIGHT("Knight", RARITY.COMMON),
    PHARAOH("Pharaoh", RARITY.RARE),
    ROOKIE("Rookie", RARITY.COMMON),
    SCOUT("Scout", RARITY.COMMON),
    SNOWMAN("Snowman", RARITY.RARE),
    SPELEOLOGIST("Speleologist", RARITY.RARE),
    BATGUY("Batguy", RARITY.COMMON),
    DISCO("Disco", RARITY.COMMON),
    ENERGIX("Energix", RARITY.COMMON),
    FROG("Frog", RARITY.COMMON),
    GRENADE("Grenade", RARITY.COMMON);

    private String displayName;
    private RARITY rarity;

    TEAM_KIT(String displayName, RARITY rarity){
        this.displayName = displayName;
        this.rarity = rarity;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(TEAM_KIT item: TEAM_KIT.values()){
            list.add(item.name());
        }
        return list;
    }

    public String getDisplayName(){
        return displayName;
    }

    public int getCost(){
        switch(this.rarity){
            case COMMON:
                return 15000;
            case RARE:
                return 20000;
            case LEGENDARY:
                return 30000;
        }
        return -1;
    }

    public RARITY getRarity(){
        return rarity;
    }

    public CURRENCY getCurrencyType(){ return CURRENCY.COINS; }

    public ArrayList<ItemStack> getKitItems(){
        ArrayList<ItemStack> kit = new ArrayList<>();
        switch(this){
            case ARMORER:
                kit.add(Item.goldChest);
                kit.add(Item.goldLeggings);
                kit.add(Item.goldBoots);
                return kit;
            case ARMORSMITH:
                kit.add(Item.anvil);
                kit.add(new ItemStack(Item.enchantedBookProt3Sharp1, 1));
                kit.add(Item.diamondHelmet);
                kit.add(new ItemStack(Item.expBottle, 32));
                return kit;
            case BASEBALL_PLAYER:
                kit.add(Item.woodSwordKnockback2);
                return kit;
            case CANNONEER:
                kit.add(new ItemStack(Item.TNT, 16));
                kit.add(new ItemStack(Item.redstone, 32));
                kit.add(Item.ironBootsFf3Bprot3);
                kit.add(Item.waterBucket);
                return kit;
            case ECOLOGIST:
                kit.add(Item.ironAxeEff1);
                kit.add(new ItemStack(Item.oakLog, 16));
                return kit;
            case ENDERMAN:
                kit.add(new ItemStack(new Item("Corrupted Pearl (60s cooldown)", Material.ENDER_PEARL), 1));
                return kit;
            case ENCHANTER:
                kit.add(Item.enchantmentTable);
                kit.add(new ItemStack(Item.expBottle, 64));
                kit.add(new ItemStack(Item.bookCase, 8));
                return kit;
            case GUARDIAN:
                kit.add(new ItemStack(Item.obsidian, 6));
                kit.add(new ItemStack(Item.resistancePotion1_10, 2));
                kit.add(new ItemStack(Item.zombieEgg, 2));
                kit.add(new ItemStack(Item.skeletonEgg, 2));
                return kit;
            case HEALER:
                kit.add(new ItemStack(Item.instantHealthSplashPotion1, 3));
                //todo find out regen potion value
                return kit;
            case HUNTER:
                kit.add(Item.bow);
                kit.add(new ItemStack(Item.arrow, 10));
                return kit;
            case KNIGHT:
                kit.add(Item.goldSwordUnbreaking5Sharp2);
                kit.add(Item.goldHelmetProt1);
                return kit;
            case PHARAOH:
                kit.add(Item.goldHelmet);
                kit.add(Item.whiteLeatherChest);
                kit.add(Item.whiteLeatherLeggings);
                kit.add(new ItemStack(Item.beacon));
                kit.add(new ItemStack(Item.emeraldBlock, 42));
                return kit;
            case ROOKIE:
                kit.add(Item.leatherHelmet);
                kit.add(Item.leatherChest);
                kit.add(Item.leatherLeggings);
                kit.add(Item.leatherBoots);
                kit.add(Item.woodenSword);
                kit.add(new ItemStack(Item.glass, 16));
                kit.add(new ItemStack(Item.steak, 1));
                return kit;
            case SCOUT:
                kit.add(Item.stoneSword);
                kit.add(new ItemStack(Item.speedPotion2_90, 3));
                return kit;
            case SNOWMAN:
                kit.add(new ItemStack(Item.snowball, 16));
                kit.add(new ItemStack(Item.snow, 2));
                kit.add(new ItemStack(Item.pumpkin));
                kit.add(Item.ironShovelUnbreaking3);
                return kit;
            case SPELEOLOGIST:
                kit.add(Item.ironPickEff3Sharp1Unbreaking3);
                kit.add(new ItemStack(Item.stone, 16));
                return kit;
            case BATGUY:
                kit.add(Item.leatherHelmet);
                kit.add(Item.leatherChest);
                kit.add(Item.leatherLeggings);
                kit.add(Item.leatherBoots);
                kit.add(new ItemStack(Item.batEgg, 5));
                //todo find out what Batguy's potion is
                return kit;
            case DISCO:
                kit.add(Item.goldHelmetProjProt4);
                kit.add(Item.leatherChestProt2Thorns3);
                kit.add(Item.leatherLeggings);
                kit.add(Item.leatherBootsFf10);
                kit.add(new ItemStack(Item.jukebox, 1));
                kit.add(new ItemStack(Item.noteBlock, 12));
                kit.add(new ItemStack(new Item("Random Music Disc", Material.RECORD_3)));
                return kit;
            case ENERGIX:
                //todo find out potion of strength length + type
                return kit;
            case FROG:
                kit.add(Item.leatherChest);
                kit.add(Item.leatherLeggings);
                kit.add(Item.leatherBoots);
                //todo find frogs potion durations and effects
                //todo make a frog head (JUST DO IT)
                return kit;
            case GRENADE:
                kit.add(new ItemStack(Item.creeperEgg, 1));//todo find if powered creeper or not
                return kit;
        }
        return kit;
    }
}
