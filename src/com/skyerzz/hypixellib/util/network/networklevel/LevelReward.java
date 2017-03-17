package com.skyerzz.hypixellib.util.network.networklevel;

import com.skyerzz.hypixellib.util.network.CurrencyPackage;

import java.util.ArrayList;

/**
 * Created by Skyerzz-LAPOTOP on 14/03/2017.
 */
public class LevelReward {

    private MVPPlusColor plusColor;
    private CurrencyPackage currency;
    private int rewardType;

    LevelReward(CurrencyPackage currency, int rewardType){
        this.currency = currency;
        this.rewardType = rewardType;
    }

    LevelReward(MVPPlusColor plusColor, int rewardType){
        this.plusColor = plusColor;
        this.rewardType = rewardType;
    }

    public CurrencyPackage getCurrency(){
        return currency;
    }

    public MVPPlusColor getPlusColor(){
        return plusColor;
    }

    public int getRewardType(){
        return rewardType;
    }

    public static ArrayList<LevelReward> getRewards(int level){
        switch(level){
            case 1:
                //todo finish this
        }
        return null;
    }

    public enum LevelRewardType{
        CURRENCYPACKAGE(1),
        MVPPLUSCOLOR(2),
        PERSONALBOOSTER(3);

        private int code;

        LevelRewardType(int code){
            this.code = code;
        }

        public int getCode(){
            return code;
        }

        public static LevelRewardType getLevelRewardType(int code){
            for(LevelRewardType l: LevelRewardType.values()){
                if(l.getCode() == code){
                    return l;
                }
            }
            return null;
        }

    }
}
