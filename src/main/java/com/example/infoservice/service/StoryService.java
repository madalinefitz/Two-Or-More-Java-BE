package com.example.infoservice.service;

import com.example.infoservice.entity.Story;
import com.example.infoservice.repository.StoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StoryService {

    private final StoryRepository storyRepository;

    @Autowired
    public StoryService(StoryRepository storyRepository) {
        this.storyRepository = storyRepository;
    }

    public List<String> GetStory() {
        Story story= new Story();
        story.setStory("stories");
        story.setFirstName("Cindy");
        story.setLastInitial("L");
        Story story2 = new Story("stories", "Cindy", "L");
        storyRepository.saveAndFlush(story);
        storyRepository.saveAndFlush(story2);
        return new ArrayList<>();
    }

    public Story createNewStory(String storyText, String firstName,String lastInitial) {
        Story newStory = new Story(storyText, firstName, lastInitial);
        return storyRepository.save(newStory);
    }

    public List<Story> getAllStories() {
        // Use the findAll method of the StoryRepository to fetch all stories from the database
        return storyRepository.findAll();
    }
}
