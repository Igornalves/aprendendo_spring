package com.igornalves.aprendendo_spring.controllers;

import ch.qos.logback.classic.Logger;
import com.igornalves.aprendendo_spring.domain.Producer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@RestController
@RequestMapping("v1/producers")
@Slf4j
public class ProducerController {

    @GetMapping
    public List<Producer> listAllProducers() {
        return Producer.getProducers();
    }

    @GetMapping("{id}")
    public Producer getProducerById(@PathVariable Long id) {
        return Producer.getProducers()
                .stream()
                .filter(producer -> producer.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @PostMapping(
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            headers = "x-api-key=1234"
    )
    public Producer saveProducer(@RequestBody Producer producer, @RequestHeader HttpHeaders headers) {

        log.info("{}", headers);
        producer.setId(ThreadLocalRandom.current().nextLong(100_000));
        producer.getProducers().add(producer);
        return producer;
    }

}
