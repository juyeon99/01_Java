package com.ohgiraffers.section01.init;

public class Car {
    private String modelName;   // 모델 이름
    private int maxSpeed;       // 최고 속력

    public Car(String modelName, int maxSpeed) {
        this.modelName = modelName;
        this.maxSpeed = maxSpeed;
    }

    public void driveMaxSpeed() {
        System.out.println(modelName + "이(가) 최고시속 " + maxSpeed +
                "km/h로 달려갑니다.");
    }
}
