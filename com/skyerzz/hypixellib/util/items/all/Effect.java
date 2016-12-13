package com.skyerzz.hypixellib.util.items.all;

/**
 * Created by Ruben on 13/09/2016.
 */
public class Effect {

    private int level,duration;
    private EffectType type;

    public Effect(EffectType type, int level, int duration){
        this.type = type;
        this.level = level;
        this.duration = duration;
    }

    public int getLevel() {
        return level;
    }

    public int getDuration() {
        return duration;
    }

    public EffectType getType() {
        return type;
    }
}
