package ru.job4j.bmb.services;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Service;
import ru.job4j.bmb.content.Content;
import ru.job4j.bmb.handler.BotCommandHandler;

@Service
public class TelegramBotService {
    private final BotCommandHandler handler;

    @PostConstruct
    public void init() {
        System.out.println("TelegramBotService is going through @PostConstruct init.");
    }

    public TelegramBotService(BotCommandHandler handler) {
        this.handler = handler;
    }

    @PreDestroy
    public void destroy() {
        System.out.println("TelegramBotService will be destroyed via @PreDestroy.");
    }

    public void receive(Content content) {
        handler.receive(content);
    }
}