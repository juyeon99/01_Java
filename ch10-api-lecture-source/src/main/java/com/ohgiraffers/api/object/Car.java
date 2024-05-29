package com.ohgiraffers.api.object;

import java.util.Objects;

public class Car {
    // App의 실행코드가 적절히 실행될수 있도록 메소드를 오버라이드
    // 차이름과 차색깔이 같다면 같은 객체로 처리

    private String carName;
    private String carColor;
    private int engineCC;

    public Car(String carName, String carColor, int engineCC) {
        this.carName = carName;
        this.carColor = carColor;
        this.engineCC = engineCC;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public int getEngineCC() {
        return engineCC;
    }

    public void setEngineCC(int engineCC) {
        this.engineCC = engineCC;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }

        // parameter가 null이거나 obj와 class 타입이 다르면 false
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }

        Car car = (Car) obj;
        return this.getCarName().equals(((Car) obj).getCarName()) &&
                this.getCarColor().equals(((Car) obj).getCarColor());
    }

    @Override
    public int hashCode() {
        int result = 1;
        final int PRIME = 31;
        result = PRIME * result + this.carName.hashCode();
        result = PRIME * result + this.carColor.hashCode();
        return result;
    }
}
