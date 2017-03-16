package com.skyerzz.hypixellib.util.items.all;


import java.util.ArrayList;

/**
 * Created by sky on 8-9-2016.
 */
public class Item {

    private String customName = null, color = null;
    private Material material;
    private int durability;
    private ArrayList<Enchantment> enchantments = new ArrayList<>();
    private ArrayList<Effect> effects = new ArrayList<>();

    public Item(Material material){
        this(null, material, -1);
    }

    public Item(String name, Material material){
        this(name, material, -1);
    }

    public Item(Material material, int durability){
        this(null, material, durability);
    }

    public Item(String name, Material material, int durability){
        this.customName = name;
        this.material = material;
        this.durability = durability;
    }

    public String getItemName(){
        if(customName==null){
            return material.toString(); //todo this probably doesnt work. create own material list?
        }
        return customName;
    }

    public Item setColor(String color){
        this.color = color;
        return this;
    }

    public String getColor(){ return this.color; }

    public ArrayList<Enchantment> getEnchantments(){ return enchantments;}

    public Item addEnchantment(Enchantment ench){
        enchantments.add(ench);
        return this;
    }

    public ArrayList<Effect> getEffects(){ return effects; }

    public Item addEffect(Effect eff){
        effects.add(eff);
        return this;
    }


    //<editor-fold desc="[Predefined Items]">

    //<editor-fold desc="[General Items]">

    //<editor-fold desc="[Armor]">

    //<editor-fold desc="[Leather Armor]">
    public static ItemStack leatherHelmet = new ItemStack(new Item(Material.LEATHER_HELMET), 1);
    public static ItemStack leatherChest = new ItemStack(new Item(Material.LEATHER_CHESTPLATE), 1);
    public static ItemStack leatherLeggings = new ItemStack(new Item(Material.LEATHER_LEGGINGS), 1);
    public static ItemStack leatherBoots = new ItemStack(new Item(Material.LEATHER_BOOTS), 1);
    public static ItemStack darkGrayLeatherHelmet = new ItemStack(new Item(Material.LEATHER_HELMET).setColor("d0d0d0"), 1); //todo check colors
    public static ItemStack darkGrayLeatherChest = new ItemStack(new Item(Material.LEATHER_CHESTPLATE).setColor("d0d0d0"), 1);
    public static ItemStack darkGrayLeatherLeggings = new ItemStack(new Item(Material.LEATHER_LEGGINGS).setColor("d0d0d0"), 1);
    public static ItemStack darkGrayLeatherBoots = new ItemStack(new Item(Material.LEATHER_BOOTS).setColor("d0d0d0"), 1);
    public static ItemStack orangeLeatherHelmet = new ItemStack(new Item(Material.LEATHER_HELMET).setColor("d0d0d0"), 1); //todo check colors
    public static ItemStack orangeLeatherChest = new ItemStack(new Item(Material.LEATHER_CHESTPLATE).setColor("d0d0d0"), 1);
    public static ItemStack orangeLeatherLeggings = new ItemStack(new Item(Material.LEATHER_LEGGINGS).setColor("d0d0d0"), 1);
    public static ItemStack orangeLeatherBoots = new ItemStack(new Item(Material.LEATHER_BOOTS).setColor("d0d0d0"), 1);
    public static ItemStack greenLeatherLeggings = new ItemStack(new Item(Material.LEATHER_LEGGINGS).setColor("d0d0d0"), 1);
    public static ItemStack greenLeatherChest = new ItemStack(new Item(Material.LEATHER_CHESTPLATE).setColor("d0d0d0"), 1);
    public static ItemStack greenLeatherHelmet = new ItemStack(new Item(Material.LEATHER_HELMET).setColor("d0d0d0"), 1);
    public static ItemStack yellowLeatherHelmet = new ItemStack(new Item(Material.LEATHER_HELMET).setColor("d0d0d0"), 1); //todo check colors
    public static ItemStack yellowLeatherChest = new ItemStack(new Item(Material.LEATHER_CHESTPLATE).setColor("d0d0d0"), 1);
    public static ItemStack yellowLeatherLeggings = new ItemStack(new Item(Material.LEATHER_LEGGINGS).setColor("d0d0d0"), 1);
    public static ItemStack yellowLeatherBoots = new ItemStack(new Item(Material.LEATHER_BOOTS).setColor("d0d0d0"), 1);
    public static ItemStack blackLeatherHelmet = new ItemStack(new Item(Material.LEATHER_HELMET).setColor("d0d0d0"), 1); //todo check colors
    public static ItemStack blackLeatherChest = new ItemStack(new Item(Material.LEATHER_CHESTPLATE).setColor("d0d0d0"), 1);
    public static ItemStack blackLeatherLeggings = new ItemStack(new Item(Material.LEATHER_LEGGINGS).setColor("d0d0d0"), 1);
    public static ItemStack blackLeatherBoots = new ItemStack(new Item(Material.LEATHER_BOOTS).setColor("d0d0d0"), 1);
    public static ItemStack pinkLeatherHelmet = new ItemStack(new Item(Material.LEATHER_HELMET).setColor("d0d0d0"), 1); //todo check colors
    public static ItemStack pinkLeatherChest = new ItemStack(new Item(Material.LEATHER_CHESTPLATE).setColor("d0d0d0"), 1);
    public static ItemStack pinkLeatherLeggings = new ItemStack(new Item(Material.LEATHER_LEGGINGS).setColor("d0d0d0"), 1);
    public static ItemStack pinkLeatherBoots = new ItemStack(new Item(Material.LEATHER_BOOTS).setColor("d0d0d0"), 1);
    public static ItemStack grayLeatherHelmet = new ItemStack(new Item(Material.LEATHER_HELMET).setColor("d0d0d0"), 1);
    public static ItemStack grayLeatherChest = new ItemStack(new Item(Material.LEATHER_CHESTPLATE).setColor("d0d0d0"), 1);
    public static ItemStack grayLeatherLeggings = new ItemStack(new Item(Material.LEATHER_LEGGINGS).setColor("d0d0d0"), 1);
    public static ItemStack grayLeatherBoots = new ItemStack(new Item(Material.LEATHER_BOOTS).setColor("d0d0d0"), 1);
    public static ItemStack whiteLeatherHelmet = new ItemStack(new Item(Material.LEATHER_HELMET).setColor("d0d0d0"), 1);
    public static ItemStack whiteLeatherChest = new ItemStack(new Item(Material.LEATHER_CHESTPLATE).setColor("d0d0d0"), 1);
    public static ItemStack whiteLeatherLeggings = new ItemStack(new Item(Material.LEATHER_LEGGINGS).setColor("d0d0d0"), 1);
    public static ItemStack purpleLeatherHelmet = new ItemStack(new Item(Material.LEATHER_HELMET).setColor("d0d0d0"), 1);
    public static ItemStack redLeatherHelmet = new ItemStack(new Item(Material.LEATHER_HELMET).setColor("d0d0d0"), 1);
    //</editor-fold>

    //chain
    public static ItemStack chainLeggings = new ItemStack(new Item(Material.CHAINMAIL_LEGGINGS), 1);
    public static ItemStack chainHelmet = new ItemStack(new Item(Material.CHAINMAIL_HELMET), 1);
    public static ItemStack chainBoots = new ItemStack(new Item(Material.CHAINMAIL_BOOTS), 1);
    public static ItemStack chainChest = new ItemStack(new Item(Material.CHAINMAIL_CHESTPLATE), 1);

    //gold
    public static ItemStack goldLeggings = new ItemStack(new Item(Material.GOLD_LEGGINGS), 1);
    public static ItemStack goldHelmet = new ItemStack(new Item(Material.GOLD_HELMET), 1);
    public static ItemStack goldChest = new ItemStack(new Item(Material.GOLD_CHESTPLATE), 1);
    public static ItemStack goldBoots = new ItemStack(new Item(Material.GOLD_BOOTS), 1);

    //iron
    public static ItemStack ironHelmet = new ItemStack(new Item(Material.IRON_HELMET), 1);
    public static ItemStack ironChest = new ItemStack(new Item(Material.IRON_CHESTPLATE), 1);
    public static ItemStack ironLeggings = new ItemStack(new Item(Material.IRON_LEGGINGS), 1);
    public static ItemStack ironBoots = new ItemStack(new Item(Material.IRON_BOOTS), 1);

    //diamond
    public static ItemStack diamondHelmet = new ItemStack(new Item(Material.DIAMOND_HELMET), 1);
    public static ItemStack diamondChest = new ItemStack(new Item(Material.DIAMOND_CHESTPLATE), 1);
    public static ItemStack diamondLeggings = new ItemStack(new Item(Material.DIAMOND_LEGGINGS), 1);
    public static ItemStack diamondBoots = new ItemStack(new Item(Material.DIAMOND_BOOTS), 1);
    //</editor-fold>

    //<editor-fold desc="[Weapons]">
    public static ItemStack woodenAxe = new ItemStack(new Item(Material.WOOD_AXE), 1);
    public static ItemStack woodenPick = new ItemStack(new Item(Material.WOOD_PICKAXE), 1);
    public static ItemStack woodenSword = new ItemStack(new Item(Material.WOOD_SWORD), 1);
    public static ItemStack woodenShovel = new ItemStack(new Item(Material.WOOD_SPADE), 1);

    public static ItemStack stoneSword = new ItemStack(new Item(Material.STONE_SWORD), 1);
    public static ItemStack stonePick = new ItemStack(new Item(Material.STONE_PICKAXE), 1);
    public static ItemStack stoneShovel = new ItemStack(new Item(Material.STONE_SPADE), 1);
    public static ItemStack stoneAxe = new ItemStack(new Item(Material.STONE_AXE), 1);
    public static ItemStack stoneHoe = new ItemStack(new Item(Material.STONE_HOE), 1);

    public static ItemStack goldenAxe = new ItemStack(new Item(Material.GOLD_AXE), 1);
    public static ItemStack goldSword = new ItemStack(new Item(Material.GOLD_SWORD), 1);

    public static ItemStack ironSword = new ItemStack(new Item(Material.IRON_SWORD), 1);
    public static ItemStack ironPick = new ItemStack(new Item(Material.IRON_PICKAXE), 1);
    public static ItemStack ironAxe = new ItemStack(new Item(Material.IRON_AXE), 1);

    public static ItemStack diamondAxe = new ItemStack(new Item(Material.DIAMOND_AXE), 1);
    public static ItemStack diamondShovel = new ItemStack(new Item(Material.DIAMOND_SPADE), 1);
    public static ItemStack diamondHoe = new ItemStack(new Item(Material.DIAMOND_HOE), 1);
    public static ItemStack diamondSword = new ItemStack(new Item(Material.DIAMOND_SWORD), 1);

    public static ItemStack bow = new ItemStack(new Item(Material.BOW), 1);
    public static ItemStack fishingRod = new ItemStack(new Item(Material.FISHING_ROD), 1);

    public static ItemStack flintNSteelUse1 = new ItemStack(new Item(Material.FLINT_AND_STEEL, 1), 1);
    public static ItemStack flintNSteelUse2 = new ItemStack(new Item(Material.FLINT_AND_STEEL, 2), 1);
    public static ItemStack flintNSteelUse4 = new ItemStack(new Item(Material.FLINT_AND_STEEL, 4), 1);
    //</editor-fold>

    //<editor-fold desc="[Food]">
    public static Item steak = new Item(Material.COOKED_BEEF);
    public static Item bread = new Item(Material.BREAD);
    public static Item cake = new Item(Material.CAKE);
    public static Item apple = new Item(Material.APPLE);
    public static Item carrot = new Item(Material.CARROT);
    public static Item goldenApple = new Item(Material.GOLDEN_APPLE);
    public static Item goldenCarrot = new Item(Material.GOLDEN_CARROT);
    public static Item cookie = new Item(Material.COOKIE);
    public static Item fish = new Item(Material.RAW_FISH);
    public static Item cookedFish = new Item(Material.COOKED_FISH);
    public static Item cookedChicken = new Item(Material.COOKED_CHICKEN);
    public static Item melonSlice = new Item(Material.MELON);
    public static Item rottenFlesh = new Item(Material.ROTTEN_FLESH);
    public static Item goldenAppleRegen3Slow2 = new Item(Material.GOLDEN_APPLE).addEffect(new Effect(EffectType.REGENERATION, 3, 0)).addEffect(new Effect(EffectType.SLOW, 2, 0)); //todo find these values
    //</editor-fold>

    //<editor-fold desc="[Wool / clay / glass]">
    public static Item orangeWool = new Item(Material.WOOL, 1);//todo check all colors
    public static Item greenClay = new Item(Material.STAINED_CLAY, 13);
    public static Item redGlass = new Item(Material.STAINED_GLASS, 4);
    public static Item yellowGlass = new Item(Material.STAINED_GLASS, 5);
    //</editor-fold>

    //<editor-fold desc="[SKULLS]">
    public static Item skull = new Item(Material.SKULL);
    //</editor-fold>

    //<editor-fold desc="[Others]">
    public static Item TNT = new Item(Material.TNT);
    public static Item bowl = new Item(Material.BOWL);
    public static Item arrow = new Item(Material.ARROW);
    public static Item minecart = new Item(Material.MINECART);
    public static Item storageMinecart = new Item(Material.STORAGE_MINECART);
    public static Item poweredRail = new Item(Material.POWERED_RAIL);
    public static Item rail = new Item(Material.RAILS);
    public static Item redstoneTorch = new Item(Material.REDSTONE_TORCH_ON);
    public static Item cobweb = new Item(Material.WEB);
    public static Item egg = new Item(Material.EGG);
    public static Item snowball = new Item(Material.SNOW_BALL);
    public static Item expBottle = new Item(Material.EXP_BOTTLE);
    public static Item firework = new Item(Material.FIREWORK);
    public static Item fireCharge = new Item(Material.FIREBALL);
    public static Item book = new Item(Material.BOOK);
    public static Item redstone = new Item(Material.REDSTONE);
    public static Item repeater = new Item(Material.REDSTONE_REPEATER);
    public static Item stickyPiston = new Item(Material.PISTON_STICKY);
    public static Item woodenPressurePlate = new Item(Material.WOOD_PLATE);
    public static Item tripwireHook = new Item(Material.TRIPWIRE_HOOK);
    public static Item ladder = new Item(Material.LADDER);
    public static Item string = new Item(Material.STRING);
    public static Item stick = new Item(Material.STICK);
    public static Item bucket = new Item(Material.BUCKET);
    public static Item bone = new Item(Material.BONE);
    public static Item iron = new Item(Material.IRON_INGOT);
    public static Item gold = new Item(Material.GOLD_INGOT);
    public static Item craftingTable = new Item(Material.WORKBENCH);
    public static Item furnace = new Item(Material.FURNACE);
    public static Item beacon = new Item(Material.BEACON);
    public static Item oakLog = new Item(Material.LOG, 0);
    public static Item bookCase = new Item(Material.BOOKSHELF);
    public static Item emeraldBlock = new Item(Material.EMERALD_BLOCK);
    public static Item glass = new Item(Material.GLASS);
    public static Item snow = new Item(Material.SNOW_BLOCK);
    public static Item pumpkin = new Item(Material.PUMPKIN);
    public static Item stone = new Item(Material.STONE);
    public static Item obsidian = new Item(Material.OBSIDIAN);
    public static Item bedrock = new Item(Material.BEDROCK);
    public static Item commandBlock = new Item(Material.COMMAND);
    public static Item jukebox = new Item(Material.JUKEBOX);
    public static Item noteBlock = new Item(Material.NOTE_BLOCK);
    public static Item coalOre = new Item(Material.COAL_ORE);
    public static Item lapisBlock = new Item(Material.LAPIS_BLOCK);
    public static Item dirt = new Item(Material.DIRT);
    public static Item goldBlock = new Item(Material.GOLD_BLOCK);
    public static Item grass = new Item(Material.GRASS);
    public static Item redstoneOre = new Item(Material.REDSTONE_ORE);
    public static Item cactus = new Item(Material.CACTUS);
    public static Item ironBlock = new Item(Material.IRON_BLOCK);
    public static Item ice = new Item(Material.ICE);
    public static Item netherBrick = new Item(Material.NETHER_BRICK);
    public static Item slimeBlock = new Item(Material.SLIME_BLOCK);
    public static ItemStack flintNSteel = new ItemStack(new Item(Material.FLINT_AND_STEEL), 1);
    public static ItemStack carrotOnAStick = new ItemStack(new Item(Material.CARROT_STICK), 1);
    public static ItemStack anvil = new ItemStack(new Item(Material.ANVIL), 1);
    public static ItemStack saddle = new ItemStack(new Item(Material.SADDLE), 1);
    public static ItemStack goldHorseArmor = new ItemStack(new Item(Material.GOLD_BARDING), 1);
    public static ItemStack ironHorseArmor = new ItemStack(new Item(Material.IRON_BARDING), 1);
    public static ItemStack diamondHorseArmor = new ItemStack(new Item(Material.DIAMOND_BARDING), 1);
    public static ItemStack enchantmentTable = new ItemStack(new Item(Material.ENCHANTMENT_TABLE, 1));
    public static ItemStack waterBucket = new ItemStack(new Item(Material.WATER_BUCKET), 1);
    public static ItemStack lavaBucket = new ItemStack(new Item(Material.LAVA_BUCKET), 1);
    //</editor-fold>

    //<editor-fold desc="[Spawneggs]">
    public static Item cowEgg = new Item("Cow Spawn Egg", Material.MONSTER_EGG, 92);
    public static Item pigEgg = new Item("Pig Spawn Egg", Material.MONSTER_EGG, 90);
    public static Item mooshEgg = new Item("Mooshroom Spawn Egg", Material.MONSTER_EGG, 96);
    public static Item wolfEgg = new Item("Wolf Spawn Egg", Material.MONSTER_EGG, 95);
    public static Item horseEgg = new Item("Horse Spawn Egg", Material.MONSTER_EGG, 100);
    public static Item slimeEgg = new Item("Slime Spawn Egg", Material.MONSTER_EGG, 55);
    public static Item ocelotEgg = new Item("Ocelot Spawn Egg", Material.MONSTER_EGG, 98);
    public static Item snowmanEgg = new Item("Snowman Spawn Egg", Material.MONSTER_EGG, -1);
    public static Item chickenEgg = new Item("Chicken Spawn Egg", Material.MONSTER_EGG, 93);

    public static Item blazeEgg = new Item("Blaze Spawn Egg", Material.MONSTER_EGG, 61);
    public static Item creeperEgg = new Item("Creeper Spawn Egg", Material.MONSTER_EGG, 50);
    public static Item jockeyEgg = new Item("Jockey Spawn Egg", Material.MONSTER_EGG, -1);
    public static Item zombieEgg = new Item("Zombie Spawn Egg", Material.MONSTER_EGG, 54);
    public static Item spiderEgg = new Item("Spider Spawn Egg", Material.MONSTER_EGG, 52);
    public static Item witchEgg = new Item("Witch Spawn Egg", Material.MONSTER_EGG, 66);
    public static Item skeletonEgg = new Item("Skeleton Spawn Egg", Material.MONSTER_EGG, 51);
    public static Item zombiePigmanEgg = new Item("Zombie Pigman Spawn Egg", Material.MONSTER_EGG, 57);
    public static Item magmaCubeEgg = new Item("Magma Cube Spawn Egg", Material.MONSTER_EGG, 62);
    public static Item batEgg = new Item("Bat Spawn Egg", Material.MONSTER_EGG, 65);
    //</editor-fold>

    //</editor-fold>

    //<editor-fold desc="[Potions]">
    public static Item speedPotion2_8 = new Item(Material.POTION).addEffect(new Effect(EffectType.SPEED, 2, 8));
    public static Item speedPotion2_10 = new Item(Material.POTION).addEffect(new Effect(EffectType.SPEED, 2, 10));
    public static Item speedPotion2_15 = new Item(Material.POTION).addEffect(new Effect(EffectType.SPEED, 2, 15));
    public static Item speedPotion2_20 = new Item(Material.POTION).addEffect(new Effect(EffectType.SPEED, 2, 20));
    public static Item speedPotion2_25 = new Item(Material.POTION).addEffect(new Effect(EffectType.SPEED, 2, 25));
    public static Item speedPotion2_27 = new Item(Material.POTION).addEffect(new Effect(EffectType.SPEED, 2, 27));
    public static Item speedPotion2_90 = new Item(Material.POTION).addEffect(new Effect(EffectType.SPEED, 2, 90));
    public static Item speedSplashPotion3_4 = new Item(Material.POTION).addEffect(new Effect(EffectType.SPEED, 3, 4));
    public static Item speedSplashPotion2_40 = new Item(Material.POTION).addEffect(new Effect(EffectType.SPEED, 2, 40));

    public static Item slowSlpashPotion1_15 = new Item(Material.SPLASH_POTION).addEffect(new Effect(EffectType.SLOW, 1, 15));
    public static Item slowSlpashPotion2_12 = new Item(Material.SPLASH_POTION).addEffect(new Effect(EffectType.SLOW, 2, 12));
    public static Item slowSlpashPotion3_8 = new Item(Material.SPLASH_POTION).addEffect(new Effect(EffectType.SLOW, 3, 8));
    public static Item slowSlpashPotion3_10 = new Item(Material.SPLASH_POTION).addEffect(new Effect(EffectType.SLOW, 3, 10));

    public static Item invisPotion1_20 = new Item(Material.SPLASH_POTION).addEffect(new Effect(EffectType.INVISIBILITY, 1, 20));
    public static Item invisSplashPotion1_9 = new Item(Material.SPLASH_POTION).addEffect(new Effect(EffectType.INVISIBILITY, 1, 9));
    public static Item invisSplashPotion1_15 = new Item(Material.SPLASH_POTION).addEffect(new Effect(EffectType.INVISIBILITY, 1, 15));
    public static Item invisSplashPotion2_10 = new Item(Material.SPLASH_POTION).addEffect(new Effect(EffectType.INVISIBILITY, 2, 10));

    public static Item regenPotion2_6 = new Item(Material.POTION).addEffect(new Effect(EffectType.REGENERATION, 2, 6));
    public static Item regenPotion2_8 = new Item(Material.POTION).addEffect(new Effect(EffectType.REGENERATION, 2, 8));
    public static Item regenPotion2_12 = new Item(Material.POTION).addEffect(new Effect(EffectType.REGENERATION, 2, 12));
    public static Item regenPotion2_16 = new Item(Material.POTION).addEffect(new Effect(EffectType.REGENERATION, 2, 16));
    public static Item regenPotion3_6 = new Item(Material.POTION).addEffect(new Effect(EffectType.REGENERATION, 3, 6));
    public static Item regenPotion3_16 = new Item(Material.POTION).addEffect(new Effect(EffectType.REGENERATION, 3, 16));

    public static Item resistanceSplashPotion2_11 = new Item(Material.SPLASH_POTION).addEffect(new Effect(EffectType.RESISTANCE, 2, 11));
    public static Item resistancePotion1_10 = new Item(Material.POTION).addEffect(new Effect(EffectType.RESISTANCE, 1, 10));
    public static Item resistancePotion1_12 = new Item(Material.POTION).addEffect(new Effect(EffectType.RESISTANCE, 1, 12));
    public static Item resistancePotion1_13 = new Item(Material.POTION).addEffect(new Effect(EffectType.RESISTANCE, 1, 13));
    public static Item resistancePotion1_14 = new Item(Material.POTION).addEffect(new Effect(EffectType.RESISTANCE, 1, 14));
    public static Item resistancePotion1_15 = new Item(Material.POTION).addEffect(new Effect(EffectType.RESISTANCE, 1, 15));
    public static Item resistancePotion1_17 = new Item(Material.POTION).addEffect(new Effect(EffectType.RESISTANCE, 1, 17));

    public static Item absorptionPotion1_3 = new Item(Material.POTION).addEffect(new Effect(EffectType.ABSORPTION, 1, 3));
    public static Item absorptionPotion1_5 = new Item(Material.POTION).addEffect(new Effect(EffectType.ABSORPTION, 1, 5));
    public static Item absorptionPotion1_7 = new Item(Material.POTION).addEffect(new Effect(EffectType.ABSORPTION, 1, 7));

    public static Item instantHealthSplashPotion1 = new Item(Material.SPLASH_POTION).addEffect(new Effect(EffectType.INSTANT_HEALTH, 1, 0));
    public static Item instantHealthSplashPotion2 = new Item(Material.SPLASH_POTION).addEffect(new Effect(EffectType.INSTANT_HEALTH, 2, 0));

    public static Item instantDamageSplashPotion1 = new Item(Material.SPLASH_POTION).addEffect(new Effect(EffectType.INSTANT_DAMAGE, 1, 0));

    public static Item hungerSplashPotion1_9 = new Item(Material.SPLASH_POTION).addEffect(new Effect(EffectType.HUNGER, 1, 9));

    public static Item saturationPotion1_25 = new Item(Material.POTION).addEffect(new Effect(EffectType.SATURATION, 1, 25));

    public static Item fireResistancePotion1_30 = new Item(Material.POTION).addEffect(new Effect(EffectType.FIRE_RESISTANCE, 1, 30));
    public static Item fireResistancePotion1_45 = new Item(Material.POTION).addEffect(new Effect(EffectType.FIRE_RESISTANCE, 1, 45));
    public static Item fireResistancePotion1_60 = new Item(Material.POTION).addEffect(new Effect(EffectType.FIRE_RESISTANCE, 1, 60));
    public static Item fireResistancePotion1_75 = new Item(Material.POTION).addEffect(new Effect(EffectType.FIRE_RESISTANCE, 1, 75));
    public static Item fireResistancePotion1_90 = new Item(Material.POTION).addEffect(new Effect(EffectType.FIRE_RESISTANCE, 1, 90));
    public static Item fireResistanceSplashPotion1_10 = new Item(Material.SPLASH_POTION).addEffect(new Effect(EffectType.FIRE_RESISTANCE, 1, 10));
    public static Item fireResistanceSplashPotion1_12 = new Item(Material.SPLASH_POTION).addEffect(new Effect(EffectType.FIRE_RESISTANCE, 1, 12));
    public static Item fireResistanceSplashPotion1_60 = new Item(Material.SPLASH_POTION).addEffect(new Effect(EffectType.FIRE_RESISTANCE, 1, 60));

    public static Item weaknessSplashPotion3_9 = new Item(Material.SPLASH_POTION).addEffect(new Effect(EffectType.WEAKNESS, 3, 9));
    public static Item weaknessSplashPotion3_10 = new Item(Material.SPLASH_POTION).addEffect(new Effect(EffectType.WEAKNESS, 3, 10));

    public static Item blindnessSplashPotion1_8 = new Item(Material.SPLASH_POTION).addEffect(new Effect(EffectType.BLIND, 1, 8));
    public static Item blindnessSplashPotion1_10 = new Item(Material.SPLASH_POTION).addEffect(new Effect(EffectType.BLIND, 1, 10));

    public static Item posionSplashPotion1_12 = new Item(Material.SPLASH_POTION).addEffect(new Effect(EffectType.POISON, 1, 12));
    public static Item posionSplashPotion2_3 = new Item(Material.SPLASH_POTION).addEffect(new Effect(EffectType.POISON, 2, 3));

    public static Item nightVisionSplashPotion1_300 = new Item(Material.SPLASH_POTION).addEffect(new Effect(EffectType.NIGHT_VISION, 1, 300));

    public static Item strengthPotion1_6 = new Item(Material.POTION).addEffect(new Effect(EffectType.STRENGTH, 1, 6));
    public static Item strengthPotionCustom20PC_45 = new Item("20% Increase in damage", Material.POTION).addEffect(new Effect(EffectType.STRENGTH, 0, 45));
    public static Item strengthPotionCustom20PC_60 = new Item("20% Increase in damage", Material.POTION).addEffect(new Effect(EffectType.STRENGTH, 0, 60));
    public static Item strengthPotionCustom20PC_90 = new Item("20% Increase in damage", Material.POTION).addEffect(new Effect(EffectType.STRENGTH, 0, 90));


    //combined
    public static Item splashPotionSlow1_15Poison1_12 = new Item(Material.SPLASH_POTION).addEffect(new Effect(EffectType.SLOW, 1, 15)).addEffect(new Effect(EffectType.POISON, 1, 12));


    //</editor-fold>

    //<editor-fold desc="[Enchanted Items]">

    //<editor-fold desc="[Bows]">
    public static ItemStack bowUnbreak1 = new ItemStack(new Item(Material.BOW).addEnchantment(new Enchantment(EnchantmentType.UNBREAKING, 1)), 1);
    public static ItemStack bowPow1 = new ItemStack(new Item(Material.BOW).addEnchantment(Enchantment.power1), 1);
    public static ItemStack bowPow2 = new ItemStack(new Item(Material.BOW).addEnchantment(Enchantment.power2), 1);
    public static ItemStack bowPow3 = new ItemStack(new Item(Material.BOW).addEnchantment(Enchantment.power3), 1);
    public static ItemStack bowPunch1 = new ItemStack(new Item(Material.BOW).addEnchantment(Enchantment.punch1), 1);
    public static ItemStack bowPunch1Pow1 = new ItemStack(new Item(Material.BOW).addEnchantment(Enchantment.punch1).addEnchantment(Enchantment.power1), 1);
    public static ItemStack bowPunch2Pow1 = new ItemStack(new Item(Material.BOW).addEnchantment(Enchantment.punch2).addEnchantment(Enchantment.power1), 1);
    public static ItemStack bowPunch3Pow3Use2 = new ItemStack(new Item(Material.BOW, 2).addEnchantment(Enchantment.punch3).addEnchantment(Enchantment.power3),1 );
    public static ItemStack bowFlame1= new ItemStack(new Item(Material.BOW).addEnchantment(Enchantment.flame1),1 );
    //</editor-fold>

    //<editor-fold desc="[Leather armor]">
    public static ItemStack leatherHelmetResp1 = new ItemStack(new Item(Material.LEATHER_HELMET).addEnchantment(new Enchantment(EnchantmentType.RESPIRATION, 1)), 1);
    public static ItemStack leatherHelmetResp2 = new ItemStack(new Item(Material.LEATHER_HELMET).addEnchantment(new Enchantment(EnchantmentType.RESPIRATION, 2)), 1);
    public static ItemStack leatherHelmetProt1 = new ItemStack(new Item(Material.LEATHER_HELMET).addEnchantment(Enchantment.prot1), 1);
    public static ItemStack leatherHelmetProjProt1 = new ItemStack(new Item(Material.LEATHER_HELMET).addEnchantment(Enchantment.projprot1), 1);
    public static ItemStack leatherHelmetProjProt2 = new ItemStack(new Item(Material.LEATHER_HELMET).addEnchantment(Enchantment.projprot2), 1);
    public static ItemStack leatherHelmetProt2ProjProt2 = new ItemStack(new Item(Material.LEATHER_HELMET).addEnchantment(Enchantment.projprot2).addEnchantment(Enchantment.prot2), 1);
    public static ItemStack leatherHelmetProt2ProjProt4 = new ItemStack(new Item(Material.LEATHER_HELMET).addEnchantment(Enchantment.projprot4).addEnchantment(Enchantment.prot2), 1);
    public static ItemStack leatherHelmetProt2ProjProt3 = new ItemStack(new Item(Material.LEATHER_HELMET).addEnchantment(Enchantment.projprot3).addEnchantment(Enchantment.prot2), 1);
    public static ItemStack leatherHelmetProt3ProjProt5 = new ItemStack(new Item(Material.LEATHER_HELMET).addEnchantment(Enchantment.projprot5).addEnchantment(Enchantment.prot3), 1);
    public static ItemStack leatherHelmetProt1ProjProt1 = new ItemStack(new Item(Material.LEATHER_HELMET).addEnchantment(Enchantment.projprot1).addEnchantment(Enchantment.prot1), 1);
    public static ItemStack leatherHelmetThorns1Unbreaking3 = new ItemStack(new Item(Material.LEATHER_HELMET).addEnchantment(Enchantment.thorns1).addEnchantment(Enchantment.unbreaking3), 1);
    public static ItemStack leatherHelmetThorns1Unbreaking5 = new ItemStack(new Item(Material.LEATHER_HELMET).addEnchantment(Enchantment.thorns1).addEnchantment(Enchantment.unbreaking5), 1);
    public static ItemStack leatherHelmetThorns1Unbreaking10 = new ItemStack(new Item(Material.LEATHER_HELMET).addEnchantment(Enchantment.thorns1).addEnchantment(Enchantment.unbreaking10), 1);
    public static ItemStack leatherHelmetUnbreaking1 = new ItemStack(new Item(Material.LEATHER_HELMET).addEnchantment(Enchantment.unbreaking1), 1);

    public static ItemStack leatherChestProjProt1 = new ItemStack(new Item(Material.LEATHER_CHESTPLATE).addEnchantment(Enchantment.projprot1), 1);
    public static ItemStack leatherChestProjProt2 = new ItemStack(new Item(Material.LEATHER_CHESTPLATE).addEnchantment(Enchantment.projprot2), 1);
    public static ItemStack leatherChestProt1BProt1 = new ItemStack(new Item(Material.LEATHER_CHESTPLATE).addEnchantment(Enchantment.prot1).addEnchantment(Enchantment.bprot1), 1);
    public static ItemStack leatherChestProt2BProt1 = new ItemStack(new Item(Material.LEATHER_CHESTPLATE).addEnchantment(Enchantment.prot2).addEnchantment(Enchantment.bprot1), 1);
    public static ItemStack leatherChestProt3BProt3 = new ItemStack(new Item(Material.LEATHER_CHESTPLATE).addEnchantment(Enchantment.prot3).addEnchantment(Enchantment.bprot3), 1);
    public static ItemStack leatherChestProt3BProt4 = new ItemStack(new Item(Material.LEATHER_CHESTPLATE).addEnchantment(Enchantment.prot3).addEnchantment(Enchantment.bprot4), 1);
    public static ItemStack leatherChestProt4BProt5 = new ItemStack(new Item(Material.LEATHER_CHESTPLATE).addEnchantment(Enchantment.prot4).addEnchantment(Enchantment.bprot5), 1);
    public static ItemStack leatherChestProt4BProt10 = new ItemStack(new Item(Material.LEATHER_CHESTPLATE).addEnchantment(Enchantment.prot4).addEnchantment(Enchantment.bprot10), 1);
    public static ItemStack leatherChestBprot1 = new ItemStack(new Item(Material.LEATHER_CHESTPLATE).addEnchantment(Enchantment.bprot1), 1);
    public static ItemStack leatherChestBprot2 = new ItemStack(new Item(Material.LEATHER_CHESTPLATE).addEnchantment(Enchantment.bprot2), 1);
    public static ItemStack leatherChestThorns1Unbreaking5 = new ItemStack(new Item(Material.LEATHER_CHESTPLATE).addEnchantment(Enchantment.thorns1).addEnchantment(Enchantment.unbreaking5), 1);
    public static ItemStack leatherChestThorns1Unbreaking10 = new ItemStack(new Item(Material.LEATHER_CHESTPLATE).addEnchantment(Enchantment.thorns1).addEnchantment(Enchantment.unbreaking10), 1);
    public static ItemStack leatherChestUnbreaking1 = new ItemStack(new Item(Material.LEATHER_CHESTPLATE).addEnchantment(Enchantment.unbreaking1), 1);
    public static ItemStack leatherChestUnbreaking3 = new ItemStack(new Item(Material.LEATHER_CHESTPLATE).addEnchantment(Enchantment.unbreaking3), 1);
    public static ItemStack leatherChestUnbreaking3Prot1 = new ItemStack(new Item(Material.LEATHER_CHESTPLATE).addEnchantment(Enchantment.unbreaking3).addEnchantment(Enchantment.prot1), 1);
    public static ItemStack leatherChestProt2Thorns3 = new ItemStack(new Item(Material.LEATHER_CHESTPLATE).addEnchantment(Enchantment.prot2).addEnchantment(Enchantment.thorns3), 1);

    public static ItemStack leatherLeggingsProt1BProt1 = new ItemStack(new Item(Material.LEATHER_LEGGINGS).addEnchantment(Enchantment.prot1).addEnchantment(Enchantment.bprot1), 1);
    public static ItemStack leatherLeggingsProt1fProt3 = new ItemStack(new Item(Material.LEATHER_LEGGINGS).addEnchantment(Enchantment.prot1).addEnchantment(Enchantment.fprot3), 1);
    public static ItemStack leatherLeggingsProt2fProt3 = new ItemStack(new Item(Material.LEATHER_LEGGINGS).addEnchantment(Enchantment.prot2).addEnchantment(Enchantment.fprot3), 1);
    public static ItemStack leatherLeggingsProt1 = new ItemStack(new Item(Material.LEATHER_LEGGINGS).addEnchantment(Enchantment.prot1), 1);
    public static ItemStack leatherLeggingsProt4fProt10 = new ItemStack(new Item(Material.LEATHER_LEGGINGS).addEnchantment(Enchantment.prot4).addEnchantment(Enchantment.fprot10), 1);
    public static ItemStack leatherLeggingsProt3fProt4 = new ItemStack(new Item(Material.LEATHER_LEGGINGS).addEnchantment(Enchantment.prot3).addEnchantment(Enchantment.fprot4), 1);
    public static ItemStack leatherLeggingsProt3fProt5 = new ItemStack(new Item(Material.LEATHER_LEGGINGS).addEnchantment(Enchantment.prot3).addEnchantment(Enchantment.fprot5), 1);
    public static ItemStack leatherLeggingsThorns1Unbreaking3 = new ItemStack(new Item(Material.LEATHER_LEGGINGS).addEnchantment(Enchantment.thorns1).addEnchantment(Enchantment.unbreaking3), 1);
    public static ItemStack leatherLeggingsThorns1Unbreaking5 = new ItemStack(new Item(Material.LEATHER_LEGGINGS).addEnchantment(Enchantment.thorns1).addEnchantment(Enchantment.unbreaking5), 1);
    public static ItemStack leatherLeggingsUnbreaking1 = new ItemStack(new Item(Material.LEATHER_LEGGINGS).addEnchantment(Enchantment.unbreaking1), 1);

    public static ItemStack leatherBootsProt2ff5 = new ItemStack(new Item(Material.LEATHER_BOOTS).addEnchantment(Enchantment.prot2).addEnchantment(Enchantment.ff5), 1);
    public static ItemStack leatherBootsProt2ff6 = new ItemStack(new Item(Material.LEATHER_BOOTS).addEnchantment(Enchantment.prot2).addEnchantment(Enchantment.ff6), 1);
    public static ItemStack leatherBootsProt1ff1 = new ItemStack(new Item(Material.LEATHER_BOOTS).addEnchantment(Enchantment.prot1).addEnchantment(Enchantment.ff1), 1);
    public static ItemStack leatherBootsProt1ff2 = new ItemStack(new Item(Material.LEATHER_BOOTS).addEnchantment(Enchantment.prot1).addEnchantment(Enchantment.ff2), 1);
    public static ItemStack leatherBootsProt2ff3 = new ItemStack(new Item(Material.LEATHER_BOOTS).addEnchantment(Enchantment.prot2).addEnchantment(Enchantment.ff3), 1);
    public static ItemStack leatherBootsProt1 = new ItemStack(new Item(Material.LEATHER_BOOTS).addEnchantment(Enchantment.prot1), 1);
    public static ItemStack leatherBootsThorns1Unbreaking3 = new ItemStack(new Item(Material.LEATHER_BOOTS).addEnchantment(Enchantment.thorns1).addEnchantment(Enchantment.unbreaking3), 1);
    public static ItemStack leatherBootsThorns1Unbreaking5 = new ItemStack(new Item(Material.LEATHER_BOOTS).addEnchantment(Enchantment.thorns1).addEnchantment(Enchantment.unbreaking5), 1);
    public static ItemStack leatherBootsUnbreaking3 = new ItemStack(new Item(Material.LEATHER_BOOTS).addEnchantment(Enchantment.unbreaking3), 1);
    public static ItemStack leatherBootsUnbreaking3Prot1 = new ItemStack(new Item(Material.LEATHER_BOOTS).addEnchantment(Enchantment.unbreaking3).addEnchantment(Enchantment.prot1), 1);
    public static ItemStack leatherBootsFf10 = new ItemStack(new Item(Material.LEATHER_BOOTS).addEnchantment(Enchantment.ff10), 1);

    public static ItemStack orangeLeatherBootsfProt1 = new ItemStack(new Item(Material.LEATHER_BOOTS).setColor("d0d0d0").addEnchantment(Enchantment.fprot1), 1);
    public static ItemStack orangeLeatherBootsfProt2 = new ItemStack(new Item(Material.LEATHER_BOOTS).setColor("d0d0d0").addEnchantment(Enchantment.fprot2), 1);
    public static ItemStack orangeLeatherChestfProt2 = new ItemStack(new Item(Material.LEATHER_CHESTPLATE).setColor("d0d0d0").addEnchantment(Enchantment.fprot2), 1);
    public static ItemStack orangeLeatherLeggingsfProt1 = new ItemStack(new Item(Material.LEATHER_LEGGINGS).setColor("d0d0d0").addEnchantment(Enchantment.fprot1), 1);
    public static ItemStack orangeLeatherLeggingsfProt2 = new ItemStack(new Item(Material.LEATHER_LEGGINGS).setColor("d0d0d0").addEnchantment(Enchantment.fprot2), 1);
    public static ItemStack orangeLeatherChestfProt2Prot1 = new ItemStack(new Item(Material.LEATHER_CHESTPLATE).setColor("d0d0d0").addEnchantment(Enchantment.fprot2).addEnchantment(Enchantment.prot1), 1);
    public static ItemStack orangeLeatherHelmetfProt2 = new ItemStack(new Item(Material.LEATHER_HELMET).setColor("d0d0d0").addEnchantment(Enchantment.fprot2), 1);

    public static ItemStack yellowLeatherHelmetUnbreaking1 = new ItemStack(new Item(Material.LEATHER_HELMET).setColor("d0d0d0").addEnchantment(Enchantment.unbreaking1), 1);
    public static ItemStack yellowLeatherChestUnbreaking1 = new ItemStack(new Item(Material.LEATHER_CHESTPLATE).setColor("d0d0d0").addEnchantment(Enchantment.unbreaking1), 1);
    public static ItemStack yellowLeatherChestUnbreaking1Prot1 = new ItemStack(new Item(Material.LEATHER_CHESTPLATE).setColor("d0d0d0").addEnchantment(Enchantment.unbreaking1).addEnchantment(Enchantment.prot1), 1);
    public static ItemStack yellowLeatherChestUnbreaking3Prot1 = new ItemStack(new Item(Material.LEATHER_CHESTPLATE).setColor("d0d0d0").addEnchantment(Enchantment.unbreaking3).addEnchantment(Enchantment.prot1), 1);
    public static ItemStack yellowLeatherLeggingsUnbreaking1 = new ItemStack(new Item(Material.LEATHER_LEGGINGS).setColor("d0d0d0").addEnchantment(Enchantment.unbreaking1), 1);
    public static ItemStack yellowLeatherBootsUnbreaking1 = new ItemStack(new Item(Material.LEATHER_BOOTS).setColor("d0d0d0").addEnchantment(Enchantment.unbreaking1), 1);

    public static ItemStack redLeatherHelmetFProt3 = new ItemStack(new Item(Material.LEATHER_HELMET).setColor("d0d0d0").addEnchantment(Enchantment.fprot3), 1);
    public static ItemStack redLeatherChestFProt3 = new ItemStack(new Item(Material.LEATHER_CHESTPLATE).setColor("d0d0d0").addEnchantment(Enchantment.fprot3), 1);
    public static ItemStack redLeatherLeggingsFProt3 = new ItemStack(new Item(Material.LEATHER_LEGGINGS).setColor("d0d0d0").addEnchantment(Enchantment.fprot3), 1);
    
    public static ItemStack pinkLeatherHelmetloot3 = new ItemStack(new Item(Material.LEATHER_HELMET).setColor("d0d0d0").addEnchantment(Enchantment.loot3), 1);
    public static ItemStack pinkLeatherChestloot3 = new ItemStack(new Item(Material.LEATHER_CHESTPLATE).setColor("d0d0d0").addEnchantment(Enchantment.loot3), 1);
    public static ItemStack pinkLeatherLeggingsloot3 = new ItemStack(new Item(Material.LEATHER_LEGGINGS).setColor("d0d0d0").addEnchantment(Enchantment.loot3), 1);
    public static ItemStack pinkLeatherBootsloot3 = new ItemStack(new Item(Material.LEATHER_LEGGINGS).setColor("d0d0d0").addEnchantment(Enchantment.loot3), 1);
    //</editor-fold>

    //<editor-fold desc="[Chain armor]">
    public static ItemStack chainHelmetResp1 = new ItemStack(new Item(Material.CHAINMAIL_HELMET).addEnchantment(Enchantment.resp1), 1);
    public static ItemStack chainHelmetResp3 = new ItemStack(new Item(Material.CHAINMAIL_HELMET).addEnchantment(Enchantment.resp3), 1);
    public static ItemStack chainHelmetProjProt2 = new ItemStack(new Item(Material.CHAINMAIL_HELMET).addEnchantment(Enchantment.projprot2), 1);
    public static ItemStack chainHelmetProjProt3 = new ItemStack(new Item(Material.CHAINMAIL_HELMET).addEnchantment(Enchantment.projprot3), 1);
    public static ItemStack chainHelmetProjProt4 = new ItemStack(new Item(Material.CHAINMAIL_HELMET).addEnchantment(Enchantment.projprot4), 1);
    public static ItemStack chainHelmetProt2 = new ItemStack(new Item(Material.CHAINMAIL_HELMET).addEnchantment(Enchantment.prot2), 1);
    public static ItemStack chainHelmetProt4 = new ItemStack(new Item(Material.CHAINMAIL_HELMET).addEnchantment(Enchantment.prot4), 1);

    public static ItemStack chainChestPunch1 = new ItemStack(new Item(Material.CHAINMAIL_CHESTPLATE).addEnchantment(new Enchantment(EnchantmentType.PUNCH, 1)), 1);
    public static ItemStack chainChestUnbreaking1 = new ItemStack(new Item(Material.CHAINMAIL_CHESTPLATE).addEnchantment(Enchantment.unbreaking1), 1);
    public static ItemStack chainChestProjProt2 = new ItemStack(new Item(Material.CHAINMAIL_CHESTPLATE).addEnchantment(Enchantment.projprot2), 1);
    public static ItemStack chainChestProjProt3 = new ItemStack(new Item(Material.CHAINMAIL_CHESTPLATE).addEnchantment(Enchantment.projprot3), 1);
    public static ItemStack chainChestFProt3 = new ItemStack(new Item(Material.CHAINMAIL_CHESTPLATE).addEnchantment(Enchantment.fprot3), 1);

    public static ItemStack chainLeggingsProt1 = new ItemStack(new Item(Material.CHAINMAIL_LEGGINGS).addEnchantment(Enchantment.prot1), 1);
    public static ItemStack chainLeggingsProt2 = new ItemStack(new Item(Material.CHAINMAIL_LEGGINGS).addEnchantment(Enchantment.prot2), 1);
    public static ItemStack chainLeggingsProjProt2 = new ItemStack(new Item(Material.CHAINMAIL_LEGGINGS).addEnchantment(Enchantment.projprot2), 1);
    public static ItemStack chainLeggingsProjProt3 = new ItemStack(new Item(Material.CHAINMAIL_LEGGINGS).addEnchantment(Enchantment.projprot3), 1);
    public static ItemStack chainLeggingsUnbreaking1 = new ItemStack(new Item(Material.CHAINMAIL_LEGGINGS).addEnchantment(Enchantment.unbreaking1), 1);
    public static ItemStack chainLeggingsPunch1 = new ItemStack(new Item(Material.CHAINMAIL_LEGGINGS).addEnchantment(new Enchantment(EnchantmentType.PUNCH, 1)), 1);
    public static ItemStack chainLeggingsThorns1Unbreaking5 = new ItemStack(new Item(Material.CHAINMAIL_LEGGINGS).addEnchantment(Enchantment.thorns1).addEnchantment(Enchantment.unbreaking5), 1);
    public static ItemStack chainLeggingsThorns2Unbreaking10 = new ItemStack(new Item(Material.CHAINMAIL_LEGGINGS).addEnchantment(Enchantment.thorns2).addEnchantment(Enchantment.unbreaking10), 1);

    public static ItemStack chainBootsProt1 = new ItemStack(new Item(Material.CHAINMAIL_BOOTS).addEnchantment(Enchantment.prot1), 1);
    public static ItemStack chainBootsProt2 = new ItemStack(new Item(Material.CHAINMAIL_BOOTS).addEnchantment(Enchantment.prot2), 1);
    public static ItemStack chainBootsProt3 = new ItemStack(new Item(Material.CHAINMAIL_BOOTS).addEnchantment(Enchantment.prot3), 1);
    public static ItemStack chainBootsProjProt2 = new ItemStack(new Item(Material.CHAINMAIL_BOOTS).addEnchantment(Enchantment.projprot2), 1);
    public static ItemStack chainBootsProjProt3 = new ItemStack(new Item(Material.CHAINMAIL_BOOTS).addEnchantment(Enchantment.projprot3), 1);
    public static ItemStack chainBootsFf2 = new ItemStack(new Item(Material.CHAINMAIL_BOOTS).addEnchantment(Enchantment.ff2),1);
    public static ItemStack chainBootsFf3 = new ItemStack(new Item(Material.CHAINMAIL_BOOTS).addEnchantment(Enchantment.ff3),1);
    public static ItemStack chainBootsFf4 = new ItemStack(new Item(Material.CHAINMAIL_BOOTS).addEnchantment(Enchantment.ff4),1);
    public static ItemStack chainBootsFf5 = new ItemStack(new Item(Material.CHAINMAIL_BOOTS).addEnchantment(Enchantment.ff5),1);
    //</editor-fold>

    //<editor-fold desc="[gold armor]">
    public static ItemStack goldHelmetProt1 = new ItemStack(new Item(Material.GOLD_HELMET).addEnchantment(Enchantment.prot1), 1);
    public static ItemStack goldHelmetProt1Unbreaking1 = new ItemStack(new Item(Material.GOLD_HELMET).addEnchantment(Enchantment.prot1).addEnchantment(Enchantment.unbreaking1), 1);
    public static ItemStack goldHelmetProt2Unbreaking1 = new ItemStack(new Item(Material.GOLD_HELMET).addEnchantment(Enchantment.prot2).addEnchantment(Enchantment.unbreaking1), 1);
    public static ItemStack goldHelmetProt3Unbreaking1 = new ItemStack(new Item(Material.GOLD_HELMET).addEnchantment(Enchantment.prot3).addEnchantment(Enchantment.unbreaking1), 1);
    public static ItemStack goldHelmetProjProt4 = new ItemStack(new Item(Material.GOLD_HELMET).addEnchantment(Enchantment.projprot4), 1);

    public static ItemStack goldChestfProt5 = new ItemStack(new Item(Material.GOLD_CHESTPLATE).addEnchantment(Enchantment.fprot5), 1);
    public static ItemStack goldChestProt1 = new ItemStack(new Item(Material.GOLD_CHESTPLATE).addEnchantment(Enchantment.prot1), 1);
    public static ItemStack goldChestBProt3 = new ItemStack(new Item(Material.GOLD_CHESTPLATE).addEnchantment(Enchantment.bprot3), 1);
    public static ItemStack goldChestBProt2 = new ItemStack(new Item(Material.GOLD_CHESTPLATE).addEnchantment(Enchantment.bprot2), 1);
    public static ItemStack goldChestUnbreaking1 = new ItemStack(new Item(Material.GOLD_CHESTPLATE).addEnchantment(Enchantment.unbreaking1), 1);

    public static ItemStack goldLeggingsThorns1Unbreaking5 = new ItemStack(new Item(Material.GOLD_LEGGINGS).addEnchantment(Enchantment.thorns1).addEnchantment(Enchantment.unbreaking5), 1);

    public static ItemStack goldBootsProt2 = new ItemStack(new Item(Material.GOLD_BOOTS).addEnchantment(Enchantment.prot2), 1);
    public static ItemStack goldBootsProt1 = new ItemStack(new Item(Material.GOLD_BOOTS).addEnchantment(Enchantment.prot1), 1);
    //</editor-fold>

    //<editor-fold desc="[Iron armor]">
    public static ItemStack ironHelmetUnbreaking1 = new ItemStack(new Item(Material.IRON_HELMET).addEnchantment(Enchantment.unbreaking1), 1);
    public static ItemStack ironHelmetProt1 = new ItemStack(new Item(Material.IRON_HELMET).addEnchantment(Enchantment.prot1), 1);
    public static ItemStack ironHelmetProt2 = new ItemStack(new Item(Material.IRON_HELMET).addEnchantment(Enchantment.prot2), 1);
    public static ItemStack ironHelmetProt3 = new ItemStack(new Item(Material.IRON_HELMET).addEnchantment(Enchantment.prot3), 1);
    public static ItemStack ironHelmetProjProt4 = new ItemStack(new Item(Material.IRON_HELMET).addEnchantment(Enchantment.projprot4), 1);
    public static ItemStack ironHelmetUnbreaking1Prot1 = new ItemStack(new Item(Material.IRON_HELMET).addEnchantment(Enchantment.unbreaking1).addEnchantment(Enchantment.prot1), 1);
    public static ItemStack ironHelmetFProt3 = new ItemStack(new Item(Material.IRON_HELMET).addEnchantment(Enchantment.fprot3), 1);
    public static ItemStack ironHelmetFProt10 = new ItemStack(new Item(Material.IRON_HELMET).addEnchantment(Enchantment.fprot10), 1);

    public static ItemStack ironChestProt1 = new ItemStack(new Item(Material.IRON_CHESTPLATE).addEnchantment(Enchantment.prot1), 1);
    public static ItemStack ironChestProt2 = new ItemStack(new Item(Material.IRON_CHESTPLATE).addEnchantment(Enchantment.prot2), 1);
    public static ItemStack ironChestProt3 = new ItemStack(new Item(Material.IRON_CHESTPLATE).addEnchantment(Enchantment.prot3), 1);
    public static ItemStack ironChestProt4 = new ItemStack(new Item(Material.IRON_CHESTPLATE).addEnchantment(Enchantment.prot4), 1);
    public static ItemStack ironChestfProt10 = new ItemStack(new Item(Material.IRON_CHESTPLATE).addEnchantment(Enchantment.fprot10), 1);
    public static ItemStack ironChestBProt3 = new ItemStack(new Item(Material.IRON_CHESTPLATE).addEnchantment(Enchantment.bprot3), 1);
    public static ItemStack ironChestBProt4Prot1 = new ItemStack(new Item(Material.IRON_CHESTPLATE).addEnchantment(Enchantment.bprot4).addEnchantment(Enchantment.prot1), 1);
    public static ItemStack ironChestUnbreaking1 = new ItemStack(new Item(Material.IRON_CHESTPLATE).addEnchantment(Enchantment.unbreaking1), 1);

    public static ItemStack ironLeggingsProjProt3 = new ItemStack(new Item(Material.IRON_LEGGINGS).addEnchantment(Enchantment.projprot3), 1);
    public static ItemStack ironLeggingsBProt1 = new ItemStack(new Item(Material.IRON_LEGGINGS).addEnchantment(Enchantment.bprot1), 1);
    public static ItemStack ironLeggingsBProt2 = new ItemStack(new Item(Material.IRON_LEGGINGS).addEnchantment(Enchantment.bprot2), 1);
    public static ItemStack ironLeggingsBProt3 = new ItemStack(new Item(Material.IRON_LEGGINGS).addEnchantment(Enchantment.bprot3), 1);

    public static ItemStack ironBootsProt1 = new ItemStack(new Item(Material.IRON_BOOTS).addEnchantment(Enchantment.prot1), 1);
    public static ItemStack ironBootsProt2 = new ItemStack(new Item(Material.IRON_BOOTS).addEnchantment(Enchantment.prot2), 1);
    public static ItemStack ironBootsProt3 = new ItemStack(new Item(Material.IRON_BOOTS).addEnchantment(Enchantment.prot3), 1);
    public static ItemStack ironBootsProt4 = new ItemStack(new Item(Material.IRON_BOOTS).addEnchantment(Enchantment.prot4), 1);
    public static ItemStack ironBootsProjProt1 = new ItemStack(new Item(Material.IRON_BOOTS).addEnchantment(Enchantment.projprot1), 1);
    public static ItemStack ironBootsProjProt2 = new ItemStack(new Item(Material.IRON_BOOTS).addEnchantment(Enchantment.projprot2), 1);
    public static ItemStack ironBootsProjProt4 = new ItemStack(new Item(Material.IRON_BOOTS).addEnchantment(Enchantment.projprot4), 1);
    public static ItemStack ironBootsFf3 = new ItemStack(new Item(Material.IRON_BOOTS).addEnchantment(Enchantment.ff3), 1);
    public static ItemStack ironBootsFf3Bprot3 = new ItemStack(new Item(Material.IRON_BOOTS).addEnchantment(Enchantment.ff3).addEnchantment(Enchantment.bprot3), 1);
    public static ItemStack ironBootsFf6 = new ItemStack(new Item(Material.IRON_BOOTS).addEnchantment(Enchantment.ff6), 1);
    public static ItemStack ironBootsFf10 = new ItemStack(new Item(Material.IRON_BOOTS).addEnchantment(Enchantment.ff10), 1);
    public static ItemStack ironBootsThorns1Unbreaking5 = new ItemStack(new Item(Material.IRON_BOOTS).addEnchantment(Enchantment.thorns1).addEnchantment(Enchantment.unbreaking5), 1);
    public static ItemStack ironBootsThorns2Unbreaking10 = new ItemStack(new Item(Material.IRON_BOOTS).addEnchantment(Enchantment.thorns2).addEnchantment(Enchantment.unbreaking10), 1);
    public static ItemStack ironBootsFProt3 = new ItemStack(new Item(Material.IRON_BOOTS).addEnchantment(Enchantment.fprot3), 1);

    //</editor-fold>

    //<editor-fold desc="[Diamond armor]">
    public static ItemStack diamondHelmetProt1 = new ItemStack(new Item(Material.DIAMOND_HELMET).addEnchantment(Enchantment.prot1), 1);
    public static ItemStack diamondHelmetProt2 = new ItemStack(new Item(Material.DIAMOND_HELMET).addEnchantment(Enchantment.prot2), 1);
    public static ItemStack diamondHelmetProt3 = new ItemStack(new Item(Material.DIAMOND_HELMET).addEnchantment(Enchantment.prot3), 1);
    public static ItemStack diamondHelmetProt4 = new ItemStack(new Item(Material.DIAMOND_HELMET).addEnchantment(Enchantment.prot4), 1);

    public static ItemStack diamondChestProt1 = new ItemStack(new Item(Material.DIAMOND_CHESTPLATE).addEnchantment(Enchantment.prot1), 1);
    public static ItemStack diamondChestProt2 = new ItemStack(new Item(Material.DIAMOND_CHESTPLATE).addEnchantment(Enchantment.prot2), 1);
    public static ItemStack diamondChestBProt10 = new ItemStack(new Item(Material.DIAMOND_CHESTPLATE).addEnchantment(Enchantment.bprot10), 1);

    public static ItemStack diamondLeggingsBProt3 = new ItemStack(new Item(Material.DIAMOND_LEGGINGS).addEnchantment(Enchantment.bprot3), 1);
    public static ItemStack diamondLeggingsBProt4 = new ItemStack(new Item(Material.DIAMOND_LEGGINGS).addEnchantment(Enchantment.bprot4), 1);

    public static ItemStack diamondBootsProt1 = new ItemStack(new Item(Material.DIAMOND_BOOTS).addEnchantment(Enchantment.prot1), 1);
    public static ItemStack diamondBootsProt2 = new ItemStack(new Item(Material.DIAMOND_BOOTS).addEnchantment(Enchantment.prot2), 1);
    public static ItemStack diamondBootsProt3 = new ItemStack(new Item(Material.DIAMOND_BOOTS).addEnchantment(Enchantment.prot3), 1);
    public static ItemStack diamondBootsProt4 = new ItemStack(new Item(Material.DIAMOND_BOOTS).addEnchantment(Enchantment.prot4), 1);
    public static ItemStack diamondBootsFProt3 = new ItemStack(new Item(Material.DIAMOND_BOOTS).addEnchantment(Enchantment.fprot3), 1);
    //</editor-fold>

    //<editor-fold desc="[Swords]">
    public static ItemStack woodSwordLoot1 = new ItemStack(new Item(Material.WOOD_SWORD).addEnchantment(Enchantment.loot1), 1);
    public static ItemStack woodSwordLoot2 = new ItemStack(new Item(Material.WOOD_SWORD).addEnchantment(Enchantment.loot2), 1);
    public static ItemStack woodSwordSmite10Bane10 = new ItemStack(new Item(Material.WOOD_SWORD).addEnchantment(Enchantment.smite10).addEnchantment(Enchantment.bane10), 1);
    public static ItemStack woodSwordKnockback2Use0 = new ItemStack(new Item(Material.WOOD_SWORD , 0).addEnchantment(Enchantment.kb2), 1);
    public static ItemStack woodSwordKnockback3Use0 = new ItemStack(new Item(Material.WOOD_SWORD , 0).addEnchantment(Enchantment.kb3), 1);
    public static ItemStack woodSwordKnockback4Use0 = new ItemStack(new Item(Material.WOOD_SWORD , 0).addEnchantment(Enchantment.kb4), 1);
    public static ItemStack woodSwordKnockback5Use0 = new ItemStack(new Item(Material.WOOD_SWORD , 0).addEnchantment(Enchantment.kb5), 1);
    public static ItemStack woodSwordKnockback10Use0 = new ItemStack(new Item(Material.WOOD_SWORD , 0).addEnchantment(Enchantment.kb10), 1);
    public static ItemStack woodSwordKnockback1 = new ItemStack(new Item(Material.WOOD_SWORD).addEnchantment(Enchantment.kb1), 1);
    public static ItemStack woodSwordKnockback2 = new ItemStack(new Item(Material.WOOD_SWORD).addEnchantment(Enchantment.kb2), 1);
    public static ItemStack woodSwordProt1 = new ItemStack(new Item(Material.WOOD_SWORD).addEnchantment(Enchantment.prot1), 1);

    public static ItemStack stoneSwordSmite10Bane10 = new ItemStack(new Item(Material.STONE_SWORD).addEnchantment(Enchantment.smite10).addEnchantment(Enchantment.bane10), 1);
    public static ItemStack stoneSwordKnockback1 = new ItemStack(new Item(Material.STONE_SWORD).addEnchantment(Enchantment.kb1), 1);
    public static ItemStack stoneSwordLoot2 = new ItemStack(new Item(Material.STONE_SWORD).addEnchantment(Enchantment.loot2), 1);
    public static ItemStack stoneSwordLoot3 = new ItemStack(new Item(Material.STONE_SWORD).addEnchantment(Enchantment.loot3), 1);
    public static ItemStack stoneSwordUnbreaking1 = new ItemStack(new Item(Material.STONE_SWORD).addEnchantment(Enchantment.unbreaking1), 1);
    public static ItemStack stoneSwordProt1 = new ItemStack(new Item(Material.STONE_SWORD).addEnchantment(Enchantment.prot1), 1);

    public static ItemStack goldSwordUnbreaking10 = new ItemStack(new Item(Material.GOLD_SWORD).addEnchantment(Enchantment.unbreaking10), 1);
    public static ItemStack goldSwordUnbreaking10Sharp1 = new ItemStack(new Item(Material.GOLD_SWORD).addEnchantment(Enchantment.unbreaking10).addEnchantment(Enchantment.sharp1), 1);
    public static ItemStack goldSwordUnbreaking10Sharp2 = new ItemStack(new Item(Material.GOLD_SWORD).addEnchantment(Enchantment.unbreaking10).addEnchantment(Enchantment.sharp2), 1);
    public static ItemStack goldSwordUnbreaking5Sharp2 = new ItemStack(new Item(Material.GOLD_SWORD).addEnchantment(Enchantment.unbreaking5).addEnchantment(Enchantment.sharp2), 1);
    public static ItemStack goldSwordProt1 = new ItemStack(new Item(Material.GOLD_SWORD).addEnchantment(Enchantment.prot1), 1);

    public static ItemStack ironSwordLoot3 = new ItemStack(new Item(Material.IRON_SWORD).addEnchantment(Enchantment.loot3), 1);
    public static ItemStack ironSwordUnbreaking1 = new ItemStack(new Item(Material.IRON_SWORD).addEnchantment(Enchantment.unbreaking1), 1);
    public static ItemStack ironSwordKnockback1 = new ItemStack(new Item(Material.IRON_SWORD).addEnchantment(Enchantment.kb1), 1);
    public static ItemStack ironSwordKnockback2 = new ItemStack(new Item(Material.IRON_SWORD).addEnchantment(Enchantment.kb2), 1);
    public static ItemStack ironSwordFireAsp1 = new ItemStack(new Item(Material.IRON_SWORD).addEnchantment(Enchantment.fireAsp1), 1);
    public static ItemStack ironSwordFireAsp2 = new ItemStack(new Item(Material.IRON_SWORD).addEnchantment(Enchantment.fireAsp2), 1);
    public static ItemStack ironSwordProt1 = new ItemStack(new Item(Material.IRON_SWORD).addEnchantment(Enchantment.prot1), 1);

    public static ItemStack diamondSwordSharp1 = new ItemStack(new Item(Material.DIAMOND_SWORD).addEnchantment(Enchantment.sharp1), 1);
    public static ItemStack diamondSwordSharp2 = new ItemStack(new Item(Material.DIAMOND_SWORD).addEnchantment(Enchantment.sharp2), 1);
    public static ItemStack diamondSwordProt1 = new ItemStack(new Item(Material.DIAMOND_SWORD).addEnchantment(Enchantment.prot1), 1);

    //</editor-fold>

    //<editor-fold desc="[Tools]">
    public static ItemStack stonePickFortune3 = new ItemStack(new Item(Material.STONE_PICKAXE).addEnchantment(Enchantment.fortune3), 1);
    public static ItemStack ironPickFortune1 = new ItemStack(new Item(Material.IRON_PICKAXE).addEnchantment(Enchantment.fortune1), 1);
    public static ItemStack ironPickEff3Sharp1Unbreaking3 = new ItemStack(new Item(Material.IRON_PICKAXE).addEnchantment(Enchantment.efficiency3).addEnchantment(Enchantment.sharp1).addEnchantment(Enchantment.unbreaking3));
    public static ItemStack ironPickSharp1 = new ItemStack(new Item(Material.IRON_PICKAXE).addEnchantment(Enchantment.sharp1), 1);
    public static ItemStack diamondPickSharp1 = new ItemStack(new Item(Material.DIAMOND_PICKAXE).addEnchantment(Enchantment.sharp1), 1);
    public static ItemStack diamondPickSharp1Fortune1 = new ItemStack(new Item(Material.DIAMOND_PICKAXE).addEnchantment(Enchantment.sharp1).addEnchantment(Enchantment.fortune1), 1);
    public static ItemStack diamondPickSharp1Fortune2 = new ItemStack(new Item(Material.DIAMOND_PICKAXE).addEnchantment(Enchantment.sharp1).addEnchantment(Enchantment.fortune2), 1);
    public static ItemStack diamondPickSharp2Fortune2 = new ItemStack(new Item(Material.DIAMOND_PICKAXE).addEnchantment(Enchantment.sharp2).addEnchantment(Enchantment.fortune2), 1);
    public static ItemStack diamondPickEff1 = new ItemStack(new Item(Material.DIAMOND_PICKAXE).addEnchantment(Enchantment.efficiency1), 1);

    public static ItemStack fishingRodSilk1Unbreaking2 = new ItemStack(new Item(Material.FISHING_ROD).addEnchantment(Enchantment.silkTouch1).addEnchantment(Enchantment.unbreaking2), 1);
    public static ItemStack fishingRodUnbreaking1 = new ItemStack(new Item(Material.FISHING_ROD).addEnchantment(Enchantment.unbreaking1), 1);
    public static ItemStack fishingRodLure3 = new ItemStack(new Item(Material.FISHING_ROD).addEnchantment(Enchantment.lure3), 1);
    public static ItemStack fishingRodLure3Lots4 = new ItemStack(new Item(Material.FISHING_ROD).addEnchantment(Enchantment.lure3).addEnchantment(Enchantment.lots4), 1);
    public static ItemStack fishingRodUnbreaking1Sharp1 = new ItemStack(new Item(Material.FISHING_ROD).addEnchantment(Enchantment.unbreaking1).addEnchantment(Enchantment.sharp1), 1);
    public static ItemStack fishingRodUnbreaking1Sharp2 = new ItemStack(new Item(Material.FISHING_ROD).addEnchantment(Enchantment.unbreaking1).addEnchantment(Enchantment.sharp2), 1);
    public static ItemStack fishingRodUnbreaking1Sharp3 = new ItemStack(new Item(Material.FISHING_ROD).addEnchantment(Enchantment.unbreaking1).addEnchantment(Enchantment.sharp3), 1);
    public static ItemStack fishingRodUnbreaking1Sharp4 = new ItemStack(new Item(Material.FISHING_ROD).addEnchantment(Enchantment.unbreaking1).addEnchantment(Enchantment.sharp4), 1);
    public static ItemStack fishingRodUnbreaking1Sharp5lots3 = new ItemStack(new Item(Material.FISHING_ROD).addEnchantment(Enchantment.unbreaking1).addEnchantment(Enchantment.sharp5).addEnchantment(Enchantment.lots3), 1);
    public static ItemStack fishingRodUnbreaking10Knockback1 = new ItemStack(new Item(Material.FISHING_ROD).addEnchantment(Enchantment.unbreaking10).addEnchantment(Enchantment.kb1), 1);

    public static ItemStack woodAxeEff1 = new ItemStack(new Item(Material.WOOD_AXE).addEnchantment(Enchantment.efficiency1), 1);
    public static ItemStack woodAxeSmite10Bane10 = new ItemStack(new Item(Material.WOOD_AXE).addEnchantment(Enchantment.smite10).addEnchantment(Enchantment.bane10), 1);
    public static ItemStack stoneAxeEff1 = new ItemStack(new Item(Material.STONE_AXE).addEnchantment(Enchantment.efficiency1), 1);
    public static ItemStack stoneAxeEff5 = new ItemStack(new Item(Material.STONE_AXE).addEnchantment(Enchantment.efficiency5), 1);
    public static ItemStack stoneAxeKnockback1 = new ItemStack(new Item(Material.STONE_AXE).addEnchantment(Enchantment.kb1), 1);
    public static ItemStack stoneAxeFireAsp1Use2 = new ItemStack(new Item(Material.STONE_AXE, 2).addEnchantment(Enchantment.fireAsp1), 1);
    public static ItemStack stoneAxeFireAsp1Use3 = new ItemStack(new Item(Material.STONE_AXE, 3).addEnchantment(Enchantment.fireAsp1), 1);
    public static ItemStack ironAxeFireAsp1Use3 = new ItemStack(new Item(Material.IRON_AXE, 3).addEnchantment(Enchantment.fireAsp1), 1);
    public static ItemStack ironAxeFireAsp1Use4 = new ItemStack(new Item(Material.IRON_AXE, 4).addEnchantment(Enchantment.fireAsp1), 1);
    public static ItemStack ironAxeSharp1 = new ItemStack(new Item(Material.IRON_AXE).addEnchantment(Enchantment.sharp1), 1);
    public static ItemStack ironAxeEff1 = new ItemStack(new Item(Material.IRON_AXE).addEnchantment(Enchantment.efficiency1), 1);
    public static ItemStack ironAxeKnockback1 = new ItemStack(new Item(Material.IRON_AXE).addEnchantment(Enchantment.kb1), 1);
    public static ItemStack diamondAxeKnockback1 = new ItemStack(new Item(Material.DIAMOND_AXE).addEnchantment(Enchantment.kb1), 1);
    public static ItemStack diamondAxeEff1 = new ItemStack(new Item(Material.DIAMOND_AXE).addEnchantment(Enchantment.efficiency1), 1);
    public static ItemStack diamondAxeEff1Sharp1 = new ItemStack(new Item(Material.DIAMOND_AXE).addEnchantment(Enchantment.efficiency1).addEnchantment(Enchantment.sharp1), 1);
    public static ItemStack diamondAxeEff3Unbreaking2 = new ItemStack(new Item(Material.DIAMOND_AXE).addEnchantment(Enchantment.efficiency3).addEnchantment(Enchantment.unbreaking2), 1);

    public static ItemStack ironShovelUnbreaking3 = new ItemStack(new Item(Material.IRON_SPADE).addEnchantment(Enchantment.unbreaking3), 1);
    public static ItemStack diamondShovelSharp1 = new ItemStack(new Item(Material.DIAMOND_SPADE).addEnchantment(Enchantment.sharp1), 1);

    public static ItemStack woodHoeSharp1 = new ItemStack(new Item(Material.WOOD_HOE).addEnchantment(Enchantment.sharp1), 1);
    public static ItemStack goldHoeSharp2 = new ItemStack(new Item(Material.GOLD_HOE).addEnchantment(Enchantment.sharp2), 1);
    public static ItemStack stoneHoeSharp3 = new ItemStack(new Item(Material.STONE_HOE).addEnchantment(Enchantment.sharp3), 1);
    public static ItemStack ironHoeSharp4 = new ItemStack(new Item(Material.IRON_HOE).addEnchantment(Enchantment.sharp4), 1);
    public static ItemStack diamondHoeSharp5 = new ItemStack(new Item(Material.DIAMOND_HOE).addEnchantment(Enchantment.sharp5), 1);
    public static ItemStack diamondHoeUnbreaking3 = new ItemStack(new Item(Material.DIAMOND_HOE).addEnchantment(Enchantment.unbreaking3), 1);
    public static ItemStack diamondHoeUnbreaking3Loot3 = new ItemStack(new Item(Material.DIAMOND_HOE).addEnchantment(Enchantment.unbreaking3).addEnchantment(Enchantment.loot3), 1);
    public static ItemStack diamondHoeUnbreaking3Loot3Sharp5 = new ItemStack(new Item(Material.DIAMOND_HOE).addEnchantment(Enchantment.unbreaking3).addEnchantment(Enchantment.loot3).addEnchantment(Enchantment.sharp5), 1);
    public static ItemStack diamondHoeUnbreaking3Loot3Sharp6 = new ItemStack(new Item(Material.DIAMOND_HOE).addEnchantment(Enchantment.unbreaking3).addEnchantment(Enchantment.loot3).addEnchantment(Enchantment.sharp6), 1);

    public static ItemStack flintNSteelUnbreaking10 = new ItemStack(new Item(Material.FLINT_AND_STEEL).addEnchantment(Enchantment.unbreaking10), 1);
    //</editor-fold>

    //<editor-fold desc="[Random]">
    public static ItemStack rosekb1 = new ItemStack(new Item(Material.RED_ROSE).addEnchantment(Enchantment.kb1), 1);
    public static ItemStack eyeOfEnderSharp1 = new ItemStack(new Item(Material.EYE_OF_ENDER).addEnchantment(Enchantment.sharp1), 1);
    public static ItemStack eyeOfEnderSharp2 = new ItemStack(new Item(Material.EYE_OF_ENDER).addEnchantment(Enchantment.sharp2), 2);
    public static ItemStack eyeOfEnderSharp3 = new ItemStack(new Item(Material.EYE_OF_ENDER).addEnchantment(Enchantment.sharp3), 3);
    public static ItemStack eyeOfEnderSharp4 = new ItemStack(new Item(Material.EYE_OF_ENDER).addEnchantment(Enchantment.sharp4), 4);
    public static ItemStack eyeOfEnderSharp5 = new ItemStack(new Item(Material.EYE_OF_ENDER).addEnchantment(Enchantment.sharp5), 5);

    public static ItemStack witherSkeletonHeadProt1 = new ItemStack(new Item(Material.SKULL, 1).addEnchantment(Enchantment.prot1), 1);
    public static ItemStack witherSkeletonHeadProt2 = new ItemStack(new Item(Material.SKULL, 1).addEnchantment(Enchantment.prot2), 1);
    public static ItemStack witherSkeletonHeadProt3Ff1 = new ItemStack(new Item(Material.SKULL, 1).addEnchantment(Enchantment.prot3).addEnchantment(Enchantment.ff1), 1);
    public static ItemStack witherSkeletonHeadProt3Ff2 = new ItemStack(new Item(Material.SKULL, 1).addEnchantment(Enchantment.prot3).addEnchantment(Enchantment.ff2), 1);
    public static ItemStack witherSkeletonHeadProt4Ff3 = new ItemStack(new Item(Material.SKULL, 1).addEnchantment(Enchantment.prot4).addEnchantment(Enchantment.ff3), 1);
    public static ItemStack witherSkeletonHeadProt5Ff4 = new ItemStack(new Item(Material.SKULL, 1).addEnchantment(Enchantment.prot5).addEnchantment(Enchantment.ff4), 1);

    //<editor-fold desc="[BOOKS]">
    public static Item enchantedBookProt3Sharp1 = new Item(Material.ENCHANTED_BOOK).addEnchantment(Enchantment.prot3).addEnchantment(Enchantment.sharp1);
    public static Item enchantedBookSharp1 = new Item(Material.ENCHANTED_BOOK).addEnchantment(Enchantment.sharp1);
    public static Item enchantedBookProt2 = new Item(Material.ENCHANTED_BOOK).addEnchantment(Enchantment.prot2);
    public static Item enchantedBookProt3 = new Item(Material.ENCHANTED_BOOK).addEnchantment(Enchantment.prot3);
    public static Item enchantedBookProt4 = new Item(Material.ENCHANTED_BOOK).addEnchantment(Enchantment.prot4);
    public static Item enchantedBookProjProt2 = new Item(Material.ENCHANTED_BOOK).addEnchantment(Enchantment.projprot2);
    public static Item enchantedBookProjProt3 = new Item(Material.ENCHANTED_BOOK).addEnchantment(Enchantment.projprot3);
    public static Item enchantedBookProjProt4 = new Item(Material.ENCHANTED_BOOK).addEnchantment(Enchantment.projprot4);
    //</editor-fold>

    //</editor-fold>


    //</editor-fold>

    //</editor-fold>
}