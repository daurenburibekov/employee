package kz.iitu.employeepay.event.handler;

import kz.iitu.employeepay.Company;
import kz.iitu.employeepay.event.EmployeeUpdateEvent;

import lombok.SneakyThrows;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class EmployeeUpdateHandler implements ApplicationListener<EmployeeUpdateEvent> {

    @Override
    public void onApplicationEvent(EmployeeUpdateEvent employeeUpdateEvent) {
        System.out.println("EmployeeUpdateHandler.onApplicationEvent");
        System.out.println("Updated employee info: " + employeeUpdateEvent.getEmployee() + ", old salary " + employeeUpdateEvent.getEmployee() + ", new salary " + employeeUpdateEvent.getSalary());
        Company.notify(employeeUpdateEvent.getEmployee());
        System.out.println();
    }
}
