package ru.job4j.bmb.engine;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Service;

@Service
public class RecommendationEngine {

    @PostConstruct
    public void init() {
        System.out.println("RecommendationEngine is going through @PostConstruct init.");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("RecommendationEngine will be destroyed via @PreDestroy.");
    }
}