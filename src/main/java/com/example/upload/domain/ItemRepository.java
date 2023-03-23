package com.example.upload.domain;

import org.springframework.data.repository.Repository;

import java.util.Optional;

public interface ItemRepository extends Repository<Item, Long> {
    void save(Item item);

    Optional<Item> findById(Long id);
}
