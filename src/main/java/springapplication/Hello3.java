package springapplication;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello3 {

    @RequestMapping("/hello3")
    public String index(){
        return "Hello 3 from demo";
    }

}
