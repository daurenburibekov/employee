package kz.iitu.employeepay.event.handler;

import kz.iitu.employeepay.Company;
import kz.iitu.employeepay.event.EmployeeDeleteEvent;
import kz.iitu.employeepay.event.EmployeeUpdateEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDeleteHandler implements ApplicationListener<EmployeeDeleteEvent> {
    @Override
    public void onApplicationEvent(EmployeeDeleteEvent employeeDeleteEvent) {
        System.out.println("EmployeeUpdateHandler.onApplicationEvent");
        System.out.println("Deleted employee info: " + employeeDeleteEvent.toString());
        System.out.println();
    }
}
