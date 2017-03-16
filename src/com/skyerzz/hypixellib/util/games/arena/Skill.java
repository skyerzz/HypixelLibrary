package com.skyerzz.hypixellib.util.games.arena;


import java.util.ArrayList;

/**
 * Created by Skyerzz-LAPOTOP on 27/02/2017.
 */
public enum SKILL {
    //<editor-fold desc="[OFFENSIVE]">
    BOULDER_TOSS("Boulder Toss",
            "Launch a large boulder that will shatter after colliding with the ground, dealing 225 damage to enemies nearby. Launching a boulder directly under a player's feet will immobilize them for 2 seconds.",
            2400, 80, 0, SKILLTYPE.OFFENSE
    ),
    SHOTGUN("Cookie Shotgun",
                "Fire 7 cookies in a cone in front of you that each deal 27 damage.",
            12000, 60, 0, SKILLTYPE.OFFENSE
    ),
    FALCON_PUNCH("Falcon Punch",
            "Charging your fists will immobilize you for 1 second. Charged fists can break any structure with a single hit, or will deal 260 damage on your next melee hit.",
            25000, 100, 0, SKILLTYPE.OFFENSE
    ),
    FIREBALL("Fireball",
            "Launch an explosive ball of molten rock that will explode in a radius of 4, hurting the opponent for 95 damage. If they are caught directly in the blast, they will suffer an additional 10 damage.",
             0, 40, 0, SKILLTYPE.OFFENSE
    ),
    FLAME_BREATH("Flame Breath",
                "Breathe fire in a cone in front of you, dealing 130 damage instantly and setting the air on fire for 2 seconds. Enemy players standing inside the fire will take 20 damage per second.",
            25000, 60, 0, SKILLTYPE.OFFENSE
    ),
    FREEZING_BREATH("Freezing Breath",
                    "Breathe cold air in a cone in front of you, dealing 200 damage instantly. If an enemy is hit by the breath, they will be slowed for 2 seconds.",
            25000, 90, 0, SKILLTYPE.OFFENSE
    ),
    ROCKET_PIG("Guided Pig",
            "Shoot a pig that will explode, dealing 265 damage to all nearby enemies. Your rotation influences the flight.",
            -1, 100, 0, SKILLTYPE.OFFENSE
    ),
    LIGHTNING_STRIKE("Lightning Strike",
            "Call down a powerful bolt of lightning upon your opponent, dealing 165 damage with a 40% chance of immobilization for one second.",
            1200, 70, 0, SKILLTYPE.OFFENSE
    ),
    MELON_LAUNCHER("Melon Launcher",
            "Launch an explosive melon that deals 140 damage. After exploding, 3 small pieces of melon will fall to the ground and explode for 10 damage each.",
            9000, 60, 0, SKILLTYPE.OFFENSE
    ),
    PUMPKIN_LAUNCHER("Pumpkin Launcher",
            "Launch an explosive pumpkin that deals 70 damage. After exploding, 3 small pieces of pie will fall to the ground and explode for 5 damage each.",
            -1, 30, 0, SKILLTYPE.OFFENSE
    ),
    PROXIMITY_MINE("Proximity Mine",
            "If an enemy steps on it, it will explode dealing 350 damage and detonating all nearby mines. Only 2 mines can be active at a time. Disappears after 2 seconds.",
            12000, 100, 0, SKILLTYPE.OFFENSE
    ),
    ROCKET_CHICKEN("Rocket Chicken",
            "Shoot a flying chicken that will explode dealing 80 damage to all enemies within a radius of 3 blocks. It will only explode on impact with an actual block.",
            1000, 30, 0, SKILLTYPE.OFFENSE
    ),
    SEISMIC_WAVE("Seismic Wave",
            "An unstoppable seismic wave emerges from your feet and goes in a straight line in front of you, destroying player-made structures. Any enemy player caught in its path will take 225 damage and will be knocked back into the air.",
            12000, 90, 0, SKILLTYPE.OFFENSE
    ),
    SNOWBALL("Snowball",
            "Launch a ball of packed snow at your opponent, dealing 55 damage with a 20% chance of applying the Slowness effect for 2 seconds.",
            120, 20, 0, SKILLTYPE.OFFENSE
    ),
    FLAME_SWORD("Flame Sword",
            "Enchant your weapon with the power of Fire, dealing 400% of melee damage for the next 6 seconds. During this time, energy regen will be halted.",
            -1, 100, 0, SKILLTYPE.OFFENSE
    ),
    ANCIENT_BREATH("Ancient Breath",
            "Call the voice of your ancestors, dealing 175 damage instantly. If an enemy is hit by the breath, they have a 50% chance to be immobilized for 1 seconds.", //fixonline seconds > second
            -1, 80, 0, SKILLTYPE.OFFENSE
    ),

    //</editor-fold>

    //<editor-fold desc="[SUPPORT]">
    BONE_SHIELD("Bone Shield",
            "Surround yourself with bones that will protect you from the next 5 sources of damage, lasting a maximum of 20 seconds. Each time damage is taken, a bone is destroyed and 30 health is restored.",
            2400, 0, 25, SKILLTYPE.SUPPORT
    ),
    CACTUS_SHIELD("Cactus Shield",
            "Surround yourself with cacti that will protect you from the next 4 sources of damage, lasting a maximum of 15 seconds. Each time damage is taken, a cacti is destroyed and 50 damage is dealt to your attacker.", //fixonline a cacti > a cactus
            -1, 0, 25, SKILLTYPE.SUPPORT
    ),
    HEALING_TOTEM("Healing Totem",
            "Place a totem at your feet that will heal any nearby ally for 300 health every 3 seconds, lasting for 9 seconds. the totem can be destroyed by melee hits. Each heal also removes all debuffs.",
            0, 0, 40, SKILLTYPE.SUPPORT
    ),
    HOLY_WATER("Holy Water",
            "Create an explosion of holy water around you that will restore 300 health to you and 50 health to nearby allies, removing all debuffs. This skill can be used while stunned.",
            600, 0, 30, SKILLTYPE.SUPPORT
    ),
    LIFE_LEECH("Life Leech",
            "Your next 7 melee hits against an enemy player will restore 100 health each, lasting 6 seconds.",
            12000, 0, 30, SKILLTYPE.SUPPORT
    ),
    SONG_OF_POWER("Song of Power",
            "Plays a rousing melody that will grant immunity to debuffs and increased offensive skill regen for 8 seconds, curing any ally affected by a debuff and allowing unlimited sprinting.",
            4500, 0, 50, SKILLTYPE.SUPPORT
    ),
    STAR_SHIELD("Star Shield",
            "Surround yourself with stars that will protect you from the next 3 sources of damage, lasting a maximum of 30 seconds. Each time damage is taken, a star is destroyed, a random crows control effect is applied to the damager lasting 4 seconds, and 50 health is restored.",
            -1, 0, 33, SKILLTYPE.SUPPORT
    ),
    TREE_OF_LIFE("Tree of Life",
            "Plant a tree on the ground that will heal all nearby allies for 50 health per second while it grows. Once fully grown, the tree will let out a final burst of healing for 400 health. Can be destroyed by melee hits.",
            12000, 0, 40, SKILLTYPE.SUPPORT
    ),
    SPIRIT_LINK("Spirit Link",
            "Links your spirit to a teammate, healing you every 0.5 seconds for 9% of the health difference when activated. Lasts 3 seconds.",
            12000, 0, 30, SKILLTYPE.SUPPORT
    ),
    VAMPIRIC_CHAIN("Vampiric Chain",
            "Tethers you to an enemy within 8 blocks. The tether will heal you for 70% the amount of damage dealt to the targeted enemy. If the enemy escapes, the chains will be severed. Lasts 12 seconds.",
            -1, 0, 30, SKILLTYPE.SUPPORT
    ),
    TIME_WARP("Time Warp",
            "Activate to select a location on the ground. After 5 seconds, you will warp back to that location and restore 15% of your health.",
            35000, 0, 25, SKILLTYPE.SUPPORT
    ),

    //</editor-fold>


    //<editor-fold desc="[UTILITY]">
    BARRICADE("Barricade",
            "Surround yourself with a barricade that lasts for 5 seconds. The barricade can be destroyed by some skills.",
            600, 0, 30, SKILLTYPE.UTILITY
    ),
    CHARGE("Bull Charge",
            "Transform into a cow while you charge forward. Colliding with a player-made structure will destroy it.",
            0, 0, 40, SKILLTYPE.UTILITY
    ),
    GOLEMFALL("Golemfall",
            "Drops a golem where you target, destroying structures and knocking back players",
            12000, 0, 40, SKILLTYPE.UTILITY
    ),
    POLYMORPH("Petrify",
            "Transform the targeted enemy player into stone for 5 seconds. While immobilized, the player will be unable to attack but will slowly regenerate health. The skill is cancelled if the player takes 30 damage.",
            12000, 0, 40, SKILLTYPE.UTILITY
    ),
    SHADOW_STEP("Shadow Step",
            "Step through the shadows and appear behind an enemy target. Your movement speed will be increased for 2 seconds afterwards.",
            3600, 0, 30, SKILLTYPE.UTILITY
    ),
    SWAP("Swap",
            "Switch places with an enemy or teammate. Before the switch occurs, you will both be stunned for 2 seconds.",
            12000, 0, 30, SKILLTYPE.UTILITY
    ),
    WALL_OF_VINES("Wall of Vines",
            "Create a wall covered in vines in front of you that lasts for 4 seconds. If an enemy gets too close to the wall, they will be immobilized for 2 seconds.",
            3600, 0, 30, SKILLTYPE.UTILITY
    ),
    MAGNETIC_IMPULSE("Magnetic Impulse",
            "A strong magnetic force draws all nearby players to you. They are then immobilized for 2.5 seconds.",
            16000, 0, 42, SKILLTYPE.UTILITY
    ),

    //</editor-fold>

    //<editor-fold desc="[ULTIMATE]">
    SHIELD_WALL("Shield Wall",
                "Reduces damage taken by 65% for 12 seconds.",
                0, 0, -1, SKILLTYPE.ULTIMATE
    ),
    BERSEK("Berserk",
            "Doubles your melee damage and increases movement speed by 30% for 15 seconds.",
            1200, 0, -1, SKILLTYPE.ULTIMATE
    ), //typo SOMEONE MISTTYPED THIS SMH
    REFLECT_DAMAGE("Reflect Damage",
            "Reduces damage taken by 50% for 8 seconds and reflects 50% damage back to your attacker for the duration.",
            25000, 0, -1, SKILLTYPE.ULTIMATE
    ),
    ARACHNID("Broodmother",
            "Summons a large spider that will chase down and poison the targeted enemy player, dealing 180 damage over 6 seconds. When slain, the Broodmother spawns 3 spiderlings that deal 5 damage each per attack.",
            25000, 0, -1, SKILLTYPE.ULTIMATE
    ),
    DOOM_SHROOM("Doom Shroom",
            "Plant a giant mushroom that will damage all enemies within 15 blocks for 20 damage per second while it grows. ONce grown, the mushroom will let out a final burst of 400 damage and destory sall structures. Can be destyroyed by melee hits.",
            35000, 0, -1, SKILLTYPE.ULTIMATE
    ),

    //Outdated/ Never implemented skills (looking at you noxy!)
    STEALTH("OUTDATED- Stealth", "OUTDATED- N/A", -1, -1, -1, null),
    DEATH_GRIP("OUTDATED- Death Grip", "OUTDATED- N/A", -1, -1, -1, null),
    BULL_CHARGE("OUTDATED- value now just CHARGE", "see CHARGE", -1, -1, -1, null),
    ICE_LANCE("OUTDATED- Ice lance", "OUTDATED- N/A", -1, -1, -1, null),
    BURNING_ARROWS("OUTDATED- Burning Arrows", "OUTDATED- N/A", -1, -1, -1, null),
    SHOCK_MINE("OUTDATED- value PROXIMITY_MINE", "see PROXIMITY_MINE", -1, -1, -1, null);

    //</editor-fold>


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

    public String getName(){
        return this.name;
    }

    public String getDescription(){
        return this.description;
    }

    /**
     * A cost of -1 means its unlocked by default.
     * @return cost
     */
    public int getCost(){
        return cost;
    }

    public int getEnergyCost(){
        return energyCost;
    }

    /**
     * a cooldown of -1 means it can only be used once (ultimates)
     * a cooldown of 0 means its an offensive skill and requires energy
     * @return cooldown
     */
    public int getCooldown(){
        return cooldown;
    }

    public SKILLTYPE getSkillType(){
        return skillType;
    }


    private enum SKILLTYPE{
        OFFENSE,
        UTILITY,
        SUPPORT,
        ULTIMATE;
    }
}
