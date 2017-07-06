package com.skyerzz.hypixellib.util.network.collectibles.pet;

import com.skyerzz.hypixellib.util.network.collectibles.mysteryvault.ObtainType;

import java.util.ArrayList;

/**
 * Created by Skyerzz-LAPOTOP on 20/03/2017.
 */
public enum CompanionSpecies {
    PENGUIN("Penguin", "He's migrating all the way from the North Pole to your friends list! Collect this cute little Penguin companion today.", true),
    TURTLE("Turtle", "Need someone to help you come out of your shell? Slow and steady always wins the race with this Turtle companion!", true),
    BLACK_PUG("Black Pug", "Yelping, whimpering, howling away in the middle of night... and that's just your friends when they see your cool canine friend! Take this Black Pug companion for a walk today.", ObtainType.CRAFTED_MYSTERY_BOX_TWO, false),
    DUCK("Duck", "Looking for an Egg-cellent companion? This quacking little friend can't be beak! Become birds of a feather with this dashing Duck companion!", true),
    FROG("Frog", "He was once a beautiful human prince, transformed by an old witch's curse... or at least that's what he tells people. This friendly Frog companion is just a hop, skip and jump away!", true),
    SLOTH("Sloth", "Neeeeeed aaaaaa friennnnnnnnd? Hypixel's favourite animal arrives in the form of this cute Sloth companion!", true),
    HP8("HP8", "BLEEP-BLOOP. BLOOP-BLEEP. Bwwwoooooooo! That's robot for \"I love you\". From a desert planet to the Hypixel lobby, get ready to roll out with this lovable HP8 companion!", true),
    WHITE_PUG("White Pug", "If dog is a man's best friend, then this little gus is man's BEST best friend! Embrace the pug life with this White Pug companion.", true),
    SHIBE("Shibe", "Such pet. Many fluffy. Much doge. Wow. Befriend the cutest, fluffiest meme ever with this dank Shibe companion!", true),
    CHIMP("Chimp", "Monkey see, monkey do, monkey gonna follow you. Go bananas with this swinging Chimp companion!", true),
    GORRILA("Gorilla", "You can ask him why he beats his chest, you can ask him why he loves bananas, but whatever you do... DON't ask him where he got those glasses! Meet the real king of the jungle with this garish Gorilla companion.", true),
    PANDA("Panda", "He may not know Kung Fu, but give this little guy a bamboo stick and he'll be your friend for life. Grin and bear it with this lazy Panda companion!", true),
    ELEPHANT("Elephant", "They say an elephant never forgets... to follow you around the Hypixel Lobby! Pack up your trunk and join the herd with this tiny Elephant companion.", true),
    MAGIC_DOG("Magic Dog", "What time is it? Time to stretch your legs and go for a walk with this adventurous Magic Dog companion!", true),
    GIFTERINO("Gifterino", "These little guys tend to follow the most generous person ever, and that person is you!", false);


    private String name, lore;

    private boolean buyableOnStore;

    private ObtainType obtainType;

    CompanionSpecies(String name, String lore, boolean buyableOnStore){
       this(name, lore, null, buyableOnStore);
    }

    CompanionSpecies(String name, String lore, ObtainType boxType, boolean buyableOnStore){
        this.name = name;
        this.lore = lore;
        this.obtainType = boxType;
        this.buyableOnStore = buyableOnStore;
    }


    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(CompanionSpecies item: CompanionSpecies.values()){
            list.add(item.name());
        }
        return list;
    }


    public static CompanionSpecies getFromString(String pet){
        pet = pet.toUpperCase().replace("PET_", "");
        if(mapping.contains(pet)){
            return CompanionSpecies.valueOf(pet);
        }
        return null;
    }

    public String getName(){ return name;}

    public String getLore(){ return lore;}

    public boolean isBuyableOnStore(){ return buyableOnStore;}

    public ObtainType getObtainType(){ return obtainType; }
}
