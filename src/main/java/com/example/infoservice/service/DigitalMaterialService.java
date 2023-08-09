package com.example.infoservice.service;

import com.example.infoservice.entity.DigitalMaterial;
import com.example.infoservice.repository.DigitalMaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DigitalMaterialService {

    private final DigitalMaterialRepository digitalMaterialRepository;

    @Autowired
    public DigitalMaterialService (DigitalMaterialRepository digitalMaterialRepository) {
        this.digitalMaterialRepository = digitalMaterialRepository;
    }

    public DigitalMaterial createNewDigitalMaterial(String title, String description, String authorName, String authorPhoto, String link) {
        DigitalMaterial newDigitalMaterial = new DigitalMaterial(title, description, authorName, authorPhoto, link);
      return digitalMaterialRepository.save(newDigitalMaterial);
    }
    public List<DigitalMaterial> getAllDigitalMaterial() {
        return digitalMaterialRepository.findAll();
    }

}
