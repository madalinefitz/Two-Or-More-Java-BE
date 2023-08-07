package com.example.infoservice.controller;

import com.example.infoservice.entity.Reading;
import com.example.infoservice.service.ReadingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

import java.util.List;

@RestController
public class ReadingController {

    private final ReadingService readingService;

    @Autowired
    public ReadingController(ReadingController service) {
        this.readingService = service;
    }


    @GetMapping("/reading")
    public ResponseEntity<List<ReadingMaterial>> getAllReadingMaterials() {
        // Call the StoryService to fetch all stories from the database
        List<ReadingMaterial> allReadingMaterials = readingService.getAllReadingMaterials();

        // Return the list of stories in the response with a 200 OK status
        return ResponseEntity.status(HttpStatus.OK).body(allReadingMaterials);
    }

    @GetMapping("/readingtest")
    public String getHelloReadingMaterials() {
        return "hello reading";
    }

//    @PostMapping("/reading")
//    public ResponseEntity<Reading> createReading(@RequestBody Reading reading) {
//        // Call the createNewReading method of the ReadingService
//        Reading newReading = ReadingService.createNewReadingMaterial(readingMaterial.getTerm(), readingMaterial.getDefinition());
//        // Return the newly created reading material in the response with a 201 Created status
//        return ResponseEntity.status(HttpStatus.CREATED).body(newReadingMaterial);
//    }
}
