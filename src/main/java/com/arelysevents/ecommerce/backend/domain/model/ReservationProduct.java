package com.arelysevents.ecommerce.backend.domain.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ReservationProduct {
    private Integer id;
    private Integer quantityReserved;
    private Integer productId;
    private Integer reservationId;
    private BigDecimal price;
}
