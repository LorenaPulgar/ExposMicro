package com.expo.bookingservice.controller;

import com.expo.bookingservice.dto.CarDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import java.util.UUID;
@FeignClient(name = "car-service", url = "http://localhost:8082")
public interface CarConsumer {
    @PostMapping("/car/reserve/{id}")
    CarDto reserveCar(@PathVariable UUID id);

    @PostMapping("/car/return/{id}")
    CarDto returnCar(@PathVariable UUID id);
}
