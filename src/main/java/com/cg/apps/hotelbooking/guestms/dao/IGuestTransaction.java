package com.cg.apps.hotelbooking.guestms.dao;

import com.cg.apps.hotelbooking.guestms.entities.GuestTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IGuestTransaction extends JpaRepository<GuestTransaction, Long> {
}
