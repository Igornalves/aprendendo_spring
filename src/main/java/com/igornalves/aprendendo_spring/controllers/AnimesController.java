package com.igornalves.aprendendo_spring.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;


@RestController 
@RequestMapping(value = "v1/animes")
public class AnimesController {

    @GetMapping("")
    public List<String> listAllAnimes() {
        return List.of("Anime 001","Anime 002");
    }
    
}
