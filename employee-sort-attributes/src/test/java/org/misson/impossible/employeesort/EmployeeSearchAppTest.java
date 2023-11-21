package org.misson.impossible.employeesort;

import org.junit.jupiter.api.Test;
import org.misson.impossible.employeesort.service.EmployeeService;

class EmployeeSearchAppTest {

    EmployeeSortApp employeeSearchApp = new EmployeeSortApp();

    EmployeeService employeeService = new EmployeeService();


    public void setUp(){

    }


    @Test
     public void testSortEmployees(){

         employeeSearchApp.sortEmployees(employeeService.getAllEmplyees()).forEach(e -> System.out.println("Name: " + e.name() +
                 ", Salary: " + e.salary()+ "\n")
         );

     }

     @Test
     public void testSortEmployeeByComparator(){
         employeeSearchApp.sortEmployeesByComparator(employeeService.getAllEmplyees()).forEach(e -> System.out.println("Name: " + e.name() +
                 ", age: " + e.age()+ "\n")
         );
     }

}