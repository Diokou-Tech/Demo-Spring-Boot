package com.diokou.demosspring.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Table(name = "demo_car")
@Getter
@Setter
@ToString
public class Car {

    public enum TypeCar {
        NEUF,
        OCCASION
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY  )
    public Integer Id;
    @NotNull
    public String Name;
    public String Description;
    public String Couleur;
    public TypeCar CarType;

    public Car()
    {
        super();
    }
    public Car(Integer id,String name, String description, String couleur, TypeCar carType) {
        Name = name;
        Description = description;
        Couleur = couleur;
        CarType = carType;
        Id = id;
    }
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getCouleur() {
        return Couleur;
    }

    public void setCouleur(String couleur) {
        Couleur = couleur;
    }

    public TypeCar getCarType() {
        return CarType;
    }

    public void setCarType(TypeCar carType) {
        CarType = carType;
    }
}
