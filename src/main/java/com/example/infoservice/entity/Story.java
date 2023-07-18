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

    @Column(nullable = false, length = 100)
    private String first_name;

    @Column(nullable = false, length = 1)
    private String last_initial;

    @Column(name = "created_date")
    private LocalDateTime createdDate;

    // Constructors
    // No need to write explicit getters, setters, equals(), hashCode(), and toString() methods

    public Story() {
        // Default constructor
    }

    public Story(String story, String first_name, String last_initial) {
        this.story = story;
        this.first_name = first_name;
        this.last_initial = last_initial;
    }
}


