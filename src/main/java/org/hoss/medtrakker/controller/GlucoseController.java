package org.hoss.medtrakker.controller;

import org.hoss.medtrakker.models.GlucoseReading;
import org.hoss.medtrakker.repositories.GlucoseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Immutable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@RestController
public class GlucoseController {
    private GlucoseRepository glucoseRepository;

    public GlucoseController(GlucoseRepository glucoseRepository) {
        this.glucoseRepository = glucoseRepository;
    }

    @GetMapping("/api/all")
    public List<GlucoseReading> getAll() {
        Iterable<GlucoseReading> items = glucoseRepository.findAll();
       List<GlucoseReading> result= new ArrayList<>();
       items.iterator().forEachRemaining(result::add);
       return result;
    }
}
