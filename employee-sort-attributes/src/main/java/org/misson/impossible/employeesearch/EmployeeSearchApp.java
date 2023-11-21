package org.misson.impossible.employeesearch;

import org.misson.impossible.employeesearch.model.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSearchApp {

    public List<Employee> sortEmployees(List<Employee> employeeList) {
        return employeeList.stream().sorted(Comparator.comparing(Employee::name)
                        .thenComparing(Employee::salary))
                .collect(Collectors.toList());
    }
}
