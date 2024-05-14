package com.ohgiraffers.section06.ternary;

public class Application1 {
    public static void main(String[] args) {
        /*
        * 삼항연산자
        *
        * (조건식) ? (참일 때 사용할 값) : (거짓일 때 사용할 값)
        * */

        // 삼항연산자 단독 사용
        int num1 = 10;
        int num2 = -10;

        String res1 = (num1 > 0) ? "pos" : "neg or 0";
        System.out.println("res1 = " + res1);

        String res2 = (num2 > 0) ? "pos" : "neg or 0";
        System.out.println("res2 = " + res2);

        // 삼항연산자 중첩 사용
        int num3 = 5;
        int num4 = 0;
        int num5 = -5;
        String res3 = (num3 > 0) ? "pos" : ((num3 == 0) ? "0" : "neg");
        String res4 = (num4 > 0) ? "pos" : ((num4 == 0) ? "0" : "neg");
        String res5 = (num5 > 0) ? "pos" : ((num5 == 0) ? "0" : "neg");
        System.out.println("res3 = " + res3);
        System.out.println("res4 = " + res4);
        System.out.println("res5 = " + res5);
    }
}
