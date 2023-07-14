package com.example.infoservice.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import lombok.Data;

@Entity
@Table(name = "vocabulary")
@Data
public class Vocabulary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String term;

    @Column(nullable = false, length = 250)
    private String definition;

    @Column(name = "created_date")
    private LocalDateTime createdDate;

    @Column(name = "update_date")
    private LocalDateTime updateDate;

    // Constructors
    // No need to write explicit getters, setters, equals(), hashCode(), and toString() methods

    public Vocabulary() {
        // Default constructor
    }

    public Vocabulary(String term, String definition) {
        this.term = term;
        this.definition = definition;
    }
}

