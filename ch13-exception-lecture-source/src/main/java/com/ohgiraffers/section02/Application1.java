package com.ohgiraffers.section02;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        /*
        * user defined Exception class
        *
        * RunTimeException의 후손 대부분은 예외처리를 강제화하지 않음
        * 이런경우에도 예외를 강제화하고 싶을 때는 사전에 정의된 예외클래스 외에
        * 개발자가 원하는 명칭의 예외클래스를 만들어 작성할 수 있다.
        * */

        ExceptionTest et = new ExceptionTest();
        Scanner sc = new Scanner(System.in);

        System.out.print("물건의 가격: ");
        int price = sc.nextInt();

        System.out.print("소지한 돈: ");
        int money = sc.nextInt();
        try{
            et.checkEnoughMoney(price,money);
            System.out.println("========== 상품 구입 가능 ==========");
        } catch (Exception e){
            // exception 출력 - 로그 남김
            e.printStackTrace();
        }
        System.out.println("프로그램을 종료합니다.");
    }
}
