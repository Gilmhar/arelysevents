package com.arelysevents.ecommerce.backend.domain.port;

import com.arelysevents.ecommerce.backend.domain.model.Reservation;

public interface IReservationRepository {
    Reservation save(Reservation reservation);
    Reservation findById(Integer id);
    Iterable<Reservation> findAll();
    Iterable<Reservation> findByUserPhone(String userPhone);
    void updateStateAndPaymentById(Integer id, String state, boolean fullyPaid);
}
