package com.ohgiraffers.section3.constant;

public class Application2 {
    public static void main(String[] args) {
        /*
        * 상수의 명명 규칙
        *
        * 변수의 명명규칙과 컴파일 에러를 발생시키는 규칙은 동일
        *
        * 개발자들끼리의 암묵적인 규칙에서 일부 차이가 있다.
        * 1. 모든 문자는 대문자/숫자만 사용
        * 2. 단어와 단어 사이는 언더스코어(_) 사용
        * */

        // 모든 문자는 대문자/숫자만 사용
        final int AGE1 = 20;

        // 단어와 단어 연결은 언더스코어
        final int MAX_AGE = 20;
        final int MIN_AGE = 10;
    }
}
