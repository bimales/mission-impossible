package org.misson.impossible.employeesearch;

import org.junit.jupiter.api.Test;
import org.misson.impossible.employeesearch.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeSearchAppTest {

    EmployeeSearchApp employeeSearchApp = new EmployeeSearchApp();

    EmployeeService employeeService = new EmployeeService();


    public void setUp(){

    }


    @Test
     public void testSortEmployees(){

         employeeSearchApp.sortEmployees(employeeService.getAllEmplyees()).forEach(e -> System.out.println("Name: " + e.name() +
                 ", Salary: " + e.salary()+ "\n")
         );

     }

}