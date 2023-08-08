package com.example.infoservice.controller;

import com.example.infoservice.entity.ReadingMaterial;
import com.example.infoservice.service.ReadingMaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

import java.util.List;

@RestController
public class ReadingMaterialController {

    private final ReadingMaterialService readingMaterialService;

    @Autowired
    public ReadingMaterialController(ReadingMaterialService service) {
        this.readingMaterialService = service;
    }


    @GetMapping("/reading")
    public ResponseEntity<List<ReadingMaterial>> getAllReadingMaterial() {
        // Call the StoryService to fetch all stories from the database
        List<ReadingMaterial> allReadingMaterial = readingMaterialService.getAllReadingMaterial();

        // Return the list of stories in the response with a 200 OK status
        return ResponseEntity.status(HttpStatus.OK).body(allReadingMaterial);
    }

    @GetMapping("/readingtest")
    public String getHelloReadingMaterials() {
        return "hello reading";
    }

    //test to see that I can add to the database
    @GetMapping("/testreading")
    public List<String> getReadingMaterial() {
        return readingMaterialService.GetReadingMaterial();
    }

    @PostMapping("/reading")
    public ResponseEntity<ReadingMaterial> createReadingMaterial(@RequestBody ReadingMaterial readingMaterial) {
        // Call the createNewReading method of the ReadingService
        ReadingMaterial newReadingMaterial = readingMaterialService.createNewReadingMaterial(readingMaterial.getTitle(), readingMaterial.getDescription(), readingMaterial.getAuthorName(), readingMaterial.getAuthorPhoto(), readingMaterial.getBookCover(), readingMaterial.getLink());
        // Return the newly created reading material in the response with a 201 Created status
        return ResponseEntity.status(HttpStatus.CREATED).body(newReadingMaterial);
    }
}
