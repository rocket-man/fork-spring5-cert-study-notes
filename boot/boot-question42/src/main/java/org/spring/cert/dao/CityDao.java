package org.spring.cert.dao;

import org.spring.cert.entity.City;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CityDao extends CrudRepository<City, Integer> {
    Optional<City> findByName(String name);
}
