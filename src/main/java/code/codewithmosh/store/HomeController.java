package code.codewithmosh.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @Value("${spring.application.name}")
    public String appName;


    @RequestMapping("/")
    public String index() {
        System.out.println("appName: " + appName);
        return "index.html";
    }

}
