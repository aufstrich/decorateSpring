package com.example.decoratespring;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
interface ItemRepoitory extends JpaRepository<Item, UUID> {

    Optional<Item> findFirstByIdIsNotNull();

}
