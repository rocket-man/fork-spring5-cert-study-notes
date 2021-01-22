package org.spring.cert.dao;

import org.spring.cert.ds.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticlesDao extends CrudRepository<Article, Integer> {
}
