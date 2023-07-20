package com.example.infoservice.repository;

import com.example.infoservice.entity.Vocabulary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VocabularyRepository extends JpaRepository<Vocabulary, Integer> {
    // You can define custom query methods or use the default methods provided by JpaRepository
}

//this is our ORM, correct??