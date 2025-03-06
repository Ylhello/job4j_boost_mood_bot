package ru.job4j.bmb.handler;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Service;
import ru.job4j.bmb.content.Content;

@Service
public class BotCommandHandler {

    @PostConstruct
    public void init() {
        System.out.println("BotCommandHandler is going through @PostConstruct init.");
    }

    public void receive(Content content) {
        System.out.println("Received content: " + content);
    }

    @PreDestroy
    public void destroy() {
        System.out.println("BotCommandHandler will be destroyed via @PreDestroy.");
    }
}