package com.skyerzz.hypixellib.util.hypixelapi;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.skyerzz.hypixellib.util.hypixelapi.exception.MalformedAPIKeyException;
import com.skyerzz.hypixellib.util.hypixelapi.exception.PlayerNonExistentException;
import com.skyerzz.hypixellib.util.hypixelapi.exception.RequestTypeException;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * Created by sky on 5-8-2016.
 */
public class APIRequest{

    private static final String BASE = "https://api.hypixel.net/";

    private RequestType requestType;
    private HashMap<RequestParam, String> params = new HashMap<>();

    public APIRequest(RequestType requestType) throws RequestTypeException{
        this(requestType, null);
    }

    public APIRequest(RequestType requestType, HashMap<RequestParam, String> params){
        this.requestType = requestType;
        this.params = params;
    }

    public URL getURL(String APIkey){
        String url = BASE + this.requestType.getKey();
        url += "?key=" + APIkey;
        for(RequestParam param: params.keySet()){
            url += "&" + param.getKey() + "=" + params.get(param);
        }
        try {
            return new URL(url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return null;
    }


    private String readURL(BufferedReader reader) throws IOException {
        StringBuilder sb = new StringBuilder();
        int i;
        while ((i = reader.read()) != -1) {
            sb.append((char) i);
        }
        return sb.toString();
    }


    public JsonObject getJSON(URL webLink) throws IOException, MalformedAPIKeyException, PlayerNonExistentException {
        HttpsURLConnection con = (HttpsURLConnection)webLink.openConnection();
        con.setRequestProperty("User-Agent", "Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.4; en-US; rv:1.9.2.2) Gecko/20100316 Firefox/3.6.2");
        BufferedReader rd = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String jsonText = readURL(rd);
        JsonObject json = new JsonParser().parse(jsonText).getAsJsonObject();
        rd.close();


        if(json.get("success").getAsString().equals("false")){
            String cause = json.get("cause").getAsString().toLowerCase();
            if(cause.equalsIgnoreCase("Invalid API key!")){
                throw new MalformedAPIKeyException();
            }

        }else if(json.get("player") != null){
            if(json.get("player").equals("null")){
                throw new PlayerNonExistentException(webLink.toString());
            }
        }

        return json;
    }



    public RequestType getRequestType(){
        return requestType;
    }


    public enum RequestType{
        PLAYER("player"),
        FIND_GUILD("findGuild"),
        GUILD("guild"),
        FRIENDS("friends"),
        SESSION("session"),
        KEY("key"),
        BOOSTERS("boosters");

        private String key;

        RequestType(String key){
            this.key = key;
        }

        public String getKey(){
            return key;
        }

    }

    public enum RequestParam{

        PLAYER_BY_UUID(RequestType.PLAYER, "uuid"),

        GUILD_BY_PLAYER_UUID(RequestType.FIND_GUILD, "byUuid"),
        GUILD_BY_ID(RequestType.GUILD, "id"),

        FRIENDS_BY_UUID(RequestType.FRIENDS, "uuid"),

        SESSION_BY_UUID(RequestType.SESSION, "uuid");

        private RequestType requestType;
        private String key;

        RequestParam(RequestType requestType, String key){
            this.requestType = requestType;
            this.key = key;
        }

        public String getKey(){
            return key;
        }

        public RequestType getRequestType(){
            return requestType;
        }

    }
}
