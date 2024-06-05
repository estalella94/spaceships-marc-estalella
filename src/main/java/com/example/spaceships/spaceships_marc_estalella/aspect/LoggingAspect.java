package com.example.spaceships.spaceships_marc_estalella.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Aspect
@Component
@Slf4j
public class LoggingAspect {

    @After("execution(* com.example.spaceships.service.SpaceshipService.getSpaceshipById(..)) && args(id)")
    public void logAfterGetSpaceshipById(Long id) {
        if (id < 0) {
            log.warn("Requested spaceship with negative id: " + id);
        }
    }


}
