package springapplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo4 {
    @RequestMapping("/demo4")
    public String index()
    {
        return "Hi";
    }
}
