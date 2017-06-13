package com.skyerzz.hypixellib.util.hypixelapi;

import java.util.Date;

/**
 * Created by Skyerzz-LAPOTOP on 17/01/2017.
 */
public class HypixelFriend extends HypixelPlayer {

    private String ownUUID, friendUUID, id;
    private Date dateAccepted;
    private boolean acceptedByOwnUUID;

    public HypixelFriend(String uuid, String APIKey, String id, long epochDate, String friendUUID, boolean acceptedByOwnUUID) {
        super(uuid, APIKey);
        dateAccepted = new Date(epochDate);
        this.id = id;
        this.acceptedByOwnUUID = acceptedByOwnUUID;
        this.friendUUID = friendUUID;
        this.ownUUID = uuid;
    }

    public String getOwnUUID() {
        return ownUUID;
    }

    public String getFriendUUID() {
        return friendUUID;
    }

    public String getId() {
        return id;
    }

    public Date getDateAccepted() {
        return dateAccepted;
    }

    public HypixelPlayer getAsHypixelPlayer(String apiKey){
        return new HypixelPlayer(ownUUID, apiKey);
    }

    public boolean acceptedByOwnUUID(){ return acceptedByOwnUUID; }
}
