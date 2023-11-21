package org.misson.impossible.employeesort.service;

import org.misson.impossible.employeesort.model.Employee;

import java.util.List;

public class EmployeeService {

    public List<Employee> getAllEmplyees(){
        return List.of(Employee.builder().name("Kamales").age(46).salary(3700000).build(),
                Employee.builder().name("Bimales").age(41).salary(4700000).build(),
                Employee.builder().name("Rich").age(16).salary(2700000).build(),
                Employee.builder().name("Bimales").age(16).salary(5700000).build(),
                Employee.builder().name("Jaivik").age(6).salary(0).build()
        );
    }
}
