package com.ohgiraffers.section01.intro;

public class Application1 {
    public static void main(String[] args) {
        /*
        * lambda 식
        *
        * 메소드를 하나의 식(expression)으로 표현한 것
        * 메소드를 람다식으로 표현하면 메소드 이름이 없는 익명함수라고 할 수 있다.
        * 람다식 자체는 알론조 처치가 개발한 계산법을 기초했다.
        * f(x,y) = x * y
        * 위의 함수를 람다식으로 변경하면 다음과 같다.
        * (x,y) -> x * y
        * */

        /*
        * 람다 표현식
        * parameter가 없는 경우
        * () -> {...}
        *
        * parameter가 있는 경우
        * (param, ...) -> {...}
        *
        * 람다식에서 parameter의 타입은 추론이 가능하기 때문에
        * 명시적으로 작성하지 않아도 된다.
        *
        * 또한, parameter가 한 개만 존재하는 경우 ()를 생략할 수 있으며
        * 실행문이 한 줄인 경우 {}는 생략 가능
        * */

        /*
        * 인터페이스에 정의된 추상메소드를 활용하는 방법 3가지
        * 1. 인터페이스를 상속받은 클래스를 정의하여 기능을 완성 후 사용
        * 2. 익명클래스를 활용하여 메소드를 정의 후 사용
        * 3. 람다식 활용
        * */

        // 1. 인터페이스를 구현한 구현체 이용한 방식
        Calculator c1 = new CalculatorImpl();
        System.out.println("10 + 20 = " + c1.addTwoNumbers(10,20));

        // 2. 익명 클래스를 활용한 방식
        Calculator c2 = new Calculator() {
            @Override
            public int addTwoNumbers(int a, int b) {
                return a + b;
            }
        };
        System.out.println("20 + 30 = " + c2.addTwoNumbers(20,30));

        // 3. 람다식 활용한 방식
        Calculator c3 = (x,y) -> x + y; // compiler can deduct that the params are both int since the method in Calculator.java interface is getting int params
        System.out.println("40 + 50 = " + c3.addTwoNumbers(40,50));
    }
}
