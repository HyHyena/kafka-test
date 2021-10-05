package ru.filit.kafka.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.filit.kafka.msg.KafkaSender;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class KafkaController {

    private final KafkaSender kafkaSender;

    @PostMapping
    public void sendMsg(@RequestBody String msg) {
        kafkaSender.sendMessage(msg);
    }
}
