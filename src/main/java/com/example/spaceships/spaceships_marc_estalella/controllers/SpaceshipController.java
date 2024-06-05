package com.example.spaceships.spaceships_marc_estalella.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.spaceships.spaceships_marc_estalella.models.Spaceship;
import com.example.spaceships.spaceships_marc_estalella.services.SpaceshipsService;

@RestController
@RequestMapping("/api/spaceships")
public class SpaceshipController {

     @Autowired
    private SpaceshipsService spaceshipService;

    @GetMapping
    public Page<Spaceship> getAllSpaceships(Pageable pageable) {
        return spaceshipService.getAllSpaceships(pageable);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Spaceship> getSpaceshipById(@PathVariable Long id) {
        return ResponseEntity.ok(spaceshipService.getSpaceshipById(id));
    }

    @GetMapping("/search")
    public List<Spaceship> getSpaceshipsByName(@RequestParam String name) {
        return spaceshipService.getSpaceshipsByName(name);
    }

    @PostMapping
    public Spaceship createSpaceship(@RequestBody Spaceship spaceship) {
        return spaceshipService.createSpaceship(spaceship);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Spaceship> updateSpaceship(@PathVariable Long id, @RequestBody Spaceship spaceshipDetails) {
        return ResponseEntity.ok(spaceshipService.updateSpaceship(id, spaceshipDetails));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSpaceship(@PathVariable Long id) {
        spaceshipService.deleteSpaceship(id);
        return ResponseEntity.noContent().build();
    }





}
