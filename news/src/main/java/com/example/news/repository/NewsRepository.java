package com.example.news.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.news.model.News;

@Repository
public interface NewsRepository extends JpaRepository<News, Long> {
}
