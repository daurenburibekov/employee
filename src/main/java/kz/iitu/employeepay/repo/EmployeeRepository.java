package kz.iitu.employeepay.repo;

import kz.iitu.employeepay.models.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    Employee findEmployeeByName(String name);
}
