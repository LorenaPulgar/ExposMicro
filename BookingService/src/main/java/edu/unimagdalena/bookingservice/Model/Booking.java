package edu.unimagdalena.bookingservice.Model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "Bookings")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private UUID Carid;
    private UUID Customerid;
    private String status;
    private LocalDateTime startDate;
    private LocalDateTime endDate;

}
