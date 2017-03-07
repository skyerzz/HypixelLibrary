package com.skyerzz.hypixellib.util.hypixelapi;

import java.util.Date;

/**
 * Created by Skyerzz-LAPOTOP on 17/01/2017.
 */
public class HypixelFriend extends HypixelPlayer {

    private String acceptedByUUID, sentByUUID, id;
    private Date dateAccepted;
    private boolean acceptedByOwnUUID;

    public HypixelFriend(String uuid, String APIKey, String id, long epochDate, String friendUUID, boolean acceptedByOwnUUID) {
        super(uuid, APIKey);
        dateAccepted = new Date(epochDate);
        this.id = id;
        this.acceptedByOwnUUID = acceptedByOwnUUID;
        if(acceptedByOwnUUID){
            this.acceptedByUUID = uuid;
            this.sentByUUID = friendUUID;
        }else{
            this.acceptedByUUID = friendUUID;
            this.sentByUUID = uuid;
        }
    }

    public String getAcceptedByUUID() {
        return acceptedByUUID;
    }

    public String getSentByUUID() {
        return sentByUUID;
    }

    public String getId() {
        return id;
    }

    public Date getDateAccepted() {
        return dateAccepted;
    }

    public HypixelPlayer getAsHypixelPlayer(String apiKey){
        if(acceptedByOwnUUID) {
            return new HypixelPlayer(sentByUUID, apiKey);
        }
        return new HypixelPlayer(acceptedByUUID, apiKey);
    }
}
