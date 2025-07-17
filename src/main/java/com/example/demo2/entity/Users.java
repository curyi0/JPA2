package com.example.demo2.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "users")

@NoArgsConstructor
@AllArgsConstructor
public class Users{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // DB가 ID를 자동으로 생성하도록 변경
    @Column(name = "name")
    private String name;

    @Column(name = "age" ,nullable = false)
    private int age;

    @Column(name = "email")
    private String email;

    @Column(name = "city")
    private String city;
}
