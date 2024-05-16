package com.ohgiraffers.section01.method;

public class Application8 {
    public static void main(String[] args) {
        // static method 호출
        // static method <-> non-static method

        /*
        * static 메소드를 호출하는 방법
        * [클래스명].[메소드명]()    or    [메소드명]()
        * */

        System.out.println("10 + 20 = " + Application8.addTwoNumbers(10,20));
        System.out.println("30 + 40 = " + addTwoNumbers(30,40));

    }
    public static int addTwoNumbers(int num1, int num2) {
        return num1 + num2;
    }
}
