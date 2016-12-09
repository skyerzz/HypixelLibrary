package com.skyerzz.hypixellib.util.hypixelapi;

import com.skyerzz.hypixellib.util.hypixelapi.exception.RequestTypeException;
import org.apache.http.client.methods.RequestBuilder;

import java.util.HashMap;

/**
 * Created by sky on 5-8-2016.
 */
public class APIRequestBuilder {

    private APIRequest.RequestType requestType;
    private HashMap<APIRequest.RequestParam, String> params = new HashMap<>();

    public APIRequestBuilder(APIRequest.RequestType requestType){
        this.requestType = requestType;
    }

    public APIRequestBuilder addParam(APIRequest.RequestParam param, String value) throws RequestTypeException {
        if(!validate(param, value)){
            throw new RequestTypeException(requestType, param, value);
        }
        params.put(param, value);
        return this;
    }

    private boolean validate(APIRequest.RequestParam param, String value) {
        if(param.getRequestType() != requestType || value==null){
            return false;
        }
        return true;
    }

    public APIRequest build(){
        return new APIRequest(requestType, params);
    }
}
