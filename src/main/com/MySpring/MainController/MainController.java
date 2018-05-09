package main.com.MySpring.MainController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String index() {
        System.out.print("nihao1");
        return "index";
    }
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String otherIndex() {
        System.out.print("nihao");
        return "index";
    }
}
