package com.ohgiraffers.section04.wrapper;

public class Application1 {
    public static void main(String[] args) {
        /*
        * 기본타입    |   Wrapper Class
        * ------------------------------------
        * byte       |      Byte
        * short      |      Short
        * int        |      Int
        * long       |      Long
        * float      |      Float
        * double     |      Double
        * char       |      Char
        * boolean    |      Boolean
        * */

        /*
        * Boxing & Unboxing
        *
        * 기본타입에서 Wrapper 클래스의 인스턴스로 인스턴스화하는 것을 Boxing
        * Wrapper 클래스 타입의 인스턴스를 기본 타입으로 변경하는 것을 UnBoxing
        * */

        int intValue = 20;
//        Integer boxingNumber1 = new Integer(intValue);  // Constructor로 박싱
        Integer boxingNumber1 = Integer.valueOf(intValue);  // static method 이용 // boxing
        int unBoxingNumber = boxingNumber1.intValue();  // unboxing

        /*
        * AutoBoxing & AutoUnBoxing
        * => 박싱과 언박싱이 필요한 상황에서 자바 컴파일러가 자동으로 처리
        * */
        Integer boxingNumber2 = intValue;   // auto boxing
        int unBoxingNumber2 = boxingNumber2;    // auto unboxing

        // Wrapper class 값 비교
        int inum = 20;
        Integer integerNum1 = Integer.valueOf(20);  // boxing
        Integer integerNum2 = Integer.valueOf(20);  // boxing
        Integer integerNum3 = 20;  // auto boxing
        Integer integerNum4 = 20;  // auto boxing

        // 기본타입과 Wrapper class 타입을 == 연산으로 비교
        System.out.println("int와 Integer 비교: " + (inum == integerNum1));    // true
        System.out.println("int와 Integer 비교: " + (inum == integerNum3));    // true

        // auto boxing과 boxing도 == 연산으로 비교 가능
        System.out.println("Integer와 Integer 비교: " + (integerNum1 == integerNum3));    // true
    }
}
