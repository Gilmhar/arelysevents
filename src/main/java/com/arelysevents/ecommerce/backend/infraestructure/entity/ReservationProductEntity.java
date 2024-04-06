package com.arelysevents.ecommerce.backend.infraestructure.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Table(name = "reservation_products")
@Data
public class ReservationProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer quantityReserved;
    private BigDecimal price;
    @ManyToOne
    @JoinColumn(name = "id") 
    private Integer product;
    @ManyToOne
    private Integer reservation;
}


