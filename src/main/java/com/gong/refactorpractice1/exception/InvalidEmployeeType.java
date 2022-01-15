package com.gong.refactorpractice1.exception;

import com.gong.refactorpractice1.entity.EmployeeType;

public class InvalidEmployeeType extends RuntimeException{
    public InvalidEmployeeType(EmployeeType employeeType){
        super(employeeType.name());
    }
}
