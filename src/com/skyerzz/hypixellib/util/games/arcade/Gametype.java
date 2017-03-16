package com.skyerzz.hypixellib.util.games.arcade;

import com.skyerzz.hypixellib.OutDated;

/**
 * Created by sky on 4-9-2016.
 */
public enum GAMETYPE {
    BLOCKING_DEAD(24),
    BOUNTY_HUNTERS(14),
    BUILD_BATTLE_SOLO(16),
    BUILD_BATTLE_TEAMS(32),
    CREEPER_ATTACK(14),
    DRAGON_WARS(16),
    ENDER_SPLEEF(16),
    FARM_HUNT(24),
    FOOTBALL(10),
    GALAXY_WARS(20),
    HOLE_IN_THE_WALL(16),
    HYPIXEL_SAYS(10),
    MINI_WALLS(16),
    PARTY_GAMES_ONE(8),
    PARTY_GAMES_TWO(16),
    PARTY_GAMES_THREE(12),
    PIXEL_PAINTERS(22),

    @OutDated
    SANTA_SAYS(0),

    THROW_OUT(16);

    private int maxPlayers;

    GAMETYPE(int maxPlayers){
        this.maxPlayers = maxPlayers;
    }

    public int getMaxPlayers(){
        return maxPlayers;
    }
}
