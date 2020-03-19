package kz.iitu.employeepay.event;

import kz.iitu.employeepay.models.Employee;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class EmployeeUpdateEvent extends ApplicationEvent {
    private Employee employee;
    private double salary;

    public EmployeeUpdateEvent(Object source, Employee employee, double salary) {
        super(source);
        this.employee = employee;
        this.salary = salary;
    }
}
