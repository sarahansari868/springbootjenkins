package springapplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
    @RequestMapping("/Test")
    public String index()

    {
        return "Hi from Jenkins";
    }}
