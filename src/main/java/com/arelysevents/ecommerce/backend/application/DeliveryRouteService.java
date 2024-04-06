package com.arelysevents.ecommerce.backend.application;

import com.arelysevents.ecommerce.backend.domain.model.DeliveryRoute;
import com.arelysevents.ecommerce.backend.domain.port.IDeliveryRouteRepository;

public class DeliveryRouteService {
    private final IDeliveryRouteRepository deliveryRouteRepository;

    public DeliveryRouteService(IDeliveryRouteRepository deliveryRouteRepository) {
        this.deliveryRouteRepository = deliveryRouteRepository;
    }

    public DeliveryRoute save(DeliveryRoute route) {
        return deliveryRouteRepository.save(route);
    }

    public Iterable<DeliveryRoute> findAll() {
        return deliveryRouteRepository.findAll();
    }

    public DeliveryRoute findById(Integer id) {
        return deliveryRouteRepository.findById(id);
    }

    public void deleteById(Integer id) {
        deliveryRouteRepository.deleteById(id);
    }
}
