package com.arelysevents.ecommerce.backend.domain.port;

import com.arelysevents.ecommerce.backend.domain.model.DeliveryRoute;

public interface IDeliveryRouteRepository {
    DeliveryRoute findById(Integer id);
    DeliveryRoute save(DeliveryRoute route);
    Iterable<DeliveryRoute> findAll();
    void deleteById(Integer id);
}
