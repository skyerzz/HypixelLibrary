package com.skyerzz.hypixellib.util.hypixelapi;

import com.skyerzz.hypixellib.util.hypixelapi.exception.MalformedAPIKeyException;
import com.skyerzz.hypixellib.util.hypixelapi.exception.PlayerNonExistentException;
import com.skyerzz.hypixellib.util.hypixelapi.exception.RequestTypeException;
import com.skyerzz.hypixellib.util.mojangapi.MojangAPI;

import java.io.IOException;

/**
 * Created by sky on 7-7-2016.
 */
public class HypixelAPI{

    private String baseAPILink = "https://api.hypixel.net/";
    public static String APIkey;

    public HypixelAPI() {}

    private AbstractAPIReply getAPIReply(APIRequest request, String APIkey) throws MalformedAPIKeyException, IOException, PlayerNonExistentException {
        this.APIkey = APIkey;
        switch(request.getRequestType()){
            case PLAYER:
                return new PlayerAPI(request.getJSON(request.getURL(this.APIkey)));
            //TODO: make all responses here
            default:
                return null;
        }
    }

    public PlayerAPI getPlayerAPI(String player, String APIkey) throws RequestTypeException, MalformedAPIKeyException, IOException, PlayerNonExistentException {
        String uuid;
        if(isUuid(player)){
            uuid = player;
        }else{
            uuid = getUuid(player);
        }
        return (PlayerAPI) getAPIReply(new APIRequestBuilder(APIRequest.RequestType.PLAYER).addParam(APIRequest.RequestParam.PLAYER_BY_UUID, uuid).build(), APIkey);
    }

    private boolean isUuid(String input){
        if(input.length() == 32){
            return true;
        }
        return false;
    }

    private String getUuid(String name){
        if(name.replace("-", "").length() == 32){
            return name.replace("-", "");
        }
        MojangAPI moj = new MojangAPI();
        try {
            return moj.getJSON(moj.getURL(name)).get("id").getAsString();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (MalformedAPIKeyException e) {
            e.printStackTrace();
        } catch (PlayerNonExistentException e) {
            e.printStackTrace();
        }
        return null;
    }

}
