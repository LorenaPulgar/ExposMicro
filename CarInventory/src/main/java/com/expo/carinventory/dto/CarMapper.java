package com.expo.carinventory.dto;

import com.expo.carinventory.entity.Car;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CarMapper {

    CarDto carToCarDto(Car car);
    Car carToSaveDtoToCar(CarToSaveDto carToSaveDto);
    List<CarDto> carsToCarDtos(List<Car> cars);
}
