package com.example.springDemo.SetterInjection.Collections;

import java.util.List;
import java.util.Set;

public class Employee {
    private List<String> employeeNames;
    private Set<Integer> employeeIds;

    public List<String> getEmployeeNames() {
        return employeeNames;
    }

    public void setEmployeeNames(List<String> employeeNames) {
        this.employeeNames = employeeNames;
    }

    public Set<Integer> getEmployeeIds() {
        return employeeIds;
    }

    public void setEmployeeIds(Set<Integer> employeeIds) {
        this.employeeIds = employeeIds;
    }
}
