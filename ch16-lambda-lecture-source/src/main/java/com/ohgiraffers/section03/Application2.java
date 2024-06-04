package com.ohgiraffers.section03;

import java.util.function.Function;

public class Application2 {
    public static void main(String[] args) {
        Function<String,Account> function = Account::new;   // ownerName만 parameter로 있는 constructor

        Account account1 = function.apply("홍길동");
        Account account2 = function.apply("유관순");

        System.out.println(account1);
        System.out.println(account2);
    }
}
