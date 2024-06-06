package com.expo.carinventory.dto;

import com.expo.carinventory.entity.BookingStatus;

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
