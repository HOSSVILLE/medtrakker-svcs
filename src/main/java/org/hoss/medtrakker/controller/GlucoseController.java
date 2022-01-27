package org.hoss.medtrakker.controller;

import org.hoss.medtrakker.models.GlucoseReading;
import org.hoss.medtrakker.repositories.GlucoseRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Immutable;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.sql.Timestamp;
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
    public void addGlucoseReading(@RequestBody GlucoseReading reading) {
        logger.info("REading is {}", reading.getGlucoseReading());
        Date newDate = new Date();
        Timestamp ts = new Timestamp(newDate.getTime());
        //reading.setGlucoseDateReading(ts);
        glucoseRepository.save(reading);

    }
}
