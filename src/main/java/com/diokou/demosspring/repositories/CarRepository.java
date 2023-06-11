package com.diokou.demosspring.repositories;

import com.diokou.demosspring.models.Car;
import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<Car, Integer> {

}
