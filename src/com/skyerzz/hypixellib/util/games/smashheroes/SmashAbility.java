package com.skyerzz.hypixellib.util.games.smashheroes;

import java.util.ArrayList;

/**
 * Created by sky on 7-1-2017.
 */
public class SmashAbility {

    private String apiName;
    private String displayName;
    private String description;
    private ArrayList<String> hints = new ArrayList<>();

    public SmashAbility(String apiName, String displayName, String description, String...hints){
        this.apiName = apiName;
        this.displayName = displayName;
        this.description = description;
        for(String hint : hints){
            this.hints.add(hint);
        }
    }

    public String getDisplayName(){ return displayName; }
    public String getDescription(){ return description; }
    public ArrayList<String> getHints(){ return  hints; }
    protected String getAPIName(){ return apiName; }


}
