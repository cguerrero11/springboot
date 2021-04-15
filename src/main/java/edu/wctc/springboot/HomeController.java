package edu.wctc.springboot;

import org.springframework.web.bind.annotation.RequestMapping;

public class HomeController {
    @RequestMapping("/")
    public String showHomePage() {
        return "index";
    }
}
