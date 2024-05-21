package edu.unimagdalena.bookingservice.Service;

import edu.unimagdalena.bookingservice.Dto.BookingDto;
import edu.unimagdalena.bookingservice.Dto.BookingMapper;
import edu.unimagdalena.bookingservice.Dto.BookingToSaveDto;
import edu.unimagdalena.bookingservice.Repository.BookingRepository;

import java.util.List;
import java.util.UUID;

public class BookingServiceImpl implements BookingService{
    private final BookingMapper bookingMapper;
    private final BookingRepository bookingRepository;

    public BookingServiceImpl(BookingMapper bookingMapper, BookingRepository bookingRepository) {
        this.bookingMapper = bookingMapper;
        this.bookingRepository = bookingRepository;
    }

    @Override
    public BookingDto createBooking(BookingToSaveDto bookingToSaveDto) {
        return null;
    }

    @Override
    public BookingDto updateBooking(UUID id, BookingToSaveDto bookingToSaveDto) {
        return null;
    }

    @Override
    public BookingDto findBookingById(UUID id) {
        return null;
    }

    @Override
    public void removeBooking(UUID id) {

    }

    @Override
    public List<BookingDto> getAllBookings() {
        return List.of();
    }
}
