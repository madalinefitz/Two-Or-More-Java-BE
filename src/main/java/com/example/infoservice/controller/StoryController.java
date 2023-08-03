package com.example.infoservice.controller;

import com.example.infoservice.entity.Story;
import com.example.infoservice.service.StoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

import java.util.List;

@RestController
public class StoryController {

    private final StoryService storyService;

    @Autowired
    public StoryController(StoryService service) {
        this.storyService = service;
    }

    @GetMapping("/stories")
    public ResponseEntity<List<Story>> getAllStories(@RequestParam(defaultValue = "3") int limit) {
        // Call the StoryService to fetch all stories from the database
        List<Story> allStories = storyService.getAllStories();

        // Limit the number of results based on the 'limit' parameter
        List<Story> limitedStories = allStories.subList(0, Math.min(limit, allStories.size()));

        // Return the list of stories in the response with a 200 OK status
        return ResponseEntity.status(HttpStatus.OK).body(limitedStories);
    }

    @GetMapping("/test")
    public String getHello() {
        return "hello";
        //test route working
    }

    @PostMapping("/stories")
    public ResponseEntity<Story> createStory(@RequestBody Story story) {
        // Call the createNewStory method of the StoryService
        Story newStory = storyService.createNewStory(story.getStory(), story.getFirstName(), story.getLastInitial());

        // Return the newly created story in the response with a 201 Created status
        return ResponseEntity.status(HttpStatus.CREATED).body(newStory);
    }
}

