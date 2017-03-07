package com.skyerzz.hypixellib.util.hypixelapi.exception;

import java.util.UUID;

/**
 * Created by sky on 31-7-2016.
 */
public class PlayerNonExistentException extends Exception {

    private UUID playerUUID;
    private String weblink;

    public PlayerNonExistentException(String weblink){ this.weblink = weblink; };

    public PlayerNonExistentException(UUID playerUUID, String weblink){
        this.playerUUID = playerUUID;
        this.weblink = weblink;
    }

    public UUID getPlayerUUID(){
        return playerUUID;
    }

    public String getWeblink(){ return weblink; }
}
