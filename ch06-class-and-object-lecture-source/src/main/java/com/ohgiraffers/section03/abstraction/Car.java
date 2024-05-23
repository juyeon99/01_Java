package com.ohgiraffers.section03.abstraction;

public class Car {
    /*
     * 2) 자동차 클래스
     *  - 속성: 현재 시속, 시동 상태
     *  - 행위: 시동을 걸어라, 앞으로 가라, 멈춰라, 시동을 꺼라
     * */
    private boolean isOn;   // 기본 false
    private int speed;      // 기본 0

    // 이미 걸려있는 경우 다시 시동을 걸 수 없다.
    public void startUp(){
        if(isOn){
            System.out.println("이미 시동이 걸려있습니다.");
        } else {
            this.isOn = true;
            System.out.println("시동을 걸었습니다. 이제 출발할 준비가 되었습니다.");
        }
    }

    public void go(){
        if(isOn){
            System.out.println("차가 앞으로 움직입니다.");
            this.speed += 10;
            System.out.println("현재 차의 시속은 " + this.speed + "km/h 입니다.");
        } else{
            System.out.println("차의 시동이 걸려있지 않습니다. 시동을 먼저 걸어주세요.");
        }
    }

    public void stop(){
        if(isOn){
            if(this.speed > 0){
                this.speed = 0;
                System.out.println("브레이크를 밟았습니다. 차를 멈춥니다.");
            } else{
                System.out.println("차가 이미 멈춰있습니다.");
            }
        } else{
            System.out.println("차의 시동이 걸려있지 않습니다. 시동을 먼저 걸어주세요.");
        }
    }

    public void turnOff(){
        if(isOn){
            if(this.speed > 0){
                System.out.println("달리는 중에는 시동을 끌 수 없습니다.");
            } else{
                this.isOn = false;
                System.out.println("시동을 끕니다. 다시 운행하시려면 시동을 켜주세요.");
            }
        } else{
            System.out.println("차의 시동이 걸려있지 않습니다. 시동을 먼저 걸어주세요.");
        }
    }
}
