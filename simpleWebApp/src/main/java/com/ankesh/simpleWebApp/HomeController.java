package com.ankesh.simpleWebApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String home(){
        return "Welcome Ankesh !!";
    }
    @RequestMapping("/about")
    public String about(){
        return "This is About Page";
    }
}
