package com.ohgiraffers.section02;

// generics는 interface 상속시에도 implements 대신 extends 사용
// ex) public class Rabbit<T extends Animal>    ==> O
// ex) public class Rabbit<T implements Animal> ==> X
public class RabbitFarm<T extends Rabbit /* => 후손인 Bunny, DrunkenBunny 모두 사용 가능 */> {

    // 현재는 타입이 어떤걸로 선택될지 모르지만
    // Rabbit이나 Rabbit을 상속받는 Bunny, DrunkenBunny의 후손만 가능
    private T animal;

    public RabbitFarm() {

    }

    public RabbitFarm(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }
}
