package org.misson.impossible.employeesort.model;

import lombok.Builder;

@Builder
public record Employee(String name, int age, int salary) {
}
