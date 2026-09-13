package com.igornalves.aprendendo_spring.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.igornalves.aprendendo_spring.domain.Anime;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;


@RestController 
@RequestMapping(value = "v1/animes")
public class AnimesController {

    @GetMapping("")
    public List<Anime> listAllAnimes() {
        return Anime.getAnimes();
    }
    
}
