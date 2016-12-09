package com.skyerzz.hypixellib.util.mojangapi;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.skyerzz.hypixellib.util.hypixelapi.exception.MalformedAPIKeyException;
import com.skyerzz.hypixellib.util.hypixelapi.exception.PlayerNonExistentException;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by sky on 9-12-2016.
 */
public class MojangAPI {

    private final String base = "https://api.mojang.com/users/profiles/minecraft/";

    public URL getURL(String name){
        String url = base + name;
        try {
            return new URL(url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String readURL(BufferedReader reader) throws IOException {
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
        return json;
    }
}
