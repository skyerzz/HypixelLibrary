package com.skyerzz.hypixellib.util.games.blitz;

import com.skyerzz.hypixellib.util.CURRENCY;
import com.skyerzz.hypixellib.util.RANK;
import com.skyerzz.hypixellib.util.item.Item;
import com.skyerzz.hypixellib.util.item.ItemStack;

import java.util.ArrayList;

/**
 * Created by sky on 19-11-2016.
 */
public enum ADVANCED_KIT {
    HORSETAMER("Horsetamer", 45),
    ASTRONAUT("Astronaut", 20),
    TROLL("Troll", 15),
    REAPER("Reaper", 45),
    REDDRAGON("RedDragon", 35),
    TOXICOLOGIST("Toxicologist", 25),
    ROGUE("Rogue", 20),
    SLIMEYSLIME("SlimeySlike", 15),
    JOCKEY("Jockey", 0),
    GOLEM("Golem", 75),
    SHADOW_KNIGHT("Shadow Knight", 10),
    PIGMAN("Pigman", 10),
    PALADIN("Paladin", 10),
    NECROMANCER("Necromancer", 25),
    FLORIST("Florist", 10),
    ARACHNOLOGIST("Arachnologist", 25),
    BLAZE("Blaze", 20),
    WOLFTAMER("Wolftamer", 20),
    TIM("Tim", 25),
    FARMER("Farmer", 25),
    CREEPERTAMER("Creepertamer", 15),
    SNOWMAN("Snowman", 55);

    private String displayName;
    private int requiredLevel;

    ADVANCED_KIT(String displayName, int level){
        this.displayName = displayName;
        this.requiredLevel = level;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(ADVANCED_KIT item: ADVANCED_KIT.values()){
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

    public RANK getRankRequirement(){ return RANK.NONE; }

    public int getRequiredLevel(){ return requiredLevel;}

    public ArrayList<ItemStack> getKitItems(int level){
        if(level < 1 || level > 10){
            return null;
        }
        ArrayList<ItemStack> kit = new ArrayList<>();
        switch(this) {
            case HORSETAMER:
                //<editor-fold desc="[Horsetamer]">
                switch (level) {
                    //<editor-fold desc="[1-5]">
                    case 1:
                        kit.add(new ItemStack(Item.horseEgg, 1));
                        kit.add(new ItemStack(Item.apple, 1));
                        kit.add(Item.saddle);
                        return kit;
                    case 2:
                        kit.add(new ItemStack(Item.horseEgg, 1));
                        kit.add(new ItemStack(Item.apple, 1));
                        kit.add(Item.saddle);
                        kit.add(Item.woodAxeEff1);
                        return kit;
                    case 3:
                        kit.add(new ItemStack(Item.horseEgg, 1));
                        kit.add(new ItemStack(Item.apple, 2));
                        kit.add(Item.saddle);
                        kit.add(Item.woodAxeEff1);
                        return kit;
                    case 4:
                        kit.add(new ItemStack(Item.horseEgg, 1));
                        kit.add(new ItemStack(Item.apple, 2));
                        kit.add(Item.saddle);
                        kit.add(Item.stoneAxeEff1);
                        return kit;
                    case 5:
                        kit.add(new ItemStack(Item.horseEgg, 1));
                        kit.add(new ItemStack(Item.apple, 3));
                        kit.add(Item.saddle);
                        kit.add(Item.stoneAxeEff1);
                        kit.add(Item.ironBoots);
                        return kit;
                    //</editor-fold>

                    //<editor-fold desc="[6-10]">
                    case 6:
                        kit.add(new ItemStack(Item.horseEgg, 1));
                        kit.add(new ItemStack(Item.apple, 4));
                        kit.add(Item.saddle);
                        kit.add(Item.stoneAxeEff1);
                        kit.add(Item.ironBoots);
                        kit.add(Item.greenLeatherLeggings);
                        kit.add(Item.ironHorseArmor);
                        return kit;
                    case 7:
                        kit.add(new ItemStack(Item.horseEgg, 1));
                        kit.add(new ItemStack(Item.apple, 4));
                        kit.add(Item.saddle);
                        kit.add(Item.stoneAxeEff1);
                        kit.add(Item.ironBoots);
                        kit.add(Item.greenLeatherLeggings);
                        kit.add(Item.ironHorseArmor);
                        kit.add(Item.greenLeatherChest);
                        return kit;
                    case 8:
                        kit.add(new ItemStack(Item.horseEgg, 1));
                        kit.add(new ItemStack(Item.apple, 4));
                        kit.add(Item.saddle);
                        kit.add(Item.ironAxeEff1);
                        kit.add(Item.ironBoots);
                        kit.add(Item.greenLeatherLeggings);
                        kit.add(Item.goldHorseArmor);
                        kit.add(Item.greenLeatherChest);
                        kit.add(Item.greenLeatherHelmet);
                        return kit;
                    case 9:
                        kit.add(new ItemStack(Item.horseEgg, 1));
                        kit.add(new ItemStack(Item.apple, 6));
                        kit.add(Item.saddle);
                        kit.add(Item.ironAxeEff1);
                        kit.add(Item.diamondBoots);
                        kit.add(Item.greenLeatherLeggings);
                        kit.add(Item.diamondHorseArmor);
                        kit.add(Item.greenLeatherChest);
                        kit.add(Item.greenLeatherHelmet);
                        return kit;
                    case 10:
                        kit.add(new ItemStack(Item.horseEgg, 1));
                        kit.add(new ItemStack(Item.apple, 8));
                        kit.add(Item.saddle);
                        kit.add(Item.diamondAxeEff1);
                        kit.add(Item.diamondBootsProt2);
                        kit.add(Item.greenLeatherLeggings);
                        kit.add(Item.diamondHorseArmor);
                        kit.add(Item.greenLeatherChest);
                        kit.add(Item.greenLeatherHelmet);
                        return kit;
                    //</editor-fold>
                }
                //</editor-fold>
            case ASTRONAUT:
                //<editor-fold desc="[Astronaut]">
                switch (level) {
                    //<editor-fold desc="[1-5]">
                    case 1:
                        kit.add(Item.chainBootsFf2);
                        return kit;
                    case 2:
                        kit.add(Item.chainBootsFf2);
                        kit.add(new ItemStack(Item.resistancePotion1_12, 1));
                        return kit;
                    case 3:
                        kit.add(Item.chainBootsFf2);
                        kit.add(new ItemStack(Item.resistancePotion1_12, 1));
                        kit.add(Item.woodenAxe);
                        return kit;
                    case 4:
                        kit.add(Item.chainBootsFf2);
                        kit.add(new ItemStack(Item.resistancePotion1_12, 2));
                        kit.add(Item.woodenAxe);
                        return kit;
                    case 5:
                        kit.add(Item.chainBootsFf2);
                        kit.add(new ItemStack(Item.resistancePotion1_13, 2));
                        kit.add(Item.woodenAxe);
                        return kit;
                    //</editor-fold>

                    //<editor-fold desc="[6-10]">
                    case 6:
                        kit.add(Item.chainBootsFf4);
                        kit.add(new ItemStack(Item.resistancePotion1_13, 2));
                        kit.add(Item.woodenAxe);
                        return kit;
                    case 7:
                        kit.add(Item.chainBootsFf4);
                        kit.add(new ItemStack(Item.resistancePotion1_14, 2));
                        kit.add(Item.stoneAxe);
                        return kit;
                    case 8:
                        kit.add(Item.chainBootsFf5);
                        kit.add(new ItemStack(Item.resistancePotion1_14, 2));
                        kit.add(Item.stoneAxe);
                        kit.add(Item.chainChest);
                        return kit;
                    case 9:
                        kit.add(Item.ironBootsFf6);
                        kit.add(new ItemStack(Item.resistancePotion1_15, 3));
                        kit.add(Item.stoneAxe);
                        kit.add(Item.chainChest);
                        kit.add(Item.leatherLeggings);
                        return kit;
                    case 10:
                        kit.add(Item.ironBootsFf10);
                        kit.add(new ItemStack(Item.resistancePotion1_17, 3));
                        kit.add(Item.ironAxe);
                        kit.add(Item.chainChest);
                        kit.add(Item.chainLeggings);
                        return kit;
                    //</editor-fold>
                }
                //</editor-fold>
            case TROLL:
                //<editor-fold desc="[Troll]">
                switch (level) {
                    //<editor-fold desc="[1-5]">
                    case 1:
                        kit.add(new ItemStack(Item.cobweb, 2));
                        kit.add(new ItemStack(Item.snowball, 3));
                        return kit;
                    case 2:
                        kit.add(new ItemStack(Item.cobweb, 3));
                        kit.add(new ItemStack(Item.snowball, 9));
                        kit.add(new ItemStack(Item.ocelotEgg, 1));
                        return kit;
                    case 3:
                        kit.add(new ItemStack(Item.cobweb, 4));
                        kit.add(new ItemStack(Item.snowball, 16));
                        kit.add(new ItemStack(Item.ocelotEgg, 1));
                        kit.add(new ItemStack(Item.firework, 2));
                        return kit;
                    case 4:
                        kit.add(new ItemStack(Item.cobweb, 5));
                        kit.add(new ItemStack(Item.snowball, 24));
                        kit.add(new ItemStack(Item.ocelotEgg, 1));
                        kit.add(new ItemStack(Item.firework, 4));
                        kit.add(Item.eyeOfEnderSharp1);
                        return kit;
                    case 5:
                        kit.add(new ItemStack(Item.cobweb, 5));
                        kit.add(new ItemStack(Item.snowball, 32));
                        kit.add(new ItemStack(Item.ocelotEgg, 1));
                        kit.add(new ItemStack(Item.firework, 7));
                        kit.add(Item.eyeOfEnderSharp2);
                        kit.add(Item.pinkLeatherChestloot3);
                        return kit;
                    //</editor-fold>

                    //<editor-fold desc="[6-10]">
                    case 6:
                        kit.add(new ItemStack(Item.cobweb, 6));
                        kit.add(new ItemStack(Item.snowball, 64));
                        kit.add(new ItemStack(Item.ocelotEgg, 1));
                        kit.add(new ItemStack(Item.firework, 10));
                        kit.add(Item.eyeOfEnderSharp3);
                        kit.add(Item.pinkLeatherChestloot3);
                        return kit;
                    case 7:
                        kit.add(new ItemStack(Item.cobweb, 6));
                        kit.add(new ItemStack(Item.snowball, 64));
                        kit.add(new ItemStack(Item.ocelotEgg, 1));
                        kit.add(new ItemStack(Item.firework, 10));
                        kit.add(Item.eyeOfEnderSharp3);
                        kit.add(Item.pinkLeatherChestloot3);
                        kit.add(new ItemStack(Item.fireCharge, 2));
                        kit.add(Item.pinkLeatherBootsloot3);
                        return kit;
                    case 8:
                        kit.add(new ItemStack(Item.cobweb, 6));
                        kit.add(new ItemStack(Item.snowball, 64));
                        kit.add(new ItemStack(Item.ocelotEgg, 1));
                        kit.add(new ItemStack(Item.firework, 12));
                        kit.add(Item.eyeOfEnderSharp3);
                        kit.add(Item.pinkLeatherChestloot3);
                        kit.add(new ItemStack(Item.fireCharge, 2));
                        kit.add(Item.pinkLeatherBootsloot3);
                        kit.add(Item.pinkLeatherLeggingsloot3);
                        return kit;
                    case 9:
                        kit.add(new ItemStack(Item.cobweb, 6));
                        kit.add(new ItemStack(Item.snowball, 64));
                        kit.add(new ItemStack(Item.ocelotEgg, 2));
                        kit.add(new ItemStack(Item.firework, 12));
                        kit.add(Item.eyeOfEnderSharp4);
                        kit.add(Item.pinkLeatherChestloot3);
                        kit.add(new ItemStack(Item.fireCharge, 2));
                        kit.add(Item.pinkLeatherBootsloot3);
                        kit.add(Item.pinkLeatherLeggingsloot3);
                        kit.add(Item.pinkLeatherHelmetloot3);
                        return kit;
                    case 10:
                        kit.add(new ItemStack(Item.cobweb, 6));
                        kit.add(new ItemStack(Item.snowball, 64));
                        kit.add(new ItemStack(Item.ocelotEgg, 2));
                        kit.add(new ItemStack(Item.firework, 12));
                        kit.add(Item.eyeOfEnderSharp4);
                        kit.add(Item.pinkLeatherChestloot3);
                        kit.add(new ItemStack(Item.fireCharge, 3));
                        kit.add(Item.pinkLeatherBootsloot3);
                        kit.add(Item.pinkLeatherLeggingsloot3);
                        kit.add(Item.pinkLeatherHelmetloot3);
                        kit.add(new ItemStack(Item.invisPotion1_20, 1));
                        kit.add(new ItemStack(Item.witchEgg, 1));
                        return kit;
                    //</editor-fold>
                }
                //</editor-fold>
            case REAPER:
                //<editor-fold desc="[Reaper]">
                switch (level) {
                    //<editor-fold desc="[1-5]">
                    case 1:
                        kit.add(Item.woodHoeSharp1);
                        return kit;
                    case 2:
                        kit.add(Item.goldHoeSharp2);
                        kit.add(Item.leatherLeggings);
                        return kit;
                    case 3:
                        kit.add(Item.goldHoeSharp2);
                        kit.add(Item.leatherLeggings);
                        kit.add(Item.leatherHelmet);
                        return kit;
                    case 4:
                        kit.add(Item.goldHoeSharp2);
                        kit.add(Item.leatherLeggings);
                        kit.add(Item.leatherHelmetProt1);
                        return kit;
                    case 5:
                        kit.add(Item.stoneHoeSharp3);
                        kit.add(Item.leatherLeggings);
                        kit.add(Item.ironHelmet);
                        return kit;
                    //</editor-fold>

                    //<editor-fold desc="[6-10]">
                    case 6:
                        kit.add(Item.stoneHoeSharp3);
                        kit.add(Item.chainLeggings);
                        kit.add(Item.ironHelmet);
                        kit.add(new ItemStack(Item.hungerSplashPotion1_9, 1));
                        return kit;
                    case 7:
                        kit.add(Item.stoneHoeSharp3);
                        kit.add(Item.chainLeggings);
                        kit.add(Item.ironHelmetProt1);
                        kit.add(new ItemStack(Item.hungerSplashPotion1_9, 1));
                        return kit;
                    case 8:
                        kit.add(Item.ironHoeSharp4);
                        kit.add(Item.chainLeggingsProt1);
                        kit.add(Item.ironHelmetProt1);
                        kit.add(new ItemStack(Item.hungerSplashPotion1_9, 2));
                        return kit;
                    case 9:
                        kit.add(Item.ironHoeSharp4);
                        kit.add(Item.chainLeggingsProt1);
                        kit.add(Item.ironHelmetProt2);
                        kit.add(new ItemStack(Item.hungerSplashPotion1_9, 2));
                        kit.add(new ItemStack(Item.saturationPotion1_25, 1));
                        return kit;
                    case 10:
                        kit.add(Item.diamondHoeSharp5);
                        kit.add(Item.chainLeggingsProt2);
                        kit.add(Item.ironHelmetProt2);
                        kit.add(new ItemStack(Item.hungerSplashPotion1_9, 3));
                        kit.add(new ItemStack(Item.saturationPotion1_25, 2));
                        return kit;
                    //</editor-fold>
                }
                //</editor-fold>
            case REDDRAGON:
                //<editor-fold desc="[Reddragon]">
                switch (level) {
                    //<editor-fold desc="[1-5]">
                    case 1:
                        kit.add(new ItemStack(Item.magmaCubeEgg, 1));
                        return kit;
                    case 2:
                        kit.add(new ItemStack(Item.magmaCubeEgg, 1));
                        kit.add(new ItemStack(Item.fireResistanceSplashPotion1_10, 1));
                        return kit;
                    case 3:
                        kit.add(new ItemStack(Item.magmaCubeEgg, 1));
                        kit.add(new ItemStack(Item.fireResistanceSplashPotion1_10, 1));
                        kit.add(Item.redLeatherHelmetFProt3);
                        return kit;
                    case 4:
                        kit.add(new ItemStack(Item.magmaCubeEgg, 2));
                        kit.add(new ItemStack(Item.fireResistanceSplashPotion1_10, 1));
                        kit.add(Item.redLeatherHelmetFProt3);
                        kit.add(Item.woodenAxe);
                        return kit;
                    case 5:
                        kit.add(new ItemStack(Item.magmaCubeEgg, 2));
                        kit.add(new ItemStack(Item.fireResistanceSplashPotion1_12, 1));
                        kit.add(Item.redLeatherHelmetFProt3);
                        kit.add(Item.woodenAxe);
                        kit.add(Item.redLeatherChestFProt3);
                        return kit;
                    //</editor-fold>

                    //<editor-fold desc="[6-10]">
                    case 6:
                        kit.add(new ItemStack(Item.magmaCubeEgg, 2));
                        kit.add(new ItemStack(Item.fireResistanceSplashPotion1_12, 1));
                        kit.add(Item.redLeatherHelmetFProt3);
                        kit.add(Item.stoneAxe);
                        kit.add(Item.redLeatherChestFProt3);
                        kit.add(Item.ironBoots);
                        return kit;
                    case 7:
                        kit.add(new ItemStack(Item.magmaCubeEgg, 2));
                        kit.add(new ItemStack(Item.fireResistanceSplashPotion1_12, 2));
                        kit.add(Item.redLeatherHelmetFProt3);
                        kit.add(Item.stoneAxe);
                        kit.add(Item.redLeatherChestFProt3);
                        kit.add(Item.ironBootsFProt3);
                        kit.add(Item.redLeatherLeggingsFProt3);
                        return kit;
                    case 8:
                        kit.add(new ItemStack(Item.magmaCubeEgg, 3));
                        kit.add(new ItemStack(Item.fireResistanceSplashPotion1_12, 2));
                        kit.add(Item.ironHelmetFProt3);
                        kit.add(Item.stoneAxe);
                        kit.add(Item.redLeatherChestFProt3);
                        kit.add(Item.ironBootsFProt3);
                        kit.add(Item.redLeatherLeggingsFProt3);
                        kit.add(Item.flintNSteelUse2);
                        return kit;
                    case 9:
                        kit.add(new ItemStack(Item.magmaCubeEgg, 3));
                        kit.add(new ItemStack(Item.fireResistanceSplashPotion1_12, 2));
                        kit.add(Item.ironHelmetFProt3);
                        kit.add(Item.stoneSword);
                        kit.add(Item.redLeatherChestFProt3);
                        kit.add(Item.ironBootsFProt3);
                        kit.add(Item.redLeatherLeggingsFProt3);
                        kit.add(Item.flintNSteelUse2);
                        return kit;
                    case 10:
                        kit.add(new ItemStack(Item.magmaCubeEgg, 3));
                        kit.add(new ItemStack(Item.fireResistanceSplashPotion1_12, 3));
                        kit.add(Item.ironHelmetFProt3);
                        kit.add(Item.stoneSword);
                        kit.add(Item.chainChestFProt3);
                        kit.add(Item.diamondBootsFProt3);
                        kit.add(Item.redLeatherLeggingsFProt3);
                        kit.add(Item.flintNSteelUse4);
                        return kit;
                    //</editor-fold>
                }
                //</editor-fold>
            case TOXICOLOGIST:
                //<editor-fold desc="[Toxicologist]">
                switch (level) {
                    //<editor-fold desc="[1-5]">
                    case 1:
                    case 2:
                        kit.add(new ItemStack(Item.posionSplashPotion2_3, level));
                        return kit;
                    case 3:
                        kit.add(new ItemStack(Item.posionSplashPotion2_3, 2));
                        kit.add(new ItemStack(Item.regenPotion2_6, 1));
                        return kit;
                    case 4:
                        kit.add(new ItemStack(Item.posionSplashPotion2_3, 2));
                        kit.add(new ItemStack(Item.regenPotion2_6, 1));
                        kit.add(Item.woodenAxe);
                        return kit;
                    case 5://same as 6?
                    //</editor-fold>

                    //<editor-fold desc="[6-10]">
                    case 6:
                        kit.add(new ItemStack(Item.posionSplashPotion2_3, 3));
                        kit.add(new ItemStack(Item.regenPotion2_6, 1));
                        kit.add(Item.woodenAxe);
                        kit.add(Item.leatherLeggings);
                        return kit;
                    case 7:
                        kit.add(new ItemStack(Item.posionSplashPotion2_3, 3));
                        kit.add(new ItemStack(Item.regenPotion2_8, 1));
                        kit.add(Item.stoneAxe);
                        kit.add(Item.leatherLeggings);
                        kit.add(Item.leatherChest);
                        return kit;
                    case 8:
                        kit.add(new ItemStack(Item.posionSplashPotion2_3, 3));
                        kit.add(new ItemStack(Item.regenPotion2_8, 2));
                        kit.add(Item.stoneAxe);
                        kit.add(Item.leatherLeggings);
                        kit.add(Item.goldChest);
                        return kit;
                    case 9:
                        kit.add(new ItemStack(Item.posionSplashPotion2_3, 4));
                        kit.add(new ItemStack(Item.regenPotion2_8, 2));
                        kit.add(Item.stoneSword);
                        kit.add(Item.leatherLeggings);
                        kit.add(Item.goldChest);
                        return kit;
                    case 10:
                        kit.add(new ItemStack(Item.posionSplashPotion2_3, 5));
                        kit.add(new ItemStack(Item.regenPotion2_8, 3));
                        kit.add(Item.stoneSword);
                        kit.add(Item.leatherLeggings);
                        kit.add(Item.ironChest);
                        return kit;
                    //</editor-fold>
                }
                //</editor-fold>
            case ROGUE:
                //<editor-fold desc="[Rogue]">
                switch (level) {
                    //<editor-fold desc="[1-5]">
                    case 1:
                        kit.add(Item.woodSwordKnockback2Use0);
                        kit.add(Item.woodenAxe);
                        return kit;
                    case 2:
                        kit.add(Item.woodSwordKnockback2Use0);
                        kit.add(Item.woodenAxe);
                        kit.add(Item.blackLeatherHelmet);
                        return kit;
                    case 3:
                        kit.add(Item.woodSwordKnockback2Use0);
                        kit.add(Item.woodenAxe);
                        kit.add(Item.blackLeatherHelmet);
                        kit.add(Item.blackLeatherChest);
                        return kit;
                    case 4:
                        kit.add(Item.woodSwordKnockback3Use0);
                        kit.add(Item.woodenAxe);
                        kit.add(Item.blackLeatherHelmet);
                        kit.add(Item.blackLeatherChest);
                        kit.add(Item.blackLeatherBoots);
                        return kit;
                    case 5:
                        kit.add(Item.woodSwordKnockback3Use0);
                        kit.add(Item.woodenAxe);
                        kit.add(Item.blackLeatherHelmet);
                        kit.add(Item.blackLeatherChest);
                        kit.add(Item.blackLeatherBoots);
                        kit.add(new ItemStack(Item.weaknessSplashPotion3_9, 1));
                        return kit;
                    //</editor-fold>

                    //<editor-fold desc="[6-10]">
                    case 6:
                        kit.add(Item.woodSwordKnockback3Use0);
                        kit.add(Item.woodenSword);
                        kit.add(Item.blackLeatherHelmet);
                        kit.add(Item.blackLeatherChest);
                        kit.add(Item.chainBootsFf2);
                        kit.add(new ItemStack(Item.weaknessSplashPotion3_9, 1));
                        return kit;
                    case 7:
                        kit.add(Item.woodSwordKnockback3Use0);
                        kit.add(Item.woodSwordKnockback1);
                        kit.add(Item.blackLeatherHelmet);
                        kit.add(Item.blackLeatherChest);
                        kit.add(Item.chainBootsFf3);
                        kit.add(new ItemStack(Item.weaknessSplashPotion3_9, 1));
                        kit.add(new ItemStack(Item.invisSplashPotion1_9, 1));
                        return kit;
                    case 8:
                        kit.add(Item.woodSwordKnockback4Use0);
                        kit.add(Item.stoneSwordKnockback1);
                        kit.add(Item.blackLeatherHelmet);
                        kit.add(Item.blackLeatherChest);
                        kit.add(Item.chainBootsFf3);
                        kit.add(new ItemStack(Item.weaknessSplashPotion3_9, 2));
                        kit.add(new ItemStack(Item.invisSplashPotion1_9, 2));
                        return kit;
                    case 9:
                        kit.add(Item.woodSwordKnockback5Use0);
                        kit.add(Item.stoneSwordKnockback1);
                        kit.add(Item.blackLeatherHelmet);
                        kit.add(Item.blackLeatherChest);
                        kit.add(Item.ironBootsFf3);
                        kit.add(new ItemStack(Item.weaknessSplashPotion3_9, 2));
                        kit.add(new ItemStack(Item.invisSplashPotion1_9, 2));
                        return kit;
                    case 10:
                        kit.add(Item.woodSwordKnockback10Use0);
                        kit.add(Item.ironSwordKnockback1);
                        kit.add(Item.blackLeatherHelmet);
                        kit.add(Item.blackLeatherChest);
                        kit.add(Item.ironBootsFf3);
                        kit.add(new ItemStack(Item.weaknessSplashPotion3_10, 3));
                        kit.add(new ItemStack(Item.invisSplashPotion1_15, 3));
                        kit.add(Item.blackLeatherLeggings);
                        kit.add(Item.bowPunch3Pow3Use2);
                        kit.add(new ItemStack(Item.arrow, 3));
                        return kit;
                    //</editor-fold>
                }
                //</editor-fold>
            case SLIMEYSLIME:
                //<editor-fold desc="[SlimeySlime]">
                switch (level) {
                    //<editor-fold desc="[1-5]">
                    case 1:
                        kit.add(new ItemStack(Item.slimeEgg, 1));
                        return kit;
                    case 2:
                        kit.add(new ItemStack(Item.slimeEgg, 1));
                        kit.add(Item.stoneAxe);
                        return kit;
                    case 3:
                        kit.add(new ItemStack(Item.slimeEgg, 2));
                        kit.add(Item.stoneAxe);
                        return kit;
                    case 4:
                        kit.add(new ItemStack(Item.slimeEgg, 2));
                        kit.add(Item.stoneAxe);
                        kit.add(new ItemStack(Item.slowSlpashPotion3_10, 1)); //todo check length
                        kit.add(Item.chainHelmetProjProt4);
                        return kit;
                    case 5:
                        kit.add(new ItemStack(Item.slimeEgg, 2));
                        kit.add(Item.stoneAxeKnockback1);
                        kit.add(new ItemStack(Item.slowSlpashPotion3_8, 2));
                        kit.add(Item.chainHelmetProjProt4);
                        return kit;
                    //</editor-fold>

                    //<editor-fold desc="[6-10]">
                    case 6:
                        kit.add(new ItemStack(Item.slimeEgg, 2));
                        kit.add(Item.stoneAxeKnockback1);
                        kit.add(new ItemStack(Item.slowSlpashPotion3_8, 3));
                        kit.add(Item.ironHelmetProjProt4);
                        return kit;
                    case 7:
                        kit.add(new ItemStack(Item.slimeEgg, 3));
                        kit.add(Item.stoneAxeKnockback1);
                        kit.add(new ItemStack(Item.slowSlpashPotion3_8, 3));
                        kit.add(Item.ironHelmetProjProt4);
                        return kit;
                    case 8:
                        kit.add(new ItemStack(Item.slimeEgg, 3));
                        kit.add(Item.ironAxeKnockback1);
                        kit.add(new ItemStack(Item.slowSlpashPotion3_8, 3));
                        kit.add(Item.ironHelmetProjProt4);
                        kit.add(Item.ironBootsProjProt4);
                        kit.add(Item.greenLeatherChest);
                        return kit;
                    case 9:
                        kit.add(new ItemStack(Item.slimeEgg, 4));
                        kit.add(Item.ironAxeKnockback1);
                        kit.add(new ItemStack(Item.slowSlpashPotion3_8, 3));
                        kit.add(Item.ironHelmetProjProt4);
                        kit.add(Item.ironBootsProjProt4);
                        kit.add(Item.greenLeatherChest);
                        kit.add(Item.greenLeatherLeggings);
                        return kit;
                    case 10:
                        kit.add(new ItemStack(Item.slimeEgg, 4));
                        kit.add(Item.diamondAxeKnockback1);
                        kit.add(new ItemStack(Item.slowSlpashPotion3_8, 4));
                        kit.add(Item.ironHelmetProjProt4);
                        kit.add(Item.ironBootsProjProt4);
                        kit.add(Item.greenLeatherChest);
                        kit.add(Item.greenLeatherLeggings);
                        return kit;
                    //</editor-fold>
                }
                //</editor-fold>
            case JOCKEY:
                //<editor-fold desc="[Jockey]">
                switch (level) {
                    //<editor-fold desc="[1-5]">
                    case 1:
                        return kit;
                    case 2:
                        kit.add(Item.woodAxeSmite10Bane10);
                        kit.add(new ItemStack(Item.jockeyEgg, 1));
                        return kit;
                    case 3:
                        kit.add(Item.woodAxeSmite10Bane10);
                        kit.add(new ItemStack(Item.jockeyEgg, 1));
                        kit.add(Item.leatherChestUnbreaking1);
                        return kit;
                    case 4:
                        kit.add(Item.woodAxeSmite10Bane10);
                        kit.add(new ItemStack(Item.jockeyEgg, 1));
                        kit.add(Item.leatherChestUnbreaking1);
                        kit.add(Item.leatherLeggingsUnbreaking1);
                        return kit;
                    case 5:
                        kit.add(Item.woodSwordSmite10Bane10);
                        kit.add(new ItemStack(Item.jockeyEgg, 1));
                        kit.add(Item.leatherChestUnbreaking1);
                        kit.add(Item.leatherLeggingsUnbreaking1);
                        return kit;
                    //</editor-fold>

                    //<editor-fold desc="[6-10]">
                    case 6:
                        kit.add(Item.woodSwordSmite10Bane10);
                        kit.add(new ItemStack(Item.jockeyEgg, 1));
                        kit.add(Item.chainChestUnbreaking1);
                        kit.add(Item.leatherLeggingsUnbreaking1);
                        return kit;
                    case 7:
                        kit.add(Item.woodSwordSmite10Bane10);
                        kit.add(new ItemStack(Item.jockeyEgg, 2));
                        kit.add(Item.chainChestUnbreaking1);
                        kit.add(Item.leatherLeggingsUnbreaking1);
                        return kit;
                    case 8:
                        kit.add(Item.stoneSwordSmite10Bane10);
                        kit.add(new ItemStack(Item.jockeyEgg, 2));
                        kit.add(Item.chainChestUnbreaking1);
                        kit.add(Item.leatherLeggingsUnbreaking1);
                        return kit;
                    case 9:
                        kit.add(Item.stoneSwordSmite10Bane10);
                        kit.add(new ItemStack(Item.jockeyEgg, 2));
                        kit.add(Item.chainChestUnbreaking1);
                        kit.add(Item.chainLeggingsUnbreaking1);
                        return kit;
                    case 10:
                        kit.add(Item.stoneSwordSmite10Bane10);
                        kit.add(new ItemStack(Item.jockeyEgg, 3));
                        kit.add(Item.ironChestUnbreaking1);
                        kit.add(Item.chainLeggingsUnbreaking1);
                        return kit;
                    //</editor-fold>
                }
                //</editor-fold>
            case GOLEM:
                //<editor-fold desc="[Golem]">
                switch (level) {
                    //<editor-fold desc="[1-5]">
                    case 1:
                        kit.add(Item.woodenAxe);
                        return kit;
                    case 2:
                        kit.add(Item.woodenAxe);
                        kit.add(Item.leatherBoots);
                        return kit;
                    case 3:
                        kit.add(Item.stoneAxe);
                        kit.add(Item.leatherBoots);
                        return kit;
                    case 4:
                        kit.add(Item.stoneAxe);
                        kit.add(Item.leatherBoots);
                        kit.add(Item.leatherChest);
                        return kit;
                    case 5:
                        kit.add(Item.stoneAxe);
                        kit.add(Item.leatherBootsUnbreaking3);
                        kit.add(Item.leatherChestUnbreaking3);
                        kit.add(new ItemStack(Item.goldenApple, 1));
                        return kit;
                    //</editor-fold>

                    //<editor-fold desc="[6-10]">
                    case 6:
                        kit.add(Item.stoneAxe);
                        kit.add(Item.leatherBootsUnbreaking3);
                        kit.add(Item.leatherChestUnbreaking3);
                        kit.add(new ItemStack(Item.goldenApple, 1));
                        kit.add(new ItemStack(Item.absorptionPotion1_3, 1));
                        return kit;
                    case 7:
                        kit.add(Item.stoneAxe);
                        kit.add(Item.leatherBootsUnbreaking3);
                        kit.add(Item.leatherChestUnbreaking3);
                        kit.add(new ItemStack(Item.goldenApple, 1));
                        kit.add(new ItemStack(Item.absorptionPotion1_5, 1));
                        return kit;
                    case 8:
                        kit.add(Item.ironAxe);
                        kit.add(Item.leatherBootsUnbreaking3Prot1);
                        kit.add(Item.leatherChestUnbreaking3);
                        kit.add(new ItemStack(Item.goldenApple, 1));
                        kit.add(new ItemStack(Item.absorptionPotion1_5, 1));
                        return kit;
                    case 9:
                        kit.add(Item.ironAxe);
                        kit.add(Item.leatherBootsUnbreaking3Prot1);
                        kit.add(Item.leatherChestUnbreaking3Prot1);
                        kit.add(new ItemStack(Item.goldenApple, 1));
                        kit.add(new ItemStack(Item.absorptionPotion1_7, 2));
                        return kit;
                    case 10:
                        kit.add(Item.ironAxeSharp1);
                        kit.add(Item.leatherBootsUnbreaking3Prot1);
                        kit.add(Item.leatherChestUnbreaking3Prot1);
                        kit.add(new ItemStack(Item.goldenApple, 1));
                        kit.add(new ItemStack(Item.absorptionPotion1_7, 3));
                        return kit;
                    //</editor-fold>
                }
                //</editor-fold>
            case SHADOW_KNIGHT:
                //<editor-fold desc="[Shadow Knight]">
                switch (level) {
                    //<editor-fold desc="[1-5]">
                    case 1:
                        kit.add(Item.witherSkeletonHeadProt1);
                        kit.add(Item.woodenAxe);
                        return kit;
                    case 2:
                        kit.add(Item.witherSkeletonHeadProt1);
                        kit.add(Item.woodenAxe);
                        kit.add(Item.grayLeatherLeggings);
                        return kit;
                    case 3:
                        kit.add(Item.witherSkeletonHeadProt1);
                        kit.add(Item.woodenAxe);
                        kit.add(Item.grayLeatherLeggings);
                        kit.add(new ItemStack(Item.blindnessSplashPotion1_8, 1));
                        return kit;
                    case 4:
                        kit.add(Item.witherSkeletonHeadProt2);
                        kit.add(Item.woodenSword);
                        kit.add(Item.grayLeatherLeggings);
                        kit.add(new ItemStack(Item.blindnessSplashPotion1_8, 1));
                        return kit;
                    case 5:
                        kit.add(Item.witherSkeletonHeadProt2);
                        kit.add(Item.woodenSword);
                        kit.add(Item.grayLeatherLeggings);
                        kit.add(new ItemStack(Item.blindnessSplashPotion1_8, 1));
                        kit.add(Item.grayLeatherBoots);
                        return kit;
                    //</editor-fold>

                    //<editor-fold desc="[6-10]">
                    case 6:
                        kit.add(Item.witherSkeletonHeadProt3Ff1);
                        kit.add(Item.woodenSword);
                        kit.add(Item.grayLeatherLeggings);
                        kit.add(new ItemStack(Item.blindnessSplashPotion1_10, 1));
                        kit.add(Item.grayLeatherBoots);
                        return kit;
                    case 7:
                        kit.add(Item.witherSkeletonHeadProt3Ff1);
                        kit.add(Item.woodenSword);
                        kit.add(Item.grayLeatherLeggings);
                        kit.add(new ItemStack(Item.blindnessSplashPotion1_10, 1));
                        kit.add(Item.grayLeatherBoots);
                        kit.add(Item.grayLeatherChest);
                        return kit;
                    case 8:
                        kit.add(Item.witherSkeletonHeadProt3Ff2);
                        kit.add(Item.stoneSwordUnbreaking1);
                        kit.add(Item.grayLeatherLeggings);
                        kit.add(new ItemStack(Item.blindnessSplashPotion1_10, 2));
                        kit.add(Item.grayLeatherBoots);
                        kit.add(Item.grayLeatherChest);
                        return kit;
                    case 9:
                        kit.add(Item.witherSkeletonHeadProt4Ff3);
                        kit.add(Item.stoneSwordUnbreaking1);
                        kit.add(Item.grayLeatherLeggings);
                        kit.add(new ItemStack(Item.blindnessSplashPotion1_10, 2));
                        kit.add(Item.grayLeatherBoots);
                        kit.add(Item.grayLeatherChest);
                        return kit;
                    case 10:
                        kit.add(Item.witherSkeletonHeadProt5Ff4);
                        kit.add(Item.stoneSwordUnbreaking1);
                        kit.add(Item.grayLeatherLeggings);
                        kit.add(new ItemStack(Item.blindnessSplashPotion1_10, 3));
                        kit.add(Item.grayLeatherBoots);
                        kit.add(Item.grayLeatherChest);
                        return kit;
                    //</editor-fold>
                }
                //</editor-fold>
            case PIGMAN:
                //<editor-fold desc="[Pigman]">
                switch (level) {
                    //<editor-fold desc="[1-5]">
                    case 1:
                        kit.add(Item.goldenAxe);
                        kit.add(new ItemStack(Item.zombiePigmanEgg, 1));
                        kit.add(Item.yellowLeatherLeggings);
                        return kit;
                    case 2:
                        kit.add(Item.goldenAxe);
                        kit.add(new ItemStack(Item.zombiePigmanEgg, 1));
                        kit.add(Item.yellowLeatherLeggings);
                        kit.add(new ItemStack(Item.instantDamageSplashPotion1, 1));
                        return kit;
                    case 3:
                        kit.add(Item.goldSwordUnbreaking10);
                        kit.add(new ItemStack(Item.zombiePigmanEgg, 1));
                        kit.add(Item.yellowLeatherLeggings);
                        kit.add(new ItemStack(Item.instantDamageSplashPotion1, 1));
                        return kit;
                    case 4:
                        kit.add(Item.goldSwordUnbreaking10);
                        kit.add(new ItemStack(Item.zombiePigmanEgg, 1));
                        kit.add(Item.yellowLeatherLeggingsUnbreaking1);
                        kit.add(new ItemStack(Item.instantDamageSplashPotion1, 1));
                        kit.add(Item.yellowLeatherBootsUnbreaking1);
                        return kit;
                    case 5:
                        kit.add(Item.goldSwordUnbreaking10);
                        kit.add(new ItemStack(Item.zombiePigmanEgg, 1));
                        kit.add(Item.yellowLeatherLeggingsUnbreaking1);
                        kit.add(new ItemStack(Item.instantDamageSplashPotion1, 2));
                        kit.add(Item.yellowLeatherBootsUnbreaking1);
                        return kit;
                    //</editor-fold>

                    //<editor-fold desc="[6-10]">
                    case 6:
                        kit.add(Item.goldSwordUnbreaking10);
                        kit.add(new ItemStack(Item.zombiePigmanEgg, 1));
                        kit.add(Item.yellowLeatherLeggingsUnbreaking1);
                        kit.add(new ItemStack(Item.instantDamageSplashPotion1, 2));
                        kit.add(Item.yellowLeatherBootsUnbreaking1);
                        kit.add(Item.yellowLeatherHelmetUnbreaking1);
                        return kit;
                    case 7:
                        kit.add(Item.goldSwordUnbreaking10);
                        kit.add(new ItemStack(Item.zombiePigmanEgg, 1));
                        kit.add(Item.yellowLeatherLeggingsUnbreaking1);
                        kit.add(new ItemStack(Item.instantDamageSplashPotion1, 2));
                        kit.add(Item.yellowLeatherBootsUnbreaking1);
                        kit.add(Item.yellowLeatherHelmetUnbreaking1);
                        kit.add(Item.yellowLeatherChestUnbreaking1);
                        return kit;
                    case 8:
                        kit.add(Item.goldSwordUnbreaking10Sharp1);
                        kit.add(new ItemStack(Item.zombiePigmanEgg, 1));
                        kit.add(Item.yellowLeatherLeggingsUnbreaking1);
                        kit.add(new ItemStack(Item.instantDamageSplashPotion1, 2));
                        kit.add(Item.yellowLeatherBootsUnbreaking1);
                        kit.add(Item.goldHelmetProt1Unbreaking1);
                        kit.add(Item.yellowLeatherChestUnbreaking1);
                        return kit;
                    case 9:
                        kit.add(Item.goldSwordUnbreaking10Sharp1);
                        kit.add(new ItemStack(Item.zombiePigmanEgg, 1));
                        kit.add(Item.yellowLeatherLeggingsUnbreaking1);
                        kit.add(new ItemStack(Item.instantDamageSplashPotion1, 3));
                        kit.add(Item.yellowLeatherBootsUnbreaking1);
                        kit.add(Item.goldHelmetProt2Unbreaking1);
                        kit.add(Item.yellowLeatherChestUnbreaking1Prot1);
                        return kit;
                    case 10:
                        kit.add(Item.goldSwordUnbreaking10Sharp2);
                        kit.add(new ItemStack(Item.zombiePigmanEgg, 1));
                        kit.add(Item.yellowLeatherLeggingsUnbreaking1);
                        kit.add(new ItemStack(Item.instantDamageSplashPotion1, 3));
                        kit.add(Item.yellowLeatherBootsUnbreaking1);
                        kit.add(Item.goldHelmetProt3Unbreaking1);
                        kit.add(Item.yellowLeatherChestUnbreaking3Prot1);
                        return kit;
                    //</editor-fold>
                }
                //</editor-fold>
            case PALADIN:
                //<editor-fold desc="[Paladin]">
                switch (level) {
                    //<editor-fold desc="[1-5]">
                    case 1:
                        kit.add(Item.woodenAxe);
                        kit.add(Item.leatherChest);
                        return kit;
                    case 2:
                        kit.add(Item.woodenAxe);
                        kit.add(Item.leatherChestUnbreaking1);
                        kit.add(Item.leatherHelmetUnbreaking1);
                        return kit;
                    case 3:
                        kit.add(Item.woodenAxe);
                        kit.add(Item.leatherChestUnbreaking1);
                        kit.add(Item.ironHelmetUnbreaking1);
                        return kit;
                    case 4:
                        kit.add(Item.woodenSword);
                        kit.add(Item.leatherChestUnbreaking1);
                        kit.add(Item.ironHelmetUnbreaking1);
                        return kit;
                    case 5:
                        kit.add(Item.woodenSword);
                        kit.add(Item.leatherChestUnbreaking1);
                        kit.add(Item.ironHelmetUnbreaking1);
                        kit.add(new ItemStack(Item.instantHealthSplashPotion1, 1));
                        return kit;
                    //</editor-fold>

                    //<editor-fold desc="[6-10]">
                    case 6:
                        kit.add(Item.woodenSword);
                        kit.add(Item.goldChestUnbreaking1);
                        kit.add(Item.ironHelmetUnbreaking1);
                        kit.add(new ItemStack(Item.instantHealthSplashPotion1, 1));
                        return kit;
                    case 7: //todo check; is the same?
                        kit.add(Item.woodenSword);
                        kit.add(Item.goldChestUnbreaking1);
                        kit.add(Item.ironHelmetUnbreaking1);
                        kit.add(new ItemStack(Item.instantHealthSplashPotion1, 1));
                        return kit;
                    case 8:
                        kit.add(Item.stoneSwordUnbreaking1);
                        kit.add(Item.goldChestUnbreaking1);
                        kit.add(Item.ironHelmetUnbreaking1);
                        kit.add(new ItemStack(Item.instantHealthSplashPotion1, 2));
                        return kit;
                    case 9:
                        kit.add(Item.stoneSwordUnbreaking1);
                        kit.add(Item.ironChestUnbreaking1);
                        kit.add(Item.ironHelmetUnbreaking1);
                        kit.add(new ItemStack(Item.instantHealthSplashPotion1, 2));
                        return kit;
                    case 10:
                        kit.add(Item.ironSwordUnbreaking1);
                        kit.add(Item.ironChestUnbreaking1);
                        kit.add(Item.ironHelmetUnbreaking1Prot1);
                        kit.add(new ItemStack(Item.instantHealthSplashPotion1, 3));
                        return kit;
                    //</editor-fold>
                }
                //</editor-fold>
            case NECROMANCER:
                //<editor-fold desc="[Necromancer]">
                switch (level) {
                    //<editor-fold desc="[1-5]">
                    case 1:
                        kit.add(new ItemStack(Item.zombiePigmanEgg, 1));
                        return kit;
                    case 2:
                        kit.add(new ItemStack(Item.zombiePigmanEgg, 2));
                        return kit;
                    case 3:
                        kit.add(new ItemStack(Item.zombiePigmanEgg, 2));
                        kit.add(Item.chainHelmetProjProt2);
                        return kit;
                    case 4:
                        kit.add(new ItemStack(Item.zombiePigmanEgg, 2));
                        kit.add(new ItemStack(Item.skeletonEgg, 1));
                        kit.add(Item.chainHelmetProjProt2);
                        return kit;
                    case 5:
                        kit.add(new ItemStack(Item.zombiePigmanEgg, 2));
                        kit.add(new ItemStack(Item.skeletonEgg, 1));
                        kit.add(Item.chainHelmetProjProt2);
                        kit.add(Item.bow);
                        kit.add(new ItemStack(Item.arrow, 3));
                        return kit;
                    //</editor-fold>

                    //<editor-fold desc="[6-10]">
                    case 6:
                        kit.add(new ItemStack(Item.zombiePigmanEgg, 2));
                        kit.add(new ItemStack(Item.skeletonEgg, 2));
                        kit.add(Item.chainHelmetProjProt2);
                        kit.add(Item.bow);
                        kit.add(new ItemStack(Item.arrow, 5));
                        kit.add(Item.chainBootsProjProt2);
                        return kit;
                    case 7:
                        kit.add(new ItemStack(Item.zombiePigmanEgg, 2));
                        kit.add(new ItemStack(Item.skeletonEgg, 2));
                        kit.add(Item.chainHelmetProjProt2);
                        kit.add(Item.bow);
                        kit.add(new ItemStack(Item.arrow, 7));
                        kit.add(Item.chainBootsProjProt2);
                        kit.add(Item.chainChestProjProt2);
                        return kit;
                    case 8:
                        kit.add(new ItemStack(Item.zombiePigmanEgg, 2));
                        kit.add(new ItemStack(Item.skeletonEgg, 2));
                        kit.add(Item.chainHelmetProjProt2);
                        kit.add(Item.bowPunch1);
                        kit.add(new ItemStack(Item.arrow, 10));
                        kit.add(Item.chainBootsProjProt2);
                        kit.add(Item.chainChestProjProt2);
                        return kit;
                    case 9:
                        kit.add(new ItemStack(Item.zombiePigmanEgg, 3));
                        kit.add(new ItemStack(Item.skeletonEgg, 2));
                        kit.add(Item.chainHelmetProjProt2);
                        kit.add(Item.bowPunch1);
                        kit.add(new ItemStack(Item.arrow, 12));
                        kit.add(Item.chainBootsProjProt2);
                        kit.add(Item.chainChestProjProt2);
                        kit.add(Item.chainLeggingsProjProt2);
                        kit.add(Item.diamondShovel);
                        return kit;
                    case 10:
                        kit.add(new ItemStack(Item.zombiePigmanEgg, 3));
                        kit.add(new ItemStack(Item.skeletonEgg, 3));
                        kit.add(Item.chainHelmetProjProt3);
                        kit.add(Item.bowPunch1);
                        kit.add(new ItemStack(Item.arrow, 18));
                        kit.add(Item.chainBootsProjProt3);
                        kit.add(Item.chainChestProjProt3);
                        kit.add(Item.chainLeggingsProjProt3);
                        kit.add(Item.diamondShovelSharp1);
                        return kit;
                    //</editor-fold>
                }
                //</editor-fold>
            case FLORIST:
                //<editor-fold desc="[Florist]">
                switch (level) {
                    //<editor-fold desc="[1-5]">
                    case 1:
                        kit.add(Item.woodenAxe);
                        kit.add(Item.rosekb1);
                        return kit;
                    case 2:
                        kit.add(Item.woodenAxe);
                        kit.add(Item.rosekb1);
                        kit.add(new ItemStack(Item.melonSlice, 8));
                        return kit;
                    case 3:
                        kit.add(Item.woodenAxe);
                        kit.add(Item.rosekb1);
                        kit.add(new ItemStack(Item.melonSlice, 8));
                        kit.add(Item.leatherHelmet);
                        return kit;
                    case 4:
                        kit.add(Item.stoneAxe);
                        kit.add(Item.rosekb1);
                        kit.add(new ItemStack(Item.melonSlice, 8));
                        kit.add(Item.leatherHelmet);
                        kit.add(Item.leatherBoots);
                        return kit;
                    case 5:
                        kit.add(Item.stoneAxe);
                        kit.add(Item.rosekb1);
                        kit.add(new ItemStack(Item.melonSlice, 8));
                        kit.add(Item.leatherHelmetThorns1Unbreaking3);
                        kit.add(Item.leatherBootsThorns1Unbreaking3);
                        return kit;
                    //</editor-fold>

                    //<editor-fold desc="[6-10]">
                    case 6:
                        kit.add(Item.stoneAxe);
                        kit.add(Item.rosekb1);
                        kit.add(new ItemStack(Item.melonSlice, 8));
                        kit.add(Item.leatherHelmetThorns1Unbreaking3);
                        kit.add(Item.leatherBootsThorns1Unbreaking3);
                        kit.add(Item.leatherLeggingsThorns1Unbreaking3);
                        return kit;
                    case 7:
                        kit.add(Item.stoneAxe);
                        kit.add(Item.rosekb1);
                        kit.add(new ItemStack(Item.melonSlice, 8));
                        kit.add(Item.leatherHelmetThorns1Unbreaking5);
                        kit.add(Item.leatherBootsThorns1Unbreaking5);
                        kit.add(Item.leatherLeggingsThorns1Unbreaking5);
                        kit.add(Item.leatherChestThorns1Unbreaking5);
                        return kit;
                    case 8:
                        kit.add(Item.ironAxe);
                        kit.add(Item.rosekb1);
                        kit.add(new ItemStack(Item.melonSlice, 16));
                        kit.add(Item.leatherHelmetThorns1Unbreaking5);
                        kit.add(Item.leatherBootsThorns1Unbreaking5);
                        kit.add(Item.goldLeggingsThorns1Unbreaking5);
                        kit.add(Item.leatherChestThorns1Unbreaking5);
                        return kit;
                    case 9:
                        kit.add(Item.ironAxe);
                        kit.add(Item.rosekb1);
                        kit.add(new ItemStack(Item.melonSlice, 24));
                        kit.add(Item.leatherHelmetThorns1Unbreaking5);
                        kit.add(Item.ironBootsThorns1Unbreaking5);
                        kit.add(Item.chainLeggingsThorns1Unbreaking5);
                        kit.add(Item.leatherChestThorns1Unbreaking5);
                        return kit;
                    case 10:
                        kit.add(Item.diamondAxe);
                        kit.add(Item.rosekb1);
                        kit.add(new ItemStack(Item.melonSlice, 32));
                        kit.add(Item.leatherHelmetThorns1Unbreaking10);
                        kit.add(Item.ironBootsThorns2Unbreaking10);
                        kit.add(Item.chainLeggingsThorns2Unbreaking10);
                        kit.add(Item.leatherChestThorns1Unbreaking10);
                        return kit;
                    //</editor-fold>
                }
                //</editor-fold>
            case ARACHNOLOGIST:
                //<editor-fold desc="[Arachnologist]">
                switch (level) {
                    //<editor-fold desc="[1-5]">
                    case 1:
                        kit.add(new ItemStack(Item.spiderEgg, 1));
                        return kit;
                    case 2:
                        kit.add(new ItemStack(Item.spiderEgg, 1));
                        kit.add(new ItemStack(Item.cobweb,1 ));
                        return kit;
                    case 3:
                        kit.add(new ItemStack(Item.spiderEgg, 1));
                        kit.add(new ItemStack(Item.cobweb, 2));
                        kit.add(Item.darkGrayLeatherHelmet);
                        return kit;
                    case 4:
                        kit.add(new ItemStack(Item.spiderEgg, 2));
                        kit.add(new ItemStack(Item.cobweb, 2));
                        kit.add(Item.darkGrayLeatherHelmet);
                        kit.add(Item.darkGrayLeatherBoots);
                        return kit;
                    case 5:
                        kit.add(new ItemStack(Item.spiderEgg, 2));
                        kit.add(new ItemStack(Item.cobweb, 2));
                        kit.add(Item.darkGrayLeatherHelmet);
                        kit.add(Item.darkGrayLeatherBoots);
                        kit.add(Item.darkGrayLeatherLeggings);
                        kit.add(Item.woodenAxe);
                        return kit;
                    //</editor-fold>

                    //<editor-fold desc="[6-10]">
                    case 6:
                        kit.add(new ItemStack(Item.spiderEgg, 3));
                        kit.add(new ItemStack(Item.cobweb, 3));
                        kit.add(Item.darkGrayLeatherHelmet);
                        kit.add(Item.darkGrayLeatherBoots);
                        kit.add(Item.darkGrayLeatherLeggings);
                        kit.add(Item.darkGrayLeatherChest);
                        kit.add(Item.woodenAxe);
                        return kit;
                    case 7:
                        kit.add(new ItemStack(Item.spiderEgg, 3));
                        kit.add(new ItemStack(Item.cobweb, 4));
                        kit.add(Item.ironHelmet);
                        kit.add(Item.darkGrayLeatherBoots);
                        kit.add(Item.darkGrayLeatherLeggings);
                        kit.add(Item.darkGrayLeatherChest);
                        kit.add(Item.stoneAxe);
                        return kit;
                    case 8:
                        kit.add(new ItemStack(Item.spiderEgg, 3));
                        kit.add(new ItemStack(Item.cobweb, 5));
                        kit.add(Item.ironHelmet);
                        kit.add(Item.ironBoots);
                        kit.add(Item.darkGrayLeatherLeggings);
                        kit.add(Item.darkGrayLeatherChest);
                        kit.add(Item.stoneSword);
                        return kit;
                    case 9:
                        kit.add(new ItemStack(Item.spiderEgg, 4));
                        kit.add(new ItemStack(Item.cobweb, 6));
                        kit.add(Item.ironHelmet);
                        kit.add(Item.ironBoots);
                        kit.add(Item.goldLeggings);
                        kit.add(Item.darkGrayLeatherChest);
                        kit.add(Item.stoneSword);
                        return kit;
                    case 10:
                        kit.add(new ItemStack(Item.spiderEgg, 4));
                        kit.add(new ItemStack(Item.cobweb, 8));
                        kit.add(Item.ironHelmet);
                        kit.add(Item.ironBoots);
                        kit.add(Item.chainLeggings);
                        kit.add(Item.darkGrayLeatherChest);
                        kit.add(Item.ironSwordUnbreaking1);
                        return kit;
                    //</editor-fold>
                }
                //</editor-fold>
            case BLAZE:
                //<editor-fold desc="[Blaze]">
                switch (level) {
                    //<editor-fold desc="[1-5]">
                    case 1:
                        kit.add(new ItemStack(Item.blazeEgg, 1));
                        return kit;
                    case 2:
                        kit.add(new ItemStack(Item.blazeEgg, 1));
                        kit.add(Item.woodenSword);
                        return kit;
                    case 3:
                        kit.add(new ItemStack(Item.blazeEgg, 1));
                        kit.add(Item.woodenSword);
                        kit.add(Item.orangeLeatherBoots);
                        return kit;
                    case 4:
                        kit.add(new ItemStack(Item.blazeEgg, 1));
                        kit.add(Item.woodenSword);
                        kit.add(Item.orangeLeatherBootsfProt1);
                        return kit;
                    case 5:
                        kit.add(new ItemStack(Item.blazeEgg, 1));
                        kit.add(Item.woodenSword);
                        kit.add(Item.orangeLeatherBootsfProt2);
                        kit.add(Item.stoneAxeFireAsp1Use2);
                        return kit;
                    //</editor-fold>

                    //<editor-fold desc="[6-10]">
                    case 6:
                        kit.add(new ItemStack(Item.blazeEgg, 2));
                        kit.add(Item.woodenSword);
                        kit.add(Item.orangeLeatherBootsfProt2);
                        kit.add(Item.orangeLeatherChestfProt2);
                        kit.add(Item.stoneAxeFireAsp1Use2);
                        return kit;
                    case 7:
                        kit.add(new ItemStack(Item.blazeEgg, 2));
                        kit.add(Item.woodenSword);
                        kit.add(Item.orangeLeatherBootsfProt2);
                        kit.add(Item.orangeLeatherChestfProt2);
                        kit.add(Item.orangeLeatherLeggingsfProt1);
                        kit.add(Item.stoneAxeFireAsp1Use3);
                        return kit;
                    case 8:
                        kit.add(new ItemStack(Item.blazeEgg, 2));
                        kit.add(Item.stoneSwordUnbreaking1);
                        kit.add(Item.orangeLeatherBootsfProt2);
                        kit.add(Item.orangeLeatherChestfProt2Prot1);
                        kit.add(Item.orangeLeatherLeggingsfProt2);
                        kit.add(Item.orangeLeatherHelmetfProt2);
                        kit.add(Item.stoneAxeFireAsp1Use3);
                        return kit;
                    case 9:
                        kit.add(new ItemStack(Item.blazeEgg, 3));
                        kit.add(Item.stoneSwordUnbreaking1);
                        kit.add(Item.orangeLeatherBootsfProt2);
                        kit.add(Item.goldChestfProt5);
                        kit.add(Item.orangeLeatherLeggingsfProt2);
                        kit.add(Item.orangeLeatherHelmetfProt2);
                        kit.add(Item.ironAxeFireAsp1Use3);
                        return kit;
                    case 10:
                        kit.add(new ItemStack(Item.blazeEgg, 3));
                        kit.add(Item.ironSwordUnbreaking1);
                        kit.add(Item.orangeLeatherBootsfProt2);
                        kit.add(Item.ironChestfProt10);
                        kit.add(Item.orangeLeatherLeggingsfProt2);
                        kit.add(Item.orangeLeatherHelmetfProt2);
                        kit.add(Item.ironAxeFireAsp1Use4);
                        return kit;
                    //</editor-fold>
                }
                //</editor-fold>
            case WOLFTAMER:
                //<editor-fold desc="[Wolftamer]">
                switch (level) {
                    //<editor-fold desc="[1-5]">
                    case 1:
                    case 2:
                        kit.add(new ItemStack(Item.wolfEgg, 1));
                        kit.add(new ItemStack(Item.rottenFlesh, level*2));
                        return kit;
                    case 3:
                        kit.add(new ItemStack(Item.wolfEgg, 1));
                        kit.add(new ItemStack(Item.rottenFlesh, level*2));
                        kit.add(Item.chainBoots);
                        return kit;
                    case 4:
                        kit.add(new ItemStack(Item.wolfEgg, 2));
                        kit.add(new ItemStack(Item.rottenFlesh, level*2));
                        kit.add(Item.chainBootsProt1);
                        kit.add(Item.woodenAxe);
                        return kit;
                    case 5:
                        kit.add(new ItemStack(Item.wolfEgg, 2));
                        kit.add(new ItemStack(Item.rottenFlesh, level*2));
                        kit.add(Item.chainBootsProt2);
                        kit.add(Item.woodenAxe);
                        return kit;
                    //</editor-fold>

                    //<editor-fold desc="[6-10]">
                    case 6:
                        kit.add(new ItemStack(Item.wolfEgg, 2));
                        kit.add(new ItemStack(Item.rottenFlesh, level*2));
                        kit.add(Item.chainBootsProt3);
                        kit.add(Item.woodenAxe);
                        return kit;
                    case 7:
                        kit.add(new ItemStack(Item.wolfEgg, 3));
                        kit.add(new ItemStack(Item.rottenFlesh, level*2));
                        kit.add(Item.diamondBootsProt1);
                        kit.add(Item.stoneAxe);
                        return kit;
                    case 8:
                        kit.add(new ItemStack(Item.wolfEgg, 3));
                        kit.add(new ItemStack(Item.rottenFlesh, level*2));
                        kit.add(Item.diamondBootsProt2);
                        kit.add(Item.stoneAxe);
                        kit.add(Item.grayLeatherHelmet);
                        return kit;
                    case 9:
                        kit.add(new ItemStack(Item.wolfEgg, 4));
                        kit.add(new ItemStack(Item.rottenFlesh, level*2));
                        kit.add(Item.diamondBootsProt3);
                        kit.add(Item.stoneAxe);
                        kit.add(Item.grayLeatherHelmet);
                        kit.add(Item.grayLeatherLeggings);
                        return kit;
                    case 10:
                        kit.add(new ItemStack(Item.wolfEgg, 5));
                        kit.add(new ItemStack(Item.rottenFlesh, level*2));
                        kit.add(Item.diamondBootsProt4);
                        kit.add(Item.ironAxe);
                        kit.add(Item.grayLeatherHelmet);
                        kit.add(Item.grayLeatherLeggings);
                        return kit;
                    //</editor-fold>
                }
                //</editor-fold>
            case TIM:
                //<editor-fold desc="[Tim]">
                switch (level) {
                    //<editor-fold desc="[1-5]">
                    case 1:
                        kit.add(new ItemStack(Item.expBottle, 1));
                        return kit;
                    case 2:
                        kit.add(new ItemStack(Item.expBottle, 2));
                        kit.add(Item.leatherLeggings);
                        return kit;
                    case 3:
                        kit.add(new ItemStack(Item.expBottle, 3));
                        kit.add(Item.leatherLeggings);
                        kit.add(Item.woodenSword);
                        return kit;
                    case 4:
                        kit.add(new ItemStack(Item.expBottle, 4));
                        kit.add(Item.goldLeggings);
                        kit.add(Item.woodenSword);
                        kit.add(new ItemStack(Item.apple, 2));
                        return kit;
                    case 5:
                        kit.add(new ItemStack(Item.expBottle, 5));
                        kit.add(Item.goldLeggings);
                        kit.add(Item.woodenSword);
                        kit.add(new ItemStack(Item.apple, 2));
                        return kit;
                    //</editor-fold>

                    //<editor-fold desc="[6-10]">
                    case 6:
                        kit.add(new ItemStack(Item.expBottle, 6));
                        kit.add(Item.chainLeggings);
                        kit.add(Item.woodenSword);
                        kit.add(new ItemStack(Item.apple, 3));
                        return kit;
                    case 7:
                        kit.add(new ItemStack(Item.expBottle, 7));
                        kit.add(Item.ironLeggings);
                        kit.add(Item.woodenSword);
                        kit.add(new ItemStack(Item.apple, 3));
                        return kit;
                    case 8:
                        kit.add(new ItemStack(Item.expBottle, 8));
                        kit.add(Item.ironLeggings);
                        kit.add(Item.woodenSword);
                        kit.add(new ItemStack(Item.apple, 4));
                        kit.add(Item.stoneSwordUnbreaking1);
                        kit.add(Item.leatherChest);
                        return kit;
                    case 9:
                        kit.add(new ItemStack(Item.expBottle, 10));
                        kit.add(Item.ironLeggings);
                        kit.add(Item.woodenSword);
                        kit.add(new ItemStack(Item.apple, 4));
                        kit.add(Item.stoneSword);
                        kit.add(Item.leatherChest);
                        return kit;
                    case 10:
                        kit.add(new ItemStack(Item.expBottle, 12));
                        kit.add(Item.diamondLeggings);
                        kit.add(Item.woodenSword);
                        kit.add(new ItemStack(Item.apple, 5));
                        kit.add(Item.stoneSword);
                        kit.add(Item.leatherChest);
                        return kit;
                    //</editor-fold>
                }
                //</editor-fold>
            case FARMER:
                //<editor-fold desc="[Farmer]">
                switch (level) {
                    //<editor-fold desc="[1-5]">
                    case 1:
                        kit.add(Item.goldSword);
                        kit.add(new ItemStack(Item.chickenEgg, 1));
                        return kit;
                    case 2:
                        kit.add(Item.goldSword);
                        kit.add(new ItemStack(Item.chickenEgg, 1));
                        kit.add(new ItemStack(Item.egg, 2));
                        kit.add(Item.leatherBoots);
                        return kit;
                    case 3:
                        kit.add(Item.goldSword);
                        kit.add(new ItemStack(Item.chickenEgg, 1));
                        kit.add(new ItemStack(Item.egg, 2));
                        kit.add(Item.leatherBoots);
                        kit.add(new ItemStack(Item.cookedChicken, 2));
                        return kit;
                    case 4:
                        kit.add(Item.goldSword);
                        kit.add(new ItemStack(Item.chickenEgg, 1));
                        kit.add(new ItemStack(Item.egg, 6));
                        kit.add(Item.leatherBoots);
                        kit.add(Item.leatherLeggings);
                        kit.add(new ItemStack(Item.cookedChicken, 2));
                        return kit;
                    case 5:
                        kit.add(Item.woodenSword);
                        kit.add(new ItemStack(Item.chickenEgg, 1));
                        kit.add(new ItemStack(Item.egg, 6));
                        kit.add(Item.chainBoots);
                        kit.add(Item.leatherLeggings);
                        kit.add(new ItemStack(Item.cookedChicken, 4));
                        return kit;
                    //</editor-fold>

                    //<editor-fold desc="[6-10]">
                    case 6:
                        kit.add(Item.woodenSword);
                        kit.add(new ItemStack(Item.chickenEgg, 2));
                        kit.add(new ItemStack(Item.egg, 8));
                        kit.add(Item.chainBoots);
                        kit.add(Item.chainLeggings);
                        kit.add(new ItemStack(Item.cookedChicken, 4));
                        return kit;
                    case 7:
                        kit.add(Item.woodenSword);
                        kit.add(new ItemStack(Item.chickenEgg, 3));
                        kit.add(new ItemStack(Item.egg, 10));
                        kit.add(Item.ironBoots);
                        kit.add(Item.chainLeggings);
                        kit.add(new ItemStack(Item.cookedChicken, 6));
                        return kit;
                    case 8:
                        kit.add(Item.stoneSwordUnbreaking1);
                        kit.add(new ItemStack(Item.chickenEgg, 3));
                        kit.add(new ItemStack(Item.egg, 12));
                        kit.add(Item.ironBoots);
                        kit.add(Item.chainLeggings);
                        kit.add(new ItemStack(Item.cookedChicken, 8));
                        return kit;
                    case 9:
                        kit.add(Item.stoneSword);
                        kit.add(new ItemStack(Item.chickenEgg, 3));
                        kit.add(new ItemStack(Item.egg, 14));
                        kit.add(Item.ironBoots);
                        kit.add(Item.ironLeggings);
                        kit.add(new ItemStack(Item.cookedChicken, 8));
                        return kit;
                    case 10:
                        kit.add(Item.ironSwordUnbreaking1);
                        kit.add(new ItemStack(Item.chickenEgg, 4));
                        kit.add(new ItemStack(Item.egg, 16));
                        kit.add(Item.ironBoots);
                        kit.add(Item.ironLeggings);
                        kit.add(new ItemStack(Item.cookedChicken, 16));
                        return kit;
                    //</editor-fold>
                }
                //</editor-fold>
            case CREEPERTAMER:
                //<editor-fold desc="[CreeperTamer]">
                switch (level) {
                    //<editor-fold desc="[1-5]">
                    case 1:
                        kit.add(new ItemStack(Item.creeperEgg, 1));
                        return kit;
                    case 2:
                        kit.add(new ItemStack(Item.creeperEgg, 1));
                        kit.add(Item.leatherChestBprot1);
                        return kit;
                    case 3:
                        kit.add(new ItemStack(Item.creeperEgg, 2));
                        kit.add(Item.leatherChestBprot2);
                        kit.add(Item.woodenAxe);
                        return kit;
                    case 4:
                        kit.add(new ItemStack(Item.creeperEgg, 2));
                        kit.add(Item.leatherChestBprot2);
                        kit.add(Item.woodenAxe);
                        kit.add(new ItemStack(Item.TNT, 1));
                        return kit;
                    case 5:
                        kit.add(new ItemStack(Item.creeperEgg, 2));
                        kit.add(Item.goldChestBProt2);
                        kit.add(Item.woodenAxe);
                        kit.add(new ItemStack(Item.TNT, 2));
                        return kit;
                    //</editor-fold>

                    //<editor-fold desc="[6-10]">
                    case 6:
                        kit.add(new ItemStack(Item.creeperEgg, 2));
                        kit.add(Item.goldChestBProt3);
                        kit.add(Item.woodenSword);
                        kit.add(new ItemStack(Item.TNT, 3));
                        return kit;
                    case 7:
                        kit.add(new ItemStack(Item.creeperEgg, 3));
                        kit.add(Item.ironChestBProt3);
                        kit.add(Item.woodenSword);
                        kit.add(new ItemStack(Item.TNT, 5));
                        return kit;
                    case 8:
                        kit.add(new ItemStack(Item.creeperEgg, 4));
                        kit.add(Item.ironChestBProt4Prot1);
                        kit.add(Item.woodenSword);
                        kit.add(new ItemStack(Item.TNT, 7));
                        return kit;
                    case 9:
                        kit.add(new ItemStack(Item.creeperEgg, 4));
                        kit.add(Item.ironChestBProt4Prot1);
                        kit.add(Item.stoneSword);
                        kit.add(new ItemStack(Item.TNT, 9));
                        return kit;
                    case 10:
                        kit.add(new ItemStack(Item.creeperEgg, 4));
                        kit.add(Item.diamondChestBProt10);
                        kit.add(Item.stoneSwordUnbreaking1);
                        kit.add(new ItemStack(Item.TNT, 10));
                        return kit;
                    //</editor-fold>
                }
                //</editor-fold>
            case SNOWMAN:
                //<editor-fold desc="[Snowman]">
                switch (level) {
                    //<editor-fold desc="[1-5]">
                    case 1:
                        kit.add(new ItemStack(Item.snowmanEgg, 1));
                        return kit;
                    case 2:
                        kit.add(new ItemStack(Item.snowmanEgg, 1));
                        kit.add(new ItemStack(Item.snowball, 8));
                        return kit;
                    case 3:
                        kit.add(new ItemStack(Item.snowmanEgg, 1));
                        kit.add(new ItemStack(Item.snowball, 16));
                        return kit;
                    case 4:
                        kit.add(new ItemStack(Item.snowmanEgg, 1));
                        kit.add(new ItemStack(Item.snowball, 16));
                        kit.add(new ItemStack(Item.carrot, 2));
                        return kit;
                    case 5:
                        kit.add(new ItemStack(Item.snowmanEgg, 1));
                        kit.add(new ItemStack(Item.snowball, 16));
                        kit.add(new ItemStack(Item.carrot, 4));
                        kit.add(Item.woodenAxe);
                        kit.add(Item.whiteLeatherHelmet);
                        return kit;
                    //</editor-fold>

                    //<editor-fold desc="[6-10]">
                    case 6:
                        kit.add(new ItemStack(Item.snowmanEgg, 2));
                        kit.add(new ItemStack(Item.snowball, 16));
                        kit.add(new ItemStack(Item.carrot, 6));
                        kit.add(Item.stoneAxe);
                        kit.add(Item.whiteLeatherHelmet);
                        kit.add(Item.whiteLeatherLeggings);
                        return kit;
                    case 7:
                        kit.add(new ItemStack(Item.snowmanEgg, 2));
                        kit.add(new ItemStack(Item.snowball, 16));
                        kit.add(new ItemStack(Item.carrot, 6));
                        kit.add(Item.stoneAxe);
                        kit.add(Item.whiteLeatherHelmet);
                        kit.add(Item.whiteLeatherLeggings);
                        kit.add(Item.ironBoots);
                        return kit;
                    case 8:
                        kit.add(new ItemStack(Item.snowmanEgg, 2));
                        kit.add(new ItemStack(Item.snowball, 16));
                        kit.add(new ItemStack(Item.carrot, 6));
                        kit.add(Item.ironAxe);
                        kit.add(Item.ironHelmetProt1);
                        kit.add(Item.whiteLeatherLeggings);
                        kit.add(Item.ironBoots);
                        return kit;
                    case 9:
                        kit.add(new ItemStack(Item.snowmanEgg, 3));
                        kit.add(new ItemStack(Item.snowball, 16));
                        kit.add(new ItemStack(Item.carrot, 8));
                        kit.add(Item.ironAxe);
                        kit.add(Item.ironHelmetProt2);
                        kit.add(Item.whiteLeatherLeggings);
                        kit.add(Item.ironBootsProjProt1);
                        kit.add(Item.whiteLeatherChest);
                        return kit;
                    case 10:
                        kit.add(new ItemStack(Item.snowmanEgg, 4));
                        kit.add(new ItemStack(Item.snowball, 16));
                        kit.add(new ItemStack(Item.carrot, 10));
                        kit.add(Item.diamondAxe);
                        kit.add(Item.ironHelmetProt3);
                        kit.add(Item.whiteLeatherLeggings);
                        kit.add(Item.ironBootsProjProt2);
                        kit.add(Item.whiteLeatherChest);
                        return kit;
                    //</editor-fold>
                }
                //</editor-fold>
        }
        return null;

    }
}
