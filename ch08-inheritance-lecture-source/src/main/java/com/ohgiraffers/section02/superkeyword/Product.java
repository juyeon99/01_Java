package com.ohgiraffers.section02.superkeyword;

import java.util.Date;

public class Product {
    private String code;            // 상품코드
    private String brand;           // 제조사
    private String name;            // 상품명
    private int price;              // 가격
    private Date manufacturingDate; // 제조일자

    // def constructor
    public Product(){
        System.out.println("Product class def constructor");
    }

    // non-def constructor
    public Product(String code, String brand, String name, int price, Date manufacturingDate) {
        super();

        this.code = code;
        this.brand = brand;
        this.name = name;
        this.price = price;
        this.manufacturingDate = manufacturingDate;
        System.out.println("Product class non-def constructor");
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(Date manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public String getInfo(){
        return "Product [code = " + code +
                        ", brand = " + brand +
                        ", name = " + name +
                        ", price = " + price +
                        ", manufacturingDate = " + manufacturingDate + "]";
    }
}
