package com.gong.refactorpractice1.entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Employee {
    private EmployeeType type;
    public Employee(EmployeeType employeeType){
        this.setType(employeeType);
    }

    public Payment calculatePay() {
        return null;
    }
}
