package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
//        java.util.Scanner sc = new java.util.Scanner(java.lang.System.in);

        // java.lang은 패키지 이름 생략 가능
//        java.util.Scanner scanner = new java.util.Scanner(System.in);

        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter an integer: ");
//        int num = sc.nextInt();
//        System.out.println("You entered: " + num);

        // 자료형별 값 입력받기
        /*
        * 문자열 입력 받기
        *
        * nextLine(): 입력받은 값을 문자열로 반환
        * */
        System.out.print("이름을 입력하세요: ");
        String name = sc.nextLine();
        System.out.println("입력하신 이름은 " + name + "입니다.");

        /*
        * 정수형 값 입력받기
        *
        * nextInt(): 입력받은 값을 int형으로 반환
        * */
        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt();
//        int age = sc.nextInt(2); // parameter: radix (ex. binary => 2)
        System.out.println("나이는 " + age + "세 입니다.");

        // nextByte(), nextShort(), ...

        /*
        * 정수형(long)
        *
        * nextLong(): 입력받은 값을 long형으로 반환
        * */
        System.out.print("월급을 입력하세요: ");
        long salary = sc.nextLong();
        System.out.println("월급은 " + salary + "원 입니다.");

        /*
        * 실수형(float)
        *
        * nextFloat(): 입력받은 값을 float형으로 반환
        * */
        System.out.print("키를 입력하세요: ");
        float height = sc.nextFloat();
        System.out.println("키는 " + height + "cm 입니다.");

        /*
         * 실수형(double)
         *
         * nextDouble(): 입력받은 값을 double형으로 반환
         * */
        System.out.print("원주율(PI)을 아는만큼 입력하세요: ");
        double pi = sc.nextDouble();
        System.out.println("입력하신 원주율은 " + pi + "입니다.");

        /*
        * 논리형(boolean)
        *
        * nextBoolean(): 입력받은 값을 boolean형으로 반환
        * */
        System.out.print("나는 복습을 잘하고 있다. (true/false)");
        boolean isTrue = sc.nextBoolean();
        System.out.println("입력하신 논리값은 " + isTrue + "입니다.");


        // 문자추출
        // https://www.reddit.com/r/learnjava/comments/iefj2q/scannextint_vs_integervalueofscannextline/?rdt=39061
        // .nextInt() leaves a new line character after you read a number.
        // If you use nextLine() after nextInt() the new line character will be read ('\n')
        sc.nextLine();  // handle new line character in the buffer
        System.out.print("아무 문자나 입력하세요: ");
        String str = sc.nextLine();
        char ch = str.charAt(0);
        System.out.println("입력하신 문자는 " + ch + "입니다.");
    }
}
