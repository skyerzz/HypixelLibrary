package com.skyerzz.hypixellib.util.network.networklevel;

/**
 * Created by Skyerzz-LAPOTOP on 16/03/2017.
 */
public class ArcadeCoinsReward extends LevelReward {

    private int amount;

    public ArcadeCoinsReward(int amount){
        this.amount = amount;
    }

    public int getAmount(){
        return amount;
    }
}
