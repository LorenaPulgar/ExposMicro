package com.expo.bookingservice.dto;

import com.expo.bookingservice.entity.Booking;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BookingMapper {
    BookingDto bookingToBookingDto(Booking booking);
    List<BookingDto> bookingListToBookingDtoList(List<Booking> bookings);
}
