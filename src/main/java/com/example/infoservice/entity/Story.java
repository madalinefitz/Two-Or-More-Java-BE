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
    // No need to write explicit getters, setters, equals(), hashCode(), and toString() methods

    public Story() {
        // Default constructor
    }

    public Story(String story, String firstName, String lastInitial) {
        this.story = story;
        this.firstName = firstName;
        this.lastInitial = lastInitial;
    }

}


