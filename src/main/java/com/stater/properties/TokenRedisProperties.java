package com.stater.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "duanhy")
public class TokenRedisProperties {
    private String tokenRedisName;
    private String tokenRedisHost;

    public String getTokenRedisName() {
        return tokenRedisName;
    }

    public void setTokenRedisName(String tokenRedisName) {
        this.tokenRedisName = tokenRedisName;
    }

    public String getTokenRedisHost() {
        return tokenRedisHost;
    }

    public void setTokenRedisHost(String tokenRedisHost) {
        this.tokenRedisHost = tokenRedisHost;
    }


}
