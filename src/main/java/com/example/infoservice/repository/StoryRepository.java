package com.example.infoservice.repository;

import com.example.infoservice.entity.Story;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoryRepository extends JpaRepository<Story, Integer> {
    // You can define custom query methods or use the default methods provided by JpaRepository
}