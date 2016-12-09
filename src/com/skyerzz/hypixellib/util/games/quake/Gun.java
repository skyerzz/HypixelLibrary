package com.skyerzz.hypixellib.util.games.quake;

/**
 * Created by Ruben on 11/09/2016.
 */
public class Gun {

    private BARREL barrel;
    private CASE aCase;
    private MUZZLE muzzle;
    private SIGHT sight;
    private TRIGGER trigger;

    public Gun(BARREL barrel, CASE aCase, MUZZLE muzzle, SIGHT sight, TRIGGER trigger){
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

    public BARREL getBarrel() {
        return barrel;
    }

    public CASE getaCase() {
        return aCase;
    }

    public MUZZLE getMuzzle() {
        return muzzle;
    }

    public SIGHT getSight() {
        return sight;
    }

    public TRIGGER getTrigger() {
        return trigger;
    }
}
