package springapplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hifi {
    @RequestMapping("/myUrl")
    public String index(){
        return "Hi"

    }
}
