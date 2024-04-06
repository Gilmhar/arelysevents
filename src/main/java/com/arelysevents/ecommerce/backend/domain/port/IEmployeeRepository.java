package com.arelysevents.ecommerce.backend.domain.port;

import com.arelysevents.ecommerce.backend.domain.model.Employee;

public interface IEmployeeRepository {
    Employee save(Employee employee);
    Iterable<Employee> findAll();
    Employee findById(Integer id);
    void deleteById(Integer id);
    Employee update(Employee employee);
    void updateEmployeeAssignment(Integer employeeId, Integer routeId);
}
