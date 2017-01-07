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
    )
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
