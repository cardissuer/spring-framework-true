package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // Annotate the class with the @Controller stereotype annotation
public class HomeController {

    @RequestMapping ("/home") // User @RequestMapping annotation to associate the action with HTTP request path
    public String home(){
        return "home.html"; // Returns the HTML document that contains the details we want the browser to display
    }

    @RequestMapping ("/home2")
    public String home2(){
        return "home.html";
    }

    @RequestMapping ("/welcome")
    public String welcome(){
        return "welcome.html";
    }
}
