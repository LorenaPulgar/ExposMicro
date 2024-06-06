package com.expo.carinventory.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "car")
@AllArgsConstructor
@Getter
@Setter
@Builder
@NoArgsConstructor
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String model;
    private String maker;
    private Boolean available;
}
