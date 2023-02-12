package com.clientui;

import jakarta.annotation.Generated;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.commons.httpclient.HttpClientConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;

@SpringBootApplication
@EnableFeignClients("com.clientui")
public class ClientuiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientuiApplication.class, args);
    }

}
