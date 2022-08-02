package com.github.olingo.example.entity;

import java.util.List;
import java.util.Optional;

public interface FatherStorage {
    public Father save(Father father);

    public Optional<Father> get(Long id);

    public List<Father> getAll();

    public void delete(Long id);

    public void deleteAll();
}
