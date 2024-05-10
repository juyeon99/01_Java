package com.ohgiraffers.section1.literal;

public class Application3 {
    public static void main(String[] args){
        // 수업목표: 문자열 합치기 결과를 예측하고, 사용할 수 있다.
        System.out.println("============= 두개의 문자열 합치기 =============");
        System.out.println(9 + 9);      // 18
        System.out.println("9" + 9);    // 99
        System.out.println(9 + "9");    // 99
        System.out.println("9" + "9");  // 99

        System.out.println("\n============= 세개의 문자열 합치기 =============");
        // 더하기의 연산 순서를 알 수 있음
        // '+' 연산의 방향은 왼쪽에서 오른쪽. (숫자부터 합쳐짐)
        System.out.println(9 + 9 + "9");    // 189
        System.out.println(9 + "9" + 9);    // 999
        System.out.println("9" + "9" + 9);  // 999
        System.out.println("9" + (9 + 9));  // 918

        // 10과 20의 사칙연산과 나머지연산 결과
        System.out.println("\n============= 10과 20의 사칙연산과 나머지연산 결과 =============");
        System.out.println("10과 20의 차: " + (10 - 20));
        System.out.println("10과 20의 합: " + (10 + 20));
        System.out.println("10과 20의 곱: " + (10 * 20));
        System.out.println("10과 20를 나누기한 몫: " + (10 / 20));
        System.out.println("10과 20를 나누기한 나머지: " + (10 % 20));
    }
}
