package com.ohgiraffers.section06.statickeyword;

public class Application {

    public static void main(String[] args) {

        /*
        * static
        *
        * 정적 메모리 영역에 프로그램이 start 될 때 할당하는 키워드이다.
        * 인스턴스를 생성하지 않고도 사용할 클래스의 멤버(필드, 메서드)를 지정 가능하다.
        * 여러 인스턴스가 공유해서 사용할 목적의 공간이다.
        * 하지만 static 키워드의 남발은 유지보수와 추적이 힘든 코드를 작성하는 피해야 할 방식
        * 명확한 목적이 존재하지 않는 이상 static 키워드는 사용을 자제하는 것이 좋다.
        * 의도적으로 static 키워드를 사용하는 대표적인 예시는 singleton 객체를 만들때
        * */

        StaticFieldTest sft1 = new StaticFieldTest(); // 기본값

        // 두필드가 가지고 있는 값 확인
        System.out.println("non-static field : " + sft1.getNonStaticCount()); // 0
        System.out.println("static field : " + sft1.getStaticCount()); // 0

        // 필드값 1씩 증가
        sft1.increaseNonStaticCount();
        sft1.increaseStaticCount();

        System.out.println("non-static field : " + sft1.getNonStaticCount()); // 1
        System.out.println("static field : " + sft1.getStaticCount()); // 1


        StaticFieldTest sft2 = new StaticFieldTest();
        System.out.println("non-static field : " + sft2.getNonStaticCount()); //
        System.out.println("static field : " + sft2.getStaticCount()); //

        /*
        * 인스턴스 변수의 경우 sft1 과 sft2 두 개의 인스턴스가 서로 값을 공유하지 못하고
        * 인스턴스를 생성할 때 마다 기본값인 0 으로 초기화가 되었다.
        * 하지만 static 필드의 경우 클래스변수(static 붙은) 가 프로그램 종료될 때 까지
        * 유지되고 있기 때문에 값을 유지하고 있다.
        * 따라서 여러 개의 인스턴스가 같은 공간을 공유할 목적으로 필드에 static 키워드를 사용한다.
        * */

        // static 메서드 확인
        StaticMethodTest smt = new StaticMethodTest();
        smt.nonStaticMethod();

        /*
        * static Method 호출
        *
        * [클래스명].[메소드명]
        * */
        smt.staticMethod(); // 권장되지 않음
        StaticMethodTest.staticMethod(); // 권장됨
    }
}
