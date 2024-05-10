package com.ohgiraffers.section1.literal;

public class Application1 {
    public static void main(String[] args) {
        /*
        System.out.print("a");
        System.out.print("a");
        System.out.println("b");
        System.out.print("c");
        */

        // 수업 목표: 여러 가지 값의 형태를 출력 할 수 있다.
        // 정수 출력
        System.out.println(123);

        // 실수 출력
        System.out.println(12.3);

        // 문자 출력
        System.out.println('a');
        System.out.println('1'); // 문자 '1'이라고 판단

        // 문자열 출력
        System.out.println("안녕하세요");
        System.out.println("123");
        System.out.println(""); // 아무값도 없는 빈""도 문자열로 취급
        System.out.println("a"); // 한개의 문자도 ""로 감싸면 문자열. (!= 'a')

        // 논리값 출력
        System.out.println(true);
        System.out.println(false);
        

    }
}
