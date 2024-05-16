package com.ohgiraffers.section01.method;

public class Calculator {
    // 삼항연산자로 두 수를 비교해서 작은 값을 return해주는 메소드
    public int minNumber (int num1, int num2){
        return num1 < num2 ? num1 : num2;
    }

    // static
    public static int staticMaxNumber (int num1, int num2){
        return num1 > num2 ? num1 : num2;
    }

    public int addNumbers (int num1, int num2){
        return num1 + num2;
    }

    public int subtractNumbers (int num1, int num2){
        return num1 - num2;
    }

    public int multiplyNumbers (int num1, int num2){
        return num1 * num2;
    }

    public int divideNumbers (int num1, int num2){
        return num1 / num2;
    }

    // static
    public static int remainder (int num1, int num2){
        return num1 % num2;
    }
}
