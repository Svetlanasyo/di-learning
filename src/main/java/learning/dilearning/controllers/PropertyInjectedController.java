package learning.dilearning.controllers;

import learning.dilearning.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Autowired
    public GreetingServiceImpl greetingService;
    //public GreetingService greetingServiceImpl; // Also working.

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
