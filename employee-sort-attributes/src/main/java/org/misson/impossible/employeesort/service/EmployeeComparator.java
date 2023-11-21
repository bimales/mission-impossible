package org.misson.impossible.employeesort.service;

import org.misson.impossible.employeesort.model.Employee;

import java.util.Comparator;

public class
EmployeeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.name().compareTo(o2.name())!=0){
            return o1.name().compareTo(o2.name());
        }else {
            if(o1.age() > o2.age()){
                return 1;
            } else if (o1.age() < o2.age()) {
                return -1;
            }else {
                return 0;
            }
        }

    }
}
