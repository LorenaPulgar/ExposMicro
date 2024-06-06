package com.expo.bookingservice.dto;

import com.expo.bookingservice.entity.BookingStatus;

import java.time.LocalDateTime;
import java.util.UUID;

public record BookingDto(
        UUID id,
        UUID carId,
        UUID customerId,
        BookingStatus status,
        LocalDateTime startDate,
        LocalDateTime endDate
) {
}
