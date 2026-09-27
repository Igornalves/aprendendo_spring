package com.igornalves.aprendendo_spring.DTOs.Request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProducerPostRequest {

//    private Long id;

    @JsonProperty("full_name")
    private String name;
}
