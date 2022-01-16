package com.gong.refactorpractice1;

import com.gong.refactorpractice1.entity.Employee;
import com.gong.refactorpractice1.entity.EmployeeType;
import com.gong.refactorpractice1.exception.InvalidEmployeeType;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmployeeServiceTest {
    private final EmployeeService employeeService;

    public EmployeeServiceTest() {
        this.employeeService = new EmployeeService();
    }

    @Test
    public void should_return_1_when_the_Employee_type_is_Commissioned() {
        //given
        Employee commissionedEmployee = new Employee(EmployeeType.COMMISSIONED);
        //when
        int commissionedPay = employeeService.calculatePay(commissionedEmployee).getValue();
        //then
        Assert.assertEquals(1, commissionedPay);
    }

    @Test
    public void should_return_10_when_the_Employee_type_is_hourly() {
        //given
        Employee hourlyEmployee = new Employee(EmployeeType.HOURLY);
        //when
        int hourlyPay = employeeService.calculatePay(hourlyEmployee).getValue();
        //then
        Assert.assertEquals(10, hourlyPay);

    }

    @Test
    public void should_return_100_when_the_Employee_type_is_hourly() {
        //given
        Employee salariedEmployee = new Employee(EmployeeType.SALARIED);
        //when
        int salariedPay = employeeService.calculatePay(salariedEmployee).getValue();
        //then
        Assert.assertEquals(100, salariedPay);
    }

    @Test
    public void should_throw_invalidEmployeeType_when_employee_type_is_invalid() {
        //given
        Employee noTypeEmployee = new Employee(EmployeeType.WEEKLY);
        //when and then
        assertThrows(InvalidEmployeeType.class,()->employeeService.calculatePay(noTypeEmployee));
    }
}