package com.example.infoservice.controller;

import com.example.infoservice.entity.DigitalMaterial;
import com.example.infoservice.entity.Story;
import com.example.infoservice.service.DigitalMaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DigitalMaterialController {

    private final DigitalMaterialService digitalMaterialService;

    @Autowired
    public DigitalMaterialController(DigitalMaterialService digitalMaterialService){
        this.digitalMaterialService = digitalMaterialService;
    }

    @GetMapping("/testdm")
    public String getHello() {
        return "hello";
        //test route working
    }

    @GetMapping("/digitalmaterials")
    public ResponseEntity<List<DigitalMaterial>> getAllDigitalMaterial(){
        List<DigitalMaterial> allDigitalMaterials = digitalMaterialService.getAllDigitalMaterial();
        return ResponseEntity.status(HttpStatus.OK).body(allDigitalMaterials);
    }

    @PostMapping("/digitalmaterials")
    public ResponseEntity<DigitalMaterial> createDigitalMaterial(@RequestBody DigitalMaterial digitalMaterial) {
        DigitalMaterial newDigitalMaterial = digitalMaterialService.createNewDigitalMaterial(digitalMaterial.getTitle(), digitalMaterial.getDescription(), digitalMaterial.getAuthorName(), digitalMaterial.getAuthorPhoto(), digitalMaterial.getLink());
        return ResponseEntity.status(HttpStatus.CREATED).body(newDigitalMaterial);
    }

}


