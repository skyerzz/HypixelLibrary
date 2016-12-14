package com.skyerzz.hypixellib.util.games.turbokartracers;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by sky on 2-8-2016.
 */
public class KartPart {

    private PARTTYPE partType;

    private ArrayList<ATTRIBUTETYPE> att = new ArrayList<>();

    public KartPart(PARTTYPE partType, ATTRIBUTETYPE...attributes){
        this.partType = partType;
        for(ATTRIBUTETYPE type: attributes){
            att.add(type);
        }
    }

    public KartPart(PARTTYPE partType, ArrayList<ATTRIBUTETYPE> attributes){
        this.partType = partType;
        att = attributes;
    }

    public static KartPart getKartPartByJson(JsonObject json){
        String temp = json.get("PartType").getAsString();
        PARTTYPE partType = null;
        if(PARTTYPE.mapping.contains(temp)){
            partType = PARTTYPE.valueOf(temp);
        }

        ArrayList<ATTRIBUTETYPE> attributes = new ArrayList<>();

        for(JsonElement s: json.get("Attributes").getAsJsonArray()) {
            JsonObject object = s.getAsJsonObject();
            ATTRIBUTETYPE type = ATTRIBUTETYPE.valueOf(object.get("KartAttributeType").getAsString());
            type.level = object.get("Level").getAsInt();
            attributes.add(type);
        }

        return new KartPart(partType, attributes);
    }


    public enum PARTTYPE{
        ENGINE,
        TURBOCHARGER,
        FRAME;

        public static final ArrayList<String> mapping = initializeMapping();

        private static ArrayList<String> initializeMapping(){
            ArrayList<String> list = new ArrayList<String>();
            for(PARTTYPE item: PARTTYPE.values()){
                list.add(item.name());
            }
            return list;
        }

    }

    public enum ATTRIBUTETYPE{
        RECOVERY,
        ACCELERATION,
        TOP_SPEED,
        BOOSTER_SPEED,
        BRAKES,
        DRIFTING_EFFICIENCY,
        START_POSITION,
        TRACTION,
        HANDLING;

        private int level;

        public static final ArrayList<String> mapping = initializeMapping();

        private static ArrayList<String> initializeMapping(){
            ArrayList<String> list = new ArrayList<String>();
            for(ATTRIBUTETYPE item: ATTRIBUTETYPE.values()){
                list.add(item.name());
            }
            return list;
        }

        public int getLevel(){
            return level;
        }
    }

    public enum PARTRARITY{
        DEFAULT,
        AWESOME;


        public static final ArrayList<String> mapping = initializeMapping();

        private static ArrayList<String> initializeMapping(){
            ArrayList<String> list = new ArrayList<String>();
            for(PARTTYPE item: PARTTYPE.values()){
                list.add(item.name());
            }
            return list;
        }
    }
}
