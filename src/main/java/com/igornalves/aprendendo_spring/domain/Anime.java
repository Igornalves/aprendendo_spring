package com.igornalves.aprendendo_spring.domain;

import java.util.List;

public class Anime {
    
    private Long id;
    private String nome;

    public Anime(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public static List<Anime> getAnimes(){
        var ninjaKaiju = new Anime(1l, "Ninja Kamui");
        var kaijuu = new Anime(2l, "Kaijuu-8gou");
        var kimetsuNoYaiba = new Anime(3l, "kimetsu No Yaiba");

        return List.of(ninjaKaiju, kaijuu, kimetsuNoYaiba);
    }
}
