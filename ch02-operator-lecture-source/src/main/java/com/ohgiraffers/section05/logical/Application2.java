package com.ohgiraffers.section05.logical;

public class Application2 {
    public static void main(String[] args) {
        /*
        * 논리 연산자의 우선순위와 활용
        *
        * &&: 11위
        * ||: 12위
        * */

        int num1 = 55;
        System.out.println("1 <= num1 <= 100? " + (num1 >= 1 && num1 <= 100));

        int num2 = 166;
        System.out.println("1 <= num2 <= 100? " + (num2 >= 1 && num2 <= 100));

        // A: 65, Z: 90
        // a: 97, z: 122
        // 영어가 대문자인지 확인
        char ch1 = 'G';
        System.out.println("대문자인지 확인: " + (ch1 >= 'A' && ch1 <= 'Z'));
        char ch2 = 'g';
        System.out.println("대문자인지 확인: " + (ch2 >= 'A' && ch2 <= 'Z'));

        // 대소문자 상관없이 영문자 y인지 확인
        char ch3 = 'y';
        System.out.println("영문자 y인지 확인: " + (ch3 == 'y' || ch3 == 'Y'));

        // 영문자인지 확인
        char ch4 = 'f';
        System.out.println("영문자인지 확인: " + ((ch4 >= 'A' || ch4 <= 'Z') || (ch4 >= 'a' || ch4 <= 'z')));
        System.out.println("영문자인지 확인: " + ((ch4 >= 65 || ch4 <= 90) || (ch4 >= 97 || ch4 <= 122)));
    }
}
