package com.stater.service;

import com.stater.properties.TokenRedisProperties;
import org.springframework.stereotype.Service;


public class TokenRedisService {

    private TokenRedisProperties tokenRedisProperties;

    public TokenRedisProperties getTokenRedisProperties() {
        return tokenRedisProperties;
    }

    public void setTokenRedisProperties(TokenRedisProperties tokenRedisProperties) {
        this.tokenRedisProperties = tokenRedisProperties;
    }

    public String getToken(){
        return tokenRedisProperties.getTokenRedisHost()+": "+tokenRedisProperties.getTokenRedisName();
    }

}
