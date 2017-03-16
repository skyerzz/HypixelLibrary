package com.skyerzz.hypixellib.util.hypixelapi.exception;

import com.skyerzz.hypixellib.util.hypixelapi.APIRequest;

/**
 * Created by sky on 5-8-2016.
 */
public class RequestTypeException extends Exception {

    private APIRequest.RequestParam requestParam;
    private APIRequest.RequestType requestType;
    private String paramValue;

    public RequestTypeException(APIRequest.RequestType requestType, APIRequest.RequestParam requestParam, String paramValue){
        this.requestParam = requestParam;
        this.requestType = requestType;
        this.paramValue = paramValue;
    }

    public APIRequest.RequestParam getRequestParam(){
        return requestParam;
    }

    public APIRequest.RequestType getRequestType(){
        return requestType;
    }

    public String getParamValue(){
        return paramValue;
    }
}
