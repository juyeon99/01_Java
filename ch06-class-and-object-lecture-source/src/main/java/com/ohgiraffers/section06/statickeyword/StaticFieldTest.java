package com.ohgiraffers.section06.statickeyword;

public class StaticFieldTest {

    private int nonStaticCount;
    private static int staticCount;

    // 기본생성자
    public StaticFieldTest() {
    }

    public int getNonStaticCount() {
        return nonStaticCount;
    }

    public int getStaticCount() {

        /*
        * static 필드에 접근하기 위해서는 클래스명.필드명 으로 접근한다.
        * this. 로 접근이 가능은 하지만, this를 사용하지 않는 것이 좋다.
        * */

        return StaticFieldTest.staticCount;
    }

    // 두개의 필드 값을 1씩 증가시키기 위한 메소드
    public void increaseNonStaticCount() {
        this.nonStaticCount++;
    }
    public void increaseStaticCount() {
        StaticFieldTest.staticCount++;
    }
}
