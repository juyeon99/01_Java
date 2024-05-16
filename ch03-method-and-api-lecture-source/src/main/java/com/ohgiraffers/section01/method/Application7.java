package com.ohgiraffers.section01.method;

public class Application7 {
    public static void main(String[] args) {
        /* 매개변수와 리턴값의 복합 활용 */
        int num1 = 20;
        int num2 = 10;
        Application7 app7 = new Application7();
        System.out.println("num1 + num2 = " + app7.addTwoNumbers(num1,num2));
        System.out.println("num1 - num2 = " + app7.subtractTwoNumbers(num1,num2));
        System.out.println("num1 * num2 = " + app7.multiplyTwoNumbers(num1,num2));
        System.out.println("num1 / num2 = " + app7.divideTwoNumbers(num1,num2));
    }

    public int addTwoNumbers(int num1, int num2) {
        return num1 + num2;
    }

    public int subtractTwoNumbers(int num1, int num2) {
        return num1 - num2;
    }

    public int multiplyTwoNumbers(int num1, int num2) {
        return num1 * num2;
    }

    public int divideTwoNumbers(int num1, int num2) {
        return num1 / num2;
    }
}
