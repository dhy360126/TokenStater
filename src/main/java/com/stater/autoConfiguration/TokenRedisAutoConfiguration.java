package com.stater.autoConfiguration;

import com.stater.properties.TokenRedisProperties;
import com.stater.service.TokenRedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(TokenRedisProperties.class)
public class TokenRedisAutoConfiguration {

   @Autowired
    private TokenRedisProperties tokenRedisProperties;

   @Bean
    public TokenRedisService returnTokenRedisService(){
       TokenRedisService tokenRedisService = new TokenRedisService();
        tokenRedisService.setTokenRedisProperties(tokenRedisProperties);
        return  tokenRedisService;
   }

}
