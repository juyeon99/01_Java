package com.ohgiraffers.section01.method;

public class Application6 {
    public static void main(String[] args) {
        /*
        메소드의 리턴값

        return으로 복귀할 때 그냥 할 수도 있지만 값을 가지고 복귀도 가능
        이때 가지고 가는 값을 리턴값이라고 한다.

        return값을 받기 위해서는 메소드 선언부에 리턴 타입을 명시해줘야 한다.
        void: 아무 반환값을 가지지 않음
        반환값이 없을 땐 return;을 컴파일러가 자동으로 생성하지만
        반환값이 있을 땐 return;을 반드시 작성해야함.

        메소드의 선언부에 명시한 리턴 타입과 반환값 자료형은 반드시 일치해야함.
        */

        Application6 app6 = new Application6();
        String returnedStr = app6.testMethod();
        System.out.println(returnedStr);
        System.out.println(app6.testMethod());
    }

    public String testMethod() {
        return "Hello World";
    }
}
