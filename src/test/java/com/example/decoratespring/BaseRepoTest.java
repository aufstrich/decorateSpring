package com.example.decoratespring;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;


@DataJpaTest
class BaseRepoTest {

    @Autowired
    LeRepo baseRepo;

    @Test
    void getFirst() {
        Assertions.assertThat(baseRepo.getFirst()).isEqualTo("first");
    }

    @Test
    void deleteAll() {
        Assertions.assertThat(baseRepo.deleteAll()).isEqualTo(1L);
    }
}

