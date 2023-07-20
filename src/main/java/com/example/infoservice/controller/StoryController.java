package com.example.infoservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

