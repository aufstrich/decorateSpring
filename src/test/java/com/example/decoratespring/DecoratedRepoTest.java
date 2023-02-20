package com.example.decoratespring;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
class DecoratedRepoTest {
    @Autowired
    LeRepo decoratedLeRepo;

    @Test
    void getFirst() {
        Assertions.assertThat(decoratedLeRepo.getFirst()).isEqualTo("FIRST");
    }

    @Test
    void deleteAll() {
        Assertions.assertThat(decoratedLeRepo.deleteAll()).isEqualTo(100L);
    }

}
