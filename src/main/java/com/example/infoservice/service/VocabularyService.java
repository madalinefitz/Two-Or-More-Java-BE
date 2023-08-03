package com.example.infoservice.service;

import com.example.infoservice.entity.Vocabulary;
import com.example.infoservice.repository.VocabularyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VocabularyService {

    private final VocabularyRepository vocabularyRepository;

    @Autowired
    public VocabularyService(VocabularyRepository vocabularyRepository) {
        this.vocabularyRepository = vocabularyRepository;
    }

    public List<String> GetVocabulary() {
        Vocabulary vocabulary = new Vocabulary();
        vocabulary.setTerm("Brian");
        vocabulary.setDefinition("great person");
        Vocabulary vocabulary2 = new Vocabulary("foo", "this is the definition");
        vocabularyRepository.saveAndFlush(vocabulary);
        return new ArrayList<>();
    }

//    get the vocab table
    public Vocabulary createNewVocabulary(String term, String definition) {
        Vocabulary newVocabulary = new Vocabulary(term, definition);
        return vocabularyRepository.save(newVocabulary);
    }

    public List<Vocabulary> getAllVocabulary() {
        // Use the findAll method of the VocabularyRepository to fetch all vocabulary from the database
        return vocabularyRepository.findAll();
    }

}
