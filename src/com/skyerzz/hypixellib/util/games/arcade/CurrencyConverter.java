package com.skyerzz.hypixellib.util.games.arcade;

import com.skyerzz.hypixellib.util.games.Gamemode;

/**
 * Created by sky on 4-9-2016.
 */
public class CurrencyConverter {

    private CurrencyConverter(){

    }

    public int getConvertedCoins(Gamemode gameMode, int level){
        if(level>3 || level < 1){
            return -1;
        }
        int multiplier = getConvertedCoinMultiplier(level);
        switch(gameMode){
            case WALLS:
            case MEGA_WALLS:
            case UHC:
            case WARLORDS:
            case SKYWARS:
            case SUPER_SMASH:
                return 500*multiplier;

            case MCGO:
            case SURVIVAL_GAMES:
            case QUAKECRAFT:
            case ARENA:
            case WALLS3:
                return 750*multiplier;

            case PAINTBALL:
            case VAMPIREZ:
            case TNTGAMES:
                return 2500*multiplier;

        }
        return -1;
    }

    private int getConvertedCoinMultiplier(int level){
        switch(level){
            case 1:
                return 1;
            case 2:
                return 3;
            case 3:
                return 20;
        }
        return -1;
    }

    public int getConvertedCost(int level){
        switch(level){
            case 1:
                return 5000;
            case 2:
                return 15000;
            case 3:
                return 100000;
            default:
                return -1;
        }
    }
}
