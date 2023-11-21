package org.misson.impossible.employeesort;

import org.misson.impossible.employeesort.model.Employee;
import org.misson.impossible.employeesort.service.EmployeeComparator;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSortApp {

    public List<Employee> sortEmployees(List<Employee> employeeList) {
        return employeeList.stream().sorted(Comparator.comparing(Employee::name)
                        .thenComparing(Employee::salary))
                .collect(Collectors.toList());
    }

    public List<Employee> sortEmployeesByComparator(List<Employee> employeeList){

        Comparator<? super Employee> EmployeeComparator = new EmployeeComparator();
        return employeeList.stream().sorted(EmployeeComparator).collect(Collectors.toList());
    }
}
