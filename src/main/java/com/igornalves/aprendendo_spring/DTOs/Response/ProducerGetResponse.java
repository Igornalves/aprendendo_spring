package com.igornalves.aprendendo_spring.DTOs.Response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
public class ProducerGetResponse {

    private Long id;

    @JsonProperty("full_name")
    private String name;

    private LocalDateTime createdAt;
}
