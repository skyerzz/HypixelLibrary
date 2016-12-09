package com.skyerzz.hypixellib.util.hypixelapi.exception;

/**
 * Created by sky on 31-7-2016.
 */
public class MalformedAPIKeyException extends Exception {

    String APIkey;

    public MalformedAPIKeyException(){
    }

    public MalformedAPIKeyException(String APIkey){
        this.APIkey = APIkey;
    }

    public String getAPIkey(){
        return APIkey;
    }
}
