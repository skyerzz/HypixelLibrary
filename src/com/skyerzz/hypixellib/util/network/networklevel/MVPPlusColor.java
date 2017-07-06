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
        GOLD("Gold", 35),
        GREEN("Green", 45),
        YELLOW("Yellow", 55),
        LIGHT_PURPLE("Purple", 65),
        WHITE("White", 75),
        BLUE("Blue", 85),
        DARK_GREEN("Dark Green", 95),
        DARK_RED("Dark Red", 150),
        DARK_AQUA("Dark Aqua", 150),
        DARK_PURPLE("Dark Purple", 200),
        DARK_GRAY("Dark Gray", 200),
        BLACK("Black", 250);

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

        public static PlusColor getFromString(String color){
            color = color.toUpperCase().trim().replace("RANKCOLOR_", "");
            if(mapping.contains(color)){
                return PlusColor.valueOf(color);
            }
            return null;
        }
    }
}
