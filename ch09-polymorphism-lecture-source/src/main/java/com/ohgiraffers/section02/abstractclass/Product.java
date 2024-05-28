package com.ohgiraffers.section02.abstractclass;

public abstract class Product {
    // 추상클래스는 member var를 가질 수 있다.
    private int nonStaticMemVar;
    private static int staticMemVar;

    // constructor도 만들 수 있다. => BUT, 직접 instance 생성 불가
    public Product(){}

    // 추상 클래스는 일반적인 메소드를 가질 수 있다.
    public void nonStaticMethod(){
        System.out.println("Product 클래스의 nonStaticMethod 호출");
    }

    public static void staticMethod(){
        System.out.println("Product 클래스의 staticMethod 호출");
    }

    public abstract void abstMethod();
}
