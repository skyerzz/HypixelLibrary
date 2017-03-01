package com.skyerzz.hypixellib.util.games.arena;

import java.util.ArrayList;

/**
 * Created by sky on 27-2-2017.
 */
public enum COMBATUPGRADE {
    MELEE("Melee Upgrade", "Melee Damage: %%VALUE%%"),
    HEALTH("Helath Upgrade", "Maximum Health: %%VALUE%%"),
    ENERGY("Energy Upgrade", "Maximum Energy: %%VALUE%%"),
    COOLDOWN("Cooldown Upgrade", "Cooldown Reduction: %%VALUE%%%");

    private String name, description;

    COMBATUPGRADE(String name, String description){
        this.name = name;
        this.description = description;
    }

    public static final ArrayList<String> mapping = initializeMapping();

    private static java.util.ArrayList<String> initializeMapping(){
        ArrayList<String> list = new ArrayList<String>();
        for(COMBATUPGRADE item: COMBATUPGRADE.values()){
            list.add(item.name());
        }
        return list;
    }

    /**
     * returns Damage per hit for MELEE, Max Health for HEALTH, max Energy for ENERGY, cooldown reduction for COOLDOWN
     * @return value
     */
    public double getValue(int level){
        if(level < 0 || level > 9){
            return -1;
        }
        switch(this){
            case MELEE:
                if(level < 5){
                    return 10.00 + 0.22*level;
                }else if(level < 9){
                    return 11.11 + 0.22*(level-5);
                }else{
                    return 12.00;
                }
            case HEALTH:
                if(level < 5){
                    return 2000 + 22*level;
                }else if(level < 9){
                    return 2111 + 22*(level-5);
                }else{
                    return 2220;
                }
            case ENERGY:
                if(level < 5){
                    return 100 + 2*level;
                }else if(level < 9){
                    return 111 + 2*(level-5);
                }else{
                    return 120;
                }
            case COOLDOWN:
                if(level < 9){
                    return 1.11*level;
                }else{
                    return 10;
                }
        }
        return -1;
    }

    public String getDescription(int level){
        return description.replace("%%VALUE%%", getValue(level)+"");
    }

    public int getCost(int level){
        if (level < 0 || level > 9) {
            return -1;
        }
        switch(level){
            case 1:
                return 880;
            case 2:
                return 3520;
            case 3:
                return 7920;
            case 4:
                return 14080;
            case 5:
                return 22000;
            case 6:
                return 31680;
            case 7:
                return 43120;
            case 8:
                return 56320;
            case 9:
                return 71280;
        }
        return -1;
    }
}
