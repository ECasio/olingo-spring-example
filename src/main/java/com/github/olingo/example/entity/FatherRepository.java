package com.github.olingo.example.entity;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface FatherRepository extends CrudRepository<Father, String> {
    Optional<Father> findById(Long id);

    void deleteById(Long id);
}
