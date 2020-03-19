package kz.iitu.employeepay;

//import kz.iitu.employeepay.DAO.EmployeeDao;
import kz.iitu.employeepay.models.Employee;
import kz.iitu.employeepay.models.EmployeeType;
import kz.iitu.employeepay.repo.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EmployeepayApplication{

    public static void main(String[] args) {
        SpringApplication.run(EmployeepayApplication.class, args);
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
//        EmployeeDao employeeDao = context.getBean("employeeDao", EmployeeDao.class);
//        Employee emp = employeeDao.createSalariedEmployee("Dauren", 15000);
//        System.out.println(emp.toString());
    }

    @Bean
    public CommandLineRunner go(EmployeeRepository employeeRepository){
        return args -> {
            employeeRepository.save(new Employee().builder().name("Dauren").fixedSalary(15000).emplType(EmployeeType.SALARIED).build());
            employeeRepository.save(new Employee().builder().name("Eldar").hourRate(1500).hoursWorked(40).emplType(EmployeeType.HOURLY).build());
            employeeRepository.save(new Employee().builder().name("Aruzhan").commRate(10).emplType(EmployeeType.COMMISION).build());
            employeeRepository.save(new Employee().builder().name("Zhanna").fixedSalary(15000).commRate(5).emplType(EmployeeType.SALARIED_COMMISION).build());

            for(Employee emp : employeeRepository.findAll()){
                System.out.println(emp.toString());
            }

            System.out.println();

            Employee empUpdate = employeeRepository.findById(1L).get();
            empUpdate.setName("Daur");
            employeeRepository.save(empUpdate);
            System.out.println(empUpdate);

            System.out.println();

            Employee employee = employeeRepository.findEmployeeByName("Daur");
            employeeRepository.save(employee);
            System.out.println(employee);

            System.out.println();
            employeeRepository.deleteAll();
        };
    }
}
