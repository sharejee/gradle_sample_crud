package sample.city.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Rith on 7/14/2018.
 */
@Controller
public class HomeController {
    @RequestMapping(value = {"/","/home"})
    public String atHome(){
        return "home";
    }
}
