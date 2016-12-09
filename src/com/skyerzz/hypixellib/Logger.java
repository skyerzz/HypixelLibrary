package com.skyerzz.hypixellib;

import org.apache.logging.log4j.LogManager;

/**
 * Created by sky on 7-7-2016.
 */
public class Logger {

    public static org.apache.logging.log4j.Logger logManager;

    public Logger(){
        this.logManager = LogManager.getLogger("HypixelLib");
    }

    public static void logInfo(String s) {
        logManager.info(s);
    }

    public static void logWarn(String s) {
        logManager.warn(s);
    }

    public static void logError(String s) {
        logManager.error(s);
    }
}
