package com.skyerzz.hypixellib.util.hypixelapi;

import com.skyerzz.hypixellib.util.hypixelapi.exception.MalformedAPIKeyException;
import com.skyerzz.hypixellib.util.hypixelapi.exception.NoPlayerStatsException;
import com.skyerzz.hypixellib.util.hypixelapi.exception.PlayerNonExistentException;
import com.skyerzz.hypixellib.util.hypixelapi.exception.RequestTypeException;
import com.skyerzz.hypixellib.util.mojangapi.MojangAPI;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Skyerzz-LAPOTOP on 17/01/2017.
 */
public class HypixelPlayer {

    private String uuid, apiKey;
    private HypixelAPI api;

    public HypixelPlayer(String uuid, String APIKey){
        this.api = new HypixelAPI();
        this.uuid = uuid;
        this.apiKey = APIKey;
    }

    public PlayerAPI getPlayerStats() throws RequestTypeException, PlayerNonExistentException, NoPlayerStatsException, MalformedAPIKeyException, IOException {
        return api.getPlayerAPI(uuid, apiKey);
    }

    public ArrayList<HypixelFriend> getPlayerFriends() throws PlayerNonExistentException, RequestTypeException, NoPlayerStatsException, MalformedAPIKeyException, IOException {
        return api.getPlayerFriends(uuid, apiKey);
    }
}
