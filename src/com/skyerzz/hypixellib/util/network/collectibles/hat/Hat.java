package com.skyerzz.hypixellib.util.network.collectibles.hat;

import com.skyerzz.hypixellib.util.network.Rank;
import com.skyerzz.hypixellib.util.network.collectibles.mysteryvault.ObtainType;
import com.skyerzz.hypixellib.util.network.collectibles.mysteryvault.Rarity;

import java.util.ArrayList;

/**
 * Created by sky on 2-7-2017.
 */
public enum Hat {
    //skywars ranked rewards todo create specialrequirement
    ENDER_STEVE("Ender Steve Hat", Rarity.LEGENDARY, -1, null, null),
    DIAMOND_STEVE("Diamond Steve Hat", Rarity.EPIC, -1, null, null),
    GOLD_STEVE("Gold Steve Hat", Rarity.RARE, -1, null, null),
    IRON_STEVE("Iron Steve Hat", Rarity.RARE, -1, null, null),
    STONE_STEVE("Stone Steve Hat", Rarity.RARE, -1, null, null),
    WOOD_STEVE("Wood Steve Hat", Rarity.RARE, -1, null, null),
    ENDER_DRAGON("Ender Dragonling Hat", Rarity.EPIC, -1, null, null),

    POLAR_BEAR("Polar Bear Hat", Rarity.COMMON, 12, Rank.NONE),
    KOALA("Koala Hat", Rarity.COMMON, 9, Rank.NONE),
    BIRD("Bird Hat", Rarity.COMMON, 12, Rank.NONE),
    BEE("Bee Hat", Rarity.COMMON, 7, Rank.NONE),
    CLOWNFISH("Clownfish Hat", Rarity.COMMON, 7, Rank.NONE),
    FERRET("Ferret Hat", Rarity.COMMON, 9, Rank.NONE),
    WALRUS("Walrus Hat", Rarity.COMMON, 12, Rank.NONE),
    MONKEY("Monkey Hat", Rarity.COMMON, 12, Rank.NONE),
    CACTUS("Cactus Hat", Rarity.COMMON, 7, Rank.NONE),
    BURGER("Burger Hat", Rarity.COMMON, 12, Rank.NONE),
    MONITOR("Monitor Hat", Rarity.COMMON, 12, Rank.NONE),
    BEACH_BALL("Beach Ball Hat", Rarity.COMMON, 9, Rank.NONE),
    DUCK("Duck Hat", Rarity.COMMON, 12, Rank.NONE),
    EARTH("Earth Hat", Rarity.COMMON, 9, Rank.NONE),
    //page 2

    //<editor-fold desc="[Alphabet + Numerics]">
    LETTER_A("\"\"A\"\" Hat", Rarity.COMMON, 7, Rank.NONE),
    LETTER_B("\"B\" Hat", Rarity.COMMON, 7, Rank.NONE),
    LETTER_C("\"C\" Hat", Rarity.COMMON, 7, Rank.NONE),
    LETTER_D("\"D\" Hat", Rarity.COMMON, 7, Rank.NONE),
    LETTER_E("\"E\" Hat", Rarity.COMMON, 7, Rank.NONE),
    LETTER_F("\"F\" Hat", Rarity.COMMON, 7, Rank.NONE),
    LETTER_G("\"G\" Hat", Rarity.COMMON, 7, Rank.NONE),
    LETTER_H("\"H\" Hat", Rarity.COMMON, 7, Rank.NONE),
    LETTER_I("\"I\" Hat", Rarity.COMMON, 7, Rank.NONE),
    LETTER_J("\"J\" Hat", Rarity.COMMON, 7, Rank.NONE),
    LETTER_K("\"K\" Hat", Rarity.COMMON, 7, Rank.NONE),
    LETTER_L("\"L\" Hat", Rarity.COMMON, 7, Rank.NONE),
    LETTER_M("\"M\" Hat", Rarity.COMMON, 7, Rank.NONE),
    LETTER_N("\"N\" Hat", Rarity.COMMON, 7, Rank.NONE),
    LETTER_O("\"O\" Hat", Rarity.COMMON, 7, Rank.NONE),
    LETTER_P("\"P\" Hat", Rarity.COMMON, 7, Rank.NONE),
    LETTER_Q("\"Q\" Hat", Rarity.COMMON, 7, Rank.NONE),
    LETTER_R("\"R\" Hat", Rarity.COMMON, 7, Rank.NONE),
    LETTER_S("\"S\" Hat", Rarity.COMMON, 7, Rank.NONE),
    LETTER_T("\"T\" Hat", Rarity.COMMON, 7, Rank.NONE),
    LETTER_U("\"U\" Hat", Rarity.COMMON, 7, Rank.NONE),
    //page 3
    LETTER_V("\"V\" Hat", Rarity.COMMON, 7, Rank.NONE),
    LETTER_W("\"W\" Hat", Rarity.COMMON, 7, Rank.NONE),
    LETTER_X("\"X\" Hat", Rarity.COMMON, 7, Rank.NONE),
    LETTER_Y("\"Y\" Hat", Rarity.COMMON, 7, Rank.NONE),
    LETTER_Z("\"Z\" Hat", Rarity.COMMON, 7, Rank.NONE),

    NUMBER_0("\"0\" Hat", Rarity.COMMON, 7, Rank.NONE),
    NUMBER_1("\"1\" Hat", Rarity.COMMON, 7, Rank.NONE),
    NUMBER_2("\"2\" Hat", Rarity.COMMON, 7, Rank.NONE),
    NUMBER_3("\"3\" Hat", Rarity.COMMON, 7, Rank.NONE),
    NUMBER_4("\"4\" Hat", Rarity.COMMON, 7, Rank.NONE),
    NUMBER_5("\"5\" Hat", Rarity.COMMON, 7, Rank.NONE),
    NUMBER_6("\"6\" Hat", Rarity.COMMON, 7, Rank.NONE),
    NUMBER_7("\"7\" Hat", Rarity.COMMON, 7, Rank.NONE),
    NUMBER_8("\"8\" Hat", Rarity.COMMON, 7, Rank.NONE),
    NUMBER_9("\"9\" Hat", Rarity.COMMON, 7, Rank.NONE),

    LETTER_PLUS("\"+\" Hat", Rarity.COMMON, 7, Rank.NONE),
    LETTER_HASHTAG("\"#\" Hat", Rarity.COMMON, 7, Rank.NONE),
    LETTER_QUESTION("\"?\" Hat", Rarity.COMMON, 7, Rank.NONE),
    LETTER_EXCLAIMATION("\"!\" Hat", Rarity.COMMON, 7, Rank.NONE),
    //</editor-fold>

    SNOWGLOBE("Snowglobe Hat", Rarity.COMMON, 12, Rank.NONE),
    TOASTER("Toaster Hat", Rarity.COMMON, 12, Rank.NONE),
    //page 4
    EGG_HEAD("Egg Head Hat", Rarity.COMMON, 15, Rank.NONE),
    SANDWICH("Sandwich Hat", Rarity.COMMON, 15, Rank.NONE),
    CHEESE("Cheese Hat", Rarity.COMMON, 15, Rank.NONE),
    MARS("Mars Hat", Rarity.COMMON, 15, Rank.NONE),
    PENGUIN("Penguin Hat", Rarity.COMMON, 12, Rank.NONE),
    ELEPHANT("Elephant Hat", Rarity.COMMON, 12, Rank.NONE),

    SQUID("Squid Hat", Rarity.RARE, 20, Rank.NONE),
    HORSE("Horse Hat", Rarity.RARE, 15, Rank.NONE),
    ASTRONAUT("Astronaut Hat", Rarity.RARE, 15, Rank.NONE),
    CLOWN("Clown Hat", Rarity.RARE, 15, Rank.NONE),//checked with dirty
    GROOPO("Groopo Hat", Rarity.RARE, 15, Rank.NONE),
    DOGE("Shibe Hat", Rarity.RARE, 23, Rank.NONE),
    ELF_PRINCESS("Elf Princess Hat", Rarity.RARE, 12, Rank.NONE),
    OTTER("Otter Hat", Rarity.RARE, 20, Rank.NONE),
    DINOSAUR("Dinosaur Hat", Rarity.RARE, 21, Rank.NONE),
    MUMMY("Mummy Hat", Rarity.RARE, 20, Rank.NONE),
    ORC("Orc Hat", Rarity.RARE, 18, Rank.NONE),
    MINOTAUR("Minotaur Hat", Rarity.RARE, 18, Rank.NONE),
    DEMON_KNIGHT("Demon Knight Hat", Rarity.RARE, 21, Rank.NONE),
    SCAVENGER("Scavenger Hat", Rarity.RARE, 15, Rank.NONE),
    GOLDEN_KNIGHT("Golden Knight Hat", Rarity.RARE, 15, Rank.NONE),
    //page 5
    WHITE_WIZARD("White Wizard Hat", Rarity.RARE, 15, Rank.NONE),
    MINER("Miner Hat", Rarity.RARE, 16, Rank.NONE),
    FOOTBALL_STAR("Football Star Hat", Rarity.RARE, 16, Rank.NONE),
    MONK("Monk Hat", Rarity.RARE, 15, Rank.NONE),
    WOOD_ELF("Wood Elf Hat", Rarity.RARE, 15, Rank.NONE),
    DEAD_PIRATE("Dead Pirate Hat", Rarity.RARE, 16, Rank.NONE),
    ODIN("Odin Hat", Rarity.RARE, 18, Rank.NONE),
    ASSASSIN("Assassin Villager Hat", Rarity.RARE, 16, Rank.NONE),
    ALIEN_SLUG("Alien Slug Hat", Rarity.RARE, 18, Rank.NONE),
    GHOST("Ghost Hat", Rarity.RARE, 18, Rank.NONE),
    SCARECROW2("Scarecrow Hat", Rarity.RARE, 20, Rank.NONE), //idk why this one is scarecrow2
    EGYPTIAN_QUEEN("Egyptian Queen Hat", Rarity.RARE, 16, Rank.NONE),
    MAGE("Mage Hat", Rarity.RARE, 18, Rank.NONE),
    FOX("Fox Hat", Rarity.RARE, 18, Rank.NONE),
    RAINBOW_GLITCH("Rainbow Glitch Hat", Rarity.RARE, 23, Rank.NONE),
    HALLOWEEN_SKULL("Skull Hat", Rarity.RARE, -1, Rank.NONE, ObtainType.HALLOWEEN_MYSTERY_BOX),
    HALLOWEEN_PIG_ZOMBIE("Pig Zombie Hat", Rarity.RARE, -1, Rank.NONE, ObtainType.HALLOWEEN_MYSTERY_BOX),
    HALLOWEEN_GHAST("Ghast Hat", Rarity.RARE, -1, Rank.NONE, ObtainType.HALLOWEEN_MYSTERY_BOX),
    CANDY_CANE("Candy Cane Hat", Rarity.RARE, -1, Rank.NONE, ObtainType.CHRISTMAS_MYSTERY_BOX),
    GINGER_BREAD("Ginger Bread Man Hat", Rarity.RARE, -1, Rank.NONE, ObtainType.CHRISTMAS_MYSTERY_BOX),  //tested by dirty
    DECORATION_BALL("Red Bauble Hat", Rarity.RARE, -1, Rank.NONE, ObtainType.CHRISTMAS_MYSTERY_BOX),  //tested by dirty
    //page 6
    PRESENT_HAT("Holiday Present Hat", Rarity.RARE, -1, Rank.NONE, ObtainType.CHRISTMAS_MYSTERY_BOX),
    TURTLE("Turtle Hat", Rarity.RARE, 15, Rank.NONE),
    HP8("Hp8 Hat", Rarity.RARE, 16, Rank.NONE),
    FROG("Frog Hat", Rarity.RARE, 16, Rank.NONE),
    PARROT("Parrot Hat", Rarity.RARE, 21, Rank.NONE),
    PUG_WHITE("Pug White", Rarity.RARE, 18, Rank.NONE),
    PUG_BLACK("Pug Black", Rarity.RARE, 18, Rank.NONE),
    OWL("Owl Hat", Rarity.RARE, 20, Rank.NONE),
    PANDA("Panda Hat", Rarity.RARE, 18, Rank.NONE),
    DUCKLING("Duckling Hat", Rarity.RARE, 15, Rank.NONE),
    SLOTH("Sloth Hat", Rarity.RARE, 25, Rank.NONE),
    GORILLA("Gorilla Hat", Rarity.RARE, 23, Rank.NONE),
    MAGIC_DOG("Magic Dog Hat", Rarity.RARE, 21, Rank.NONE),
    LUCKY_DRAGON("Lucky Dragon Hat", Rarity.RARE, 23, Rank.NONE),
    SHIBE("Shibe Hat", Rarity.RARE, 23, Rank.NONE), //fixonline 2x shibe hat? > this one is shibe, page 4 is doge. Tested with dirtyshooter
    HYPIXEL_H("Hypixel H Hat", Rarity.RARE, 25, Rank.NONE),
    HALLOWEEN_EVIL_PUMPKIN("Evil Pumpkin Hat", Rarity.EPIC, -1, Rank.NONE, ObtainType.HALLOWEEN_MYSTERY_BOX),
    HALLOWEEN_MARIONETTE("Marionette Hat", Rarity.EPIC, -1, Rank.NONE, ObtainType.HALLOWEEN_MYSTERY_BOX),
    SNOWMAN("Snowman Hat", Rarity.EPIC, -1, Rank.NONE, ObtainType.CHRISTMAS_MYSTERY_BOX),
    REINDEER("Reindeer Hat", Rarity.EPIC, -1, Rank.NONE, ObtainType.CHRISTMAS_MYSTERY_BOX),
    GIFT("Gift Giver Hat", Rarity.LEGENDARY, -1, null, ObtainType.TWENTY_FIVE_GIFTS_SENT),

    //note these are legacy as far as i can tell
    CRASH("N/A LEGACY - Crash Hat", null, -2, null, ObtainType.LEGACY_UNOBTAINABLE), //blame codename
    TEEMO("N/A LEGACY - Teemo Hat", null, -2, null, ObtainType.LEGACY_UNOBTAINABLE),
    NINJA("N/A LEGACY - Ninja Hat", null, -2, null, ObtainType.LEGACY_UNOBTAINABLE),
    SANIC("N/A LEGACY - Sanic Hat", null, -2, null, ObtainType.LEGACY_UNOBTAINABLE),
    CHEST("N/A LEGACY - Chest Hat", null, -2, null, ObtainType.LEGACY_UNOBTAINABLE), //blame hypixel
    MARIO("N/A LEGACY - Mario Hat", null, -2, null, ObtainType.LEGACY_UNOBTAINABLE),
    PIKACHU("HOLY SHIT THEY HAD A PIKACHU HAT? (LEGACY)", null, -2, null, ObtainType.LEGACY_UNOBTAINABLE),
    BATMAN("N/A LEGACY - Batman Hat", null, -2, null, ObtainType.LEGACY_UNOBTAINABLE);

    private String displayName;
    private Rarity rarity;
    private int mysteryDustCost;
    private ObtainType boxType;
    private Rank rankRequirement;

    Hat(String displayName, Rarity rarity, int mysteryDustCost, Rank rankRequirement){
        this(displayName, rarity, mysteryDustCost, rankRequirement, null);
    }

    Hat(String displayName, Rarity rarity, int mysteryDustCost, Rank rankRequirement, ObtainType boxType){
        this.displayName = displayName;
        this.rarity = rarity;
        this.mysteryDustCost = mysteryDustCost;
        this.boxType = boxType;
        this.rankRequirement = rankRequirement;
    }
    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(Hat item: Hat.values()){
            list.add(item.name());
        }
        return list;
    }


    public static Hat getFromString(String hat){
        hat = hat.toUpperCase().replace("HAT_", "");
        if(mapping.contains(hat)){
            return Hat.valueOf(hat);
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
