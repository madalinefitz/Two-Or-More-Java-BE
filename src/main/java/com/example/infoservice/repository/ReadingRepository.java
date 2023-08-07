package com.example.infoservice.repository;

import com.example.infoservice.entity.Reading;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReadingRepository extends JpaRepository<Reading, Integer> {
    // You can define custom query methods or use the default methods provided by JpaRepository
}