package com.skyerzz.hypixellib.util.network.pet;

/**
 * Created by Skyerzz-LAPOTOP on 17/03/2017.
 */
public class PetStat {

    private int statLevel;
    private petStatType statType;
    private long timeStamp;

    public PetStat(petStatType statType, long timeStamp, int statLevel){
        this.statLevel = statLevel;
        this.timeStamp = timeStamp;
        this.statType = statType;
    }

    public int getStatLevel(){
        return statLevel;
    }

    public petStatType getStatType(){
        return statType;
    }

    public long getTimeStamp(){
        return timeStamp;
    }


    public enum petStatType{
        THIRST,
        HUNGER,
        EXERCISE;
    }
}
