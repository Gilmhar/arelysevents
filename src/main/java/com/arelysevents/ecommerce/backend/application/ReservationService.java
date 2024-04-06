package com.arelysevents.ecommerce.backend.application;

import com.arelysevents.ecommerce.backend.domain.model.Customer;
import com.arelysevents.ecommerce.backend.domain.model.Reservation;
import com.arelysevents.ecommerce.backend.domain.port.IReservationRepository;

public class ReservationService {

    private final IReservationRepository iReservationRepository;

    public ReservationService(IReservationRepository iReservationRepository) {
        this.iReservationRepository = iReservationRepository;
    }

    public Reservation save(Reservation reservation){
        return this.iReservationRepository.save(reservation);
    }

    public Reservation save(Reservation reservation, Customer customer){
        //TODO DESCOMENTAR HASTA QUE SE AGREGUE EL METODO setCustomer A LA IMPLEMENTACION DEL MAPPER Y DE AHÍ AL MODELO DE LA CLASE
        //reservation.setCustomer(customer);
        return this.iReservationRepository.save(reservation);
    }

    public Iterable<Reservation> findAll(){
        return this.iReservationRepository.findAll();
    }

    public Iterable<Reservation> findByUserPhone(String userPhone){
        return this.iReservationRepository.findByUserPhone(userPhone);
    }

    public void updateStateAndPaymentById(Integer id, String state, Boolean fullyPaid){
        this.iReservationRepository.updateStateAndPaymentById(id, state, fullyPaid);
    }

    public Reservation findById(Integer id){
        return this.iReservationRepository.findById(id);
    }
}
