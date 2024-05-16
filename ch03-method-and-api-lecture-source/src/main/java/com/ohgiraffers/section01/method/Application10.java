package com.ohgiraffers.section01.method;

public class Application10 {
    public static void main(String[] args) {
        int num1 = 16;
        int num2 = 5;

        Calculator calc = new Calculator();
        System.out.println("num1 + num2 = " + calc.addNumbers(num1,num2));
        System.out.println("num1 - num2 = " + calc.subtractNumbers(num1,num2));
        System.out.println("num1 * num2 = " + calc.multiplyNumbers(num1,num2));
        System.out.println("num1 / num2 = " + calc.divideNumbers(num1,num2));
        System.out.println("num1 % num2 = " + Calculator.remainder(num1,num2));
    }
}
