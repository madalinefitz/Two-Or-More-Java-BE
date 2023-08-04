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

    @Column(nullable = false, name="term", length = 100)
    private String term;

    @Column(nullable = false, name="definition", length = 250)
    private String definition;

    @Column(name = "created_date")
    private LocalDateTime createdDate;

    @Column(name = "update_date")
    private LocalDateTime updateDate;

    // Constructors
    // No need to write explicit getters, setters, equals(), hashCode(), and toString() methods?

    public Vocabulary() {
        // Default constructor
    }

    public Vocabulary(String term, String definition) {
        this.term = term;
        this.definition = definition;
    }

    public String getTerm() { return term; }

    public void setTerm(String term) { this.term = term; }

    public String getDefinition() { return definition; }

    public void setDefinition(String definition) { this.definition = definition; }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }

    // @PrePersist callback method to set createdDate before insertion
    @PrePersist
    public void prePersist() {
        createdDate = LocalDateTime.now();
    }
}

