package com.expo.paymentservice.service;

import com.expo.paymentservice.dto.PaymentDto;
import com.expo.paymentservice.dto.PaymentToSaveDto;

import java.util.List;
import java.util.UUID;

public interface PaymentService {
    PaymentDto findByPaymentId(UUID paymentId);
    List<PaymentDto> findAllPayments();
    PaymentDto processPayment(PaymentToSaveDto paymentToSaveDto);
    void deletePayment(UUID paymentId);
}
