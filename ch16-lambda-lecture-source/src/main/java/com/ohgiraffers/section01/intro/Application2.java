package com.ohgiraffers.section01.intro;

public class Application2 {
    public static void main(String[] args) {
        OuterCalculator.Add add = (x,y) -> x + y;
        System.out.println("20 + 10 = " + add.addTwoNumbers(20,10));

        OuterCalculator.Subtract subtract = (x,y) -> x - y;
        System.out.println("20 - 10 = " + subtract.subtractTwoNumbers(20,10));

        OuterCalculator.Multiply multiply = (x,y) -> x * y;
        System.out.println("20 * 10 = " + multiply.multiplyTwoNumbers(20,10));

        OuterCalculator.Divide divide = (x,y) -> x / y;
        System.out.println("20 / 10 = " + divide.divideTwoNumbers(20,10));
    }
}
