package com.example.CarRentalSystem.ENTITIES;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;
    private String password;
    private long location;

    @OneToMany(mappedBy = "user")
    private List<Booking> bookings;
}
