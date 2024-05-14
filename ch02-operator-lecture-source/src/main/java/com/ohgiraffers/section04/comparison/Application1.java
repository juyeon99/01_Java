package com.ohgiraffers.section04.comparison;

public class Application1 {
    public static void main(String[] args) {
        // 비교연산자 (==,!=,>,<,>=,>=)

        int inum1 = 10;
        int inum2 = 20;
        System.out.println("========== 정수값 비교 ==========");
        System.out.println("inum1 == inum2? " + (inum1 == inum2));
        System.out.println("inum1 != inum2? " + (inum1 != inum2));
        System.out.println("inum1 > inum2? " + (inum1 > inum2));
        System.out.println("inum1 >= inum2? " + (inum1 >= inum2));
        System.out.println("inum1 < inum2? " + (inum1 < inum2));
        System.out.println("inum1 <= inum2? " + (inum1 <= inum2));

        // 실수
        double dnum1 = 10.0;
        double dnum2 = 20.0;
        System.out.println("\n========== 실수값 비교 ==========");
        System.out.println("dnum1 == dnum2? " + (dnum1 == dnum2));
        System.out.println("dnum1 != dnum2? " + (dnum1 != dnum2));
        System.out.println("dnum1 > dnum2? " + (dnum1 > dnum2));
        System.out.println("dnum1 >= dnum2? " + (dnum1 >= dnum2));
        System.out.println("dnum1 < dnum2? " + (dnum1 < dnum2));
        System.out.println("dnum1 <= dnum2? " + (dnum1 <= dnum2));

        // 문자
        char ch1 = 'a'; // 97
        char ch2 = 'A'; // 65
        System.out.println("\n========== 문자값 비교 ==========");
        System.out.println("ch1 == ch2? " + (ch1 == ch2));
        System.out.println("ch1 != ch2? " + (ch1 != ch2));
        System.out.println("ch1 > ch2? " + (ch1 > ch2));
        System.out.println("ch1 >= ch2? " + (ch1 >= ch2));
        System.out.println("ch1 < ch2? " + (ch1 < ch2));
        System.out.println("ch1 <= ch2? " + (ch1 <= ch2));

        // 논리값
        boolean bool1 = true;
        boolean bool2 = false;
        System.out.println("\n========== 논리값 비교 ==========");
        System.out.println("bool1 == bool2? " + (bool1 == bool2));
        System.out.println("bool1 != bool2? " + (bool1 != bool2));

        // 문자열 비교
        String str1 = "java";
        String str2 = "java";
        System.out.println("\n========== 문자열 비교 ==========");
        System.out.println("str1 == str2? " + (str1 == str2));  // 문자열의 주소 비교
        System.out.println("str1 != str2? " + (str1 != str2));
        System.out.println("str1 == str2? " + (str1.equals(str2))); // 문자열 비교

        int x = 10;
        int y = 11;
        boolean result = x <= y;

        System.out.println("result = " + result);
    }
}
