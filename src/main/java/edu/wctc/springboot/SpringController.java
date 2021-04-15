package edu.wctc.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringController {
    @RequestMapping("/step1")
    public String showStep1(){ return "pages/step-1"; }
    @RequestMapping("/step2")
    public String showStep2(){
        return "pages/step-2";
    }
    @RequestMapping("/step3")
    public String showStep3(){
        return "pages/step-3";
    }
}
