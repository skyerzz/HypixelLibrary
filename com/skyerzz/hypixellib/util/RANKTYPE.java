package com.skyerzz.hypixellib.util;

/**
 * Created by sky on 7-7-2016.
 */
public enum RANKTYPE {
    DEFAULT(0),
    VIP(1),
    VIP_PLUS(2),
    MVP(3),
    MVP_PLUS(4),
    HELPER(1),
    MODERATOR(1),
    ADMIN(6),
    MCPROHOSTING(5),
    MOJANG(5),
    YOUTUBER(5);

    private int rankLevel;

    RANKTYPE(int ranklevel){
        this.rankLevel = ranklevel;
    }

    public int getRankLevel(){
        return rankLevel;
    }


}
