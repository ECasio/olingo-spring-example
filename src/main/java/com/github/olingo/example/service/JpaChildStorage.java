package com.github.olingo.example.service;

import com.github.olingo.example.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Component
public class JpaChildStorage implements ChildStorage {

    @Autowired
    private ChildRepository childRepository;

    @Override
    public Child save(Child child) {
        return childRepository.save(child);
    }

    @Override
    public Optional<Child> get(Father father, Mother mother) {
        return childRepository.findById(new ChildPK(father, mother));
    }

    @Override
    public List<Child> getAll() {
        return StreamSupport
                .stream(childRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    @Override
    public void delete(Father father, Mother mother) {
        childRepository.deleteById(new ChildPK(father, mother));
    }

    @Override
    public void deleteAll() {
        childRepository.deleteAll();
    }
}
