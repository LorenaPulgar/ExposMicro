package com.expo.bookingservice.service;

import com.expo.bookingservice.dto.BookingDto;
import com.expo.bookingservice.dto.BookingToSaveDto;
import com.expo.bookingservice.entity.BookingStatus;

import java.util.List;
import java.util.UUID;

public interface BookingService {
    BookingDto create (BookingToSaveDto bookingToSaveDto);
    BookingDto findById(UUID id);
    List<BookingDto> findAll();
    void deleteById(UUID id);
    BookingDto updateStatusByCar(UUID cardId, BookingStatus status);
    BookingDto findByCarId(UUID id);
}
