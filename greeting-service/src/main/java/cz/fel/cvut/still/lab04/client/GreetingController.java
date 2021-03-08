package cz.fel.cvut.still.lab04.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class GreetingController {
    @Value("${spring.application.name}")
    private String appName;

    @Value("${server.port}")
    private String port;

    @RequestMapping("/hello")
    public String hello() {
        return String.format("Hello from %s '%s'!", appName, port);
    }

    @RequestMapping("/greeting")
    public Map<String, String> greeting() {
        HashMap<String, String> map = new HashMap<>();
        map.put("appName", appName);
        map.put("port", port);
        return map;
    }
}
