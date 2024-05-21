package edu.unimagdalena.bookingservice.Repository;

import edu.unimagdalena.bookingservice.Model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BookingRepository extends JpaRepository<Booking, UUID> {
}
