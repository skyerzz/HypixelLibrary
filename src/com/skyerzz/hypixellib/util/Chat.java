package com.skyerzz.hypixellib.util;

import java.util.ArrayList;

/**
 * Created by Skyerzz-LAPOTOP on 09/03/2017.
 */
public enum CHAT {
    ALL("all", 'a'),
    PARTY("party", 'p'),
    GUILD("guild", 'g');

    private String name;
    private char code;

    CHAT(String name, char code){
        this.name = name;
        this.code = code;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(CHAT item: CHAT.values()){
            list.add(item.name());
        }
        return list;
    }

    public String getName(){
        return name;
    }

    public char getCode(){
        return code;
    }
}
