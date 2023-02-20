package com.example.decoratespring;

import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class BaseRepo implements LeRepo {

    private final ItemRepoitory itemRepoitory;
    private final EntityManager entityManager;

    @Override
    public String getFirst() {
        return itemRepoitory.findFirstByIdIsNotNull().map(Item::getName).orElse("first");
    }

    @Override
//    @Transactional
    public Long deleteAll() {
        assert this.entityManager.isJoinedToTransaction();

        return 1L;
    }
}
