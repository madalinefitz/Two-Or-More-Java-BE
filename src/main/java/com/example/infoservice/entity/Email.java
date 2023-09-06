package com.example.infoservice.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name="emails")
@Data


public class Email {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, name="email", length=100)
    private String email;

    @Column(name = "created_date")
    private LocalDateTime createdDate;

    public Email() {
        // default constructor
    }

    public Email(String email) {
        this.email = email;
    }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email;}

    public LocalDateTime getCreatedDate(){ return createdDate;}
    public void setCreatedDate(LocalDateTime createdDate){ this.createdDate = createdDate; }

    @PrePersist
    public void prePersist() { createdDate = LocalDateTime.now(); }
}
