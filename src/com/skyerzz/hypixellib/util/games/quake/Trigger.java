package com.skyerzz.hypixellib.util.games.quake;

import com.skyerzz.hypixellib.util.Currency;
import com.skyerzz.hypixellib.util.Rank;

import java.util.ArrayList;

/**
 * Created by sky on 7-7-2016.
 */
public enum Trigger {
    NINE_POINT_ZERO("9.0", 10000, Rank.NONE, 9.0),
    FIVE_POINT_ZERO("5.0", 5000, Rank.NONE, 5.0),
    TWO_POINT_FIVE("2.5", 5000, Rank.NONE, 2.5),
    ONE_POINT_FIVE("1.5", 0, Rank.NONE, 1.5),
    ONE_POINT_FOUR("1.4", 1800, Rank.NONE, 1.4),
    ONE_POINT_THREE("1.3", 3500, Rank.NONE, 1.3),
    ONE_POINT_TWO("1.2", 8500, Rank.NONE, 1.2),
    ONE_POINT_ONE("1.1", 17000, Rank.NONE, 1.1),
    ONE_POINT_ZERO("1.0", 100000, Rank.NONE, 1.0),
    ZERO_POINT_NINE("0.9", 300000, Rank.NONE, 0.9);

    private String displayName;
    private int cost;
    private Rank rankRequirement;
    private double triggerSpeed;

    Trigger(String displayName, int cost, Rank rankRequirement, double triggerSpeed){
        this.displayName = displayName;
        this.cost = cost;
        this.rankRequirement = rankRequirement;
        this.triggerSpeed = triggerSpeed;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(Trigger item: Trigger.values()){
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

    private double getTriggerSpeed(){
        return triggerSpeed;
    }

    public Currency getCurrencyType(){ return Currency.COINS; }

    public Rank getRankRequirement(){
        return rankRequirement;
    }
}
