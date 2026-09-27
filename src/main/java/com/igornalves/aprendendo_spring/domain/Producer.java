package com.igornalves.aprendendo_spring.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Producer {

    private Long id;

    @JsonProperty("full_name")
    private String name;

    @Getter
    private static List<Producer> producers = new ArrayList<>();

    static {
        var producer01 = new Producer(1L, "Mappa");
        var producer02 = new Producer(2L, "Kyoto Animation");
        var producer03 = new Producer(3L, "MadHouse");

        producers.addAll(
                List.of(
                        producer01,
                        producer02,
                        producer03
                )
        );
    }
}
