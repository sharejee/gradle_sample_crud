package sample.city.controllers.employee;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Rith on 7/15/2018.
 */
@Controller
public class MainController {
    @RequestMapping("/")
    public String welcome() {
        return "index";
    }
}
