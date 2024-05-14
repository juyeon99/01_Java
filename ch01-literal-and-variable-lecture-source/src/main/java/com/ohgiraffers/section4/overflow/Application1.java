package com.ohgiraffers.section4.overflow;

public class Application1 {
    public static void main(String[] args) {
        /*
        * overflow
        *
        * 자료형 별 값의 최대 범위를 벗어나는 경우
        * 발생한 carry를 버리고 signed bit을 반전시켜 최소값을 순환시킴
        * */

        byte num1 = 127;
//        num1 = num1 + 1;

        System.out.println("num1 = " + num1);

        num1++; // overflow (127 -> -128)
        System.out.println("num1 overflow: " + num1);

        // 오버플로우가 발생하면 최대값이 최소값이 된다.

        /*
        * underflow
        *
        * 오버플로우와 반대. 최소 범위보다 작은 수를 발생시키는 경우.
        * */

        byte num2 = -128;
        System.out.println("num2 = " + num2);

        num2--;
        System.out.println("num2 underflow: " + num2);   // +127

        int firstNum = 1000000;
        int secondNum = 700000; // int의 최대: 대략 21억

        int mul = firstNum * secondNum; // 7000억
        System.out.println("mul = " + mul);

        long longMul = firstNum * secondNum;    // int * int = int이므로 long을 써도 오버플로우 발생
        System.out.println("longMul = " + longMul);

        longMul = (long) firstNum * secondNum;  // 강제 형변환
        System.out.println("longMul = " + longMul);
        // change
    }
}
