package com.igornalves.aprendendo_spring.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Anime {
    
    private Long id;
    private String nome;

    @Getter
    private static List<Anime> animes = new ArrayList<>();

    static {
        var ninjaKaiju = new Anime(1l, "Ninja Kamui");
        var kaijuu = new Anime(2l, "Kaijuu-8gou");
        var kimetsuNoYaiba = new Anime(3l, "kimetsu No Yaiba");

        animes.addAll(
                List.of(ninjaKaiju, kaijuu, kimetsuNoYaiba)
        );
    }

}
