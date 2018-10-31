package com.example.transactiondemo01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * HelloController
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    
    @RequestMapping("/")
    public String hello(){
        return "hello";
    }
    

}