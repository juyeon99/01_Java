package com.ohgiraffers.section07.kindsofvariable;

public class KindsOfVariable {
    /*
    * 클래스 영역에서 작성하는 변수 == 필드
    * 필드 == 멤버변수(클래스가 가지는 변수) == 전역변수(클래스 전역에서 사용할 수 있는 변수)
    * */

    // non-static field, 인스턴스 변수라고 한다. (인스턴스(객체) 생성 시점에 사용 가능한 변수)
    private int globalNum;

    // static field, 정적 필드(클래스 변수)라고 한다. (정적(클래스) 영역에 생성되는 변수라는 의미)
    private static int staticNum;

    public void testMethod(int num) {
        /*
        * 메소드 영역에서 작성하는 변수 = 지역변수
        * 메소드의 괄호 안에 선언하는 변수를 매개변수라고 한다.
        * 매개변수도 일종의 지역변수로 생각하면 됨.
        * 지역변수는 메소드 호출시 stack 영역에 생성된다.
        * */

        int localNum;

        System.out.println(num); // 매개변수는 호출시 값이 넘어와서 변경되기 때문에 초기화가 필요없다.

        // 지역변수는 선언 외에 다시 사용하기 위해서는 반드시 초기화가 되어야 한다.
        // System.out.println(localNum);

        // 전역변수는 클래스 전역에서 사용 가능
        System.out.println(globalNum);
        System.out.println(staticNum);
    }

    public void testMethod() {
        // System.out.println(localNum); // 지역 변수는 해당 지역(블럭)안에서만 사용 가능하다.
        System.out.println(globalNum); // 전역 변수는 다른 메소드에서도 사용 가능하다.
        System.out.println(staticNum);
    }
}