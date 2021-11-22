package com.springPractice.blog.models;

import lombok.*;

import javax.persistence.*;
@Data
@NoArgsConstructor
@Entity
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title, anons, full_text;

    private int views;

    public Post(String title, String anons, String fullText) {
        this.title = title;
        this.anons = anons;
        this.full_text = full_text;
    }
}
