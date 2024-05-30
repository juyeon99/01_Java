package com.ohgiraffers.section01.generic;

public class Application {
    public static void main(String[] args) {
        /*
        * Generic
        * 데이터를 일반화한다는 의미
        *
        * Generic Programming
        * 데이터의 형식에 의존하지 않고 하나의 값이 다른 데이터 타입들에 가질 수 있는 기술에
        * 중점을 두어 재사용성을 높일 수 있는 프로그래밍 방식
        *
        * 제네릭은 클래스나 메소드에서 사용할 내부 데이터 타입을 컴파일시에 저장하는 방법을 의미
        * 컴파일 시 미리 타입 검사를 시행하게 되면 클래스나 메소드 내부에서 사용되는 객체의
        * 타입 안정성을 높일 수 있으며 반환값에 대한 타입 변환 및 타입 검사에 들어가는 코드 생략이 가능해진다.
        * */

//        GenericTest<int> gt = new GenericTest<int>(); XXX => 기본 자료형은 쓸 수 X
        GenericTest<Integer> gt = new GenericTest<Integer>();
        gt.setValue(10);
        System.out.println("value: " + gt.getValue());

        // Integer 타입 확인
        System.out.println(gt.getValue() instanceof Integer);   // true

        GenericTest<String> gt1 = new GenericTest<String>();
        gt1.setValue("홍길동");
        System.out.println(gt1.getValue());
        System.out.println(gt1.getValue() instanceof String);   // true

        GenericTest<Double> gt2 = new GenericTest</* Double => 타입 생략가능 */>();
        gt2.setValue(0.5);
        System.out.println(gt2.getValue());
        System.out.println(gt2.getValue() instanceof Double);   // true
    }
}
