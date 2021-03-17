package com.cg.apps.hotelbooking.roomms.dao;

import com.cg.apps.hotelbooking.roomms.entities.Room;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IRoomRepository extends JpaRepository<Room, Long> {
}
