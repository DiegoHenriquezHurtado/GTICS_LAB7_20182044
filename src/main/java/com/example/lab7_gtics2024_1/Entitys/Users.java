package com.example.lab7_gtics2024_1.Entitys;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userId" , nullable = false)
    private Integer idUser;

    @Column(name = "name")
    private String name;

    @Column(name = "type")
    private String type;

    @ManyToOne
    @JoinColumn(name = "authorizedResource")
    private Resources authorizedResource;

    @Column(name = "active")
    private Boolean active;
}
