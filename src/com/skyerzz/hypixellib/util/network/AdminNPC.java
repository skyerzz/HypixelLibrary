package com.skyerzz.hypixellib.util.network;

import com.skyerzz.hypixellib.util.games.Gamemode;

import java.util.ArrayList;

/**
 * Created by Skyerzz-LAPOTOP on 16/03/2017.
 */
public enum AdminNPC {
    ;

    private Gamemode gameMode;
    private int amount;

    AdminNPC(Gamemode gameMode, int amount){
        this.gameMode = gameMode;
        this.amount = amount;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(AdminNPC item: AdminNPC.values()){
            list.add(item.name());
        }
        return list;
    }

    public Gamemode getGameMode(){
        return gameMode;
    }

    private int getAmount(){
        return amount;
    }
}
