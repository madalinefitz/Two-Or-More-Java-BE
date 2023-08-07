package com.example.infoservice.service;

import com.example.infoservice.entity.ReadingMaterial;
import com.example.infoservice.repository.ReadingMaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReadingMaterialService {

    private final ReadingMaterialRepository readingMaterialRepository;

    @Autowired
    public ReadingMaterialService(ReadingMaterialRepository readingMaterialRepository) {
        this.readingMaterialRepository = readingMaterialRepository;
    }

    public List<String> GetReadingMaterial() {
        ReadingMaterial readingMaterial= new ReadingMaterial();
        readingMaterial.setTitle("Great Book");
        readingMaterial.setDescription("This is a really great book about important things you should know");
        readingMaterial.setAuthorName("rupi kaur");
        readingMaterial.setAuthorPhoto("https://static01.nyt.com/images/2017/12/17/books/review/17WilsonSub/17WilsonSub-superJumbo.jpg");
        readingMaterial.setBookCover("https://images.unsplash.com/photo-1544947950-fa07a98d237f?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=687&q=80");
        readingMaterial.setLink("https://www.amazon.com/Milk-Honey-Rupi-Kaur/dp/144947425X");
        readingMaterialRepository.saveAndFlush(readingMaterial);
        return new ArrayList<>();
    }

    public ReadingMaterial createNewReadingMaterial(String title, String description, String authorName, String authorPhoto, String bookCover, String link) {
        ReadingMaterial newReadingMaterial = new ReadingMaterial(title, description, authorName, authorPhoto, bookCover, link);
        return readingMaterialRepository.save(newReadingMaterial);
    }

    public List<ReadingMaterial> getAllReadingMaterials() {
        return readingMaterialRepository.findAll();
    }
}