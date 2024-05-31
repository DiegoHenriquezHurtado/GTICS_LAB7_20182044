package com.example.lab7_gtics2024_1.Entitys;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "resources")
public class Resources {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "resourceId" , nullable = false)
    private Integer idResource;

    @Column(name = "name")
    private String name;
}
