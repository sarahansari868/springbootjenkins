package springapplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo2 {
    @RequestMapping("/demo2")
    public String index() {
        return "Hello from demo2";
    }

}
