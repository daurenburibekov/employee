package kz.iitu.employeepay.event;

import kz.iitu.employeepay.models.Employee;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class EmployeeCreateEvent extends ApplicationEvent {

    private Employee employee;
    public EmployeeCreateEvent(Object source, Employee employee) {
        super(source);
        this.employee = employee;
    }

}
