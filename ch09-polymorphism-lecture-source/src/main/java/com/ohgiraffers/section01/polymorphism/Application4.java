package com.ohgiraffers.section01.polymorphism;

public class Application4 {
    // 다형성을 적용하여 리턴타입에 활용
    public static void main(String[] args) {
        Application4 app4 = new Application4();

        Animal randomAnimal = app4.getRandomAnimal();
        randomAnimal.cry();
    }

    public Animal getRandomAnimal(){
        int rand = (int)(Math.random() * 2);    // 0,1 둘 중 랜덤
        return rand == 0 ? (new Rabbit()) : (new Tiger());
    }
}
