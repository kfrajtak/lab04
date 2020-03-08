package cz.fel.cvut.still.lab04.eureka.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "spring-cloud-eureka-client", fallback = GreetingClient.GreetingClientFallback.class)
public interface GreetingClient {
    @RequestMapping("/hello")
    String hello();

    @Component
    @Slf4j
    class GreetingClientFallback implements GreetingClient {
        @Override
        public String hello() {
            log.info("fallback to getDefaultGreeting");
            return "Hello, world! (fallback message)";
        }
    }
}