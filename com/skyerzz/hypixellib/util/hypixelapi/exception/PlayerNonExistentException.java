package com.skyerzz.hypixellib.util.hypixelapi.exception;

import java.util.UUID;

/**
 * Created by sky on 31-7-2016.
 */
public class PlayerNonExistentException extends Exception {

    UUID playerUUID;

    public PlayerNonExistentException(){};

    public PlayerNonExistentException(UUID playerUUID){
        this.playerUUID = playerUUID;
    }

    public UUID getPlayerUUID(){
        return playerUUID;
    }
}
