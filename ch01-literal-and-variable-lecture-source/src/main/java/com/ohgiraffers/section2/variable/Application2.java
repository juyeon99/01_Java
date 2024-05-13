package com.ohgiraffers.section2.variable;

public class Application2 {
    public static void main(String[] args) {
        /*
        변수를 사용하는 방법
        1. 변수를 준비 (선언)
        2. 변수에 값 대입 (값 대입 및 초기화)
        3. 변수 사용
         */

        /*
        자료형이란?

        다양한 값의 형태별로 어느 정도의 크기를 하나의 값으로 취급할 것인지 미리 컴파일러와 약속한 키워드
        예) int 자료형은 정수를 4byte만큼 읽어서 하나의 값으로 취급하겠다라는 약속을 한 것.
        이러한 자료형은 기본자료형, 참조자료형으로 나눠짐.
         */

        // 기본자료형
        // 정수를 취급하는 자료형 4가지
        byte bnum;  // 선언
        bnum = 10;  // 초기화

        short snum; // 2 byte
        int inum;   // 4 byte
        long lnum;  // 8 byte

        // 실수를 취급하는 자료형 2가지
        float fnum; // 4 byte
        double dnum;// 8 byte

        // 문자를 취급하는 자료형
        char ch;    // 2 byte
        char ch2;

        boolean isTrue;  // 1 byte

        // 참조형 자료형
        String str;

        /*
        초기화

        초기화 할 때 대입연산자 기준 오른쪽과 왼족은 무조건 같은 타입이어야 한다.
         */
        bnum = 1;
        snum = 2;
        inum = 4;
//        lnum = 8;   // 아무 문제 없는 것 같지만 사실 뒤에 L을 붙여야 함.
        lnum = 8L;

        fnum = 4.0f;    // 실수 뒤에 'f'를 붙여야 함.
        dnum = 8.0;

        ch = 'a';   // 문자형식으로 저장 가능
        ch2 = 97;

        isTrue = true;
        isTrue = false;

        str = "안녕";

        // 선언과 동시에 초기화
        int point = 100;

        System.out.println("========= 변수에 저장된 값 출력 =========");
        System.out.println("bnum = " + bnum);
        System.out.println("snum = " + snum);
        System.out.println("inum = " + inum);
        System.out.println("lnum = " + lnum);

        System.out.println("fnum = " + fnum);
        System.out.println("dnum = " + dnum);
        System.out.println("ch = " + ch);
        System.out.println("ch2 = " + ch2);
        System.out.println("isTrue = " + isTrue);
        System.out.println("str = " + str);

        // '=' 대입연산자
        // =의 왼편은 공간, 오른편은 값
        point = point + 10;
        System.out.println("point = " + point);
        System.out.println("str = " + str);
    }
}
