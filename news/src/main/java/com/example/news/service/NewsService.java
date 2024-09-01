package com.example.news.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.news.model.News;
import com.example.news.repository.NewsRepository;

@Service
public class NewsService {

    @Autowired
    private NewsRepository newsRepository;

    public List<News> getAllNews() {
        return newsRepository.findAll();
    }

    public News getNewsById(Long id) {
        return newsRepository.findById(id).orElse(null);
    }

    public News createNews(News news) {
        return newsRepository.save(news);
    }

    public void deleteNews(Long id) {
        newsRepository.deleteById(id);
    }
}