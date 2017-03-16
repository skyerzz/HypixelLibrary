package com.skyerzz.hypixellib.util.network;

import java.util.ArrayList;

/**
 * Created by Skyerzz-LAPOTOP on 16/03/2017.
 */
public enum Language {
    ENGLISH("English", "English", "en"),
    DUTCH("Dutch", "Nederlands", "nl"),
    FRENCH("French", "Français", "fr"),
    SPANISH("Spanish", "Español", "es");

    private String englishName, ownName, twoLetterCode;

    Language(String englishName, String ownName, String twoLetterCode){
        this.englishName = englishName;
        this.ownName = ownName;
        this.twoLetterCode = twoLetterCode;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(Language item: Language.values()){
            list.add(item.name());
        }
        return list;
    }
}
