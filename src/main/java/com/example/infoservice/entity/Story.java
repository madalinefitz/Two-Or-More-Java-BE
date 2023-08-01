package com.example.infoservice.entity;


import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Table(name = "stories")
@Data


public class Story {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 250)
//    can this be whatever count we want?
    private String story;

    @Column(nullable = false, name="first_name", length = 100)
    private String firstName;

    @Column(nullable = false, name="last_initial", length = 1)
    private String lastInitial;

    @Column(name = "created_date")
    private LocalDateTime createdDate;

    // Constructors

    public Story() {
        // Default constructor
    }

    public Story(String story, String firstName, String lastInitial) {
        this.story = story;
        this.firstName = firstName;
        this.lastInitial = lastInitial;
    }

    public String getStory() { return story; }

    public void setStory(String story) { this.story = story; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastInitial() {return lastInitial; }
    public void setLastInitial(String lastInitial) { this.lastInitial = lastInitial; }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    // @PrePersist callback method to set createdDate before insertion
    @PrePersist
    public void prePersist() {
        createdDate = LocalDateTime.now();
    }



}


