package com.example.infoservice.service;

import org.springframework.stereotype.Service;

@Service
public class StoryService {

    private final StoryRepository storyRepository;

    @Autowired
    public StoryService(StoryRepository storyRepository) {
        this.stroyRepository = storyRepository;
    }

    public List<String> GetStory() {
        Story story= new Story();
        story.setStory("stories");
        story.setFirstName("Cindy");
        story.setLastInitial("L.");
        Story story2 = new Story("stories", "Cindy", "L.");
        storyRepository.saveAndFlush(story);
        return new ArrayList<>();
    }
}
