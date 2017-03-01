package com.skyerzz.hypixellib.util.games.arena;

import java.util.ArrayList;

/**
 * Created by sky on 27-2-2017.
 */
public enum RUNE {
    SLOW("Rune of Slowing", "Your melee attacks have a %%AMOUNT%%% chance to slow your enemy for 3 seconds."),
    SPEED("Rune of Speed", "Your melee attacks have a %%AMOUNT%%% chance increase your movement speed by 40% for 3 seconds."), //fixonline chance increase > chance to increase
    ENERGY("Rune of Energy", "Your melee attacks have a %%AMOUNT%%% chance to restore 8 energy."),
    DAMAGE("Rune of Damage", "Your melee attacks have a %%AMOUNT%%% chance to deal 50% extra damage."); //fixonline extra spaces between "50% extra"


    private String name, description;

    RUNE(String name, String description){
        this.name = name;
        this.description = description;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static java.util.ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(RUNE item: RUNE.values()){
            list.add(item.name());
        }
        return list;
    }

    public String getName(){
        return name;
    }

    public String getDescription(int level){
        return description.replace("%%AMOUNT%%", getChance(level)+"");
    }

    public int getChance(int level){
        if(level<0 || level > 7){
            return -1;
        }
        return 5+level;
    }

    public int getCost(int level){
        if(level<0||level>7){
            return -1;
        }
        switch(level){
            case 1:
                return 500;
            case 2:
                return 3250;
            case 3:
                return 13000;
            case 4:
                return 29250;
            case 5:
                return 52000;
            case 6:
                return 81250;
            case 7:
                return 117000;
        }
        return -1;
    }
}
