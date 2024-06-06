package com.expo.bookingservice.service;

import com.expo.bookingservice.controller.CarConsumer;
import com.expo.bookingservice.dto.BookingDto;
import com.expo.bookingservice.dto.BookingMapper;
import com.expo.bookingservice.dto.BookingToSaveDto;
import com.expo.bookingservice.entity.Booking;
import com.expo.bookingservice.entity.BookingStatus;
import com.expo.bookingservice.repository.BookingRepository;
import feign.FeignException;
import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
public class BookingServiceImpl implements BookingService {

    private final BookingRepository bookingRepository;
    private final BookingMapper bookingMapper;
    private final CarConsumer carConsumer;

    @Autowired
    public BookingServiceImpl(BookingMapper bookingMapper, BookingRepository bookingRepository, CarConsumer carConsumer) {
        this.bookingRepository = bookingRepository;
        this.bookingMapper = bookingMapper;
        this.carConsumer = carConsumer;
    }

    @Override
    public BookingDto create(BookingToSaveDto booking) {
        Booking bookingToSave = Booking.builder()
                .carId(booking.carId())
                .customerId(booking.customerId())
                .startDate(LocalDateTime.now())
                .status(BookingStatus.CONFIRMED)
                .build();
        try {
            carConsumer.reserveCar(booking.carId());
        } catch (FeignException e) {
            throw new ServiceException("No se pudo reservar el vehículo");
        }
        bookingToSave = bookingRepository.save(bookingToSave);
        return bookingMapper.bookingToBookingDto(bookingToSave);
    }

    @Override
    public BookingDto findById(UUID id) {
        Booking booking = bookingRepository.findById(id)
                .orElseThrow(() -> new ServiceException("No se encontró la reserva"));
        return bookingMapper.bookingToBookingDto(booking);
    }

    @Override
    public List<BookingDto> findAll() {
        return bookingMapper.bookingListToBookingDtoList(bookingRepository.findAll());
    }

    @Override
    public void deleteById(UUID id) {
        bookingRepository.deleteById(id);
    }

    @Override
    public BookingDto updateStatusByCar(UUID carId, BookingStatus newStatus) {
        Booking booking = bookingRepository.findByCarId(carId)
                .orElseThrow(() -> new ServiceException("No se encontró la reserva"));
        booking.setStatus(newStatus);
        if (newStatus.equals(BookingStatus.COMPLETED)) {
            booking.setEndDate(LocalDateTime.now());
        }
        booking = bookingRepository.save(booking);
        return bookingMapper.bookingToBookingDto(booking);
    }

    @Override
    public BookingDto findByCarId(UUID id) {
        Booking booking = bookingRepository.findByCarId(id)
                .orElseThrow(() -> new ServiceException("No se encontró la reserva"));
        return bookingMapper.bookingToBookingDto(booking);
    }
}


