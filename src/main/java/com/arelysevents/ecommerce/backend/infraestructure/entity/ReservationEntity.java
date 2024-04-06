package com.arelysevents.ecommerce.backend.infraestructure.entity;

import com.arelysevents.ecommerce.backend.domain.model.PaymentMethod;
import com.arelysevents.ecommerce.backend.domain.model.ReservationState;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "reservations")
@Data
public class ReservationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @CreationTimestamp
    private LocalDateTime bookingDate;
    @CreationTimestamp
    private LocalDateTime eventDate;
    @ManyToOne
    @JoinColumn(name = "id")
    private Integer customerId;
    private String eventAddress;
    @Enumerated(value = EnumType.STRING)
    private ReservationState reservationState;
    private Boolean fullyPaid;
    @Enumerated(value = EnumType.STRING)
    private PaymentMethod paymentMethod;
    @ManyToOne
    @JoinColumn(name = "id")  
    private Integer deliveryRoute;
    @OneToMany(mappedBy = "reservation", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ReservationProductEntity> reservationProducts;
}
