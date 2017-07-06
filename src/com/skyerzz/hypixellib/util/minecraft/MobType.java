package com.skyerzz.hypixellib.util.minecraft;

/**
 * Created by sky on 13-6-2017.
 */
public enum MobType {
    HUMANENTITY(null, false, true),

    ZOMBIE("Zombie", false, true),
    ZOMBIE_PIGMAN("Zombie Pigman", false, true),
    SKELETON("Skeleton", false, true),
    WITHER_SKELETON("Wither Skeleton", false, true),
    ENDERMAN("Enderman", true, true),
    SILVERFISH("Silverfish", false, true),
    ENDERMITE("Endermite", false, true),
    SPIDER("Spider", false, true),
    CAVE_SPIDER("Cave Spider", false, true),
    WITCH("Witch", false, true),
    BLAZE("Blaze", false, true),
    CREEPER("Creeper", false, true),
    SLIME("Slime", false, true),
    MAGMA_CUBE("Magma Cube", false, true),
    GUARDIAN("Guardian", false, true),

    SHEEP("Sheep", true, false),
    SQUID("Squid", true, false),
    COW("Cow", true, false),
    MOOSHROOM("Mooshroom", true, false),
    RABBIT("Rabbit", true, false),
    PIG("Pig", true, false),
    CHICKEN("Chicken", true, false),
    CAT("cat", true, false),
    WOLF("Wolf", true, false),
    HORSE("Horse", true, false),
    DONKEY("Donkey", true, false),
    MULE("Mule", true, false),
    VILLAGER("Villager", true, false),
    BAT("Bat", true, false),
    GOLEM("Golem", true, true),
    SNOWMAN("Snowman", true, false);

    private String displayName;
    private boolean isPassive, canAttack;

    MobType(String displayName, boolean isPassive, boolean canAttack){
        this.displayName = displayName;
        this.isPassive = isPassive;
        this.canAttack = canAttack;
    }

    public String getDisplayName(){
        return displayName;
    }

    public boolean isPassive(){
        return isPassive;
    }

    public boolean canAttack(){
        return canAttack;
    }

}
