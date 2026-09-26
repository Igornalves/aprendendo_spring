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

    @GetMapping("{id}")
    public Anime getAnimeById(@PathVariable Long id) {
        return Anime.getAnimes()
                .stream()
                .filter(anime -> anime.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @PostMapping
    public Anime saveAnime(@RequestBody Anime anime) {
        anime.setId(ThreadLocalRandom.current().nextLong(100_000));
        anime.getAnimes().add(anime);
        return anime;
    }

}