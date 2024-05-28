package com.ohgiraffers.section01.polymorphism;

public class Application2 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];
        animals[0] = new Rabbit();
        animals[1] = new Tiger();
        animals[2] = new Rabbit();
        animals[3] = new Tiger();
        animals[4] = new Rabbit();

        // Animal 클래스가 가지는 메소드를 오버라이딩한 메소드 호출 시 dynamic 바인딩 이용 가능
        for (int i = 0; i < animals.length; i++){
            animals[i].cry();
        }

        // 각 클래스 별 고유한 메소드 동작
        // down-casting을 명시적으로 해줘야 함
        // ClassCastException instanceof 연산자를 이용해야 함
        System.out.println("\n======================================");
        for(int i = 0; i < animals.length; i++){
            if(animals[i] instanceof Rabbit){
                ((Rabbit)animals[i]).jump();
            } else if(animals[i] instanceof Tiger){
                ((Tiger)animals[i]).bite();
            } else{
                System.out.println("호랑이나 토끼가 아닙니다.");
            }
        }
    }
}
