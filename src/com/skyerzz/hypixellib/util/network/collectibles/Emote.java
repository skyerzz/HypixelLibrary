package com.skyerzz.hypixellib.util.network.collectibles;

import com.skyerzz.hypixellib.util.network.Rank;
import com.skyerzz.hypixellib.util.network.collectibles.mysteryvault.ObtainType;
import com.skyerzz.hypixellib.util.network.collectibles.mysteryvault.Rarity;

import java.util.ArrayList;

/**
 * Created by sky on 4-7-2017.
 */
public enum Emote {
    SMILE("Smile Emote", "Feeling great? Show the world how happy you are with this animated Smile emote!", 10, Rarity.COMMON),
    COOL("Cool Emote", " Feel like the coolest cat on the serveR? Strut your stuff with this animated Cool emote!", 12, Rarity.COMMON),
    WINK("Wink Emote", "Having fun? Let someone know you're in on the joke with this animated Wink emote!", 12, Rarity.COMMON),
    GRIN("Grin Emote", "If you are feeling amazing, there's no better way to show it than with this animated Grin emote!", 13, Rarity.COMMON),
    SURPRISED("Surprised Emote", "Has something shocked you!? Let the lobby know with this animated Surprised emote!", 15, Rarity.COMMON),
    CRY("Cry Emote", "Sad you can't play Hypixel all the time? Shed tears with this animated Crying emote!", 25, Rarity.RARE),
    SLEEPY("Sleepy Emote", "Stayed up all night playing your favorite minigame? Fall asleep with this animated Sleepy emote!", 20, Rarity.RARE),
    ANGRY("Rage Emote", "Is something boiling your blood? Let off steam with this animated Rage emote!", 30, Rarity.RARE),
    SAD("Frown Emote", "Has something got you down? Let the world know with this animated Frown emote!", 20, Rarity.RARE), //checked with dirty
    CHEEKY("Cheeky Emote", "Up to some mischief? Warn everyone how you're feeling with this animated Cheeky emote!", 20, Rarity.RARE),
    SUN_TAN("Sun Tan Emote", "Did you forget your sun screen when you went to the beach? Let others know how crispy you are with this Sun Tan Emote!", -1, Rarity.RARE, Rank.NONE, ObtainType.SUMMER_MYSTERY_BOX), //fixonline all normal boxes = "emote" , special boxes = "Emote" (capital)
    HEART("Heart Eyes Emote", "Feeling good? Spread the good vibes with the Heart Eyes Emote", -1, Rarity.RARE, Rank.NONE, ObtainType.SUMMER_MYSTERY_BOX),
    DIZZY("Dizzy Emote", "The rollercoaster in the main lobby is not for you? Show others how you feel with the Dizzy Emote!", -1, Rarity.RARE, Rank.NONE, ObtainType.SUMMER_MYSTERY_BOX),
    RIP("RIP Emote", "Did you get that final blow? Show mercy to your opponents with this Rest in Pepperoni Emote!", -1, Rarity.RARE, Rank.NONE, ObtainType.SUMMER_MYSTERY_BOX),
    RELAX("Relax Emote", "Feeling cozy? You surely will with the Relax Emote!", -1, Rarity.RARE, Rank.NONE, ObtainType.SUMMER_MYSTERY_BOX),
    SPICY("Spicy Emote", "Did that habanero pepper get to you? Let the rest know with this Spicy Emote!", -1, Rarity.RARE, Rank.NONE, ObtainType.SUMMER_MYSTERY_BOX),
    DEAL_WITH_IT("Deal With It Emote", "Do you feel like showing off? Let others see how cool you feel with the real Deal With It Emote!", -1, Rarity.RARE, Rank.NONE, ObtainType.SUMMER_MYSTERY_BOX),
    FACE_MELTER("Face Melter Emote", "If you stare for too long into the darkness, the darkness might just stare back into you!", -1, Rarity.EPIC, Rank.NONE, ObtainType.HALLOWEEN_MYSTERY_BOX),
    MOUSTACHE("Moustache Emote", "Mustache to Goatee to Epic Beard! Show fof how fetching you are with this gentlemanly Mustache Emote.", -1, Rarity.LEGENDARY, Rank.NONE, ObtainType.REWARD_CARD),//fixonline this one and present unwrap only ones to end on "." instead "!"
    PRESENT_UNWRAP("Present Unwrap Emote", "Give your friends the best gift they could receive this holiday season: YOU! Just activate this Present Unwrap Emote", -1, Rarity.LEGENDARY, Rank.NONE, ObtainType.CHRISTMAS_MYSTERY_BOX);

    private String displayName, lore;
    private int mysteryDustCost;
    private Rarity rarity;
    private Rank rankRequirement;
    private ObtainType boxType;

    Emote(String displayName, String lore, int mysteryDustCost, Rarity rarity, Rank rankRequirement, ObtainType boxType){
        this.displayName = displayName;
        this.lore = lore;
        this.mysteryDustCost = mysteryDustCost;
        this.rarity = rarity;
        this.rankRequirement = rankRequirement;
        this.boxType = boxType;
    }

    Emote(String displayName, String lore, int mysteryDustCost, Rarity rarity, Rank rankRequirement){
        this(displayName, lore, mysteryDustCost, rarity, rankRequirement, ObtainType.DEFAULT_MYSTERY_BOX);
    }

    Emote(String displayName, String lore, int mysteryDustCost, Rarity rarity){
        this(displayName, lore, mysteryDustCost, rarity, Rank.NONE, ObtainType.DEFAULT_MYSTERY_BOX);
    }


    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(Emote item: Emote.values()){
            list.add(item.name());
        }
        return list;
    }


    public static Emote getFromString(String emote){
        emote = emote.toUpperCase().trim().replace("EMOTE_", "");
        if(mapping.contains(emote)){
            return Emote.valueOf(emote);
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
