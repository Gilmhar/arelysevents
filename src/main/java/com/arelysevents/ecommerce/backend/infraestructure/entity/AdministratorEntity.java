package com.arelysevents.ecommerce.backend.infraestructure.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "administrators")
@Data
@NoArgsConstructor
public class AdministratorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 25)
    private String name;
    @Column(length = 25)
    private String lastName;
    @Column(unique = true, length = 25)
    private String userName;
    @Column(unique = true, length = 8)
    private String password;
    @Column(length = 100)
    private String address;
    @Column(unique = true, length = 15)
    private String phone;
    @CreationTimestamp
    private LocalDateTime dateCreated;
    @UpdateTimestamp
    private LocalDateTime dateUpdated;
}


