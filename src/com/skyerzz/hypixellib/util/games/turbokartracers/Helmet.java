package com.skyerzz.hypixellib.util.games.turbokartracers;

import com.skyerzz.hypixellib.util.Currency;
import com.skyerzz.hypixellib.util.Rank;

import java.util.ArrayList;

/**
 * Created by sky on 2-8-2016.
 */
public enum Helmet {
    NO_HELMET(       "No helmet", 0, Rank.NONE),
    HELMET_1_1( "Race Red Headline",    0,      Rank.NONE),  //checked
    HELMET_1_2( "Sunset Headline",      1000,   Rank.NONE),
    HELMET_1_3( "Ocean Headline",       5000,   Rank.NONE),
    HELMET_2_1( "Amethyst Classico",    25000,  Rank.VIP),
    HELMET_2_2( "Ruby Classico",        5000,   Rank.VIP),
    HELMET_2_3( "Emerald Classico",     1000,   Rank.VIP),
    HELMET_3_1( "Banana Noggin Cap",    25000,  Rank.VIP),
    HELMET_3_2( "Peach Noggin Cap",     1000,   Rank.VIP),
    HELMET_3_3( "Apple Noggin Cap",     5000,   Rank.VIP),
    HELMET_4_1( "Diamond Bonnet",       1000,   Rank.NONE),
    HELMET_4_2( "Obsidian Bonnet",      25000,  Rank.NONE),
    HELMET_4_3( "Redstone Bonnet",      5000,   Rank.NONE),  //checked
    HELMET_5_1( "Bone Warrior",         1000,   Rank.MVP_PLUS),
    HELMET_5_2( "Lizard Warrior",       5000,   Rank.MVP_PLUS),
    HELMET_5_3( "Ghost Warrior",        25000,  Rank.MVP_PLUS),
    HELMET_6_1( "Green Mantis",         5000,   Rank.MVP),
    HELMET_6_2( "White Mantis",         25000,  Rank.MVP),
    HELMET_6_3( "Purple Mantis",        1000,   Rank.MVP),
    HELMET_7_1( "Lime Casque",          25000,  Rank.VIP_PLUS),
    HELMET_7_2( "Orange Casque",        1000,   Rank.VIP_PLUS),
    HELMET_7_3( "Blueberry Casque",     5000,   Rank.VIP_PLUS),
    HELMET_8_1( "Void Offroader",       25000,  Rank.VIP_PLUS),
    HELMET_8_2( "Fields Offroader",     1000,   Rank.VIP_PLUS),
    HELMET_8_3( "River Offroader",      5000,   Rank.VIP_PLUS),
    HELMET_9_1( "Orchid Speedster",     1000,   Rank.MVP_PLUS),
    HELMET_9_2( "Tangerine Speedster",  25000,  Rank.MVP_PLUS),
    HELMET_9_3( "Ceruelean Speedster",  5000,   Rank.MVP_PLUS),
    HELMET_10_1("Bubblegum Futurehelm", 1000,   Rank.MVP),
    HELMET_10_2("Gobstopper Futurehelm",25000,  Rank.MVP),
    HELMET_10_3("Bonbon Futurehelm",    5000,   Rank.MVP),
    HELMET_11("D. Goggles",           25000,  Rank.MVP);


    private String displayName;
    private int cost;
    private Rank rankRequirement;

    Helmet(String displayName, int cost, Rank rankRequirement){
        this.displayName = displayName;
        this.cost = cost;
        this.rankRequirement = rankRequirement;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(Helmet item: Helmet.values()){
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
