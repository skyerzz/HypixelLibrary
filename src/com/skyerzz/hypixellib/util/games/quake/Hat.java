package com.skyerzz.hypixellib.util.games.quake;

import com.skyerzz.hypixellib.util.network.Currency;
import com.skyerzz.hypixellib.util.network.Rank;

import java.util.ArrayList;

/**
 * Created by sky on 7-7-2016.
 */
public enum Hat {
    SPACEMAN("Spaceman Hat"                     , 700   , Rank.NONE),
    LANTERN("Lantern Hat"                       , 700   , Rank.VIP),
    CACTUS("Cactus Hat"                         , 350   , Rank.VIP),
    REDSTONE("Redstone Hat"                     , 700   , Rank.VIP),
    DIAMOND("Diamond Hat"                       , 700   , Rank.VIP),
    MELON("Melon Hat"                           , 350   , Rank.NONE),
    DISPENSER("Dispenser Hat"                   , 700   , Rank.VIP),
    TNT("TNT Hat"                               , 700   , Rank.VIP_PLUS),
    MAJESTIC("Majestic Hat"                     , 700   , Rank.VIP_PLUS),
    MAJESTICHAT("Majestic Hat"                  , 700   , Rank.VIP_PLUS), //apeareantly, majestic & majestichat are both used for the same thing?
    HIPSTER("Hipster Hat"                       , 850   , Rank.VIP),
    HIPSTERHAT("Hipster Hat"                    , 850   , Rank.VIP), //same thing as majestic.
    CAVEMANHAT("Caveman Hat"                    , 850   , Rank.NONE),
    CONTROLFREAKHAT("Control Freak Hat"         , 850   , Rank.VIP),
    WALKINGDEADHAT("Walking Dead Hat"           , 900   , Rank.VIP_PLUS),
    JEEPERSCREEPERSHAT("Jeepers Creepers Hat"   , 900   , Rank.VIP_PLUS),
    RICHYRICHHAT("Richy Rich Hat"               , 1000  , Rank.VIP),
    ENGINEERINGHAT("Engineering Hat"            , 1000  , Rank.VIP_PLUS),
    CLASSYHAT("Classy Hat"                      , 1000  , Rank.VIP_PLUS),
    LIGHTHAT("Light Hat"                        , 1000  , Rank.VIP),
    ECOLOGYHAT("Ecology Hat"                    , 1000  , Rank.VIP),
    BOBHAT("Bob Hat"                            , 1500  , Rank.MVP),
    HYPIXELHAT("Hypixel Hat"                    , 2000  , Rank.MVP_PLUS);


    private String displayName;
    private int cost;
    private Rank rankRequirement;

    Hat(String displayName, int cost, Rank rankRequirement){
        this.displayName = displayName;
        this.cost = cost;
        this.rankRequirement = rankRequirement;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(Hat item: Hat.values()){
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
