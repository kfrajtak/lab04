package cz.fel.cvut.still.lab04.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Lab04EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lab04EurekaServerApplication.class, args);
	}

}
