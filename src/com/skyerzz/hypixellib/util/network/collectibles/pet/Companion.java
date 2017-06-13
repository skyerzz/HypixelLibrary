package com.skyerzz.hypixellib.util.network.collectibles.pet;

/**
 * Created by Skyerzz-LAPOTOP on 20/03/2017.
 */
public class Companion {

    private CompanionSpecies species;
    private String name;

    public Companion(CompanionSpecies species, String name){
        this.species = species;
        this.name = name;
    }

    public CompanionSpecies getSpecies(){
        return species;
    }

    public String name(){
        return name;
    }
}
