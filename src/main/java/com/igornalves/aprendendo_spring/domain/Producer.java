package com.igornalves.aprendendo_spring.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Builder
public class Producer {

    private Long id;

    private String name;

    private LocalDateTime createdAt;

    @Getter
    private static List<Producer> producers = new ArrayList<>();

    static {
        var producer01 = Producer.builder().id(1L).name("Mappa").createdAt(LocalDateTime.now()).build();
        var producer02 = Producer.builder().id(2L).name("Kyoto Animation").createdAt(LocalDateTime.now()).build();
        var producer03 = Producer.builder().id(3L).name("MadHouse").createdAt(LocalDateTime.now()).build();

        producers.addAll(
                List.of(
                        producer01,
                        producer02,
                        producer03
                )
        );
    }
}
