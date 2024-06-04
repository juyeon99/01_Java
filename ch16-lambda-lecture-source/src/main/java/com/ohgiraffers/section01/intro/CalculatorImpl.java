package com.ohgiraffers.section01.intro;

public class CalculatorImpl implements Calculator{  // Calculator implement (인터페이스 구현체)
    @Override
    public int addTwoNumbers(int a, int b) {
        return a + b;
    }
}
