package com.example.spaceships.spaceships_marc_estalella.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.spaceships.spaceships_marc_estalella.exceptions.ResourceNotFoundException;
import com.example.spaceships.spaceships_marc_estalella.models.Spaceship;
import com.example.spaceships.spaceships_marc_estalella.repositories.SpaceshipRepository;

@Service
public class SpaceshipsService {
    @Autowired
    private SpaceshipRepository spaceshipRepository;

    public Page<Spaceship> getAllSpaceships(Pageable pageable) {
        Iterable<Spaceship> spaceshipIterable = spaceshipRepository.findAll();
        List<Spaceship> spaceships = new ArrayList<>();
        spaceshipIterable.forEach(spaceships::add);
        int start = (int) pageable.getOffset();
        int end = Math.min((start + pageable.getPageSize()), spaceships.size());
        return new PageImpl<>(spaceships.subList(start, end), pageable, spaceships.size());
    }

    @Cacheable("spaceships")
    public Spaceship getSpaceshipById(Long id) {
        try {
            Optional<Spaceship> spaceship = spaceshipRepository.findById(id);
            if (spaceship.isPresent()) {
                return spaceship.get();
            } else {
                throw new ResourceNotFoundException("Spaceship not found with id: " + id);
            }
        } catch (Exception e) {
            throw new ResourceNotFoundException("Spaceship not found with id: " + id);
        }
    }

    public List<Spaceship> getSpaceshipsByName(String name) {
        return spaceshipRepository.findByNameContaining(name);
    }

    public Spaceship createSpaceship(Spaceship spaceship) {
        return spaceshipRepository.save(spaceship);
    }

    public Spaceship updateSpaceship(Long id, Spaceship spaceshipDetails) {
        try {
            Optional<Spaceship> optionalSpaceship = spaceshipRepository.findById(id);
            if (optionalSpaceship.isPresent()) {
                Spaceship spaceship = optionalSpaceship.get();
                spaceship.setName(spaceshipDetails.getName());
                spaceship.setSeries(spaceshipDetails.getSeries());
                return spaceshipRepository.save(spaceship);
            } else {
                throw new ResourceNotFoundException("Spaceship not found with id: " + id);
            }
        } catch (Exception e) {
            throw new ResourceNotFoundException("Spaceship not found with id: " + id);
        }
    }

    public void deleteSpaceship(Long id) {
        try {
            Optional<Spaceship> optionalSpaceship = spaceshipRepository.findById(id);
            if (optionalSpaceship.isPresent()) {
                spaceshipRepository.delete(optionalSpaceship.get());
            } else {
                throw new ResourceNotFoundException("Spaceship not found with id: " + id);
            }
        } catch (Exception e) {
            throw new ResourceNotFoundException("Spaceship not found with id: " + id);
        }
    }
}
