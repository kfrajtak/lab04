package cz.fel.cvut.still.lab04.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GreetingServiceApplication {

	public static void main(String[] args) {
		SpringBootUtil.setPort(args);
		SpringApplication.run(GreetingServiceApplication.class, args);
	}
}
