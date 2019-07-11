package com.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@ImportResource("classpath:dubbo.xml")
@SpringBootApplication
public class PrugeniusConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrugeniusConsumerApplication.class, args);
    }

}
