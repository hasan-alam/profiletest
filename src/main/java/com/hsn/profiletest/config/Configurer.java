package com.hsn.profiletest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.hsn.profiletest.component.DevPocessor;
import com.hsn.profiletest.component.Processor;
import com.hsn.profiletest.component.UatProcessor;

@Configuration
public class Configurer {
    /* @Bean
    @Profile("dev")
    public Processor getDevProcessor() {
        return new DevPocessor();
    }
    @Profile("uat")
    public Processor getUatProcessor() {
        return new UatProcessor();
    } */

}
