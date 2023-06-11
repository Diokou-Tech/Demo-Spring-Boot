package com.diokou.demosspring.controllers;

import com.diokou.demosspring.models.Car;
import com.diokou.demosspring.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarController {
    @Autowired
    private CarService _carService;

    /***
     * Get one car by name
     * @return
     */
    @GetMapping(value = "api/car/{id}")
    public Car Getcar(@PathVariable Integer id)
    {
        return _carService.getCarById(id);
    }
    /***
     * Get all cars
     * @return
     */
    @GetMapping(value = "api/car")
    public List<Car> GetCars()
    {
        return _carService.getCars();
    }
    /***
     * add car
     */
    @PostMapping(value = "api/car")
    public Car addCar(@RequestBody Car car)
    {
        return _carService.Create(car);
    }

    /**
     * Delete one car
     * @param id
     */
    @DeleteMapping(value = "api/car/{id}")
    public void deleteCar(@PathVariable  int id)
    {
        _carService.DeleteCar(id);
    }
    /**
     * update a car
     */
    @PutMapping(value ="api/car/{id}")
    public void updateCar(@RequestBody Car car,@PathVariable int id)
    {
        _carService.updateCar(car,id);
    }

}
