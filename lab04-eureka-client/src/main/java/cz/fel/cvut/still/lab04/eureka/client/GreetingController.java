package cz.fel.cvut.still.lab04.eureka.client;

import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class GreetingController {
    @Autowired
    @Lazy
    private EurekaClient eurekaClient;

    @Value("${spring.application.name}")
    private String appName;

    @Value("${eureka.instance.instanceId}")
    private String instanceId;

    private String getFrom(){
        String from = "N/A";
        if (eurekaClient != null) {
            from = eurekaClient.getApplication(appName).getName();
        }
        return from;
    }

    @RequestMapping("/hello")
    public String hello() {
        return String.format("Hello from '%s' (%s)!", getFrom(), instanceId);
    }

    @RequestMapping("/greeting")
    public Map<String, String> greeting() {
        HashMap<String, String> map = new HashMap<>();
        map.put("message", String.format("Hello from '%s'!", getFrom()));
        map.put("instanceId", instanceId);
        return map;
    }
}
