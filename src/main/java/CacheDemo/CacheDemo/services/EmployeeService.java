package CacheDemo.CacheDemo.services;

import CacheDemo.CacheDemo.exceptions.ResourceNotFoundException;
import CacheDemo.CacheDemo.models.Employee;
import CacheDemo.CacheDemo.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public Employee getEmployee(Integer employeeId) {
        return employeeRepository.findById(employeeId).orElseThrow(
                () -> new ResourceNotFoundException("Employee not found:" + employeeId));
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public void deleteEmployee(Integer employeeId) {
        employeeRepository.deleteById(employeeId);
    }
}
