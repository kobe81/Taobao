package com.jufan.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		/*SpringApplication app=new SpringApplication(DemoApplication.class);
        app.setShowBanner(false);
        app.run(args);*/
	}

}
