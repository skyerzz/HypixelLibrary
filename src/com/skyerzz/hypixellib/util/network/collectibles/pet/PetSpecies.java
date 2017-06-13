package com.skyerzz.hypixellib.util.network.collectibles.pet;

import com.skyerzz.hypixellib.util.minecraft.MobType;
import com.skyerzz.hypixellib.util.network.Rank;
import com.skyerzz.hypixellib.util.network.collectibles.mysteryvault.MysteryBoxType;
import com.skyerzz.hypixellib.util.network.collectibles.mysteryvault.Rarity;

import java.util.ArrayList;

/**
 * Created by Skyerzz-LAPOTOP on 17/03/2017.
 */
public enum PetSpecies {
    SILVERFISH("Silverfish", 12, MobType.SILVERFISH, Rank.NONE, Rarity.COMMON),

    CAT_BLACK("Cat: Black", 12, MobType.CAT, Rank.NONE, Rarity.COMMON),
    CAT_RED("Cat: Red", 12, MobType.CAT, Rank.NONE, Rarity.COMMON),
    CAT_SIAMESE("Cat: Siamese", 12, MobType.CAT, Rank.NONE, Rarity.COMMON),
    CAT_BLACK_BABY("Cat: Black (Baby)", 30, MobType.CAT, Rank.NONE, Rarity.RARE),
    CAT_RED_BABY("Cat: Red (Baby)", 30, MobType.CAT, Rank.NONE, Rarity.RARE),
    CAT_SIAMESE_BABY("Cat: Siamese (Baby)", 30, MobType.CAT, Rank.NONE, Rarity.RARE),
    WILD_OCELOT("Wild Ocelot", 0, MobType.CAT, Rank.VIP_PLUS, null),
    WILD_OCELOT_BABY("Wild Ocelot (Baby)", 0, MobType.CAT, Rank.VIP_PLUS, null), //fixonline order of cats in menu :/

    CHICKEN("Chicken", 10, MobType.CHICKEN, Rank.NONE, Rarity.COMMON),
    CHICKEN_BABY("Chicken (Baby)", 30, MobType.CHICKEN, Rank.NONE, Rarity.RARE),

    WOLF("Wolf", 10, MobType.WOLF, Rank.NONE, Rarity.COMMON),
    WOLF_BABY("Wolf (Baby)", 30, MobType.WOLF, Rank.NONE, Rarity.RARE),

    ZOMBIE("Zombie", 12, MobType.ZOMBIE, Rank.NONE, Rarity.COMMON),
    ZOMBIE_BABY("Zombie (Baby)", 30, MobType.ZOMBIE, Rank.NONE, Rarity.RARE),

    BAT("Bat", 37, MobType.BAT, Rank.NONE, Rarity.EPIC),

    SPIDER("Spider", 42, MobType.SPIDER, Rank.NONE, Rarity.EPIC),
    CAVE_SPIDER("Cave Spider", 27, MobType.CAVE_SPIDER, Rank.NONE, Rarity.RARE),

    RABBIT_BLACK("Rabbit: Black", 22, MobType.RABBIT, Rank.NONE, Rarity.RARE),
    RABBIT_BLACK_AND_WHITE("Rabbit: Black & White", 45, MobType.RABBIT, Rank.NONE, Rarity.EPIC),
    RABBIT_BROWN("Rabbit: Brown", 22, MobType.RABBIT, Rank.NONE, Rarity.RARE),
    RABBIT_GOLD("Rabbit: Gold", 45, MobType.RABBIT, Rank.NONE, Rarity.EPIC),
    RABBIT_SALT_AND_PEPPER("Rabbit: Salt & Pepper", 45, MobType.RABBIT, Rank.NONE, Rarity.EPIC),
    RABBIT_WHITE("Rabbit: White", 22, MobType.RABBIT, Rank.NONE, Rarity.RARE),

    VILLAGER_BLACKSMITH("Villager: Blacksmith", 22, MobType.VILLAGER, Rank.NONE, Rarity.RARE),
    VILLAGER_BLACKSMITH_BABY("Villager: Blacksmith (Baby)", 55, MobType.VILLAGER, Rank.NONE, Rarity.EPIC),
    VILLAGER_BUTCHER("Villager: Butcher", 22, MobType.VILLAGER, Rank.NONE, Rarity.RARE),
    VILLAGER_BUTCHER_BABY("Villager: Butcher (Baby)", 55, MobType.VILLAGER, Rank.NONE, Rarity.EPIC),
    VILLAGER_FARMER("Villager: Farmer", 22, MobType.VILLAGER, Rank.NONE, Rarity.RARE),
    VILLAGER_FARMER_BABY("Villager: Farmer (Baby)", 55, MobType.VILLAGER, Rank.NONE, Rarity.EPIC),
    VILLAGER_LIBRARIAN("Villager: Librarian", 22, MobType.VILLAGER, Rank.NONE, Rarity.RARE),
    VILLAGER_LIBRARIAN_BABY("Villager: Librarian (Baby)", 55, MobType.VILLAGER, Rank.NONE, Rarity.EPIC),
    VILLAGER_PRIEST("Villager: Priest", 22, MobType.VILLAGER, Rank.NONE, Rarity.RARE),
    VILLAGER_PRIEST_BABY("Villager: Priest (Baby)", 55, MobType.VILLAGER, Rank.NONE, Rarity.EPIC),
    VILLAGER_ZOMBIE("Villager: Zombie", 52, MobType.ZOMBIE, Rank.NONE, Rarity.EPIC),
    WITCH("Witch", -1, MobType.WITCH, Rank.NONE, Rarity.EPIC, MysteryBoxType.HALLOWEEN),

    RED_LITTLE_HELPER("Red Little Helper", -1, null, Rank.NONE, Rarity.EPIC, MysteryBoxType.CHRISTMAS),
    GREEN_LITTLE_HELPER("Green Little Helper", -1, null, Rank.NONE, Rarity.EPIC, MysteryBoxType.CHRISTMAS),
    SNOWMAN("Snowman", -1, null, Rank.NONE, Rarity.EPIC, MysteryBoxType.CHRISTMAS),

    IRON_GOLEM("Golem", 200, MobType.GOLEM, Rank.NONE, Rarity.LEGENDARY),
    ENDERMAN("Enderman", 150, MobType.ENDERMAN, Rank.NONE, Rarity.LEGENDARY),
    BLAZE("Blaze", -1, MobType.BLAZE, null, Rarity.LEGENDARY),
    HEROBRINE("Herobrine", -1, MobType.HUMANENTITY, Rank.NONE, Rarity.LEGENDARY, MysteryBoxType.CRAFTED_MYSTERY_BOX_ONE),
    ENDERMITE("Endermite", -1, MobType.ENDERMITE, Rank.NONE, Rarity.LEGENDARY, MysteryBoxType.CRAFTED_MYSTERY_BOX_TWO),

    COW("Cow", 10, MobType.COW, Rank.NONE, Rarity.COMMON),
    COW_BABY("Cow (Baby)", 30, MobType.COW, Rank.NONE, Rarity.RARE),
    MOOSHROOM("Mooshroom", 50, MobType.MOOSHROOM, Rank.NONE, Rarity.EPIC),
    MOOSHROOM_BABY("Mooshroom (Baby)", 90, MobType.MOOSHROOM, Rank.NONE, Rarity.LEGENDARY),

    CREEPER("Creeper", 52, MobType.CREEPER, Rank.NONE, Rarity.EPIC),
    POWERED_CREEPER("Powered Creeper", -1, MobType.CREEPER, Rank.NONE, Rarity.LEGENDARY, MysteryBoxType.CRAFTED_MYSTERY_BOX_ONE),

    HORSE_BLACK("Horse: Black", 42, MobType.HORSE, Rank.NONE, Rarity.EPIC),
    HORSE_BROWN("Horse: Brown", 15, MobType.HORSE, Rank.NONE, Rarity.COMMON),
    HORSE_CHESTNUT("Horse: Chestnut", 25, MobType.HORSE, Rank.NONE, Rarity.RARE),
    HORSE_CREAMY("Horse: Creamy", 25, MobType.HORSE, Rank.NONE, Rarity.RARE),
    HORSE_DARK_BROWN("Horse: Dark Brown", 25, MobType.HORSE, Rank.NONE, Rarity.RARE),
    HORSE_GRAY("Horse: Gray", 25, MobType.HORSE, Rank.NONE, Rarity.RARE),
    HORSE_WHITE("Horse: White", 42, MobType.HORSE, Rank.NONE, Rarity.EPIC),
    HORSE_BROWN_BABY("Horse: Brown (Baby)", 30, MobType.HORSE, Rank.NONE, Rarity.RARE),
    HORSE_CHESTNUT_BABY("Horse: Chestnut (Baby)", 55, MobType.HORSE, Rank.NONE, Rarity.EPIC),
    HORSE_CREAMY_BABY("Horse: Creamy (Baby)", 55, MobType.HORSE, Rank.NONE, Rarity.EPIC),
    HORSE_DARK_BROWN_BABY("Horse: Dark Brown (Baby)", 55, MobType.HORSE, Rank.NONE, Rarity.EPIC),
    HORSE_GRAY_BABY("Horse: Gray (Baby)", 55, MobType.HORSE, Rank.NONE, Rarity.EPIC),
    UNDEAD_HORSE("Undead Horse", 63, MobType.HORSE, Rank.NONE, Rarity.EPIC),
    SKELETON_HORSE("Skeleton Horse", -1, MobType.HORSE, Rank.NONE, Rarity.LEGENDARY, MysteryBoxType.HALLOWEEN),

    PIG("Pig", 10, MobType.PIG, Rank.NONE, Rarity.COMMON),
    PIG_BABY("Pig (Baby)", 30, MobType.PIG, Rank.NONE, Rarity.RARE),
    PIG_ZOMBIE("Pig Zombie", 50, MobType.ZOMBIE_PIGMAN, Rank.NONE, Rarity.EPIC),
    PIG_ZOMBIE_BABY("Pig Zombie (Baby)", 85, MobType.ZOMBIE_PIGMAN, Rank.NONE, Rarity.LEGENDARY),

    SHEEP_BLACK("Sheep: Black", 40, MobType.SHEEP, Rank.NONE, Rarity.EPIC),
    SHEEP_BLACK_BABY("Sheep: Black (Baby)", 75, MobType.SHEEP, Rank.NONE, Rarity.LEGENDARY),
    SHEEP_BLUE("Sheep: Blue", 20, MobType.SHEEP, Rank.NONE, Rarity.RARE),
    SHEEP_BLUE_BABY("Sheep: Blue (Baby)", 55, MobType.SHEEP, Rank.NONE, Rarity.EPIC),
    SHEEP_BROWN("Sheep: Brown", 12, MobType.SHEEP, Rank.NONE, Rarity.COMMON),
    SHEEP_BROWN_BABY("Sheep: Brown (Baby)", 30, MobType.SHEEP, Rank.NONE, Rarity.RARE),
    SHEEP_CYAN("Sheep: Cyan", 20, MobType.SHEEP, Rank.NONE, Rarity.RARE),
    SHEEP_CYAN_BABY("Sheep: Cyan (Baby)", 55, MobType.SHEEP, Rank.NONE, Rarity.EPIC),
    SHEEP_GRAY("Sheep: Gray", 12, MobType.SHEEP, Rank.NONE, Rarity.COMMON),
    SHEEP_GRAY_BABY("Sheep: Gray (Baby)", 30, MobType.SHEEP, Rank.NONE, Rarity.RARE),
    SHEEP_GREEN("Sheep: Green", 20, MobType.SHEEP, Rank.NONE, Rarity.RARE),
    SHEEP_GREEN_BABY("Sheep: Green (Baby)", 55, MobType.SHEEP, Rank.NONE, Rarity.EPIC),
    SHEEP_LIGHT_BLUE("Sheep: Light Blue", 20, MobType.SHEEP, Rank.NONE, Rarity.RARE),
    SHEEP_LIGHT_BLUE_BABY("Sheep: Light Blue (Baby)", 55, MobType.SHEEP, Rank.NONE, Rarity.EPIC),
    SHEEP_LIME("Sheep: Lime", 20, MobType.SHEEP, Rank.NONE, Rarity.RARE),
    SHEEP_LIME_BABY("Sheep: Lime (Baby)", 55, MobType.SHEEP, Rank.NONE, Rarity.EPIC),
    SHEEP_MAGENTA("Sheep: Magenta", 20, MobType.SHEEP, Rank.NONE, Rarity.RARE),
    SHEEP_MAGENTA_BABY("Sheep: Magenta (Baby)", 55, MobType.SHEEP, Rank.NONE, Rarity.EPIC),
    SHEEP_ORANGE("Sheep: Orange", 20, MobType.SHEEP, Rank.NONE, Rarity.RARE),
    SHEEP_ORANGE_BABY("Sheep: Orange (Baby)", 55, MobType.SHEEP, Rank.NONE, Rarity.EPIC),
    SHEEP_PINK("Sheep: Pink", 55, MobType.SHEEP, Rank.NONE, Rarity.EPIC),
    SHEEP_PINK_BABY("Sheep: Pink (Baby)", 75, MobType.SHEEP, Rank.NONE, Rarity.LEGENDARY),
    SHEEP_PURPLE("Sheep: Purple", 20, MobType.SHEEP, Rank.NONE, Rarity.RARE),
    SHEEP_PURPLE_BABY("Sheep: Purple (BabY)", 55, MobType.SHEEP, Rank.NONE, Rarity.EPIC),
    SHEEP_RED("Sheep: Red", 20, MobType.SHEEP, Rank.NONE, Rarity.RARE),
    SHEEP_RED_BABY("Sheep: Red (Baby)", 55, MobType.SHEEP, Rank.NONE, Rarity.EPIC),
    SHEEP_SILVER("Sheep: Silver", 12, MobType.SHEEP, Rank.NONE, Rarity.COMMON),
    SHEEP_SILVER_BABY("Sheep: Silver (Baby)", 30, MobType.SHEEP, Rank.NONE, Rarity.RARE),
    SHEEP_WHITE("Sheep: White", 12, MobType.SHEEP, Rank.NONE, Rarity.COMMON),
    SHEEP_WHITE_BABY("Sheep: White (Baby)", 30, MobType.SHEEP, Rank.NONE, Rarity.RARE),
    SHEEP_YELLOW("Sheep: Yellow", 20, MobType.SHEEP, Rank.NONE, Rarity.RARE),
    SHEEP_YELLOW_BABY("Sheep: Yellow (Baby)", 55, MobType.SHEEP, Rank.NONE, Rarity.EPIC),
    SHEEP_RAINBOW("Sheep: Rainbow", -1, MobType.SHEEP, Rank.NONE, Rarity.LEGENDARY, MysteryBoxType.SUMMER),

    SLIME_BIG("Slime (Big)", 100, MobType.SLIME, Rank.NONE, Rarity.LEGENDARY),
    SLIME_SMALL("Slime (Small)", 63, MobType.SLIME, Rank.NONE, Rarity.EPIC),
    SLIME_TINY("Slime (Tiny)", 30, MobType.SLIME, Rank.NONE, Rarity.RARE),
    MAGMA_CUBE_BIG("Magma Cube (Big)", 115, MobType.MAGMA_CUBE, Rank.NONE, Rarity.LEGENDARY), //fixonline cost wrong?
    MAGMA_CUBE_SMALL("Magma Cube (Small)", 63, MobType.MAGMA_CUBE, Rank.NONE, Rarity.EPIC),
    MAGMA_CUBE_TINY("Magma Cube (Tiny)", 30, MobType.MAGMA_CUBE, Rank.NONE, Rarity.EPIC), //fixonline cost or rarity wrong

    SKELETON("Skeleton", 50, MobType.SKELETON, Rank.NONE, Rarity.EPIC),
    WITHER_SKELETON("Wither Skeleton", -1, MobType.WITHER_SKELETON, null, Rarity.LEGENDARY),

    SQUID("Squid", -1, MobType.SQUID, null, null);


    private String displayName;
    private int mysteryDust;
    private MobType mobType;
    private Rank rankRequirement;
    private Rarity rarity;
    private MysteryBoxType type;

    PetSpecies(String displayName, int mysteryDust, MobType mobType, Rank rankRequirement, Rarity rarity){
        this(displayName, mysteryDust, mobType, rankRequirement, rarity, null);

    }

    PetSpecies(String displayName, int mysteryDust, MobType mobType, Rank rankRequirement, Rarity rarity, MysteryBoxType type){
        this.displayName = displayName;
        this.mysteryDust = mysteryDust;
        this.mobType = mobType;
        this.rankRequirement = rankRequirement;
        this.rarity = rarity;
        this.type = type;
    }


    public static final ArrayList<String> mapping = initializeMapping();

    private static ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(PetSpecies item: PetSpecies.values()){
            list.add(item.name());
        }
        return list;
    }

    public String getDisplayName(){
        return displayName;
    }

    public int getMysteryDust(){
        return mysteryDust;
    }

    public MobType getMobType(){
        return mobType;
    }

    public Rank getRankRequirement(){
        return rankRequirement;
    }

    public Rarity getRarity(){
        return rarity;
    }

    public String getLore(){
        return "Make this awesome and cuddly " + getDisplayName() + " yours today!";
    }
}
