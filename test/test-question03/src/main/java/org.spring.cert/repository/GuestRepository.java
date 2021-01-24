package org.spring.cert.repository;

import org.spring.cert.ds.Guest;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

public interface GuestRepository extends CrudRepository<Guest, UUID> {

    List<Guest> findAll();
}
