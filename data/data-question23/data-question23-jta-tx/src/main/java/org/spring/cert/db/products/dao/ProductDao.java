package org.spring.cert.db.products.dao;


import org.spring.cert.db.products.ds.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductDao extends CrudRepository<Product, Integer> {
}
