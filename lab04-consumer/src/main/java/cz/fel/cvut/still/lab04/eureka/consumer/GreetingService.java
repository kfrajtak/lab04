package cz.fel.cvut.still.lab04.eureka.consumer;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class GreetingService {
    @Autowired
    private GreetingClient greetingClient;

    @HystrixCommand(fallbackMethod = "getDefaultGreeting")
    public String getGreeting(){
        return greetingClient.hello();
    }

    @SuppressWarnings("unused")
    String getDefaultGreeting() {
        log.info("fallback to getDefaultGreeting");
        return "Hello, world! (fallback message)";
    }
}
