package com.skyerzz.hypixellib;


import java.util.ArrayList;

/**
 * Created by sky on 7-7-2016.
 */
public class Logger {

    private static final String prefix = "[HypixelAPI] ";

    private static boolean logInfo = true, logWarn = true, logError = true, logSkippedValues = false;
    private static int totalInfos = 0, totalWarns = 0, totalErrors = 0, totalSkips = 0;

    public Logger(){

    }

    public static void logInfo(String s) {
        totalInfos++;
        if(logInfo){
            System.out.println(prefix + "[INFO] " + s);
        }
    }

    public static void logWarn(String s) {
        totalWarns++;
        if(logWarn) {
            System.out.println(prefix + "[WARNING] " + s);
        }
    }

    public static void logError(String s) {
        totalErrors++;
        if(logError) {
            System.out.println(prefix + "[ERROR] " + s);
        }
    }

    public static void logSkippedValue(String s){
        totalSkips++;
        if(logSkippedValues){
            System.out.print(prefix + "[Skipped Value] " + s);
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

    public static int getTotalInfos(){ return totalInfos; }
    public static int getTotalWarns(){ return totalWarns; }
    public static int getTotalErrors(){ return totalErrors; }
}
