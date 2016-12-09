package com.skyerzz.hypixellib.util.games.turbokartracers;

import com.skyerzz.hypixellib.util.CURRENCY;
import com.skyerzz.hypixellib.util.RANKTYPE;

import java.util.ArrayList;

/**
 * Created by sky on 2-8-2016.
 */
public enum HORN {
    //TODO: check
    DEFAULT("Default Horn", 0, RANKTYPE.DEFAULT),   //checked
    SHY("Shy Horn", 10000, RANKTYPE.DEFAULT),
    ALIEN("Alien Horn", 20000, RANKTYPE.VIP),
    BUSY_TAXY("Busy Taxy Horn", 20000, RANKTYPE.VIP),   //checked
    KLAXON("Klaxon Horn", 20000, RANKTYPE.VIP),
    TRICYCLE("Tricucle Horn", 25000, RANKTYPE.VIP_PLUS),
    ROAD_DRIVER("Road Driver Horn", 30000, RANKTYPE.VIP_PLUS),
    ALARM("Alarm Horn", 30000, RANKTYPE.MVP),
    KLOON("Kloon Horn", 40000, RANKTYPE.MVP),
    TEDDY_BEAR("Teddy Bear Horn", 40000, RANKTYPE.MVP_PLUS),
    TRUCK("Truck Horn", 50000, RANKTYPE.MVP_PLUS);


    private String displayName;
    private int cost;
    private RANKTYPE rankRequirement;

    HORN(String displayName, int cost, RANKTYPE rankRequirement){
        this.displayName = displayName;
        this.cost = cost;
        this.rankRequirement = rankRequirement;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(HORN item: HORN.values()){
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

    public CURRENCY getCurrencyType(){
        return CURRENCY.COINS;
    }

    public RANKTYPE getRankRequirement(){
        return rankRequirement;
    }
}
