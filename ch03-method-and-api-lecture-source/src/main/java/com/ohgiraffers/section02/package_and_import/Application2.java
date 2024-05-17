package com.ohgiraffers.section02.package_and_import;

import com.ohgiraffers.section01.method.Calculator;

import java.util.Date;

import static com.ohgiraffers.section01.method.Calculator.staticMaxNumber;  // import staticMaxNumber

public class Application2 {
    public static void main(String[] args) {
        /*
        * import
        *
        * 서로 다른 패키지에 존재하는 클래스를 사용하는 경우,
        * 패키지명을 포함한 풀 클래스명을 사용해야 하지만 너무 길기 때문에
        * 패키지명을 생략하고 사용할 수 있도록 한 구문이 import
        * */

        Calculator calc = new Calculator();
        int min = calc.minNumber(10,20);
        System.out.println("다른 패키지에서 메소드 호출(최소값): " + min);

        // static method
        int max = Calculator.staticMaxNumber(10,20);
        System.out.println("다른 패키지에서 메소드 호출(최대값): " + max);

        // import staticMaxNumber
        int max2 = staticMaxNumber(100,200);
        System.out.println("100과 200 중 더 큰 값: " + max2);

        Date date = new Date();
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
    }
}
