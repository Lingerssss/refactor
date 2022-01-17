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

    public Employee of(EmployeeType type) {
        Employee em;
        switch (type) {
            case COMMISSIONED:
                em = new CommissionedEmployee();
                break;
            case HOURLY:
                em = new HourlyEmployee();
                break;
            case SALARIED:
                em = new SalariedEmployee();
                break;
            default:
                throw new InvalidEmployeeType();
        }
        return em;
    }
}
