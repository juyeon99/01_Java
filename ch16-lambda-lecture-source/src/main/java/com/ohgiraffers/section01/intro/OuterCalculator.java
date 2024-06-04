package com.ohgiraffers.section01.intro;

public interface OuterCalculator {
    // 여러개의 내부 인터페이스
    @FunctionalInterface
    public interface Add{
        int addTwoNumbers(int a, int b);
    }

    @FunctionalInterface
    public interface Subtract{
        int subtractTwoNumbers(int a, int b);
    }

    @FunctionalInterface
    public interface Multiply{
        int multiplyTwoNumbers(int a, int b);
    }

    @FunctionalInterface
    public interface Divide{
        int divideTwoNumbers(int a, int b);
    }
}
