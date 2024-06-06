package com.ohgiraffers.section02.enumtype;

public class Application {
    public static void main(String[] args) {
        // Enum을 이용하여 선언된 인스턴스는 싱글턴으로 관리됨. = 인스턴스가 한개임을 보장
        Subjects s1 = Subjects.JAVA;
        Subjects s2 = Subjects.HTML;

        // toString()을 이용해 문자열로 관리하기 쉽다.
        System.out.println(Subjects.JAVA.toString());

        // values()를 이용해 상수값 배열 반환
        Subjects[] subjects = Subjects.values();

        for (Subjects s : subjects){
            System.out.println(s);
        }

        // 타입 안전 보장
//        Subjects s3 = 0; // XXX
        Subjects s4 = Subjects.JAVA;
    }
}
