package com.krishna.spring_boot_startProgram.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
//    @RequestMapping(value = "/",method = RequestMethod.GET) intead of this shortcut above we used
    public String sayHello(){
        return "Hello World krishna aa";
    }

}
