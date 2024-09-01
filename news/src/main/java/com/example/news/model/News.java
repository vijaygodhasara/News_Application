package com.example.news.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class News {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String title;
    private String content;
    private String author;
    private String publishedDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {        
       this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    public News() { 
    }

    public News(String title, String content, String author, String publishedDate) {
        this.title = title;
        this.content = content;
        this.author = author;
        this.publishedDate = publishedDate;
    }

    public News(Long id, String title, String content, String author, String publishedDate) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.author = author;
        this.publishedDate = publishedDate;
    }       

    @Override   
    public String toString() {
        return "News{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", author='" + author + '\'' +
                ", publishedDate='" + publishedDate + '\'' +
                '}';
    }
}        