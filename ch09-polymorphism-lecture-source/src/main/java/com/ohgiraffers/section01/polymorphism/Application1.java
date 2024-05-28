package com.ohgiraffers.section01.polymorphism;

public class Application1 {
    /*
    * Polymorphism
    *
    * 다형성이란 하나의 인스턴스가 여러가지 타입을 가질 수 있는 것을 의미
    * 그렇기 때문에 하나의 타입으로 여러 타입의 인스턴스를 처리할 수 있기도 하고
    * 하나의 메소드 호출로 객체별로 각기 다른 방법으로 동작하게 할 수도 있다.
    *
    * 다형성은 OOP의 4대 특징(캡슐화, 상속, 추상화, 다형성) 중 하나
    * 활용성이 높음
    * */

    /*
    * 장점
    * 1. 여러 타입의 객체를 하나의 타입으로 관리할 수 있기에 유지보수성과 생산성 증가
    * 2. 상속을 기반으로 한 기술이기 때문에 상속관계에 있는 모든 객체는 동일한 메시지를 수신할 수 있다.
    *    동일한 메세지를 수신하고 처리할 때 객체별로 다르게 할 수 있다는 장점
    * 3. 확장성이 좋은 코드를 작성할 수 있다
    * 4. 결합도를 낮춰서 유지보수성을 증가시킬 수 있다.
    * */

    public static void main(String[] args) {
//        System.out.println("Animal 생성=========");
//        Animal animal = new Animal();
//        animal.eat();
//        animal.run();
//        animal.cry();
//
//        System.out.println("\nRabbit 생성=========");
//        Rabbit rabbit = new Rabbit();
//        rabbit.eat();
//        rabbit.run();
//        rabbit.cry();
//        rabbit.jump();
//
//        System.out.println("\nTiger 생성=========");
//        Tiger tiger = new Tiger();
//        tiger.eat();
//        tiger.run();
//        tiger.cry();
//        tiger.bite();

        // 부모 타입으로 자식의 인스턴스 주소 저장
        Animal animal1 = new Rabbit();
        Animal animal2 = new Tiger();

        // 반대의 경우는 X
//        Rabbit r = new Animal(); XXX

        /*
        * 동적 바인딩
        *
        * 컴파일 당시에는 해당 타입의 메소드와 연결이 되어있다가
        * 런타임 당시 실제 객체가 가진 오버라이딩된 메소드로 바인딩이 바뀌어 동작
        * */
//        animal1.cry();
//        animal2.cry();

        // 현재 레퍼런스 변수의 타입이 Animal이기 때문에
        // Rabbit과 Tiger가 가지고 있는 고유한 기능은 동작 불가
//        animal1.jump(); XXX
//        animal2.bite(); XXX

        System.out.println("클래스타입 형변환=========");
        ((Rabbit)animal1).jump();
        ((Tiger)animal2).bite();

        // 타입 형변환을 잘못하는 경우
        // 컴파일 시 문제가 안되지만 런타임 시 Exception 발생
//        ((Tiger)animal1).bite(); XXX

        // instanceOf 연산자
        // 레퍼런스 변수가 참조하는 실제 인스턴스가 원하는 타입과 맞는지 비교하는 연산자
        System.out.println("instanceOf 확인=========");
        System.out.println("animal1이 Rabbit인지 확인: " + (animal1 instanceof Rabbit));
        System.out.println("animal1이 Tiger인지 확인: " + (animal1 instanceof Tiger));
        // 상속받은 타입도 가지고 있다. (다형성)
        System.out.println("animal1이 Animal인지 확인: " + (animal1 instanceof Animal));
        System.out.println("animal1이 Object인지 확인: " + (animal1 instanceof Object));

        if (animal1 instanceof Rabbit){
            ((Rabbit)animal1).jump();
        }
        if (animal1 instanceof Tiger){
            ((Tiger)animal1).bite();
        }

        // 클래스의 up-casting & down-casting
        /*
        * 클래스의 형변환은 up-casting/down-casting으로 구분할 수 있다.
        * up-casting: 상위 타입으로 형변환 -> 부모 클래스로 형변환
        * down-casting: 하위 타입으로 형변환 -> 자식 클래스로 형변환
        *
        * 작성 여부에 따라 명시적과 묵시적으로 구분됨
        * */

        // 묵시적 형변환 -> up-casting의 경우 적용
        Animal animal3 = (Animal) new Rabbit(); // up-casting 명시적 형변환
        Animal animal4 = new Rabbit();          // up-casting 묵시적 형변환

        // 명시적 형변환 -> down-casting의 경우 적용
        Rabbit rabbit1 = (Rabbit) animal3;   // down-casting 명시적 형변환
//        Rabbit rabbit2 = animal3;          // XXX down-casting은 묵시적 형변환 불가
    }
}
