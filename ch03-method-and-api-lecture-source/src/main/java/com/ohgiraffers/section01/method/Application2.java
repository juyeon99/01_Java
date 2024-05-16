package com.ohgiraffers.section01.method;

public class Application2 {
    public static void main(String[] args) {
        System.out.println("main() 시작됨...");

        Application2 app2 = new Application2();
        app2.methodA();
        app2.methodB();
        app2.methodC();

        System.out.println("main() 종료됨...");
    }

    public void methodA(){
        System.out.println("method A 호출됨...");
        System.out.println("method A 종료됨...");
    }
    public void methodB(){
        System.out.println("method B 호출됨...");
        System.out.println("method B 종료됨...");
    }
    public void methodC(){
        System.out.println("method C 호출됨...");
        System.out.println("method C 종료됨...");
    }
}
