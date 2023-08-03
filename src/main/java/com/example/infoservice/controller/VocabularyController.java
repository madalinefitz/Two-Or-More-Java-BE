package com.example.infoservice.controller;

import com.example.infoservice.entity.Vocabulary;
import com.example.infoservice.service.VocabularyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

import java.util.List;

@RestController
public class VocabularyController {

    private final VocabularyService vocabularyService;

    @Autowired
    public VocabularyController(VocabularyService service) {
        this.vocabularyService = service;
    }


    @GetMapping("/vocabulary")
    public ResponseEntity<List<Vocabulary>> getAllVocabulary() {
        // Call the StoryService to fetch all stories from the database
        List<Vocabulary> allVocabulary = vocabularyService.getAllVocabulary();

        // Return the list of stories in the response with a 200 OK status
        return ResponseEntity.status(HttpStatus.OK).body(allVocabulary);
    }

    @GetMapping("/vocabtest")
    public String getHelloVocab() {
        return "hello vocabulary";
    }

    @PostMapping("/vocabulary")
    public ResponseEntity<Vocabulary> createVocabulary(@RequestBody Vocabulary vocabulary) {
        // Call the createNewVocabulary method of the VocabularyService
        Vocabulary newVocabulary = vocabularyService.createNewVocabulary(vocabulary.getTerm(), vocabulary.getDefinition());
        // Return the newly created story in the response with a 201 Created status
        return ResponseEntity.status(HttpStatus.CREATED).body(newVocabulary);
    }
}

// controllers should only be your access point
// controllers also responsible for security