package com.skyerzz.hypixellib.util.network.collectibles.pet;

import com.skyerzz.hypixellib.Logger;

import java.util.ArrayList;

/**
 * Created by Skyerzz-LAPOTOP on 17/03/2017.
 */
public class Pet {

    private PetSpecies species;
    private int experience;
    private String customName;
    private PetStat thirst, hunger, exercise;

    public Pet(PetSpecies species, String customName, int experience, PetStat thirst, PetStat hunger, PetStat exercise){
        this.species = species;
        this.experience = experience;
        this.customName = customName;
        this.thirst = thirst;
        this.hunger = hunger;
        this.exercise = exercise;
    }

    public int getExperience(){
        return experience;
    }
    
    public int getLevel(){
        // TODO: 17/03/2017 find level formula
        return -1;
    }

    public PetSpecies getSpecies(){
        return species;
    }

    public String getCustomName(){
        return customName;
    }

    public PetStat getThirstStat(){
        return thirst;
    }

    public PetStat getHunger(){
        return hunger;
    }

    public PetStat getExecise(){
        return exercise;
    }

    public int getSatisfactionValue(PetConsumable consumable){
        switch(consumable){

        }
        Logger.logWarn("[HypixelAPI.Pet.satisfactionValue] Couldn't find value for consumable " + consumable.getDisplayName());
        return -1; //todo this..
    }

    public ArrayList<PetConsumable> getBestConsumables(PetConsumable.consumableType type){
        ArrayList<PetConsumable> consumables = new ArrayList<>();
        int highestValue = 0;
        for(PetConsumable consumable: PetConsumable.values()){
            if(consumable.getType()!=type){
                continue;
            }
            int sat = getSatisfactionValue(consumable);
            if(sat > highestValue){
                highestValue = sat;
                consumables.clear();
                consumables.add(consumable);
                continue;
            }else if(sat == highestValue){
                consumables.add(consumable);
            }
        }
        return consumables;
    }
}
