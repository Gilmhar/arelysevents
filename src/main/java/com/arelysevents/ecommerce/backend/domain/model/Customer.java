package com.arelysevents.ecommerce.backend.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    private Integer id;
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String phone;
    private LocalDateTime dateCreated;
    private LocalDateTime dateUpdated;
}
