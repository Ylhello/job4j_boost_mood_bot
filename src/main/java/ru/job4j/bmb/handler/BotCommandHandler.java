package ru.job4j.bmb.handler;

import org.springframework.stereotype.Service;
import ru.job4j.bmb.content.Content;

@Service
public class BotCommandHandler {
    public void receive(Content content) {
        System.out.println("Received content: " + content);
    }
}