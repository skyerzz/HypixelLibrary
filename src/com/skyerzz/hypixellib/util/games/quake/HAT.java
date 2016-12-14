package com.skyerzz.hypixellib.util.games.quake;

import com.skyerzz.hypixellib.util.CURRENCY;
import com.skyerzz.hypixellib.util.RANKTYPE;

import java.util.ArrayList;

/**
 * Created by sky on 7-7-2016.
 */
public enum HAT {
    SPACEMAN("Spaceman Hat"                     , 700   , RANKTYPE.DEFAULT),
    LANTERN("Lantern Hat"                       , 700   , RANKTYPE.VIP),
    CACTUS("Cactus Hat"                         , 350   , RANKTYPE.VIP),
    REDSTONE("Redstone Hat"                     , 700   , RANKTYPE.VIP),
    DIAMOND("Diamond Hat"                       , 700   , RANKTYPE.VIP),
    MELON("Melon Hat"                           , 350   , RANKTYPE.DEFAULT),
    DISPENSER("Dispenser Hat"                   , 700   , RANKTYPE.VIP),
    TNT("TNT Hat"                               , 700   , RANKTYPE.VIP_PLUS),
    MAJESTIC("Majestic Hat"                     , 700   , RANKTYPE.VIP_PLUS),
    MAJESTICHAT("Majestic Hat"                  , 700   , RANKTYPE.VIP_PLUS), //apeareantly, majestic & majestichat are both used for the same thing?
    HIPSTER("Hipster Hat"                       , 850   , RANKTYPE.VIP),
    HIPSTERHAT("Hipster Hat"                    , 850   , RANKTYPE.VIP), //same thing as majestic.
    CAVEMANHAT("Caveman Hat"                    , 850   , RANKTYPE.DEFAULT),
    CONTROLFREAKHAT("Control Freak Hat"         , 850   , RANKTYPE.VIP),
    WALKINGDEADHAT("Walking Dead Hat"           , 900   , RANKTYPE.VIP_PLUS),
    JEEPERSCREEPERSHAT("Jeepers Creepers Hat"   , 900   , RANKTYPE.VIP_PLUS),
    RICHYRICHHAT("Richy Rich Hat"               , 1000  , RANKTYPE.VIP),
    ENGINEERINGHAT("Engineering Hat"            , 1000  , RANKTYPE.VIP_PLUS),
    CLASSYHAT("Classy Hat"                      , 1000  , RANKTYPE.VIP_PLUS),
    LIGHTHAT("Light Hat"                        , 1000  , RANKTYPE.VIP),
    ECOLOGYHAT("Ecology Hat"                    , 1000  , RANKTYPE.VIP),
    BOBHAT("Bob Hat"                            , 1500  , RANKTYPE.MVP),
    HYPIXELHAT("Hypixel Hat"                    , 2000  , RANKTYPE.MVP_PLUS);


    private String displayName;
    private int cost;
    private RANKTYPE rankRequirement;

    HAT(String displayName, int cost, RANKTYPE rankRequirement){
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

    public RANKTYPE getRankRequirement(){
        return rankRequirement;
    }
}
