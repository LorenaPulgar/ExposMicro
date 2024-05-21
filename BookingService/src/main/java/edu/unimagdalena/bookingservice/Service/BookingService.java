package edu.unimagdalena.bookingservice.Service;

import edu.unimagdalena.bookingservice.Dto.BookingDto;
import edu.unimagdalena.bookingservice.Dto.BookingToSaveDto;

import java.util.List;
import java.util.UUID;

public interface BookingService {
    BookingDto createBooking(BookingToSaveDto bookingToSaveDto);
    BookingDto updateBooking(UUID id, BookingToSaveDto bookingToSaveDto);
    BookingDto findBookingById(UUID id);
    void removeBooking(UUID id);
    List<BookingDto> getAllBookings();
}
