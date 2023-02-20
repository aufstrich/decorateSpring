package com.example.decoratespring;

import jakarta.persistence.EntityManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DecorateSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(DecorateSpringApplication.class, args);
    }

    @Bean
    LeRepo baseRepo(ItemRepoitory itemRepoitory, EntityManager entityManager) {
        return new BaseRepo(itemRepoitory, entityManager);
    }

    @Bean
    LeRepo decoratedLeRepo(LeRepo baseRepo) {
        return new LeRepoDecorator(baseRepo);
    }

}


