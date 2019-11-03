package springapplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpring {
    @RequestMapping("/hello")
    public String Index() {
        return "Hello from Spring Boot, we will build using Jenkins";
    }

}
