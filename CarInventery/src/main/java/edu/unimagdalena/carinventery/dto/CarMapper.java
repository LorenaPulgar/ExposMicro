package edu.unimagdalena.carinventery.dto;

import edu.unimagdalena.carinventery.Model.Car;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CarMapper {
    CarDto carToCarDto(Car car);
    Car carTosaveToCar(CarTosave carTosave);
    List<CarDto> CarListToCarDtoList(List<Car> cars);
}
