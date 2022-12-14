package com.jumpmind.proto.metl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		System.out.println("Starting Metl - give it time to download the plugins!");
		SpringApplication.run(App.class, args);
	}

}
