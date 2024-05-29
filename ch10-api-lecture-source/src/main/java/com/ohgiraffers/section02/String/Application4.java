package com.ohgiraffers.section02.String;

public class Application4 {
    public static void main(String[] args) {
        /*
        * Escape 문자
        *
        * 문자열 내에서 사용하는 문자 중 특수문자를 표현하거나 특수기능을 사용할 때 사용
        *
        *   Escape 문자  |     의미
        * ------------------------------
        *   \n          |   줄바꿈
        *   \t          |   탭
        *   \'          |   작은따옴표
        *   \"          |   큰따옴표
        *   \\          |   backslash
        * */

        System.out.println("안녕하세요. \n저는 홍길동입니다.");
        System.out.println("안녕하세요. \t저는 홍길동입니다.");
        System.out.println("안녕하세요. 저는 홍길동입니다.");
        System.out.println('\'');
        System.out.println("\"");
        System.out.println("안녕하세요. 저는 \"홍길동\"입니다.");
        System.out.println("\\");

        /*
        * split할 때 escape 문자를 사용해야하는 특수문자도 존재
        *
        * escape 문자를 사용안하는 특수문자
        * ~ ` ! @ # - _ ; : ' \ " , < > /
        *
        * escape 문자를 사용하는 특수문자 (\\)
        * $ ^ * { } + | { } [ ] . ?
        * \\
        * */
        String str = "java^oracle^jdbc";
        String[] sarr = str.split("\\^");

        for (String s : sarr){
            System.out.println(s);
        }
    }
}
