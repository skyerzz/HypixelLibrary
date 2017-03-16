package com.skyerzz.hypixellib.util.games.turbokartracers;

import com.skyerzz.hypixellib.util.network.Currency;
import com.skyerzz.hypixellib.util.network.Rank;

import java.util.ArrayList;

/**
 * Created by sky on 2-8-2016.
 */
public enum KartSkin {
    //TODO: sort this shit out
    BLUE_KART_DEFAULT("Hypesweggen - Sapphire", 0, Rank.NONE),
    BLUE_KART_ALT_1("Hypesweggen - Tranquility", 1300, Rank.NONE),
    BLUE_KART_ALT_2("Hypesweggen - Commando", 2800, Rank.NONE),
    WHITE_KART_DEFAULT("Blueshell Inc - Phantom", 0, Rank.NONE),
    WHITE_KART_ALT_1("Blueshell Inc - Eclipse", 1300, Rank.NONE),
    WHITE_KART_ALT_2("Blueshell Inc - Dante", 2800, Rank.NONE),
    YELLOW_KART_DEFAULT("Slothdinger - Goldline", 0, Rank.NONE),
    YELLOW_KART_ALT_1("Slothdinger - Sunrise", 1300, Rank.NONE),
    YELLOW_KART_ALT_2("Slothdinger - Ultraviolet", 2800, Rank.NONE),
    RED_KART_DEFAULT("Turbobrine - Diablo", 0, Rank.NONE),
    RED_KART_ALT_1("Turbobrine - Junker", 1300, Rank.NONE),
    RED_KART_ALT_2("Turbobrine - Frostbit", 2800, Rank.NONE),
    GREEN_KART_DEFAULT("Sphax Corp - Salamander", 0, Rank.NONE),
    GREEN_KART_ALT_1("Sphax Corp - Glacius", 1300, Rank.NONE),
    GREEN_KART_ALT_2("Sphax Corp - Silver Shadow", 2800, Rank.NONE);


    private String displayName;
    private int cost;
    private Rank rankRequirement;

    KartSkin(String displayName, int cost, Rank rankRequirement){
        this.displayName = displayName;
        this.cost = cost;
        this.rankRequirement = rankRequirement;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(KartSkin item: KartSkin.values()){
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

    public Rank getRankRequirement(){
        return rankRequirement;
    }

    public Currency getCurrencyType() { return Currency.HYPIXEL_CREDITS; }
}
