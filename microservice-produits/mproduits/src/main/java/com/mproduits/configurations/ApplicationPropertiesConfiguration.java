package com.mproduits.configurations;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component()
@ConfigurationProperties("mes-configs")
public class ApplicationPropertiesConfiguration {
    private int limitProducts;

    public int getLimiteProduits() {
        return limitProducts;
    }

    public void setLimiteProduits(int limiteProduits) {
        this.limitProducts = limiteProduits;
    }
}
