package com.skyerzz.hypixellib.util.games.tntgames;

import com.skyerzz.hypixellib.util.CURRENCY;
import com.skyerzz.hypixellib.util.RANKTYPE;

import java.util.ArrayList;

/**
 * Created by sky on 22-7-2016.
 */
public enum WIZARD {
    FIRE("Fire Wizard", RANKTYPE.DEFAULT),
    KINETIC("Kinetic Wizard", RANKTYPE.DEFAULT),
    ICE("Ice Wizard", RANKTYPE.DEFAULT),
    WITHER("Wither Wizard", RANKTYPE.DEFAULT),
    BLOOD("Blood Wizard", RANKTYPE.DEFAULT);

    private String displayName;
    private RANKTYPE rankRequirement;

    WIZARD(String displayName, RANKTYPE rankRequirement){
        this.displayName = displayName;
        this.rankRequirement = rankRequirement;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(WIZARD item: WIZARD.values()){
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

    public CURRENCY getCurrencyType(){
        return CURRENCY.COINS;
    }

    public RANKTYPE getRankRequirement(){
        return rankRequirement;
    }
}
