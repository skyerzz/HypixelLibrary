package com.skyerzz.hypixellib.util.network.collectibles;

import com.skyerzz.hypixellib.util.network.Rank;
import com.skyerzz.hypixellib.util.network.collectibles.pet.PetSpecies;

import java.util.ArrayList;

/**
 * Created by sky on 13-6-2017.
 */
public enum ParticlePack {
    SLIME("Slime Particle Pack", null, Rank.MVP_PLUS), //fixonline weird lore(s)
    DRIP_LAVA("Drip Lava Particle Pack", null, Rank.MVP_PLUS),
    DRIP_WATER("Drip Water Particle Pack", null, Rank.MVP_PLUS),
    NOTE("Note Particle Pack", null, Rank.MVP_PLUS),
    HEART("Heart Particle Pack", null, Rank.MVP_PLUS),
    HAPPY_VILLAGER("Happy Villager Particle Pack", null, Rank.MVP_PLUS),
    ANGRY_VILLAGER("Angry Villager Particle Pack", null, Rank.MVP_PLUS),
    ENCHANTMENT("Enchantment Table Particle Pack", null, Rank.MVP_PLUS);


    private String name,lore;
    private Rank rankRequirement;

    ParticlePack(String name, String lore, Rank rankRequirement){
        this.name = name;
        //lore not used due to standard format - when fixed online should be used.
        this.lore = lore;
        this.rankRequirement = rankRequirement;
    }

    public String getName(){
        return name;
    }

    public String getLore(){
        //fixonline should be replaced when online is fixed
        return "Displays a ring of " + getName() + " particles above you in lobbies.";
    }

    public Rank getRankRequirement(){
        return rankRequirement;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(ParticlePack item: ParticlePack.values()){
            list.add(item.name());
        }
        return list;
    }

    public static ParticlePack getFromString(String particlePack){
        particlePack = particlePack.toUpperCase();
        if(mapping.contains(particlePack)){
            return ParticlePack.valueOf(particlePack);
        }
        return null;
    }
}
