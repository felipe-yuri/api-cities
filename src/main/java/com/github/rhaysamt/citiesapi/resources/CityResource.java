package com.github.rhaysamt.citiesapi.resources;

import com.github.rhaysamt.citiesapi.entities.CityEntity;
import com.github.rhaysamt.citiesapi.repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cities")
public class CityResource {

    @Autowired
    private CityRepository repository;

    @GetMapping
    public Page<CityEntity> cities(Pageable page) {
        return repository.findAll(page);
    }

    @GetMapping("/id/{id}")
    public ResponseEntity getById(@PathVariable Long id) {
        Optional<CityEntity> optionalCityEntity = repository.findById(id);

        if (optionalCityEntity.isPresent()) {
            return ResponseEntity.ok().body(optionalCityEntity.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/name/{name}")
    public CityEntity findByName(@PathVariable String name) {
        return repository.findByName(name);
    }
}