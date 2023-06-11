package com.diokou.demosspring.controllers;

import com.diokou.demosspring.models.Car;
import com.diokou.demosspring.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
public class TestController {

    @GetMapping(value = "api/test")
    public String GetString()
    {
        return "Hello Win Dem !";
    }
    @GetMapping(value = "api/test/{id}")
    public String GetOneString(String id)
    {
        return "Voici l'id : " + id;
    }
}
