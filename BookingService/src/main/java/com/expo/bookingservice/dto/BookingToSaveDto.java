package com.expo.bookingservice.dto;

import java.util.UUID;

public record BookingToSaveDto(
        UUID carId,
        UUID customerId
) {
}
