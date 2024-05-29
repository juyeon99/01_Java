package com.ohgiraffers.section06.singleton;

public class EagerSingleton {

    // 클래스가 initialize 되는 시점에서 인스턴스를 생성한다.
    private static EagerSingleton eager = new EagerSingleton();

    // Singleton pattern은 constructor 호출을 통해 외부에서 인스턴스 생성을 제한한다.
    private EagerSingleton(){}

    // public 메소드로 인스턴스를 반환해준다.
    public static EagerSingleton getInstance() {
        return eager;
    }
}
