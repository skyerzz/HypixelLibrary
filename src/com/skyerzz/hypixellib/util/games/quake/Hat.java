package com.skyerzz.hypixellib.util.games.quake;

import com.skyerzz.hypixellib.util.CURRENCY;
import com.skyerzz.hypixellib.util.RANK;

import java.util.ArrayList;

/**
 * Created by sky on 7-7-2016.
 */
public enum HAT {
    SPACEMAN("Spaceman Hat"                     , 700   , RANK.NONE),
    LANTERN("Lantern Hat"                       , 700   , RANK.VIP),
    CACTUS("Cactus Hat"                         , 350   , RANK.VIP),
    REDSTONE("Redstone Hat"                     , 700   , RANK.VIP),
    DIAMOND("Diamond Hat"                       , 700   , RANK.VIP),
    MELON("Melon Hat"                           , 350   , RANK.NONE),
    DISPENSER("Dispenser Hat"                   , 700   , RANK.VIP),
    TNT("TNT Hat"                               , 700   , RANK.VIP_PLUS),
    MAJESTIC("Majestic Hat"                     , 700   , RANK.VIP_PLUS),
    MAJESTICHAT("Majestic Hat"                  , 700   , RANK.VIP_PLUS), //apeareantly, majestic & majestichat are both used for the same thing?
    HIPSTER("Hipster Hat"                       , 850   , RANK.VIP),
    HIPSTERHAT("Hipster Hat"                    , 850   , RANK.VIP), //same thing as majestic.
    CAVEMANHAT("Caveman Hat"                    , 850   , RANK.NONE),
    CONTROLFREAKHAT("Control Freak Hat"         , 850   , RANK.VIP),
    WALKINGDEADHAT("Walking Dead Hat"           , 900   , RANK.VIP_PLUS),
    JEEPERSCREEPERSHAT("Jeepers Creepers Hat"   , 900   , RANK.VIP_PLUS),
    RICHYRICHHAT("Richy Rich Hat"               , 1000  , RANK.VIP),
    ENGINEERINGHAT("Engineering Hat"            , 1000  , RANK.VIP_PLUS),
    CLASSYHAT("Classy Hat"                      , 1000  , RANK.VIP_PLUS),
    LIGHTHAT("Light Hat"                        , 1000  , RANK.VIP),
    ECOLOGYHAT("Ecology Hat"                    , 1000  , RANK.VIP),
    BOBHAT("Bob Hat"                            , 1500  , RANK.MVP),
    HYPIXELHAT("Hypixel Hat"                    , 2000  , RANK.MVP_PLUS);


    private String displayName;
    private int cost;
    private RANK rankRequirement;

    HAT(String displayName, int cost, RANK rankRequirement){
        this.displayName = displayName;
        this.cost = cost;
        this.rankRequirement = rankRequirement;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(HAT item: HAT.values()){
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

    public CURRENCY getCurrencyType(){ return CURRENCY.COINS; }

    public RANK getRankRequirement(){
        return rankRequirement;
    }
}
