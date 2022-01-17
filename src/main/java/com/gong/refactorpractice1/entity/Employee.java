package com.gong.refactorpractice1.entity;
import com.gong.refactorpractice1.CommissionedEmployee;
import com.gong.refactorpractice1.HourlyEmployee;
import com.gong.refactorpractice1.SalariedEmployee;
import com.gong.refactorpractice1.exception.InvalidEmployeeType;
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

    public static Employee of(EmployeeType type) {
        switch (type) {
            case COMMISSIONED:
                return new CommissionedEmployee();
            case HOURLY:
                return new HourlyEmployee();
            case SALARIED:
                return new SalariedEmployee();
            default:
                throw new InvalidEmployeeType();
        }
    }
}
