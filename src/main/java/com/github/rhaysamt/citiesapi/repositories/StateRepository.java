package com.github.rhaysamt.citiesapi.repositories;

import com.github.rhaysamt.citiesapi.entities.StateEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<StateEntity, Long> {
}
