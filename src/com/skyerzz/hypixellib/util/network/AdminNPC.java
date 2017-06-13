package com.skyerzz.hypixellib.util.network;

import com.skyerzz.hypixellib.util.games.Gamemode;

import java.util.ArrayList;

/**
 * Created by Skyerzz-LAPOTOP on 16/03/2017.
 */
public enum AdminNPC {
    AGENTK(null),
    AMICO(null),
    APUNCH(null),
    CTD(null),
    CRYPTKEEPER(null),
    DARKACENESS(null),
    DCTR(null),
    DEPRECATEDNETHER(null),
    DONPIRESO(null),
    DRARTIST(null),
    GURUN(null),
    HCHERNDON(null),
    HYPIXEL(null),
    JAMIETHEGEEK(null),
    JAYAVARMEN(null),
    LEGITMODERN(null),
    LUCKYKESSIE(null),
    LYALL(null),
    MINIKLOON(null),
    MOOTV(null),
    NINJACHARLIET(null),
    NITROHOLIC(null),
    NOXYD(null),
    PIXELBAKER(null),
    PLANCKE(null),
    PXLPANDA(null),
    REZZUS(null),
    ROGUE(null),
    SHEROM(null),
    SLIKEY(null),
    SPHAX(null),
    TACTFUL(null),
    THORLON(null),
    TYRON(null),
    VINNY8BALL(null),
    VLADTOBEHERE(null),
    XAEL(null),
    ZANFLANGO(null),
    ZEROERRORS(null),
    ZUMULUS(null),;//todo get all currencyPackages & chat

    private CurrencyPackage currencyPackage;

    AdminNPC(CurrencyPackage currencyPackage){ //todo add ign(String) & lore(String)
        this.currencyPackage = currencyPackage;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(AdminNPC item: AdminNPC.values()){
            list.add(item.name());
        }
        return list;
    }

    public CurrencyPackage getCurrencyPackage(){
        return currencyPackage;
    }
}
