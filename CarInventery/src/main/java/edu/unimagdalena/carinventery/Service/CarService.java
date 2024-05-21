package edu.unimagdalena.carinventery.Service;

import edu.unimagdalena.carinventery.dto.CarDto;
import edu.unimagdalena.carinventery.dto.CarTosave;

import java.util.List;
import java.util.UUID;

public interface CarService {
    CarDto createCar(CarDto carDto);
    CarDto updateCar(UUID id, CarTosave carTosave);
    CarDto findCarById(UUID id);
    void removeCar(UUID id);
    List<CarDto> getAllCars();
}
