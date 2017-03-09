package com.overhaul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class GpsServerApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(GpsServerApplication.class, args);
    }
}
