package cz.fel.cvut.still.lab04.eureka.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@EnableCircuitBreaker
@Slf4j
public class Lab04EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lab04EurekaServerApplication.class, args);
	}
}
