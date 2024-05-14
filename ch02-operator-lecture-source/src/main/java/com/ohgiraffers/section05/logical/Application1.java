package com.ohgiraffers.section05.logical;

public class Application1 {
    public static void main(String[] args) {
        // 논리 연산자 (&&(AND) ,||(OR), !(NOT))
        System.out.println("=========== 논리 AND 연산 ===========");
        System.out.println("true && true? " + (true && true));
        System.out.println("false && true? " + (false && true));
        System.out.println("true && false? " + (true && false));
        System.out.println("false && false? " + (false && false));

        System.out.println("\n=========== 논리 OR 연산 ===========");
        System.out.println("true || true? " + (true || true));
        System.out.println("false || true? " + (false || true));
        System.out.println("true || false? " + (true || false));
        System.out.println("false || false? " + (false || false));

        System.out.println("\n=========== 논리 NOT 연산 ===========");
        System.out.println("!true? " + (!true));
        System.out.println("!false? " + (!false));

        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;

        System.out.println("\n=========== 논리식에 논리 연산자 활용 ===========");
        System.out.println("a가 b보다 작으면서 c가 d보다 작은지 확인: " + (a < b && c < d));
        System.out.println("a가 b보다 작으면서 c가 d보다 큰지 확인: " + (a < b && c > d));
        System.out.println("a가 b보다 크면서 c가 d보다 작은지 확인: " + (a > b && c < d));
        System.out.println("a가 b보다 크면서 c가 d보다 큰지 확인: " + (a > b && c > d));
        System.out.println("a가 b보다 작거나 c가 d보다 작은지 확인: " + (a < b || c < d));
        System.out.println("a가 b보다 작거나 c가 d보다 큰지 확인: " + (a < b || c > d));
        System.out.println("a가 b보다 크거나 c가 d보다 작은지 확인: " + (a > b || c < d));
        System.out.println("a가 b보다 크거나 c가 d보다 큰지 확인: " + (a > b || c > d));
    }
}
