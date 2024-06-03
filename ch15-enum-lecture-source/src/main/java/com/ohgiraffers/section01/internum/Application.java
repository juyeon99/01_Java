package com.ohgiraffers.section01.internum;

public class Application {
    public static void main(String[] args) {
        /*
        * enum (열거타입)
        *
        * 제한된 값 목록이 필요한 경우 사용
        *
        * enum: 관련이 있는 상수의 집합 클래스
        * 각각의 열거 상수는 열거 객체로 생성
        * 기존의 상수를 정의하는 방법을 효과적으로 대체
        *
        * 기존 정수 열거 패턴의 단점
        * 1. 정수형 상수는 의미가 있는 문자열로 출력하기 어렵다.
        * 2. 정수 열거 그룹에 속한 상수들을 순회할 수 없다. (개수 확인도 불가)
        * 3. 타입의 안전을 보장할 수 없다.
        * */

        // 1. 정수값 만을 저장하고 있는 필드일 뿐.
        int subject1 = Subjects.JAVA;   // 0
        int subject2 = Subjects.HTML;   // 0

        if (subject1 == subject2){
            System.out.println("두 과목은 같은 과목입니다.");  // 이름이 다른데도 값이 같으므로 같은 과목으로 인식됨.
        }

        // 2. 문자열로 출력하기가 까다롭다.
        int num = 0;
        printSubject(num);  // 변수명을 알기가 까다로움 (변수명 하나 알기 위해 switch case 사용)

        // 3. 타입 안전을 보장할 수 없다.
        printSubject(5);    // 5는 존재하지 X
    }

    public static void printSubject(int num){
        String subjectText = "";
        switch (num){
            case Subjects.JAVA:   subjectText = "JAVA";   break;
            case Subjects.JDBC:   subjectText = "JDBC";   break;
            case Subjects.ORACLE: subjectText = "ORACLE"; break;
        }
        System.out.println("subjectText: " + subjectText);
    }
}
