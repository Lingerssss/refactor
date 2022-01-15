package com.gong.refactorpractice1;


import com.gong.refactorpractice1.entity.Employee;
import com.gong.refactorpractice1.entity.Money;
import com.gong.refactorpractice1.exception.InvalidEmployeeType;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    public Money calculatePay(Employee e) throws InvalidEmployeeType {
        switch (e.type) {
            case COMMISSIONED:
                return calculateCommissionedPay();
            case HOURLY:
                return calculateHourlyPay();
            case SALARIED:
                return calculateSalariedPay();
            default:
                throw new InvalidEmployeeType(e.type);
        }
    }

    private Money calculateCommissionedPay() {
        return new Money(1);
    }

    private Money calculateHourlyPay() {
        return new Money(10);
    }
    private Money calculateSalariedPay() {
        return new Money(100);

    }

}
