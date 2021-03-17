package com.cg.apps.hotelbooking.roomms.dao;

import com.cg.apps.hotelbooking.roomms.entities.Room;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IRoomRepository extends JpaRepository<Room, Long> {
}
