package com.skyerzz.hypixellib.util.hypixelapi;

import com.google.gson.JsonObject;
import com.skyerzz.hypixellib.util.hypixelapi.playerstats.*;

/**
 * Created by sky on 7-7-2016.
 */
public class PlayerAPI extends AbstractAPIReply{

    private JsonObject apiGameJson;
    private PlayerQuakeStats quakeStats;
    private PlayerPaintballStats paintballStats;
    private PlayerBlitzStats blitzStats;
    private PlayerTNTGamesStats tntGamesStats;
    private PlayerVampireZStats vampireZStats;
    private PlayerTurboKartRacersStats turboKartRacersStats;
    private PlayerArcadeStats arcadeStats;
    private PlayerCopsAndCrimsStats copsAndCrimsStats;

    protected PlayerAPI(JsonObject apiJson){
        this.apiGameJson = apiJson.get("player").getAsJsonObject().get("stats").getAsJsonObject();
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
}
