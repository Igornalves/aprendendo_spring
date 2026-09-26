package com.igornalves.aprendendo_spring.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.ThreadLocalRandom;

@RestController
@RequestMapping(value = "v1/greetings")
@Slf4j
public class HelloController {

    @GetMapping(value = {"/hi", "hi/"})
    public String hi() {
        return "Olá mundo !!!";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/conhencendo")
    public String conhecendo() {
        return "Olá mundo, conhencendo !!!";
    }

    @PostMapping
    public Long saveAll(@RequestBody String name) {
        log.info("save '{}'", name);
        return ThreadLocalRandom.current().nextLong(1, 1000);
    }

}
