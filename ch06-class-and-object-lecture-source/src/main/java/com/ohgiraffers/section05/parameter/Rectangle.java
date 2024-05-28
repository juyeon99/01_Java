package com.ohgiraffers.section05.parameter;

public class Rectangle {
    private double width;
    private double height;

    // 생성자
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Setter
    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Getter
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    // 사각형의 넓이를 구해서 출력하는 메서드
    public void calcArea() {
        double area = width * width;
        System.out.println("이 사각형의 넓이는 " + area + "입니다.");
    }

    // 사격형의 둘레를 구해서 출력하는 메서드
    public void calcRound() {
        double round = (width + height) * 2;
        System.out.println("이 사각형의 둘레는 " + round + "입니다.");
    }
}
