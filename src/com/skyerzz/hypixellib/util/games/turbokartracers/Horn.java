package com.skyerzz.hypixellib.util.games.turbokartracers;

import com.skyerzz.hypixellib.util.CURRENCY;
import com.skyerzz.hypixellib.util.RANK;

import java.util.ArrayList;

/**
 * Created by sky on 2-8-2016.
 */
public enum HORN {
    //TODO: check
    DEFAULT("Default Horn", 0, RANK.NONE),   //checked
    SHY("Shy Horn", 10000, RANK.NONE),
    ALIEN("Alien Horn", 20000, RANK.VIP),
    BUSY_TAXI("Busy Taxi Horn", 20000, RANK.VIP),   //checked
    KLAXON("Klaxon Horn", 20000, RANK.VIP),
    TRICYCLE("Tricucle Horn", 25000, RANK.VIP_PLUS),
    ROAD_DRIVER("Road Driver Horn", 30000, RANK.VIP_PLUS),
    ALARM("Alarm Horn", 30000, RANK.MVP),
    KLOON("Kloon Horn", 40000, RANK.MVP),
    TEDDY_BEAR("Teddy Bear Horn", 40000, RANK.MVP_PLUS),
    TRUCK("Truck Horn", 50000, RANK.MVP_PLUS);


    private String displayName;
    private int cost;
    private RANK rankRequirement;

    HORN(String displayName, int cost, RANK rankRequirement){
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

    public RANK getRankRequirement(){
        return rankRequirement;
    }
}
