package edu.unimagdalena.carinventery.Service;

import edu.unimagdalena.carinventery.Repository.CarRepository;
import edu.unimagdalena.carinventery.dto.CarDto;
import edu.unimagdalena.carinventery.dto.CarMapper;
import edu.unimagdalena.carinventery.dto.CarTosave;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CarServiceImpl implements CarService{
    private final CarMapper carMapper;
    private final CarRepository carRepository;

    public CarServiceImpl(CarMapper carMapper, CarRepository carRepository) {
        this.carMapper = carMapper;
        this.carRepository = carRepository;
    }

    @Override
    public CarDto createCar(CarDto carDto) {
        return null;
    }

    @Override
    public CarDto updateCar(UUID id, CarTosave carTosave) {
        return null;
    }

    @Override
    public CarDto findCarById(UUID id) {
        return null;
    }

    @Override
    public void removeCar(UUID id) {

    }

    @Override
    public List<CarDto> getAllCars() {
        return List.of();
    }
}
