package com.gong.refactorpractice1;


import com.gong.refactorpractice1.entity.Employee;
import com.gong.refactorpractice1.entity.Payment;
import com.gong.refactorpractice1.exception.InvalidEmployeeType;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    public Payment calculatePay(Employee e) throws InvalidEmployeeType {
        Employee em;
        switch (e.getType()) {
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
        return em.calculatePay();
    }
}
