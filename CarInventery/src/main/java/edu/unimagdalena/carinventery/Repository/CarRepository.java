package edu.unimagdalena.carinventery.Repository;

import edu.unimagdalena.carinventery.Model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CarRepository extends JpaRepository<Car, UUID>{

}
