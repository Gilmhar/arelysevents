package com.arelysevents.ecommerce.backend.infraestructure.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "delivery_routes")
@Data
public class DeliveryRouteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @CreationTimestamp
    private LocalDateTime deliveryDate;
    @ManyToOne
    @JoinColumn(name = "id")
    private Integer employee;
    private String address;
    @OneToOne(mappedBy = "deliveryRoute")
    private Integer reservation;
}
