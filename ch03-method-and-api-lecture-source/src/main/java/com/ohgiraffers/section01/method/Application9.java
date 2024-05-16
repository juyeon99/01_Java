package com.ohgiraffers.section01.method;

public class Application9 {
    public static void main(String[] args) {
        /* 다른 클래스에서 작성한 메소드 호출 */
        int num1 = 100;
        int num2 = 50;

        /*
        * 사용방법
        * [클래스명] [사용할 이름] = new [클래스명]();
        *
        * 사용
        * [사용할 이름].[메소드명]();
        * */

        Calculator calc = new Calculator(); // instance (static이 아닌경우 만들어서 사용)
        int min = calc.minNumber(num1,num2);
        System.out.println("두 수 중 최소 값은: " + min);

        /*
         * static 메소드를 호출하는 방법
         * [클래스명].[메소드명]()    or    [메소드명]()
         * */
        // calling static method
        int max = Calculator.staticMaxNumber(num1,num2);
        System.out.println("두 수 중 최대 값은: " + max);
//        int max = calc.staticMaxNumber(num1,num2);    // not recommended
    }
}
