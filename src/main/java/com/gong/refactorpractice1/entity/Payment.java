package com.gong.refactorpractice1.entity;

import lombok.Getter;

@Getter
public class Payment {
    public Payment(int value){
        this.value=value;
    }
    private final int value;
}
