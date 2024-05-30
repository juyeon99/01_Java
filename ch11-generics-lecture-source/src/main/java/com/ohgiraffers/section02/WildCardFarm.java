package com.ohgiraffers.section02;

public class WildCardFarm {
    // parameter로 전달받는 토끼농장을 구현할 때 사용한 타입변수를 제한

    // 모든 토끼농장 사용 가능
    public void anyType(RabbitFarm<?> farm){
        farm.getAnimal().cry();
    }

    // Bunny이거나 Bunny를 상속받은 토끼농장만 사용가능
    public void extendsType(RabbitFarm<? extends Bunny> farm){
        farm.getAnimal().cry();
    }

    // Bunny이거나 Bunny의 부모타입인 토끼농장만 사용가능
    public void superType(RabbitFarm<? super Bunny> farm){
        farm.getAnimal().cry();
    }
}
