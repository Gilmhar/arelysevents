package com.arelysevents.ecommerce.backend.infraestructure.adapter;

import com.arelysevents.ecommerce.backend.domain.model.Administrator;
import com.arelysevents.ecommerce.backend.domain.port.IAdminRepository;
import org.springframework.stereotype.Repository;

@Repository
public class UserCrudRepositoryImpl implements IAdminRepository {
    private final IAdminRepository iAdminRepository;

    public UserCrudRepositoryImpl(IAdminRepository iAdminRepository) {
        this.iAdminRepository = iAdminRepository;
    }

    @Override
    public Administrator save(Administrator administrator) {
        return null;
    }

    @Override
    public Administrator findByPhone(String phone) {
        return null;
    }

    @Override
    public Administrator findById(Integer id) {
        return null;
    }
}
