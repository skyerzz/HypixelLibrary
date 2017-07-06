package com.skyerzz.hypixellib.util.network.collectibles.suit;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by sky on 4-7-2017.
 */
public class Suit {

    private SuitType suitType;

    private SuitPart helmet, chestplate, leggings, boots;

    public Suit(SuitType suitType, SuitPart...parts){
        this.suitType = suitType;
        for(SuitPart suitPart:  parts){
            switch(suitPart.getPartType()){
                case HELMET:
                    helmet = suitPart;
                    break;
                case CHESTPLATE:
                    chestplate = suitPart;
                    break;
                case LEGGINGS:
                    leggings = suitPart;
                    break;
                case BOOTS:
                    boots = suitPart;
                    break;
            }
        }
    }
}
