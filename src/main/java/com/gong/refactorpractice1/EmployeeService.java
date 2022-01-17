package com.gong.refactorpractice1;


import com.gong.refactorpractice1.entity.Employee;
import com.gong.refactorpractice1.entity.Payment;
import com.gong.refactorpractice1.exception.InvalidEmployeeType;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    public Payment calculatePay(Employee e) throws InvalidEmployeeType {
        switch (e.getType()) {
            case COMMISSIONED:
                Employee e1 = new CommissionedEmployee();
                e1.calculatePay();
                return calculateCommissionedPay();
            case HOURLY:
                return calculateHourlyPay();
            case SALARIED:
                return calculateSalariedPay();
            default:
                throw new InvalidEmployeeType();
        }
    }

    private Payment calculateCommissionedPay() {
        return new Payment(1);
    }

    private Payment calculateHourlyPay() {
        return new Payment(10);
    }
    private Payment calculateSalariedPay() {
        return new Payment(100);

    }

}
