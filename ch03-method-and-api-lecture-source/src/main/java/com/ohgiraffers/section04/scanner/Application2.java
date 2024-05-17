package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        /*
        * nextLine(): 공백을 포함한 한 줄 입력을 위한 개행문자(줄바꿈) 전까지 문자열로 반환
        * next():     공백문자나 개행문자 전까지 읽어서 문자열로 반환
        * */

        System.out.println("인사말을 입력해주세요.");
        Scanner sc = new Scanner(System.in);
        String greeting = sc.nextLine();
        System.out.println(greeting);

        System.out.println("인사말을 입력해주세요.");
        String greeting2 = sc.next();   // space전까지만 받음
        System.out.println(greeting2);
    }
}
