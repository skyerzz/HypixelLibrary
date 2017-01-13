package com.skyerzz.hypixellib.util.games.smashheroes;

import java.util.ArrayList;

/**
 * Created by sky on 7-1-2017.
 */
public enum HERO {
    //<editor-fold desc="[BULK]">
    THE_BULK("Bulk", "Capable of smashing anything that stands in front of him, he is one of the world's most fearsome Heroes. Try not to anger him...", CLASSTYPE.MELEE, 2, 0, 0,
        new SmashAbility(
                 "BOULDER",
                 "BULK THROW!",
                 "Right Click to throw a car towards the targeted location that deals damage to anyone it passes through.",
                 "The car is affected by gravity. If your target is far away, make sure you aim above their head before you throw it."
        ),
        new SmashAbility(
                "MONSTER_CHARGE",
                "BULK CHARGE!",
                "Press [2] to charge in the direction you're facing. Anyone caught in your path will be damaged.",
                "You can charge upwards while falling to go up. This could save you the next time you fall off of the map.",
                "You can charge downwards after double-jumping to combo BULK CHARGE! with your passive ability, BULK SLAM!.",
                "The cooldown of BULK CHARGE! is reduced during BULK SMASH!."
        ),
        new SmashAbility(
                "MONSTER_MASH",
                "BULK SMASH!",
                "Press [3] to begin repeatedly jumping up and down, dealing damage to players you hit. The cooldown of Bulk Smash is reduced during use.",
                "As a MELEE hero, hitting an enemy with your melee attacks will instantly reduce your Smash Ability's cooldown by 3 seconds.",
                "Picking up the Smash Crystal that occasionally appears during a match will instantly reset your Smash Ability's cooldown."
        ),
        new SmashAbility(
                "SEISMIC_SLAM",
                "BULK SLAM!",
                "After performing a double-jump, you will execute a ground slam the next time you touch the ground, dealing damage to nearby enemy heroes. Requires 70 energy.",
                "Your energy is represented by the yellow experience bar above your hotbar.",
                "If you execute it correctly, you can use other abilities in conjunction with BULK SLAM! to deliver a triple or even a quad hit combo on an unsuspecting enemy."
        )
    ),
    //</editor-fold>
    //<editor-fold desc="[GENERAL CLUCK]">
    GENERAL_CLUCK("General Cluck", "Bawk bawk...BACAAAWWWK!", CLASSTYPE.RANGED, 1, 0, 0,
        new SmashAbility(
                "BAZOOKA",
                "Shoot Rocket",
                "Right Click to shoot a rocket that explodes on impact, dealing damage to enemy heroes. Shooting at your feet will launch you upwards, also known as a Rocket Jump. Allows the use of Clusterbuck after 3 successful hits.",
                "If the enemies you are shooting at are far away, shoot ahead of them if they are moving as the rocket travels slowly.",
                "You take no damage from your own rockets.",
                "Alternating between Rocket Jumps and Flap will allow you to cover greater distances without touching the ground."
        ),
        new SmashAbility(
                "EGG_BAZOOKA",
                "Clusterbuck",
                "Press [2] to shoot a cluster rocket that will explode into multiple explosive eggs. Requires 3 successful hits of Shoot Rocket to become available.",
                "If you're lucky, landing a direct impact on a player increases the chance of multiple eggs hitting the same player."
        ),
        new SmashAbility(
                "REINFORCEMENTS",
                "Chicken Army",
                "Press [3] call in an army of chickens that will fight for you. The chickens are armed with a Bazooka and will shoot rockets at enemy players.",
                "As a RANGED hero, hitting an enemy with your Right Click ability will instantly reduce your Smash Ability's cooldown by 2 seconds.",
                "Picking up the Smash Crystal that occasionally appears during a match will instantly reset your Smash Ability's cooldown."
        ),
        new SmashAbility(
                "FLAP", //todo: unknown API value for this ability
                "Flap",
                "Instead of double-jumping, you can flap your wings several times to glide longer distances. Each wing flap costs energy.",
                "Your energy is represented by the yellow experience bar above your hotbar.",
                "You can't gain much altitude by flapping your wings, but when used alongside Rocket Jump, you can cover large distances."
        )
    ),
    //</editor-fold>
    //<editor-fold desc="[CAKE MONSTER]">
    CAKE_MONSTER("Cake Monster", "This pastry-loving monster has one dream and one dream only. He wishes to become the world's most renowned chef!", CLASSTYPE.MELEE, 2, 0, 0,
        new SmashAbility(
                "SWING_PIN",
                "Swing Pin",
                "Right Click to swing your rolling pin in front of you, sending you slightly forward and damaging all enemies caught in your path. Hits with any of your other abilities will reset Swing Pin's cooldown.",
                "If you're falling off the map, you can use Swing Pin while looking upwards to gain some altitude for a chance at getting back to safety."
        ),
        new SmashAbility(
                "THROW_CAKE",
                "Regurgicake",
                "Press [2] to spew cakes in front of you, dealing damage to enemies. For each cake that hits an enemy, you will take 5% less damage, up to a maximum of 30% for 3 seconds.",
                "Use Swing Pin right before using Regurgicake in order to reset its cooldown immediately, allowing you to use it twice in rapid succession."
        ),
        new SmashAbility(
                "CAKE_STORM",
                "Cake Storm",
                "Press [3] to start rapidly launching cakes from your mouth for several seconds.",
                "As a MELEE hero, hitting an enemy with your melee attacks will instantly reduce your Smash Ability's cooldown by 3 seconds.",
                "Picking up the Smash Crystal that occasionally appears during a match will instantly reset your Smash Ability's cooldown."
        ),
        new SmashAbility(
                "DEFECAKE",
                "Defecake",
                "Double-Jumping will cause you to eject an explosive cake, granting you an extra jump at the cost of 50 energy and damaging nearby enemies when it explodes.",
                "Your energy is represented by the yellow experience bar above your hotbar."
        )
    ),
    //</editor-fold>
    //<editor-fold desc="[BOTMON]">
    BOTMUN("Botmon", "After achieving mental and physical perfection through arduous training, he now fights crime dressed up as a bat. He is vengeance, he is the night, he is...the Botmon", CLASSTYPE.RANGED, 1, 0, 0,
        new SmashAbility(
                "BATARANG",
                "Throw Botarang",
                "Right Click to throw 3 botarangs in rapid succession.",
                "If the enemies you are shooting at are far away, aim ahead of them if they are moving as the Botarangs require some traveling time."
        ),
        new SmashAbility(
                "BOTCLAW", //todo unknown api value
                "Botclaw",
                "Press [2] to attatch your Botclaw to the block you're aiming at, allowing you to quickly travel to it. Botbombs will be automatically thrown as you travel towards the end of the Botclaw.",
                "No tips for this one!"
        ),
        new SmashAbility(
                "BOTMUBILE",
                "Botmobile",
                "Press [3] to hop into your Botmobile, allowing you to fly around. Running over enemy players will deal damage to them.",
                "As a RANGED hero, hitting an enemy with your Right Click ability will instantly reduce your Smash Ability's cooldown by 2 seconds.",
                "Picking up the Smash Crystal that occasionally appears during a match will instantly reset your Smash Ability's cooldown."
        ),
        new SmashAbility(
                "BAT_GLIDE", //todo unknown api value
                "Bat Glide",
                "Double-Jumping will cause you to glide forward in a cloud of abts, pushing enemy players and preventing you from being knocked back. Requires 80 energy. If you don't have enough energy you will double-jump normally.",
                "Your energy is represented by the yellow experience bar above your hotbar.",
                "Activate Bat Glide right before getting hit by a strong attack to avoid being knocked back. Will not work if the attack kills you."
        )
    ),
    //</editor-fold>
    //<editor-fold desc="[TINMAN]">
    TINMAN("Tinman", "We have always been taught and shown that iron is stronger than tin. But is it really? Tinman is here to prove otherwise!", CLASSTYPE.RANGED, 1, 0, 10000,
        new SmashAbility(
                "LASER_CANNON",
                "Shoot Laser",
                "Right Click to rapidly shoot lasers using your laser gun. Allows the use of Rocket Punch after 5 successful hits.",
                "If the enemies you are shooting at are far away, aim ahead of them if they are moving as the lasers require some time to travel.",
                "You can't manually reload your laser gun. It will reload automatically after you have shot all of your lasers."
        ),
        new SmashAbility(
                "ROCKET_PUNCH",
                "Rocket Punch",
                "Press [2] to fire a rocket punch missile that explodes upon impact, dealing damage and knocking back enemy heroes.",
                "Rocket Punch travels much slower than your lasers but deals a lot more damage. Try getting closer to your target before firing to make sure you don't miss!"
        ),
        new SmashAbility(
                "HOMING_MISSILES",
                "Homing Missiles",
                "Press [3] to fire a volley of missiles into the sky that will then lock onto enemy players before coming back down towards them.",
                "As a RANGED hero, hitting an enemy with your Right Click ability will instantly reduce your Smash Ability's cooldown by 2 seconds.",
                "Picking up the Smash Crystal that occasionally appears during a match will instantly reset your Smash Ability's cooldown.",
                "If you are good at aiming with your Shoot Laser ability, your Homing Missiles will become available quickly. Be ready to fire them frequently!"
        ),
        new SmashAbility(
                "OVERLOAD",
                "Overload",
                "Pressing [Sneak] will discharge lightning around you, dealing damage to nearby enemies and sending you upwards into the air. Costs 65 energy.",
                "Your energy is represented by the yellow experience bar above your hotbar."
        )
    ),
    //</editor-fold>
    //<editor-fold desc="[MARAUDER]">
    MARAUDER("Marauder", "His real name is a mystery. Rumor says that he used to be a valiant knight known by everyone in the galaxy. All we know is that he utilizes Dark Energy to do his evil deeds", CLASSTYPE.MELEE, 2, 0, 10000,
        new SmashAbility(
                "FORCE_LIGHTNING",
                "Lightning",
                "Right Click to instantly strike all enemies in front of you with lightning. Costs 40 Dark Energy.",
                "Make sure you are close enough to your target or else your Lightning will not reach them.",
                "Lightning is powerful, but it costs a lot of Dark Energy. Make sure you won't need to use your High Jump ability right after using Lightning or you won't be able to!"
        ),
        new SmashAbility(
                "FORCE_PULL",
                "Grip",
                "Press [2] to grip all enemies in front of you, dealing damage to them before sending them towards you. Costs 80 Dark Energy",
                "Use Grip to temporarily immobilize enemy heroes before using Lightning on them. It'll be much easier to hit them."
        ),
        new SmashAbility(
                "UNLEASHED_ENERGY", //todo api value unknown
                "Unleashed Energy",
                "Press [3] to unleash your darkest energy, causing your abilities to consume half the amount of Dark Energy and reducing the amount of damage you take by half for 15 seconds",
                "As a MELEE hero, hitting an enemy with your melee attacks will instantly reduce your Smash Ability's cooldown by 3 seconds.",
                "Picking up the Smash Crystal that occasionally appears during a match will instantly reset your Smash Ability's cooldown."
        ),
        new SmashAbility(
                "DARK_ENERGY", //todo api value unknown
                "Dark Energy",
                "Marauder' s Lightning and High Jump abilities have no cooldown but require Dark Energy to use. Dark Energy regenerates at a rate of 20 per second and hitting an enemy with a melee attack will generate 10 Dark Energy",
                "Your energy is represented by the yellow experience bar above your hotbar.",
                "While fighting an enemy, try to never let your Dark Energy bar full up completely for too long or that means you're wasting some potential damage or mobility."
        )
    ),
    //</editor-fold>
    //<editor-fold desc="[SPOODERMAN]">
    SPODERMAN("Spooderman", "Due 2 n unfortunate accidnet, spooderman became who he iz aftur gettin bit by a spooder. dis caused him 2 gain incredible abilities at teh cost of brain funcshun. with graet powr comes graet reshponsibility", CLASSTYPE.HYBRID, 4, 0, 25000,
        new SmashAbility(
                "SPIDER_KICK",
                "Spooder Kick",
                "Right Click to perform a kick that will send you forward slightly and deal damage to anyone in your path.",
                "Spooder Kick will knock enemies it hits downwards instead of upwards. Try and kick players who are coming back to the map after being knocked off of it.",
                "If you're falling off the map, you can use Spooder Kick while looking upwards to gain some altitude for a chance at getting back to safety."
        ),
        new SmashAbility(
                "WEB_SHOT",
                "Web Shot",
                "Press [2] to instantly fire a string of web where you're aiming. If it hits a block, it will pull you in that direction. If it hits a player, it will deal damage and pull them towards you. Hitting an enemy player alsog reatly reduces the cooldown.",
                "Web Shot has a greater effect if your target is lower than you. Try jumping before shooting Web Shot.",
                "Use Web Shot to bring an enemy in range of your Spooder Kick."
        ),
        new SmashAbility(//todo check if changed from melee > hybrid
                "SPOODER_BUDDIES",
                "Spooder Buddies",
                "Press [3] to call in your buddies. After they've landed on the ground, they will chase enemy players and who them who's the boss.",
                "As a MELEE hero, hitting an enemy with your melee attacks will instantly reduce your Smash Ability's cooldown by 3 seconds.",
                "Picking up the Smash Crystal that occasionally appears during a match will instantly reset your Smash Ability's cooldown."
        ),
        new SmashAbility(
                "SPOODER_MASTERY", //todo api value unknown
                "Spooder Mastery",
                "Your Spooder Mastery allows you to climb walls by holding [Sneak] at the cost of energy, and every 5th melee hit will summon a spooder to aid you in combat for 10 seconds.",
                "Your energy is represented by the yellow experience bar above your hotbar.",
                "If you are really far down the map and are desperately trying to hang on to a wall but you're running out of energy, alternate between Spooder Mastery and Web Shot for a higher chance at making it back to safety."
        )
    ),
    //</editor-fold>
    //<editor-fold desc="[PUG]">
    PUG("Pug", "Don't get fooled by this puppy's cuteness! The last thing Pug wants is a bely rub!", CLASSTYPE.MELEE, 2, 0, 25000,
        new SmashAbility(
                "BITE",
                "Bite",
                "Right Click to Bite, sending you slightly forwards and damaging all enemies in your path. Deals extra damage if used shortly after Pounce.",
                "If you're falling off the map, you can use Spooder Kick while looking upwards to gain some altitude for a chance at getting back to safety."
        ),
        new SmashAbility(
                "SONIC_BARK",
                "Sonic Bark",
                "Press [2] to let out a sonic bark, dealing damage to all enemies in front of you. Cooldown is greatly reduced while Intruders! is active.",
                "The sound waves of Sonic Bark need some time to travel. If the enemy you're aiming at is moving, try and aim ahead of them."
        ),
        new SmashAbility(
                "INTRUDERS",
                "Intruders!",
                "Press [3] to sound the alarm, releasing two very dangerous companions to chase down the intruders! Your Sonic Bark has a reduced cooldown for the duration.",
                "As a MELEE hero, hitting an enemy with your melee attacks will instantly reduce your Smash Ability's cooldown by 3 seconds.",
                "Picking up the Smash Crystal that occasionally appears during a match will instantly reset your Smash Ability's cooldown."
        ),
        new SmashAbility(
                "POUNCE",
                "Pounce",
                "Pressing [Sneak] causes you to Pounce forwards, launching you in that direction and increase the damage of your next Bite used within 3 seconds. Costs a minimum of 30 energy.",
                "Your energy is represented by the yellow experience bar above your hotbar.",
                "The longer you hold, the further you will jump and the stronger your next Bite will be."
        )
    ),
    //</editor-fold>
    //<editor-fold desc="[CRYOMANCER]">
    FROSTY("Cryomancer", "As a Mage who specialized in the power of Ice, he is pretty cool. Hehe heh hehehe heh... heheheheh...hehe...ehehe......heh...", CLASSTYPE.HYBRID, 3, 0, 25000,
        new SmashAbility(
                "FROSTBOLT",
                "Frostbolt",
                "Right Click to shoot a frostbolt that will shatter on impact, dealing damage and slowing nearby enemies temporarily.",
                "If the enemies you are shooting at are far away, shoot ahead of them if they are moving as Frostbolt travels slowly."
        ),
        new SmashAbility(
                "FREEZING_BREATH",
                "Freezing Breath",
                "Press [2] to breathe cold air in a cone in front of you, dealing damage to all enemies hit and slowing them temporarily.",
                "If two or more enemies are fighting close to each other, try to position yourself in a way that will make Freezing Breath hit all of them the next time you use it."
        ),
        new SmashAbility(
                "ICE_BARRIER",
                "Ice Barrier",
                "Press [3] to surround yourself with a layer of freezing air, reducing any damage you take nd shortens the cooldown of both your Frostbolt and Freezing Breath abilities for the duration.",
                "As a HYBRID hero, hitting an enemy with your melee attacks or with an ability will isntantly reduce your Smash Ability's cooldown by 1 second.",
                "Picking up the Smash Crystal that occasionally appears during a match will instantly reset your Smash Ability's cooldown."
        ),
        new SmashAbility(
                "ARCTIC_AURA",
                "Arctic Aura",
                "Enemies standing in the snow that constantly surrounds you take more damage from your Frostbolt and Freezing Breath abilities.",
                "If your abilities are ready to use and you tihnk you can catch up to a fleeing enemy soon, delaying their usage by a second or two in order tu use Arctic Aura's effect might be worth the wait."
        )
    ),
    //</editor-fold>
    //<editor-fold desc="[SGT SHIELD]">
    SGT_SHIELD("Sgt. Shield", "After experimenting with a dangerous Irish super serum and tons of aerobics, Sergeant Shield became the pinnacle of human physical perfection. He throws his shield at his foes and can block with it. A fantastic melee fighter, some might call him the One-man army", CLASSTYPE.HYBRID, 3, 0, 25000,
        new SmashAbility(
                "SHIELD",
                "Shield",
                "Right Click to dash forward, hitting enemy heroes with your shield.",
                "No tips for this one!"
        ),
        new SmashAbility(
                "RICOCHET",
                "Ricochet",
                "Press [2] to throw Sergeant Shield's shield a short distance at an enemy, potentially bouncing off and hitting multiple targets before returning.",
                "While your sheidl is in your hand you take 15% less damage",
                "eep in mind you're more vulnerable while the shield is away!"
        ),
        new SmashAbility(
                "JUSTICE_SHIELD",
                "Justice Shield",
                "Press [3] to throw your shield into the sky. The shield will plummet into the ground, throwing enemy heroes far off the map",
                "You will lose your 15% damage reduction while your shield is away, so be careful!",
                "A good use of this skill is to knock enemy heroes off the map in order to edge guard and guarantee an enemy hero kill."
        ),
        new SmashAbility(
                "REFLECT",
                "Reflect",
                "[Sneak] to use your shield to its maximum potential, reflecting any projectiles launcher at you back to their original senders!",
                "Reflection can deflect most projectiles, but not all of them!",
                "A good rule of thumb is to block precision projectiles, as opposed to very large ones or skills which affect an area",
                "Be wary, ultimates are more powerful than normal skills and some can't be deflected"
        )
    ),
    //</editor-fold>

    ;


    private String displayName, description;
    private CLASSTYPE classType;
    private int difficulty, requiredSmashLevel, unlockCost;
    private SmashAbility quickMove, chargeMove, smashMove, passive;

    HERO(String displayName, String description, CLASSTYPE classType, int difficulty, int requiredSmashLevel, int unlockCost,
         SmashAbility quickMove, SmashAbility chargeMove, SmashAbility smashMove, SmashAbility passive){
        this.displayName = displayName;
        this.description = description;
        this.classType = classType;
        this.difficulty = difficulty;
        this.requiredSmashLevel = requiredSmashLevel;
        this.unlockCost = unlockCost;

        this.quickMove = quickMove;
        this.chargeMove = chargeMove;
        this.smashMove = smashMove;
        this.passive = passive;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(HERO item: HERO.values()){
            list.add(item.name());
        }
        return list;
    }

    public String getDisplayName(){
        return displayName;
    }

    public String getDescription() {
        return description;
    }

    public CLASSTYPE getClassType() {
        return classType;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public int getRequiredSmashLevel() {
        return requiredSmashLevel;
    }

    public int getUnlockCost() {
        return unlockCost;
    }

    public int getHealth(int prestigeLevel){
        switch(prestigeLevel){
            case 0: return 100;
            case 1: return 102;
            case 2: return 105;
            case 3: return 109;
            case 4: return 114;
            case 5: return 120;
        }
        return -1;
    }

    public int getPrestigeCost(int level){
        switch(level){
            case 0:
                return unlockCost;
            case 1: return 50000;
            case 2: return 120000;
            case 3: return 250000;
            case 4: return 400000;
            case 5: return 750000;
        }
        return -1;
    }

    public int getMasterSkinCost(){
        return 250000;
    }

    public String getMasterSkinDescription() { return "Unlocks the alternate appearance for " + getDisplayName(); }

    public SmashAbility getQuickMove() {
        return quickMove;
    }

    public SmashAbility getChargeMove() {
        return chargeMove;
    }

    public SmashAbility getSmashMove() {
        return smashMove;
    }

    public SmashAbility getPassive() {
        return passive;
    }
}
