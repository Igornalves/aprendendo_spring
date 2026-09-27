package com.igornalves.aprendendo_spring.mapper;

import com.igornalves.aprendendo_spring.DTOs.Request.ProducerPostRequest;
import com.igornalves.aprendendo_spring.domain.Producer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProducerMapper {
    ProducerMapper INSTANCE = Mappers.getMapper(ProducerMapper.class);

    @Mapping(
            target = "createdAt",
            expression = "java(java.util.LocalDateTime.now())"
    )
    Producer toProducer(ProducerPostRequest postRequest);
}
