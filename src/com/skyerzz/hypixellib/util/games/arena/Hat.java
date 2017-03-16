package com.skyerzz.hypixellib.util.games.arena;

import com.skyerzz.hypixellib.util.item.Item;
import com.skyerzz.hypixellib.util.item.ItemStack;

import java.util.ArrayList;

/**
 * Created by Skyerzz-LAPOTOP on 02/03/2017.
 */
public enum Hat {
    TROLL("Troll Hat", HATRARITY.COMMON, new ItemStack(Item.bedrock, 1), "umadbro?", "Trolol!", "Try harder bro"),
    COMPLIMENT("Compliment Hat", HATRARITY.COMMON, new ItemStack(Item.commandBlock, 1), "You're amazing!", "I love your style!", "You smell great!"),
    INSULT("Insult Hat", HATRARITY.COMMON, new ItemStack(Item.obsidian, 1), "You suck!", "I'm better!", "You smell bad!"),
    GRUMPY_CAT("Grumpy cat hat", HATRARITY.COMMON, Item.greenLeatherHelmet, "I hate games!", "I hate swords!", "I hate mondays!"),
    ROBOT("Robot hat", HATRARITY.COMMON, Item.ironHelmet, "I'll be back.", "Get out.", "Hasta la vista"),
    FOX("Fox hat", HATRARITY.COMMON, new ItemStack(Item.orangeWool, 1), "RING A DING DING", "SAY WHAT?", "I WANT TO KNOW"),
    MR_TOAD("Mr. Toad hat", HATRARITY.COMMON, new ItemStack(Item.greenClay, 1), "Ribbit.", "Croak.", "Ribbet-ribbet"),
    DETECTIVE("Detective hat", HATRARITY.COMMON, Item.grayLeatherHelmet, "Elementary!", "Fetch my diary!", "Case closed!"),
    TEAMPLAYER("Teamplayer hat", HATRARITY.COMMON, Item.purpleLeatherHelmet, "Way to go!", "Good job!", "You're getting there!"),
    NOOB("n00b hat", HATRARITY.COMMON, new ItemStack(Item.coalOre, 1), "OMG HAX", "1v1 me", "HACKER"),
    ORANGE_HOODIE("Orange hoodie hat", HATRARITY.COMMON, Item.orangeLeatherHelmet, "Mmph mmf mmph?", "Mmmpf mpph", "Mmf mpf mommmppf!"),
    WIZARD("Wizard hat", HATRARITY.COMMON, Item.blackLeatherHelmet, "Hypixellamus!", "Alohypixel!", "Crucio!"),
    CANADA("Canada hat", HATRARITY.COMMON, Item.redLeatherHelmet, "I'M SO SORRY", "Syrup?", "Whats that eh?"),
    SCOTLAND("Scotland hat", HATRARITY.COMMON, new ItemStack(Item.lapisBlock, 1), "Haggis!", "Kilts!", "Whiskey!"),
    POTTY_MOUTH("Potty mouth hat", HATRARITY.COMMON, new ItemStack(Item.dirt, 1), "#&^$@(!", "!*#&#(!&*", "@*#!?#@*!"), //unsure, guessing this is ANGRY api value
    KIM_JONG_II("Kim Jung-II hat", HATRARITY.COMMON, Item.yellowLeatherHelmet, "Why harro there", "I’m so ronernee", "Cake? Cake!"),
    GOLD_RUSH("Gold rush hat", HATRARITY.COMMON, new ItemStack(Item.goldBlock, 1), "Budder", "Budder", "Mushroom"),
    SPARTAN("Spartan Hat", HATRARITY.COMMON, Item.chainHelmet, "Madness?" , "This is... Arena!", "Prepare for glory!"),
    HIPSTER("Hipster hat", HATRARITY.COMMON, new ItemStack(Item.grass, 1), "The underground!", "Starbucks!", "Before it was cool!"),
    TRY_HARD("Tryhard hat", HATRARITY.COMMON, Item.ironHelmet, "FITE ME", "UWOTM8", "UDED"),
    LIBRARIAN("Librarian hat", HATRARITY.COMMON, new ItemStack(Item.bookCase, 1), "Shhh!", "Knowledge is power!", "Go read a book!"),

    DOGE("Doge hat", HATRARITY.RARE, new ItemStack(Item.skull, 1 /*todo find head value*/), "Ouch ouch", "Very damage", "Much pain"),
    LEET("L33t hat", HATRARITY.RARE, new ItemStack(Item.redstoneOre, 1), "GET ON MY LEVEL", "UR WEAK SON", "DO U EVEN LIFT"),
    NUKEM("Nukem Hat", HATRARITY.RARE, new ItemStack(Item.TNT, 1), "Out of gum.", " Time to kick butt!", "Not quite!"),
    BANANA("Codename_b Hat", HATRARITY.RARE, new ItemStack(Item.skull, 1 /*todo find head value*/), "CODE!", "MORE CODE!", "Dragons?!"), //why is this hat called banana. EXPLAIN YOURSELF CODENAME!
    AGENTK("AgentK hat", HATRARITY.RARE, new ItemStack(Item.skull, 1 /*todo find head value*/), "*grumbles*", "It works!", " Ship it!"),
    CRYPTKEEPER("Cryptkeeper hat", HATRARITY.RARE, new ItemStack(Item.skull, 1 /*todo find head value*/), ";)", "<3", "Fixed!"),
    BEBOPVOX("Bebopvox hat", HATRARITY.RARE, new ItemStack(Item.skull, 1 /*todo find head value*/), "Diamonds to you!", "Game on!", "So many to come stuff!"),
    REZZUS("Rezzus hat", HATRARITY.RARE, new ItemStack(Item.skull, 1 /*todo find head value*/), "Yep", "Yep!", "Yep."),
    KEVINKOOL("Kessie hat", HATRARITY.RARE, new ItemStack(Item.skull, 1 /*todo find head value*/), "Better internet plz!", "Land down under!", "#Aussieinternet"), //old kevinkool hat, value appears unchanged, hat is.
    HYPIXEL("Hypixel hat", HATRARITY.RARE, new ItemStack(Item.skull, 1 /*todo find head value*/), "sweg", "I <3 sloths", "wat.gif"),

    //todo find out which enchantment + add it.
    THORLON("Thorlon hat", HATRARITY.RARE, new ItemStack(Item.skull, 1 /*todo find head value*/), "I am a god!", "I will smite you!", "Smited!"),
    JAMIE("Jamiethegeek hat", HATRARITY.RARE, new ItemStack(Item.skull, 1 /*todo find head value*/), "For the love of helix!", "Ohwhy", "Nope"),
    CACTUS("Cactus hat", HATRARITY.RARE, new ItemStack(Item.cactus, 1), "Spikey", "Oy-oy!", "Pyoing!"),
    SPACEMAN("Space Helmet", HATRARITY.RARE, new ItemStack(Item.ironBlock, 1), "Ground control?", "Blast-off!", "Houston? We have a problem"),
    POLAR_BEAR("Polar bear hat", HATRARITY.RARE, new ItemStack(Item.snow, 1), "Ice Ice baby", "#FROZEN", "Let it go"),
    ANGRY("Anger hat", HATRARITY.RARE, new ItemStack(Item.redGlass, 1), "RAAAAAWR", "So angry!", "Smash!", "GRAAAAWR"),
    CRYOMANCER("Cryomancer hat", HATRARITY.RARE, new ItemStack(Item.ice, 1), "Winter is coming...", "Is it cold out here?", "Frost DOES bite!"),

    //epic
    HELIX_FOSSIL("Helix hat", HATRARITY.EPIC, new ItemStack(Item.skull, 1 /*todo find head value*/), "Praise Helix!", "Up up anarchy a a", "start9"),
    SLOTH("Slothpixel hat", HATRARITY.EPIC, new ItemStack(Item.skull, 1 /*todo find head value*/), "Ow", "Ow!", "Ow"),
    SWEG("Sweg hat", HATRARITY.EPIC, Item.goldHelmet, "Sweggity", "swiggity", "swooty", "sweg"),
    DIAMOND("Diamond Helmet", HATRARITY.EPIC, Item.diamondHelmet, "See you on the leaderboard!", "What's your rating?", "There can only be one!"),
    BEE_KING("Bee king hat", HATRARITY.EPIC, new ItemStack(Item.yellowGlass, 1), "Bzzz", "Honey, plz", "Send in the drones!"),
    WATCHDOG("Watchdog hat", HATRARITY.EPIC, new ItemStack(Item.netherBrick, 1), "Woof!", "Bark!", "Watchdog!"),
    SLIME("Slime", HATRARITY.EPIC, new ItemStack(Item.slimeBlock, 1), "Boing", "Splorch!", "Slurp!");

    private String name;
    private HATRARITY rarity;
    private ItemStack hatItem;
    private ArrayList<String> phrases = new ArrayList<>();

    Hat(String name, HATRARITY rarity, ItemStack hatItem, String...phrases){
        this.name = name;
        this.rarity = rarity;
        this.hatItem = hatItem;
        for(String s: phrases){
            this.phrases.add(s);
        }
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(Hat item: Hat.values()){
            list.add(item.name());
        }
        return list;
    }

    public String getName() {
        return name;
    }

    public HATRARITY getRarity(){
        return rarity;
    }

    public ItemStack getHatItem(){
        return hatItem;
    }

    public ArrayList<String> getPhrases(){
        return phrases;
    }



    private enum HATRARITY{
        COMMON,
        RARE,
        EPIC;
    }
}
