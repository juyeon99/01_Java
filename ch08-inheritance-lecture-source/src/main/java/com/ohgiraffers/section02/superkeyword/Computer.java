package com.ohgiraffers.section02.superkeyword;

import java.util.Date;

public class Computer extends Product{
    private String cpu;             // cpu
    private int hdd;                // 하드디스크
    private int ram;                // 램 용량
    private String operatingSystem; // 운영체제

    public Computer(){
//        super();
        System.out.println("Computer class def constructor");
    }

    // Computer만의 member var를 initialize하는 non-def constructor
    public Computer(String cpu, int hdd, int ram, String operatingSystem) {
        super();

        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operatingSystem = operatingSystem;
    }

    public Computer(String code, String brand, String name, int price, Date manufacturingDate,
                    String cpu, int hdd, int ram, String operatingSystem) {
        super(code, brand, name, price, manufacturingDate);

        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operatingSystem = operatingSystem;
    }

    //    @Override
//    public String getInfo() {
//        // parent class member var까지 다 출력하려면
//        return "Computer [code = " + super.getCode() +
//                ", brand = " + super.getBrand() +
//                ", name = " + super.getName() +
//                ", price = " + super.getPrice() +
//                ", manufacturingDate = " + super.getManufacturingDate() +
//                ", cpu = " + this.cpu +
//                ", hdd = " + this.hdd +
//                ", ram = " + this.ram +
//                ", OS = " + this.operatingSystem + "]";
//    }

    /*
    * super.getInfo(): 정상적으로 부모 메소드 호출
    * this.getInfo():  recursive call이 일어나면 stack overflow 발생
    * getInfo():       this. 가 자동으로 추가되어 recursive call 일어남
    *
    * => 부모 클래스에 있는 메소드를 사용하고 싶다면 super.을 명시해야함.
    * */
    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nComputer [" +
                "cpu = " + this.cpu +
                ", hdd = " + this.hdd +
                ", ram = " + this.ram +
                ", OS = " + this.operatingSystem + "]";
    }
}
