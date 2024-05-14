package com.ohgiraffers.section02.assignment;

public class Application1 {
    public static void main(String[] args) {
        /*
        * 대입연산자('=') & 산술 복합 대입 연산자(+=,-=,*=,/=,%=)
        * */

        int num = 10;
        int num2 = 10;

        num += 3;
        num2 = num2 + 3;
        System.out.println("num = " + num);
        System.out.println("num2 = " + num2);

        num -= 5;
        System.out.println("num = " + num);
        num *= 2;
        System.out.println("num = " + num);
        num /= 2;
        System.out.println("num = " + num);
        num %= 3;
        System.out.println("num = " + num);
    }
}
