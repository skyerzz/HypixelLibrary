package com.skyerzz.hypixellib.util.games.copsandcrims;

import com.skyerzz.hypixellib.util.CURRENCY;
import com.skyerzz.hypixellib.util.RANKTYPE;

import java.util.ArrayList;

/**
 * Created by sky on 10-8-2016.
 */
public enum RADIOCOMMAND {
    TAUNT_GOODGAME(     "Taunt: Good game.",            200, RANKTYPE.VIP_PLUS),
    TAUNT_PEEKABOO(     "Taunt: Peekaboo!",             200, RANKTYPE.VIP_PLUS),
    TAUNT_MYMOTHER(     "Taunt: My mother.",            200, RANKTYPE.VIP_PLUS),
    TAUNT_REKT(         "Taunt: Rekt.",                 200, RANKTYPE.VIP_PLUS),
    TAUNT_KNIFEFIGHT(   "Taunt: Wanna knife fight?",    200, RANKTYPE.VIP_PLUS),
    TAUNT_TOOEASY(      "Taunt: Too easy.",             200, RANKTYPE.VIP_PLUS),
    TAUNT_POPAROUND(    "Taunt: Pop around.",           200, RANKTYPE.VIP_PLUS),
    TAUNT_MVP(          "Taunt: MVP",                   200, RANKTYPE.VIP_PLUS),
    TAUNT_ALLYOUGOT(    "Taunt: Is that all you got?",  200, RANKTYPE.VIP_PLUS),
    TAUNT_BEHINDYOU(    "Taunt: Behind you.",           200, RANKTYPE.VIP_PLUS),
    TAUNT_HYPIXEL(      "Taunt: Hypixel #1!",           200, RANKTYPE.VIP_PLUS),

    CALLOUT_LETSGOIN(           "Callout: Lets go in 3... 2...",    100, RANKTYPE.VIP),
    CALLOUT_NEGATIVE(           "Callout: Negative.",               100, RANKTYPE.VIP),
    CALLOUT_WEAPONFORYOU(       "Callout: Got a weapon for you.",   100, RANKTYPE.VIP),
    CALLOUT_FOLLOWME(           "Callout: Follow me.",              100, RANKTYPE.VIP),
    CALLOUT_TAKEITSLOW(         "Callout: Let's take it slow.",     100, RANKTYPE.VIP),
    CALLOUT_LETSRUSH(           "Callout: Let's rush.",             100, RANKTYPE.VIP),
    CALLOUT_THANKS(             "Callout: Thanks.",                 100, RANKTYPE.VIP),
    CALLOUT_SAVINGMYMONEY(      "Callout: Saving my money.",        100, RANKTYPE.VIP),
    CALLOUT_STACKUP(            "Callout: Stack up.",               100, RANKTYPE.VIP),
    CALLOUT_ROGERTHAT(          "Callout: Roget that.",             100, RANKTYPE.VIP),
    CALLOUT_COVERME(            "Callout: Cover me.",               100, RANKTYPE.VIP),
    CALLOUT_GOINTGOA(           "Callout: Going to A.",             100, RANKTYPE.VIP),
    CALLOUT_GOINGTOB(           "Callout: Going to B.",             100, RANKTYPE.VIP),
    CALLOUT_TAKETHEOTHERSIDE(   "Callout: Take the other side.",    100, RANKTYPE.VIP),
    CALLOUT_NEEDAWEAPON(        "Callout: Need a weapon.",          100, RANKTYPE.VIP);

    private String displayName;
    private int cost;
    private RANKTYPE rankRequirement;

    RADIOCOMMAND(String displayName, int cost, RANKTYPE rankRequirement){
        this.displayName = displayName;
        this.cost = cost;
        this.rankRequirement = rankRequirement;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(RADIOCOMMAND item: RADIOCOMMAND.values()){
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

    public RANKTYPE getRankRequirement(){
        return rankRequirement;
    }

    public CURRENCY getCurrency() { return CURRENCY.COINS; }
}
