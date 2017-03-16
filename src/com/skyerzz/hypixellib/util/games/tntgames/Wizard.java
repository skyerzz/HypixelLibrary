package com.skyerzz.hypixellib.util.games.tntgames;

import com.skyerzz.hypixellib.util.network.Currency;
import com.skyerzz.hypixellib.util.network.Rank;

import java.util.ArrayList;

/**
 * Created by sky on 22-7-2016.
 */
public enum Wizard {
    FIRE("Fire Wizard", Rank.NONE),
    KINETIC("Kinetic Wizard", Rank.NONE),
    ICE("Ice Wizard", Rank.NONE),
    WITHER("Wither Wizard", Rank.NONE),
    BLOOD("Blood Wizard", Rank.NONE);

    private String displayName;
    private Rank rankRequirement;

    Wizard(String displayName, Rank rankRequirement){
        this.displayName = displayName;
        this.rankRequirement = rankRequirement;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(Wizard item: Wizard.values()){
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
                return 500;
            case 2:
                return 995;
            case 3:
                return 2210;
            case 4:
                return 4415;
            case 5:
                return 7880;
            case 6:
                return 12875;
            case 7:
                return 19670;
            case 8:
                return 28535;
            case 9:
                return 39740;
            case 10:
                return 53555;
            default: return 0;
        }
        /*
         * 1: 500
         * 2: 995
         * 3: 2.210
         * 4: 4.415
         * 5: 7.880
         * 6: 12.875
         * 7: 19.670
         * 8: 28.535
         * 9: 39.740
         * 10: 53.555
         */
    }

    public Currency getCurrencyType(){
        return Currency.COINS;
    }

    public Rank getRankRequirement(){
        return rankRequirement;
    }
}
