package ru.job4j.bmb.services;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Service;
import ru.job4j.bmb.content.Content;
import ru.job4j.bmb.handler.BotCommandHandler;
import org.springframework.beans.factory.BeanNameAware;

@Service
public class TelegramBotService implements BeanNameAware {

    private final BotCommandHandler handler;
    private String beanName;

    @Override
    public void setBeanName(String name) {
        this.beanName = name;
        System.out.println("Bean name set: " + beanName);
    }

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