package com.ohgiraffers.practice.question5;

public class Laptop {
    // Dell 브랜드의 XPS 13 모델이고, 16GB RAM과 512GB SSD를
    // 가진 노트북을 표현하는 클래스를 만들고, 객체를 생성하여 값을 출력하세요.
    private String brand;
    private String model;
    private int RAM;
    private int SSD;

    public Laptop(String brand, String model, int RAM, int SSD) {
        this.brand = brand;
        this.model = model;
        this.RAM = RAM;
        this.SSD = SSD;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getSSD() {
        return SSD;
    }

    public void setSSD(int SSD) {
        this.SSD = SSD;
    }

    public void print(){
        System.out.println("브랜드: " + this.brand +
                ", 모델: " + this.model + ", RAM: " + this.RAM + "GB, SSD: " + this.SSD + "GB");
    }
}
