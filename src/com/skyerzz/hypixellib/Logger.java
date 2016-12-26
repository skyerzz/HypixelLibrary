package com.skyerzz.hypixellib;


import java.util.ArrayList;

/**
 * Created by sky on 7-7-2016.
 */
public class Logger {

    private static final String prefix = "[HypixelAPI] ";

    private static boolean logInfo = true, logWarn = true, logError = true;

    public Logger(){

    }

    public static void logInfo(String s) {
        if(logInfo){
            System.out.println(prefix + "[INFO] " + s);
        }
    }

    public static void logWarn(String s) {
        if(logWarn) {
            System.out.println(prefix + "[WARNING] " + s);
        }
    }

    public static void logError(String s) {
        if(logError) {
            System.out.println(prefix + "[ERROR] " + s);
        }
    }

    public static void toggleErrorLogging(boolean errors){
        logError = errors;
    }

    public static void toggleWarnLogging(boolean warn){
        logWarn = warn;
    }

    public static void toggleInfoLogging(boolean info){
        logInfo = info;
    }
}
