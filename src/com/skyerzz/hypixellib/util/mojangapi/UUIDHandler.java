package com.skyerzz.hypixellib.util.mojangapi;

import java.util.UUID;

/**
 * Created by sky on 1-7-2017.
 */
public interface UUIDHandler {

     static UUID parseUUID(String uuid){
        if(uuid.contains("-")){
            return UUID.fromString(uuid);
        }
        String newUUID = uuid.substring(0, 7) + "-" + uuid.substring(8, 11) + "-" + uuid.substring(12, 15) + "-" + uuid.substring(16, 19) + "-" + uuid.substring(20);
        return UUID.fromString(newUUID);
    }
}
