package com.triplrbro.coffeweb;

import com.triplrbro.coffeweb.controler.hello;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CoffewebApplication {

    public static void main(String[] args) {

        SpringApplication.run(new Class[]{CoffewebApplication.class, hello.class}, args);
    }
}
