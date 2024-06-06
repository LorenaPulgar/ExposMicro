package com.expo.paymentservice.dto;

import com.expo.paymentservice.entity.PaymentStatus;

import java.math.BigDecimal;
import java.util.UUID;

public record PaymentDto(
        UUID id,
        UUID bookingId,
        String creditCard,
        BigDecimal amount,
        PaymentStatus status,
        UUID transactionId
) {
}
