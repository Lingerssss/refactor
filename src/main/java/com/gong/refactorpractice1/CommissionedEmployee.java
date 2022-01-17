package com.gong.refactorpractice1;

import com.gong.refactorpractice1.entity.Employee;
import com.gong.refactorpractice1.entity.Payment;

public class CommissionedEmployee extends Employee {
    @Override
    public Payment calculatePay() {
        return new Payment(1);
    }
}
