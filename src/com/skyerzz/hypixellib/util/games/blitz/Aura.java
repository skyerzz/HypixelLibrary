package com.skyerzz.hypixellib.util.games.blitz;

import com.skyerzz.hypixellib.util.network.Currency;
import com.skyerzz.hypixellib.util.network.Rank;

import java.util.ArrayList;

/**
 * Created by sky on 19-11-2016.
 */
public enum Aura {
    RED("Red Particle Aura", 0, Rank.VIP),
    BLUE("Blue Particle Aura", 0, Rank.VIP),
    GREEN("Green Particle Aura", 0, Rank.VIP),
    RAINBOW("Rainbow Particle Aura", 0, Rank.VIP_PLUS),
    SLIME("Slime Particle Aura", 0, Rank.VIP_PLUS),
    PORTAL("Portal Particle Aura", 0, Rank.MVP_PLUS),
    DUST("Rainbow Dust Particle Aura", 0, Rank.VIP_PLUS),
    ENCHANTING("Enchanting Particle Aura", 0, Rank.MVP_PLUS),
    LAVA("Lava Particle Aura", 0, Rank.VIP_PLUS),
    SNOW("Snow Particle Aura", 0, Rank.VIP),
    WATER("Water Particle Aura", 0, Rank.VIP),
    DAYLIGHT("Daylight Sensor Particle Aura", 0, Rank.VIP),
    MYCELIUM_TRAIL("Mycelium Trail", 0, Rank.VIP_PLUS),
    NETHERRACK_TRAIL("Netherrack Trail", 0, Rank.VIP_PLUS),
    TRON_RAINBOW_TRAIL("Rainbow Tron Trail", 0, Rank.MVP_PLUS),
    TRON_RED_TRAIL("Red Tron Trail", 0, Rank.VIP_PLUS),
    TRON_BLUE_TRAIL("Blue Tron Trail", 0, Rank.VIP_PLUS),
    TRON_GREEN_TRAIL("Green Tron Trail", 0, Rank.VIP_PLUS),
    FLOWER_TRAIL("Flower Trail", 0, Rank.MVP),
    WHEAT_TRAIL("Wheat Crops Trail", 0, Rank.MVP);

    private String displayName;
    private int cost;
    private Rank rankRequirement;

    Aura(String displayName, int cost, Rank rankRequirement){
        this.displayName = displayName;
        this.cost = cost;
        this.rankRequirement = rankRequirement;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(Aura item: Aura.values()){
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

    public Currency getCurrencyType(){ return Currency.COINS; }

    public Rank getRankRequirement(){
        return rankRequirement;
    }
}
