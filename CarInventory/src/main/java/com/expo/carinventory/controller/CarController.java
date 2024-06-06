package com.expo.carinventory.controller;

import com.expo.carinventory.dto.CarDto;
import com.expo.carinventory.dto.CarToSaveDto;
import com.expo.carinventory.service.CarService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/car")
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @PostMapping
    public CarDto create(@RequestBody CarToSaveDto car) {
        return carService.create(car);
    }

    @GetMapping("/{id}")
    public CarDto findbyId(@PathVariable UUID id) {
        return carService.findById(id);
    }

    @GetMapping
    public List<CarDto> findAll() {
        return carService.findAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) {
        carService.delete(id);
    }

    @GetMapping("/listAvailableCar")
    public List<CarDto> getAllAvailableCars() {
        return carService.getAllAvailableCars();
    }

    @PostMapping("/reserve/{id}")
    public CarDto reserveCar(@PathVariable UUID id) {
        return carService.reserveCar(id);
    }

    @PostMapping("/return/{id}")
    public CarDto returnCar(@PathVariable UUID id) {
        return carService.returnCar(id);
    }
}
