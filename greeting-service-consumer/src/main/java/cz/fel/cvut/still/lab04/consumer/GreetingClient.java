package cz.fel.cvut.still.lab04.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(url = "http://localhost:6050/v1.0/invoke/spring-cloud-eureka-client/method")//, fallback = GreetingClient.GreetingClientFallback.class)
public interface GreetingClient {
    @RequestMapping("/hello")
    String hello();

    /*@Component
    @Slf4j
    class GreetingClientFallback implements GreetingClient {
        @Override
        public String hello() {
            log.info("fallback to getDefaultGreeting");
            return "Hello, world! (fallback message)";
        }
    }*/
}