package ru.job4j.bmb.services;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Service;

@Service
public class MoodService {

    @PostConstruct
    public void init() {
        System.out.println("MoodService is going through @PostConstruct init.");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("MoodService will be destroyed via @PreDestroy.");
    }
}
