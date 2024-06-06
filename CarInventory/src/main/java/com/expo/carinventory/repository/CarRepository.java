package com.expo.carinventory.repository;

import com.expo.carinventory.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface CarRepository extends JpaRepository<Car, UUID> {
    List<Car> findByAvailableTrue();
}
