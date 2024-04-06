package com.arelysevents.ecommerce.backend.infraestructure.adapter;

import com.arelysevents.ecommerce.backend.infraestructure.entity.AdministratorEntity;
import org.springframework.data.repository.CrudRepository;

public interface IAdministratorCrudRepository extends CrudRepository<AdministratorEntity,Integer> {
}
