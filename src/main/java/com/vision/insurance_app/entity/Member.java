package com.vision.insurance_app.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int age;
    private String contact;
    private String policyNumber;
}