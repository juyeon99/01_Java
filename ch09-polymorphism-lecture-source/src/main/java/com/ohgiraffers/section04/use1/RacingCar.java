package com.ohgiraffers.section04.use1;

public class RacingCar extends Car{
    @Override
    public void go() {
        System.out.println("레이싱카가 달려갑니다.");
    }

    @Override
    public void stop() {
        System.out.println("레이싱카가 멈춥니다.");
    }

    // 레이싱카는 경적을 울리지 않으므로 Soundable interface를 implement하지 X
}
