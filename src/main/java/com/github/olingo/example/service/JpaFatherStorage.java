package com.github.olingo.example.service;

import com.github.olingo.example.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Component
public class JpaFatherStorage implements FatherStorage {

    @Autowired
    private FatherRepository fatherRepository;

    @Override
    public Father save(Father father) {
        return fatherRepository.save(father);
    }

    @Override
    public Optional<Father> get(Long id) {
        return fatherRepository.findById(id);
    }

    @Override
    public List<Father> getAll() {
        return StreamSupport
                .stream(fatherRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    @Override
    public void delete(Long id) {
        fatherRepository.deleteById(id);
    }

    @Override
    public void deleteAll() {
        fatherRepository.deleteAll();
    }
}
