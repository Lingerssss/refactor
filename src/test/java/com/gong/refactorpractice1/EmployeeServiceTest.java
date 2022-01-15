package com.gong.refactorpractice1;

import com.gong.refactorpractice1.entity.Employee;
import com.gong.refactorpractice1.entity.EmployeeType;
import org.junit.Assert;
import org.junit.Test;

public class EmployeeServiceTest {
    private final EmployeeService employeeService;

    public EmployeeServiceTest() {
        this.employeeService = new EmployeeService();
    }

    @Test
    public void should_return_1_when_the_Employee_type_is_Commissioned() {
        //given
        Employee commissionedEmployee = new Employee();
        commissionedEmployee.setType(EmployeeType.COMMISSIONED);
        //when
        int commissionedPay = employeeService.calculatePay(commissionedEmployee).getValue();
        //then
        Assert.assertEquals(1, commissionedPay);
    }

    @Test
    public void should_return_10_when_the_Employee_type_is_hourly() {
        //given
        Employee commissionedEmployee = new Employee();
        commissionedEmployee.setType(EmployeeType.HOURLY);
        //when
        int commissionedPay = employeeService.calculatePay(commissionedEmployee).getValue();
        //then
        Assert.assertEquals(10, commissionedPay);

    }

    @Test
    public void should_return_100_when_the_Employee_type_is_hourly() {
        //given
        Employee commissionedEmployee = new Employee();
        commissionedEmployee.setType(EmployeeType.SALARIED);
        //when
        int commissionedPay = employeeService.calculatePay(commissionedEmployee).getValue();
        //then
        Assert.assertEquals(100, commissionedPay);
    }
}