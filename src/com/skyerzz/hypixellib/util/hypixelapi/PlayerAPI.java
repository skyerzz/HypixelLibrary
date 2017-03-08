package com.skyerzz.hypixellib.util.hypixelapi;

import com.google.gson.JsonObject;
import com.skyerzz.hypixellib.util.hypixelapi.exception.NoPlayerStatsException;
import com.skyerzz.hypixellib.util.hypixelapi.playerstats.*;

/**
 * Created by sky on 7-7-2016.
 */
public class PlayerAPI extends AbstractAPIReply{

    private JsonObject apiGameJson;
    private JsonObject totalApiJson;


    private PlayerCommonStats commonStats;
    private PlayerArcadeStats arcadeStats;
    private PlayerArenaStats arenaStats;
    private PlayerBlitzStats blitzStats;
    private PlayerCopsAndCrimsStats copsAndCrimsStats;
    private PlayerPaintballStats paintballStats;
    private PlayerQuakeStats quakeStats;
    private PlayerSkywarsStats skywarsStats;
    private PlayerSmashStats smashStats;
    private PlayerTNTGamesStats tntGamesStats;
    private PlayerTurboKartRacersStats turboKartRacersStats;
    private PlayerVampireZStats vampireZStats;
    private PlayerWallsStats wallsStats;

    protected PlayerAPI(JsonObject apiJson) throws NoPlayerStatsException {
        this.totalApiJson = apiJson;
        try {
            this.apiGameJson = apiJson.get("player").getAsJsonObject().get("stats").getAsJsonObject();
        }catch(IllegalStateException e){
                throw new NoPlayerStatsException();
        }
    }

    public PlayerCommonStats getCommonStats(){
        if(commonStats==null && totalApiJson.get("player")!=null){
            this.commonStats = new PlayerCommonStats(totalApiJson.get("player").getAsJsonObject());
        }
        return commonStats;
    }

    public PlayerQuakeStats getQuakeStats(){
        if(quakeStats==null && apiGameJson.get("Quake")!=null){
            this.quakeStats = new PlayerQuakeStats(apiGameJson.get("Quake").getAsJsonObject());
        }
        return quakeStats;
    }

    public PlayerPaintballStats getPaintballStats() {
        if(paintballStats==null && apiGameJson.get("Paintball")!=null){
            this.paintballStats = new PlayerPaintballStats(apiGameJson.get("Paintball").getAsJsonObject());
        }
        return paintballStats;
    }

    public PlayerTNTGamesStats getTntGamesStats() {
        if(tntGamesStats == null && apiGameJson.get("TNTGames")!=null){
            this.tntGamesStats = new PlayerTNTGamesStats(apiGameJson.get("TNTGames").getAsJsonObject());
        }
        return tntGamesStats;
    }

    public PlayerVampireZStats getVampireZStats() {
        if(vampireZStats == null && apiGameJson.get("VampireZ")!=null){
            this.vampireZStats = new PlayerVampireZStats(apiGameJson.get("VampireZ").getAsJsonObject());
        }
        return vampireZStats;
    }

    public PlayerTurboKartRacersStats getTurboKartRacersStats() {
        if(turboKartRacersStats==null && apiGameJson.get("GingerBread")!=null){
            this.turboKartRacersStats = new PlayerTurboKartRacersStats(apiGameJson.get("GingerBread").getAsJsonObject());
        }
        return turboKartRacersStats;
    }

    public PlayerArcadeStats getArcadeStats() {
        if(arcadeStats==null && apiGameJson.get("Arcade")!=null) {
            this.arcadeStats = new PlayerArcadeStats(apiGameJson.get("Arcade").getAsJsonObject());
        }
        return arcadeStats;
    }

    public PlayerCopsAndCrimsStats getCopsAndCrimsStats() {
        if(copsAndCrimsStats == null && apiGameJson.get("MCGO")!=null){
            this.copsAndCrimsStats = new PlayerCopsAndCrimsStats(apiGameJson.get("MCGO").getAsJsonObject());
        }
        return copsAndCrimsStats;
    }

    public PlayerBlitzStats getBlitzStats(){
        if(blitzStats == null && apiGameJson.get("HungerGames")!=null){
            this.blitzStats = new PlayerBlitzStats(apiGameJson.get("HungerGames").getAsJsonObject());
        }
        return blitzStats;
    }

    public PlayerWallsStats getWallsStats(){
        if(wallsStats == null && apiGameJson.get("Walls")!=null){
            this.wallsStats = new PlayerWallsStats(apiGameJson.get("Walls").getAsJsonObject());
        }
        return wallsStats;
    }

    public PlayerSkywarsStats getSkywarsStats(){
        if(skywarsStats == null && apiGameJson.get("SkyWars")!=null){
            this.skywarsStats = new PlayerSkywarsStats(apiGameJson.get("SkyWars").getAsJsonObject());
        }
        return skywarsStats;
    }

    public PlayerSmashStats getSmashStats(){
        if(smashStats == null && apiGameJson.get("SuperSmash")!=null){
            this.smashStats = new PlayerSmashStats(apiGameJson.get("SuperSmash").getAsJsonObject());
        }
        return smashStats;
    }

    public PlayerArenaStats getArenaStats(){
        if(arenaStats == null && apiGameJson.get("Arena")!=null){
            this.arenaStats = new PlayerArenaStats(apiGameJson.get("Arena").getAsJsonObject());
        }
        return arenaStats;
    }
}
