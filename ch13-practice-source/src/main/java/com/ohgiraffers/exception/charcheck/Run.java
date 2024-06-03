package com.ohgiraffers.exception.charcheck;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        test1();
    }

    public static void test1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요: ");
        String str = sc.nextLine();
        CharacterProcess cp = new CharacterProcess();
        try{
            int count = cp.countAlpha(str);
            System.out.println("Count: " + count);
        } catch (CharCheckException e) {
            throw new RuntimeException(e);
        }
    }
}
