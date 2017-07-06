package com.skyerzz.hypixellib.util.network.collectibles.hat;

import com.skyerzz.hypixellib.util.network.Rank;
import com.skyerzz.hypixellib.util.network.collectibles.mysteryvault.ObtainType;
import com.skyerzz.hypixellib.util.network.collectibles.mysteryvault.Rarity;

import java.util.ArrayList;

/**
 * Created by sky on 2-7-2017.
 */
public enum AnimatedHat {
    AQUA_ORB("Aqua Orb Animated Hat", Rarity.RARE, -1, Rank.NONE, ObtainType.SUMMER_MYSTERY_BOX),
    BASKETBALL("Basketball Animated Hat", Rarity.RARE, -1, Rank.NONE, ObtainType.SUMMER_MYSTERY_BOX),
    FIRE_DEMON("Fire Demon Animated Hat", Rarity.RARE, -1, Rank.NONE, ObtainType.SUMMER_MYSTERY_BOX),
    FORESTER("Forester Animated Hat", Rarity.RARE, -1, Rank.NONE, ObtainType.SUMMER_MYSTERY_BOX),
    ICE_MAGE("Ice Mage Animated Hat", Rarity.RARE, -1, Rank.NONE, ObtainType.SUMMER_MYSTERY_BOX),
    ROBO_BIRD("Robo Bird Animated Hat", Rarity.RARE, -1, Rank.NONE, ObtainType.SUMMER_MYSTERY_BOX),
    SIREN("Siren Animated Hat", Rarity.RARE, -1, Rank.NONE, ObtainType.SUMMER_MYSTERY_BOX),
    TRAFFIC_LIGHT("Traffic Light Animated Hat", Rarity.RARE, -1, Rank.NONE, ObtainType.SUMMER_MYSTERY_BOX),
    SPACE("Space Animated Hat", Rarity.RARE, -1, Rank.NONE, ObtainType.SUMMER_MYSTERY_BOX),
    WEREWOLF("Werewolf Animated Hat", Rarity.RARE, -1, Rank.NONE, ObtainType.HALLOWEEN_MYSTERY_BOX),
    SCARECROW("Scarecrow Animated Hat", Rarity.RARE, -1, Rank.NONE, ObtainType.HALLOWEEN_MYSTERY_BOX),
    ELFBOY("Elf Boy Animated Hat", Rarity.RARE, -1, Rank.NONE, ObtainType.CHRISTMAS_MYSTERY_BOX),
    ELFGIRL("Elf Girl Animated Hat", Rarity.RARE, -1, Rank.NONE, ObtainType.CHRISTMAS_MYSTERY_BOX),
    GOLEM("Golem Animated Hat", Rarity.EPIC, -1, Rank.NONE, ObtainType.SUMMER_MYSTERY_BOX),
    BROKEN_TV("Broken TV Animated Hat", Rarity.EPIC, -1, Rank.NONE, ObtainType.SUMMER_MYSTERY_BOX), //todo check if its just "tv"
    BAUBLE("Bauble Animated Hat", Rarity.EPIC, -1, Rank.NONE, ObtainType.CHRISTMAS_MYSTERY_BOX), //checked with tiliba
    GINGERBREAD("Gingerbread Man Animated Hat", Rarity.EPIC, -1, Rank.NONE, ObtainType.CHRISTMAS_MYSTERY_BOX), //todo  dupe in normal
    EVIL_EYE("Evil Eye Animated Hat", Rarity.LEGENDARY, -1, Rank.NONE, ObtainType.SUMMER_MYSTERY_BOX),
    CLOWN2("Clown Animated Hat", Rarity.LEGENDARY, -1, Rank.NONE, ObtainType.HALLOWEEN_MYSTERY_BOX),
    SANTA("Santa Animated Hat", Rarity.LEGENDARY, -1, Rank.NONE, ObtainType.CHRISTMAS_MYSTERY_BOX),

    //todo finish up the others
    FOX_SPIRIT("Fox Spirit Animated Hat", null, -1, Rank.VIP),
    MONOCHROME_GIRL("Monochrome Girl Animated Hat", null, -1, Rank.VIP),
    SCARF_GUY("Scarf Guy Animated Hat", null, -1, Rank.VIP),
    CYBORG_GIRL("Cyborg Girl Animated Hat", null, -1, Rank.VIP),
    HEROBRINE("Herobrine Animated Hat", null, -1, Rank.VIP_PLUS),
    CHROMA_SLIME("Chrome Slime Animated Hat", null, -1, Rank.VIP_PLUS),
    HAPPY_DUDE("Happy Dude Animated Hat", null, -1, Rank.VIP_PLUS),
    BLUSHY("Blushy Animated Hat", null, -1, Rank.VIP_PLUS),
    SCOUT_GIRL("Scout Girl Animated Hat", null, -1, Rank.MVP),
    FLOWER_CROWN("Flower Crown Animated Hat", null, -1, Rank.MVP),
    RED_OVERALL("Red Overall Animated Hat", null, -1, Rank.MVP),
    BLUE_HOODIE("Blue Hoodie Animated Hat", null, -1, Rank.MVP),
    ENDER_PULSE("Ender Pulse Animated Hat", null, -1, Rank.MVP_PLUS),
    RAINBOW_GIRL("Rainbow Girl Hat", null, -1, Rank.MVP_PLUS),
    DEMON_EYES("Demon Eyes Animated Hat", null, -1, Rank.MVP_PLUS),
    DERPY_EYES("Derpy Eyes Animated Hat", null, -1, Rank.MVP_PLUS);

    private String displayName;
    private Rarity rarity;
    private int mysteryDustCost;
    private ObtainType boxType;
    private Rank rankRequirement;

    AnimatedHat(String displayName, Rarity rarity, int mysteryDustCost, Rank rankRequirement){
        this(displayName, rarity, mysteryDustCost, rankRequirement, ObtainType.RANK_UPGRADE);
    }

    AnimatedHat(String displayName, Rarity rarity, int mysteryDustCost, Rank rankRequirement, ObtainType boxType){
        this.displayName = displayName;
        this.rarity = rarity;
        this.mysteryDustCost = mysteryDustCost;
        this.boxType = boxType;
        this.rankRequirement = rankRequirement;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(AnimatedHat item: AnimatedHat.values()){
            list.add(item.name());
        }
        return list;
    }

    public static AnimatedHat getFromString(String hat){
        hat = hat.toUpperCase().replace("HAT_", "");
        if(mapping.contains(hat)){
            return AnimatedHat.valueOf(hat);
        }
        return null;
    }

    public String getDisplayName() {
        return displayName;
    }

    public Rarity getRarity() {
        return rarity;
    }

    public int getMysteryDustCost() {
        return mysteryDustCost;
    }

    public ObtainType getBoxType() {
        return boxType;
    }

    public Rank getRankRequirement() {
        return rankRequirement;
    }
}
