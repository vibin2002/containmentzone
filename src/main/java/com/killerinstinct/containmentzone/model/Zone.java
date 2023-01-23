package com.killerinstinct.containmentzone.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "Zone")
@Getter
@Setter
public class Zone {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    int id;
    @Column(name = "name")
    String name;
    @Column(name = "radius")
    double radius;
    @Column(name = "level")
    LEVEL level;
    @Column(name = "latitude")
    double latitude;
    @Column(name = "longitude")
    double longitude;
    @Column(name = "pincode")
    int pincode;
}

enum LEVEL{
    LOW(0),
    MEDIUM(1),
    HIGH(2);

    final int level;
    LEVEL(int level){
        this.level = level;
    }
}
