package com.ohgiraffers.section5.typecasting;

public class Application2 {
    public static void main(String[] args) {
        /*
        * 강제형변환
        *
        * cast 연산자 이용
        * */

        /*
        * 자동형변환 규칙의 반대 상황에서 강제 형변환 필요
        * 1. 강제형 규칙
        *   1-1. 큰 자료형에서 작은 자료형으로 변경시 강제 형변환 필요
        *   1-2. 실수를 정수로 변경 시 강제형변환 필요
        *   1-3. 문자형을 int 미만 크기의 변수에 저장할 때 강제 형변환 필요
        *   1-4. 논리형은 강제 형변환 규칙에서도 제외
        * */

        // long -> int
        long lnum = 8;
//        int inum = lnum;    // 데이터 손실 가능성을 컴파일러가 알려줌
        int inum = (int) lnum;  // 강제 형변환
        System.out.println("inum = " + inum);

        short snum = (short) inum;
        System.out.println("snum = " + snum);

        byte bnum = (byte) snum;
        System.out.println("bnum = " + bnum);


        // 실수끼리의 강제 형변환
        double dnum = 8.0;
        float fnum = (float) dnum;
        System.out.println("fnum = " + fnum);

        // 실수를 정수로 변경시 강제 형변환
        float fnum2 = 4.0f;
//        long lnum2 = fnum2;
        long lnum2 = (long) fnum2;
        System.out.println("lnum2 = " + lnum2);
        
        // 문자형을 int 미만 크기의 변수에 저장할 때 강제 형변환 필요
        char ch = 'a';
        // byte bnum2 = ch;
        byte bnum2 = (byte) ch;
        System.out.println("bnum2 = " + bnum2);

        short snum2 = (short) ch;   // signed bit때문에 형변환 필요
        System.out.println("snum2 = " + snum2);
        
        // 정수를 char 자료형에 강제형변환해서 대입하기
        int num1 = 97;
        int num2 = -97; // 음수도 형변환 가능
        
        char ch2 = (char) num1;
        System.out.println("ch2 = " + ch2);
        char ch3 = (char) num2;
        System.out.println("ch3 = " + ch3);

        // 강제형변환을 해도 논리형은 규칙에서 제외
        boolean isTrue = true;
//        byte b = (byte) isTrue;
//        short s = (short) isTrue;
//        int i = (int) isTrue;

    }
}
