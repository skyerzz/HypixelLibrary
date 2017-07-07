package com.skyerzz.hypixellib.util.network;

import java.util.ArrayList;

/**
 * Created by Skyerzz-LAPOTOP on 09/03/2017.
 */
public enum Chat {
    ALL("all", 'a'),
    PARTY("party", 'p'),
    GUILD("guild", 'g'),
    PM("Private Message", ' '); //no character for that.

    private String name;
    private char code;

    Chat(String name, char code){
        this.name = name;
        this.code = code;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(Chat item: Chat.values()){
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
