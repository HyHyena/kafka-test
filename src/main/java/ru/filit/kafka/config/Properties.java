package ru.filit.kafka.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@Getter
public class Properties {

    @Value(value = "${kafka.bootstrapAddress}")
    private String bootstrapAddress;
}
