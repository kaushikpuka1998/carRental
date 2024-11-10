package com.example.CarRentalSystem.ENTITIES;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String licencePlate;
    private String brand;
    private String model;
    private String color;
    private long drivenKilometers;
    private double pricePerDay;
    private boolean isAvailable;
    private long location;

    @OneToMany(mappedBy = "car")
    private List<Booking> bookings;
}
