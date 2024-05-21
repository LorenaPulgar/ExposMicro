package edu.unimagdalena.bookingservice.Dto;

import java.time.LocalDateTime;
import java.util.UUID;

public record BookingDto(
        UUID id,
        UUID Carid,
        UUID Customerid,
        String status,
        LocalDateTime startDate,
        LocalDateTime endDate
) {
}
