package com.skyerzz.hypixellib.util.network.collectibles;

import com.skyerzz.hypixellib.util.network.Rank;
import com.skyerzz.hypixellib.util.network.collectibles.mysteryvault.ObtainType;
import com.skyerzz.hypixellib.util.network.collectibles.mysteryvault.Rarity;

import java.util.ArrayList;

/**
 * Created by sky on 3-7-2017.
 */
public enum Gesture {
    CLAPPING("Clapping Gesture", "Need to congratulate someone on a Good Game, Well Played? Just activate this Clapping gesture!", 25, Rarity.RARE, Rank.NONE), //fixonline random Gesture/gesture capitalisation
    COOL_DANCE("Cool Dance Gesture", "Show off your ice cold moves - Own the dancefloor by activating this Cool Dance gesture!", 30, Rarity.RARE, Rank.NONE),
    GOODBYE("Goodbye Gesture", "Whether it's time to go or you're just switching lobbies, bid farewell by activating this Goodbye gesture!", 20, Rarity.RARE, Rank.NONE),
    HI_5("Hi-5 Gesture", "Happy about your victory? The Hi-5 gesture will let you show your appreciation to your mates!", -1, Rarity.RARE, Rank.NONE, ObtainType.SUMMER_MYSTERY_BOX),
    BALLET("Ballet Dance Gesture", "Feel like you need to dance with style? Show your moves with the Ballet Dance Gesture!", -1, Rarity.RARE, Rank.NONE, ObtainType.SUMMER_MYSTERY_BOX),
    KARAOKE("Karaoke Gesture", "Show your friends how it's done by singing along with this Karaoke Gesture!", -1, Rarity.RARE, Rank.NONE, ObtainType.SUMMER_MYSTERY_BOX),
    POSSESSED("Possessed Gesture",  "Have you ever felt like you just aren't quite yourself? Give up the ghost with this Possessed Gesture!", -1, Rarity.RARE, Rank.NONE, ObtainType.HALLOWEEN_MYSTERY_BOX), //checked with mylesmor
    SNOWBALL_TOSS("Snowball Toss Gesture", "Throwing snowballs is snow joke! Give someone the cold shoulder with this winter gesture.", -1, Rarity.RARE, Rank.NONE, ObtainType.CHRISTMAS_MYSTERY_BOX),
    VICTORY("Victory Pose Gesture", "Feeling proud? Celebrate in style by activating this Victory Pose gesture!", 60, Rarity.EPIC, Rank.NONE),
    HYPE_DANCE("Hype Dance Gesture", "Put your arms in the air like you just don't care! Amp yourself up by activating this Hype Dance gesture!", 40, Rarity.EPIC, Rank.NONE),
    WAVE_DANCE("Wave Dance Gesture", "Close your eyes, nod your head, and move to the music by activating this Wave Dance gesture!", 50, Rarity.EPIC, Rank.NONE),
    MIND("Mind Blown Gesture", "You can't just believe it! This gesture will get your mind blown... Literally!", -1, Rarity.EPIC, Rank.NONE, ObtainType.SUMMER_MYSTERY_BOX),
    CAN("Can Can Dance Gesture", "Dance like a total pro with this Can Can Dance Gesture! Do you think you can do it for longer than 10 minutes?", -1, Rarity.EPIC, Rank.NONE, ObtainType.SUMMER_MYSTERY_BOX),
    HULA("Hula Dance Gesture", " Move your hips like you are in Hawaii with this Hula Dance Gesture!", -1, Rarity.EPIC, Rank.NONE, ObtainType.SUMMER_MYSTERY_BOX),
    GRADUATION("Graduation Gesture", " \"Yayy!!! School is over and you just graduated! Share it with your friends with the Graduation Gesture!", -1, Rarity.EPIC, Rank.NONE, ObtainType.SUMMER_MYSTERY_BOX), //fixonline "doesnt close
    JUMP("Jump Around Gesture", "Overly excited? Feeling crazy? Get rid of all that excess energy - activate this Jump Around gesture!", -1, Rarity.LEGENDARY, Rank.NONE, ObtainType.CRAFTED_MYSTERY_BOX_TWO),
    CRAB_DANCE("Crab Dance Gesture", "If you feel like dancing... why not Crab Dance? Woop woop woop your way around the lobby with this Crab Dance gesture!", -1, Rarity.LEGENDARY, Rank.NONE, ObtainType.SUMMER_MYSTERY_BOX),
    SUN("Praise The Sun Gesture", "Feeling jolly? Celebrate Summer with this Praise the Sun gesture! If only we could be so grossly incandescent...", -1, Rarity.LEGENDARY, Rank.NONE, ObtainType.SUMMER_MYSTERY_BOX),
    TREASURE("Dig For Treasure Gesture", "You've raided tombs, you've explored uncharted territories, and now you're ready to gather your riches with this rare Dig for Treasure gesture!", -1, Rarity.LEGENDARY, Rank.NONE, ObtainType.REWARD_CARD),//fixonline rare > legendary gesture
    ZOMBIE_DANCE("Zombie Dance Gesture", "When darkness falls across the land and the midnight hour is close at hand, Zombies Dance in search of blood to terrorize your neighbourhood!", -1, Rarity.LEGENDARY, Rank.NONE, ObtainType.HALLOWEEN_MYSTERY_BOX);

    private String displayName, lore;
    private int mysteryDustCost;
    private Rarity rarity;
    private Rank rankRequirement;
    private ObtainType boxType;

    Gesture(String displayName, String lore, int mysteryDustCost, Rarity rarity, Rank rankRequirement, ObtainType boxType){
        this.displayName = displayName;
        this.lore = lore;
        this.mysteryDustCost = mysteryDustCost;
        this.rarity = rarity;
        this.rankRequirement = rankRequirement;
        this.boxType = boxType;
    }

    Gesture(String displayName, String lore, int mysteryDustCost, Rarity rarity, Rank rankRequirement){
        this(displayName, lore, mysteryDustCost, rarity, rankRequirement, ObtainType.DEFAULT_MYSTERY_BOX);
    }


    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(Gesture item: Gesture.values()){
            list.add(item.name());
        }
        return list;
    }


    public static Gesture getFromString(String gesture){
        gesture = gesture.toUpperCase().trim().replace("TAUNT_", "");
        if(mapping.contains(gesture)){
            return Gesture.valueOf(gesture);
        }
        return null;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getLore() {
        return lore;
    }

    public int getMysteryDustCost() {
        return mysteryDustCost;
    }

    public Rarity getRarity() {
        return rarity;
    }

    public Rank getRankRequirement() {
        return rankRequirement;
    }

    public ObtainType getBoxType() {
        return boxType;
    }
}
