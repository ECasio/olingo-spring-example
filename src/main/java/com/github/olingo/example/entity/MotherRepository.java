package com.github.olingo.example.entity;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface MotherRepository extends CrudRepository<Mother, String> {
    void deleteById(Long id);

    Optional<Mother> findById(Long id);
}
