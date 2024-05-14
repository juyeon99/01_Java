package com.ohgiraffers.section01.arithmetic;

public class Application1 {
    public static void main(String[] args) {
        /*
        * 산술연산자
        *
        * 산술연산자는 주로 사칙연산과 관련된 연산자로 가장 기본적이면서도 많이 사용됨
        * 연산의 실행이 가능하기 위해 필요한 값이나 변수가 두 개인 이항 연산자로 분류되며,
        * 피연산자들의 연산 방향은 왼쪽에서 오른쪽이다.
        * */

        /*
        * 종류: '+','-','*','/','%'
        *
        * 우선순위: 곱하기와 나누기가 더하기 빼기보다 우선
        *          우선순위가 같으면 순서대로.
        * */

        int num1 = 20;
        int num2 = 7;

        System.out.println("num1 + num2 = " + (num1 + num2));
        System.out.println("num1 - num2 = " + (num1 - num2));
        System.out.println("num1 * num2 = " + (num1 * num2));
        System.out.println("num1 / num2 = " + (num1 / num2));
        System.out.println("num1 % num2 = " + (num1 % num2));
    }
}
