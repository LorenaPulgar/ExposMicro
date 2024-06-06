package com.expo.bookingservice.controller;

import com.expo.bookingservice.dto.BookingDto;
import com.expo.bookingservice.dto.BookingToSaveDto;
import com.expo.bookingservice.entity.BookingStatus;
import com.expo.bookingservice.service.BookingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/booking")
public class BookingController {
    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping
    public BookingDto create(@RequestBody BookingToSaveDto booking) {
        return bookingService.create(booking);
    }

    @GetMapping("/{id}")
    public BookingDto findById(@PathVariable UUID id) {
        return bookingService.findById(id);
    }

    @GetMapping("/byCar/{id}")
    public BookingDto findByCarId(@PathVariable UUID id) {
        return bookingService.findByCarId(id);
    }

    @GetMapping
    public List<BookingDto> findAll() {
        return bookingService.findAll();
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable UUID id) {
        bookingService.deleteById(id);
    }

    @PutMapping("/updateStatusByCar")
    BookingDto updateStatusByCar(@RequestParam UUID id, @RequestParam BookingStatus status) {
        return bookingService.updateStatusByCar(id, status);
    }
}
