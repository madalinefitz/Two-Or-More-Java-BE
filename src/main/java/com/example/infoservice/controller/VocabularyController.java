package com.example.infoservice.controller;

import com.example.infoservice.service.VocabularyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
//@RequestMapping("/library/vocabulary")
public class VocabularyController {

    private final VocabularyService vocabularyService;

    @Autowired
    public VocabularyController(VocabularyService service) {
        this.vocabularyService = service;
    }

    @GetMapping("/library/vocabulary")
    public List<String> getVocabulary() {
       return vocabularyService.GetVocabulary();
    }
}

//controllers should only be your access point
//controllers also responsible for security