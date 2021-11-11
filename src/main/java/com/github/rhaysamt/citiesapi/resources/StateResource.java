package com.github.rhaysamt.citiesapi.resources;

import com.github.rhaysamt.citiesapi.entities.CountryEntity;
import com.github.rhaysamt.citiesapi.entities.StateEntity;
import com.github.rhaysamt.citiesapi.repositories.StateRepository;
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
@RequestMapping("/states")
public class StateResource {

    @Autowired
    private StateRepository repository;

    @GetMapping
    public List<StateEntity> allStates() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity getById(@PathVariable Long id) {
        Optional<StateEntity> optionalState = repository.findById(id);

        if (optionalState.isPresent()) {
            return ResponseEntity.ok().body(optionalState.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
