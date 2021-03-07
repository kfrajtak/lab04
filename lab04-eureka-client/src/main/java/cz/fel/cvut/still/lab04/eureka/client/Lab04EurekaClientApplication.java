package cz.fel.cvut.still.lab04.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lab04EurekaClientApplication {

	public static void main(String[] args) {
		SpringBootUtil.setPort(args,8800, 8900);
		SpringApplication.run(Lab04EurekaClientApplication.class, args);
	}
}
