package com.skyerzz.hypixellib.util.games.turbokartracers;

import com.skyerzz.hypixellib.util.CURRENCY;
import com.skyerzz.hypixellib.util.RANKTYPE;

import java.util.ArrayList;

/**
 * Created by sky on 2-8-2016.
 */
public enum KARTSKIN {
    //TODO: sort this shit out
    BLUE_KART_DEFAULT("Hypesweggen - Sapphire", 0, RANKTYPE.DEFAULT),
    BLUE_KART_ALT_1("Hypesweggen - Tranquility", 1300, RANKTYPE.DEFAULT),
    BLUE_KART_ALT_2("Hypesweggen - Commando", 2800, RANKTYPE.DEFAULT),
    WHITE_KART_DEFAULT("Blueshell Inc - Phantom", 0, RANKTYPE.DEFAULT),
    WHITE_KART_ALT_1("Blueshell Inc - Eclipse", 1300, RANKTYPE.DEFAULT),
    WHITE_KART_ALT_2("Blueshell Inc - Dante", 2800, RANKTYPE.DEFAULT),
    YELLOW_KART_DEFAULT("Slothdinger - Goldline", 0, RANKTYPE.DEFAULT),
    YELLOW_KART_ALT_1("Slothdinger - Sunrise", 1300, RANKTYPE.DEFAULT),
    YELLOW_KART_ALT_2("Slothdinger - Ultraviolet", 2800, RANKTYPE.DEFAULT),
    RED_KART_DEFAULT("Turbobrine - Diablo", 0, RANKTYPE.DEFAULT),
    RED_KART_ALT_1("Turbobrine - Junker", 1300, RANKTYPE.DEFAULT),
    RED_KART_ALT_2("Turbobrine - Frostbit", 2800, RANKTYPE.DEFAULT),
    GREEN_KART_DEFAULT("Sphax Corp - Salamander", 0, RANKTYPE.DEFAULT),
    GREEN_KART_ALT_1("Sphax Corp - Glacius", 1300, RANKTYPE.DEFAULT),
    GREEN_KART_ALT_2("Sphax Corp - Silver Shadow", 2800, RANKTYPE.DEFAULT);


    private String displayName;
    private int cost;
    private RANKTYPE rankRequirement;

    KARTSKIN(String displayName, int cost, RANKTYPE rankRequirement){
        this.displayName = displayName;
        this.cost = cost;
        this.rankRequirement = rankRequirement;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(KARTSKIN item: KARTSKIN.values()){
            list.add(item.name());
        }
        return list;
    }

    public String getDisplayName(){
        return displayName;
    }

    public int getCost(){
        return cost;
    }

    public RANKTYPE getRankRequirement(){
        return rankRequirement;
    }

    public CURRENCY getCurrencyType() { return CURRENCY.HYPIXEL_CREDITS; }
}
