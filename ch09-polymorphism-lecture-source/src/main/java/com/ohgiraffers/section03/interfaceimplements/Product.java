package com.ohgiraffers.section03.interfaceimplements;

public class Product implements InterProduct{
    /*
     * 클래스에서 인터페이스를 상속받을 때에는 implements
     * 인터페이스는 다중상속 가능
     * extends로 다른 클래스를 상속받는 경우에도
     * */

    @Override
    public void nonStaticMethod() {
        System.out.println("InterProduct의 nonStaticMethod 오버라이딩한 메소드 호출");
    }

    @Override
    public void abstMethod() {
        System.out.println("InterProduct의 abstMethod 오버라이딩한 메소드 호출");
    }

    // static method는 override 불가
//    @Override
//    public static void staticMethod(){}

    // default method는 interface에서만 작성 가능
//    @Override
//    public default void defaultMethod(){}

    // default 키워드를 빼면 오버라이딩 가능
    @Override
    public void defaultMethod(){
        System.out.println("Product 클래스의 defaultMethod 호출");
    }

}
