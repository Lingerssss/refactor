package com.gong.refactorpractice1.entity;

import lombok.Getter;

@Getter
public class Money {
    public Money(int value){
        this.value=value;
    }
    private final int value;
}
