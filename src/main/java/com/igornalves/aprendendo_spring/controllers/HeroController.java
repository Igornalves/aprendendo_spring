package com.igornalves.aprendendo_spring.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController 
@RequestMapping(value = "v1/heroes")
public class HeroController {

    private List<String> heroes = new ArrayList<>();
    private List<String> animesView = new ArrayList<>(); 

    public HeroController() {
        heroes.add("gust");
        heroes.add("zoro");
        heroes.add("goku");

        animesView.add("dragon boll");
        animesView.add("attack on titions");
        animesView.add("denom slad");
    }

    @GetMapping("")
    public List<String> listAllheroes () {
        return heroes;
    }
    
    @GetMapping("/filter")
    public List<String> filterHeroes(@RequestParam(required = false) String nameHero) {
        return heroes
                .stream()
                .filter(hero -> hero.equalsIgnoreCase(nameHero))
                .toList();
    }
    
    @GetMapping("/filter-list")
    public List<String> filterListHeroes(@RequestParam(defaultValue =  "") String nameHero) {
        return heroes
                .stream()
                .filter(nameHero::contains)
                .toList();
    }

    @GetMapping("{nameHero}")
    public String filterByNameHero(@PathVariable String nameHero) {
        return heroes
                .stream()
                .filter(hero -> hero.equalsIgnoreCase(nameHero))
                .findFirst()
                .orElse(nameHero);
    }

    @GetMapping("/animes/{animeId}")
    public String filterByAnimes(@PathVariable(name = "animeId") int id) {
        return animesView
                .get(id)
                .toString();
    }

}
