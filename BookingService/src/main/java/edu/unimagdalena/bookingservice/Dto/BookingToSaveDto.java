package edu.unimagdalena.bookingservice.Dto;
import java.time.LocalDateTime;
public record BookingToSaveDto(
        String status,
        LocalDateTime startDate,
        LocalDateTime endDate
) {
}
