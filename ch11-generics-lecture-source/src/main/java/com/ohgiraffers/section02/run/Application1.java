package com.ohgiraffers.section02.run;

import com.ohgiraffers.section02.*;

public class Application1 {
    // extends: 특정 타입만 사용하도록 제네릭 범위를 제한 할 수 있다.
    public static void main(String[] args) {
        /*
        * extends 키워드를 이용하여 특정 타입만 사용하도록 범위 지정
        * -> 지정한 특정 타입과 함께, 특정 타입의 자식타입들도 대입 가능
        * */

        /*
        *              ____ animal ____
        *              |               |
        *           Mammal          Reptile
        *           |                     |
        *        Rabbit                 Snake
        *          |
        *        Bunny
        *          |
        *     DrunkenBunny
        * */

        // Animal 타입은 Rabbit의 후손이 아니기 때문에 generic class instance 생성 불가
//        RabbitFarm<Animal> farm = new RabbitFarm<>();       XXX
//        RabbitFarm<Mammal> farm = new RabbitFarm<Mammal>(); XXX
//        RabbitFarm<Snake> farm = new RabbitFarm<>();        XXX

        RabbitFarm<Rabbit> farm1 = new RabbitFarm<>();
        RabbitFarm<Bunny> farm2 = new RabbitFarm<>(); // Rabbit의 후손들은 가능
        RabbitFarm<DrunkenBunny> farm3 = new RabbitFarm<>();

        farm1.setAnimal(new Rabbit());
        farm1.getAnimal().cry();    // animal의 타입: Rabbit
        farm2.setAnimal(new Bunny());
        farm2.getAnimal().cry();    // animal의 타입: Bunny
        farm3.setAnimal(new DrunkenBunny());
        farm3.getAnimal().cry();    // animal의 타입: DrunkenBunny
    }
}
