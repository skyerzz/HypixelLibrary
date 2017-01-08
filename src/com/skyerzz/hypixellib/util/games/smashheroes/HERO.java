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
                "Your energy is represented by the yellow experience bar above your hotbar.",
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
