package cz.fel.cvut.still.lab04.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {

    @Autowired
    private GreetingClient greetingClient;

    @GetMapping(path = "/greeting")
    public String getGreeting(Model model) {
        model.addAttribute("greeting", greetingClient.hello());
        return "greeting-view";
    }
}