package com.igornalves.aprendendo_spring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "hello-controller")
public class HelloController {

    @GetMapping(value = {"/hi", "hi/"})
    public String hi(){
        return "Olá mundo !!!";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/conhencendo")
    public String conhecendo(){
        return "Olá mundo, conhencendo !!!";
    }

}
