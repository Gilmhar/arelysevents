package com.arelysevents.ecommerce.backend.application;

import com.arelysevents.ecommerce.backend.domain.model.DeliveryRoute;
import com.arelysevents.ecommerce.backend.domain.model.Employee;
import com.arelysevents.ecommerce.backend.domain.port.IEmployeeRepository;

public class EmployeeService {
    private final IEmployeeRepository employeeRepository;
    private final DeliveryRouteService deliveryRouteService;

    public EmployeeService(IEmployeeRepository employeeRepository, DeliveryRouteService deliveryRouteService) {
        this.employeeRepository = employeeRepository;
        this.deliveryRouteService = deliveryRouteService;
    }

    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Iterable<Employee> findAll() {
        return employeeRepository.findAll();
    }

    public Employee findById(Integer id) {
        return employeeRepository.findById(id);
    }

    public void deleteById(Integer id) {
        employeeRepository.deleteById(id);
    }

    public Employee update(Employee employee) {
        return employeeRepository.update(employee);
    }

    public void updateEmployeeAssignment(Integer employeeId, Integer routeId) {
        // Lógica para actualizar la asignación de empleado a la ruta de entrega
        DeliveryRoute route = deliveryRouteService.findById(routeId);
        route.setEmployeeId(employeeId);
        deliveryRouteService.save(route);
    }
}
