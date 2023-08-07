package com.example.infoservice.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import lombok.Data;

@Entity
@Table(name = "reading_materials")
@Data

public class ReadingMaterial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, name="title", length = 100)
    private String title;

    @Column(nullable = false, name="description", length = 500)
    private String description;

    @Column(nullable = false, name="author_name", length = 100)
    private String authorName;

    @Column(nullable = false, name="author_photo", length = 900)
    private String authorPhoto;

    @Column(nullable = false, name="book_cover", length = 900)
    private String bookCover;

    @Column(nullable = false, name="link", length = 900)
    private String link;

    @Column(name = "created_date")
    private LocalDateTime createdDate;

    @Column(name = "update_date")
    private LocalDateTime updateDate;


    public ReadingMaterial() {
        // Default constructor
    }

    public ReadingMaterial(String title, String description, String authorName, String authorPhoto, String bookCover, String link) {
        this.title = title;
        this.description = description;
        this.authorName = authorName;
        this.authorPhoto = authorPhoto;
        this.bookCover = bookCover;
        this.link = link;
    }

    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public String getAuthorName() { return authorName; }

    public void setAuthorName(String authorName) { this.authorName = authorName; }

    public String getAuthorPhoto() { return authorPhoto; }

    public void setAuthorPhoto(String authorPhoto) { this.authorPhoto = authorPhoto; }

    public String getBookCover() { return bookCover; }

    public void setBookCover(String bookCover) { this.bookCover = bookCover; }

    public String getLink() { return link; }

    public void setLink(String link) { this.link = link; }

    public LocalDateTime getCreatedDate() { return createdDate;}

    public void setCreatedDate(LocalDateTime createdDate) { this.createdDate = createdDate; }

    public LocalDateTime getUpdateDate() { return updateDate; }

    public void setUpdateDate(LocalDateTime updateDate) { this.updateDate = updateDate; }

    // @PrePersist callback method to set createdDate before insertion
    @PrePersist
    public void prePersist() { createdDate = LocalDateTime.now(); }

}