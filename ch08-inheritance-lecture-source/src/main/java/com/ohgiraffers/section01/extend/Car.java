package com.ohgiraffers.section01.extend;

// parent class
public class Car {
    private boolean runningStatus;  // 자동차가 달리는 상태

    public Car(){
        System.out.println("Car default constructor");
    }

    public void run() {
        runningStatus = true;
        System.out.println("자동차가 달리기 시작합니다.");
    }

    public void soundHorn(){
        // 자동차가 주행중일 때만 경적을 울리게
        if(isRunning()){
            System.out.println("빵");
        } else{
            System.out.println("주행중인 상태가 아닌 경우 경적을 울릴 수 없다..");
        }
    }

    // protected => 같은 패키지 내에서 자유롭게 사용가능 + 자식도 자유롭게 사용가능
    protected boolean isRunning(){
        return runningStatus;
    }

    // 자동차 멈추기
    public void stop(){
        runningStatus = false;
        System.out.println("자동차가 멈춥니다.");
    }
}
