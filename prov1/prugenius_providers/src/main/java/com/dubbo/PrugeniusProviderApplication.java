package com.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@ImportResource("classpath:dubbo.xml")
@SpringBootApplication
public class PrugeniusProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrugeniusProviderApplication.class, args);
    }

}
