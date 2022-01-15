package com.gong.refactorpractice1.entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee {
    private EmployeeType type;
    public Employee(EmployeeType employeeType){
        this.setType(employeeType);
    }
}
