package com.example.infoservice.repository;

import com.example.infoservice.entity.Email;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailRepository extends JpaRepository<Email, Integer> {
    // currently using default methods provided by jpa //
}
