package com.ohgiraffers.section02.run;

import com.ohgiraffers.section02.*;

public class Application2 {
    public static void main(String[] args) {
        /*
        * WildCard
        *
        * Generic class 타입의 객체를 메소드의 parameter로 받을 때,
        * 그 객체의 타입 변수를 제한 할 수 있다.
        *
        * <?>: 제한 없음
        * <? extends [type]>: 와일드 카드의 상한 제한
        *                     Type과 Type의 후손을 이용해 생성한 인스턴스만 인자로 사용가능
        * <? super [type]>: 와일드 카드의 하한 제한
        *                   Type과 Type의 부모를 이용해 생성한 인스턴스만 인자로 사용가능
         * */

        WildCardFarm wildCardFarm = new WildCardFarm();

        // 1. <?>: parameter의 타입 제한이 없는 경우
        // (토끼 농장 생성 자체가 불가능하면 parameter로 사용 불가)
//        wildCardFarm.anyType(new RabbitFarm<>(new Mammal()));  XXX
//        wildCardFarm.anyType(new RabbitFarm<>(new Reptile())); XXX

        System.out.println("========= <?> ==========");
        // RabbitFarm을 생성만 가능하면 <?>에서는 모두 parameter로 사용 가능
        wildCardFarm.anyType(new RabbitFarm<Rabbit>(new Rabbit()));
        wildCardFarm.anyType(new RabbitFarm<Bunny>(new Bunny()));
        wildCardFarm.anyType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));

        System.out.println("========= <? extends Bunny> ==========");
        // 2. <? extends Bunny>: Bunny이거나 Bunny의 후손 토끼 농장만 parameter로 사용 가능
        // 상위 타입 토끼농장은 사용 불가
//        wildCardFarm.extendsType(new RabbitFarm<Rabbit>(new Rabbit())); XXX
        wildCardFarm.extendsType(new RabbitFarm<Bunny>(new Bunny()));
        wildCardFarm.extendsType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));

        System.out.println("========= <? super Bunny> ==========");
        // 3. <? super Bunny>: Bunny이거나 Bunny의 부모 토끼 농장만 parameter로 사용 가능
        // 하위 타입 토끼농장은 사용 불가
        wildCardFarm.superType(new RabbitFarm<Rabbit>(new Rabbit()));
        wildCardFarm.superType(new RabbitFarm<Bunny>(new Bunny()));
//        wildCardFarm.superType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));
    }
}
