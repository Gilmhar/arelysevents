package com.arelysevents.ecommerce.backend.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Administrator {
    private Integer id;
    private String name;
    private String lastName;
    private String userName;
    private String password;
    private String address;
    private String phone;
    private LocalDateTime dateCreated;
    private LocalDateTime dateUpdated;
}
