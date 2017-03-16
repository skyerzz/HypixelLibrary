package com.skyerzz.hypixellib.util.games.tntgames;

import com.skyerzz.hypixellib.util.Currency;
import com.skyerzz.hypixellib.util.Rank;

import java.util.ArrayList;

/**
 * Created by sky on 22-7-2016.
 */
public enum Perk {
    DOUBLEJUMP_TNTRUN("TNTRun DoubleJump", 10, Rank.NONE),
    SPLEEF_DOUBLEJUMP("Bowspleef DoubleJump", 10, Rank.NONE),
    SPLEEF_REPULSE("Bowspleef Repulsor", 10, Rank.NONE),
    SPLEEF_TRIPLE("Bowspleef TripleShot", 10, Rank.NONE),
    TAG_SPEED("TNTTag speedy", 6, Rank.NONE);

    private String displayName;
    private int maxLevel;
    private Rank rankRequirement;

    Perk(String displayName, int maxLevel, Rank rankRequirement){
        this.displayName = displayName;
        this.maxLevel = maxLevel;
        this.rankRequirement = rankRequirement;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(Perk item: Perk.values()){
            list.add(item.name());
        }
        return list;
    }

    public String getDisplayName(){
        return displayName;
    }

    public int getCost(int level){
        switch(level){
            case 10:
            case 9:
                return 58500;
            case 8:
                return 40000;
            case 7:
                return 25900;
            case 6:
                return 15600;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:

            default:
                return 0;
        }
        //TODO: sort this shit out
        /*
         * speedy 1: 400
         * speedy 2:
         * speedy 3:
         * speedy 4: 6475
         * speedy 5:
         */
    }

    public int getMaxLevel() {return maxLevel; }

    public Currency getCurrencyType(){
        return Currency.COINS;
    }

    public Rank getRankRequirement(){
        return rankRequirement;
    }
}
