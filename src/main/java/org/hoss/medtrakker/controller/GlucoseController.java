package org.hoss.medtrakker.controller;

import org.hoss.medtrakker.models.GlucoseReading;
import org.hoss.medtrakker.repositories.GlucoseRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class GlucoseController {
    private static final Logger logger = LoggerFactory.getLogger(GlucoseController.class);

    private GlucoseRepository glucoseRepository;

    public GlucoseController(GlucoseRepository glucoseRepository) {
        this.glucoseRepository = glucoseRepository;
    }

    @GetMapping("/api/all")
    public List<GlucoseReading> getAll() {
        Iterable<GlucoseReading> items = glucoseRepository.findAll();
       List<GlucoseReading> result= new ArrayList<>();
       items.iterator().forEachRemaining(result::add);
       if (result.size() == 0) {
           logger.info("No information in the database found");
       }
       return result;
    }
    @PostMapping("/api/reading")
    @ResponseStatus(HttpStatus.CREATED)
    public void addGlucoseReading(@RequestBody GlucoseReading reading) {
        if (reading.getGlucoseDateReading() == null) {
            reading.setGlucoseDateReading(new Date());
        }
        logger.info("Reading is {}", reading.getGlucoseReading());
        reading.setGlucoseReading(171);
        reading.setGlucoseWhen("MORNING");
        reading.setGlucoseNotes("just testing");
        glucoseRepository.save(reading);


    }
}
