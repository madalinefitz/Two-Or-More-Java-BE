package com.example.infoservice.repository;

import com.example.infoservice.entity.DigitalMaterial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DigitalMaterialRepository extends JpaRepository<DigitalMaterial, Integer> {
    // currently using default methods provided by jpa //
}
