package com.ohgiraffers.section03.grammar;

import java.util.EnumSet;
import java.util.Iterator;

public class Application {
    // Enum 문법
    public static void main(String[] args) {
        UserRole1 admin = UserRole1.ADMIN;
        System.out.println(admin);
        System.out.println(admin.getNameToLowerCase());

        // 최초로 enum 타입을 사용할 때 constructor 호출
        UserRole2 consumer = UserRole2.CONSUMER;

        /*
        * ordinal(): 작성된 순으로 생성되는 고유 번호 반환
        * name(): 작성된 상수 이름을 String으로 반환
        * */
        System.out.println("consumer.ordinal() = " + consumer.ordinal());
        System.out.println("consumer.name() = " + consumer.name());
        System.out.println("consumer.description() = " + consumer.getDescription());

        System.out.println("===============================");

        // EnumSet을 활용해 여러 열거형 타입들을 set으로 취급할 수 있다.
        EnumSet<UserRole2> roles = EnumSet.allOf(UserRole2.class);

        Iterator<UserRole2> iter = roles.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next().name());
        }
    }
}
