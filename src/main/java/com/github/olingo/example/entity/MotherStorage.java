package com.github.olingo.example.entity;

import java.util.List;
import java.util.Optional;

public interface MotherStorage {
    public Mother save(Mother mother);

    public Optional<Mother> get(Long id);

    public List<Mother> getAll();

    public void delete(Long id);

    public void deleteAll();
}
