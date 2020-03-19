package kz.iitu.employeepay.event.handler;

import kz.iitu.employeepay.event.EmployeeCreateEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class EmployeeCreateHandler implements ApplicationListener<EmployeeCreateEvent> {

    @Override
    public void onApplicationEvent(EmployeeCreateEvent employeeCreateEvent) {
        System.out.println("EmployeeCreateHandler.onApplicationEvent");
        System.out.println("Created employee info: " + employeeCreateEvent.getEmployee());
        System.out.println();
    }
}
