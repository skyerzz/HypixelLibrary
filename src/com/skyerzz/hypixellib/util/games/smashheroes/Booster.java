package com.skyerzz.hypixellib.util.games.smashheroes;

/**
 * Created by sky on 15-1-2017.
 */
public enum BOOSTER {
    _10_PLAYS(10, 6000),
    _30_PLAYS(30, 15000),
    _50_PLAYS(50, 22500),
    _100_PLAYS(100, 40000);

    int games, cost;

    BOOSTER(int games, int cost){
        this.games = games;
        this.cost = cost;
    }
}
