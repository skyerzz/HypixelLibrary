package com.skyerzz.hypixellib.util.games.arcade;

import com.skyerzz.hypixellib.util.games.GAMEMODE;

/**
 * Created by sky on 4-9-2016.
 */
public class CurrencyConverter {

    private CurrencyConverter(){

    }

    public int getConvertedCoins(GAMEMODE gameMode, int level){
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
            case SMASH_HEROES:
                return 500*multiplier;

            case COPS_AND_CRIMS:
            case BLITZ:
            case QUAKECRAFT:
            case ARENA_BRAWL:
            case CRAZY_WALLS:
                return 750*multiplier;

            case PAINTBALL:
            case VAMPIREZ:
            case TNT_GAMES:
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
