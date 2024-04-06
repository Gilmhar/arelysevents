package com.arelysevents.ecommerce.backend.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private Integer id;
    private String name;
    private String code;
    private String description;
    private String urlImage;
    private BigDecimal priceRent;
    private Integer quantityAvailable;
    private Integer categoryId;
    private LocalDateTime dateCreated;
    private LocalDateTime dateUpdated;
}
