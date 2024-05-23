package com.ohgiraffers.practice.question3;

public class Car {
    // Tesla Model S를 만들고 2022년식이며 전기차인 자동차 객체를 생성하여 값을 출력하세요.
    private String brand;
    private String model;
    private int year;
    private String vehicleClassification;

    public Car(String brand, String model, int year, String vehicleClassification) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.vehicleClassification = vehicleClassification;
    }

    public String getBrand(){
        return brand;
    }

    public void setBrand(){
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getVehicleClassification() {
        return vehicleClassification;
    }

    public void setVehicleClassification(String vehicleClassification) {
        this.vehicleClassification = vehicleClassification;
    }

    public void print(){
        System.out.println("브랜드: " + this.brand + ", 모델명: " + this.model + ", 연식: " +
                this.year + ", 종류: " + this.vehicleClassification);
    }
}
