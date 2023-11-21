package org.misson.impossible.employeesearch.model;

import lombok.Builder;

@Builder
public record Employee(String name, int age, int salary) {
}
