package com.skyerzz.hypixellib.util.network.collectibles.gadget;

import com.skyerzz.hypixellib.util.network.Rank;
import com.skyerzz.hypixellib.util.network.collectibles.mysteryvault.ObtainType;
import com.skyerzz.hypixellib.util.network.collectibles.mysteryvault.Rarity;

import java.util.ArrayList;

/**
 * Created by sky on 4-7-2017.
 */
public enum Gadget {
    ROLL_OVER("Roll Over Gadget", "Causes your pet to roll over, allowing you to rub their belly.", null, GadgetType.FUN_AND_GAMES, Rank.MVP_PLUS),
    MAGIC_NINE_BALL("Magic 9 Ball Gadget", "Learn the answers to your problems through some of the world's greatest leaders.", null, GadgetType.FUN_AND_GAMES, Rank.MVP),
    TRAMPOLINE("Trampoline Gadget", "Constructs a trampoline that sends you intot he air. Invite your friends!", Rarity.LEGENDARY, GadgetType.FUN_AND_GAMES, ObtainType.CRAFTED_MYSTERY_BOX_ONE),
    DIVING_BOARD("Diving Board Gadget", "Everything was going swimmingly, until suddenly... CANNONBALL!. Show off your aquatic skills with this Diving Board Gadget.", Rarity.LEGENDARY, GadgetType.FUN_AND_GAMES, ObtainType.CRAFTED_MYSTERY_BOX_TWO), //fixonline . after cannonball!
    FORTUNE_COOKIE("Fortune Cookie Gadget", "What's better than a cookie? A cookie that gives solid life advice! Enjoy a sweet treat and wise words with this Fortune Cookie gadget.", 10, Rarity.COMMON, GadgetType.FUN_AND_GAMES),
    TETHERBALL("Tetherball Gadget", "Spawns a pole, complete with a tether ball - perfect for a quick game of tetherball!", 55, Rarity.EPIC, GadgetType.FUN_AND_GAMES),
    TENNIS_BALL("Tennis Ball Gadget", "A Tennis Ball gadget. It's a ball, usually used for tennis. Don't play tennis? Well, if you have a pet you can play fetch!", 55, Rarity.EPIC, GadgetType.FUN_AND_GAMES),

    WHEN_PIGS_FLY("When Pigs Fly Gadget", "Spawns a flying pig with you riding it into battle!", null, GadgetType.MOBS_AND_NPCS, Rank.MVP_PLUS),
    CATAPULT("CATapult Gadget", "Attack your enemies with their worst fear, cats! Launches 4-6 exploding cats in the direction you aim.", null, GadgetType.MOBS_AND_NPCS, Rank.MVP_PLUS),
    EXPLODING_SHEEP("Exploding Sheep Gadget", "Right out of Farm HUnt, it's the one and only Explosive Sheep back and more explosive than ever.", 25, Rarity.RARE, GadgetType.MOBS_AND_NPCS),
    CREEPER_ASTRONAUT("Creeper Astronaut Gadget", "Shoot a creeper into the air, if it makes it to the top, enjoy the spectacular show!", 30, Rarity.RARE, GadgetType.MOBS_AND_NPCS), //rhune says this is a correct gramatical lore
    SECRET_SERVICE("Secret Service Gadget", "Turn yourself into the real VIP with these Secret Service guards.", 55, Rarity.EPIC, GadgetType.MOBS_AND_NPCS),

    COWBOY("Cowboy Gadget", "Allows you to ride the nearest player. Create towers by riding pets and then riding other players!", null, GadgetType.MOVEMENT, Rank.MVP_PLUS),
    TELEPORT_STICK("Teleport Stick GadgeT", "Allows you to teleport anywhere in the lobby by right-clicking and pointing with this magical stick.", null, GadgetType.MOVEMENT, Rank.MVP_PLUS),
    PAINT_TRAIL("Paint Trail Gadget", "Leaves a trail of randomly colored clay behind you that disappears a few seconds later.", 22, Rarity.RARE, GadgetType.MOVEMENT),
    FIRE_TRAIL("Fire Trail Gadget", "Gives you speed II and gives a trail of blazing fire behind you.", 20, Rarity.RARE, GadgetType.MOVEMENT), //fixonline 2nd "gives" change to "leaves" ?
    GRAPPLING_HOOK("Grappling Hook Gadget", "Sometimes you have to grapple with serious issues... and other times you just have to grapple! Swing around your favourite lobby with this Grappling Hook Gadget", 27, Rarity.RARE, GadgetType.MOVEMENT),
    JETPACK("Jetpack Gadget", "\"3... 2... 1... we have lift off! Hold on... wait for it... yep, he hit a tree!\" Blast off to infinity and beyong with this rocket-powered Jetpack gadget.", 25, Rarity.RARE, GadgetType.MOVEMENT),
    PARACHUTE("Parachute Gadget", "Rockets you into the sky, shortly before deploying your parachute for a soft landing.", 40, Rarity.EPIC, GadgetType.MOVEMENT),
    TELEPORTER("Teleporter Gadget", "In the blink of an eye you vanish, and magically appear somewhere else. But be warned... when we say \"somewhere\", we mean ANYWHERE! Traverse the space-time continuum with this Teleporter gadget.", 45, Rarity.EPIC, GadgetType.MOVEMENT),
    MAGIC_CARPET("Magic Carpet Gadget", "Pretty much just a regular, normal carpet. Except for the whole flying thing of course. A whole new world awaits you on this Magic Carpet gadget.", 50, Rarity.EPIC, GadgetType.MOVEMENT),
    METEORITE("Meteorite Gadget", "Don't worry, activating this gadget won't create another age of extinction... but it will care your friends! Crash to Earth in a fiery explosion with this galactic Meteorite gadget.", 55, Rarity.EPIC, GadgetType.MOVEMENT),
    ROCKET("Rocket Gadget", "Blast off to the moon with this large scale rocket complete with countdown, sounds and an explosive ending.", 125, Rarity.LEGENDARY, GadgetType.MOVEMENT),

    IPIXEL("iPixel Gadget", "Allows you to open a music player where you can select from various C418 hit singles to play.", null, GadgetType.MUSICAL, Rank.MVP_PLUS),
    RADIO("Hypixel Radio Gadget", "The lobbies are alive with the sound of music! Listen to your favourite Noteblock hits with this patented Radio gadget!", Rarity.LEGENDARY, GadgetType.MUSICAL, ObtainType.CRAFTED_MYSTERY_BOX_TWO),
    DISCO_BALL("Disco Ball Gadget", "Spawns a Disco Ball, complete with fancy effects and music.", 60, Rarity.EPIC, GadgetType.MUSICAL),

    MOBGUN("MobGun Gadget", "Launch exploding projectiles using 18 different types of mobs." , null, GadgetType.PROJECTILE, Rank.MVP_PLUS),
    RAILGUN("Railgun Gadget", "Straight from Quakecraft, it's the basic railgun ready to fire at will!", null, GadgetType.PROJECTILE, Rank.MVP),
    PAINTBALL_GUN("Paintball Gun Gadget", "What better way to spruce up the lobby than with a little color? Or a lot, who's counting?", 10, Rarity.COMMON, GadgetType.PROJECTILE),
    EXPLOSIVE_BOW("Explosive Bow Gadget", "Teleport Sticks are for losers. All the cool kids use the Explosive Bow.", 10, Rarity.COMMON, GadgetType.PROJECTILE),
    WIZARDWAND("TNT Wizards Wand Gadget", "Drawing from the power of the TNT Wizards, you can cycle through the deadly magics of Kinetic, Ice and Blood! Become a magic user with this Wizard Wand gadget.", 40, Rarity.EPIC, GadgetType.PROJECTILE),

    BAT_LAUNCHER("Bat Launcher Gadget", "Unleash a wave of bats on your command!", Rarity.RARE, GadgetType.SEASONAL, ObtainType.HALLOWEEN_MYSTERY_BOX),
    SCARE_CROW("Scarecrow Gadget", "Spawns a scarecrow that changes the head of nearby players into a pumpkin.", Rarity.LEGENDARY, GadgetType.SEASONAL, ObtainType.HALLOWEEN_MYSTERY_BOX),
    LET_SNOW("Let It Snow Gadget", "Release a small snowstorm around you covering the area in white for a short amount of time!", Rarity.RARE, GadgetType.SEASONAL, ObtainType.CHRISTMAS_MYSTERY_BOX),
    HOLIDAY_CHOIR("Holiday Choir Gadget", "Jingle bells, jingle bells!", Rarity.EPIC, GadgetType.SEASONAL, ObtainType.CHRISTMAS_MYSTERY_BOX),
    HOLIDAY_TREE("Holiday Tree Gadget", "Run... Let's see what presents we got under the tree!", Rarity.LEGENDARY, GadgetType.SEASONAL, ObtainType.CHRISTMAS_MYSTERY_BOX),
    DJ_BOOTH("DJ Booth Gadget", "If you ever wanted to become a DJ, it's now or never! Mesmerize your friends with this DJ set and dancefloor.", Rarity.LEGENDARY, GadgetType.SEASONAL, ObtainType.SUMMER_MYSTERY_BOX),
    WATER_BALLOON("Water Balloon Gadget", "This summer's surely warm! Let's all chill throwing water balloons at eachother!", Rarity.EPIC, GadgetType.SEASONAL, ObtainType.SUMMER_MYSTERY_BOX), //fixonline eachother > each other
    DICE("Dice Gadget", "Don't worry, this dice won't get lost even if it falls under your sofa!", Rarity.EPIC, GadgetType.SEASONAL, ObtainType.SUMMER_MYSTERY_BOX),
    POCKET_BEACH("Pocket Beach Gadget", "Can't go to the beach? No problem! Carry your own spot in your pocket!", Rarity.EPIC, GadgetType.SEASONAL, ObtainType.SUMMER_MYSTERY_BOX),
    FRISBEE("Frisbee Gadget", "Toss this carper... err, frisbee to your friends for maximum fun!", Rarity.RARE, GadgetType.SEASONAL, ObtainType.SUMMER_MYSTERY_BOX),
    VOLLEYBALL("Beach Ball Gadget", "There's nothing more fun than playing with a beach ball, ask your friends to join you!", Rarity.RARE, GadgetType.SEASONAL, ObtainType.SUMMER_MYSTERY_BOX), //checked with dirty
    TIC_TAC_TOE("Tic Tac Toe Gadget", "Challenge your friends to a tic-tac-toe game. Who will be the winner?", Rarity.LEGENDARY, GadgetType.SEASONAL, ObtainType.SUMMER_MYSTERY_BOX),
    SAND_CASTLE("Sand Castle Gadget", "Build your own castle with real sand!", Rarity.RARE, GadgetType.SEASONAL, ObtainType.SUMMER_MYSTERY_BOX),
    BBQ_GRILL("BBQ Grill Gadget", "Come on, you earned it! Celebrate a real party BBQ style!", Rarity.EPIC, GadgetType.SEASONAL, ObtainType.SUMMER_MYSTERY_BOX),
    CHICKEN_CANNON("Chicken Cannon Gadget", "Experimental cannon with chicken ammo. What could go wrong with this one?", Rarity.EPIC, GadgetType.SEASONAL, ObtainType.SUMMER_MYSTERY_BOX),
    ICE_CREAM_STAND("Ice Cream Stand Gadget", "\"I'll have a vanilla fudge ice cream, thanks!\".", Rarity.LEGENDARY, GadgetType.SEASONAL, ObtainType.SUMMER_MYSTERY_BOX), //rhune says its ok to have that period there.
    FLOWER_GIVER("Flower Giver Gadget", "Spread the good vibes by giving flowers to everyone around you!", Rarity.RARE, GadgetType.SEASONAL, ObtainType.SUMMER_MYSTERY_BOX),
    TRICK_OR_TREAT("Trick or Treat Gadget", "Trick or Treat! Use this gadget on another player to offer them a choice, but will they get a nice treat... or a terrible trick!?", Rarity.LEGENDARY, GadgetType.SEASONAL, ObtainType.HALLOWEEN_MYSTERY_BOX),
    PUMPKIN_CANNON("Pumpkin Cannon Gadget", "Pumpkin Pie. Pumpkin soup. Pumpkin spice. And now, Pumpkin Cannon! Jack up someone's lanterns with this versatile vegetable.", Rarity.RARE, GadgetType.SEASONAL, ObtainType.HALLOWEEN_MYSTERY_BOX),
    NEW_YEAR("New Year Gadget", "Should auld acquaintance be forgot? Celebrate the end of another year with this New Years Celebration countdown gadget.", Rarity.LEGENDARY, GadgetType.SEASONAL, ObtainType.CHRISTMAS_MYSTERY_BOX),
    CHRISTMAS_CRACKER("Christmas Cracker Gadget", "Found throughout Europe, it's a traditional Christmas Cracker! Right-click another player to open the cracker with them; 1 of the 2 of you will receive a holiday joke!", Rarity.EPIC, GadgetType.SEASONAL, ObtainType.CHRISTMAS_MYSTERY_BOX),
    SNOWMAN("Snowman Gadget", "Do you wanna build a ... wait a minute. Right click to start building a snowman, keep clicking to build it all the way up.", Rarity.RARE, GadgetType.SEASONAL, ObtainType.CHRISTMAS_MYSTERY_BOX), //fixonline right click -> right-click

    FIREWORK_VICTORY_DANCE("MCProHosting Firework Gadget", "Sets off a firework show, broadcasting MCPH into the sky!", null, GadgetType.VISUAL, ObtainType.MCPROHOSTING_DEAL), //through gnarlak stats (pistdrei)
    KOOKIE_FOUNTAIN("Kookie Fountain Gadget", "Makes kookies rain around you!", null, GadgetType.VISUAL, ObtainType.MCPROHOSTING_DEAL),
    PYROMANIAC("Pyromaniac Gadget", "Ignites you into a ball of fire for 10 seconds, before cooling off.", null, GadgetType.VISUAL, Rank.MVP),
    DIAMOND_SHOWER("Diamond Shower Gadget", "Showers you in Diamonds, fantastic for showing off your amazing wealth.", null, GadgetType.VISUAL, Rank.MVP),
    GOLD_FOUNTAIN("Gold Fountain Gadget", "What's the best thing to do with Gold? Making it rain gold.", null, GadgetType.VISUAL, Rank.VIP),
    KAWARIMI_NO_JUTSU("Kawarimi no Jutsu Gadget", "With this technique, users replace their own body with a block of wood.", null, GadgetType.VISUAL, Rank.MVP),
    CRYOTUBE("Cryotube Gadget", "Freezes you inside ice, great if you're planning on surviving any random apocalypses.", null, GadgetType.VISUAL, Rank.MVP),
    GHOSTS("Ghosts Gadget", "Spawns floating ghost heads that fly away before disappearing as soon as they came.", 30, Rarity.RARE, GadgetType.VISUAL),
    PARTY_POPPER("Party Popper Gadget", "Explodes you into a confetti complete with noises and everything to make your lobby party amazing.", 50, Rarity.EPIC, GadgetType.VISUAL),
    POOP_BOMB("Poop bomb Gadget", "If the name doesn't say enough, this is pretty much just a bomb that explodes releasing poop everywhere. Yup.", 45, Rarity.EPIC, GadgetType.VISUAL),//fixonline comma after releasing?
    HORROR_MOVIE("Horror Movie Gadget", "You see flashes of lightning, hear blood-curdling screams, and feel the calling of a long dead King... We've got a bad feeling about this Horror Movie gadget!", 40, Rarity.EPIC, GadgetType.VISUAL),
    TNT_FOUNTAIN("TNT Fountain Gadget", "Spawns an animated fountain that rains down primed TNT.", 90, Rarity.LEGENDARY, GadgetType.VISUAL),
    RAINBOW("Rainbow Gadget", "Spawns a complete rainbow, featuring all the colors you love and can possibly see.", 100, Rarity.LEGENDARY, GadgetType.VISUAL),

    SKYWARS_BANNER("Skywars Ranked Banner Gadget", "Place a banner to show off your amazing score in Skywars Ranked.", Rarity.LEGENDARY, GadgetType.RANKED_REWARDS, ObtainType.SKYWARS_RANKED);

    private String displayName, lore;
    private int mysteryDustCost;
    private Rarity rarity;
    private Rank rankRequirement;
    private GadgetType gadgetType;
    private ObtainType obtainType;

    Gadget(String displayName, String lore, int mysteryDustCost, Rarity rarity, GadgetType gadgetType, Rank rankRequirement, ObtainType obtainType) {
        this.displayName = displayName;
        this.lore = lore;
        this.mysteryDustCost = mysteryDustCost;
        this.rarity = rarity;
        this.rankRequirement = rankRequirement;
        this.gadgetType = gadgetType;
        this.obtainType = obtainType;
    }

    Gadget(String displayName, String lore, int mysteryDustCost, Rarity rarity, GadgetType gadgetType){
        this(displayName, lore, mysteryDustCost, rarity, gadgetType, Rank.NONE, ObtainType.DEFAULT_MYSTERY_BOX);
    }

    Gadget(String displayName, String lore, Rarity rarity, GadgetType gadgetType, Rank rankRequirement){
        this(displayName, lore, -1, rarity, gadgetType, rankRequirement, ObtainType.RANK_UPGRADE);
    }

    Gadget(String displayName, String lore, Rarity rarity, GadgetType gadgetType, ObtainType obtainType){
        this(displayName, lore, -1, rarity, gadgetType, Rank.NONE, obtainType);
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(Gadget item: Gadget.values()){
            list.add(item.name());
        }
        return list;
    }

    public static Gadget getFromString(String gadget){
        gadget = gadget.toUpperCase().trim().replace("GADGET_", "");
        if(mapping.contains(gadget)){
            return Gadget.valueOf(gadget);
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

    public GadgetType getGadgetType() {
        return gadgetType;
    }

    public ObtainType getObtainType() {
        return obtainType;
    }
}
