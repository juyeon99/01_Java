package com.ohgiraffers.practice.question1;

public class Dog {
    // 이름이 Max이고 5살이며 골든 리트리버 종인 강아지를 표현하는 클래스를 만들고, 객체를 생성하여 값을 출력하세요.

    private String name;
    private int age;
    private String kind;

    public Dog(String name, int age, String kind) {
        this.name = name;
        this.age = age;
        this.kind = kind;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void print(){
        System.out.println("이름이 " + this.name + "이고 " +
                + this.age + "살이며 " + this.kind + " 종입니다.");
    }
}
