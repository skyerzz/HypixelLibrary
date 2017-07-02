package com.skyerzz.hypixellib.util.network.collectibles.hat;

import com.skyerzz.hypixellib.util.network.Rank;
import com.skyerzz.hypixellib.util.network.collectibles.mysteryvault.MysteryBoxType;
import com.skyerzz.hypixellib.util.network.collectibles.mysteryvault.Rarity;

/**
 * Created by sky on 2-7-2017.
 */
public enum Hat {


    ;

    private String displayName;
    private Rarity rarity;
    private int mysteryDustCost;
    private MysteryBoxType boxType;
    private Rank rankRequirement;

    Hat(String displayName, Rarity rarity, int mysteryDustCost, Rank rankRequirement){
        this(displayName, rarity, mysteryDustCost, rankRequirement, null);
    }

    Hat(String displayName, Rarity rarity, int mysteryDustCost, Rank rankRequirement, MysteryBoxType boxType){
        this.displayName = displayName;
        this.rarity = rarity;
        this.mysteryDustCost = mysteryDustCost;
        this.boxType = boxType;
        this.rankRequirement = rankRequirement;
    }
}
