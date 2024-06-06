package com.expo.bookingservice.repository;

import com.expo.bookingservice.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface BookingRepository extends JpaRepository<Booking, UUID> {
    Optional<Booking> findByCarId(UUID carId);
}
