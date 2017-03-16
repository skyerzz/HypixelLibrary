package com.skyerzz.hypixellib.util.games.turbokartracers;

import com.skyerzz.hypixellib.util.Currency;
import com.skyerzz.hypixellib.util.Rank;

import java.util.ArrayList;

/**
 * Created by sky on 2-8-2016.
 */
public enum Horn {
    //TODO: check
    DEFAULT("Default Horn", 0, Rank.NONE),   //checked
    SHY("Shy Horn", 10000, Rank.NONE),
    ALIEN("Alien Horn", 20000, Rank.VIP),
    BUSY_TAXI("Busy Taxi Horn", 20000, Rank.VIP),   //checked
    KLAXON("Klaxon Horn", 20000, Rank.VIP),
    TRICYCLE("Tricucle Horn", 25000, Rank.VIP_PLUS),
    ROAD_DRIVER("Road Driver Horn", 30000, Rank.VIP_PLUS),
    ALARM("Alarm Horn", 30000, Rank.MVP),
    KLOON("Kloon Horn", 40000, Rank.MVP),
    TEDDY_BEAR("Teddy Bear Horn", 40000, Rank.MVP_PLUS),
    TRUCK("Truck Horn", 50000, Rank.MVP_PLUS);


    private String displayName;
    private int cost;
    private Rank rankRequirement;

    Horn(String displayName, int cost, Rank rankRequirement){
        this.displayName = displayName;
        this.cost = cost;
        this.rankRequirement = rankRequirement;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(Horn item: Horn.values()){
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

    public Currency getCurrencyType(){
        return Currency.COINS;
    }

    public Rank getRankRequirement(){
        return rankRequirement;
    }
}
