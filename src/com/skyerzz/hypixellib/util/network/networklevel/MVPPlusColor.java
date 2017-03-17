package com.skyerzz.hypixellib.util.network.networklevel;

import java.util.ArrayList;

/**
 * Created by Skyerzz-LAPOTOP on 16/03/2017.
 */
public class MVPPlusColor {

    private PlusColor color;

    public MVPPlusColor(PlusColor color){
        this.color = color;
    }

    public PlusColor getColor(){
        return color;
    }


    public enum PlusColor{
        RED("Red", 0), //todo finish this
        AQUA("Aqua", 0),
        WHITE("Wite", 0),
        GOLD("Gold", 0),
        BLACK("Black", 0);

        private int unlockedLevel;
        private String display;

        PlusColor(String colorDisplay, int unlockedLevel){
            this.unlockedLevel= unlockedLevel;
            this.display = colorDisplay;
        }

        public static final ArrayList<String> mapping = initializeMapping();

        private static ArrayList<String> initializeMapping(){
            ArrayList<String> list = new ArrayList<String>();
            for(PlusColor item: PlusColor.values()){
                list.add(item.name());
            }
            return list;
        }

        /**
         * Gets the level on which you unlock the specified color
         * @return the level where you unlock the color
         */
        public int getLevelOfUnlock(){
            return unlockedLevel;
        }

        /**
         * Returns the color as a string-format
         * @return the color as a string
         */
        public String getDisplayString(){
            return display;
        }
    }
}
