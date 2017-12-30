package com.skyerzz.hypixellib.util.achievements;


/**
 * Created by sky on 11-11-2017.
 */
public enum TieredAchievement {
    //<editor-fold desc="[Achievements (Tiered)]">
    //note: This list is generated from the official hypixel API achievements.json file.
    WARLORDS_ASSIST(AchievementGameType.WARLORDS, "Quit Stealing My Kills!", "Earn %s assists in any game mode", 20, 100, 500, 2500, 12500),
    WARLORDS_WARRIOR_LEVEL(AchievementGameType.WARLORDS, "Anger Management", "Obtain Lv%s with the Warrior class.", 10, 20, 40, 60, 80),
    WARLORDS_TDM_WINS(AchievementGameType.WARLORDS, "Deathmatched", "Win %s games of Team Deathmatch", 10, 50, 250, 500, 1000),
    WARLORDS_REPAIR_WEAPONS(AchievementGameType.WARLORDS, "RNG God Offerings", "Get %s Broken Weapons repaired by The Weaponsmith.", 10, 50, 250, 1250, 6000),
    WARLORDS_COINS(AchievementGameType.WARLORDS, "Spoils of War", "Earn %s coins in Warlords", 10000, 50000, 250000, 500000, 1000000),
    WARLORDS_KILLS(AchievementGameType.WARLORDS, "Kill Secured", "Kill %s players in any game mode", 50, 250, 1000, 5000, 25000),
    WARLORDS_CTF_WINS(AchievementGameType.WARLORDS, "Vexillologist", "Win %s games of Capture the Flag", 10, 50, 250, 500, 1000),
    WARLORDS_SHAMAN_LEVEL(AchievementGameType.WARLORDS, "Master of the Elements", "Obtain Lv%s with the Shaman class.", 10, 20, 40, 60, 80),
    WARLORDS_MAGE_LEVEL(AchievementGameType.WARLORDS, "Icy Hot", "Obtain Lv%s with the Mage class.", 10, 20, 40, 60, 80),
    WARLORDS_PALADIN_LEVEL(AchievementGameType.WARLORDS, "Knight of Justice", "Obtain Lv%s with the Paladin class.", 10, 20, 40, 60, 80),
    WARLORDS_DOM_WINS(AchievementGameType.WARLORDS, "Dominator", "Win %s games of Domination", 5, 25, 100, 250, 500),
    TNTGAMES_PVP_RUN_WINS(AchievementGameType.TNTGAMES, "Running Killer", "Win %s games of PVP Run", 10, 20, 50, 100, 500),
    TNTGAMES_TNT_WIZARDS_CAPS(AchievementGameType.TNTGAMES, "Conquistador", "Help capture %s points in TNT Wizards", 10, 25, 75, 150, 300),
    TNTGAMES_TNT_TRIATHLON(AchievementGameType.TNTGAMES, "Triathlon", "Play TNT Games for %s minutes", 15, 45, 90, 180, 300),
    TNTGAMES_BOW_SPLEEF_WINS(AchievementGameType.TNTGAMES, "Archery", "Win %s games of Bow Spleef", 10, 20, 50, 100, 500),
    TNTGAMES_TNT_RUN_WINS(AchievementGameType.TNTGAMES, "Marathon", "Win %s games of TNT Run", 10, 20, 50, 100, 500),
    TNTGAMES_WIZARDS_WINS(AchievementGameType.TNTGAMES, "Sorcery", "Win %s games of Wizards", 10, 20, 50, 100, 500),
    TNTGAMES_TNT_WIZARDS_KILLS(AchievementGameType.TNTGAMES, "Kill Reaping", "Get %s kills in TNT Wizards", 100, 500, 2000, 5000, 10000),
    TNTGAMES_TNT_TAG_WINS(AchievementGameType.TNTGAMES, "Tag! Tag! Tag!", "Win %s games of TNT Tag", 10, 20, 50, 100, 500),
    TNTGAMES_PVP_RUN_KILLER(AchievementGameType.TNTGAMES, "Killer", "Kill %s players in PVP Run", 15, 50, 150, 350, 750),
    TNTGAMES_TNT_BANKER(AchievementGameType.TNTGAMES, "Banker", "Earn %s coins from TNT Games", 5000, 20000, 50000, 125000, 250000),
    PAINTBALL_WINS(AchievementGameType.PAINTBALL, "Paintball Superstar", "Win %s games", 10, 50, 100, 1000, 2500),
    PAINTBALL_COINS(AchievementGameType.PAINTBALL, "Paintball Banker", "Earn %s coins in Paintball", 5000, 10000, 35000, 55000, 75000),
    PAINTBALL_KILLS(AchievementGameType.PAINTBALL, "Painter", "Kill %s players", 100, 1000, 10000, 100000, 200000),
    ARENA_BOSSED(AchievementGameType.ARENA, "Bossed", "Kill %s players", 10, 100, 250, 1500, 5000),
    ARENA_GOTTA_WEAR_EM_ALL(AchievementGameType.ARENA, "Gotta Wear 'Em All", "Collect %s hats", 5, 10, 15, 20, 25),
    ARENA_GLADIATOR(AchievementGameType.ARENA, "Gladiator", "Win 2v2 %s times", 50, 100, 500, 1000, 5000),
    ARENA_CLIMB_THE_RANKS(AchievementGameType.ARENA, "Climb the Ranks", "Reach %s rating", 1100, 1200, 1300),
    ARCADE_ZOMBIE_KILLER(AchievementGameType.ARCADE, "Zombie Killer", "Kill %s Zombies in the Blocking Dead", 100, 500, 1000, 1500, 2000),
    ARCADE_BOUNTY_HUNTER(AchievementGameType.ARCADE, "Bounty Hunter", "Kill %s players in Bounty Hunters", 100, 250, 1000, 2000, 3500),
    ARCADE_TEAM_WORK(AchievementGameType.ARCADE, "Team Work", "Complete %s waves on Creeper Attack", 35, 40, 45, 50, 55),
    ARCADE_ARCADE_BANKER(AchievementGameType.ARCADE, "Arcade Banker", "Earn %s coins in Arcade", 10000, 20000, 75000, 150000, 300000),
    ARCADE_ARCADE_WINNER(AchievementGameType.ARCADE, "Arcade Winner", "Win %s Arcade games", 10, 50, 250, 750, 2000),
    ARCADE_FOOTBALL_PRO(AchievementGameType.ARCADE, "Football Pro", "Score %s Goals in Football", 25, 50, 100, 250),
    ARCADE_FARMHUNT_DOMINATOR(AchievementGameType.ARCADE, "Farm Domination", "Win %s games of Farm Hunt as an Animal", 10, 25, 50, 100, 250),
    ARCADE_MINIWALLS_WINNER(AchievementGameType.ARCADE, "MiniWalls Winner", "Win %s games of Mini Walls", 10, 25, 50, 100, 250),
    GINGERBREAD_WINNER(AchievementGameType.GINGERBREAD, "Winner!", "Get %s trophies", 5, 25, 100, 250, 500),
    GINGERBREAD_BANKER(AchievementGameType.GINGERBREAD, "TKR Banker", "Earn %s coins", 5000, 25000, 100000, 250000, 500000),
    GINGERBREAD_RACER(AchievementGameType.GINGERBREAD, "Racer", "Complete %s races", 5, 25, 100, 250, 500),
    SUPERSMASH_SMASH_CHAMPION(AchievementGameType.SUPERSMASH, "Smash Champion", "Reach Smash Level %s", 20, 100, 300, 500, 1000),
    SUPERSMASH_SMASH_WINNER(AchievementGameType.SUPERSMASH, "Smashing!", "Win %s games", 10, 50, 250, 1000, 2500),
    SUPERSMASH_HERO_SLAYER(AchievementGameType.SUPERSMASH, "Hero Slayer", "Kill %s enemy heroes", 50, 250, 1000, 5000, 15000),
    SUPERSMASH_HANDYMAN(AchievementGameType.SUPERSMASH, "Handyman", "Purchase and unlock %s Heroes", 1, 5, 9),
    MURDERMYSTERY_WINS_AS_SURVIVOR(AchievementGameType.MURDERMYSTERY, "Peace Is Mine", "Win %s games as innocent or detective without dying", 1, 10, 25, 40, 60),
    MURDERMYSTERY_KILLS_AS_MURDERER(AchievementGameType.MURDERMYSTERY, "Stabber", "Kill %s survivors as murderer", 5, 20, 50, 100, 150),
    MURDERMYSTERY_WINS_AS_MURDERER(AchievementGameType.MURDERMYSTERY, "You're All Mine", "Win %s games as murderer", 1, 5, 10, 20, 35),
    SKYCLASH_CARDS_UNLOCKED(AchievementGameType.SKYCLASH, "Collector!", "Unlock %s different Cards", 15, 25, 35),
    SKYCLASH_PACKS_OPENED(AchievementGameType.SKYCLASH, "Hoarder!", "Open %s Card Packs", 50, 200, 500, 1500, 3000),
    SKYCLASH_WINS(AchievementGameType.SKYCLASH, "Clashing", "Win %s games", 10, 50, 200, 500, 1500),
    SKYCLASH_KILLS(AchievementGameType.SKYCLASH, "SkyClash Killer", "Kill %s players", 50, 250, 1000, 2500, 7500),
    SKYCLASH_TREASURE_HUNTER(AchievementGameType.SKYCLASH, "Treasure Hunter", "Open a total of %s Ender Chests", 10, 50, 250, 750, 1500),
    SKYCLASH_MOB_BEHEADING(AchievementGameType.SKYCLASH, "Mob Beheading", "Kill a total of %s mobs", 10, 50, 250, 750, 1500),
    SKYWARS_WINS_MEGA(AchievementGameType.SKYWARS, "Mega Winner", "Win %s games in Mega mode", 10, 50, 100, 500, 1000),
    SKYWARS_CAGES(AchievementGameType.SKYWARS, "Cage Hoarder", "Unlock %s cages", 1, 5, 10, 15, 20),
    SKYWARS_KILLS_TEAM(AchievementGameType.SKYWARS, "Team Killer", "Kill %s players in Team mode", 50, 250, 1000, 5000, 10000),
    SKYWARS_KILLS_SOLO(AchievementGameType.SKYWARS, "Solo Killer", "Kill %s players in Solo mode", 50, 250, 1000, 5000, 10000),
    SKYWARS_KITS_TEAM(AchievementGameType.SKYWARS, "Kit Hoarder (Team)", "Unlock %s Team kits", 1, 5, 10, 15),
    SKYWARS_KITS_SOLO(AchievementGameType.SKYWARS, "Kit Hoarder (Solo)", "Unlock %s Solo kits", 1, 5, 10, 15),
    SKYWARS_KITS_MEGA(AchievementGameType.SKYWARS, "Kit Hoarder (Mega)", "Unlock %s Mega kits", 1, 5, 10),
    SKYWARS_KILLS_MEGA(AchievementGameType.SKYWARS, "Mega Killer", "Kill %s players in Mega mode", 50, 250, 1000, 5000, 25000),
    SKYWARS_WINS_TEAM(AchievementGameType.SKYWARS, "Team Winner", "Win %s games in Team mode", 10, 50, 100, 500, 1200),
    SKYWARS_WINS_SOLO(AchievementGameType.SKYWARS, "Solo Winner", "Win %s games in Solo mode", 10, 50, 100, 500, 1200),
    VAMPIREZ_ZOMBIE_KILLER(AchievementGameType.VAMPIREZ, "Zombie Hunter", "Kill %s Zombies", 250, 500, 2500, 7500, 10000),
    VAMPIREZ_COINS(AchievementGameType.VAMPIREZ, "VampireZ Banker", "Earn %s coins in VampireZ", 10000, 20000, 55000, 75000, 150000),
    VAMPIREZ_KILL_VAMPIRES(AchievementGameType.VAMPIREZ, "Vampire Hunter", "Kill %s Vampires", 10, 100, 500, 1000, 2500),
    VAMPIREZ_KILL_SURVIVORS(AchievementGameType.VAMPIREZ, "Blood Sucker", "Kill %s Survivors", 10, 100, 500, 1000, 2500),
    VAMPIREZ_SURVIVOR_WINS(AchievementGameType.VAMPIREZ, "Survivor", "Win %s games as a Survivor", 1, 10, 50, 100, 150),
    WALLS3_COINS(AchievementGameType.WALLS3, "Mega Walls Banker", "Earn %s coins in Mega Walls", 5000, 10000, 35000, 55000, 75000),
    WALLS3_GUARDIAN(AchievementGameType.WALLS3, "Mega Walls Guardian", "Get %s defender kills", 5, 50, 250, 500, 1000),
    WALLS3_WINS(AchievementGameType.WALLS3, "Mega Walls Champion", "Win %s games", 10, 50, 100, 250, 500),
    WALLS3_KILLS(AchievementGameType.WALLS3, "Mega Walls Slayer", "Kill %s players", 10, 50, 250, 1500, 4500),
    WALLS3_RUSHER(AchievementGameType.WALLS3, "Mega Walls Rusher", "Deal %s damage to withers", 250, 2000, 5000, 15000, 50000),
    COPSANDCRIMS_CAC_BANKER(AchievementGameType.COPSANDCRIMS, "Bounty Hunter", "Earn %s Coins", 10000, 50000, 100000, 250000, 500000),
    COPSANDCRIMS_BOMB_SPECIALIST(AchievementGameType.COPSANDCRIMS, "Bomb Specialist", "Defuse or Plant %s bombs.", 10, 50, 100, 500, 1000),
    COPSANDCRIMS_SERIAL_KILLER(AchievementGameType.COPSANDCRIMS, "War Hero", "Kill %s players", 100, 500, 2000, 10000, 25000),
    COPSANDCRIMS_HERO_TERRORIST(AchievementGameType.COPSANDCRIMS, "Warfare", "Win %s Games", 10, 50, 200, 750, 1500),
    SPEEDUHC_SALTY(AchievementGameType.SPEEDUHC, "Salty", "Collect %s Salt", 200, 1000, 5000, 10000, 25000),
    SPEEDUHC_HUNTER(AchievementGameType.SPEEDUHC, "Hunter", "Kill %s players", 50, 200, 1000, 5000, 10000),
    SPEEDUHC_COLLECTOR(AchievementGameType.SPEEDUHC, "Collector", "Unlock %s Perks from the Tear Exchange", 5, 10, 15, 20, 25),
    SPEEDUHC_UHC_MASTER(AchievementGameType.SPEEDUHC, "UHC Master", "Win %s games", 10, 50, 200, 500, 1500),
    GENERAL_CHALLENGER(AchievementGameType.GENERAL, "Challenger", "Complete a total of %s challenges", 10, 50, 100, 250, 500),
    GENERAL_COINS(AchievementGameType.GENERAL, "Ultimate Banker", "Earn a total of %s coins", 1000, 25000, 75000, 150000, 250000),
    GENERAL_QUEST_MASTER(AchievementGameType.GENERAL, "Quest Master", "Complete a total of %s quests", 5, 25, 50, 125, 250),
    GENERAL_WINS(AchievementGameType.GENERAL, "Winning!", "Win %s minigames", 15, 150, 500, 1500, 2500),
    UHC_HUNTER(AchievementGameType.UHC, "Hunter", "Kill %s players", 10, 100, 500, 1000, 2000),
    UHC_MOVING_UP(AchievementGameType.UHC, "Moving up in life", "Obtain %s Title", 10, 60, 210, 460, 1710),
    UHC_CHAMPION(AchievementGameType.UHC, "Champion", "Win %s games", 1, 10, 50, 100, 250),
    UHC_BOUNTY(AchievementGameType.UHC, "Bounty", "Earn %s coins", 1000, 25000, 75000, 250000, 500000),
    BLITZ_KILLS(AchievementGameType.BLITZ, "Blitz Slayer", "Kill %s players", 10, 100, 1000, 5000, 12000),
    BLITZ_COINS(AchievementGameType.BLITZ, "Blitz Banker", "Earn %s coins in Blitz", 5000, 10000, 35000, 55000, 75000),
    BLITZ_LOOTER(AchievementGameType.BLITZ, "Looter", "Open a total of %s Chests", 25, 250, 1500, 5000, 15000),
    BLITZ_TREASURE_SEEKER(AchievementGameType.BLITZ, "Treasure Seeker", "Find the Blitz Star %s times", 1, 5, 10, 25, 100),
    BLITZ_WINS(AchievementGameType.BLITZ, "One Man Army", "Win %s solo games", 10, 100, 250, 500, 1200),
    BLITZ_WAR_VETERAN(AchievementGameType.BLITZ, "War Veteran", "Win a game with the Rambo Kit %s times", 1, 5, 15, 25, 50),
    BLITZ_WINS_TEAMS(AchievementGameType.BLITZ, "Two Man Army", "Win %s team games", 10, 100, 250, 500, 1200),
    WALLS_KILLS(AchievementGameType.WALLS, "Walls Slayer", "Kill %s players", 10, 50, 250, 1000, 2500),
    WALLS_COINS(AchievementGameType.WALLS, "Walls Banker", "Earn %s coins in The Walls", 5000, 10000, 35000, 55000, 75000),
    WALLS_WINS(AchievementGameType.WALLS, "Walls Warrior", "Win %s games", 10, 50, 100, 250, 500),
    BEDWARS_LEVEL(AchievementGameType.BEDWARS, "Road to Prestige", "Reach %s Bed Wars Level", 5, 25, 50, 75, 100),
    BEDWARS_WINS(AchievementGameType.BEDWARS, "Victory Dancer", "Win %s games", 25, 75, 200, 500, 1000),
    BEDWARS_BEDS(AchievementGameType.BEDWARS, "Bed Removal", "Destroy %s Beds", 10, 25, 100, 250, 500),
    BEDWARS_LOOT_BOX(AchievementGameType.BEDWARS, "Crate Looter", "Open %s Loot Chests", 10, 25, 100, 250, 500),
    QUAKE_COINS(AchievementGameType.QUAKE, "Quake Banker", "Earn %s coins", 5000, 25000, 100000, 200000, 500000),
    QUAKE_HEADSHOTS(AchievementGameType.QUAKE, "Accuracy", "Get %s headshots", 50, 250, 1000, 5000, 15000),
    QUAKE_WINS(AchievementGameType.QUAKE, "Winner", "Win %s games", 10, 50, 100, 1000, 2000),
    QUAKE_WEAPON_ARSENAL(AchievementGameType.QUAKE, "Weapon Arsenal", "Win a game with %s different guns", 3, 5, 10, 15, 20),
    QUAKE_KILLING_SPREES(AchievementGameType.QUAKE, "Killing Spree Madness", "Get %s killing sprees", 25, 50, 100, 150, 250),
    QUAKE_GODLIKES(AchievementGameType.QUAKE, "God walking among mere mortals", "Get %s godlikes", 3, 10, 20, 35, 50),
    QUAKE_KILLS(AchievementGameType.QUAKE, "MLG", "Kill %s players", 100, 1000, 10000, 50000, 100000),
    TRUECOMBAT_SOLO_KILLER(AchievementGameType.TRUECOMBAT, "Solo Killer", "Kill %s players in Solo Normal or Lucky modes", 50, 200, 500, 1000, 2500),
    TRUECOMBAT_KIT_HOARDER_SOLO(AchievementGameType.TRUECOMBAT, "Kit Hoarder (Solo)", "Unlock %s Solo Kits", 1, 5, 10),
    TRUECOMBAT_SOLO_WINNER(AchievementGameType.TRUECOMBAT, "Solo Winner", "Win %s games of Solo Normal or Lucky modes", 5, 50, 200, 500, 1000),
    TRUECOMBAT_FEELS_LUCKY(AchievementGameType.TRUECOMBAT, "Feels Lucky Man", "Open a total of %s villager lucky blocks", 50, 250, 500, 1000, 2500),
    TRUECOMBAT_KING(AchievementGameType.TRUECOMBAT, "King", "Collect %s golden skulls", 10, 50, 250, 750, 1500),
    TRUECOMBAT_KIT_HOARDER_TEAM(AchievementGameType.TRUECOMBAT, "Kit Hoarder (Team)", "Unlock %s Team Kits", 1, 5, 10),
    TRUECOMBAT_TEAM_WINNER(AchievementGameType.TRUECOMBAT, "Team Winner", "Win %s games of Team Normal or Lucky modes", 5, 50, 200, 500, 1000),
    TRUECOMBAT_TEAM_KILLER(AchievementGameType.TRUECOMBAT, "Team Killer", "Kill %s players in Team Normal or Lucky modes", 50, 200, 500, 1000, 2500),

    BUILDBATTLE_POINTS(AchievementGameType.BUILDBATTLE, "Build Battle Winner", "Earn %s points in a Build Battle game", 55, 65, 75, 85, 100),
    BUILDBATTLE_GUESS_WINNER(AchievementGameType.BUILDBATTLE, "Guess the Build Winner", "Win %s games of Guess the Build", 10, 25, 75, 150, 250),
    BUILDBATTLE_BUILD_BATTLE_VOTER(AchievementGameType.BUILDBATTLE, "Judge", "Vote on %s builds in Build Battle",40, 200, 500, 1000, 2000),
    BUILDBATTLE_GUESS_THE_BUILD_GUESSES(AchievementGameType.BUILDBATTLE, "No luck, just skill" , "Guess %s themes correctly in Guess the Build", 25, 100, 250, 750, 1500),
    BUILDBATTLE_BUILD_BATTLE_SCORE(AchievementGameType.BUILDBATTLE, "Skilled Progress", "Earn %s score in Build Battle", 100, 500, 1000, 2500, 5000),


    HALLOWEEN2017_PUMPKINATOR(AchievementGameType.HALLOWEEN2017, "Pumpkinator Collector", "Collect %s pumpkins in Bedwars", 5, 25, 100, 250, 1000),
    HALLOWEEN2017_PUMPKIN_SMASHER(AchievementGameType.HALLOWEEN2017, "Pumpkin Smasher", "Smash %s pumpkins in Pumpkin Smash", 250, 500, 750, 1000, 3333),
    CHRISTMAS2017_ADVENT_CALENDAR(AchievementGameType.CHRISTMAS2017, "Advent Calendar", "Claim %s days in the Advent Calendar", 1, 3, 7, 14, 21),
    CHRISTMAS2017_NO_CHRISTMAS_FOR_YOU(AchievementGameType.CHRISTMAS2017, "No Christmas For You", "Pickup %s presents in Grinch Simulator", 5, 15, 60, 150, 300),
    CHRISTMAS2017_SANTA_SAYS_WINNER(AchievementGameType.CHRISTMAS2017, "Santa Says Winner", "Complete %s tasks in Santa Says", 3, 10, 30, 75, 150);
    //</editor-fold>

    private AchievementGameType gameType;
    private String name;
    private String description;
    private int[] tiers;

    TieredAchievement(AchievementGameType achievementGameType, String name, String description, int...requirementsForTiers){
        this.gameType = achievementGameType;
        this.name = name;
        this.description = description;
        tiers = requirementsForTiers;
    }
    /**
     *
     * @return GameType of the achievement.
     */
    public AchievementGameType getGameType(){
        return gameType;
    }

    /**
     *
     * @return display name of the achievement
     */
    public String getName(){
        return name;
    }

    /**
     *
     * @return description of the achievement
     */
    public String getDescription(int level){
        return description.replace("%s", getRequirement(level) + "");
    }

    /**
     *
     * @param tier get the amount of things needed for this achievement.
     * @return integer number of the amount needed
     */
    public int getRequirement(int tier){
        if(tiers.length < tier || tier < 0){
            return -1;
        }
        return tiers[tier];
    }

    /**
     *
     * @param tier points for the tier of the achievement (0-4)
     * @return
     */
    public int getAchievementPoints(int tier){
        if(tiers.length < tier || tier < 0){
            return -1;
        }
        return tier*5;
    }

    /**
     *
     * @param name Name of the achievement
     * @return the achievement with that displayname. Null if not found.
     */
    public static TieredAchievement getAchievementByName(String name){
        for(TieredAchievement ach: TieredAchievement.values()){
            if(ach.getName().equalsIgnoreCase(name)){
                return ach;
            }
        }
        return null;
    }

    /**
     *
     * @param name Name of the achievement
     * @param gameType AchievementGameType of the to get achievement.
     * @return the achievement with that displayname and gametype. Null if not found.
     */
    public static TieredAchievement getAchievementByName(String name, AchievementGameType gameType){
        for(TieredAchievement ach: TieredAchievement.values()){
            if(ach.getName().equalsIgnoreCase(name) && ach.getGameType() == gameType){
                return ach;
            }
        }
        return null;
    }


}
