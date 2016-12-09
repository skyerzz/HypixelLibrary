package com.skyerzz.hypixellib.util.games.quake;

import com.skyerzz.hypixellib.util.CURRENCY;
import com.skyerzz.hypixellib.util.RANKTYPE;

import java.util.ArrayList;

/**
 * Created by sky on 7-7-2016.
 */
public enum TRIGGER {
    NINE_POINT_ZERO("9.0", 10000, RANKTYPE.DEFAULT, 9.0),
    FIVE_POINT_ZERO("5.0", 5000, RANKTYPE.DEFAULT, 5.0),
    TWO_POINT_FIVE("2.5", 5000, RANKTYPE.DEFAULT, 2.5),
    ONE_POINT_FIVE("1.5", 0, RANKTYPE.DEFAULT, 1.5),
    ONE_POINT_FOUR("1.4", 1800, RANKTYPE.DEFAULT, 1.4),
    ONE_POINT_THREE("1.3", 3500, RANKTYPE.DEFAULT, 1.3),
    ONE_POINT_TWO("1.2", 8500, RANKTYPE.DEFAULT, 1.2),
    ONE_POINT_ONE("1.1", 17000, RANKTYPE.DEFAULT, 1.1),
    ONE_POINT_ZERO("1.0", 100000, RANKTYPE.DEFAULT, 1.0),
    ZERO_POINT_NINE("0.9", 300000, RANKTYPE.DEFAULT, 0.9);

    private String displayName;
    private int cost;
    private RANKTYPE rankRequirement;
    private double triggerSpeed;

    TRIGGER(String displayName, int cost, RANKTYPE rankRequirement, double triggerSpeed){
        this.displayName = displayName;
        this.cost = cost;
        this.rankRequirement = rankRequirement;
        this.triggerSpeed = triggerSpeed;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(TRIGGER item: TRIGGER.values()){
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

    public CURRENCY getCurrencyType(){ return CURRENCY.COINS; }

    public RANKTYPE getRankRequirement(){
        return rankRequirement;
    }
}
