package kz.iitu.employeepay.models;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private double fixedSalary;
    private double hourRate;
    private int hoursWorked;
    private float commRate;
    @Enumerated(EnumType.STRING)
    private EmployeeType emplType;

}