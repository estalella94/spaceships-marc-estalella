package com.example.spaceships.spaceships_marc_estalella.repositories;

import java.util.List;


import org.springframework.data.repository.CrudRepository;

import com.example.spaceships.spaceships_marc_estalella.models.Spaceship;

public interface SpaceshipRepository extends CrudRepository<Spaceship, Long> {
    List<Spaceship> findByNameContaining(String name);
}
