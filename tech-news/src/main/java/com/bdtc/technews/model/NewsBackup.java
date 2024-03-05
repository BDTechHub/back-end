package com.bdtc.technews.model;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.UUID;

@Entity
@Table(name = "news_backup")
@Getter
public class NewsBackup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private UUID newsId;

    private String title;

    private String summary;

    private String body;

    private String imageUrl;

    public NewsBackup(News news) {
        this.newsId = news.getId();
        this.title = news.getTitle();
        this.summary = news.getSummary();
        this.body = news.getBody();
        this.imageUrl = news.getImageUrl();
    }
}
