package com.skyerzz.hypixellib.util.games.quake;

/**
 * Created by Ruben on 11/09/2016.
 */
public class Gun {

    private Barrel barrel;
    private Case aCase;
    private Muzzle muzzle;
    private Sight sight;
    private Trigger trigger;

    public Gun(Barrel barrel, Case aCase, Muzzle muzzle, Sight sight, Trigger trigger){
        this.barrel = barrel;
        this.aCase = aCase;
        this.muzzle = muzzle;
        this.sight = sight;
        this.trigger = trigger;
    }

    private String getGunName(){
        //todo find this out
        return null;
    }

    public Barrel getBarrel() {
        return barrel;
    }

    public Case getCase() {
        return aCase;
    }

    public Muzzle getMuzzle() {
        return muzzle;
    }

    public Sight getSight() {
        return sight;
    }

    public Trigger getTrigger() {
        return trigger;
    }
}
