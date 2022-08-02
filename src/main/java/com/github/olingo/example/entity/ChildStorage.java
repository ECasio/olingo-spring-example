package com.github.olingo.example.entity;

import java.util.List;
import java.util.Optional;

public interface ChildStorage {
    public Child save(Child child);

    public Optional<Child> get(Father father, Mother mother);

    public List<Child> getAll();

    public void delete(Father father, Mother mother);

    public void deleteAll();
}
