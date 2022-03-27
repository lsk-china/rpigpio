package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RpitestApplication {

	public static void main(String[] args) {
		SpringApplication.run(RpitestApplication.class, args);
	}

    @Bean
    public GPIO gpio() {
        System.out.println(System.getProperty("java.library.path"));
        GPIO gpio = new GPIO();
        gpio.setup();
        return gpio;
    }

}
