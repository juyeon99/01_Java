package com.ohgiraffers.section03.abstraction;

public class CarRacer {
    /*
     * 1) 카레이서 클래스
     *  - 속성: 자동차
     *  - 행위: 시동을 걸어라, 엑셀을 밟아라, 브레이크를 밟아라, 시동을 꺼라
     * */

    private final Car car = new Car();

    public void startUp(){
        car.startUp();
    }

    public void stepAccelerator(){
        car.go();
    }

    public void stepBreak(){
        car.stop();
    }

    public void turnOff(){
        car.turnOff();
    }

}

