package com.diokou.demosspring.services;

import com.diokou.demosspring.models.Car;
import com.diokou.demosspring.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CarService {
    @Autowired
    private CarRepository _carRepo;
    static ArrayList<Car> cars = new ArrayList<>(Arrays.asList(
            new Car(1,"Citroen", "lorem ispmsi sdsksks qhdgsqydgq", "noir", Car.TypeCar.NEUF),
            new Car(2,"Ford 2020 K", "lorem ispmsi sdsksks qhdgsqydgq", "bleu", Car.TypeCar.NEUF),
            new Car(3,"Nissan Deco 20", "lorem ispmsi sdsksks qhdgsqydgq", "vert", Car.TypeCar.OCCASION),
            new Car(4,"KIa De 20", "lorem ispmsi sdsksks qhdgsqydgq", "vert", Car.TypeCar.NEUF)));
    // get all cars
    public List<Car> getCars()
    {
        List<Car> _cars =new  ArrayList<>();
        _carRepo.findAll().forEach(car ->{
            _cars.add(car);
        });
        return _cars;
    }
    // get one car by name
    public Car getCarById(Integer id)
    {
        return cars.stream().filter(car -> car.getId() == id).findFirst().orElse(null);
    }
    // add car
    public Car Create(Car car){
        int id = cars.size();
        car.setId(id+1);
        cars.add(car);
        return car;
    }
    // delete car by id
    public void DeleteCar(int id){
        cars.removeIf(car -> car.getId() == id);
    }
    // update car
    public void updateCar(Car car,int id)
    {
        cars.forEach(car1 -> {
            if(car1.getId() == id){
                cars.set(cars.indexOf(car1),car);
            }
        });
    }
}

