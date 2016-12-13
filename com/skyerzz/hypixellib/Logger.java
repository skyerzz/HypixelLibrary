package com.skyerzz.hypixellib;


import java.util.ArrayList;

/**
 * Created by sky on 7-7-2016.
 */
public class Logger {

    private static final String prefix = "[HypixelAPI] ";

    public Logger(){

    }

    public static void logInfo(String s) {
        System.out.println(prefix + "[INFO] " + s);
    }

    public static void logWarn(String s) {
        System.out.println(prefix + "[WARNING] " + s);
    }

    public static void logError(String s) {
        System.out.println(prefix + "[ERROR] " + s);
    }
}
