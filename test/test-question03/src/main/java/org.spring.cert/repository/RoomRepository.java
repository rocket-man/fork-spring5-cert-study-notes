package org.spring.cert.repository;

import org.spring.cert.ds.Room;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;
import java.util.UUID;

public interface RoomRepository extends CrudRepository<Room, UUID> {

    Set<Room> findAll();
}
