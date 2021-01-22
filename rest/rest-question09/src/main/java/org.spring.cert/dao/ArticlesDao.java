package org.spring.cert.dao;

import org.spring.cert.ds.Article;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ArticlesDao extends CrudRepository<Article, Integer> {
    List<Article> findByBodyLikeIgnoreCase(String content);
}
