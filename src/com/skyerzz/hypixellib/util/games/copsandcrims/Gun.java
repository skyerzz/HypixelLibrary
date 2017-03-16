package com.skyerzz.hypixellib.util.games.copsandcrims;

import com.skyerzz.hypixellib.util.Currency;

/**
 * Created by sky on 7-8-2016.
 */
public class Gun {

    private int damageIncrease=0, recoilReduction=0, reloadReduction=0, costReduction=0, targetAquire=0;
    private GUNTYPE gunType;
    private GunSkin selectedSkin;
    private boolean ammoClip;

    public Gun(GUNTYPE guntype, GunSkin selectedSkin, boolean ammoClip, int firstPerk, int secondPerk, int thirdPerk, int fourthPerk) throws IncompatibleGunSkinException{
        this.gunType = guntype;
        this.selectedSkin = selectedSkin;
        if(selectedSkin.getGunType() != guntype){
            throw new IncompatibleGunSkinException(selectedSkin, guntype);
        }

        this.ammoClip = ammoClip;

        this.damageIncrease = firstPerk;
        this.reloadReduction = thirdPerk;
        this.costReduction = fourthPerk;
        if(guntype==GUNTYPE.SNIPER){
            this.targetAquire = secondPerk;
        }else{
            this.recoilReduction = secondPerk;
        }
    }

    public int getDamageIncrease() {
        return damageIncrease;
    }

    public int getRecoilReduction() throws IncompatbileGunPerkException {
        if(gunType==GUNTYPE.SNIPER){
            throw new IncompatbileGunPerkException();
        }
        return recoilReduction;
    }

    public int getReloadReduction() {
        return reloadReduction;
    }

    public int getCostReduction() throws IncompatbileGunPerkException {
        if(gunType==GUNTYPE.PISTOL){
            throw new IncompatbileGunPerkException();
        }
        return costReduction;
    }

    public int getTargetAquire() throws IncompatbileGunPerkException {
        if(gunType!=GUNTYPE.SNIPER){
            throw new IncompatbileGunPerkException();
        }
        return targetAquire;
    }

    public GUNTYPE getGunType() {
        return gunType;
    }

    public GunSkin getSelectedSkin() {
        return selectedSkin;
    }

    public boolean isAmmoClip() {
        return ammoClip;
    }

    public int getCost(int level){
        double multiplier = gunType.getCostMultiplier();
        switch(level){
            case 1:
                return (int) (50*multiplier);
            case 2:
                return (int) (100*multiplier);
            case 3:
                return (int) (250*multiplier);
            case 4:
                return (int) (625*multiplier);
            case 5:
                return (int) (1550*multiplier);
            case 6:
                return (int) (4000*multiplier);
            case 7:
                return (int) (10000*multiplier);
            case 8:
                return (int) (25000*multiplier);
            case 9:
                return (int) (90000*multiplier);
            default: return 0;
        }
    }

    public int getAmmoClipCost(){
        return (int) (25000*gunType.getCostMultiplier());
    }

    public Currency getCurrencyType(){
        return Currency.COINS;
    }

    private class IncompatibleGunSkinException extends Exception{

        private GunSkin gunskin;
        private GUNTYPE guntype;

        public IncompatibleGunSkinException(GunSkin gunskin, GUNTYPE guntype){
            this.gunskin = gunskin;
            this.guntype = guntype;
        }

        private GUNTYPE getGuntype(){
            return guntype;
        }

        private GunSkin getGunskin(){
            return gunskin;
        }

    }

    private class IncompatbileGunPerkException extends Exception{

    }

    public enum GUNTYPE{
        PISTOL(1),
        MAGNUM(1.5),
        SMG(2),
        CARBINE(2),
        RIFLE(2),
        SHOTGUN(2),
        SNIPER(2);

        private double costMultiplier;

        GUNTYPE(double costMultiplier){
            this.costMultiplier = costMultiplier;
        }

        public double getCostMultiplier(){return costMultiplier;}
    }


}
