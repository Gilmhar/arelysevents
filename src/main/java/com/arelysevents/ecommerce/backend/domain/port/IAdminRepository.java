package com.arelysevents.ecommerce.backend.domain.port;

import com.arelysevents.ecommerce.backend.domain.model.Administrator;

public interface IAdminRepository {
    Administrator save(Administrator administrator);
    Administrator findByPhone(String phone);
    Administrator findById(Integer id);
}
