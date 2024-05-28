package com.ohgiraffers.section03.interfaceimplements;

public class Application {
    // interface에 대한 이해
    public static void main(String[] args) {
        /*
        * interface
        *
        * 자바의 클래스와 유사한 형태지만, 추상메소드와 상수 필드만 가질 수 있는 클래스의 변형체
        * */

        /*
        * interface의 사용목적
        *
        * 1. 추상클래스와 비슷하게 필요한 기능을 공통화해서 강제성을 부여할 목적으로 사용됨 (표준화)
        * 2. 자바의 단일상속의 단점 극복 (다중 상속)
        * */

        // 인스턴스를 직접 생성하지 못하고 constructor가 존재하지 X
//        InterProduct interProduct = new InterProduct(); XXX
        InterProduct interProduct = new Product();

        /*
        * 인터페이스의 추상 메소드 오버라이딩한 메소드로 dynamic binding에 의해 호출
        *
        * dynamic binding:
        *   컴파일 당시에 해당 타입의 메소드와 연결되어 있다가
        *   런타임 당시 실제 객체가 가진 오버라이딩된 메소드로 바인딩이 바뀌어 동작하는 것
        * */
        interProduct.nonStaticMethod();
        interProduct.abstMethod();

        // override 하지 않으면 interface의 default method 호출
        interProduct.defaultMethod();

        // static method는 [인터페이스명].[메소드명]() 으로 호출
        InterProduct.staticMethod();

        // 상수 필드 접근도 [인터페이스명].[필드명] 으로 접근
        System.out.println(InterProduct.MAX_NUM);
        System.out.println(InterProduct.MIN_NUM);
    }
}
