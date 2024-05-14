package com.ohgiraffers.section03.increment;

public class Application1 {
    public static void main(String[] args) {
        /*
        * 증감연산자 (++,--)
        * */

        int num = 20;
        num++;
        System.out.println(num);
        ++num;
        System.out.println(num);
        num--;
        System.out.println(num);
        --num;
        System.out.println(num);

        // 증감연산자를 다른 연산자와 사용
        int firstNum = 20;

        int result1 = firstNum++ * 3;
        System.out.println("result1 = " + result1);
        System.out.println("firstNum = " + firstNum);

        int secondNum = 20;

        int result2 = ++secondNum * 3;
        System.out.println("result2 = " + result2);
        System.out.println("secondNum = " + secondNum);

        int num1 = 10;
        int addNum = num1++;
        System.out.println("addNum = " + addNum);
        System.out.println("num1 = " + num1);

        
    }
}
