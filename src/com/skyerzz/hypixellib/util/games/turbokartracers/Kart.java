package com.skyerzz.hypixellib.util.games.turbokartracers;

import java.util.ArrayList;

/**
 * Created by sky on 2-8-2016.
 */
public class Kart {

    private KARTSKIN skin;
    private HORN horn;
    private PARTICLETRAIL particleTrail;

    private ArrayList<KartPart> kartParts = new ArrayList<>();

    public Kart(KARTSKIN skin, HORN horn, PARTICLETRAIL trail, KartPart...kartParts){
        this.skin = skin;
        for(KartPart kartPart: kartParts){
            this.kartParts.add(kartPart);
        }
    }

    public KARTSKIN getSkin(){
        return skin;
    }

    public ArrayList<KartPart> getKartParts(){
        return kartParts;
    }

    public HORN getHorn(){
        return horn;
    }

    public PARTICLETRAIL getParticleTrail(){
        return particleTrail;
    }
}
