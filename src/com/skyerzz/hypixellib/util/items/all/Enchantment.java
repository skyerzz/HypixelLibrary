package com.skyerzz.hypixellib.util.items.all;

/**
 * Created by Ruben on 13/09/2016.
 */
public class Enchantment {

    private int level;
    private EnchantmentType type;

    public Enchantment(EnchantmentType type, int level){
        this.type = type;
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public EnchantmentType getType() {
        return type;
    }

    //<editor-fold desc="[Predefined Enchantments]">
    public static Enchantment fortune1 = new Enchantment(EnchantmentType.FORTUNE, 1);
    public static Enchantment fortune3 = new Enchantment(EnchantmentType.FORTUNE, 3);
    public static Enchantment lure3 = new Enchantment(EnchantmentType.LURE, 3);
    public static Enchantment loot3 = new Enchantment(EnchantmentType.LOOTING, 3);
    public static Enchantment power1 = new Enchantment(EnchantmentType.POWER, 1);
    public static Enchantment power2 = new Enchantment(EnchantmentType.POWER, 2);
    public static Enchantment power3 = new Enchantment(EnchantmentType.POWER, 3);
    public static Enchantment kb1 = new Enchantment(EnchantmentType.KNOCKBACK, 1);
    public static Enchantment kb2 = new Enchantment(EnchantmentType.KNOCKBACK, 2);
    public static Enchantment kb3 = new Enchantment(EnchantmentType.KNOCKBACK, 3);
    public static Enchantment kb4 = new Enchantment(EnchantmentType.KNOCKBACK, 4);
    public static Enchantment kb5 = new Enchantment(EnchantmentType.KNOCKBACK, 5);
    public static Enchantment kb10 = new Enchantment(EnchantmentType.KNOCKBACK, 10);
    public static Enchantment punch1 = new Enchantment(EnchantmentType.PUNCH, 1);
    public static Enchantment punch2 = new Enchantment(EnchantmentType.PUNCH, 2);
    public static Enchantment punch3 = new Enchantment(EnchantmentType.PUNCH, 3);
    public static Enchantment fireAsp1 = new Enchantment(EnchantmentType.FIRE_ASPECT, 1);
    public static Enchantment bane10 = new Enchantment(EnchantmentType.BANE_OF_ARHTROPONDS, 10);
    public static Enchantment smite10 = new Enchantment(EnchantmentType.SMITE, 10);
    public static Enchantment sharp1 = new Enchantment(EnchantmentType.SHARPNESS, 1);
    public static Enchantment sharp2 = new Enchantment(EnchantmentType.SHARPNESS, 2);
    public static Enchantment sharp3 = new Enchantment(EnchantmentType.SHARPNESS, 3);
    public static Enchantment sharp4 = new Enchantment(EnchantmentType.SHARPNESS, 4);
    public static Enchantment sharp5 = new Enchantment(EnchantmentType.SHARPNESS, 5);
    public static Enchantment sharp6 = new Enchantment(EnchantmentType.SHARPNESS, 6);
    public static Enchantment lots3 = new Enchantment(EnchantmentType.LUCK_OF_THE_SEA, 3);
    public static Enchantment lots4 = new Enchantment(EnchantmentType.LUCK_OF_THE_SEA, 4);
    public static Enchantment resp1 = new Enchantment(EnchantmentType.RESPIRATION, 1);
    public static Enchantment resp3 = new Enchantment(EnchantmentType.RESPIRATION, 3);
    public static Enchantment prot1 = new Enchantment(EnchantmentType.PROTECTION, 1);
    public static Enchantment prot2 = new Enchantment(EnchantmentType.PROTECTION, 2);
    public static Enchantment prot3 = new Enchantment(EnchantmentType.PROTECTION, 3);
    public static Enchantment prot4 = new Enchantment(EnchantmentType.PROTECTION, 4);
    public static Enchantment prot5 = new Enchantment(EnchantmentType.PROTECTION, 5);
    public static Enchantment projprot1 = new Enchantment(EnchantmentType.PROJECTILE_PROTECTION, 1);
    public static Enchantment projprot2 = new Enchantment(EnchantmentType.PROJECTILE_PROTECTION, 2);
    public static Enchantment projprot3 = new Enchantment(EnchantmentType.PROJECTILE_PROTECTION, 3);
    public static Enchantment projprot4 = new Enchantment(EnchantmentType.PROJECTILE_PROTECTION, 4);
    public static Enchantment projprot5 = new Enchantment(EnchantmentType.PROJECTILE_PROTECTION, 5);
    public static Enchantment silkTouch1 = new Enchantment(EnchantmentType.SILK_TOUCH, 1);
    public static Enchantment unbreaking10 = new Enchantment(EnchantmentType.UNBREAKING, 10);
    public static Enchantment unbreaking5 = new Enchantment(EnchantmentType.UNBREAKING, 5);
    public static Enchantment unbreaking3 = new Enchantment(EnchantmentType.UNBREAKING, 3);
    public static Enchantment unbreaking2 = new Enchantment(EnchantmentType.UNBREAKING, 2);
    public static Enchantment unbreaking1 = new Enchantment(EnchantmentType.UNBREAKING, 1);
    public static Enchantment bprot1 = new Enchantment(EnchantmentType.BLAST_PROTECTION, 1);
    public static Enchantment bprot2 = new Enchantment(EnchantmentType.BLAST_PROTECTION, 2);
    public static Enchantment bprot3 = new Enchantment(EnchantmentType.BLAST_PROTECTION, 3);
    public static Enchantment bprot4 = new Enchantment(EnchantmentType.BLAST_PROTECTION, 4);
    public static Enchantment bprot5 = new Enchantment(EnchantmentType.BLAST_PROTECTION, 5);
    public static Enchantment bprot10 = new Enchantment(EnchantmentType.BLAST_PROTECTION, 10);
    public static Enchantment ff1 = new Enchantment(EnchantmentType.FEATHER_FALLING, 1);
    public static Enchantment ff2 = new Enchantment(EnchantmentType.FEATHER_FALLING, 2);
    public static Enchantment ff3 = new Enchantment(EnchantmentType.FEATHER_FALLING, 3);
    public static Enchantment ff4 = new Enchantment(EnchantmentType.FEATHER_FALLING, 4);
    public static Enchantment ff5 = new Enchantment(EnchantmentType.FEATHER_FALLING, 5);
    public static Enchantment ff6 = new Enchantment(EnchantmentType.FEATHER_FALLING, 6);
    public static Enchantment ff10 = new Enchantment(EnchantmentType.FEATHER_FALLING, 10);
    public static Enchantment fprot1 = new Enchantment(EnchantmentType.FIRE_PROTECTION, 1);
    public static Enchantment fprot2 = new Enchantment(EnchantmentType.FIRE_PROTECTION, 2);
    public static Enchantment fprot3 = new Enchantment(EnchantmentType.FIRE_PROTECTION, 3);
    public static Enchantment fprot4 = new Enchantment(EnchantmentType.FIRE_PROTECTION, 4);
    public static Enchantment fprot5 = new Enchantment(EnchantmentType.FIRE_PROTECTION, 5);
    public static Enchantment fprot10 = new Enchantment(EnchantmentType.FIRE_PROTECTION, 10);
    public static Enchantment thorns1 = new Enchantment(EnchantmentType.THORNS, 1);
    public static Enchantment thorns2 = new Enchantment(EnchantmentType.THORNS, 2);
    public static Enchantment efficiency1 = new Enchantment(EnchantmentType.EFFICIENCY, 1);
    public static Enchantment efficiency3 = new Enchantment(EnchantmentType.EFFICIENCY, 3);
    public static Enchantment efficiency5 = new Enchantment(EnchantmentType.EFFICIENCY, 5);
    //</editor-fold>
}