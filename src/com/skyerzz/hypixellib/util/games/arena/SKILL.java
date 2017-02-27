package com.skyerzz.hypixellib.util.games.arena;


import java.util.ArrayList;

/**
 * Created by Skyerzz-LAPOTOP on 27/02/2017.
 */
public enum SKILL {
    FIREBALL("Fireball",
             "Launch an explosive ball of molten rock that will explode in a radius of 4, hurting the opponent for 95 damage. If they are caught directly in the blast, they will suffer an additional 10 damage.",
             0, 40, 0, SKILLTYPE.OFFENSE
             ),
    BULL_CHARGE("Bull Charge",
                "Charge in a straight line of about 20 blocks, instantly destroying Barricade, Healing Totem, Wall of Vines, and Tree of Life.",
                0, 0, 40, SKILLTYPE.UTILITY
                ),
    HEALING_TOTEM("Healing Totem",
                  "Create a Totem that will heal any teammate within a small radius by 300 health every 3 seconds for a total of 900 health. However, the totem can be destroyed by Seismic Wave, Golemfall, Bull Charge, or four melee hits",
                  0, 0, 40, SKILLTYPE.SUPPORT
                  ),
    SHIELD_WALL("Shield Wall",
                "Create a wall of pure energy around yourself, blocking 65% of all damage except Poison for 12 seconds. You do not need to stand in the same place to be under its effect.",
                0, 0, -1, SKILLTYPE.ULTIMATE
                ),
    SNOWBALL("Snowball",
            "Launch a ball of packed snow at your opponent, dealing 55 damage with a 20% chance of applying the Slowness effect for 2 seconds.",
            120, 20, 0, SKILLTYPE.OFFENSE
            ),
    BARRICADE("Barricade",
            "Surround yourself in a tough wall that cannot be broken through normal melee. However, Bull Charge, Golemfall or Seismic Wave will destroy it. It lasts for 6 seconds before fading away.",
            600, 0, 30, SKILLTYPE.UTILITY
            ),
    HOLY_WATER("Holy Water",
            "Bring forth a burst of healing water, which will heal you for 300 health and nearby teammates for 50 health. It also cures all debuffs like Slowing, Immobilization, Stun, Poison, or Morph.",
            600, 0, 30, SKILLTYPE.SUPPORT
            ),
    ROCKET_CHICKEN("Rocket Chicken",
            "Shoot a flying chicken that will explode dealing 80 damage to all enemies within a radius of 3 blocks. It will only explode on impact with an actual block.",
            1000, 30, 0, SKILLTYPE.OFFENSE
            ),
    LIGHTNING_STRIKE("Lightning Strike",
                    "Call down a powerful bolt of lightning upon your opponent, dealing 165 damage with a 40% chance of immobilization for one second.",
                    1200, 70, 0, SKILLTYPE.OFFENSE
                    ),
    BOULDER_TOSS("Boulder Toss",
            "Heave a boulder at your opponent, dealing 225 damage to anyone within a radius of 5. If anyone is caught directly in the blast they will suffer immobilization for two seconds.",
            2400, 80, 0, SKILLTYPE.OFFENSE
            ),
    BONE_SHIELD("Bone Shield",
                "Surround yourself in a circle of bones, protecting you from any 5 sources of damage other than from Poison. Those 5 sources of damage will instead heal you for 30 health, for a total of 150 health.",
                2400, 0, 25, SKILLTYPE.SUPPORT
                ),
    BERSERK("Berserk",
            "Double your MELEE damage and increase your speed to Speed II for 15 seconds.",
            1200, 0, -1, SKILLTYPE.ULTIMATE
            ),
    SHADOW_STEP("Shadow Step",
            "Fade into the shadows and instantly reappear behind your selected target, giving you a chance to get a free hit with your chosen skill. Your speed will also be risen to Speed III for 2 seconds.",
            3600, 0, 30, SKILLTYPE.UTILITY
            ),
    WALL_OF_VINES("Wall of Vines",
                "Create a mossy stone wall covered in entangling vines that will stay up for 4 seconds. If any enemy strays too close, the vines will immobilize them for 2 seconds.",
                3600, 0, 30, SKILLTYPE.UTILITY
                )
    ;

    private String name, description;
    private int cost, energyCost, cooldown;
    private SKILLTYPE skillType;


    SKILL(String name, String description, int cost, int energyCost, int cooldown, SKILLTYPE skillType){
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.energyCost = energyCost;
        this.skillType = skillType;
        this.cooldown = cooldown;
    }


    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(SKILL item: SKILL.values()){
            list.add(item.name());
        }
        return list;
    }


    private enum SKILLTYPE{
        OFFENSE,
        UTILITY,
        SUPPORT,
        ULTIMATE;
    }
}
