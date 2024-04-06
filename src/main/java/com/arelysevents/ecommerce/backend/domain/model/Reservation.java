package com.arelysevents.ecommerce.backend.domain.model;

import lombok.Data;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
public class Reservation {
    private Integer id;
    private LocalDateTime bookingDate;
    private LocalDateTime eventDate;
    private Integer customerId;
    private String eventAddress;
    private ReservationState reservationState;
    private Boolean fullyPaid;
    private PaymentMethod paymentMethod;
    private Integer deliveryRouteId;
    private List<ReservationProduct> reservationProducts;
    


}
