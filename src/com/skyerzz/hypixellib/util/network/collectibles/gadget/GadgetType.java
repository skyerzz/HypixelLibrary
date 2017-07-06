package com.skyerzz.hypixellib.util.network.collectibles.gadget;

/**
 * Created by sky on 4-7-2017.
 */
public enum GadgetType {
    FUN_AND_GAMES("Fun & Games", "Play games or just generally mess around in lobbies with these fun gadgets!"),
    MOBS_AND_NPCS("Mobs & NPCs", "Spawn and play with wachky creatures using these Mobs & NPC gadgets!"),
    MOVEMENT("Movement",  "Change the way you walk, run or fly around lobbies with these movement-altering gadgets!"),
    MUSICAL("Musical", "Make some noise with these sound-emitting musical gadgets!"),
    PROJECTILE("Projectile", "Fire at will! Shoot your way around the lobbies with these fun projectile gadgets!"),
    SEASONAL("Seasonal", "Get into the festive spirit with these seasonal gadgets - unlocked in Holiday, Halloween and Summer Mystery Boxes!"),
    VISUAL("Visual", "Change the way you or the lobby looks with these visual gadgets"),
    RANKED_REWARDS("Ranked Rewards", "Cosmetic rewards for some of our most competitive players in Ranked games.");

    private String displayName, lore;

    GadgetType(String displayName, String lore){
        this.displayName = displayName;
        this.lore = lore;
    }

    public String getDisplayName(){
        return displayName;
    }

    public String getLore(){
        return lore;
    }
}
