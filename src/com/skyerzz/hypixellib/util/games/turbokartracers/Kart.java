package com.skyerzz.hypixellib.util.games.turbokartracers;

import java.util.ArrayList;

/**
 * Created by sky on 2-8-2016.
 */
public class Kart {

    private KartSkin skin;
    private Horn horn;
    private ParticleTrail particleTrail;

    private ArrayList<KartPart> kartParts = new ArrayList<>();

    public Kart(KartSkin skin, Horn horn, ParticleTrail trail, KartPart...kartParts){
        this.skin = skin;
        for(KartPart kartPart: kartParts){
            this.kartParts.add(kartPart);
        }
    }

    public KartSkin getSkin(){
        return skin;
    }

    public ArrayList<KartPart> getKartParts(){
        return kartParts;
    }

    public Horn getHorn(){
        return horn;
    }

    public ParticleTrail getParticleTrail(){
        return particleTrail;
    }
}
