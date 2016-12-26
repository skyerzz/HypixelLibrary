package com.skyerzz.hypixellib.util.games.skywars;

import java.util.ArrayList;

/**
 * Created by sky on 25-12-2016.
 */
public enum UPGRADE {
    XEZBETH_LUCK("Xezbeth Luck", 3),
    HARVESTING_SEASON("Harvesting Season", 5);

    private String displayName;
    private int maxLevel;

    UPGRADE(String displayName, int maxLevel){
        this.displayName = displayName;
        this.maxLevel = maxLevel;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(UPGRADE item: UPGRADE.values()){
            list.add(item.name());
        }
        return list;
    }

    public String getDisplayName(){
        return displayName;
    }

    public int getCost(int level){
        if(level < 1 || level > maxLevel){
            return -1;
        }
        switch(this){
            case XEZBETH_LUCK:
                return 2500*level;
            case HARVESTING_SEASON:
                return 50000*level;
        }
        return -1;
    }

    public String getDescription(int level){
        if(level < 1 || level > maxLevel){
            return null;
        }
        switch(this){
            case XEZBETH_LUCK:
                return "Increase the souls you get per win by " + level + ".";
            case HARVESTING_SEASON:
                return "Increase the maximum number of souls you can have to " + 100+(level*30) + ".";
        }
        return null;
    }
}
