package com.example.infoservice.controller;

import com.example.infoservice.service.StoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/stories")
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


}

