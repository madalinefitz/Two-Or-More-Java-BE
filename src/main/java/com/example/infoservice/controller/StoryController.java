package com.example.infoservice.controller;

import com.example.infoservice.entity.Story;
import com.example.infoservice.service.StoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StoryController {

    private final StoryService storyService;

    @Autowired
    public StoryController(StoryService service) {
        this.storyService = service;
    }

    @GetMapping("/stories")
    public List<String> getStories() {
        return storyService.GetStory();
    }

    @GetMapping("/test")
    public String getHello() {
        return "hello";
        //test route working
    }

    @PostMapping("/stories")
    public ResponseEntity<Story> createStory(@RequestBody StoryRequest request){
        // Extract information from the request
        String storyText = request.getStory();
        String firstName = request.getFirstName();
        String lastInitial = request.getLastInitial();

        // Call the createNewStory method of the StoryService
        Story newStory = storyService.createNewStory(storyText, firstName, lastInitial);

        // Return the newly created story in the response with a 201 Created status
        return ResponseEntity.status(HttpStatus.CREATED).body(newStory);
    }


}

