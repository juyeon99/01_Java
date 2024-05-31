package com.ohgiraffers.section01.exception;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        ExceptionTest et = new ExceptionTest();

        Scanner sc = new Scanner(System.in);

        System.out.print("물건의 가격: ");
        int price = sc.nextInt();

        System.out.print("소지한 돈: ");
        int money = sc.nextInt();

        try {
            et.checkEnoughMoney(price,money);
            System.out.println("========== 상품 구입 가능 ==========");
        } catch (Exception e){
            System.out.println("========== 상품 구입 불가 ==========");
        }
        System.out.println("프로그램을 종료합니다.");
    }
}
