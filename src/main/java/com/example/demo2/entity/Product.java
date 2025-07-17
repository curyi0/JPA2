package com.example.demo2.entity;

import jakarta.persistence.*;
import lombok.*;

    @Entity
    @Data
    @Table(name = "products")
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
public class Product {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY) // DB가 ID를 자동으로 생성하도록 변경
        @Column(name = "id")
        private Long id;

        @Column(name = "name" ,nullable = false)
        private String name;

        @Column(name = "price" ,nullable = false)
        private double price;

        @Column(name = "category")
        private String category;

        @Column(name = "instock")
        private boolean instock;

    }
