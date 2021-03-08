package cz.fel.cvut.still.lab04.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@Slf4j
public class GreetingServiceClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreetingServiceClientApplication.class, args);
	}
}
