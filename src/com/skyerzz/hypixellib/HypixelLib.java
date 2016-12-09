package com.skyerzz.hypixellib;

import com.skyerzz.hypixellib.util.hypixelapi.APIRequest;
import com.skyerzz.hypixellib.util.hypixelapi.APIRequestBuilder;
import com.skyerzz.hypixellib.util.hypixelapi.HypixelAPI;
import com.skyerzz.hypixellib.util.hypixelapi.exception.MalformedAPIKeyException;
import com.skyerzz.hypixellib.util.hypixelapi.exception.PlayerNonExistentException;
import com.skyerzz.hypixellib.util.hypixelapi.exception.RequestTypeException;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import java.io.IOException;

@Mod(modid = HypixelLib.MODID, version = HypixelLib.VERSION)
public class HypixelLib
{
    public static final String MODID = "hypixellib";
    public static final String VERSION = "1.0";

    public static Logger logger;

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        logger = new Logger();
        try {
            new HypixelAPI().getAPIReply(new APIRequestBuilder(APIRequest.RequestType.PLAYER).addParam(APIRequest.RequestParam.PLAYER_BY_UUID, "1460c760829b4a3c8db7ebf19d724113").build(), "41ca9ce5-314d-4bb1-b571-e01b38b6d855");
        } catch (PlayerNonExistentException e) {
            e.printStackTrace();
        } catch (MalformedAPIKeyException e) {
            e.printStackTrace();
        } catch (RequestTypeException e) {
            System.out.print(e.getParamValue() +  " " + e.getRequestType());
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
