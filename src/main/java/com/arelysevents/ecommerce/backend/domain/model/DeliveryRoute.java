package com.arelysevents.ecommerce.backend.domain.model;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class DeliveryRoute {
    private Integer id;
    private LocalDateTime deliveryDate;
    private Integer employeeId;
    private String address;
    private List<Reservation> reservations;

    //TODO DESCOMENTAR AL AGREGAR ESTE MÉTODO A LA IMPLEMENTACION DEL MAPPER Y MANDAR LLAMAR A ESE METODO DESDE AQUI
    //    public void assignEmployee(Long employeeId) {
    //        this.employeeId = employeeId;
    //    }
    
}



