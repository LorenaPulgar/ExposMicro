package edu.unimagdalena.bookingservice.Dto;

import edu.unimagdalena.bookingservice.Model.Booking;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookingMapper {

    BookingDto toBookingDto(Booking booking);
    Booking toBooking(BookingDto bookingDto);
}
