package com.hamze.springit.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

//@ConfigurationProperties("springit")
public class SpringitProperties {
    private String welcomeMessage = "Hello,world  !!!";

    public String getWelcomeMessage() {
        return welcomeMessage;
    }

    public void setWelcomeMessage(String welcomeMessage) {
        this.welcomeMessage = welcomeMessage;
    }
}
