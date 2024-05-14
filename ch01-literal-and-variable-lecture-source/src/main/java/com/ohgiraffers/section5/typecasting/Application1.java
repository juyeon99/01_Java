package com.ohgiraffers.section5.typecasting;

public class Application1 {
    public static void main(String[] args) {
        /*
        * 데이터 형변환
        *
        * 데이터 형변환이 필요한 이유
        * - 자바에서 다른 타입끼리의 연산은 피연산자들이 모두 같은 타입인 경우 실행할 수 있다.
        * - 같은 데이터 타입끼리만 연산을 수행할 수 있다.
        * */

        /*
        * 형변환 종류와 규칙
        * 1. 자동형변환 (묵시적 형변환): 컴파일러가 자동으로 수행해주는 타입 변환
        *   1-1. 작은 자료형에서 큰 자료형으로는 자동 형변환
        *   1-2. 정수는 실수로 자동 형변환
        *   1-3. 문자형은 int형으로 자동 형변환
        *   1-4. 논리형은 형변환 규칙에서 제외
        * 2. 강제형변환 (명시적 형변환): cast 연산자를 이용한 강제적으로 수행하는 타입 변환
        *   2-1. 자동형변환이 적용되지 않는 경우에 필요
        * */

        // 자동형변환 규칙 테스트
        // 작은 자료형에서 큰 자료형으로 공간만 옮기는 경우
        byte bnum = 1;
        short snum = bnum;
        System.out.println("snum = " + snum);
        int inum = snum;
        System.out.println("inum = " + inum);
        long lnum = inum;
        System.out.println("lnum = " + lnum);

        // 연산 시에도 자동으로 큰 쪽 자료형에 맞춰서 계산
        int num1 = 10;
        long num2 = 20;
//        int result1 = num1 + num2;    // 더 큰 자료형인 long 타입으로 연산되므로 X
        long result1 = num1 + num2;

        System.out.println("result1 = " + result1);

        // 실수끼리의 자동 형변환
        float fnum = 4.0f;
        double dnum = fnum;

//        float result2 = fnum + dnum;    // 더 큰 자료형인 double 타입으로 연산되므로 X
        double result2 = fnum + dnum;
        System.out.println("result2 = " + result2);


        /*
        * 정수를 실수로 변경할 때, 소수점 자리가 없어도 실수 형태처럼 표현 가능
        * 이때 데이터 손실이 없기 때문에, 자동 형변환이 됨
        * */

        long eight = 8;
        float four = eight;
        System.out.println("four = " + four);

        float result3 = eight + four;
        System.out.println("result3 = " + result3);


        // 문자형은 int 형으로 자동 형변환
        char ch1 = 'a';
        int charNum = ch1;
        System.out.println("charNum = " + charNum); // 97

        // int로 type이 명시적으로 정해지지 않은 literal형태의 정수는 char형 변수에 기록 가능
        char ch2 = 65;
        System.out.println("ch2 = " + ch2);         // A

        // 논리형은 형변환 규칙에서 제외
        boolean isTrue = true;
//        byte b = isTrue;
//        short s = isTrue;
//        int i = isTrue;


    }
}
