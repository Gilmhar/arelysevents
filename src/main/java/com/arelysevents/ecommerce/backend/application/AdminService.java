package com.arelysevents.ecommerce.backend.application;

import com.arelysevents.ecommerce.backend.domain.model.Administrator;
import com.arelysevents.ecommerce.backend.domain.port.IAdminRepository;

public class AdminService {
    private final IAdminRepository iAdminRepository;

    public AdminService(IAdminRepository iAdminRepository) {
        this.iAdminRepository = iAdminRepository;
    }

    public Administrator save(Administrator administrator){
        return this.iAdminRepository.save(administrator);
    }

    public Administrator findById(Integer id){
        return this.iAdminRepository.findById(id);
    }

    public Administrator findByPhone(String phone) {
        return this.iAdminRepository.findByPhone(phone);
    }
}
