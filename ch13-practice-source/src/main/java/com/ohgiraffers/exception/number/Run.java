package com.ohgiraffers.exception.number;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        test();
    }

    public static void test(){
        Scanner sc = new Scanner(System.in);

        // 1. NumberProcess에서 handle exception
        System.out.print("(1) 1에서 100사이의 정수를 하나 입력하세요: ");
        int n1 = sc.nextInt();
        System.out.print("(2) 1에서 100사이의 정수를 하나 입력하세요: ");
        int n2 = sc.nextInt();

        NumberProcess np = new NumberProcess();
        boolean bool = false;

        try {
            bool = np.checkDouble(n1,n2);
            if (bool){
                System.out.println(n1 + "은(는) " + n2 + "의 배수입니다.");
            } else{
                System.out.println(n1 + "은(는) " + n2 + "의 배수가 아닙니다.");
            }
        } catch (NumberRangeException e) {
            throw new RuntimeException(e);
        }

        // 2. test()에서 에러 안나게끔 handle
//        while(true){
//            int n1 = 0;
//            System.out.print("(1) 1에서 100사이의 정수를 하나 입력하세요: ");
//            n1 = sc.nextInt();
//            if (n1 < 1 || n1 > 100){
//                System.out.println("1부터 100사이의 값이 아닙니다.");
//                continue;
//            }
//
//            int n2;
//            while (true){
//                System.out.print("(2) 1에서 100사이의 정수를 하나 입력하세요: ");
//                n2 = sc.nextInt();
//                if (n2 < 1 || n2 > 100){
//                    System.out.println("1부터 100사이의 값이 아닙니다.");
//                } else {
//                    break;
//                }
//            }
//
//            NumberProcess np = new NumberProcess();
//            boolean bool = np.checkDouble(n1,n2);
//            break;
//        }
    }
}
