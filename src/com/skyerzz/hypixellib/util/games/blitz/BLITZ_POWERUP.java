package com.skyerzz.hypixellib.util.games.blitz;

import com.skyerzz.hypixellib.OutDated;
import com.skyerzz.hypixellib.util.CURRENCY;
import com.skyerzz.hypixellib.util.RANKTYPE;

import java.util.ArrayList;

/**
 * Created by sky on 19-11-2016.
 */
public enum BLITZ_POWERUP {
    @OutDated
    RAPID_FIRE("DOESNT EXIST ANYMORE- RapidFire", -1),
    @OutDated
    LIGHTNING("DOESNT EXIST ANYMORE - Lightning", -1),
    @OutDated
    EXPLOSIONS("DOESNT EXIST ANYMORE - Explosions", -1),


    APOCALYPSE("Apocalpyse", 0),
    VAMPIRE("Vampire", 0),
    JEDI_KNIGHT("Jedi Knight", 0),
    NOCTURNE("Nocturne", 0),


    ASSASSIN("Assassin", 20000),
    IMPRISON("Statis", 40000),
    VAULTHUNTER("Vault Hunter", 30000),
    WITHERWARRIOR("Wither Warrior", 20000),
    GREMLIN("Gremlin", 20000),
    ROULETTE("Roulette", 40000),
    INVOKER("Invoker", 20000),
    WOBBUFFET("Ironman", 20000),
    NUKE("Nuke", 30000),
    NINJA("Ninja", 20000),
    ROBINHOOD("Robinhood", 20000),
    SUPPLIES("Supplies", 20000),
    SHOTGUN("No country for old men", 30000),
    KOOLMOVE("Sweg Move", 40000); //todo: check if this is right

    private String displayName;
    private int cost;

    BLITZ_POWERUP(String displayName, int cost){
        this.displayName = displayName;
        this.cost = cost;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(BLITZ_POWERUP item: BLITZ_POWERUP.values()){
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
        return RANKTYPE.DEFAULT;
    }
}
