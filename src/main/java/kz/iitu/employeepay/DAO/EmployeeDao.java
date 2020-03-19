//package kz.iitu.employeepay.DAO;
//
//
//import kz.iitu.employeepay.event.*;
//import kz.iitu.employeepay.models.*;
//import kz.iitu.employeepay.repo.EmployeeRepository;
//import org.springframework.context.*;
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//
//@Component
//public class EmployeeDao implements ApplicationEventPublisherAware {
//
//    private EmployeeRepository employeeRepository;
//    private ApplicationEventPublisher eventPublisher;
//
//    public EmployeeDao(EmployeeRepository employeeRepository) {
//        this.employeeRepository = employeeRepository;
//    }
//
//    public Employee createSalariedEmployee(String name, double salary) {
//        Employee emp = new Employee().builder().name(name).fixedSalary(salary).emplType(EmployeeType.SALARIED).build();
//        employeeRepository.save(emp);
//        this.eventPublisher.publishEvent(new EmployeeCreateEvent(this, emp));
//        return emp;
//    }
//    public Employee createSalariedCommisionEmployee(String name, double salary, float commRate) {
//        Employee emp = new Employee().builder().name(name).fixedSalary(salary).commRate(commRate).emplType(EmployeeType.SALARIED_COMMISION).build();
//        employeeRepository.save(emp);
//        this.eventPublisher.publishEvent(new EmployeeCreateEvent(this, emp));
//        return emp;
//    }
//    public Employee createCommisionEmployee(String name, float comRate) {
//        Employee emp = new Employee().builder().name(name).commRate(comRate).emplType(EmployeeType.COMMISION).build();
//        employeeRepository.save(emp);
//        this.eventPublisher.publishEvent(new EmployeeCreateEvent(this, emp));
//        return emp;
//    }
//    public Employee createHourlyEmoloyee(String name, double hourRate, int hoursWork) {
//        Employee emp = new Employee().builder().name(name).hourRate(hourRate).hoursWorked(hoursWork).emplType(EmployeeType.HOURLY).build();
//        employeeRepository.save(emp);
//        this.eventPublisher.publishEvent(new EmployeeCreateEvent(this, emp));
//        return emp;
//    }
//
////    public void updateSalary(Long id, double salary) throws SQLException {
////        Employee emp =  employeeRepository.findById(id).get();
////        this.eventPublisher.publishEvent(new EmployeeUpdateEvent(this, emp.getFixedSalary(), salary));
////        emp.setFixedSalary(salary);
////        employeeRepository.save(emp);
////        emp = null;
////    }
//
//    public void deleteEmployeeByName(Long id) {
//        Employee emp =  employeeRepository.findById(id).get();
//        employeeRepository.deleteById(id);
//        this.eventPublisher.publishEvent(new EmployeeDeleteEvent(this, emp));
//
//    }
//    public List<Employee> getAllEmployees(){
//        return (List<Employee>) employeeRepository.findAll();
//    }
//    public void deleteAllEmployees(){
//        employeeRepository.deleteAll();
//    }
//
//    @Override
//    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
//        this.eventPublisher = applicationEventPublisher;
//    }
//
//}
