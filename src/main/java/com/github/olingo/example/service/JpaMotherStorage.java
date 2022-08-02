package com.github.olingo.example.service;

import com.github.olingo.example.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Component
public class JpaMotherStorage implements MotherStorage {

    @Autowired
    private MotherRepository motherRepository;

    @Override
    public Mother save(Mother mother) {
        return motherRepository.save(mother);
    }

    @Override
    public Optional<Mother> get(Long id) {
        return motherRepository.findById(id);
    }

    @Override
    public List<Mother> getAll() {
        return StreamSupport
                .stream(motherRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    @Override
    public void delete(Long id) {
        motherRepository.deleteById(id);
    }

    @Override
    public void deleteAll() {
        motherRepository.deleteAll();
    }
}
