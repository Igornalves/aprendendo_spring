package com.igornalves.aprendendo_spring.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import com.igornalves.aprendendo_spring.domain.Anime;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;


@RestController 
@RequestMapping(value = "v1/animes")
@Slf4j
public class AnimesController {

    @GetMapping
    public List<Anime> listAllAnimes() {
        return Anime.getAnimes();
    }

    @PostMapping
    public Long saveAnime(@RequestBody String name) {
        log.info("save '{}'", name);
        return ThreadLocalRandom.current().nextLong(1, 1000);
    }
}