package com.skyerzz.hypixellib.util.hypixelapi;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.realmsclient.client.Request;
import com.skyerzz.hypixellib.util.hypixelapi.exception.APIException;
import com.skyerzz.hypixellib.util.hypixelapi.exception.MalformedAPIKeyException;
import com.skyerzz.hypixellib.util.hypixelapi.exception.PlayerNonExistentException;
import com.skyerzz.hypixellib.util.hypixelapi.exception.RequestTypeException;
import net.minecraft.client.util.JsonException;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.UUID;

/**
 * Created by sky on 7-7-2016.
 */
public class HypixelAPI{

    private String baseAPILink = "https://api.hypixel.net/";
    public static String APIkey;

    public HypixelAPI() {}

    public AbstractAPIReply getAPIReply(APIRequest request, String APIkey) throws MalformedAPIKeyException, IOException, PlayerNonExistentException {
        this.APIkey = APIkey;
        switch(request.getRequestType()){
            case PLAYER:
                return new PlayerAPI(request.getJSON(request.getURL(this.APIkey)));
            //TODO: make all responses here
            default:
                return null;
        }
    }

}
