package com.ohgiraffers.section02.abstractclass;

// JAVA에서는 단일 상속만 가능
public class SmartPhone extends Product /*, java.util.Scanner => XXX */{

    public SmartPhone() {}

    @Override
    public void abstMethod() {
        System.out.println("Product class의 abstMethod를 override한 메소드 호출");
    }

    public void printSmartPhone(){
        System.out.println("SmartPhone class의 printSmartPhone 메소드 호출");
    }
}
